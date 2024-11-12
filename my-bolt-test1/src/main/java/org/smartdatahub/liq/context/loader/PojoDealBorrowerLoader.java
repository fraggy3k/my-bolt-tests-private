/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.interfaces.LiqFacBorrDetl;
import org.smartdatahub.liq.entity.pojo.PojoDealBorrower;
import org.smartdatahub.liq.entity.pojo.PojoFacBorrDetl;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class PojoDealBorrowerLoader extends Loader<LiqDealBorrower, PojoDealBorrower, String> {

  private PojoContext context;

  PojoDealBorrowerLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqDealBorrower entity) {
    return entity.getRidDealBorr();
  }

  @Override
  protected PojoDealBorrower newInstance() {
    return new PojoDealBorrower();
  }

  @Override
  protected void fill(LiqDealBorrower entity, PojoDealBorrower toFill, String id) {
    toFill.setRidDealBorr(entity.getRidDealBorr());
    toFill.setCidCustId(entity.getCidCustId());
    toFill.setIndBorrower(entity.getIndBorrower());
    toFill.setIndDepositor(entity.getIndDepositor());
    toFill.setIndPrimBorr(entity.getIndPrimBorr());
    toFill.setPidDeal(entity.getPidDeal());
    toFill.setRidCusSvcGr(entity.getRidCusSvcGr());
    toFill.setRidLocation(entity.getRidLocation());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());

    {
      Relation<LiqDealBorrower, LiqCustomer> relation =
          this.context.getRelation(LiqDealBorrower.class, LiqCustomer.class, "customer");
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
      Relation<LiqDealBorrower, LiqDeal> relation =
          this.context.getRelation(LiqDealBorrower.class, LiqDeal.class, "deal");
      if (relation.isSwitchedOn()) {
        Filter<LiqDeal> filter = this.context.getRelationFilter(relation);
        LiqDeal proxy = entity.getLiqDeal();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqDeal())) {
          toFill.setLiqDeal(this.context.getLoaderUtils().getPojoDealLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqDealBorrower, LiqFacBorrDetl> relation =
          this.context.getRelation(LiqDealBorrower.class, LiqFacBorrDetl.class, "facBorrDetls");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacBorrDetl> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoFacBorrDetl> list = new ArrayList<>(entity.getLiqFacBorrDetls().size());
        for (LiqFacBorrDetl toLoad : entity.getLiqFacBorrDetls()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoFacBorrDetlLoader().load(toLoad));
          }
        }
        toFill.addLiqFacBorrDetls(list);
      }
    }
  }
}
