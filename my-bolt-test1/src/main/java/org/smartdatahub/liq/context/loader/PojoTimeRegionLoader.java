/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqBranch;
import org.smartdatahub.liq.entity.interfaces.LiqTimeRegion;
import org.smartdatahub.liq.entity.pojo.PojoBranch;
import org.smartdatahub.liq.entity.pojo.PojoTimeRegion;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class PojoTimeRegionLoader extends Loader<LiqTimeRegion, PojoTimeRegion, String> {

  private PojoContext context;

  PojoTimeRegionLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqTimeRegion entity) {
    return entity.getCdeCode();
  }

  @Override
  protected PojoTimeRegion newInstance() {
    return new PojoTimeRegion();
  }

  @Override
  protected void fill(LiqTimeRegion entity, PojoTimeRegion toFill, String id) {
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
  }
}
