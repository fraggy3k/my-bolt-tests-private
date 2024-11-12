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
import org.smartdatahub.liq.entity.interfaces.LiqDealAdmin;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.snapshot.SnapshotBranch;
import org.smartdatahub.liq.entity.snapshot.SnapshotCustomer;
import org.smartdatahub.liq.entity.snapshot.SnapshotDealAdmin;
import org.smartdatahub.liq.entity.snapshot.SnapshotDealBorrower;
import org.smartdatahub.liq.entity.snapshot.SnapshotOutstanding;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class SnapshotCustomerLoader extends Loader<LiqCustomer, SnapshotCustomer, String> {

  private SnapshotContext context;

  SnapshotCustomerLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqCustomer entity) {
    return this.context.getSnapshotId() + "-" + entity.getCidCustId();
  }

  @Override
  protected SnapshotCustomer newInstance() {
    return new SnapshotCustomer();
  }

  /*public List<SnapshotCustomer> loadAll(List<VlsCustomer> entities) {
  	List<SnapshotCustomer> list = new ArrayList<>(entities.size());
  	for (LiqCustomer entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqCustomer entity, SnapshotCustomer toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
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
      Relation<LiqCustomer, LiqCustomer> relation =
          this.context.getRelation(LiqCustomer.class, LiqCustomer.class, "customerImmParentParent");
      if (relation.isSwitchedOn()) {
        Filter<LiqCustomer> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqCustomer> filterClass = this.context.getClassFilter(LiqCustomer.class);
        LiqCustomer proxy = entity.getLiqCustomerImmParentParent();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqCustomerImmParentParent(
              this.context.getLoaderUtils().getSnapshotCustomerLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqCustomer, LiqCustomer> relation =
          this.context.getRelation(LiqCustomer.class, LiqCustomer.class, "customerUltParentParent");
      if (relation.isSwitchedOn()) {
        Filter<LiqCustomer> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqCustomer> filterClass = this.context.getClassFilter(LiqCustomer.class);
        LiqCustomer proxy = entity.getLiqCustomerUltParentParent();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqCustomerUltParentParent(
              this.context.getLoaderUtils().getSnapshotCustomerLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqCustomer, LiqBranch> relation =
          this.context.getRelation(LiqCustomer.class, LiqBranch.class, "branchs");
      if (relation.isSwitchedOn()) {
        Filter<LiqBranch> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqBranch> filterClass = this.context.getClassFilter(LiqBranch.class);
        ArrayList<SnapshotBranch> list = new ArrayList<>(entity.getLiqBranchs().size());
        for (LiqBranch toLoad : entity.getLiqBranchs()) {
          if (filterRel.accept(toLoad) && filterClass.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getSnapshotBranchLoader().load(toLoad));
          }
        }
        toFill.addLiqBranchs(list);
      }
    }

    {
      Relation<LiqCustomer, LiqDealAdmin> relation =
          this.context.getRelation(LiqCustomer.class, LiqDealAdmin.class, "dealAdmins");
      if (relation.isSwitchedOn()) {
        Filter<LiqDealAdmin> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqDealAdmin> filterClass = this.context.getClassFilter(LiqDealAdmin.class);
        ArrayList<SnapshotDealAdmin> list = new ArrayList<>(entity.getLiqDealAdmins().size());
        for (LiqDealAdmin toLoad : entity.getLiqDealAdmins()) {
          if (filterRel.accept(toLoad) && filterClass.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getSnapshotDealAdminLoader().load(toLoad));
          }
        }
        toFill.addLiqDealAdmins(list);
      }
    }

    {
      Relation<LiqCustomer, LiqDealBorrower> relation =
          this.context.getRelation(LiqCustomer.class, LiqDealBorrower.class, "dealBorrowers");
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
      Relation<LiqCustomer, LiqCustomer> relation =
          this.context.getRelation(LiqCustomer.class, LiqCustomer.class, "immParentCustomers");
      if (relation.isSwitchedOn()) {
        Filter<LiqCustomer> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqCustomer> filterClass = this.context.getClassFilter(LiqCustomer.class);
        ArrayList<SnapshotCustomer> list =
            new ArrayList<>(entity.getLiqImmParentCustomers().size());
        for (LiqCustomer toLoad : entity.getLiqImmParentCustomers()) {
          if (filterRel.accept(toLoad) && filterClass.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getSnapshotCustomerLoader().load(toLoad));
          }
        }
        toFill.addLiqImmParentCustomers(list);
      }
    }

    {
      Relation<LiqCustomer, LiqOutstanding> relation =
          this.context.getRelation(LiqCustomer.class, LiqOutstanding.class, "outstandings");
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

    {
      Relation<LiqCustomer, LiqCustomer> relation =
          this.context.getRelation(LiqCustomer.class, LiqCustomer.class, "ultParentCustomers");
      if (relation.isSwitchedOn()) {
        Filter<LiqCustomer> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqCustomer> filterClass = this.context.getClassFilter(LiqCustomer.class);
        ArrayList<SnapshotCustomer> list =
            new ArrayList<>(entity.getLiqUltParentCustomers().size());
        for (LiqCustomer toLoad : entity.getLiqUltParentCustomers()) {
          if (filterRel.accept(toLoad) && filterClass.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getSnapshotCustomerLoader().load(toLoad));
          }
        }
        toFill.addLiqUltParentCustomers(list);
      }
    }
  }
}
