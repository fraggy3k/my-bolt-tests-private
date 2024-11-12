/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import org.smartdatahub.liq.context.PojoContext;
import org.smartdatahub.liq.entity.interfaces.LiqCodeBank;
import org.smartdatahub.liq.entity.pojo.PojoCodeBank;
import org.smartdatahub.liq.entity.utils.Loader;

public class PojoCodeBankLoader extends Loader<LiqCodeBank, PojoCodeBank, String> {

  private PojoContext context;

  PojoCodeBankLoader(PojoContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqCodeBank entity) {
    return entity.getCode();
  }

  @Override
  protected PojoCodeBank newInstance() {
    return new PojoCodeBank();
  }

  @Override
  protected void fill(LiqCodeBank entity, PojoCodeBank toFill, String id) {
    toFill.setCode(entity.getCode());
    toFill.setCurrency(entity.getCurrency());
    toFill.setDescription(entity.getDescription());
    toFill.setActive(entity.getActive());
    toFill.setMayDeactivate(entity.getMayDeactivate());
    toFill.setTidTableId(entity.getTidTableId());
    toFill.setTspRecUpdate(entity.getTspRecUpdate());
    toFill.setUidRecUpdate(entity.getUidRecUpdate());
  }
}
