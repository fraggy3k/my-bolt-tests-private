/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.SnapshotContext;
import org.smartdatahub.liq.entity.interfaces.LiqBranch;
import org.smartdatahub.liq.entity.interfaces.LiqCodeBank;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqTimeRegion;
import org.smartdatahub.liq.entity.snapshot.SnapshotBranch;
import org.smartdatahub.liq.entity.snapshot.SnapshotDeal;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacility;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class SnapshotBranchLoader extends Loader<LiqBranch, SnapshotBranch, String> {

  private SnapshotContext context;

  SnapshotBranchLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqBranch entity) {
    return this.context.getSnapshotId() + "-" + entity.getCdeBranch();
  }

  @Override
  protected SnapshotBranch newInstance() {
    return new SnapshotBranch();
  }

  /*public List<SnapshotBranch> loadAll(List<VlsBranch> entities) {
  	List<SnapshotBranch> list = new ArrayList<>(entities.size());
  	for (LiqBranch entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqBranch entity, SnapshotBranch toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
    toFill.setCdeBranch(entity.getCdeBranch());
    toFill.setCdeBank(entity.getCdeBank());
    toFill.setCdeCountry(entity.getCdeCountry());
    toFill.setCdeFunctCcy(entity.getCdeFunctCcy());
    toFill.setCdeGl(entity.getCdeGl());
    toFill.setCdeLocalCcy(entity.getCdeLocalCcy());
    toFill.setCdeTmeRegion(entity.getCdeTmeRegion());
    toFill.setCidCustId(entity.getCidCustId());
    toFill.setDscBranch(entity.getDscBranch());
    toFill.setIndActive(entity.getIndActive());
    toFill.setIndCentralSc(entity.getIndCentralSc());
    toFill.setIndMfcofAcct(entity.getIndMfcofAcct());
    toFill.setIndNetBorr(entity.getIndNetBorr());
    toFill.setIndNetCashfl(entity.getIndNetCashfl());
    toFill.setNumFiscMm(entity.getNumFiscMm());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());

    {
      Relation<LiqBranch, LiqCodeBank> relation =
          this.context.getRelation(LiqBranch.class, LiqCodeBank.class, "bank");
      if (relation.isSwitchedOn()) {
        Filter<LiqCodeBank> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqCodeBank> filterClass = this.context.getClassFilter(LiqCodeBank.class);
        LiqCodeBank proxy = entity.getLiqCodeBank();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqCodeBank(
              this.context.getLoaderUtils().getSnapshotCodeBankLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqBranch, LiqCustomer> relation =
          this.context.getRelation(LiqBranch.class, LiqCustomer.class, "customer");
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
      Relation<LiqBranch, LiqTimeRegion> relation =
          this.context.getRelation(LiqBranch.class, LiqTimeRegion.class, "timeRegion");
      if (relation.isSwitchedOn()) {
        Filter<LiqTimeRegion> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqTimeRegion> filterClass = this.context.getClassFilter(LiqTimeRegion.class);
        LiqTimeRegion proxy = entity.getLiqTimeRegion();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqTimeRegion(
              this.context.getLoaderUtils().getSnapshotTimeRegionLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqBranch, LiqDeal> relation =
          this.context.getRelation(LiqBranch.class, LiqDeal.class, "deals");
      if (relation.isSwitchedOn()) {
        Filter<LiqDeal> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqDeal> filterClass = this.context.getClassFilter(LiqDeal.class);
        ArrayList<SnapshotDeal> list = new ArrayList<>(entity.getLiqDeals().size());
        for (LiqDeal toLoad : entity.getLiqDeals()) {
          if (filterRel.accept(toLoad) && filterClass.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getSnapshotDealLoader().load(toLoad));
          }
        }
        toFill.addLiqDeals(list);
      }
    }

    {
      Relation<LiqBranch, LiqFacility> relation =
          this.context.getRelation(LiqBranch.class, LiqFacility.class, "facilities");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacility> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqFacility> filterClass = this.context.getClassFilter(LiqFacility.class);
        ArrayList<SnapshotFacility> list = new ArrayList<>(entity.getLiqFacilities().size());
        for (LiqFacility toLoad : entity.getLiqFacilities()) {
          if (filterRel.accept(toLoad) && filterClass.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getSnapshotFacilityLoader().load(toLoad));
          }
        }
        toFill.addLiqFacilities(list);
      }
    }
  }
}
