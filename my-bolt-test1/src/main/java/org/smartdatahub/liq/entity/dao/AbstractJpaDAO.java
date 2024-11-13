package org.smartdatahub.liq.entity.dao;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Session;
import org.hibernate.jpa.QueryHints;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * Generic Jpa DAO Implementation
 * 
 * @author J. Egyptien (int5348)
 * @param <T> template for the business object class
 * @param <I> template for the primary key class of this business object
 */
public abstract class AbstractJpaDAO<T extends Identifiable<I>, I extends Serializable> {

	private final Class<T> objectClass;
	private final Class<I> keyClass;

	@PersistenceContext
//	@PersistenceContext(unitName = org.smartdatahub.liq.entity.utils.PersistenceJPAConfig.SOURCE_EM)
	private EntityManager em;

	/**
	 * default constructor
	 * 
	 * @param objectClass the business object class this DAO has been parameterized
	 *                    with
	 * @param keyClass    the primary key class this DAO has been parameterized with
	 */
	protected AbstractJpaDAO(final Class<T> theObjectClass, final Class<I> theKeyClass) {
		this.objectClass = theObjectClass;
		this.keyClass = theKeyClass;
	}

	/** @return the business object class of this DAO */
	public final Class<T> getObjectClass() {
		return objectClass;
	}

	/** @return the primary key class of this DAO */
	protected final Class<I> getKeyClass() {
		return keyClass;
	}

	/**
	 * @return the em
	 */
	protected final EntityManager getEm() {
		return em;
	}

	public T save(final T item) {
		final T merged = em.merge(item);
		em.flush();
		return merged;
	}

	/**
	 * retrieve a single business object by its primary key
	 * 
	 * @param id the primary key of the object to retrieve
	 * @return the corresponding business object, or null if no matching object
	 *         could be found
	 */
	public T findById(final I id) {
		final T t = em.find(getObjectClass(), id);
		return t;
	}

	/**
	 * retrieve a List of business object by their primary key
	 * <p>
	 * the return List is ordered and positional in relation to the incoming ids.
	 * The List is ordered and positional relative to the incoming ids. In other
	 * words, a request to {@code multiLoad([2,1,3])} will return
	 * {@code [Entity#2, Entity#1, Entity#3]}.
	 * 
	 * </p>
	 * An important distinction is made here in regards to the handling of unknown
	 * entities depending on this.
	 * <p>
	 * If {@code withNull == true} --&gt; a null is inserted into the List at the
	 * proper position(s). Otherwise the nulls are not put into the return List.
	 * </p>
	 * 
	 * 
	 * @param ids List of primary key of the object to retrieve
	 * 
	 * @return the corresponding List of business object. If one entity is not found
	 *         the list contains a "null" value at the position of the "not found
	 *         entity" See {@link Session#enableOrderedReturn} id could be found
	 * 
	 */
	public List<T> findByIds(List<I> ids, boolean withNull) {
		return em.unwrap(Session.class).byMultipleIds(getObjectClass()).enableSessionCheck(true)
				.enableOrderedReturn(withNull).multiLoad(ids);
	}

	/**
	 * retrieve a List of business object by their primary key
	 * <p>
	 * the return List is ordered and positional in relation to the incoming ids.
	 * The List is ordered and positional relative to the incoming ids. In other
	 * words, a request to {@code multiLoad([2,1,3])} will return
	 * {@code [Entity#2, Entity#1, Entity#3]}.
	 * 
	 * </p>
	 * An Entity which is not found in the database it will be ignored in the
	 * returned list.
	 * 
	 * @param ids List of primary key of the object to retrieve
	 * 
	 * @return the corresponding List of business object. If one entity is not found
	 *         it will be ignored in the returned list.
	 * 
	 */
	public List<T> findByIds(List<I> ids) {
		return findByIds(ids, false);
	}

	// /**
	// * retrieve a list of business object by primary key list
	// *
	// */
	// public List<T> findById(final List<I> ids) {
	// String hql = "from " + getObjectClass().getSimpleName() + " where "
	// + HibernateUtils.getIdFieldName(getObjectClass()) + " in (:ids)";
	// final TypedQuery<T> query = em.createQuery(hql,
	// getObjectClass()).setParameter("ids", ids);
	// final List<T> result = query.getResultList();
	// return result;
	// }

	/**
	 * retrieve all business objects of the same type Will retrieve all business
	 * objects of the same class, but be aware, that can be many.
	 * 
	 * @return the list of all corresponding business objects, never null, may be
	 *         empty though
	 */
	public List<T> findAll() {
		final TypedQuery<T> query = em.createQuery("from " + getObjectClass().getSimpleName(), getObjectClass());
		query.setHint(QueryHints.HINT_FETCH_SIZE, 1000);
		final List<T> result = query.getResultList();
		return result;
	}

	public List<T> list(int offset, int maxResults) {
		final TypedQuery<T> query = em.createQuery("from " + getObjectClass().getSimpleName(), getObjectClass());
		query.setHint(QueryHints.HINT_FETCH_SIZE, 1000);
		query.setFirstResult(offset);
		query.setMaxResults(maxResults);
		final List<T> result = query.getResultList();
		return result;
	}

	public TypedQuery<T> createQuery(String queryString) {
		return em.createQuery(queryString, objectClass);
	}

	protected List<T> getByFieldsWithValue(String fieldName1, int field1Length, List<String> values1, boolean needRightPad1,
			String fieldName2, int field2Length, List<String> values2, boolean needRightPad2, int offset,
			int maxResults) {
		StringBuilder sb = new StringBuilder(250);
		sb.append("from " + getObjectClass().getSimpleName() + " e ");
		sb.append("where e.").append(fieldName1).append(" in (:valueList1)");

		List<String> list1 = values1;
		if (needRightPad1) {
			list1 = rightPad(field1Length, values1);
		}
		List<String> list2 = null;
		if (fieldName2 != null) {
			sb.append(" and e.").append(fieldName2).append(" in (:valueList2)");
			list2 = values2;
			if (needRightPad2) {
				list2 = rightPad(field2Length, values2);
			}
		}

		TypedQuery<T> query = createQuery(sb.toString());
		query.setParameter("valueList1", list1);
		if (fieldName2 != null) {
			query.setParameter("valueList2", list2);
		}
		query.setMaxResults(maxResults);
		query.setFirstResult(offset);
		return query.getResultList();

	}

	private List<String> rightPad(int length, List<String> valueList) {
		return valueList.stream().map(s -> StringUtils.rightPad(s, length)).collect(Collectors.toList());
	}

}