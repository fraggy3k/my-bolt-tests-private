/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.SnapshotContext;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqFacilityType;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacility;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacilityType;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class SnapshotFacilityTypeLoader
    extends Loader<LiqFacilityType, SnapshotFacilityType, String> {

  private SnapshotContext context;

  SnapshotFacilityTypeLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqFacilityType entity) {
    return this.context.getSnapshotId() + "-" + entity.getCdeFacType();
  }

  @Override
  protected SnapshotFacilityType newInstance() {
    return new SnapshotFacilityType();
  }

  /*public List<SnapshotFacilityType> loadAll(List<VlsFacilityType> entities) {
  	List<SnapshotFacilityType> list = new ArrayList<>(entities.size());
  	for (LiqFacilityType entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqFacilityType entity, SnapshotFacilityType toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
    toFill.setCdeFacType(entity.getCdeFacType());
    toFill.setIndRevolver(entity.getIndRevolver());
    toFill.setIndTerm(entity.getIndTerm());

    {
      Relation<LiqFacilityType, LiqFacility> relation =
          this.context.getRelation(LiqFacilityType.class, LiqFacility.class, "facilities");
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
  }
}
