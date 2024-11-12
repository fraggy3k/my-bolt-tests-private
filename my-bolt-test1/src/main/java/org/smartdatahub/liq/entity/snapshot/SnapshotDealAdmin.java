/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.snapshot;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqDealAdmin;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * The deal administrator table. Management of money transfer between lenders and borrowers.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@Entity
@Table(name = "SNAP_DEAL_ADMIN")
public class SnapshotDealAdmin
    implements LiqDealAdmin,
        Identifiable<String>,
        Serializable,
        EqualsSimpleFieldSupport<SnapshotDealAdmin> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "DAD";

  @Id
  @Column(name = "ID", length = 35)
  private /*4*/ String id;

  @Column(name = "DAD_CID_CUST_ID", nullable = true, length = 8)
  private /*4*/ String cidCustId;

  @Column(name = "DAD_PID_DEAL", nullable = false, length = 8)
  private /*4*/ String pidDeal;

  @Column(name = "DAD_RID_FAX_GROUP", nullable = true, length = 8)
  private /*4*/ String ridFaxGroup;

  @Column(name = "DAD_RID_LOCATION", nullable = true, length = 8)
  private /*4*/ String ridLocation;

  @Column(name = "SNAPSHOT_ID", length = 50)
  private /*4*/ String snapshotId;

  @ManyToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "SNAPSHOT_INFO")
  private /*3*/ SnapshotInfo snapshotInfo;

  @Column(name = "DAD_TSP_REC_CREATE", nullable = false)
  private /*4*/ Date tspRecCreate;

  @Column(name = "DAD_TSP_REC_UPDATE", nullable = false)
  private /*4*/ Date tspRecUpdate;

  @Column(name = "DAD_UID_REC_CREATE", nullable = false, length = 8)
  private /*4*/ String uidRecCreate;

  @Column(name = "DAD_UID_REC_UPDATE", nullable = false, length = 8)
  private /*4*/ String uidRecUpdate;

  @ManyToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "S_CUSTOMER")
  private /*3*/ SnapshotCustomer liqCustomer;

  @OneToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE},
      targetEntity = SnapshotDeal.class)
  @JoinColumn(name = "S_DEAL")
  private /*3*/ SnapshotDeal liqDeal;

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>pidDeal</code>
   */
  @Override
  public String getOriginId() {
    return pidDeal;
  }
  /** */
  public String getId() {
    return id;
  }

  /** Trimmed version of {@link #getId()} */
  public String getId_trimmed() {
    return (id == null) ? null : id.trim();
  }

  /** The Record ID (RID) for the customer chosen as the agent for the deal. */
  public String getCidCustId() {
    return cidCustId;
  }

  /** Trimmed version of {@link #getCidCustId()} */
  public String getCidCustId_trimmed() {
    return (cidCustId == null) ? null : cidCustId.trim();
  }

  /** The Record ID (RID) for the deal. */
  public String getPidDeal() {
    return pidDeal;
  }

  /** Trimmed version of {@link #getPidDeal()} */
  public String getPidDeal_trimmed() {
    return (pidDeal == null) ? null : pidDeal.trim();
  }

  /** The Record ID (RID) for the agent&apos;s servicing group. */
  public String getRidFaxGroup() {
    return ridFaxGroup;
  }

  /** Trimmed version of {@link #getRidFaxGroup()} */
  public String getRidFaxGroup_trimmed() {
    return (ridFaxGroup == null) ? null : ridFaxGroup.trim();
  }

  /** The Record ID (RID) for the agent&apos;s location. */
  public String getRidLocation() {
    return ridLocation;
  }

  /** Trimmed version of {@link #getRidLocation()} */
  public String getRidLocation_trimmed() {
    return (ridLocation == null) ? null : ridLocation.trim();
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

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public LiqCustomer getLiqCustomer() {
    return nullIfNotFound(liqCustomer);
  }

  /**
   * The deal table. A record of a borrowing agreement between the lender and the borrower which may
   * encompass one or more credit facilities.
   */
  public LiqDeal getLiqDeal() {
    return nullIfNotFound(liqDeal);
  }

  // Setter HERE
  /** */
  public void setId(String id) {
    this.id = id;
  }

  /** The Record ID (RID) for the customer chosen as the agent for the deal. */
  public void setCidCustId(String cidCustId) {
    this.cidCustId = cidCustId;
  }

  /** The Record ID (RID) for the deal. */
  public void setPidDeal(String pidDeal) {
    this.pidDeal = pidDeal;
  }

  /** The Record ID (RID) for the agent&apos;s servicing group. */
  public void setRidFaxGroup(String ridFaxGroup) {
    this.ridFaxGroup = ridFaxGroup;
  }

  /** The Record ID (RID) for the agent&apos;s location. */
  public void setRidLocation(String ridLocation) {
    this.ridLocation = ridLocation;
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

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public void setLiqCustomer(SnapshotCustomer liqCustomer) {
    this.liqCustomer = liqCustomer;
  }

  /**
   * The deal table. A record of a borrowing agreement between the lender and the borrower which may
   * encompass one or more credit facilities.
   */
  public void setLiqDeal(SnapshotDeal liqDeal) {
    this.liqDeal = liqDeal;
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
    SnapshotDealAdmin other = (SnapshotDealAdmin) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.id, other.id);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(SnapshotDealAdmin other) {
    CompareHelper helper = new CompareHelper();
    helper.append("cidCustId", this.cidCustId, other.cidCustId);
    helper.append("pidDeal", this.pidDeal, other.pidDeal);
    helper.append("ridFaxGroup", this.ridFaxGroup, other.ridFaxGroup);
    helper.append("ridLocation", this.ridLocation, other.ridLocation);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
