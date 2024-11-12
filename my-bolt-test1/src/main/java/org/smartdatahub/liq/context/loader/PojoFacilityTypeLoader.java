/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import java.util.ArrayList;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqFacilityType;
import org.smartdatahub.liq.entity.pojo.PojoFacility;
import org.smartdatahub.liq.entity.pojo.PojoFacilityType;
import org.smartdatahub.liq.entity.utils.Filter;
import org.smartdatahub.liq.entity.utils.Loader;
import org.smartdatahub.liq.entity.utils.Relation;

public class PojoFacilityTypeLoader extends Loader<LiqFacilityType, PojoFacilityType, String> {

  private PojoContext context;

  PojoFacilityTypeLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqFacilityType entity) {
    return entity.getCdeFacType();
  }

  @Override
  protected PojoFacilityType newInstance() {
    return new PojoFacilityType();
  }

  @Override
  protected void fill(LiqFacilityType entity, PojoFacilityType toFill, String id) {
    toFill.setCdeFacType(entity.getCdeFacType());
    toFill.setIndRevolver(entity.getIndRevolver());
    toFill.setIndTerm(entity.getIndTerm());

    {
      Relation<LiqFacilityType, LiqFacility> relation =
          this.context.getRelation(LiqFacilityType.class, LiqFacility.class, "facilities");
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
