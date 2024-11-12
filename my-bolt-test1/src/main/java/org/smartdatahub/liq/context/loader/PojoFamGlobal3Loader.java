/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqFamGlobal3;
import org.smartdatahub.liq.entity.pojo.PojoFamGlobal3;
import org.smartdatahub.liq.entity.utils.Loader;

public class PojoFamGlobal3Loader extends Loader<LiqFamGlobal3, PojoFamGlobal3, String> {

  private PojoContext context;

  PojoFamGlobal3Loader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqFamGlobal3 entity) {
    return entity.getCdeCode() + entity.getCdeFkey1() + entity.getTidTableId();
  }

  @Override
  protected PojoFamGlobal3 newInstance() {
    return new PojoFamGlobal3();
  }

  @Override
  protected void fill(LiqFamGlobal3 entity, PojoFamGlobal3 toFill, String id) {
    toFill.setCdeCode(entity.getCdeCode());
    toFill.setCdeFkey1(entity.getCdeFkey1());
    toFill.setTidTableId(entity.getTidTableId());
    toFill.setDscCode(entity.getDscCode());
    toFill.setIndActive(entity.getIndActive());
    toFill.setIndMayDeact(entity.getIndMayDeact());
    toFill.setIndOptional1(entity.getIndOptional1());
    toFill.setIndOptional2(entity.getIndOptional2());
    toFill.setRtoOptional(entity.getRtoOptional());
    toFill.setRtoOptional1(entity.getRtoOptional1());
    toFill.setTspRecCreate(entity.getTspRecCreate());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setUidRecCreate(entity.getUidRecCreate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());
  }
}
