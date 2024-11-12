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
import org.smartdatahub.liq.entity.interfaces.LiqDealAdmin;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.interfaces.LiqFacCommitTrn;
import org.smartdatahub.liq.entity.interfaces.LiqFacHostAgr;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.snapshot.SnapshotDeal;
import org.smartdatahub.liq.entity.snapshot.SnapshotDealBorrower;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacCommitTrn;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacHostAgr;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacility;
import org.smartdatahub.liq.entity.snapshot.SnapshotOutstanding;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class SnapshotDealLoader extends Loader<LiqDeal, SnapshotDeal, String> {

  private SnapshotContext context;

  SnapshotDealLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqDeal entity) {
    return this.context.getSnapshotId() + "-" + entity.getPidDeal();
  }

  @Override
  protected SnapshotDeal newInstance() {
    return new SnapshotDeal();
  }

  /*public List<SnapshotDeal> loadAll(List<VlsDeal> entities) {
  	List<SnapshotDeal> list = new ArrayList<>(entities.size());
  	for (LiqDeal entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqDeal entity, SnapshotDeal toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
    toFill.setPidDeal(entity.getPidDeal());
    toFill.setAmtGloPreclo(entity.getAmtGloPreclo());
    toFill.setAmtNacrTlrnc(entity.getAmtNacrTlrnc());
    toFill.setCdeBank(entity.getCdeBank());
    toFill.setCdeBranch(entity.getCdeBranch());
    toFill.setCdeCrAsn(entity.getCdeCrAsn());
    toFill.setCdeCrPartic(entity.getCdeCrPartic());
    toFill.setCdeDealClass(entity.getCdeDealClass());
    toFill.setCdeDealStat(entity.getCdeDealStat());
    toFill.setCdeDepSubtyp(entity.getCdeDepSubtyp());
    toFill.setCdeDept(entity.getCdeDept());
    toFill.setCdeExpense(entity.getCdeExpense());
    toFill.setCdeInpalRule(entity.getCdeInpalRule());
    toFill.setCdeOrigCcy(entity.getCdeOrigCcy());
    toFill.setCdePdlgcRule(entity.getCdePdlgcRule());
    toFill.setCdePerforming(entity.getCdePerforming());
    toFill.setCdeProcArea(entity.getCdeProcArea());
    toFill.setCdeReasonNfs(entity.getCdeReasonNfs());
    toFill.setCdeSellStage(entity.getCdeSellStage());
    toFill.setCdeTermReasn(entity.getCdeTermReasn());
    toFill.setDteAgreement(entity.getDteAgreement());
    toFill.setDteApproved(entity.getDteApproved());
    toFill.setDteCancelEff(entity.getDteCancelEff());
    toFill.setDteCommitLtr(entity.getDteCommitLtr());
    toFill.setDteDealClsd(entity.getDteDealClsd());
    toFill.setDteFacCutoff(entity.getDteFacCutoff());
    toFill.setDteLastRevwd(entity.getDteLastRevwd());
    toFill.setDteProjClose(entity.getDteProjClose());
    toFill.setDteSblcExp(entity.getDteSblcExp());
    toFill.setDteSblcIssue(entity.getDteSblcIssue());
    toFill.setDteTermEff(entity.getDteTermEff());
    toFill.setIndAcctEnabl(entity.getIndAcctEnabl());
    toFill.setIndActive(entity.getIndActive());
    toFill.setIndActual(entity.getIndActual());
    toFill.setIndAutoGen(entity.getIndAutoGen());
    toFill.setIndAutoNonp(entity.getIndAutoNonp());
    toFill.setIndAutoPrepf(entity.getIndAutoPrepf());
    toFill.setIndAutoRel(entity.getIndAutoRel());
    toFill.setIndCnslBill(entity.getIndCnslBill());
    toFill.setIndCra(entity.getIndCra());
    toFill.setIndCusipLst(entity.getIndCusipLst());
    toFill.setIndDontMail(entity.getIndDontMail());
    toFill.setIndDontPrnt(entity.getIndDontPrnt());
    toFill.setIndEarlyDisc(entity.getIndEarlyDisc());
    toFill.setIndFund(entity.getIndFund());
    toFill.setIndGuarDeal(entity.getIndGuarDeal());
    toFill.setIndHlt(entity.getIndHlt());
    toFill.setIndIncXmlbil(entity.getIndIncXmlbil());
    toFill.setIndNatnlCrdt(entity.getIndNatnlCrdt());
    toFill.setIndOutsdDeal(entity.getIndOutsdDeal());
    toFill.setIndPastDueb(entity.getIndPastDueb());
    toFill.setIndRestrict(entity.getIndRestrict());
    toFill.setIndRsrvAdj(entity.getIndRsrvAdj());
    toFill.setIndSoleLendr(entity.getIndSoleLendr());
    toFill.setNmeAliasName(entity.getNmeAliasName());
    toFill.setNmeDeal(entity.getNmeDeal());
    toFill.setNumDealCntl(entity.getNumDealCntl());
    toFill.setNumEuroIntrm(entity.getNumEuroIntrm());
    toFill.setNumGracePer(entity.getNumGracePer());
    toFill.setNumMatchDraw(entity.getNumMatchDraw());
    toFill.setNumMaxDraw(entity.getNumMaxDraw());
    toFill.setPctNacrTlrnc(entity.getPctNacrTlrnc());
    toFill.setRidCollatDef(entity.getRidCollatDef());
    toFill.setRtoFctSaldif(entity.getRtoFctSaldif());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setTxtCusipNum(entity.getTxtCusipNum());
    toFill.setTxtIsinNum(entity.getTxtIsinNum());
    toFill.setUidAdmnstratr(entity.getUidAdmnstratr());
    toFill.setUidLastRevwr(entity.getUidLastRevwr());
    toFill.setUidOriginator(entity.getUidOriginator());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());
    toFill.setUidRelManagr(entity.getUidRelManagr());
    toFill.setXidAltDealid(entity.getXidAltDealid());
    toFill.setXidAnsiId(entity.getXidAnsiId());
    toFill.setXidNatnlCrdt(entity.getXidNatnlCrdt());

    {
      Relation<LiqDeal, LiqCodeBank> relation =
          this.context.getRelation(LiqDeal.class, LiqCodeBank.class, "bank");
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
      Relation<LiqDeal, LiqBranch> relation =
          this.context.getRelation(LiqDeal.class, LiqBranch.class, "branch");
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
      Relation<LiqDeal, LiqDealAdmin> relation =
          this.context.getRelation(LiqDeal.class, LiqDealAdmin.class, "dealAdmin");
      if (relation.isSwitchedOn()) {
        Filter<LiqDealAdmin> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqDealAdmin> filterClass = this.context.getClassFilter(LiqDealAdmin.class);
        LiqDealAdmin proxy = entity.getLiqDealAdmin();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqDealAdmin(
              this.context.getLoaderUtils().getSnapshotDealAdminLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqDeal, LiqDealBorrower> relation =
          this.context.getRelation(LiqDeal.class, LiqDealBorrower.class, "dealBorrowers");
      if (relation.isSwitchedOn()) {
        Filter<LiqDealBorrower> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqDealBorrower> filterClass = this.context.getClassFilter(LiqDealBorrower.class);
        ArrayList<SnapshotDealBorrower> list = new ArrayList<>(entity.getLiqDealBorrowers().size());
        for (LiqDealBorrower toLoad : entity.getLiqDealBorrowers()) {
          if (filterRel.accept(toLoad) && filterClass.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getSnapshotDealBorrowerLoader().load(toLoad));
          }
        }
        toFill.addLiqDealBorrowers(list);
      }
    }

    {
      Relation<LiqDeal, LiqFacCommitTrn> relation =
          this.context.getRelation(LiqDeal.class, LiqFacCommitTrn.class, "facCommitTrns");
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
      Relation<LiqDeal, LiqFacHostAgr> relation =
          this.context.getRelation(LiqDeal.class, LiqFacHostAgr.class, "facHostAgrs");
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
      Relation<LiqDeal, LiqFacility> relation =
          this.context.getRelation(LiqDeal.class, LiqFacility.class, "facilities");
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

    {
      Relation<LiqDeal, LiqOutstanding> relation =
          this.context.getRelation(LiqDeal.class, LiqOutstanding.class, "outstandings");
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
