/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import java.math.BigDecimal;
import java.util.Date;

import org.smartdatahub.liq.entity.utils.DomainObject;

/**
 * The facility borrower detail table. Aspects of the facility borrower.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public interface LiqFacBorrDetl extends DomainObject {

  public static final String TABLE_ID = "FBD";

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>ridBorrDetls</code>
   */
  public String getOriginId();

  /**
   * The borrower global limit (the maximum amount that can be borrowed by this borrower in this
   * facility).
   */
  public BigDecimal getAmtGloblCurr();
  /** The foreign tax withholding category that applies to this borrower in this facility. */
  public String getCdeFrgWthhld();

  /** Trimmed version of {@link #getCdeFrgWthhld()} */
  public String getCdeFrgWthhld_trimmed();
  /**
   * &quot;If this borrower in this facility has been declared &quot;&quot;Tax Exempt,&quot;&quot;
   * indicates the Tax Exempt Category.&quot;
   */
  public String getCdeTaxExempt();

  /** Trimmed version of {@link #getCdeTaxExempt()} */
  public String getCdeTaxExempt_trimmed();
  /**
   * The borrower effective date (prior to which there can be no outstandings for this borrower in
   * this facility).
   */
  public Date getDteEffective();
  /** The last date on which outstandings can be released for this borrower in this facility. */
  public Date getDteExpiry();
  /** Iindicates whether this is an active borrower in the facility. */
  public Boolean getIndActive();
  /** Indicates whether or not the borrower is the primary borrower in this facility. */
  public Boolean getIndPrimBorr();
  /**
   * &quot;If foreign tax withholding applies to this borrower in this facility, indicates the
   * percentage of foreign tax withholding.&quot;
   */
  public BigDecimal getPctFrgWthhld();
  /**
   * &quot;If this borrower in this facility has been declared &quot;&quot;Tax Exempt,&quot;&quot;
   * indicates the Tax Exempt Category.&quot;
   */
  public BigDecimal getPctTaxExempt();
  /** The Record ID (RID) for the facility. */
  public String getPidFacility();

  /** Trimmed version of {@link #getPidFacility()} */
  public String getPidFacility_trimmed();
  /** The Record ID (RID) for the facility borrower details. */
  public String getRidBorrDetls();

  /** Trimmed version of {@link #getRidBorrDetls()} */
  public String getRidBorrDetls_trimmed();
  /** The Record ID (RID) for the deal borrower. */
  public String getRidDealBorr();

  /** Trimmed version of {@link #getRidDealBorr()} */
  public String getRidDealBorr_trimmed();
  /** Timestamp from when this row was created. */
  public Date getTspRecCreate();
  /** Timestamp from when this row was last updated. */
  public Date getTspRecUpdate();
  /** User ID that created this row. This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID. */
  public String getUidRecCreate();

  /** Trimmed version of {@link #getUidRecCreate()} */
  public String getUidRecCreate_trimmed();
  /**
   * User ID that last updated this row. This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID.
   */
  public String getUidRecUpdate();

  /** Trimmed version of {@link #getUidRecUpdate()} */
  public String getUidRecUpdate_trimmed();
  /** The deal borrower table. The borrowers that are associated with a deal. */
  public LiqDealBorrower getLiqDealBorrower();
  /** The facility table. A credit arrangement established by the bank for the client. */
  public LiqFacility getLiqFacility();
}
