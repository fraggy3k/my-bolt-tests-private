package org.smartdatahub.liq.entity.dao;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.TypedQuery;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smartdatahub.liq.entity.fields.enums.VlsCustomerDbCols;
import org.smartdatahub.liq.entity.original.VlsCustomer;
import org.springframework.stereotype.Component;

/** @author Sonja Piel (smartdatahub.org) */
@Component
public class VlsCustomerFieldDAO extends AbstractJpaDAO<VlsCustomer, String> {

	private static Logger logger = LoggerFactory.getLogger(VlsCustomerFieldDAO.class);

	enum compareMode {
		EQUALS, IN_LIST, LIKE
	};

	public VlsCustomerFieldDAO() {
		super(VlsCustomer.class, String.class);
	}

	public List<VlsCustomer> getCustomersByFieldValues(String fieldNameDb, List<String> valueList, String fieldNameDb2,
			List<String> valueList2, int offset, int maxResults)  {

		String querySelect = "select e from VlsCustomer e  ";
		String queryWhere1InList = " where e.fieldNameJpa in (:valueList1) ";
		String queryWhere2InList = " and e.fieldNameJpa in (:valueList2) ";
		
		VlsCustomerDbCols col = VlsCustomerDbCols.valueOf(fieldNameDb);
		if (col == null) {
			throw new RuntimeException(
					"DB column name is not matching an existing DB column name for " + fieldNameDb + "'.");
		}
		String queryString = querySelect + queryWhere1InList.replace("fieldNameJpa", col.getJpaField()); 
		List<String> list = prepareListOfStrings(col, valueList);
		List<String> list2 = null;
		
		if (fieldNameDb2 != null) {
			VlsCustomerDbCols col2 = VlsCustomerDbCols.valueOf(fieldNameDb2);
			if (col2 == null) {
				throw new RuntimeException(
						"DB column name is not matching an existing DB column name for " + fieldNameDb2 + "'.");
			}
			queryString = queryString + queryWhere2InList.replace("fieldNameJpa", col2.getJpaField()); 
			list2 = prepareListOfStrings(col, valueList2);
		}

		logger.info("query string: " + queryString);
		
		TypedQuery<VlsCustomer> query = createQuery(queryString);
		query.setParameter("valueList1", list);
		if (fieldNameDb2 != null && list2 != null) {
			query.setParameter("valueList2", list2);
		}
		query.setMaxResults(maxResults);
		query.setFirstResult(offset);
		return query.getResultList();
	}

	private List<String> prepareListOfStrings(VlsCustomerDbCols col, List<String> valueList) {
		List<String> list;
		if (col.getDbDataType().equals("CHAR")) {
			list = valueList.stream().map(s -> StringUtils.rightPad(s, col.getDbLength())).collect(Collectors.toList());
		} else if (col.getDbDataType().equals("VARCHAR2")) {
			list = valueList.stream().map(s -> s).collect(Collectors.toList());
		} else {
			throw new RuntimeException("DB column is not supported due to data type for " + col.toString() + "' , "
					+ col.getDbDataType() + ".");
		}
		return list;
	}

	private static String QUERY_BY_XID_CUST_ID = "select e from VlsCustomer e where e.xidCustId in (:xidCustIdList)";

	public List<VlsCustomer> getCustomersByXidCustId(List<String> xidCustIdList, int offset, int maxResults) {
		TypedQuery<VlsCustomer> query = createQuery(QUERY_BY_XID_CUST_ID);
		List<String> list = xidCustIdList.stream().map(s -> StringUtils.rightPad(s, 15)).collect(Collectors.toList());
		query.setParameter("xidCustIdList", list);
		query.setMaxResults(maxResults);
		query.setFirstResult(offset);
		return query.getResultList();
	}

	public List<VlsCustomer> getCustomersByXidCustId(String xidCustId) {
		return getCustomersByXidCustId(Collections.singletonList(xidCustId), 0, Integer.MAX_VALUE);
	}

	public List<VlsCustomer> getCustomersByXidCustId(String xidCustId, int offset, int maxResults) {
		return getCustomersByXidCustId(Collections.singletonList(xidCustId), offset, maxResults);
	}

	public List<VlsCustomer> getCustomersByXidCustId(List<String> xidCustIdList) {
		return getCustomersByXidCustId(xidCustIdList, 0, Integer.MAX_VALUE);
	}

	private static String QUERY_BY_NME_FULL_NAME = "select e from VlsCustomer e where e.nmeFullName in (:valueList)";

	public List<VlsCustomer> getCustomersByNmeFullName(List<String> valueList, int offset, int maxResults) {
		TypedQuery<VlsCustomer> query = createQuery(QUERY_BY_NME_FULL_NAME);
		List<String> list = valueList.stream().map(s -> StringUtils.rightPad(s, 15)).collect(Collectors.toList());
		query.setParameter("valueList", list);
		query.setMaxResults(maxResults);
		query.setFirstResult(offset);
		return query.getResultList();
	}

	public List<VlsCustomer> getCustomersByNmeFullName(String value) {
		return getCustomersByNmeFullName(Collections.singletonList(value), 0, Integer.MAX_VALUE);
	}

	public List<VlsCustomer> getCustomersByNmeFullName(String value, int offset, int maxResults) {
		return getCustomersByNmeFullName(Collections.singletonList(value), offset, maxResults);
	}

	public List<VlsCustomer> getCustomersByNmeFullName(List<String> valueList) {
		return getCustomersByNmeFullName(valueList, 0, Integer.MAX_VALUE);
	}

	private static String QUERY_BY_NME_SHORT_NAME = "select e from VlsCustomer e where e.nmeShortName in (:valueList)";

	public List<VlsCustomer> getCustomersByNmeShortName(List<String> valueList, int offset, int maxResults) {
		TypedQuery<VlsCustomer> query = createQuery(QUERY_BY_NME_FULL_NAME);
		List<String> list = valueList.stream().map(s -> StringUtils.rightPad(s, 15)).collect(Collectors.toList());
		query.setParameter("valueList", list);
		query.setMaxResults(maxResults);
		query.setFirstResult(offset);
		return query.getResultList();
	}

	public List<VlsCustomer> getCustomersByNmeShortName(String value) {
		return getCustomersByNmeShortName(Collections.singletonList(value), 0, Integer.MAX_VALUE);
	}

	public List<VlsCustomer> getCustomersByNmeShortName(String value, int offset, int maxResults) {
		return getCustomersByNmeShortName(Collections.singletonList(value), offset, maxResults);
	}

	public List<VlsCustomer> getCustomersByNmeShortName(List<String> valueList) {
		return getCustomersByNmeShortName(valueList, 0, Integer.MAX_VALUE);
	}

}
