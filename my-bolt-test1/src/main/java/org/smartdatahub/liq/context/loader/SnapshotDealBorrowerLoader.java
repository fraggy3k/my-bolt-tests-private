/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.SnapshotContext;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.interfaces.LiqFacBorrDetl;
import org.smartdatahub.liq.entity.snapshot.SnapshotDealBorrower;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacBorrDetl;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class SnapshotDealBorrowerLoader
    extends Loader<LiqDealBorrower, SnapshotDealBorrower, String> {

  private SnapshotContext context;

  SnapshotDealBorrowerLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqDealBorrower entity) {
    return this.context.getSnapshotId() + "-" + entity.getRidDealBorr();
  }

  @Override
  protected SnapshotDealBorrower newInstance() {
    return new SnapshotDealBorrower();
  }

  /*public List<SnapshotDealBorrower> loadAll(List<VlsDealBorrower> entities) {
  	List<SnapshotDealBorrower> list = new ArrayList<>(entities.size());
  	for (LiqDealBorrower entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqDealBorrower entity, SnapshotDealBorrower toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
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
        Filter<LiqCustomer> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqCustomer> filterClass = this.context.getClassFilter(LiqCustomer.class);
        LiqCustomer proxy = entity.getLiqCustomer();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqCustomer(
              this.context.getLoaderUtils().getSnapshotCustomerLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqDealBorrower, LiqDeal> relation =
          this.context.getRelation(LiqDealBorrower.class, LiqDeal.class, "deal");
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
      Relation<LiqDealBorrower, LiqFacBorrDetl> relation =
          this.context.getRelation(LiqDealBorrower.class, LiqFacBorrDetl.class, "facBorrDetls");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacBorrDetl> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqFacBorrDetl> filterClass = this.context.getClassFilter(LiqFacBorrDetl.class);
        ArrayList<SnapshotFacBorrDetl> list = new ArrayList<>(entity.getLiqFacBorrDetls().size());
        for (LiqFacBorrDetl toLoad : entity.getLiqFacBorrDetls()) {
          if (filterRel.accept(toLoad) && filterClass.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getSnapshotFacBorrDetlLoader().load(toLoad));
          }
        }
        toFill.addLiqFacBorrDetls(list);
      }
    }
  }
}
