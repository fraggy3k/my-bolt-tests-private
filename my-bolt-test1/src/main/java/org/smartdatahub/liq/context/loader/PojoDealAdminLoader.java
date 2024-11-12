/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqDealAdmin;
import org.smartdatahub.liq.entity.pojo.PojoDealAdmin;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class PojoDealAdminLoader extends Loader<LiqDealAdmin, PojoDealAdmin, String> {

  private PojoContext context;

  PojoDealAdminLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqDealAdmin entity) {
    return entity.getPidDeal();
  }

  @Override
  protected PojoDealAdmin newInstance() {
    return new PojoDealAdmin();
  }

  @Override
  protected void fill(LiqDealAdmin entity, PojoDealAdmin toFill, String id) {
    toFill.setPidDeal(entity.getPidDeal());
    toFill.setCidCustId(entity.getCidCustId());
    toFill.setRidFaxGroup(entity.getRidFaxGroup());
    toFill.setRidLocation(entity.getRidLocation());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());

    {
      Relation<LiqDealAdmin, LiqCustomer> relation =
          this.context.getRelation(LiqDealAdmin.class, LiqCustomer.class, "customer");
      if (relation.isSwitchedOn()) {
        Filter<LiqCustomer> filter = this.context.getRelationFilter(relation);
        LiqCustomer proxy = entity.getLiqCustomer();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqCustomer())) {
          toFill.setLiqCustomer(this.context.getLoaderUtils().getPojoCustomerLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqDealAdmin, LiqDeal> relation =
          this.context.getRelation(LiqDealAdmin.class, LiqDeal.class, "deal");
      if (relation.isSwitchedOn()) {
        Filter<LiqDeal> filter = this.context.getRelationFilter(relation);
        LiqDeal proxy = entity.getLiqDeal();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqDeal())) {
          toFill.setLiqDeal(this.context.getLoaderUtils().getPojoDealLoader().load(proxy));
        }
      }
    }
  }
}
