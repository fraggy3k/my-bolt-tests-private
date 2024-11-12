/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.smartdatahub.liq.entity.utils.DomainObject;

/**
 * The facility table. A credit arrangement established by the bank for the client.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public interface LiqFacility extends DomainObject {

  public static final String TABLE_ID = "FAC";

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>pidFacility</code>
   */
  public String getOriginId();

  /** &quot;The global facility current commitment, expressed in the deal currency.&quot; */
  public BigDecimal getAmtDcGlCurr();
  /** &quot;The global facility closing commitment, expressed in the deal currency.&quot; */
  public BigDecimal getAmtDcGlOrig();
  /**
   * The global facility proposed commitment (the amount requested by the borrower from the
   * syndicate prior to closing the deal).
   */
  public BigDecimal getAmtGloPreclo();
  /** The global facility current commitment. */
  public BigDecimal getAmtGloblCurr();
  /** The global facility closing commitment. */
  public BigDecimal getAmtGloblOrig();
  /**
   * The amount of the global facility current commitment that is presently unavailable to the
   * borrower(s).
   */
  public BigDecimal getAmtUnavail();
  /** The amortization method last used by this facility. */
  public String getCdeAmrtUsed();

  /** Trimmed version of {@link #getCdeAmrtUsed()} */
  public String getCdeAmrtUsed_trimmed();
  /** The code identifying the LS2 Client Bank (the purchaser of LS2). */
  public String getCdeBank();

  /** Trimmed version of {@link #getCdeBank()} */
  public String getCdeBank_trimmed();
  /** The Owning Branch of the facility. */
  public String getCdeBranch();

  /** Trimmed version of {@link #getCdeBranch()} */
  public String getCdeBranch_trimmed();
  /** The facility currency. */
  public String getCdeCurrency();

  /** Trimmed version of {@link #getCdeCurrency()} */
  public String getCdeCurrency_trimmed();
  /** The facility type code. */
  public String getCdeFacType();

  /** Trimmed version of {@link #getCdeFacType()} */
  public String getCdeFacType_trimmed();
  /** The facility G/L Class Mapping Code. */
  public String getCdeFlGlMap();

  /** Trimmed version of {@link #getCdeFlGlMap()} */
  public String getCdeFlGlMap_trimmed();
  /** The funded amortization method used after the facility expiry date. */
  public String getCdeFndMthAf();

  /** Trimmed version of {@link #getCdeFndMthAf()} */
  public String getCdeFndMthAf_trimmed();
  /** The funded amortization method used before the facility expiry date. */
  public String getCdeFndMthBf();

  /** Trimmed version of {@link #getCdeFndMthBf()} */
  public String getCdeFndMthBf_trimmed();
  /** */
  public String getCdeLineBusns();

  /** Trimmed version of {@link #getCdeLineBusns()} */
  public String getCdeLineBusns_trimmed();
  /** The performing status code for the facility. */
  public String getCdePerforming();

  /** Trimmed version of {@link #getCdePerforming()} */
  public String getCdePerforming_trimmed();
  /** none */
  public String getCdePfClawbck();

  /** Trimmed version of {@link #getCdePfClawbck()} */
  public String getCdePfClawbck_trimmed();
  /** none */
  public String getCdePfCurRul();

  /** Trimmed version of {@link #getCdePfCurRul()} */
  public String getCdePfCurRul_trimmed();
  /**
   * &quot;The current penalty spread status. Possible values are &quot;&quot;On,&quot;&quot;
   * &quot;&quot;Off,&quot;&quot; and &quot;&quot;Waived&quot;&quot;.&quot;
   */
  public String getCdePnltyStat();

  /** Trimmed version of {@link #getCdePnltyStat()} */
  public String getCdePnltyStat_trimmed();
  /** The facility processing area. */
  public String getCdeProcArea();

  /** Trimmed version of {@link #getCdeProcArea()} */
  public String getCdeProcArea_trimmed();
  /** The remote amortizaton method. */
  public String getCdeRmtAmMth();

  /** Trimmed version of {@link #getCdeRmtAmMth()} */
  public String getCdeRmtAmMth_trimmed();
  /** The facility SIC (Standard Industry Code). */
  public String getCdeSic();

  /** Trimmed version of {@link #getCdeSic()} */
  public String getCdeSic_trimmed();
  /** The SIC Country Code. */
  public String getCdeSicCntry();

  /** Trimmed version of {@link #getCdeSicCntry()} */
  public String getCdeSicCntry_trimmed();
  /** The facility subtype code. */
  public String getCdeSubtype();

  /** Trimmed version of {@link #getCdeSubtype()} */
  public String getCdeSubtype_trimmed();
  /** The unfunded amortization method. */
  public String getCdeUnfAmMth();

  /** Trimmed version of {@link #getCdeUnfAmMth()} */
  public String getCdeUnfAmMth_trimmed();
  /** The date of a Credit Agreement governing this specific facility. */
  public Date getDteAgreement();
  /**
   * The estimated maturity/life of the facility (needed for amortization of discount when the
   * facility does not specify a facility maturity date).
   */
  public Date getDteAmrtMtrty();
  /** The effective date of the facility (prior to which no loans or fees can be released). */
  public Date getDteEffective();
  /** The facility expiry date (after which no new loans or increases can be released). */
  public Date getDteExpiry();
  /**
   * The facility final maturity date (after which no new fees can be released and all interest and
   * fees due from the borrower(s) must be paid in full).
   */
  public Date getDteFinalMat();
  /** The date of the first drawdown released for this facility. */
  public Date getDteFlDrawdwn();
  /** Earliest past due date (of all past due principal and interest) for this facility. */
  public Date getDtePastDue();
  /**
   * &quot;The SBLC Usage Expiration Date, representing the latest date on which an SBLC for this
   * facility can expire.&quot;
   */
  public Date getDteSblcExpry();
  /**
   * &quot;The SBLC &quot;&quot;Last Issuance By&quot;&quot; Date, representing the date after which
   * no new SBLC&apos;s can be issued for this facility.&quot;
   */
  public Date getDteSblcIssue();
  /** The termination date of the facility. */
  public Date getDteTermFac();
  /** Indicates whether or not compensating balances are required. */
  public Boolean getIndCmpnBalR();
  /** Indicator whether a facility cusip is listed or not */
  public Boolean getIndCusipLst();
  /** none */
  public Boolean getIndDontMail();
  /** none */
  public Boolean getIndDontPrnt();
  /** Defines the type of loans to which the penalty spread will apply. */
  public Boolean getIndFloatLoan();
  /** none */
  public Boolean getIndIncXmlbil();
  /** Indicates whether or not the facility has a material adverse change clause. */
  public Boolean getIndMatAdvCh();
  /**
   * Indicates whether or not outstandings can exist under this facility in more than one currency.
   */
  public Boolean getIndMultiCurr();
  /**
   * &quot;Indicates whether or not this is a single draw facility. In a future release, once a
   * portion of a single draw facility commitment is drawn down, the unused portion of the
   * commitment will no longer be available.&quot;
   */
  public Boolean getIndSngleDraw();
  /** The name of the facility. */
  public String getNmeFacility();

  /** Trimmed version of {@link #getNmeFacility()} */
  public String getNmeFacility_trimmed();
  /** The user assigned facility control number used as an alias for the facility. */
  public String getNumFacCntl();

  /** Trimmed version of {@link #getNumFacCntl()} */
  public String getNumFacCntl_trimmed();
  /** The maximum number of currencies in which outstandings can exist at a given time. */
  public Integer getNumMaxCurOt();
  /**
   * The penalty grace period for the facility. Specifies the number of days after the due date on
   * which the penalty spread will become effective.
   */
  public Integer getNumPnsprGrpr();
  /**
   * The number of outside conditions specified in facility pricing. This field is not maintained
   * and should be removed from the database.
   */
  public Integer getNumPrcOutCn();
  /**
   * &quot;The Effective FX Rate for the facility, used to translate the Facility Commitment Amounts
   * into the Deal Currency.&quot;
   */
  public BigDecimal getPctDealFxrte();
  /** The estimated usage percent for this facility. */
  public BigDecimal getPctEstUsage();
  /**
   * &quot;The current penalty spread rate in effect for the facility, representing the additional
   * percentage points to be added as a &quot;&quot;penalty&quot;&quot; to the all-in-rate of a past
   * due loan. Penalty spread is never assessed on past-due fees.&quot;
   */
  public BigDecimal getPctPnltySprd();
  /** The loan repricing FX tolerance rate for facility. */
  public BigDecimal getPctTolFxrte();
  /** The usage threshold percent specified for the facility. */
  public BigDecimal getPctUseThresh();
  /** The Deal RID (Record ID). */
  public String getPidDeal();

  /** Trimmed version of {@link #getPidDeal()} */
  public String getPidDeal_trimmed();
  /** The Facility RID (Record ID). */
  public String getPidFacility();

  /** Trimmed version of {@link #getPidFacility()} */
  public String getPidFacility_trimmed();
  /** contains RID of collateral group each facility belongs to */
  public String getRidCollatDef();

  /** Trimmed version of {@link #getRidCollatDef()} */
  public String getRidCollatDef_trimmed();
  /** Timestamp from when this row was created. */
  public Date getTspRecCreate();
  /** Timestamp from when this row was last updated. */
  public Date getTspRecUpdate();
  /** To store the 9-digit facility cusip number */
  public String getTxtCusipNum();

  /** Trimmed version of {@link #getTxtCusipNum()} */
  public String getTxtCusipNum_trimmed();
  /** To store the 12-digit facility isin number */
  public String getTxtIsinNum();

  /** Trimmed version of {@link #getTxtIsinNum()} */
  public String getTxtIsinNum_trimmed();
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
  /** The ANSI ID assigned by the Loan Pricing Corporation to uniquely identify this facility. */
  public String getXidAnsiId();

  /** Trimmed version of {@link #getXidAnsiId()} */
  public String getXidAnsiId_trimmed();
  /** */
  public LiqCodeBank getLiqCodeBank();
  /** The branch table. */
  public LiqBranch getLiqBranch();
  /**
   * The deal table. A record of a borrowing agreement between the lender and the borrower which may
   * encompass one or more credit facilities.
   */
  public LiqDeal getLiqDeal();
  /**
   * The facililty type table (Please note VLS_FACILITY_TYPE is used and not the code table FAT.html
   * - facility type.
   */
  public LiqFacilityType getLiqFacilityType();
  /**
   * The facility administrator table. Facility administrators handle cashflows associated with
   * facilities and their loans.
   */
  public LiqFacilityAdmin getLiqFacilityAdmin();
  /** The facility borrower detail table. Aspects of the facility borrower. */
  public List<LiqFacBorrDetl> getLiqFacBorrDetls();
  /**
   * The facility commitment transaction table. Transactions which affect a lender's position in a
   * facility.
   */
  public List<LiqFacCommitTrn> getLiqFacCommitTrns();
  /**
   * The facility host bank agregation. Finstra version was almost empty -> filled by best knowledge
   */
  public List<LiqFacHostAgr> getLiqFacHostAgrs();
  /** The outstanding table. Outstanding amounts and dates for loans and letters of credit. */
  public List<LiqOutstanding> getLiqOutstandings();
}
