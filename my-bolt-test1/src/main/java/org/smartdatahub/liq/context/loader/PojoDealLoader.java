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
import org.smartdatahub.liq.entity.interfaces.LiqDealAdmin;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.interfaces.LiqFacCommitTrn;
import org.smartdatahub.liq.entity.interfaces.LiqFacHostAgr;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.pojo.PojoDeal;
import org.smartdatahub.liq.entity.pojo.PojoDealBorrower;
import org.smartdatahub.liq.entity.pojo.PojoFacCommitTrn;
import org.smartdatahub.liq.entity.pojo.PojoFacHostAgr;
import org.smartdatahub.liq.entity.pojo.PojoFacility;
import org.smartdatahub.liq.entity.pojo.PojoOutstanding;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class PojoDealLoader extends Loader<LiqDeal, PojoDeal, String> {

  private PojoContext context;

  PojoDealLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqDeal entity) {
    return entity.getPidDeal();
  }

  @Override
  protected PojoDeal newInstance() {
    return new PojoDeal();
  }

  @Override
  protected void fill(LiqDeal entity, PojoDeal toFill, String id) {
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
        Filter<LiqCodeBank> filter = this.context.getRelationFilter(relation);
        LiqCodeBank proxy = entity.getLiqCodeBank();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqCodeBank())) {
          toFill.setLiqCodeBank(this.context.getLoaderUtils().getPojoCodeBankLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqDeal, LiqBranch> relation =
          this.context.getRelation(LiqDeal.class, LiqBranch.class, "branch");
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
      Relation<LiqDeal, LiqDealAdmin> relation =
          this.context.getRelation(LiqDeal.class, LiqDealAdmin.class, "dealAdmin");
      if (relation.isSwitchedOn()) {
        Filter<LiqDealAdmin> filter = this.context.getRelationFilter(relation);
        LiqDealAdmin proxy = entity.getLiqDealAdmin();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqDealAdmin())) {
          toFill.setLiqDealAdmin(
              this.context.getLoaderUtils().getPojoDealAdminLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqDeal, LiqDealBorrower> relation =
          this.context.getRelation(LiqDeal.class, LiqDealBorrower.class, "dealBorrowers");
      if (relation.isSwitchedOn()) {
        Filter<LiqDealBorrower> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoDealBorrower> list = new ArrayList<>(entity.getLiqDealBorrowers().size());
        for (LiqDealBorrower toLoad : entity.getLiqDealBorrowers()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoDealBorrowerLoader().load(toLoad));
          }
        }
        toFill.addLiqDealBorrowers(list);
      }
    }

    {
      Relation<LiqDeal, LiqFacCommitTrn> relation =
          this.context.getRelation(LiqDeal.class, LiqFacCommitTrn.class, "facCommitTrns");
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
      Relation<LiqDeal, LiqFacHostAgr> relation =
          this.context.getRelation(LiqDeal.class, LiqFacHostAgr.class, "facHostAgrs");
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
      Relation<LiqDeal, LiqFacility> relation =
          this.context.getRelation(LiqDeal.class, LiqFacility.class, "facilities");
      if (relation.isSwitchedOn()) {
        Filter<LiqFacility> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoFacility> list = new ArrayList<>(entity.getLiqFacilities().size());
        for (LiqFacility toLoad : entity.getLiqFacilities()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoFacilityLoader().load(toLoad));
          }
        }
        toFill.addLiqFacilities(list);
      }
    }

    {
      Relation<LiqDeal, LiqOutstanding> relation =
          this.context.getRelation(LiqDeal.class, LiqOutstanding.class, "outstandings");
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
