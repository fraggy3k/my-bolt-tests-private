/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.original;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.interfaces.LiqFacBorrDetl;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.utils.BooleanToStringConverter;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * The facility borrower detail table. Aspects of the facility borrower.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@Entity
@Table(name = "VLS_FAC_BORR_DETL")
public class VlsFacBorrDetl
    implements LiqFacBorrDetl,
        Identifiable<String>,
        Serializable,
        EqualsSimpleFieldSupport<VlsFacBorrDetl> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "FBD";

  @Column(name = "FBD_RID_BORR_DETLS", nullable = false, length = 8)
  @Id
  private /*4*/ String ridBorrDetls;

  @Column(name = "FBD_AMT_GLOBL_CURR", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtGloblCurr;

  @Column(name = "FBD_CDE_FRG_WTHHLD", nullable = true, length = 5)
  private /*4*/ String cdeFrgWthhld;

  @Column(name = "FBD_CDE_TAX_EXEMPT", nullable = true, length = 5)
  private /*4*/ String cdeTaxExempt;

  @Column(name = "FBD_DTE_EFFECTIVE", nullable = true)
  private /*4*/ Date dteEffective;

  @Column(name = "FBD_DTE_EXPIRY", nullable = true)
  private /*4*/ Date dteExpiry;

  @Column(name = "FBD_IND_ACTIVE", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indActive;

  @Column(name = "FBD_IND_PRIM_BORR", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indPrimBorr;

  @Column(name = "FBD_PCT_FRG_WTHHLD", nullable = true, length = 15, scale = 14)
  private /*4*/ BigDecimal pctFrgWthhld;

  @Column(name = "FBD_PCT_TAX_EXEMPT", nullable = true, length = 15, scale = 14)
  private /*4*/ BigDecimal pctTaxExempt;

  @Column(name = "FBD_PID_FACILITY", nullable = false, length = 8)
  private /*4*/ String pidFacility;

  @Column(name = "FBD_RID_DEAL_BORR", nullable = false, length = 8)
  private /*4*/ String ridDealBorr;

  @Column(name = "FBD_TSP_REC_CREATE", nullable = false)
  private /*4*/ Date tspRecCreate;

  @Column(name = "FBD_TSP_REC_UPDATE", nullable = false)
  private /*4*/ Date tspRecUpdate;

  @Column(name = "FBD_UID_REC_CREATE", nullable = false, length = 8)
  private /*4*/ String uidRecCreate;

  @Column(name = "FBD_UID_REC_UPDATE", nullable = false, length = 8)
  private /*4*/ String uidRecUpdate;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "FBD_RID_DEAL_BORR", insertable = false, updatable = false)
  private /*3*/ VlsDealBorrower liqDealBorrower;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "FBD_PID_FACILITY", insertable = false, updatable = false)
  private /*3*/ VlsFacility liqFacility;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - the field <code>ridBorrDetls</code>
   */
  @Override
  public String getId() {
    return ridBorrDetls;
  }
  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>ridBorrDetls</code>
   */
  @Override
  public String getOriginId() {
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

  /** The deal borrower table. The borrowers that are associated with a deal. */
  public LiqDealBorrower getLiqDealBorrower() {
    return nullIfNotFound(liqDealBorrower);
  }

  /** The facility table. A credit arrangement established by the bank for the client. */
  public LiqFacility getLiqFacility() {
    return nullIfNotFound(liqFacility);
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
    VlsFacBorrDetl other = (VlsFacBorrDetl) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.ridBorrDetls, other.ridBorrDetls);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(VlsFacBorrDetl other) {
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
