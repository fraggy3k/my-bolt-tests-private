package org.smartdatahub.liq.entity.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.original.VlsDeal;
import org.springframework.stereotype.Component;

/** @author Sonja Piel (smartdatahub.org) */
@Component
public class VlsDealQueryDAO extends AbstractJpaDAO<VlsDeal, String> {

  public VlsDealQueryDAO() {
    super(VlsDeal.class, String.class);
  }
  
  private static String QUERY_BY_NAME_OR_ID =
	      "from " + VlsDeal.class.getSimpleName() + " where nmeDeal like :name or  pidDeal = :pid "; 
  
  public List<LiqDeal> getDealsLikeNameOrEqualToId(String nameOrId) {
	    TypedQuery<VlsDeal> query = createQuery(QUERY_BY_NAME_OR_ID);
		query.setParameter("pid", nameOrId);
		query.setParameter("name", "%" + nameOrId + "%");
		return new ArrayList<LiqDeal>(query.getResultList());
	}

}
