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
 * SELECT DBR_RID_DEAL_BORR, DBR_CID_CUST_ID, DBR_IND_BORROWER, DBR_IND_DEPOSITOR,
 * DBR_IND_PRIM_BORR, DBR_PID_DEAL, DBR_RID_CUS_SVC_GR, DBR_RID_LOCATION, DBR_TSP_REC_CREATE,
 * DBR_TSP_REC_UPDATE, DBR_UID_REC_CREATE, DBR_UID_REC_UPDATE, FROM blablabla
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public class CsvDealBorrower
    implements Identifiable<String>, Serializable, EqualsSimpleFieldSupport<CsvDealBorrower> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "DBR";

  @Id private /*4*/ String ridDealBorr;
  private /*4*/ String cidCustId;
  private /*4*/ Boolean indBorrower;
  private /*4*/ Boolean indDepositor;
  private /*4*/ Boolean indPrimBorr;
  private /*4*/ String pidDeal;
  private /*4*/ String ridCusSvcGr;
  private /*4*/ String ridLocation;
  private /*4*/ Date tspRecCreate;
  private /*4*/ Date tspRecUpdate;
  private /*4*/ String uidRecCreate;
  private /*4*/ String uidRecUpdate;
  private /*4*/ String snapshotId;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - the field <code>ridDealBorr</code>
   */
  @Override
  public String getId() {
    return ridDealBorr;
  }
  /**
   * Corrected: The unique Record ID (RID) for the deal borrower. Original: The currency of the
   * equity participation amount.
   */
  public String getRidDealBorr() {
    return ridDealBorr;
  }

  /** Trimmed version of {@link #getRidDealBorr()} */
  public String getRidDealBorr_trimmed() {
    return (ridDealBorr == null) ? null : ridDealBorr.trim();
  }

  /**
   * Attention: Customer id and not Servicing Group! Original: The Record ID (RID) for the deal
   * borrower servicing group.
   */
  public String getCidCustId() {
    return cidCustId;
  }

  /** Trimmed version of {@link #getCidCustId()} */
  public String getCidCustId_trimmed() {
    return (cidCustId == null) ? null : cidCustId.trim();
  }

  /** Indicates a Deal borrower. */
  public Boolean getIndBorrower() {
    return indBorrower;
  }

  /** Indicates a Deal depositor. */
  public Boolean getIndDepositor() {
    return indDepositor;
  }

  /**
   * Corrrected: Indicates a Primary Borrowerer Role. Original: The Record ID (RID) for the deal
   * borrower.
   */
  public Boolean getIndPrimBorr() {
    return indPrimBorr;
  }

  /** Incorrect: The Record ID (RID) for the deal borrower location. */
  public String getPidDeal() {
    return pidDeal;
  }

  /** Trimmed version of {@link #getPidDeal()} */
  public String getPidDeal_trimmed() {
    return (pidDeal == null) ? null : pidDeal.trim();
  }

  /** Customer service group unique ID */
  public String getRidCusSvcGr() {
    return ridCusSvcGr;
  }

  /** Trimmed version of {@link #getRidCusSvcGr()} */
  public String getRidCusSvcGr_trimmed() {
    return (ridCusSvcGr == null) ? null : ridCusSvcGr.trim();
  }

  /** Location unique ID */
  public String getRidLocation() {
    return ridLocation;
  }

  /** Trimmed version of {@link #getRidLocation()} */
  public String getRidLocation_trimmed() {
    return (ridLocation == null) ? null : ridLocation.trim();
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
  /**
   * Corrected: The unique Record ID (RID) for the deal borrower. Original: The currency of the
   * equity participation amount.
   */
  public void setRidDealBorr(String ridDealBorr) {
    this.ridDealBorr = ridDealBorr;
  }

  /**
   * Attention: Customer id and not Servicing Group! Original: The Record ID (RID) for the deal
   * borrower servicing group.
   */
  public void setCidCustId(String cidCustId) {
    this.cidCustId = cidCustId;
  }

  /** Indicates a Deal borrower. */
  public void setIndBorrower(Boolean indBorrower) {
    this.indBorrower = indBorrower;
  }

  /** Indicates a Deal depositor. */
  public void setIndDepositor(Boolean indDepositor) {
    this.indDepositor = indDepositor;
  }

  /**
   * Corrrected: Indicates a Primary Borrowerer Role. Original: The Record ID (RID) for the deal
   * borrower.
   */
  public void setIndPrimBorr(Boolean indPrimBorr) {
    this.indPrimBorr = indPrimBorr;
  }

  /** Incorrect: The Record ID (RID) for the deal borrower location. */
  public void setPidDeal(String pidDeal) {
    this.pidDeal = pidDeal;
  }

  /** Customer service group unique ID */
  public void setRidCusSvcGr(String ridCusSvcGr) {
    this.ridCusSvcGr = ridCusSvcGr;
  }

  /** Location unique ID */
  public void setRidLocation(String ridLocation) {
    this.ridLocation = ridLocation;
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
    builder.append(ridDealBorr);
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
    CsvDealBorrower other = (CsvDealBorrower) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.ridDealBorr, other.ridDealBorr);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(CsvDealBorrower other) {
    CompareHelper helper = new CompareHelper();
    helper.append("ridDealBorr", this.ridDealBorr, other.ridDealBorr);
    helper.append("cidCustId", this.cidCustId, other.cidCustId);
    helper.append("indBorrower", this.indBorrower, other.indBorrower);
    helper.append("indDepositor", this.indDepositor, other.indDepositor);
    helper.append("indPrimBorr", this.indPrimBorr, other.indPrimBorr);
    helper.append("pidDeal", this.pidDeal, other.pidDeal);
    helper.append("ridCusSvcGr", this.ridCusSvcGr, other.ridCusSvcGr);
    helper.append("ridLocation", this.ridLocation, other.ridLocation);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
