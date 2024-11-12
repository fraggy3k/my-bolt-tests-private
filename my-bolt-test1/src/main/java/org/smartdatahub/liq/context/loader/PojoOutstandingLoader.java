/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqOstTran;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.pojo.PojoOstTran;
import org.smartdatahub.liq.entity.pojo.PojoOutstanding;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class PojoOutstandingLoader extends Loader<LiqOutstanding, PojoOutstanding, String> {

  private PojoContext context;

  PojoOutstandingLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqOutstanding entity) {
    return entity.getRidOutstandng();
  }

  @Override
  protected PojoOutstanding newInstance() {
    return new PojoOutstanding();
  }

  @Override
  protected void fill(LiqOutstanding entity, PojoOutstanding toFill, String id) {
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
        Filter<LiqCustomer> filter = this.context.getRelationFilter(relation);
        LiqCustomer proxy = entity.getLiqCustomerBorrower();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqCustomerBorrower())) {
          toFill.setLiqCustomerBorrower(
              this.context.getLoaderUtils().getPojoCustomerLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqOutstanding, LiqDeal> relation =
          this.context.getRelation(LiqOutstanding.class, LiqDeal.class, "deal");
      if (relation.isSwitchedOn()) {
        Filter<LiqDeal> filter = this.context.getRelationFilter(relation);
        LiqDeal proxy = entity.getLiqDeal();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqDeal())) {
          toFill.setLiqDeal(this.context.getLoaderUtils().getPojoDealLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqOutstanding, LiqFacility> relation =
          this.context.getRelation(LiqOutstanding.class, LiqFacility.class, "facility");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacility> filter = this.context.getRelationFilter(relation);
        LiqFacility proxy = entity.getLiqFacility();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqFacility())) {
          toFill.setLiqFacility(this.context.getLoaderUtils().getPojoFacilityLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqOutstanding, LiqOstTran> relation =
          this.context.getRelation(LiqOutstanding.class, LiqOstTran.class, "originalOstTrans");
      if (relation.isSwitchedOn()) {
        Filter<LiqOstTran> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoOstTran> list = new ArrayList<>(entity.getLiqOriginalOstTrans().size());
        for (LiqOstTran toLoad : entity.getLiqOriginalOstTrans()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoOstTranLoader().load(toLoad));
          }
        }
        toFill.addLiqOriginalOstTrans(list);
      }
    }

    {
      Relation<LiqOutstanding, LiqOstTran> relation =
          this.context.getRelation(LiqOutstanding.class, LiqOstTran.class, "ostTrans");
      if (relation.isSwitchedOn()) {
        Filter<LiqOstTran> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoOstTran> list = new ArrayList<>(entity.getLiqOstTrans().size());
        for (LiqOstTran toLoad : entity.getLiqOstTrans()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoOstTranLoader().load(toLoad));
          }
        }
        toFill.addLiqOstTrans(list);
      }
    }
  }
}
