/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqFacCommitTrn;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqOstTran;
import org.smartdatahub.liq.entity.pojo.PojoFacCommitTrn;
import org.smartdatahub.liq.entity.pojo.PojoOstTran;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class PojoFacCommitTrnLoader extends Loader<LiqFacCommitTrn, PojoFacCommitTrn, String> {

  private PojoContext context;

  PojoFacCommitTrnLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqFacCommitTrn entity) {
    return entity.getRidCommitTrn();
  }

  @Override
  protected PojoFacCommitTrn newInstance() {
    return new PojoFacCommitTrn();
  }

  @Override
  protected void fill(LiqFacCommitTrn entity, PojoFacCommitTrn toFill, String id) {
    toFill.setRidCommitTrn(entity.getRidCommitTrn());
    toFill.setAmtCommitment(entity.getAmtCommitment());
    toFill.setAmtUnavail(entity.getAmtUnavail());
    toFill.setCdeCircState(entity.getCdeCircState());
    toFill.setCdeContraSt(entity.getCdeContraSt());
    toFill.setCdeInvType(entity.getCdeInvType());
    toFill.setCdeLinkType(entity.getCdeLinkType());
    toFill.setCdeObStCtg(entity.getCdeObStCtg());
    toFill.setCdeObjState(entity.getCdeObjState());
    toFill.setCdeRskBkByr(entity.getCdeRskBkByr());
    toFill.setCdeRskBkSlr(entity.getCdeRskBkSlr());
    toFill.setCdeTransType(entity.getCdeTransType());
    toFill.setCdeType(entity.getCdeType());
    toFill.setDteCircClose(entity.getDteCircClose());
    toFill.setDteEffective(entity.getDteEffective());
    toFill.setDteRelease(entity.getDteRelease());
    toFill.setFidFacInvId(entity.getFidFacInvId());
    toFill.setIidInvId(entity.getIidInvId());
    toFill.setIndAffTrdLn(entity.getIndAffTrdLn());
    toFill.setIndAutoRelse(entity.getIndAutoRelse());
    toFill.setIndMarketing(entity.getIndMarketing());
    toFill.setIndMktgLink(entity.getIndMktgLink());
    toFill.setPctPrice(entity.getPctPrice());
    toFill.setPctSkimInt(entity.getPctSkimInt());
    toFill.setPidDeal(entity.getPidDeal());
    toFill.setPidFacility(entity.getPidFacility());
    toFill.setRidFrom(entity.getRidFrom());
    toFill.setRidGroupTrn(entity.getRidGroupTrn());
    toFill.setRidLink(entity.getRidLink());
    toFill.setRidPool(entity.getRidPool());
    toFill.setRidTo(entity.getRidTo());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setTxtAmendNum(entity.getTxtAmendNum());
    toFill.setUidProcessor(entity.getUidProcessor());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());

    {
      Relation<LiqFacCommitTrn, LiqDeal> relation =
          this.context.getRelation(LiqFacCommitTrn.class, LiqDeal.class, "deal");
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
      Relation<LiqFacCommitTrn, LiqFacility> relation =
          this.context.getRelation(LiqFacCommitTrn.class, LiqFacility.class, "facility");
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
      Relation<LiqFacCommitTrn, LiqOstTran> relation =
          this.context.getRelation(LiqFacCommitTrn.class, LiqOstTran.class, "ostTran");
      if (relation.isSwitchedOn()) {
        Filter<LiqOstTran> filter = this.context.getRelationFilter(relation);
        LiqOstTran proxy = entity.getLiqOstTran();
        proxy = nullIfNotFound(proxy);
        if (filter.accept(entity.getLiqOstTran())) {
          toFill.setLiqOstTran(this.context.getLoaderUtils().getPojoOstTranLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqFacCommitTrn, LiqOstTran> relation =
          this.context.getRelation(LiqFacCommitTrn.class, LiqOstTran.class, "ostTransCommitTrn");
      if (relation.isSwitchedOn()) {
        Filter<LiqOstTran> filter = this.context.getRelationFilter(relation);
        ArrayList<PojoOstTran> list = new ArrayList<>(entity.getLiqOstTransCommitTrn().size());
        for (LiqOstTran toLoad : entity.getLiqOstTransCommitTrn()) {
          if (filter.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getPojoOstTranLoader().load(toLoad));
          }
        }
        toFill.addLiqOstTransCommitTrn(list);
      }
    }
  }
}
