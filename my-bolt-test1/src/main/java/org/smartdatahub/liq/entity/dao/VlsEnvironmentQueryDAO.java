package org.smartdatahub.liq.entity.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.apache.commons.lang3.StringUtils;
import org.smartdatahub.liq.entity.interfaces.IdClassEnvironment;
import org.smartdatahub.liq.entity.interfaces.LiqEnvironment;
import org.smartdatahub.liq.entity.original.VlsEnvironment;
import org.springframework.stereotype.Component;

/** @author Sonja Piel (smartdatahub.org) */
@Component
public class VlsEnvironmentQueryDAO extends AbstractJpaDAO<VlsEnvironment, IdClassEnvironment> {

  public VlsEnvironmentQueryDAO() {
    super(VlsEnvironment.class, IdClassEnvironment.class);
  }
  
  private static String QUERY_DATES_AND_ZONENUM_BY_ZONE =
	      "from " + VlsEnvironment.class.getSimpleName() + " where trim(nmeVarClass)  = :zone "
	  			+ " and  nmeVarName in ('Previous Business Date' , 'Current Business Date', 'Next Business Date', 'RGNID') ";
  
  private static String QUERY_ALL_CURR_B_DATES =
	      "from " + VlsEnvironment.class.getSimpleName() + " where "
	  			+ " nmeVarName = 'Current Business Date' ";
  

  private static String QUERY_BY_ZONE = "select e from VlsEnvironment e where e.nmeVarClass = :nmeVarClass";



  public List<LiqEnvironment> getEnvironmentByZone(String nmeVarClass, int offset, int maxResults) {
	  TypedQuery<VlsEnvironment> query = createQuery(QUERY_BY_ZONE);
	  query.setParameter("nmeVarClass", StringUtils.rightPad(nmeVarClass, 8));
	  query.setMaxResults(maxResults);
	  query.setFirstResult(offset);
	  return new ArrayList<LiqEnvironment>(query.getResultList());
	  }

  
  public List<LiqEnvironment> getEnvironmentByZone(String nmeVarClass) {
	return getEnvironmentByZone(nmeVarClass, 0, Integer.MAX_VALUE);
	}
  
  public List<LiqEnvironment> getEnvironmentDatesAndZoneNumByZone(String zone) {
	  TypedQuery<VlsEnvironment> query = createQuery(QUERY_DATES_AND_ZONENUM_BY_ZONE);
	  query.setParameter("zone", zone.trim());
	  return new ArrayList<LiqEnvironment>(query.getResultList()); 
	}

	  
  public List<LiqEnvironment> getEnvironmentAllCurrentBusinessDates() {
    TypedQuery<VlsEnvironment> query = createQuery(QUERY_ALL_CURR_B_DATES);
	return new ArrayList<LiqEnvironment>(query.getResultList());
	}
}
