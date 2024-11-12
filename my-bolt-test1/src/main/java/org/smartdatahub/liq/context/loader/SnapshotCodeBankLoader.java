/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import org.smartdatahub.liq.context.SnapshotContext;
import org.smartdatahub.liq.entity.interfaces.LiqCodeBank;
import org.smartdatahub.liq.entity.snapshot.SnapshotCodeBank;
import org.smartdatahub.liq.entity.utils.Loader;

public class SnapshotCodeBankLoader extends Loader<LiqCodeBank, SnapshotCodeBank, String> {

  private SnapshotContext context;

  SnapshotCodeBankLoader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqCodeBank entity) {
    return this.context.getSnapshotId() + "-" + entity.getCode();
  }

  @Override
  protected SnapshotCodeBank newInstance() {
    return new SnapshotCodeBank();
  }

  /*public List<SnapshotCodeBank> loadAll(List<CodeBank> entities) {
  	List<SnapshotCodeBank> list = new ArrayList<>(entities.size());
  	for (LiqCodeBank entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqCodeBank entity, SnapshotCodeBank toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
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
