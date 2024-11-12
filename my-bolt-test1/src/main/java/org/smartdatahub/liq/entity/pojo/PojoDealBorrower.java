/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.interfaces.LiqFacBorrDetl;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * The deal borrower table. The borrowers that are associated with a deal.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public class PojoDealBorrower
    implements LiqDealBorrower,
        Identifiable<String>,
        Serializable,
        EqualsSimpleFieldSupport<PojoDealBorrower> {

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
  private /*3*/ PojoCustomer liqCustomer;
  private /*3*/ PojoDeal liqDeal;
  private List</*1*/ LiqFacBorrDetl> liqFacBorrDetls;

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
   * Special Getter for the origin ID
   *
   * @returns - the field <code>ridDealBorr</code>
   */
  @Override
  public String getOriginId() {
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

  /** The facility borrower detail table. Aspects of the facility borrower. */
  public List<LiqFacBorrDetl> getLiqFacBorrDetls() {
    return nullIfNotFound(liqFacBorrDetls);
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

  /** The facility borrower detail table. Aspects of the facility borrower. */
  public void addLiqFacBorrDetls(List<PojoFacBorrDetl> liqFacBorrDetls) {
    if (this.liqFacBorrDetls == null) {
      this.liqFacBorrDetls = new ArrayList<>(liqFacBorrDetls.size());
    }
    this.liqFacBorrDetls.addAll(liqFacBorrDetls);
    liqFacBorrDetls.forEach(e -> e.setLiqDealBorrower(this));
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
    PojoDealBorrower other = (PojoDealBorrower) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.ridDealBorr, other.ridDealBorr);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(PojoDealBorrower other) {
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
