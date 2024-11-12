/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.SnapshotContext;
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
import org.smartdatahub.liq.entity.snapshot.SnapshotFacBorrDetl;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacCommitTrn;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacHostAgr;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacility;
import org.smartdatahub.liq.entity.snapshot.SnapshotOutstanding;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class SnapshotFacilityLoader extends Loader<LiqFacility, SnapshotFacility, String> {

  private SnapshotContext context;

  SnapshotFacilityLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqFacility entity) {
    return this.context.getSnapshotId() + "-" + entity.getPidFacility();
  }

  @Override
  protected SnapshotFacility newInstance() {
    return new SnapshotFacility();
  }

  /*public List<SnapshotFacility> loadAll(List<VlsFacility> entities) {
  	List<SnapshotFacility> list = new ArrayList<>(entities.size());
  	for (LiqFacility entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqFacility entity, SnapshotFacility toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
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
      Relation<LiqFacility, LiqBranch> relation =
          this.context.getRelation(LiqFacility.class, LiqBranch.class, "branch");
      if (relation.isSwitchedOn()) {
        Filter<LiqBranch> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqBranch> filterClass = this.context.getClassFilter(LiqBranch.class);
        LiqBranch proxy = entity.getLiqBranch();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqBranch(this.context.getLoaderUtils().getSnapshotBranchLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqFacility, LiqDeal> relation =
          this.context.getRelation(LiqFacility.class, LiqDeal.class, "deal");
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
      Relation<LiqFacility, LiqFacilityType> relation =
          this.context.getRelation(LiqFacility.class, LiqFacilityType.class, "facilityType");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacilityType> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqFacilityType> filterClass = this.context.getClassFilter(LiqFacilityType.class);
        LiqFacilityType proxy = entity.getLiqFacilityType();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqFacilityType(
              this.context.getLoaderUtils().getSnapshotFacilityTypeLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqFacility, LiqFacilityAdmin> relation =
          this.context.getRelation(LiqFacility.class, LiqFacilityAdmin.class, "facilityAdmin");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacilityAdmin> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqFacilityAdmin> filterClass = this.context.getClassFilter(LiqFacilityAdmin.class);
        LiqFacilityAdmin proxy = entity.getLiqFacilityAdmin();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqFacilityAdmin(
              this.context.getLoaderUtils().getSnapshotFacilityAdminLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqFacility, LiqFacBorrDetl> relation =
          this.context.getRelation(LiqFacility.class, LiqFacBorrDetl.class, "facBorrDetls");
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

    {
      Relation<LiqFacility, LiqFacCommitTrn> relation =
          this.context.getRelation(LiqFacility.class, LiqFacCommitTrn.class, "facCommitTrns");
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

    {
      Relation<LiqFacility, LiqFacHostAgr> relation =
          this.context.getRelation(LiqFacility.class, LiqFacHostAgr.class, "facHostAgrs");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacHostAgr> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqFacHostAgr> filterClass = this.context.getClassFilter(LiqFacHostAgr.class);
        ArrayList<SnapshotFacHostAgr> list = new ArrayList<>(entity.getLiqFacHostAgrs().size());
        for (LiqFacHostAgr toLoad : entity.getLiqFacHostAgrs()) {
          if (filterRel.accept(toLoad) && filterClass.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getSnapshotFacHostAgrLoader().load(toLoad));
          }
        }
        toFill.addLiqFacHostAgrs(list);
      }
    }

    {
      Relation<LiqFacility, LiqOutstanding> relation =
          this.context.getRelation(LiqFacility.class, LiqOutstanding.class, "outstandings");
      if (relation.isSwitchedOn()) {
        Filter<LiqOutstanding> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqOutstanding> filterClass = this.context.getClassFilter(LiqOutstanding.class);
        ArrayList<SnapshotOutstanding> list = new ArrayList<>(entity.getLiqOutstandings().size());
        for (LiqOutstanding toLoad : entity.getLiqOutstandings()) {
          if (filterRel.accept(toLoad) && filterClass.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getSnapshotOutstandingLoader().load(toLoad));
          }
        }
        toFill.addLiqOutstandings(list);
      }
    }
  }
}
