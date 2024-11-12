/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import org.smartdatahub.liq.context.SnapshotContext;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.interfaces.LiqFacBorrDetl;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacBorrDetl;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class SnapshotFacBorrDetlLoader extends Loader<LiqFacBorrDetl, SnapshotFacBorrDetl, String> {

  private SnapshotContext context;

  SnapshotFacBorrDetlLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqFacBorrDetl entity) {
    return this.context.getSnapshotId() + "-" + entity.getRidBorrDetls();
  }

  @Override
  protected SnapshotFacBorrDetl newInstance() {
    return new SnapshotFacBorrDetl();
  }

  /*public List<SnapshotFacBorrDetl> loadAll(List<VlsFacBorrDetl> entities) {
  	List<SnapshotFacBorrDetl> list = new ArrayList<>(entities.size());
  	for (LiqFacBorrDetl entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqFacBorrDetl entity, SnapshotFacBorrDetl toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
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
        Filter<LiqDealBorrower> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqDealBorrower> filterClass = this.context.getClassFilter(LiqDealBorrower.class);
        LiqDealBorrower proxy = entity.getLiqDealBorrower();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqDealBorrower(
              this.context.getLoaderUtils().getSnapshotDealBorrowerLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqFacBorrDetl, LiqFacility> relation =
          this.context.getRelation(LiqFacBorrDetl.class, LiqFacility.class, "facility");
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
