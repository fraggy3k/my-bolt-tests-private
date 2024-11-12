/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqCodeOutstandingType;
import org.smartdatahub.liq.entity.pojo.PojoCodeOutstandingType;
import org.smartdatahub.liq.entity.utils.Loader;

public class PojoCodeOutstandingTypeLoader
    extends Loader<LiqCodeOutstandingType, PojoCodeOutstandingType, String> {

  private PojoContext context;

  PojoCodeOutstandingTypeLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqCodeOutstandingType entity) {
    return entity.getCode();
  }

  @Override
  protected PojoCodeOutstandingType newInstance() {
    return new PojoCodeOutstandingType();
  }

  @Override
  protected void fill(LiqCodeOutstandingType entity, PojoCodeOutstandingType toFill, String id) {
    toFill.setCode(entity.getCode());
    toFill.setDescription(entity.getDescription());
    toFill.setActive(entity.getActive());
    toFill.setMayDeactivate(entity.getMayDeactivate());
    toFill.setAffectsAggregateOutstandings(entity.getAffectsAggregateOutstandings());
    toFill.setIncludeInBills(entity.getIncludeInBills());
    toFill.setIncludeInPayoffStatements(entity.getIncludeInPayoffStatements());
    toFill.setIsSwappable(entity.getIsSwappable());
    toFill.setAllowsShortSettlement(entity.getAllowsShortSettlement());
    toFill.setEligibleForMulticcyDiscount(entity.getEligibleForMulticcyDiscount());
    toFill.setBackgroundOnly(entity.getBackgroundOnly());
    toFill.setAllowsForeignCurrencyIndexedWorkingCapital(
        entity.getAllowsForeignCurrencyIndexedWorkingCapital());
    toFill.setMapPostmaturityInterestReceivablesSeparately(
        entity.getMapPostmaturityInterestReceivablesSeparately());
    toFill.setTidTableId(entity.getTidTableId());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());
  }
}
