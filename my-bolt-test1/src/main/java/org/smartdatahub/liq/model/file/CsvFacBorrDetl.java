/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.model.file;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * SELECT FBD_RID_BORR_DETLS, FBD_AMT_GLOBL_CURR, FBD_CDE_FRG_WTHHLD, FBD_CDE_TAX_EXEMPT,
 * FBD_DTE_EFFECTIVE, FBD_DTE_EXPIRY, FBD_IND_ACTIVE, FBD_IND_PRIM_BORR, FBD_PCT_FRG_WTHHLD,
 * FBD_PCT_TAX_EXEMPT, FBD_PID_FACILITY, FBD_RID_DEAL_BORR, FBD_TSP_REC_CREATE, FBD_TSP_REC_UPDATE,
 * FBD_UID_REC_CREATE, FBD_UID_REC_UPDATE, FROM blablabla
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public class CsvFacBorrDetl
    implements Identifiable<String>, Serializable, EqualsSimpleFieldSupport<CsvFacBorrDetl> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "FBD";

  @Id private /*4*/ String ridBorrDetls;
  private /*4*/ BigDecimal amtGloblCurr;
  private /*4*/ String cdeFrgWthhld;
  private /*4*/ String cdeTaxExempt;
  private /*4*/ Date dteEffective;
  private /*4*/ Date dteExpiry;
  private /*4*/ Boolean indActive;
  private /*4*/ Boolean indPrimBorr;
  private /*4*/ BigDecimal pctFrgWthhld;
  private /*4*/ BigDecimal pctTaxExempt;
  private /*4*/ String pidFacility;
  private /*4*/ String ridDealBorr;
  private /*4*/ Date tspRecCreate;
  private /*4*/ Date tspRecUpdate;
  private /*4*/ String uidRecCreate;
  private /*4*/ String uidRecUpdate;
  private /*4*/ String snapshotId;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - the field <code>ridBorrDetls</code>
   */
  @Override
  public String getId() {
    return ridBorrDetls;
  }
  /** The Record ID (RID) for the facility borrower details. */
  public String getRidBorrDetls() {
    return ridBorrDetls;
  }

  /** Trimmed version of {@link #getRidBorrDetls()} */
  public String getRidBorrDetls_trimmed() {
    return (ridBorrDetls == null) ? null : ridBorrDetls.trim();
  }

  /**
   * The borrower global limit (the maximum amount that can be borrowed by this borrower in this
   * facility).
   */
  public BigDecimal getAmtGloblCurr() {
    return amtGloblCurr;
  }

  /** The foreign tax withholding category that applies to this borrower in this facility. */
  public String getCdeFrgWthhld() {
    return cdeFrgWthhld;
  }

  /** Trimmed version of {@link #getCdeFrgWthhld()} */
  public String getCdeFrgWthhld_trimmed() {
    return (cdeFrgWthhld == null) ? null : cdeFrgWthhld.trim();
  }

  /**
   * &quot;If this borrower in this facility has been declared &quot;&quot;Tax Exempt,&quot;&quot;
   * indicates the Tax Exempt Category.&quot;
   */
  public String getCdeTaxExempt() {
    return cdeTaxExempt;
  }

  /** Trimmed version of {@link #getCdeTaxExempt()} */
  public String getCdeTaxExempt_trimmed() {
    return (cdeTaxExempt == null) ? null : cdeTaxExempt.trim();
  }

  /**
   * The borrower effective date (prior to which there can be no outstandings for this borrower in
   * this facility).
   */
  public Date getDteEffective() {
    return dteEffective;
  }

  /** The last date on which outstandings can be released for this borrower in this facility. */
  public Date getDteExpiry() {
    return dteExpiry;
  }

  /** Iindicates whether this is an active borrower in the facility. */
  public Boolean getIndActive() {
    return indActive;
  }

  /** Indicates whether or not the borrower is the primary borrower in this facility. */
  public Boolean getIndPrimBorr() {
    return indPrimBorr;
  }

  /**
   * &quot;If foreign tax withholding applies to this borrower in this facility, indicates the
   * percentage of foreign tax withholding.&quot;
   */
  public BigDecimal getPctFrgWthhld() {
    return pctFrgWthhld;
  }

  /**
   * &quot;If this borrower in this facility has been declared &quot;&quot;Tax Exempt,&quot;&quot;
   * indicates the Tax Exempt Category.&quot;
   */
  public BigDecimal getPctTaxExempt() {
    return pctTaxExempt;
  }

  /** The Record ID (RID) for the facility. */
  public String getPidFacility() {
    return pidFacility;
  }

  /** Trimmed version of {@link #getPidFacility()} */
  public String getPidFacility_trimmed() {
    return (pidFacility == null) ? null : pidFacility.trim();
  }

  /** The Record ID (RID) for the deal borrower. */
  public String getRidDealBorr() {
    return ridDealBorr;
  }

  /** Trimmed version of {@link #getRidDealBorr()} */
  public String getRidDealBorr_trimmed() {
    return (ridDealBorr == null) ? null : ridDealBorr.trim();
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
  /** The Record ID (RID) for the facility borrower details. */
  public void setRidBorrDetls(String ridBorrDetls) {
    this.ridBorrDetls = ridBorrDetls;
  }

  /**
   * The borrower global limit (the maximum amount that can be borrowed by this borrower in this
   * facility).
   */
  public void setAmtGloblCurr(BigDecimal amtGloblCurr) {
    this.amtGloblCurr = amtGloblCurr;
  }

  /** The foreign tax withholding category that applies to this borrower in this facility. */
  public void setCdeFrgWthhld(String cdeFrgWthhld) {
    this.cdeFrgWthhld = cdeFrgWthhld;
  }

  /**
   * &quot;If this borrower in this facility has been declared &quot;&quot;Tax Exempt,&quot;&quot;
   * indicates the Tax Exempt Category.&quot;
   */
  public void setCdeTaxExempt(String cdeTaxExempt) {
    this.cdeTaxExempt = cdeTaxExempt;
  }

  /**
   * The borrower effective date (prior to which there can be no outstandings for this borrower in
   * this facility).
   */
  public void setDteEffective(Date dteEffective) {
    this.dteEffective = dteEffective;
  }

  /** The last date on which outstandings can be released for this borrower in this facility. */
  public void setDteExpiry(Date dteExpiry) {
    this.dteExpiry = dteExpiry;
  }

  /** Iindicates whether this is an active borrower in the facility. */
  public void setIndActive(Boolean indActive) {
    this.indActive = indActive;
  }

  /** Indicates whether or not the borrower is the primary borrower in this facility. */
  public void setIndPrimBorr(Boolean indPrimBorr) {
    this.indPrimBorr = indPrimBorr;
  }

  /**
   * &quot;If foreign tax withholding applies to this borrower in this facility, indicates the
   * percentage of foreign tax withholding.&quot;
   */
  public void setPctFrgWthhld(BigDecimal pctFrgWthhld) {
    this.pctFrgWthhld = pctFrgWthhld;
  }

  /**
   * &quot;If this borrower in this facility has been declared &quot;&quot;Tax Exempt,&quot;&quot;
   * indicates the Tax Exempt Category.&quot;
   */
  public void setPctTaxExempt(BigDecimal pctTaxExempt) {
    this.pctTaxExempt = pctTaxExempt;
  }

  /** The Record ID (RID) for the facility. */
  public void setPidFacility(String pidFacility) {
    this.pidFacility = pidFacility;
  }

  /** The Record ID (RID) for the deal borrower. */
  public void setRidDealBorr(String ridDealBorr) {
    this.ridDealBorr = ridDealBorr;
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
    builder.append(ridBorrDetls);
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
    CsvFacBorrDetl other = (CsvFacBorrDetl) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.ridBorrDetls, other.ridBorrDetls);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(CsvFacBorrDetl other) {
    CompareHelper helper = new CompareHelper();
    helper.append("ridBorrDetls", this.ridBorrDetls, other.ridBorrDetls);
    helper.append("amtGloblCurr", this.amtGloblCurr, other.amtGloblCurr);
    helper.append("cdeFrgWthhld", this.cdeFrgWthhld, other.cdeFrgWthhld);
    helper.append("cdeTaxExempt", this.cdeTaxExempt, other.cdeTaxExempt);
    helper.append("dteEffective", this.dteEffective, other.dteEffective);
    helper.append("dteExpiry", this.dteExpiry, other.dteExpiry);
    helper.append("indActive", this.indActive, other.indActive);
    helper.append("indPrimBorr", this.indPrimBorr, other.indPrimBorr);
    helper.append("pctFrgWthhld", this.pctFrgWthhld, other.pctFrgWthhld);
    helper.append("pctTaxExempt", this.pctTaxExempt, other.pctTaxExempt);
    helper.append("pidFacility", this.pidFacility, other.pidFacility);
    helper.append("ridDealBorr", this.ridDealBorr, other.ridDealBorr);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
