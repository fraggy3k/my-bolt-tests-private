/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import org.smartdatahub.liq.context.SnapshotContext;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqFacHostAgr;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacHostAgr;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class SnapshotFacHostAgrLoader extends Loader<LiqFacHostAgr, SnapshotFacHostAgr, String> {

  private SnapshotContext context;

  SnapshotFacHostAgrLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqFacHostAgr entity) {
    return this.context.getSnapshotId() + "-" + entity.getPidDeal() + entity.getPidFacility();
  }

  @Override
  protected SnapshotFacHostAgr newInstance() {
    return new SnapshotFacHostAgr();
  }

  /*public List<SnapshotFacHostAgr> loadAll(List<VlsFacHostAgr> entities) {
  	List<SnapshotFacHostAgr> list = new ArrayList<>(entities.size());
  	for (LiqFacHostAgr entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqFacHostAgr entity, SnapshotFacHostAgr toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
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
        Filter<LiqDeal> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqDeal> filterClass = this.context.getClassFilter(LiqDeal.class);
        LiqDeal proxy = entity.getLiqDeal();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqDeal(this.context.getLoaderUtils().getSnapshotDealLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqFacHostAgr, LiqFacility> relation =
          this.context.getRelation(LiqFacHostAgr.class, LiqFacility.class, "facility");
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
