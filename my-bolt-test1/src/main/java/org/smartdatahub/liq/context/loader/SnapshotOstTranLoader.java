/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.SnapshotContext;
import org.smartdatahub.liq.entity.interfaces.LiqFacCommitTrn;
import org.smartdatahub.liq.entity.interfaces.LiqOstTran;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacCommitTrn;
import org.smartdatahub.liq.entity.snapshot.SnapshotOstTran;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class SnapshotOstTranLoader extends Loader<LiqOstTran, SnapshotOstTran, String> {

  private SnapshotContext context;

  SnapshotOstTranLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqOstTran entity) {
    return this.context.getSnapshotId() + "-" + entity.getRidOstTran();
  }

  @Override
  protected SnapshotOstTran newInstance() {
    return new SnapshotOstTran();
  }

  /*public List<SnapshotOstTran> loadAll(List<VlsOstTran> entities) {
  	List<SnapshotOstTran> list = new ArrayList<>(entities.size());
  	for (LiqOstTran entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqOstTran entity, SnapshotOstTran toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
    toFill.setRidOstTran(entity.getRidOstTran());
    toFill.setAmtActual(entity.getAmtActual());
    toFill.setAmtFundFrozn(entity.getAmtFundFrozn());
    toFill.setAmtNewRelse(entity.getAmtNewRelse());
    toFill.setAmtPremium(entity.getAmtPremium());
    toFill.setAmtRequested(entity.getAmtRequested());
    toFill.setAmtSchedBal(entity.getAmtSchedBal());
    toFill.setCdeAccrFreq(entity.getCdeAccrFreq());
    toFill.setCdeGroupType(entity.getCdeGroupType());
    toFill.setCdeLoanPurp(entity.getCdeLoanPurp());
    toFill.setCdeObStCtg(entity.getCdeObStCtg());
    toFill.setCdeObjState(entity.getCdeObjState());
    toFill.setCdeProcArea(entity.getCdeProcArea());
    toFill.setCdeReprFreq(entity.getCdeReprFreq());
    toFill.setCdeRiskType(entity.getCdeRiskType());
    toFill.setCdeTrnsPurp(entity.getCdeTrnsPurp());
    toFill.setCdeType(entity.getCdeType());
    toFill.setDteEffective(entity.getDteEffective());
    toFill.setDteRelease(entity.getDteRelease());
    toFill.setDteRepricing(entity.getDteRepricing());
    toFill.setIndAutoRduce(entity.getIndAutoRduce());
    toFill.setIndAutoRelse(entity.getIndAutoRelse());
    toFill.setIndCreateTrn(entity.getIndCreateTrn());
    toFill.setIndNonAccr(entity.getIndNonAccr());
    toFill.setIndPmtFrBor(entity.getIndPmtFrBor());
    toFill.setPidSublimit(entity.getPidSublimit());
    toFill.setRidCommitTrn(entity.getRidCommitTrn());
    toFill.setRidGroupTran(entity.getRidGroupTran());
    toFill.setRidLinkTrn(entity.getRidLinkTrn());
    toFill.setRidOrigOst(entity.getRidOrigOst());
    toFill.setRidOutstandng(entity.getRidOutstandng());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setUidProcessor(entity.getUidProcessor());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());

    {
      Relation<LiqOstTran, LiqFacCommitTrn> relation =
          this.context.getRelation(
              LiqOstTran.class, LiqFacCommitTrn.class, "facCommitTrnCommitTrn");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacCommitTrn> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqFacCommitTrn> filterClass = this.context.getClassFilter(LiqFacCommitTrn.class);
        LiqFacCommitTrn proxy = entity.getLiqFacCommitTrnCommitTrn();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqFacCommitTrnCommitTrn(
              this.context.getLoaderUtils().getSnapshotFacCommitTrnLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqOstTran, LiqOutstanding> relation =
          this.context.getRelation(LiqOstTran.class, LiqOutstanding.class, "originalOutstanding");
      if (relation.isSwitchedOn()) {
        Filter<LiqOutstanding> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqOutstanding> filterClass = this.context.getClassFilter(LiqOutstanding.class);
        LiqOutstanding proxy = entity.getLiqOriginalOutstanding();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqOriginalOutstanding(
              this.context.getLoaderUtils().getSnapshotOutstandingLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqOstTran, LiqOutstanding> relation =
          this.context.getRelation(LiqOstTran.class, LiqOutstanding.class, "outstanding");
      if (relation.isSwitchedOn()) {
        Filter<LiqOutstanding> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqOutstanding> filterClass = this.context.getClassFilter(LiqOutstanding.class);
        LiqOutstanding proxy = entity.getLiqOutstanding();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqOutstanding(
              this.context.getLoaderUtils().getSnapshotOutstandingLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqOstTran, LiqFacCommitTrn> relation =
          this.context.getRelation(LiqOstTran.class, LiqFacCommitTrn.class, "facCommitTrns");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacCommitTrn> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqFacCommitTrn> filterClass = this.context.getClassFilter(LiqFacCommitTrn.class);
        ArrayList<SnapshotFacCommitTrn> list = new ArrayList<>(entity.getLiqFacCommitTrns().size());
        for (LiqFacCommitTrn toLoad : entity.getLiqFacCommitTrns()) {
          if (filterRel.accept(toLoad) && filterClass.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getSnapshotFacCommitTrnLoader().load(toLoad));
          }
        }
        toFill.addLiqFacCommitTrns(list);
      }
    }
  }
}
