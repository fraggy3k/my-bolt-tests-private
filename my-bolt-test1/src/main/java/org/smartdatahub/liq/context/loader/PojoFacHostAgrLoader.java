/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqFacHostAgr;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.pojo.PojoFacHostAgr;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class PojoFacHostAgrLoader extends Loader<LiqFacHostAgr, PojoFacHostAgr, String> {

  private PojoContext context;

  PojoFacHostAgrLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqFacHostAgr entity) {
    return entity.getPidDeal() + entity.getPidFacility();
  }

  @Override
  protected PojoFacHostAgr newInstance() {
    return new PojoFacHostAgr();
  }

  @Override
  protected void fill(LiqFacHostAgr entity, PojoFacHostAgr toFill, String id) {
    toFill.setPidDeal(entity.getPidDeal());
    toFill.setPidFacility(entity.getPidFacility());
    toFill.setAmtClosing(entity.getAmtClosing());
    toFill.setAmtDcClose(entity.getAmtDcClose());
    toFill.setAmtDcGross(entity.getAmtDcGross());
    toFill.setAmtDcGrsAdj(entity.getAmtDcGrsAdj());
    toFill.setAmtDcNet(entity.getAmtDcNet());
    toFill.setAmtDcNetAdj(entity.getAmtDcNetAdj());
    toFill.setAmtDcPreclos(entity.getAmtDcPreclos());
    toFill.setAmtGross(entity.getAmtGross());
    toFill.setAmtGrossAdj(entity.getAmtGrossAdj());
    toFill.setAmtNet(entity.getAmtNet());
    toFill.setAmtNetAdj(entity.getAmtNetAdj());
    toFill.setAmtPreclose(entity.getAmtPreclose());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());

    {
      Relation<LiqFacHostAgr, LiqDeal> relation =
          this.context.getRelation(LiqFacHostAgr.class, LiqDeal.class, "deal");
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
      Relation<LiqFacHostAgr, LiqFacility> relation =
          this.context.getRelation(LiqFacHostAgr.class, LiqFacility.class, "facility");
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
