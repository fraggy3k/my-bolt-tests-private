/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqFacCommitTrn;
import org.smartdatahub.liq.entity.interfaces.LiqOstTran;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.pojo.PojoFacCommitTrn;
import org.smartdatahub.liq.entity.pojo.PojoOstTran;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class PojoOstTranLoader extends Loader<LiqOstTran, PojoOstTran, String> {

  private PojoContext context;

  PojoOstTranLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqOstTran entity) {
    return entity.getRidOstTran();
  }

  @Override
  protected PojoOstTran newInstance() {
    return new PojoOstTran();
  }

  @Override
  protected void fill(LiqOstTran entity, PojoOstTran toFill, String id) {
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
        Filter<LiqFacCommitTrn> filter = this.context.getRelationFilter(relation);
        LiqFacCommitTrn proxy = entity.getLiqFacCommitTrnCommitTrn();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqFacCommitTrnCommitTrn())) {
          toFill.setLiqFacCommitTrnCommitTrn(
              this.context.getLoaderUtils().getPojoFacCommitTrnLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqOstTran, LiqOutstanding> relation =
          this.context.getRelation(LiqOstTran.class, LiqOutstanding.class, "originalOutstanding");
      if (relation.isSwitchedOn()) {
        Filter<LiqOutstanding> filter = this.context.getRelationFilter(relation);
        LiqOutstanding proxy = entity.getLiqOriginalOutstanding();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqOriginalOutstanding())) {
          toFill.setLiqOriginalOutstanding(
              this.context.getLoaderUtils().getPojoOutstandingLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqOstTran, LiqOutstanding> relation =
          this.context.getRelation(LiqOstTran.class, LiqOutstanding.class, "outstanding");
      if (relation.isSwitchedOn()) {
        Filter<LiqOutstanding> filter = this.context.getRelationFilter(relation);
        LiqOutstanding proxy = entity.getLiqOutstanding();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqOutstanding())) {
          toFill.setLiqOutstanding(
              this.context.getLoaderUtils().getPojoOutstandingLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqOstTran, LiqFacCommitTrn> relation =
          this.context.getRelation(LiqOstTran.class, LiqFacCommitTrn.class, "facCommitTrns");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacCommitTrn> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoFacCommitTrn> list = new ArrayList<>(entity.getLiqFacCommitTrns().size());
        for (LiqFacCommitTrn toLoad : entity.getLiqFacCommitTrns()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoFacCommitTrnLoader().load(toLoad));
          }
        }
        toFill.addLiqFacCommitTrns(list);
      }
    }
  }
}
