/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.context.loader;

import org.smartdatahub.liq.context.SnapshotContext;
import org.smartdatahub.liq.entity.interfaces.LiqFamGlobal3;
import org.smartdatahub.liq.entity.snapshot.SnapshotFamGlobal3;
import org.smartdatahub.liq.entity.utils.Loader;

public class SnapshotFamGlobal3Loader extends Loader<LiqFamGlobal3, SnapshotFamGlobal3, String> {

  private SnapshotContext context;

  SnapshotFamGlobal3Loader(SnapshotContext context) {
    this.context = context;
  }

  @Override
  protected String getId(LiqFamGlobal3 entity) {
    return this.context.getSnapshotId()
        + "-"
        + entity.getCdeCode()
        + entity.getCdeFkey1()
        + entity.getTidTableId();
  }

  @Override
  protected SnapshotFamGlobal3 newInstance() {
    return new SnapshotFamGlobal3();
  }

  /*public List<SnapshotFamGlobal3> loadAll(List<VlsFamGlobal3> entities) {
  	List<SnapshotFamGlobal3> list = new ArrayList<>(entities.size());
  	for (LiqFamGlobal3 entity : entities) {
  		list.add(load(entity));
  	}
  	return list;
  }*/

  @Override
  protected void fill(LiqFamGlobal3 entity, SnapshotFamGlobal3 toFill, String id) {

    toFill.setId(id);
    toFill.setSnapshotId(this.context.getSnapshotId());
    toFill.setSnapshotInfo(context.getSnapshotInfo());
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
