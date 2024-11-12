/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqBranch;
import org.smartdatahub.liq.entity.interfaces.LiqCodeBank;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDealAdmin;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.pojo.PojoBranch;
import org.smartdatahub.liq.entity.pojo.PojoCustomer;
import org.smartdatahub.liq.entity.pojo.PojoDealAdmin;
import org.smartdatahub.liq.entity.pojo.PojoDealBorrower;
import org.smartdatahub.liq.entity.pojo.PojoOutstanding;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class PojoCustomerLoader extends Loader<LiqCustomer, PojoCustomer, String> {

  private PojoContext context;

  PojoCustomerLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqCustomer entity) {
    return entity.getCidCustId();
  }

  @Override
  protected PojoCustomer newInstance() {
    return new PojoCustomer();
  }

  @Override
  protected void fill(LiqCustomer entity, PojoCustomer toFill, String id) {
    toFill.setCidCustId(entity.getCidCustId());
    toFill.setAmtOsLimit(entity.getAmtOsLimit());
    toFill.setCdeBank(entity.getCdeBank());
    toFill.setCdeBranch(entity.getCdeBranch());
    toFill.setCdeCountry(entity.getCdeCountry());
    toFill.setCdeCustDesc(entity.getCdeCustDesc());
    toFill.setCdeCustStat(entity.getCdeCustStat());
    toFill.setCdeDepSubtyp(entity.getCdeDepSubtyp());
    toFill.setCdeDept(entity.getCdeDept());
    toFill.setCdeExpense(entity.getCdeExpense());
    toFill.setCdeLanguage(entity.getCdeLanguage());
    toFill.setCdeLegal(entity.getCdeLegal());
    toFill.setCdeMasterAct(entity.getCdeMasterAct());
    toFill.setCdeOrigin(entity.getCdeOrigin());
    toFill.setCdeOsLimCcy(entity.getCdeOsLimCcy());
    toFill.setCdePrimSic(entity.getCdePrimSic());
    toFill.setCdeProspect(entity.getCdeProspect());
    toFill.setCdeSicCntry(entity.getCdeSicCntry());
    toFill.setCdeTrsRptAr(entity.getCdeTrsRptAr());
    toFill.setCidImmParent(entity.getCidImmParent());
    toFill.setCidUltParent(entity.getCidUltParent());
    toFill.setIndBenefic(entity.getIndBenefic());
    toFill.setIndBorrower(entity.getIndBorrower());
    toFill.setIndBroker(entity.getIndBroker());
    toFill.setIndCra(entity.getIndCra());
    toFill.setIndGuarantor(entity.getIndGuarantor());
    toFill.setIndIntrlEnt(entity.getIndIntrlEnt());
    toFill.setIndInvestor(entity.getIndInvestor());
    toFill.setIndMajUndwrt(entity.getIndMajUndwrt());
    toFill.setIndOsLimErl(entity.getIndOsLimErl());
    toFill.setIndRestrict(entity.getIndRestrict());
    toFill.setIndSimplified(entity.getIndSimplified());
    toFill.setIndSlg(entity.getIndSlg());
    toFill.setIndThrdPtyon(entity.getIndThrdPtyon());
    toFill.setIndVatSubjct(entity.getIndVatSubjct());
    toFill.setNmeFullName(entity.getNmeFullName());
    toFill.setNmeShortName(entity.getNmeShortName());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setTxtVatNumber(entity.getTxtVatNumber());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());
    toFill.setXidCustId(entity.getXidCustId());

    {
      Relation<LiqCustomer, LiqCodeBank> relation =
          this.context.getRelation(LiqCustomer.class, LiqCodeBank.class, "bank");
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
      Relation<LiqCustomer, LiqCustomer> relation =
          this.context.getRelation(LiqCustomer.class, LiqCustomer.class, "customerImmParentParent");
      if (relation.isSwitchedOn()) {
        Filter<LiqCustomer> filter = this.context.getRelationFilter(relation);
        LiqCustomer proxy = entity.getLiqCustomerImmParentParent();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqCustomerImmParentParent())) {
          toFill.setLiqCustomerImmParentParent(
              this.context.getLoaderUtils().getPojoCustomerLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqCustomer, LiqCustomer> relation =
          this.context.getRelation(LiqCustomer.class, LiqCustomer.class, "customerUltParentParent");
      if (relation.isSwitchedOn()) {
        Filter<LiqCustomer> filter = this.context.getRelationFilter(relation);
        LiqCustomer proxy = entity.getLiqCustomerUltParentParent();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqCustomerUltParentParent())) {
          toFill.setLiqCustomerUltParentParent(
              this.context.getLoaderUtils().getPojoCustomerLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqCustomer, LiqBranch> relation =
          this.context.getRelation(LiqCustomer.class, LiqBranch.class, "branchs");
      if (relation.isSwitchedOn()) {
        Filter<LiqBranch> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoBranch> list = new ArrayList<>(entity.getLiqBranchs().size());
        for (LiqBranch toLoad : entity.getLiqBranchs()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoBranchLoader().load(toLoad));
          }
        }
        toFill.addLiqBranchs(list);
      }
    }

    {
      Relation<LiqCustomer, LiqDealAdmin> relation =
          this.context.getRelation(LiqCustomer.class, LiqDealAdmin.class, "dealAdmins");
      if (relation.isSwitchedOn()) {
        Filter<LiqDealAdmin> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoDealAdmin> list = new ArrayList<>(entity.getLiqDealAdmins().size());
        for (LiqDealAdmin toLoad : entity.getLiqDealAdmins()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoDealAdminLoader().load(toLoad));
          }
        }
        toFill.addLiqDealAdmins(list);
      }
    }

    {
      Relation<LiqCustomer, LiqDealBorrower> relation =
          this.context.getRelation(LiqCustomer.class, LiqDealBorrower.class, "dealBorrowers");
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
      Relation<LiqCustomer, LiqCustomer> relation =
          this.context.getRelation(LiqCustomer.class, LiqCustomer.class, "immParentCustomers");
      if (relation.isSwitchedOn()) {
        Filter<LiqCustomer> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoCustomer> list = new ArrayList<>(entity.getLiqImmParentCustomers().size());
        for (LiqCustomer toLoad : entity.getLiqImmParentCustomers()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoCustomerLoader().load(toLoad));
          }
        }
        toFill.addLiqImmParentCustomers(list);
      }
    }

    {
      Relation<LiqCustomer, LiqOutstanding> relation =
          this.context.getRelation(LiqCustomer.class, LiqOutstanding.class, "outstandings");
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

    {
      Relation<LiqCustomer, LiqCustomer> relation =
          this.context.getRelation(LiqCustomer.class, LiqCustomer.class, "ultParentCustomers");
      if (relation.isSwitchedOn()) {
        Filter<LiqCustomer> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoCustomer> list = new ArrayList<>(entity.getLiqUltParentCustomers().size());
        for (LiqCustomer toLoad : entity.getLiqUltParentCustomers()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoCustomerLoader().load(toLoad));
          }
        }
        toFill.addLiqUltParentCustomers(list);
      }
    }
  }
}
