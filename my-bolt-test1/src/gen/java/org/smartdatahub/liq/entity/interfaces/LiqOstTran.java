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
 * The outstanding transaction table. Transactions directly related to outstandings.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public interface LiqOstTran extends DomainObject {

  public static final String TABLE_ID = "OTR";

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>ridOstTran</code>
   */
  public String getOriginId();

  /** The actual amount of the outstanding transaction. */
  public BigDecimal getAmtActual();
  /** The frozen funding amount. */
  public BigDecimal getAmtFundFrozn();
  /** The global amount of the outstanding at the time of the transaction. */
  public BigDecimal getAmtNewRelse();
  /** */
  public BigDecimal getAmtPremium();
  /** The requested amount of the outstanding transaction. */
  public BigDecimal getAmtRequested();
  /** the schedule balance amount for accruals */
  public BigDecimal getAmtSchedBal();
  /** The code for the accrual frequency. */
  public String getCdeAccrFreq();

  /** Trimmed version of {@link #getCdeAccrFreq()} */
  public String getCdeAccrFreq_trimmed();
  /** The code for the group type. */
  public String getCdeGroupType();

  /** Trimmed version of {@link #getCdeGroupType()} */
  public String getCdeGroupType_trimmed();
  /** The loan purpose. */
  public String getCdeLoanPurp();

  /** Trimmed version of {@link #getCdeLoanPurp()} */
  public String getCdeLoanPurp_trimmed();
  /** The code for the object state category. */
  public String getCdeObStCtg();

  /** Trimmed version of {@link #getCdeObStCtg()} */
  public String getCdeObStCtg_trimmed();
  /** The code for the object state. */
  public String getCdeObjState();

  /** Trimmed version of {@link #getCdeObjState()} */
  public String getCdeObjState_trimmed();
  /** The processing area. */
  public String getCdeProcArea();

  /** Trimmed version of {@link #getCdeProcArea()} */
  public String getCdeProcArea_trimmed();
  /** The repricing frequency. */
  public String getCdeReprFreq();

  /** Trimmed version of {@link #getCdeReprFreq()} */
  public String getCdeReprFreq_trimmed();
  /** The risk type. */
  public String getCdeRiskType();

  /** Trimmed version of {@link #getCdeRiskType()} */
  public String getCdeRiskType_trimmed();
  /** */
  public String getCdeTrnsPurp();

  /** Trimmed version of {@link #getCdeTrnsPurp()} */
  public String getCdeTrnsPurp_trimmed();
  /** The type of transaction. */
  public String getCdeType();

  /** Trimmed version of {@link #getCdeType()} */
  public String getCdeType_trimmed();
  /** The effective date of the outstanding transaction. */
  public Date getDteEffective();
  /** The release date of the outstanding transaction. */
  public Date getDteRelease();
  /** The repricing date of the outstanding transaction. */
  public Date getDteRepricing();
  /**
   * &quot;This indicator is set to true when upon release of this OutstandingTransaction, a
   * FacilityCommitmentDecrease will be created and released as well. It is nullable, because the
   * option is valid only on certain OutstandingTransactions.&quot;
   */
  public Boolean getIndAutoRduce();
  /** Indicates whether or not the outstanding transaction is subject to auto-release. */
  public Boolean getIndAutoRelse();
  /** Indicates whether this transaction is a creating transaction or an amending transaction. */
  public Boolean getIndCreateTrn();
  /** Indicates whether or not the outstanding will be initially on Non-Accrual. */
  public Boolean getIndNonAccr();
  /** Indicates whether or not payment from borrower. */
  public Boolean getIndPmtFrBor();
  /** The Record ID (RID) for the sublimit. */
  public String getPidSublimit();

  /** Trimmed version of {@link #getPidSublimit()} */
  public String getPidSublimit_trimmed();
  /** The Record ID (RID) for the commitment transaction. */
  public String getRidCommitTrn();

  /** Trimmed version of {@link #getRidCommitTrn()} */
  public String getRidCommitTrn_trimmed();
  /** The Record ID (RID) for the group transaction. */
  public String getRidGroupTran();

  /** Trimmed version of {@link #getRidGroupTran()} */
  public String getRidGroupTran_trimmed();
  /** The Record ID (RID) for the link transaction. */
  public String getRidLinkTrn();

  /** Trimmed version of {@link #getRidLinkTrn()} */
  public String getRidLinkTrn_trimmed();
  /** */
  public String getRidOrigOst();

  /** Trimmed version of {@link #getRidOrigOst()} */
  public String getRidOrigOst_trimmed();
  /** The Record ID (RID) that uniquely identifies this outstanding transaction. */
  public String getRidOstTran();

  /** Trimmed version of {@link #getRidOstTran()} */
  public String getRidOstTran_trimmed();
  /** The Record ID (RID) for the outstanding. */
  public String getRidOutstandng();

  /** Trimmed version of {@link #getRidOutstandng()} */
  public String getRidOutstandng_trimmed();
  /** Timestamp from when this row was created. */
  public Date getTspRecCreate();
  /** Timestamp from when this row was last updated. */
  public Date getTspRecUpdate();
  /** The User ID of the processor. */
  public String getUidProcessor();

  /** Trimmed version of {@link #getUidProcessor()} */
  public String getUidProcessor_trimmed();
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
  /**
   * The facility commitment transaction table. Transactions which affect a lender's position in a
   * facility.
   */
  public LiqFacCommitTrn getLiqFacCommitTrnCommitTrn();
  /** The outstanding table. Outstanding amounts and dates for loans and letters of credit. */
  public LiqOutstanding getLiqOriginalOutstanding();
  /** The outstanding table. Outstanding amounts and dates for loans and letters of credit. */
  public LiqOutstanding getLiqOutstanding();
  /**
   * The facility commitment transaction table. Transactions which affect a lender's position in a
   * facility.
   */
  public List<LiqFacCommitTrn> getLiqFacCommitTrns();
}
