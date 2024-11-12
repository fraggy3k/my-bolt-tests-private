/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqFacilityAdmin;
import org.smartdatahub.liq.entity.pojo.PojoFacilityAdmin;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class PojoFacilityAdminLoader extends Loader<LiqFacilityAdmin, PojoFacilityAdmin, String> {

  private PojoContext context;

  PojoFacilityAdminLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqFacilityAdmin entity) {
    return entity.getRidAdmin();
  }

  @Override
  protected PojoFacilityAdmin newInstance() {
    return new PojoFacilityAdmin();
  }

  @Override
  protected void fill(LiqFacilityAdmin entity, PojoFacilityAdmin toFill, String id) {
    toFill.setRidAdmin(entity.getRidAdmin());
    toFill.setIndCashflow(entity.getIndCashflow());
    toFill.setPidFacility(entity.getPidFacility());
    toFill.setRidFaxGroup(entity.getRidFaxGroup());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());

    {
      Relation<LiqFacilityAdmin, LiqFacility> relation =
          this.context.getRelation(LiqFacilityAdmin.class, LiqFacility.class, "facility");
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
