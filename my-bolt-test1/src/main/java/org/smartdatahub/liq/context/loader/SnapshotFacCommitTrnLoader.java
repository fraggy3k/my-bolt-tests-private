/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.SnapshotContext;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqFacCommitTrn;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqOstTran;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacCommitTrn;
import org.smartdatahub.liq.entity.snapshot.SnapshotOstTran;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class SnapshotFacCommitTrnLoader
    extends Loader<LiqFacCommitTrn, SnapshotFacCommitTrn, String> {

  private SnapshotContext context;

  SnapshotFacCommitTrnLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqFacCommitTrn entity) {
    return this.context.getSnapshotId() + "-" + entity.getRidCommitTrn();
  }

  @Override
  protected SnapshotFacCommitTrn newInstance() {
    return new SnapshotFacCommitTrn();
  }

  /*public List<SnapshotFacCommitTrn> loadAll(List<VlsFacCommitTrn> entities) {
  	List<SnapshotFacCommitTrn> list = new ArrayList<>(entities.size());
  	for (LiqFacCommitTrn entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqFacCommitTrn entity, SnapshotFacCommitTrn toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
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
      Relation<LiqFacCommitTrn, LiqFacility> relation =
          this.context.getRelation(LiqFacCommitTrn.class, LiqFacility.class, "facility");
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
      Relation<LiqFacCommitTrn, LiqOstTran> relation =
          this.context.getRelation(LiqFacCommitTrn.class, LiqOstTran.class, "ostTran");
      if (relation.isSwitchedOn()) {
        Filter<LiqOstTran> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqOstTran> filterClass = this.context.getClassFilter(LiqOstTran.class);
        LiqOstTran proxy = entity.getLiqOstTran();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqOstTran(
              this.context.getLoaderUtils().getSnapshotOstTranLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqFacCommitTrn, LiqOstTran> relation =
          this.context.getRelation(LiqFacCommitTrn.class, LiqOstTran.class, "ostTransCommitTrn");
      if (relation.isSwitchedOn()) {
        Filter<LiqOstTran> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqOstTran> filterClass = this.context.getClassFilter(LiqOstTran.class);
        ArrayList<SnapshotOstTran> list = new ArrayList<>(entity.getLiqOstTransCommitTrn().size());
        for (LiqOstTran toLoad : entity.getLiqOstTransCommitTrn()) {
          if (filterRel.accept(toLoad) && filterClass.accept(toLoad)) {
            list.add(this.context.getLoaderUtils().getSnapshotOstTranLoader().load(toLoad));
          }
        }
        toFill.addLiqOstTransCommitTrn(list);
      }
    }
  }
}
