/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import org.smartdatahub.liq.context.SnapshotContext;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqDealAdmin;
import org.smartdatahub.liq.entity.snapshot.SnapshotDealAdmin;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class SnapshotDealAdminLoader extends Loader<LiqDealAdmin, SnapshotDealAdmin, String> {

  private SnapshotContext context;

  SnapshotDealAdminLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqDealAdmin entity) {
    return this.context.getSnapshotId() + "-" + entity.getPidDeal();
  }

  @Override
  protected SnapshotDealAdmin newInstance() {
    return new SnapshotDealAdmin();
  }

  /*public List<SnapshotDealAdmin> loadAll(List<VlsDealAdmin> entities) {
  	List<SnapshotDealAdmin> list = new ArrayList<>(entities.size());
  	for (LiqDealAdmin entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqDealAdmin entity, SnapshotDealAdmin toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
    toFill.setPidDeal(entity.getPidDeal());
    toFill.setCidCustId(entity.getCidCustId());
    toFill.setRidFaxGroup(entity.getRidFaxGroup());
    toFill.setRidLocation(entity.getRidLocation());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());

    {
      Relation<LiqDealAdmin, LiqCustomer> relation =
          this.context.getRelation(LiqDealAdmin.class, LiqCustomer.class, "customer");
      if (relation.isSwitchedOn()) {
        Filter<LiqCustomer> filterRel = this.context.getRelationFilter(relation);
        Filter<LiqCustomer> filterClass = this.context.getClassFilter(LiqCustomer.class);
        LiqCustomer proxy = entity.getLiqCustomer();
        proxy = nullIfNotFound(proxy);
        if (filterRel.accept(proxy) && filterClass.accept(proxy)) {
          toFill.setLiqCustomer(
              this.context.getLoaderUtils().getSnapshotCustomerLoader().load(proxy));
        }
      }
    }

    {
      Relation<LiqDealAdmin, LiqDeal> relation =
          this.context.getRelation(LiqDealAdmin.class, LiqDeal.class, "deal");
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
  }
}
