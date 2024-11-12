/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.SnapshotContext;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqOstTran;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.snapshot.SnapshotOstTran;
import org.smartdatahub.liq.entity.snapshot.SnapshotOutstanding;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class SnapshotOutstandingLoader extends Loader<LiqOutstanding, SnapshotOutstanding, String> {

  private SnapshotContext context;

  SnapshotOutstandingLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqOutstanding entity) {
    return this.context.getSnapshotId() + "-" + entity.getRidOutstandng();
  }

  @Override
  protected SnapshotOutstanding newInstance() {
    return new SnapshotOutstanding();
  }

  /*public List<SnapshotOutstanding> loadAll(List<VlsOutstanding> entities) {
  	List<SnapshotOutstanding> list = new ArrayList<>(entities.size());
  	for (LiqOutstanding entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqOutstanding entity, SnapshotOutstanding toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
    toFill.setRidOutstandng(entity.getRidOutstandng());
    toFill.setAmtBankGross(entity.getAmtBankGross());
    toFill.setAmtBankNet(entity.getAmtBankNet());
    toFill.setAmtCurrent(entity.getAmtCurrent());
    toFill.setAmtFcBnkGrs(entity.getAmtFcBnkGrs());
    toFill.setAmtFcBnkNet(entity.getAmtFcBnkNet());
    toFill.setAmtFcCurrent(entity.getAmtFcCurrent());
    toFill.setAmtNacrTlrnc(entity.getAmtNacrTlrnc());
    toFill.setAmtOriginal(entity.getAmtOriginal());
    toFill.setAmtSchedBal(entity.getAmtSchedBal());
    toFill.setCdeAcrPeriod(entity.getCdeAcrPeriod());
    toFill.setCdeActAcrRl(entity.getCdeActAcrRl());
    toFill.setCdeAnvdteEom(entity.getCdeAnvdteEom());
    toFill.setCdeCurrency(entity.getCdeCurrency());
    toFill.setCdeDecPrecn(entity.getCdeDecPrecn());
    toFill.setCdeDecRound(entity.getCdeDecRound());
    toFill.setCdeEndteRule(entity.getCdeEndteRule());
    toFill.setCdeExtension(entity.getCdeExtension());
    toFill.setCdeFracIrate(entity.getCdeFracIrate());
    toFill.setCdeFracRound(entity.getCdeFracRound());
    toFill.setCdeFrgWthhld(entity.getCdeFrgWthhld());
    toFill.setCdeGlClass(entity.getCdeGlClass());
    toFill.setCdeLoanPurp(entity.getCdeLoanPurp());
    toFill.setCdeObStCtg(entity.getCdeObStCtg());
    toFill.setCdeObjState(entity.getCdeObjState());
    toFill.setCdeOutstdTyp(entity.getCdeOutstdTyp());
    toFill.setCdeOverageRl(entity.getCdeOverageRl());
    toFill.setCdePerfStat(entity.getCdePerfStat());
    toFill.setCdePriceOpt(entity.getCdePriceOpt());
    toFill.setCdeRacRepric(entity.getCdeRacRepric());
    toFill.setCdeRapMthd(entity.getCdeRapMthd());
    toFill.setCdeReprFreq(entity.getCdeReprFreq());
    toFill.setCdeRiskType(entity.getCdeRiskType());
    toFill.setCdeRqstCcy(entity.getCdeRqstCcy());
    toFill.setCdeSic(entity.getCdeSic());
    toFill.setCdeSicCntry(entity.getCdeSicCntry());
    toFill.setCdeTaxExempt(entity.getCdeTaxExempt());
    toFill.setCdeTrsryArea(entity.getCdeTrsryArea());
    toFill.setCidBorrower(entity.getCidBorrower());
    toFill.setDteActRepric(entity.getDteActRepric());
    toFill.setDteAniversary(entity.getDteAniversary());
    toFill.setDteEffective(entity.getDteEffective());
    toFill.setDteExpiryClc(entity.getDteExpiryClc());
    toFill.setDteExpiryEnt(entity.getDteExpiryEnt());
    toFill.setDteExpiryFnl(entity.getDteExpiryFnl());
    toFill.setDtePaidDown(entity.getDtePaidDown());
    toFill.setDteRacRepric(entity.getDteRacRepric());
    toFill.setDteRepricing(entity.getDteRepricing());
    toFill.setIndAcCfOnly(entity.getIndAcCfOnly());
    toFill.setIndAcScdBal(entity.getIndAcScdBal());
    toFill.setIndAccruable(entity.getIndAccruable());
    toFill.setIndAnvDteAp(entity.getIndAnvDteAp());
    toFill.setIndAutoExtnd(entity.getIndAutoExtnd());
    toFill.setIndAutoPrepf(entity.getIndAutoPrepf());
    toFill.setIndBillBorr(entity.getIndBillBorr());
    toFill.setIndBillMatr(entity.getIndBillMatr());
    toFill.setIndDontMail(entity.getIndDontMail());
    toFill.setIndDontPrnt(entity.getIndDontPrnt());
    toFill.setIndFacingFee(entity.getIndFacingFee());
    toFill.setIndFloatRate(entity.getIndFloatRate());
    toFill.setIndHasRprDt(entity.getIndHasRprDt());
    toFill.setIndIncXmlbil(entity.getIndIncXmlbil());
    toFill.setIndIntDueRp(entity.getIndIntDueRp());
    toFill.setIndIssuinFee(entity.getIndIssuinFee());
    toFill.setIndMatchFund(entity.getIndMatchFund());
    toFill.setIndNotfRcvd(entity.getIndNotfRcvd());
    toFill.setIndPmatInt(entity.getIndPmatInt());
    toFill.setIndReinstatbl(entity.getIndReinstatbl());
    toFill.setIndSepacrfees(entity.getIndSepacrfees());
    toFill.setIndSyncPcRp(entity.getIndSyncPcRp());
    toFill.setNmeAlias(entity.getNmeAlias());
    toFill.setNumBillDays(entity.getNumBillDays());
    toFill.setNumExtIncr(entity.getNumExtIncr());
    toFill.setNumNotificatn(entity.getNumNotificatn());
    toFill.setPctFrgWthhld(entity.getPctFrgWthhld());
    toFill.setPctNacrTlrnc(entity.getPctNacrTlrnc());
    toFill.setPctTaxExempt(entity.getPctTaxExempt());
    toFill.setPidDeal(entity.getPidDeal());
    toFill.setPidFacility(entity.getPidFacility());
    toFill.setPidSublimit(entity.getPidSublimit());
    toFill.setRidCollatDef(entity.getRidCollatDef());
    toFill.setRidLchgRule(entity.getRidLchgRule());
    toFill.setRteFcHsRate(entity.getRteFcHsRate());
    toFill.setRteFcRate(entity.getRteFcRate());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());

    {
      Relation<LiqOutstanding, LiqCustomer> relation =
          this.context.getRelation(LiqOutstanding.class, LiqCustomer.class, "customerBorrower");
      if (relation.isSwitchedOn()) {
        Filter<LiqCustomer> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqCustomer> filterClass = this.context.getClassFilter(LiqCustomer.class);
        LiqCustomer proxy = entity.getLiqCustomerBorrower();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqCustomerBorrower(
              this.context.getLoaderUtils().getSnapshotCustomerLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqOutstanding, LiqDeal> relation =
          this.context.getRelation(LiqOutstanding.class, LiqDeal.class, "deal");
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
      Relation<LiqOutstanding, LiqFacility> relation =
          this.context.getRelation(LiqOutstanding.class, LiqFacility.class, "facility");
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

    {
      Relation<LiqOutstanding, LiqOstTran> relation =
          this.context.getRelation(LiqOutstanding.class, LiqOstTran.class, "originalOstTrans");
      if (relation.isSwitchedOn()) {
        Filter<LiqOstTran> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqOstTran> filterClass = this.context.getClassFilter(LiqOstTran.class);
        ArrayList<SnapshotOstTran> list = new ArrayList<>(entity.getLiqOriginalOstTrans().size());
        for (LiqOstTran toLoad : entity.getLiqOriginalOstTrans()) {
          if (filterRel.accept(toLoad) && filterClass.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getSnapshotOstTranLoader().load(toLoad));
          }
        }
        toFill.addLiqOriginalOstTrans(list);
      }
    }

    {
      Relation<LiqOutstanding, LiqOstTran> relation =
          this.context.getRelation(LiqOutstanding.class, LiqOstTran.class, "ostTrans");
      if (relation.isSwitchedOn()) {
        Filter<LiqOstTran> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqOstTran> filterClass = this.context.getClassFilter(LiqOstTran.class);
        ArrayList<SnapshotOstTran> list = new ArrayList<>(entity.getLiqOstTrans().size());
        for (LiqOstTran toLoad : entity.getLiqOstTrans()) {
          if (filterRel.accept(toLoad) && filterClass.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getSnapshotOstTranLoader().load(toLoad));
          }
        }
        toFill.addLiqOstTrans(list);
      }
    }
  }
}
