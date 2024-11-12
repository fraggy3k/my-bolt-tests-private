/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.interfaces.LiqFacBorrDetl;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.pojo.PojoFacBorrDetl;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class PojoFacBorrDetlLoader extends Loader<LiqFacBorrDetl, PojoFacBorrDetl, String> {

  private PojoContext context;

  PojoFacBorrDetlLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqFacBorrDetl entity) {
    return entity.getRidBorrDetls();
  }

  @Override
  protected PojoFacBorrDetl newInstance() {
    return new PojoFacBorrDetl();
  }

  @Override
  protected void fill(LiqFacBorrDetl entity, PojoFacBorrDetl toFill, String id) {
    toFill.setRidBorrDetls(entity.getRidBorrDetls());
    toFill.setAmtGloblCurr(entity.getAmtGloblCurr());
    toFill.setCdeFrgWthhld(entity.getCdeFrgWthhld());
    toFill.setCdeTaxExempt(entity.getCdeTaxExempt());
    toFill.setDteEffective(entity.getDteEffective());
    toFill.setDteExpiry(entity.getDteExpiry());
    toFill.setIndActive(entity.getIndActive());
    toFill.setIndPrimBorr(entity.getIndPrimBorr());
    toFill.setPctFrgWthhld(entity.getPctFrgWthhld());
    toFill.setPctTaxExempt(entity.getPctTaxExempt());
    toFill.setPidFacility(entity.getPidFacility());
    toFill.setRidDealBorr(entity.getRidDealBorr());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());

    {
      Relation<LiqFacBorrDetl, LiqDealBorrower> relation =
          this.context.getRelation(LiqFacBorrDetl.class, LiqDealBorrower.class, "dealBorrower");
      if (relation.isSwitchedOn()) {
        Filter<LiqDealBorrower> filter = this.context.getRelationFilter(relation);
        LiqDealBorrower proxy = entity.getLiqDealBorrower();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqDealBorrower())) {
          toFill.setLiqDealBorrower(
              this.context.getLoaderUtils().getPojoDealBorrowerLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqFacBorrDetl, LiqFacility> relation =
          this.context.getRelation(LiqFacBorrDetl.class, LiqFacility.class, "facility");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacility> filter = this.context.getRelationFilter(relation);
        LiqFacility proxy = entity.getLiqFacility();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqFacility())) {
          toFill.setLiqFacility(this.context.getLoaderUtils().getPojoFacilityLoader().load(proxy));
        }
      }
    }
  }
}
