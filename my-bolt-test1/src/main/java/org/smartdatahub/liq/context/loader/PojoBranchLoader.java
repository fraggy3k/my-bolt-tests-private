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
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqTimeRegion;
import org.smartdatahub.liq.entity.pojo.PojoBranch;
import org.smartdatahub.liq.entity.pojo.PojoDeal;
import org.smartdatahub.liq.entity.pojo.PojoFacility;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class PojoBranchLoader extends Loader<LiqBranch, PojoBranch, String> {

  private PojoContext context;

  PojoBranchLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqBranch entity) {
    return entity.getCdeBranch();
  }

  @Override
  protected PojoBranch newInstance() {
    return new PojoBranch();
  }

  @Override
  protected void fill(LiqBranch entity, PojoBranch toFill, String id) {
    toFill.setCdeBranch(entity.getCdeBranch());
    toFill.setCdeBank(entity.getCdeBank());
    toFill.setCdeCountry(entity.getCdeCountry());
    toFill.setCdeFunctCcy(entity.getCdeFunctCcy());
    toFill.setCdeGl(entity.getCdeGl());
    toFill.setCdeLocalCcy(entity.getCdeLocalCcy());
    toFill.setCdeTmeRegion(entity.getCdeTmeRegion());
    toFill.setCidCustId(entity.getCidCustId());
    toFill.setDscBranch(entity.getDscBranch());
    toFill.setIndActive(entity.getIndActive());
    toFill.setIndCentralSc(entity.getIndCentralSc());
    toFill.setIndMfcofAcct(entity.getIndMfcofAcct());
    toFill.setIndNetBorr(entity.getIndNetBorr());
    toFill.setIndNetCashfl(entity.getIndNetCashfl());
    toFill.setNumFiscMm(entity.getNumFiscMm());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());

    {
      Relation<LiqBranch, LiqCodeBank> relation =
          this.context.getRelation(LiqBranch.class, LiqCodeBank.class, "bank");
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
      Relation<LiqBranch, LiqCustomer> relation =
          this.context.getRelation(LiqBranch.class, LiqCustomer.class, "customer");
      if (relation.isSwitchedOn()) {
        Filter<LiqCustomer> filter = this.context.getRelationFilter(relation);
        LiqCustomer proxy = entity.getLiqCustomer();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqCustomer())) {
          toFill.setLiqCustomer(this.context.getLoaderUtils().getPojoCustomerLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqBranch, LiqTimeRegion> relation =
          this.context.getRelation(LiqBranch.class, LiqTimeRegion.class, "timeRegion");
      if (relation.isSwitchedOn()) {
        Filter<LiqTimeRegion> filter = this.context.getRelationFilter(relation);
        LiqTimeRegion proxy = entity.getLiqTimeRegion();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqTimeRegion())) {
          toFill.setLiqTimeRegion(
              this.context.getLoaderUtils().getPojoTimeRegionLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqBranch, LiqDeal> relation =
          this.context.getRelation(LiqBranch.class, LiqDeal.class, "deals");
      if (relation.isSwitchedOn()) {
        Filter<LiqDeal> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoDeal> list = new ArrayList<>(entity.getLiqDeals().size());
        for (LiqDeal toLoad : entity.getLiqDeals()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoDealLoader().load(toLoad));
          }
        }
        toFill.addLiqDeals(list);
      }
    }

    {
      Relation<LiqBranch, LiqFacility> relation =
          this.context.getRelation(LiqBranch.class, LiqFacility.class, "facilities");
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
  }
}
