package org.smartdatahub.liq.context;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smartdatahub.liq.context.loader.AbstractLoaderUtils;
import org.smartdatahub.liq.entity.utils.DomainObject;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public abstract class AbstractContext { 

	private static Logger logger = LoggerFactory.getLogger(AbstractContext.class);

	private boolean initialized = false;
	private Map<Class<?>, Loader<?,?,?>> loaders = new HashMap<>();
	private Map<String, Relation> relations = new HashMap<>();
	private Map<Class<?>, Filter> classFilters = new HashMap<>();
	private Map<String, Filter> relationFilters = new HashMap<>();
//	private Map<Relation, Filter> relationFilters = new HashMap<>();
	private String mainRootEntity;
	private String mainContextName;
	private Map<String, String> contextMetaData = new HashMap<>();
	
	private static final Filter<DomainObject> ACCEPT_ALL_FILTER = new Filter<DomainObject>() {
		@Override
		public boolean accept(DomainObject t) {
			return true;
		}
	};
	
	public AbstractContext () {
		initRelations();		
	}
	
	private void initRelations () {
			addRelation(RelationFactory.getRelationLiqBranchToLiqCodeBankFromFieldBank());
			addRelation(RelationFactory.getRelationLiqBranchToLiqCustomerFromFieldCustomer());
			addRelation(RelationFactory.getRelationLiqBranchToLiqTimeRegionFromFieldTimeRegion());
			addRelation(RelationFactory.getRelationLiqBranchToLiqDealFromFieldDeals());
			addRelation(RelationFactory.getRelationLiqBranchToLiqFacilityFromFieldFacilities());
			addRelation(RelationFactory.getRelationLiqCustomerToLiqCodeBankFromFieldBank());
			addRelation(RelationFactory.getRelationLiqCustomerToLiqCustomerFromFieldCustomerImmParentParent());
			addRelation(RelationFactory.getRelationLiqCustomerToLiqCustomerFromFieldCustomerUltParentParent());
			addRelation(RelationFactory.getRelationLiqCustomerToLiqBranchFromFieldBranchs());
			addRelation(RelationFactory.getRelationLiqCustomerToLiqDealAdminFromFieldDealAdmins());
			addRelation(RelationFactory.getRelationLiqCustomerToLiqDealBorrowerFromFieldDealBorrowers());
			addRelation(RelationFactory.getRelationLiqCustomerToLiqCustomerFromFieldImmParentCustomers());
			addRelation(RelationFactory.getRelationLiqCustomerToLiqOutstandingFromFieldOutstandings());
			addRelation(RelationFactory.getRelationLiqCustomerToLiqCustomerFromFieldUltParentCustomers());
			addRelation(RelationFactory.getRelationLiqDealToLiqCodeBankFromFieldBank());
			addRelation(RelationFactory.getRelationLiqDealToLiqBranchFromFieldBranch());
			addRelation(RelationFactory.getRelationLiqDealToLiqDealAdminFromFieldDealAdmin());
			addRelation(RelationFactory.getRelationLiqDealToLiqDealBorrowerFromFieldDealBorrowers());
			addRelation(RelationFactory.getRelationLiqDealToLiqFacCommitTrnFromFieldFacCommitTrns());
			addRelation(RelationFactory.getRelationLiqDealToLiqFacHostAgrFromFieldFacHostAgrs());
			addRelation(RelationFactory.getRelationLiqDealToLiqFacilityFromFieldFacilities());
			addRelation(RelationFactory.getRelationLiqDealToLiqOutstandingFromFieldOutstandings());
			addRelation(RelationFactory.getRelationLiqDealAdminToLiqCustomerFromFieldCustomer());
			addRelation(RelationFactory.getRelationLiqDealAdminToLiqDealFromFieldDeal());
			addRelation(RelationFactory.getRelationLiqDealBorrowerToLiqCustomerFromFieldCustomer());
			addRelation(RelationFactory.getRelationLiqDealBorrowerToLiqDealFromFieldDeal());
			addRelation(RelationFactory.getRelationLiqDealBorrowerToLiqFacBorrDetlFromFieldFacBorrDetls());
			addRelation(RelationFactory.getRelationLiqFacBorrDetlToLiqDealBorrowerFromFieldDealBorrower());
			addRelation(RelationFactory.getRelationLiqFacBorrDetlToLiqFacilityFromFieldFacility());
			addRelation(RelationFactory.getRelationLiqFacCommitTrnToLiqDealFromFieldDeal());
			addRelation(RelationFactory.getRelationLiqFacCommitTrnToLiqFacilityFromFieldFacility());
			addRelation(RelationFactory.getRelationLiqFacCommitTrnToLiqOstTranFromFieldOstTran());
			addRelation(RelationFactory.getRelationLiqFacCommitTrnToLiqOstTranFromFieldOstTransCommitTrn());
			addRelation(RelationFactory.getRelationLiqFacHostAgrToLiqDealFromFieldDeal());
			addRelation(RelationFactory.getRelationLiqFacHostAgrToLiqFacilityFromFieldFacility());
			addRelation(RelationFactory.getRelationLiqFacilityToLiqCodeBankFromFieldBank());
			addRelation(RelationFactory.getRelationLiqFacilityToLiqBranchFromFieldBranch());
			addRelation(RelationFactory.getRelationLiqFacilityToLiqDealFromFieldDeal());
			addRelation(RelationFactory.getRelationLiqFacilityToLiqFacilityTypeFromFieldFacilityType());
			addRelation(RelationFactory.getRelationLiqFacilityToLiqFacilityAdminFromFieldFacilityAdmin());
			addRelation(RelationFactory.getRelationLiqFacilityToLiqFacBorrDetlFromFieldFacBorrDetls());
			addRelation(RelationFactory.getRelationLiqFacilityToLiqFacCommitTrnFromFieldFacCommitTrns());
			addRelation(RelationFactory.getRelationLiqFacilityToLiqFacHostAgrFromFieldFacHostAgrs());
			addRelation(RelationFactory.getRelationLiqFacilityToLiqOutstandingFromFieldOutstandings());
			addRelation(RelationFactory.getRelationLiqFacilityAdminToLiqFacilityFromFieldFacility());
			addRelation(RelationFactory.getRelationLiqFacilityTypeToLiqFacilityFromFieldFacilities());
			addRelation(RelationFactory.getRelationLiqOstTranToLiqFacCommitTrnFromFieldFacCommitTrnCommitTrn());
			addRelation(RelationFactory.getRelationLiqOstTranToLiqOutstandingFromFieldOriginalOutstanding());
			addRelation(RelationFactory.getRelationLiqOstTranToLiqOutstandingFromFieldOutstanding());
			addRelation(RelationFactory.getRelationLiqOstTranToLiqFacCommitTrnFromFieldFacCommitTrns());
			addRelation(RelationFactory.getRelationLiqOutstandingToLiqCustomerFromFieldCustomerBorrower());
			addRelation(RelationFactory.getRelationLiqOutstandingToLiqDealFromFieldDeal());
			addRelation(RelationFactory.getRelationLiqOutstandingToLiqFacilityFromFieldFacility());
			addRelation(RelationFactory.getRelationLiqOutstandingToLiqOstTranFromFieldOriginalOstTrans());
			addRelation(RelationFactory.getRelationLiqOutstandingToLiqOstTranFromFieldOstTrans());
			addRelation(RelationFactory.getRelationLiqTimeRegionToLiqBranchFromFieldBranchs());
	}	
	
	protected abstract void initLoaders ();
	
	@SuppressWarnings("rawtypes")
	private void addRelation(Relation relation) {
		String key = relation.getKey();
		if (relations.get(key) == null) {
			relations.put(key, relation);
		}
	}
	
	protected void addLoader(Class<?> class1) {
		if (loaders.get(class1) == null) {
			loaders.put(class1, getLoaderUtils().createNewLoader(class1, this));
		}
	}
	
	public Loader<?, ?, ?> getLoader(Class<?> class1) {
		checkInitLoaders();
		Loader<?, ?, ?> loader = loaders.get(class1);
		if (loader == null) {
			throw new IllegalStateException("No Loader found for class: " + class1.getName());
		}
		return loader;
	}
	
	public Map<Class<?>, Loader<?, ?, ?>> getLoaders() {
		return loaders;
	}
	
	public <S extends DomainObject, T extends DomainObject> Relation<S, T> getRelation(Relation<S, T> relation) {
		return getRelation(relation.getKey());
	}
	
	public <S extends DomainObject, T extends DomainObject> Relation<S, T> getRelation(Class<S> source, Class<T> target,
			String sourceField) {
		String key =  Relation.createId(source, target, sourceField);
		return getRelation(key);
	}

	@SuppressWarnings("unchecked")
	public <S extends DomainObject, T extends DomainObject>  Relation<S,T> getRelation(String key) {
		Relation<S, T> relation = relations.get(key);
		if (relation == null) {
			throw new RuntimeException("Relation " + key + " does not exists!");
		}
		return relation;
	}
	
	public List<Relation> getAllRelations () {
		return new ArrayList<>(relations.values());
	}
	
	public List<Relation> getAllRelationsSwitchedOn() {
		return getAllRelations().stream().filter(s -> (s.isSwitchedOn())).collect(Collectors.toList());
	}
		
	public <T extends DomainObject> Filter<T> getClassFilter(Class<T> clazz) {
		Filter<T> filter = classFilters.get(clazz);
		if (filter == null) {
			filter =  (Filter<T>) ACCEPT_ALL_FILTER;
		}
		return filter;
	}
	
	public <S extends DomainObject, T extends DomainObject> Filter<T> getRelationFilter(Relation<S, T> relation) {
		Filter<T> filter = relationFilters.get(relation.getKey());
		if (filter == null) {
			filter = (Filter<T>) ACCEPT_ALL_FILTER;
		}
		return filter;
	}
	
	public <T extends DomainObject> void registerClassFilter(Class<T> clazz, Filter<T> filter) {
		classFilters.put(clazz, filter);
	}
	
	public <S extends DomainObject, T extends DomainObject> void registerRelationFilter(Relation<S,T> relation, Filter<T> filter) {
		relationFilters.put(relation.getKey(), filter);
	}
	

	public Set<Class<?>> getEntityClasses() {
		checkInitLoaders();
		return loaders.keySet();
	}
	
	private void checkInitLoaders() {
		if (!initialized) {
			initLoaders();
		}
		initialized=true;
	}
	
	public abstract AbstractLoaderUtils getLoaderUtils();

	public Set<String> getContextNames() {
		return contextMetaData.keySet();
	}

	public Collection<String> getRootEntities() {
		return contextMetaData.values();
	}
	
	public Set<String> getUniqueRootEntities() {
		Set<String> uniqueSet = new HashSet<String>(getRootEntities());
		return uniqueSet;
	}
	
	public String getSingleUniqueRootEntity() {
		Set<String> uniqueRootEntities = getUniqueRootEntities();
		if (uniqueRootEntities.isEmpty()) {
			throw new IllegalStateException("No root entity for context main name " + getMainContextName() + " context meta data : " +  getContextMetaData().keySet().toString());
		} else if (uniqueRootEntities.size() > 1) {
//			throw new BadRequestException
			logger.info("Multiple entity for context main name " + getMainContextName() + " context meta data : " +  getContextMetaData().keySet().toString());
		}
		logger.info("getMainContextName(): "  + getMainContextName());
		logger.info("contextMetaData k : "  + contextMetaData.keySet().toString());
		logger.info("contextMetaData v : "  + contextMetaData.values().toString());
		return contextMetaData.get(getMainContextName()); // this must be the single one
	}


	public Map<String, String> getContextMetaData() {
		return contextMetaData;
	}

	public void setContextMetaData(Map<String, String> contextMetaData) {
		this.contextMetaData = contextMetaData;
	}
	
	public void addContextMetaData(String contextName, String rootEntity) {
		this.contextMetaData.put(contextName, rootEntity);
	}

	public String getMainRootEntity() {
		return mainRootEntity;
	}

	public void setMainRootEntity(String contextName, String rootEntity) {
		if (this.mainRootEntity == null) {
			this.mainRootEntity = rootEntity;
			this.mainContextName = contextName;
		} else if (this.mainRootEntity.equals(mainRootEntity)){
			logger.info("multiple contextes for consitent root entities: " + rootEntity + " new context: " + contextName);
		} else {
			logger.info("multiple context with different root entity e.g.: " + rootEntity + " new context: " + contextName
					+ " where main root entity is " + this.mainRootEntity + " and main context " + this.mainContextName);
		}
	}

	public String getMainContextName() {
		return mainContextName;
	}


//	public void setMainContextName(String mainContextName) {
//		if ( this.mainContextName == null) {
//			this.mainContextName = mainContextName;
//		} else {
//			//TODO write message 
//		}
//		this.mainContextName = mainContextName;
//	}
	
	
	
	
}