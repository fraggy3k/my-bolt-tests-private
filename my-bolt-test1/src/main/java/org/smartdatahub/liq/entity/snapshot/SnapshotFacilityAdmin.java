/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.snapshot;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqFacilityAdmin;
import org.smartdatahub.liq.entity.utils.BooleanToStringConverter;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * The facility administrator table. Facility administrators handle cashflows associated with
 * facilities and their loans.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@Entity
@Table(name = "SNAP_FACILITY_ADMIN")
public class SnapshotFacilityAdmin
    implements LiqFacilityAdmin,
        Identifiable<String>,
        Serializable,
        EqualsSimpleFieldSupport<SnapshotFacilityAdmin> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "FAD";

  @Id
  @Column(name = "ID", length = 35)
  private /*4*/ String id;

  @Column(name = "FAD_IND_CASHFLOW", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indCashflow;

  @Column(name = "FAD_PID_FACILITY", nullable = false, length = 8)
  private /*4*/ String pidFacility;

  @Column(name = "FAD_RID_ADMIN", nullable = false, length = 8)
  private /*4*/ String ridAdmin;

  @Column(name = "FAD_RID_FAX_GROUP", nullable = false, length = 8)
  private /*4*/ String ridFaxGroup;

  @Column(name = "SNAPSHOT_ID", length = 50)
  private /*4*/ String snapshotId;

  @ManyToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "SNAPSHOT_INFO")
  private /*3*/ SnapshotInfo snapshotInfo;

  @Column(name = "FAD_TSP_REC_CREATE", nullable = false)
  private /*4*/ Date tspRecCreate;

  @Column(name = "FAD_TSP_REC_UPDATE", nullable = false)
  private /*4*/ Date tspRecUpdate;

  @Column(name = "FAD_UID_REC_CREATE", nullable = false, length = 8)
  private /*4*/ String uidRecCreate;

  @Column(name = "FAD_UID_REC_UPDATE", nullable = false, length = 8)
  private /*4*/ String uidRecUpdate;

  @OneToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE},
      targetEntity = SnapshotFacility.class)
  @JoinColumn(name = "S_FACILITY")
  private /*3*/ SnapshotFacility liqFacility;

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>ridAdmin</code>
   */
  @Override
  public String getOriginId() {
    return ridAdmin;
  }
  /** */
  public String getId() {
    return id;
  }

  /** Trimmed version of {@link #getId()} */
  public String getId_trimmed() {
    return (id == null) ? null : id.trim();
  }

  /**
   * &quot;Indicates whether or not the cash flows through the main branch. (&quot;&quot;Main
   * Branch&quot;&quot; is defined as the branch noted in the Main Servicing Group).&quot;
   */
  public Boolean getIndCashflow() {
    return indCashflow;
  }

  /** The Record ID (RID) for the facility. */
  public String getPidFacility() {
    return pidFacility;
  }

  /** Trimmed version of {@link #getPidFacility()} */
  public String getPidFacility_trimmed() {
    return (pidFacility == null) ? null : pidFacility.trim();
  }

  /** The Record ID (RID) of the Host Bank Lender who is the owner of the Main Servicing Group. */
  public String getRidAdmin() {
    return ridAdmin;
  }

  /** Trimmed version of {@link #getRidAdmin()} */
  public String getRidAdmin_trimmed() {
    return (ridAdmin == null) ? null : ridAdmin.trim();
  }

  /** The Record ID (RID) for the Main Servicing Group. */
  public String getRidFaxGroup() {
    return ridFaxGroup;
  }

  /** Trimmed version of {@link #getRidFaxGroup()} */
  public String getRidFaxGroup_trimmed() {
    return (ridFaxGroup == null) ? null : ridFaxGroup.trim();
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

  /** The facility table. A credit arrangement established by the bank for the client. */
  public LiqFacility getLiqFacility() {
    return nullIfNotFound(liqFacility);
  }

  // Setter HERE
  /** */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * &quot;Indicates whether or not the cash flows through the main branch. (&quot;&quot;Main
   * Branch&quot;&quot; is defined as the branch noted in the Main Servicing Group).&quot;
   */
  public void setIndCashflow(Boolean indCashflow) {
    this.indCashflow = indCashflow;
  }

  /** The Record ID (RID) for the facility. */
  public void setPidFacility(String pidFacility) {
    this.pidFacility = pidFacility;
  }

  /** The Record ID (RID) of the Host Bank Lender who is the owner of the Main Servicing Group. */
  public void setRidAdmin(String ridAdmin) {
    this.ridAdmin = ridAdmin;
  }

  /** The Record ID (RID) for the Main Servicing Group. */
  public void setRidFaxGroup(String ridFaxGroup) {
    this.ridFaxGroup = ridFaxGroup;
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

  /** The facility table. A credit arrangement established by the bank for the client. */
  public void setLiqFacility(SnapshotFacility liqFacility) {
    this.liqFacility = liqFacility;
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
    SnapshotFacilityAdmin other = (SnapshotFacilityAdmin) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.id, other.id);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(SnapshotFacilityAdmin other) {
    CompareHelper helper = new CompareHelper();
    helper.append("indCashflow", this.indCashflow, other.indCashflow);
    helper.append("pidFacility", this.pidFacility, other.pidFacility);
    helper.append("ridAdmin", this.ridAdmin, other.ridAdmin);
    helper.append("ridFaxGroup", this.ridFaxGroup, other.ridFaxGroup);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
