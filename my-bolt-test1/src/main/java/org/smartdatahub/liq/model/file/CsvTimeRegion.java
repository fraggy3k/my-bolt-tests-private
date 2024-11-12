/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.model.file;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * SELECT TRG_CDE_CODE, TRG_DSC_CODE, TRG_TSP_REC_CREATE, TRG_TSP_REC_UPDATE, TRG_UID_REC_CREATE,
 * TRG_UID_REC_UPDATE, FROM blablabla
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public class CsvTimeRegion
    implements Identifiable<String>, Serializable, EqualsSimpleFieldSupport<CsvTimeRegion> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "TRG";

  @Id private /*4*/ String cdeCode;
  private /*4*/ String dscCode;
  private /*4*/ Date tspRecCreate;
  private /*4*/ Date tspRecUpdate;
  private /*4*/ String uidRecCreate;
  private /*4*/ String uidRecUpdate;
  private /*4*/ String snapshotId;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - the field <code>cdeCode</code>
   */
  @Override
  public String getId() {
    return cdeCode;
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
  public void setDscCode(String dscCode) {
    this.dscCode = dscCode;
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

  /** */
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(cdeCode);
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
    CsvTimeRegion other = (CsvTimeRegion) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cdeCode, other.cdeCode);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(CsvTimeRegion other) {
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
