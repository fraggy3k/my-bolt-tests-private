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
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The branch table.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@ApiModel(value = "Branch", description = "The branch table.")
public class ResponseBranch
    implements Identifiable<String>, Serializable, EqualsSimpleFieldSupport<ResponseBranch> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "BRN";

  @Id
  @ApiModelProperty(value = "The code that uniquely identifies this bank branch.")
  private /*4*/ String cdeBranch;

  @ApiModelProperty(value = "The code for the parent bank of the branch.")
  private /*4*/ String cdeBank;

  @ApiModelProperty(value = "The code for the country of the branch.")
  private /*4*/ String cdeCountry;

  @ApiModelProperty(
      value = "The code describing the functional currency of the branch&apos;s home office.")
  private /*4*/ String cdeFunctCcy;

  @ApiModelProperty(value = "The code for the General Ledger of the branch.")
  private /*4*/ String cdeGl;

  @ApiModelProperty(
      value = "The code describing the local currency (the currency of a local branch).")
  private /*4*/ String cdeLocalCcy;

  @ApiModelProperty(value = "The code for the time region of the branch.")
  private /*4*/ String cdeTmeRegion;

  @ApiModelProperty(value = "The customer ID associated with this branch.")
  private /*4*/ String cidCustId;

  @ApiModelProperty(value = "User entered description of the branch.")
  private /*4*/ String dscBranch;

  @ApiModelProperty(value = "SDH: Indicator weather branch (or central service unit) is active.")
  private /*4*/ Boolean indActive;

  @ApiModelProperty(
      value =
          "Indicator which specifies wether branch is a central branch (or central service unit).")
  private /*4*/ Boolean indCentralSc;

  @ApiModelProperty(
      value = "Indicator which specifies wether match funded cost of funds accounting is enabled.")
  private /*4*/ Boolean indMfcofAcct;

  @ApiModelProperty(
      value = "Provides a default value for trans that have a borrower net indicator.")
  private /*4*/ Boolean indNetBorr;

  @ApiModelProperty(value = "Indicator which determines if cashflow should be netted or not.")
  private /*4*/ Boolean indNetCashfl;

  @ApiModelProperty(value = "Two digits (01-12) representing the month that the fiscal year ends.")
  private /*4*/ Integer numFiscMm;

  @ApiModelProperty(value = "Timestamp from when this row was created.")
  private /*4*/ Date tspRecCreate;

  @ApiModelProperty(value = "Timestamp from when this row was last updated.")
  private /*4*/ Date tspRecUpdate;

  @ApiModelProperty(
      value =
          "User ID that created this row.  This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID.")
  private /*4*/ String uidRecCreate;

  @ApiModelProperty(
      value =
          "User ID that last updated this row.  This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID.")
  private /*4*/ String uidRecUpdate;

  @ApiModelProperty(
      value =
          "The customer table.  Enterprises which conducts or may be interested in conducting commercial lending business with the bank is considered a customer.")
  private /*3*/ ResponseCustomer responseCustomer;

  private /*4*/ String snapshotId;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - the field <code>cdeBranch</code>
   */
  @Override
  public String getId() {
    return cdeBranch;
  }
  /** The code that uniquely identifies this bank branch. */
  public String getCdeBranch() {
    return cdeBranch;
  }

  /** Trimmed version of {@link #getCdeBranch()} */
  public String getCdeBranch_trimmed() {
    return (cdeBranch == null) ? null : cdeBranch.trim();
  }

  /** The code for the parent bank of the branch. */
  public String getCdeBank() {
    return cdeBank;
  }

  /** Trimmed version of {@link #getCdeBank()} */
  public String getCdeBank_trimmed() {
    return (cdeBank == null) ? null : cdeBank.trim();
  }

  /** The code for the country of the branch. */
  public String getCdeCountry() {
    return cdeCountry;
  }

  /** Trimmed version of {@link #getCdeCountry()} */
  public String getCdeCountry_trimmed() {
    return (cdeCountry == null) ? null : cdeCountry.trim();
  }

  /** The code describing the functional currency of the branch&apos;s home office. */
  public String getCdeFunctCcy() {
    return cdeFunctCcy;
  }

  /** Trimmed version of {@link #getCdeFunctCcy()} */
  public String getCdeFunctCcy_trimmed() {
    return (cdeFunctCcy == null) ? null : cdeFunctCcy.trim();
  }

  /** The code for the General Ledger of the branch. */
  public String getCdeGl() {
    return cdeGl;
  }

  /** Trimmed version of {@link #getCdeGl()} */
  public String getCdeGl_trimmed() {
    return (cdeGl == null) ? null : cdeGl.trim();
  }

  /** The code describing the local currency (the currency of a local branch). */
  public String getCdeLocalCcy() {
    return cdeLocalCcy;
  }

  /** Trimmed version of {@link #getCdeLocalCcy()} */
  public String getCdeLocalCcy_trimmed() {
    return (cdeLocalCcy == null) ? null : cdeLocalCcy.trim();
  }

  /** The code for the time region of the branch. */
  public String getCdeTmeRegion() {
    return cdeTmeRegion;
  }

  /** Trimmed version of {@link #getCdeTmeRegion()} */
  public String getCdeTmeRegion_trimmed() {
    return (cdeTmeRegion == null) ? null : cdeTmeRegion.trim();
  }

  /** The customer ID associated with this branch. */
  public String getCidCustId() {
    return cidCustId;
  }

  /** Trimmed version of {@link #getCidCustId()} */
  public String getCidCustId_trimmed() {
    return (cidCustId == null) ? null : cidCustId.trim();
  }

  /** User entered description of the branch. */
  public String getDscBranch() {
    return dscBranch;
  }

  /** Trimmed version of {@link #getDscBranch()} */
  public String getDscBranch_trimmed() {
    return (dscBranch == null) ? null : dscBranch.trim();
  }

  /** SDH: Indicator weather branch (or central service unit) is active. */
  public Boolean getIndActive() {
    return indActive;
  }

  /** Indicator which specifies wether branch is a central branch (or central service unit). */
  public Boolean getIndCentralSc() {
    return indCentralSc;
  }

  /** Indicator which specifies wether match funded cost of funds accounting is enabled. */
  public Boolean getIndMfcofAcct() {
    return indMfcofAcct;
  }

  /** Provides a default value for trans that have a borrower net indicator. */
  public Boolean getIndNetBorr() {
    return indNetBorr;
  }

  /** Indicator which determines if cashflow should be netted or not. */
  public Boolean getIndNetCashfl() {
    return indNetCashfl;
  }

  /** Two digits (01-12) representing the month that the fiscal year ends. */
  public Integer getNumFiscMm() {
    return numFiscMm;
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
  public ResponseCustomer getResponseCustomer() {
    return nullIfNotFound(responseCustomer);
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
  /** The code that uniquely identifies this bank branch. */
  public void setCdeBranch(String cdeBranch) {
    this.cdeBranch = cdeBranch;
  }

  /** The code for the parent bank of the branch. */
  public void setCdeBank(String cdeBank) {
    this.cdeBank = cdeBank;
  }

  /** The code for the country of the branch. */
  public void setCdeCountry(String cdeCountry) {
    this.cdeCountry = cdeCountry;
  }

  /** The code describing the functional currency of the branch&apos;s home office. */
  public void setCdeFunctCcy(String cdeFunctCcy) {
    this.cdeFunctCcy = cdeFunctCcy;
  }

  /** The code for the General Ledger of the branch. */
  public void setCdeGl(String cdeGl) {
    this.cdeGl = cdeGl;
  }

  /** The code describing the local currency (the currency of a local branch). */
  public void setCdeLocalCcy(String cdeLocalCcy) {
    this.cdeLocalCcy = cdeLocalCcy;
  }

  /** The code for the time region of the branch. */
  public void setCdeTmeRegion(String cdeTmeRegion) {
    this.cdeTmeRegion = cdeTmeRegion;
  }

  /** The customer ID associated with this branch. */
  public void setCidCustId(String cidCustId) {
    this.cidCustId = cidCustId;
  }

  /** User entered description of the branch. */
  public void setDscBranch(String dscBranch) {
    this.dscBranch = dscBranch;
  }

  /** SDH: Indicator weather branch (or central service unit) is active. */
  public void setIndActive(Boolean indActive) {
    this.indActive = indActive;
  }

  /** Indicator which specifies wether branch is a central branch (or central service unit). */
  public void setIndCentralSc(Boolean indCentralSc) {
    this.indCentralSc = indCentralSc;
  }

  /** Indicator which specifies wether match funded cost of funds accounting is enabled. */
  public void setIndMfcofAcct(Boolean indMfcofAcct) {
    this.indMfcofAcct = indMfcofAcct;
  }

  /** Provides a default value for trans that have a borrower net indicator. */
  public void setIndNetBorr(Boolean indNetBorr) {
    this.indNetBorr = indNetBorr;
  }

  /** Indicator which determines if cashflow should be netted or not. */
  public void setIndNetCashfl(Boolean indNetCashfl) {
    this.indNetCashfl = indNetCashfl;
  }

  /** Two digits (01-12) representing the month that the fiscal year ends. */
  public void setNumFiscMm(Integer numFiscMm) {
    this.numFiscMm = numFiscMm;
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
  public void setResponseCustomer(ResponseCustomer responseCustomer) {
    this.responseCustomer = responseCustomer;
  }

  /** */
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(cdeBranch);
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
    ResponseBranch other = (ResponseBranch) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cdeBranch, other.cdeBranch);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(ResponseBranch other) {
    CompareHelper helper = new CompareHelper();
    helper.append("cdeBranch", this.cdeBranch, other.cdeBranch);
    helper.append("cdeBank", this.cdeBank, other.cdeBank);
    helper.append("cdeCountry", this.cdeCountry, other.cdeCountry);
    helper.append("cdeFunctCcy", this.cdeFunctCcy, other.cdeFunctCcy);
    helper.append("cdeGl", this.cdeGl, other.cdeGl);
    helper.append("cdeLocalCcy", this.cdeLocalCcy, other.cdeLocalCcy);
    helper.append("cdeTmeRegion", this.cdeTmeRegion, other.cdeTmeRegion);
    helper.append("cidCustId", this.cidCustId, other.cidCustId);
    helper.append("dscBranch", this.dscBranch, other.dscBranch);
    helper.append("indActive", this.indActive, other.indActive);
    helper.append("indCentralSc", this.indCentralSc, other.indCentralSc);
    helper.append("indMfcofAcct", this.indMfcofAcct, other.indMfcofAcct);
    helper.append("indNetBorr", this.indNetBorr, other.indNetBorr);
    helper.append("indNetCashfl", this.indNetCashfl, other.indNetCashfl);
    helper.append("numFiscMm", this.numFiscMm, other.numFiscMm);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
