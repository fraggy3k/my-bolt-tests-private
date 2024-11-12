/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import org.smartdatahub.liq.context.SnapshotContext;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqFacilityAdmin;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacilityAdmin;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class SnapshotFacilityAdminLoader
    extends Loader<LiqFacilityAdmin, SnapshotFacilityAdmin, String> {

  private SnapshotContext context;

  SnapshotFacilityAdminLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqFacilityAdmin entity) {
    return this.context.getSnapshotId() + "-" + entity.getRidAdmin();
  }

  @Override
  protected SnapshotFacilityAdmin newInstance() {
    return new SnapshotFacilityAdmin();
  }

  /*public List<SnapshotFacilityAdmin> loadAll(List<VlsFacilityAdmin> entities) {
  	List<SnapshotFacilityAdmin> list = new ArrayList<>(entities.size());
  	for (LiqFacilityAdmin entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqFacilityAdmin entity, SnapshotFacilityAdmin toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
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
        Filter<LiqFacility> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqFacility> filterClass = this.context.getClassFilter(LiqFacility.class);
        LiqFacility proxy = entity.getLiqFacility();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqFacility(
              this.context.getLoaderUtils().getSnapshotFacilityLoader().load(proxy));
        }
      }
    }
  }
}
