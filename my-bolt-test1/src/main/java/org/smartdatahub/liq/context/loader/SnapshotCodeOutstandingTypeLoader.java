/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import org.smartdatahub.liq.context.SnapshotContext;
import org.smartdatahub.liq.entity.interfaces.LiqCodeOutstandingType;
import org.smartdatahub.liq.entity.snapshot.SnapshotCodeOutstandingType;
import org.smartdatahub.liq.entity.utils.Loader;

public class SnapshotCodeOutstandingTypeLoader
    extends Loader<LiqCodeOutstandingType, SnapshotCodeOutstandingType, String> {

  private SnapshotContext context;

  SnapshotCodeOutstandingTypeLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqCodeOutstandingType entity) {
    return this.context.getSnapshotId() + "-" + entity.getCode();
  }

  @Override
  protected SnapshotCodeOutstandingType newInstance() {
    return new SnapshotCodeOutstandingType();
  }

  /*public List<SnapshotCodeOutstandingType> loadAll(List<CodeOutstandingType> entities) {
  	List<SnapshotCodeOutstandingType> list = new ArrayList<>(entities.size());
  	for (LiqCodeOutstandingType entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(
      LiqCodeOutstandingType entity, SnapshotCodeOutstandingType toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
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
