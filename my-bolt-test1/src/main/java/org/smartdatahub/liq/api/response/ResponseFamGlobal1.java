/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.api.response;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.IdClassFamGlobal1;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

import io.swagger.annotations.ApiModel;

/** @author Julian Egyptien (smartdatahub.org) */
@ApiModel(value = "FamGlobal1", description = " # tbd. #")
public class ResponseFamGlobal1
    implements Identifiable<IdClassFamGlobal1>,
        Serializable,
        EqualsSimpleFieldSupport<ResponseFamGlobal1> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "GB1";

  public static final /*4*/ String DISCRIMINATOR_COLUMN = "GB1_TID_TABLE_ID";
  @Id private /*4*/ String cdeCode;
  @Id private /*4*/ String tidTableId;
  private /*4*/ String dscCode;
  private /*4*/ Boolean indActive;
  private /*4*/ Boolean indMayDeact;
  private /*4*/ Date tspRecCreate;
  private /*4*/ Date tspRecUpdate;
  private /*4*/ String uidRecCreate;
  private /*4*/ String uidRecUpdate;
  private /*4*/ String snapshotId;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - a IdClassFamGlobal1 object
   */
  @Override
  public IdClassFamGlobal1 getId() {
    IdClassFamGlobal1 id = new IdClassFamGlobal1(this.cdeCode, this.tidTableId);
    return id;
  }
  /** */
  protected String getCdeCode() {
    return cdeCode;
  }

  /** Trimmed version of {@link #getCdeCode()} */
  protected String getCdeCode_trimmed() {
    return (cdeCode == null) ? null : cdeCode.trim();
  }

  /** */
  public String getTidTableId() {
    return tidTableId;
  }

  /** Trimmed version of {@link #getTidTableId()} */
  public String getTidTableId_trimmed() {
    return (tidTableId == null) ? null : tidTableId.trim();
  }

  /** */
  protected String getDscCode() {
    return dscCode;
  }

  /** Trimmed version of {@link #getDscCode()} */
  protected String getDscCode_trimmed() {
    return (dscCode == null) ? null : dscCode.trim();
  }

  /** */
  protected Boolean getIndActive() {
    return indActive;
  }

  /** */
  protected Boolean getIndMayDeact() {
    return indMayDeact;
  }

  /** */
  public Date getTspRecCreate() {
    return tspRecCreate;
  }

  /** */
  public Date getTspRecUpdate() {
    return tspRecUpdate;
  }

  /** */
  public String getUidRecCreate() {
    return uidRecCreate;
  }

  /** Trimmed version of {@link #getUidRecCreate()} */
  public String getUidRecCreate_trimmed() {
    return (uidRecCreate == null) ? null : uidRecCreate.trim();
  }

  /** */
  public String getUidRecUpdate() {
    return uidRecUpdate;
  }

  /** Trimmed version of {@link #getUidRecUpdate()} */
  public String getUidRecUpdate_trimmed() {
    return (uidRecUpdate == null) ? null : uidRecUpdate.trim();
  }

  /** */
  public String getSnapshotId() {
    return snapshotId;
  }

  /** Trimmed version of {@link #getSnapshotId()} */
  public String getSnapshotId_trimmed() {
    return (snapshotId == null) ? null : snapshotId.trim();
  }

  // Setter HERE
  /** */
  protected void setCdeCode(String cdeCode) {
    this.cdeCode = cdeCode;
  }

  /** */
  public void setTidTableId(String tidTableId) {
    this.tidTableId = tidTableId;
  }

  /** */
  protected void setDscCode(String dscCode) {
    this.dscCode = dscCode;
  }

  /** */
  protected void setIndActive(Boolean indActive) {
    this.indActive = indActive;
  }

  /** */
  protected void setIndMayDeact(Boolean indMayDeact) {
    this.indMayDeact = indMayDeact;
  }

  /** */
  public void setTspRecCreate(Date tspRecCreate) {
    this.tspRecCreate = tspRecCreate;
  }

  /** */
  public void setTspRecUpdate(Date tspRecUpdate) {
    this.tspRecUpdate = tspRecUpdate;
  }

  /** */
  public void setUidRecCreate(String uidRecCreate) {
    this.uidRecCreate = uidRecCreate;
  }

  /** */
  public void setUidRecUpdate(String uidRecUpdate) {
    this.uidRecUpdate = uidRecUpdate;
  }

  /** */
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(cdeCode);
    builder.append(tidTableId);
    return builder.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj == this) {
      return true;
    }
    if (obj.getClass() != getClass()) {
      return false;
    }
    ResponseFamGlobal1 other = (ResponseFamGlobal1) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cdeCode, other.cdeCode);
    builder.append(this.tidTableId, other.tidTableId);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(ResponseFamGlobal1 other) {
    CompareHelper helper = new CompareHelper();
    helper.append("DISCRIMINATOR_COLUMN", this.DISCRIMINATOR_COLUMN, other.DISCRIMINATOR_COLUMN);
    helper.append("cdeCode", this.cdeCode, other.cdeCode);
    helper.append("tidTableId", this.tidTableId, other.tidTableId);
    helper.append("dscCode", this.dscCode, other.dscCode);
    helper.append("indActive", this.indActive, other.indActive);
    helper.append("indMayDeact", this.indMayDeact, other.indMayDeact);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
