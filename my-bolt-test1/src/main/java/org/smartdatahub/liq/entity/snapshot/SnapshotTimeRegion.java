/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.snapshot;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.LiqBranch;
import org.smartdatahub.liq.entity.interfaces.LiqTimeRegion;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/** @author Julian Egyptien (smartdatahub.org) */
@Entity
@Table(name = "SNAP_TIME_REGION")
public class SnapshotTimeRegion
    implements LiqTimeRegion,
        Identifiable<String>,
        Serializable,
        EqualsSimpleFieldSupport<SnapshotTimeRegion> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "TRG";

  @Id
  @Column(name = "ID", length = 35)
  private /*4*/ String id;

  @Column(name = "TRG_CDE_CODE", nullable = false, length = 5)
  private /*4*/ String cdeCode;

  @Column(name = "TRG_DSC_CODE", nullable = false, length = 100)
  private /*4*/ String dscCode;

  @Column(name = "SNAPSHOT_ID", length = 50)
  private /*4*/ String snapshotId;

  @ManyToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "SNAPSHOT_INFO")
  private /*3*/ SnapshotInfo snapshotInfo;

  @Column(name = "TRG_TSP_REC_CREATE", nullable = false)
  private /*4*/ Date tspRecCreate;

  @Column(name = "TRG_TSP_REC_UPDATE", nullable = false)
  private /*4*/ Date tspRecUpdate;

  @Column(name = "TRG_UID_REC_CREATE", nullable = false, length = 8)
  private /*4*/ String uidRecCreate;

  @Column(name = "TRG_UID_REC_UPDATE", nullable = false, length = 8)
  private /*4*/ String uidRecUpdate;

  @OneToMany(
      mappedBy = "liqTimeRegion",
      fetch = FetchType.LAZY,
      targetEntity = SnapshotBranch.class,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  private List</*1*/ LiqBranch> liqBranchs;

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>cdeCode</code>
   */
  @Override
  public String getOriginId() {
    return cdeCode;
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
  public String getDscCode() {
    return dscCode;
  }

  /** Trimmed version of {@link #getDscCode()} */
  public String getDscCode_trimmed() {
    return (dscCode == null) ? null : dscCode.trim();
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

  /** Timestamp from when this row was created. */
  public Date getTspRecCreate() {
    return tspRecCreate;
  }

  /** Timestamp from when this row was last updated. */
  public Date getTspRecUpdate() {
    return tspRecUpdate;
  }

  /** User ID that created this row. This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID. */
  public String getUidRecCreate() {
    return uidRecCreate;
  }

  /** Trimmed version of {@link #getUidRecCreate()} */
  public String getUidRecCreate_trimmed() {
    return (uidRecCreate == null) ? null : uidRecCreate.trim();
  }

  /**
   * User ID that last updated this row. This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID.
   */
  public String getUidRecUpdate() {
    return uidRecUpdate;
  }

  /** Trimmed version of {@link #getUidRecUpdate()} */
  public String getUidRecUpdate_trimmed() {
    return (uidRecUpdate == null) ? null : uidRecUpdate.trim();
  }

  /** The branch table. */
  public List<LiqBranch> getLiqBranchs() {
    return nullIfNotFound(liqBranchs);
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
  public void setDscCode(String dscCode) {
    this.dscCode = dscCode;
  }

  /** */
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  /** */
  public void setSnapshotInfo(SnapshotInfo snapshotInfo) {
    this.snapshotInfo = snapshotInfo;
  }

  /** Timestamp from when this row was created. */
  public void setTspRecCreate(Date tspRecCreate) {
    this.tspRecCreate = tspRecCreate;
  }

  /** Timestamp from when this row was last updated. */
  public void setTspRecUpdate(Date tspRecUpdate) {
    this.tspRecUpdate = tspRecUpdate;
  }

  /** User ID that created this row. This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID. */
  public void setUidRecCreate(String uidRecCreate) {
    this.uidRecCreate = uidRecCreate;
  }

  /**
   * User ID that last updated this row. This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID.
   */
  public void setUidRecUpdate(String uidRecUpdate) {
    this.uidRecUpdate = uidRecUpdate;
  }

  /** The branch table. */
  public void addLiqBranchs(List<SnapshotBranch> liqBranchs) {
    if (this.liqBranchs == null) {
      this.liqBranchs = new ArrayList<>(liqBranchs.size());
    }
    this.liqBranchs.addAll(liqBranchs);
    liqBranchs.forEach(e -> e.setLiqTimeRegion(this));
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
    SnapshotTimeRegion other = (SnapshotTimeRegion) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.id, other.id);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(SnapshotTimeRegion other) {
    CompareHelper helper = new CompareHelper();
    helper.append("cdeCode", this.cdeCode, other.cdeCode);
    helper.append("dscCode", this.dscCode, other.dscCode);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
