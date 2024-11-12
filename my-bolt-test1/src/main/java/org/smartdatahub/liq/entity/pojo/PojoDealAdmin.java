/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

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
public class PojoDealAdmin
    implements LiqDealAdmin,
        Identifiable<String>,
        Serializable,
        EqualsSimpleFieldSupport<PojoDealAdmin> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "DAD";

  @Id private /*4*/ String pidDeal;
  private /*4*/ String cidCustId;
  private /*4*/ String ridFaxGroup;
  private /*4*/ String ridLocation;
  private /*4*/ Date tspRecCreate;
  private /*4*/ Date tspRecUpdate;
  private /*4*/ String uidRecCreate;
  private /*4*/ String uidRecUpdate;
  private /*3*/ PojoCustomer liqCustomer;
  private /*3*/ PojoDeal liqDeal;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - the field <code>pidDeal</code>
   */
  @Override
  public String getId() {
    return pidDeal;
  }
  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>pidDeal</code>
   */
  @Override
  public String getOriginId() {
    return pidDeal;
  }
  /** The Record ID (RID) for the deal. */
  public String getPidDeal() {
    return pidDeal;
  }

  /** Trimmed version of {@link #getPidDeal()} */
  public String getPidDeal_trimmed() {
    return (pidDeal == null) ? null : pidDeal.trim();
  }

  /** The Record ID (RID) for the customer chosen as the agent for the deal. */
  public String getCidCustId() {
    return cidCustId;
  }

  /** Trimmed version of {@link #getCidCustId()} */
  public String getCidCustId_trimmed() {
    return (cidCustId == null) ? null : cidCustId.trim();
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
  /** The Record ID (RID) for the deal. */
  public void setPidDeal(String pidDeal) {
    this.pidDeal = pidDeal;
  }

  /** The Record ID (RID) for the customer chosen as the agent for the deal. */
  public void setCidCustId(String cidCustId) {
    this.cidCustId = cidCustId;
  }

  /** The Record ID (RID) for the agent&apos;s servicing group. */
  public void setRidFaxGroup(String ridFaxGroup) {
    this.ridFaxGroup = ridFaxGroup;
  }

  /** The Record ID (RID) for the agent&apos;s location. */
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

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public void setLiqCustomer(PojoCustomer liqCustomer) {
    this.liqCustomer = liqCustomer;
  }

  /**
   * The deal table. A record of a borrowing agreement between the lender and the borrower which may
   * encompass one or more credit facilities.
   */
  public void setLiqDeal(PojoDeal liqDeal) {
    this.liqDeal = liqDeal;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(pidDeal);
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
    PojoDealAdmin other = (PojoDealAdmin) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.pidDeal, other.pidDeal);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(PojoDealAdmin other) {
    CompareHelper helper = new CompareHelper();
    helper.append("pidDeal", this.pidDeal, other.pidDeal);
    helper.append("cidCustId", this.cidCustId, other.cidCustId);
    helper.append("ridFaxGroup", this.ridFaxGroup, other.ridFaxGroup);
    helper.append("ridLocation", this.ridLocation, other.ridLocation);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
