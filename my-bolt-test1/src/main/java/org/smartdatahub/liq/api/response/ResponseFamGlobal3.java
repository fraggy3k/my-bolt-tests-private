/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.api.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.IdClassFamGlobal3;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

import io.swagger.annotations.ApiModel;

/** @author Julian Egyptien (smartdatahub.org) */
@ApiModel(value = "FamGlobal3", description = " # tbd. #")
public class ResponseFamGlobal3
    implements Identifiable<IdClassFamGlobal3>,
        Serializable,
        EqualsSimpleFieldSupport<ResponseFamGlobal3> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "GB3";

  @Id private /*4*/ String cdeCode;
  @Id private /*4*/ String cdeFkey1;
  @Id private /*4*/ String tidTableId;
  private /*4*/ String dscCode;
  private /*4*/ Boolean indActive;
  private /*4*/ Boolean indMayDeact;
  private /*4*/ Boolean indOptional1;
  private /*4*/ Boolean indOptional2;
  private /*4*/ BigDecimal rtoOptional;
  private /*4*/ BigDecimal rtoOptional1;
  private /*4*/ Date tspRecCreate;
  private /*4*/ Date tspRecUpdate;
  private /*4*/ String uidRecCreate;
  private /*4*/ String uidRecUpdate;
  private /*4*/ String snapshotId;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - a IdClassFamGlobal3 object
   */
  @Override
  public IdClassFamGlobal3 getId() {
    IdClassFamGlobal3 id = new IdClassFamGlobal3(this.cdeCode, this.cdeFkey1, this.tidTableId);
    return id;
  }
  /** */
  public String getCdeCode() {
    return cdeCode;
  }

  /** Trimmed version of {@link #getCdeCode()} */
  public String getCdeCode_trimmed() {
    return (cdeCode == null) ? null : cdeCode.trim();
  }

  /** */
  public String getCdeFkey1() {
    return cdeFkey1;
  }

  /** Trimmed version of {@link #getCdeFkey1()} */
  public String getCdeFkey1_trimmed() {
    return (cdeFkey1 == null) ? null : cdeFkey1.trim();
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
  public String getDscCode() {
    return dscCode;
  }

  /** Trimmed version of {@link #getDscCode()} */
  public String getDscCode_trimmed() {
    return (dscCode == null) ? null : dscCode.trim();
  }

  /** */
  public Boolean getIndActive() {
    return indActive;
  }

  /** */
  public Boolean getIndMayDeact() {
    return indMayDeact;
  }

  /** */
  public Boolean getIndOptional1() {
    return indOptional1;
  }

  /** */
  public Boolean getIndOptional2() {
    return indOptional2;
  }

  /** */
  public BigDecimal getRtoOptional() {
    return rtoOptional;
  }

  /** */
  public BigDecimal getRtoOptional1() {
    return rtoOptional1;
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
  public void setCdeCode(String cdeCode) {
    this.cdeCode = cdeCode;
  }

  /** */
  public void setCdeFkey1(String cdeFkey1) {
    this.cdeFkey1 = cdeFkey1;
  }

  /** */
  public void setTidTableId(String tidTableId) {
    this.tidTableId = tidTableId;
  }

  /** */
  public void setDscCode(String dscCode) {
    this.dscCode = dscCode;
  }

  /** */
  public void setIndActive(Boolean indActive) {
    this.indActive = indActive;
  }

  /** */
  public void setIndMayDeact(Boolean indMayDeact) {
    this.indMayDeact = indMayDeact;
  }

  /** */
  public void setIndOptional1(Boolean indOptional1) {
    this.indOptional1 = indOptional1;
  }

  /** */
  public void setIndOptional2(Boolean indOptional2) {
    this.indOptional2 = indOptional2;
  }

  /** */
  public void setRtoOptional(BigDecimal rtoOptional) {
    this.rtoOptional = rtoOptional;
  }

  /** */
  public void setRtoOptional1(BigDecimal rtoOptional1) {
    this.rtoOptional1 = rtoOptional1;
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
    builder.append(cdeFkey1);
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
    ResponseFamGlobal3 other = (ResponseFamGlobal3) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cdeCode, other.cdeCode);
    builder.append(this.cdeFkey1, other.cdeFkey1);
    builder.append(this.tidTableId, other.tidTableId);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(ResponseFamGlobal3 other) {
    CompareHelper helper = new CompareHelper();
    helper.append("cdeCode", this.cdeCode, other.cdeCode);
    helper.append("cdeFkey1", this.cdeFkey1, other.cdeFkey1);
    helper.append("tidTableId", this.tidTableId, other.tidTableId);
    helper.append("dscCode", this.dscCode, other.dscCode);
    helper.append("indActive", this.indActive, other.indActive);
    helper.append("indMayDeact", this.indMayDeact, other.indMayDeact);
    helper.append("indOptional1", this.indOptional1, other.indOptional1);
    helper.append("indOptional2", this.indOptional2, other.indOptional2);
    helper.append("rtoOptional", this.rtoOptional, other.rtoOptional);
    helper.append("rtoOptional1", this.rtoOptional1, other.rtoOptional1);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}