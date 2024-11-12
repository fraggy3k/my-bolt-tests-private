/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqBranch;
import org.smartdatahub.liq.entity.interfaces.LiqCodeBank;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqFacBorrDetl;
import org.smartdatahub.liq.entity.interfaces.LiqFacCommitTrn;
import org.smartdatahub.liq.entity.interfaces.LiqFacHostAgr;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqFacilityAdmin;
import org.smartdatahub.liq.entity.interfaces.LiqFacilityType;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.pojo.PojoFacBorrDetl;
import org.smartdatahub.liq.entity.pojo.PojoFacCommitTrn;
import org.smartdatahub.liq.entity.pojo.PojoFacHostAgr;
import org.smartdatahub.liq.entity.pojo.PojoFacility;
import org.smartdatahub.liq.entity.pojo.PojoOutstanding;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class PojoFacilityLoader extends Loader<LiqFacility, PojoFacility, String> {

  private PojoContext context;

  PojoFacilityLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqFacility entity) {
    return entity.getPidFacility();
  }

  @Override
  protected PojoFacility newInstance() {
    return new PojoFacility();
  }

  @Override
  protected void fill(LiqFacility entity, PojoFacility toFill, String id) {
    toFill.setPidFacility(entity.getPidFacility());
    toFill.setAmtDcGlCurr(entity.getAmtDcGlCurr());
    toFill.setAmtDcGlOrig(entity.getAmtDcGlOrig());
    toFill.setAmtGloPreclo(entity.getAmtGloPreclo());
    toFill.setAmtGloblCurr(entity.getAmtGloblCurr());
    toFill.setAmtGloblOrig(entity.getAmtGloblOrig());
    toFill.setAmtUnavail(entity.getAmtUnavail());
    toFill.setCdeAmrtUsed(entity.getCdeAmrtUsed());
    toFill.setCdeBank(entity.getCdeBank());
    toFill.setCdeBranch(entity.getCdeBranch());
    toFill.setCdeCurrency(entity.getCdeCurrency());
    toFill.setCdeFacType(entity.getCdeFacType());
    toFill.setCdeFlGlMap(entity.getCdeFlGlMap());
    toFill.setCdeFndMthAf(entity.getCdeFndMthAf());
    toFill.setCdeFndMthBf(entity.getCdeFndMthBf());
    toFill.setCdeLineBusns(entity.getCdeLineBusns());
    toFill.setCdePerforming(entity.getCdePerforming());
    toFill.setCdePfClawbck(entity.getCdePfClawbck());
    toFill.setCdePfCurRul(entity.getCdePfCurRul());
    toFill.setCdePnltyStat(entity.getCdePnltyStat());
    toFill.setCdeProcArea(entity.getCdeProcArea());
    toFill.setCdeRmtAmMth(entity.getCdeRmtAmMth());
    toFill.setCdeSic(entity.getCdeSic());
    toFill.setCdeSicCntry(entity.getCdeSicCntry());
    toFill.setCdeSubtype(entity.getCdeSubtype());
    toFill.setCdeUnfAmMth(entity.getCdeUnfAmMth());
    toFill.setDteAgreement(entity.getDteAgreement());
    toFill.setDteAmrtMtrty(entity.getDteAmrtMtrty());
    toFill.setDteEffective(entity.getDteEffective());
    toFill.setDteExpiry(entity.getDteExpiry());
    toFill.setDteFinalMat(entity.getDteFinalMat());
    toFill.setDteFlDrawdwn(entity.getDteFlDrawdwn());
    toFill.setDtePastDue(entity.getDtePastDue());
    toFill.setDteSblcExpry(entity.getDteSblcExpry());
    toFill.setDteSblcIssue(entity.getDteSblcIssue());
    toFill.setDteTermFac(entity.getDteTermFac());
    toFill.setIndCmpnBalR(entity.getIndCmpnBalR());
    toFill.setIndCusipLst(entity.getIndCusipLst());
    toFill.setIndDontMail(entity.getIndDontMail());
    toFill.setIndDontPrnt(entity.getIndDontPrnt());
    toFill.setIndFloatLoan(entity.getIndFloatLoan());
    toFill.setIndIncXmlbil(entity.getIndIncXmlbil());
    toFill.setIndMatAdvCh(entity.getIndMatAdvCh());
    toFill.setIndMultiCurr(entity.getIndMultiCurr());
    toFill.setIndSngleDraw(entity.getIndSngleDraw());
    toFill.setNmeFacility(entity.getNmeFacility());
    toFill.setNumFacCntl(entity.getNumFacCntl());
    toFill.setNumMaxCurOt(entity.getNumMaxCurOt());
    toFill.setNumPnsprGrpr(entity.getNumPnsprGrpr());
    toFill.setNumPrcOutCn(entity.getNumPrcOutCn());
    toFill.setPctDealFxrte(entity.getPctDealFxrte());
    toFill.setPctEstUsage(entity.getPctEstUsage());
    toFill.setPctPnltySprd(entity.getPctPnltySprd());
    toFill.setPctTolFxrte(entity.getPctTolFxrte());
    toFill.setPctUseThresh(entity.getPctUseThresh());
    toFill.setPidDeal(entity.getPidDeal());
    toFill.setRidCollatDef(entity.getRidCollatDef());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setTxtCusipNum(entity.getTxtCusipNum());
    toFill.setTxtIsinNum(entity.getTxtIsinNum());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());
    toFill.setXidAnsiId(entity.getXidAnsiId());

    {
      Relation<LiqFacility, LiqCodeBank> relation =
          this.context.getRelation(LiqFacility.class, LiqCodeBank.class, "bank");
      if (relation.isSwitchedOn()) {
        Filter<LiqCodeBank> filter = this.context.getRelationFilter(relation);
        LiqCodeBank proxy = entity.getLiqCodeBank();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqCodeBank())) {
          toFill.setLiqCodeBank(this.context.getLoaderUtils().getPojoCodeBankLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqFacility, LiqBranch> relation =
          this.context.getRelation(LiqFacility.class, LiqBranch.class, "branch");
      if (relation.isSwitchedOn()) {
        Filter<LiqBranch> filter = this.context.getRelationFilter(relation);
        LiqBranch proxy = entity.getLiqBranch();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqBranch())) {
          toFill.setLiqBranch(this.context.getLoaderUtils().getPojoBranchLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqFacility, LiqDeal> relation =
          this.context.getRelation(LiqFacility.class, LiqDeal.class, "deal");
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
      Relation<LiqFacility, LiqFacilityType> relation =
          this.context.getRelation(LiqFacility.class, LiqFacilityType.class, "facilityType");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacilityType> filter = this.context.getRelationFilter(relation);
        LiqFacilityType proxy = entity.getLiqFacilityType();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqFacilityType())) {
          toFill.setLiqFacilityType(
              this.context.getLoaderUtils().getPojoFacilityTypeLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqFacility, LiqFacilityAdmin> relation =
          this.context.getRelation(LiqFacility.class, LiqFacilityAdmin.class, "facilityAdmin");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacilityAdmin> filter = this.context.getRelationFilter(relation);
        LiqFacilityAdmin proxy = entity.getLiqFacilityAdmin();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqFacilityAdmin())) {
          toFill.setLiqFacilityAdmin(
              this.context.getLoaderUtils().getPojoFacilityAdminLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqFacility, LiqFacBorrDetl> relation =
          this.context.getRelation(LiqFacility.class, LiqFacBorrDetl.class, "facBorrDetls");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacBorrDetl> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoFacBorrDetl> list = new ArrayList<>(entity.getLiqFacBorrDetls().size());
        for (LiqFacBorrDetl toLoad : entity.getLiqFacBorrDetls()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoFacBorrDetlLoader().load(toLoad));
          }
        }
        toFill.addLiqFacBorrDetls(list);
      }
    }

    {
      Relation<LiqFacility, LiqFacCommitTrn> relation =
          this.context.getRelation(LiqFacility.class, LiqFacCommitTrn.class, "facCommitTrns");
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

    {
      Relation<LiqFacility, LiqFacHostAgr> relation =
          this.context.getRelation(LiqFacility.class, LiqFacHostAgr.class, "facHostAgrs");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacHostAgr> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoFacHostAgr> list = new ArrayList<>(entity.getLiqFacHostAgrs().size());
        for (LiqFacHostAgr toLoad : entity.getLiqFacHostAgrs()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoFacHostAgrLoader().load(toLoad));
          }
        }
        toFill.addLiqFacHostAgrs(list);
      }
    }

    {
      Relation<LiqFacility, LiqOutstanding> relation =
          this.context.getRelation(LiqFacility.class, LiqOutstanding.class, "outstandings");
      if (relation.isSwitchedOn()) {
        Filter<LiqOutstanding> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoOutstanding> list = new ArrayList<>(entity.getLiqOutstandings().size());
        for (LiqOutstanding toLoad : entity.getLiqOutstandings()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoOutstandingLoader().load(toLoad));
          }
        }
        toFill.addLiqOutstandings(list);
      }
    }
  }
}
