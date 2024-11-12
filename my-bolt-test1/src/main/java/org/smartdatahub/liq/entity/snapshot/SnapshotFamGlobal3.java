/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.snapshot;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.IdClassFamGlobal3;
import org.smartdatahub.liq.entity.interfaces.LiqFamGlobal3;
import org.smartdatahub.liq.entity.utils.BooleanToStringConverter;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/** @author Julian Egyptien (smartdatahub.org) */
@Entity
@Table(name = "SNAP_FAM_GLOBAL3")
public class SnapshotFamGlobal3
    implements LiqFamGlobal3,
        Identifiable<String>,
        Serializable,
        EqualsSimpleFieldSupport<SnapshotFamGlobal3> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "GB3";

  @Id
  @Column(name = "ID", length = 53)
  private /*4*/ String id;

  @Column(name = "GB3_CDE_CODE", nullable = false, length = 5)
  private /*4*/ String cdeCode;

  @Column(name = "GB3_CDE_FKEY1", nullable = false, length = 5)
  private /*4*/ String cdeFkey1;

  @Column(name = "GB3_DSC_CODE", nullable = false, length = 400)
  private /*4*/ String dscCode;

  @Column(name = "GB3_IND_ACTIVE", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indActive;

  @Column(name = "GB3_IND_MAY_DEACT", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indMayDeact;

  @Column(name = "GB3_IND_OPTIONAL_1", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptional1;

  @Column(name = "GB3_IND_OPTIONAL_2", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptional2;

  @Column(name = "GB3_RTO_OPTIONAL", nullable = true, length = 22)
  private /*4*/ BigDecimal rtoOptional;

  @Column(name = "GB3_RTO_OPTIONAL_1", nullable = true, length = 22)
  private /*4*/ BigDecimal rtoOptional1;

  @Column(name = "SNAPSHOT_ID", length = 50)
  private /*4*/ String snapshotId;

  @ManyToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "SNAPSHOT_INFO")
  private /*3*/ SnapshotInfo snapshotInfo;

  @Column(name = "GB3_TID_TABLE_ID", nullable = false, length = 3)
  private /*4*/ String tidTableId;

  @Column(name = "GB3_TSP_REC_CREATE", nullable = false)
  private /*4*/ Date tspRecCreate;

  @Column(name = "GB3_TSP_REC_UPDATE", nullable = false)
  private /*4*/ Date tspRecUpdate;

  @Column(name = "GB3_UID_REC_CREATE", nullable = false, length = 8)
  private /*4*/ String uidRecCreate;

  @Column(name = "GB3_UID_REC_UPDATE", nullable = false, length = 8)
  private /*4*/ String uidRecUpdate;

  /**
   * Special Getter for the origin ID
   *
   * @returns - a IdClassFamGlobal3 object
   */
  @Override
  public IdClassFamGlobal3 getOriginId() {
    IdClassFamGlobal3 id = new IdClassFamGlobal3(this.cdeCode, this.cdeFkey1, this.tidTableId);
    return id;
  }
  /** */
  public String getId() {
    return id;
  }

  /** Trimmed version of {@link #getId()} */
  public String getId_trimmed() {
    return (id == null) ? null : id.trim();
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
  public String getSnapshotId() {
    return snapshotId;
  }

  /** Trimmed version of {@link #getSnapshotId()} */
  public String getSnapshotId_trimmed() {
    return (snapshotId == null) ? null : snapshotId.trim();
  }

  /** */
  public SnapshotInfo getSnapshotInfo() {
    return snapshotInfo;
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

  // Setter HERE
  /** */
  public void setId(String id) {
    this.id = id;
  }

  /** */
  public void setCdeCode(String cdeCode) {
    this.cdeCode = cdeCode;
  }

  /** */
  public void setCdeFkey1(String cdeFkey1) {
    this.cdeFkey1 = cdeFkey1;
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
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  /** */
  public void setSnapshotInfo(SnapshotInfo snapshotInfo) {
    this.snapshotInfo = snapshotInfo;
  }

  /** */
  public void setTidTableId(String tidTableId) {
    this.tidTableId = tidTableId;
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

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(id);
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
    SnapshotFamGlobal3 other = (SnapshotFamGlobal3) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.id, other.id);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(SnapshotFamGlobal3 other) {
    CompareHelper helper = new CompareHelper();
    helper.append("cdeCode", this.cdeCode, other.cdeCode);
    helper.append("cdeFkey1", this.cdeFkey1, other.cdeFkey1);
    helper.append("dscCode", this.dscCode, other.dscCode);
    helper.append("indActive", this.indActive, other.indActive);
    helper.append("indMayDeact", this.indMayDeact, other.indMayDeact);
    helper.append("indOptional1", this.indOptional1, other.indOptional1);
    helper.append("indOptional2", this.indOptional2, other.indOptional2);
    helper.append("rtoOptional", this.rtoOptional, other.rtoOptional);
    helper.append("rtoOptional1", this.rtoOptional1, other.rtoOptional1);
    helper.append("tidTableId", this.tidTableId, other.tidTableId);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
