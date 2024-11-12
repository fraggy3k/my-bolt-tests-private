/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.SnapshotContext;
import org.smartdatahub.liq.entity.interfaces.LiqBranch;
import org.smartdatahub.liq.entity.interfaces.LiqTimeRegion;
import org.smartdatahub.liq.entity.snapshot.SnapshotBranch;
import org.smartdatahub.liq.entity.snapshot.SnapshotTimeRegion;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class SnapshotTimeRegionLoader extends Loader<LiqTimeRegion, SnapshotTimeRegion, String> {

  private SnapshotContext context;

  SnapshotTimeRegionLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqTimeRegion entity) {
    return this.context.getSnapshotId() + "-" + entity.getCdeCode();
  }

  @Override
  protected SnapshotTimeRegion newInstance() {
    return new SnapshotTimeRegion();
  }

  /*public List<SnapshotTimeRegion> loadAll(List<VlsTimeRegion> entities) {
  	List<SnapshotTimeRegion> list = new ArrayList<>(entities.size());
  	for (LiqTimeRegion entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqTimeRegion entity, SnapshotTimeRegion toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
    toFill.setCdeCode(entity.getCdeCode());
    toFill.setDscCode(entity.getDscCode());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());

    {
      Relation<LiqTimeRegion, LiqBranch> relation =
          this.context.getRelation(LiqTimeRegion.class, LiqBranch.class, "branchs");
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
  }
}
