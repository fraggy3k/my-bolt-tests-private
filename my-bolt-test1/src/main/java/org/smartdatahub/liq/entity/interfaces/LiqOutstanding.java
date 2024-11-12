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
 * The outstanding table. Outstanding amounts and dates for loans and letters of credit.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public interface LiqOutstanding extends DomainObject {

  public static final String TABLE_ID = "OST";

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>ridOutstandng</code>
   */
  public String getOriginId();

  /** The host bank gross share of the global current outstandings. */
  public BigDecimal getAmtBankGross();
  /** The host bank net share of the global current outstandings. */
  public BigDecimal getAmtBankNet();
  /** The global current outstandings. */
  public BigDecimal getAmtCurrent();
  /**
   * &quot;The host bank gross share of the global current outstandings, expressed in the facility
   * currency.&quot;
   */
  public BigDecimal getAmtFcBnkGrs();
  /**
   * &quot;The host bank net share of the global current outstandings, expressed in the facility
   * currency.&quot;
   */
  public BigDecimal getAmtFcBnkNet();
  /** &quot;The global current outstandings, expressed in the facility currency.&quot; */
  public BigDecimal getAmtFcCurrent();
  /**
   * Defines the threshold amount for the loan?s past due calculation, above which the loan is
   * eligible to be automatically placed in Non Accrual Status.
   */
  public BigDecimal getAmtNacrTlrnc();
  /** The global amount of the outstanding at the time it became active. */
  public BigDecimal getAmtOriginal();
  /** the schedule balance amount for accruals */
  public BigDecimal getAmtSchedBal();
  /** The code for the accrual period (or length) of the cycle. */
  public String getCdeAcrPeriod();

  /** Trimmed version of {@link #getCdeAcrPeriod()} */
  public String getCdeAcrPeriod_trimmed();
  /**
   * For monthly accrual frequencies, will determine if last day of month should be used or another
   * day that is the last day of the month in some months (i.e 30).
   */
  public String getCdeActAcrRl();

  /** Trimmed version of {@link #getCdeActAcrRl()} */
  public String getCdeActAcrRl_trimmed();
  /** none */
  public String getCdeAnvdteEom();

  /** Trimmed version of {@link #getCdeAnvdteEom()} */
  public String getCdeAnvdteEom_trimmed();
  /** The currency code for this outstanding. */
  public String getCdeCurrency();

  /** Trimmed version of {@link #getCdeCurrency()} */
  public String getCdeCurrency_trimmed();
  /** none */
  public String getCdeDecPrecn();

  /** Trimmed version of {@link #getCdeDecPrecn()} */
  public String getCdeDecPrecn_trimmed();
  /** none */
  public String getCdeDecRound();

  /** Trimmed version of {@link #getCdeDecRound()} */
  public String getCdeDecRound_trimmed();
  /**
   * The code representing the rule used when calculating an outstanding&apos;s accrual cycle end
   * date.
   */
  public String getCdeEndteRule();

  /** Trimmed version of {@link #getCdeEndteRule()} */
  public String getCdeEndteRule_trimmed();
  /**
   * &quot;The length of the period by which an SBLC should be extended, if automatic extension
   * applies (Number of Periods X Period Length = Extension Period).&quot;
   */
  public String getCdeExtension();

  /** Trimmed version of {@link #getCdeExtension()} */
  public String getCdeExtension_trimmed();
  /** none */
  public String getCdeFracIrate();

  /** Trimmed version of {@link #getCdeFracIrate()} */
  public String getCdeFracIrate_trimmed();
  /** none */
  public String getCdeFracRound();

  /** Trimmed version of {@link #getCdeFracRound()} */
  public String getCdeFracRound_trimmed();
  /** The foreign withholding code. */
  public String getCdeFrgWthhld();

  /** Trimmed version of {@link #getCdeFrgWthhld()} */
  public String getCdeFrgWthhld_trimmed();
  /** The G/L Class Mapping Code for the outstanding. */
  public String getCdeGlClass();

  /** Trimmed version of {@link #getCdeGlClass()} */
  public String getCdeGlClass_trimmed();
  /** The purpose code for this outstanding. */
  public String getCdeLoanPurp();

  /** Trimmed version of {@link #getCdeLoanPurp()} */
  public String getCdeLoanPurp_trimmed();
  /**
   * &quot;The code that describes the life cycle category (e.g. potential, actual, inactive).&quot;
   */
  public String getCdeObStCtg();

  /** Trimmed version of {@link #getCdeObStCtg()} */
  public String getCdeObStCtg_trimmed();
  /**
   * &quot;The code that describes the state of the object during its life cycle (e.g. pending,
   * awaiting approval).&quot;
   */
  public String getCdeObjState();

  /** Trimmed version of {@link #getCdeObjState()} */
  public String getCdeObjState_trimmed();
  /** The code for the outstanding type. */
  public String getCdeOutstdTyp();

  /** Trimmed version of {@link #getCdeOutstdTyp()} */
  public String getCdeOutstdTyp_trimmed();
  /** Overage rule to be used for overpayment from borrower */
  public String getCdeOverageRl();

  /** Trimmed version of {@link #getCdeOverageRl()} */
  public String getCdeOverageRl_trimmed();
  /** The performing status code for the outstanding. */
  public String getCdePerfStat();

  /** Trimmed version of {@link #getCdePerfStat()} */
  public String getCdePerfStat_trimmed();
  /** The pricing option code for the outstanding. */
  public String getCdePriceOpt();

  /** Trimmed version of {@link #getCdePriceOpt()} */
  public String getCdePriceOpt_trimmed();
  /** The RAC repricing frequency for this loan. */
  public String getCdeRacRepric();

  /** Trimmed version of {@link #getCdeRacRepric()} */
  public String getCdeRacRepric_trimmed();
  /** none */
  public String getCdeRapMthd();

  /** Trimmed version of {@link #getCdeRapMthd()} */
  public String getCdeRapMthd_trimmed();
  /** The code for the repricing frequency of the outstanding. */
  public String getCdeReprFreq();

  /** Trimmed version of {@link #getCdeReprFreq()} */
  public String getCdeReprFreq_trimmed();
  /** The code for the risk type of the outstanding. */
  public String getCdeRiskType();

  /** Trimmed version of {@link #getCdeRiskType()} */
  public String getCdeRiskType_trimmed();
  /**
   * The indicator to allow a loan to be requested in a denomination other than the currency of the
   * actual drawdown.
   */
  public String getCdeRqstCcy();

  /** Trimmed version of {@link #getCdeRqstCcy()} */
  public String getCdeRqstCcy_trimmed();
  /** The outstanding&apos;s SIC (Standard Industry Code). */
  public String getCdeSic();

  /** Trimmed version of {@link #getCdeSic()} */
  public String getCdeSic_trimmed();
  /** The SIC country code. */
  public String getCdeSicCntry();

  /** Trimmed version of {@link #getCdeSicCntry()} */
  public String getCdeSicCntry_trimmed();
  /** The tax exempt category for the outstanding. */
  public String getCdeTaxExempt();

  /** Trimmed version of {@link #getCdeTaxExempt()} */
  public String getCdeTaxExempt_trimmed();
  /** The treasury reporting area for the outstanding. */
  public String getCdeTrsryArea();

  /** Trimmed version of {@link #getCdeTrsryArea()} */
  public String getCdeTrsryArea_trimmed();
  /** The Customer ID (RID) of the borrower on the outstanding. */
  public String getCidBorrower();

  /** Trimmed version of {@link #getCidBorrower()} */
  public String getCidBorrower_trimmed();
  /** none */
  public Date getDteActRepric();
  /** none */
  public Date getDteAniversary();
  /** The effective date of the outstanding (the date on which it became active). */
  public Date getDteEffective();
  /**
   * &quot;The adjusted expiry date (for an SBLC or non-loan). System adjusts the user-entered
   * expiry date to fall on a non-business day, when applicable.&quot;
   */
  public Date getDteExpiryClc();
  /**
   * For an SBLC or Non-Loan it is the user entered expiry date.For a Loan it is the maturity Date.
   */
  public Date getDteExpiryEnt();
  /**
   * The final expiry date (for an SBLC). Indicates the final date to which an SBLC can be
   * automatically extended.
   */
  public Date getDteExpiryFnl();
  /** The date on which the outstanding was paid down to zero. */
  public Date getDtePaidDown();
  /** The RAC repricing date for this loan. */
  public Date getDteRacRepric();
  /** The date on which the outstanding is scheduled to be repriced. */
  public Date getDteRepricing();
  /**
   * &apos;Y&apos; means that the COF should accrue, but regular shares should not. It is set by
   * amortizing Outstanding Types.
   */
  public Boolean getIndAcCfOnly();
  /**
   * indicates whether a loan should accrue on schedule balance instead of actual principal balance
   */
  public Boolean getIndAcScdBal();
  /**
   * &quot;Indicates whether or not this outstanding, once paid down to zero and inactivated, is to
   * be re-accrued during &quot;&quot;as-of&quot;&quot; processing.&quot;
   */
  public Boolean getIndAccruable();
  /** none */
  public Boolean getIndAnvDteAp();
  /**
   * Indicates whether or not the SBLC should be automatically extended upon reaching its adjusted
   * expiry date.
   */
  public Boolean getIndAutoExtnd();
  /**
   * Indicate whether to charge the Prepayment Penalty Event Fee automaticaly. Default value is
   * &apos;N&apos;
   */
  public Boolean getIndAutoPrepf();
  /**
   * Indicates whether or not interest on this option should be included when preparing borrower
   * bills.
   */
  public Boolean getIndBillBorr();
  /**
   * When set to N, no bill will be automatically produced for any billing cycle whose Adjusted Due
   * Date is equal to or greater than the Loan Maturity Date
   */
  public Boolean getIndBillMatr();
  /**
   * When set to Y, indicates that any bills that are produced and printed for this loan are not to
   * be mailed (or distributed by any other means) to the Borrower
   */
  public Boolean getIndDontMail();
  /**
   * When set to Y, it indicates that any bills that are produced for this loan are not to be
   * printed, and therefore are not to be sent to the Borrower
   */
  public Boolean getIndDontPrnt();
  /** Indicates whether or not a facing fee has been defined for this SBLC. */
  public Boolean getIndFacingFee();
  /** Indicates whether the rate for this outstanding is floating (or fixed). */
  public Boolean getIndFloatRate();
  /**
   * Indicates whether or not a repricing date and a repricing frequency apply to this outstanding.
   */
  public Boolean getIndHasRprDt();
  /** none */
  public Boolean getIndIncXmlbil();
  /** none */
  public Boolean getIndIntDueRp();
  /** Indicates whether or not an issuance rate fee has been defined for this SBLC. */
  public Boolean getIndIssuinFee();
  /**
   * &quot;Indicates whether the pricing option for this outstanding is defined as
   * &quot;&quot;match-funded&quot;&quot;. If so, some or all of the host bank net share of this
   * outstanding may be &quot;&quot;match-funded&quot;&quot; (the remainder being allocated to a
   * &quot;&quot;non-match-funded&quot;&quot;).&quot;
   */
  public Boolean getIndMatchFund();
  /** Indicates whether or not notification has been received concerning the SBLC autoextension. */
  public Boolean getIndNotfRcvd();
  /** none */
  public Boolean getIndPmatInt();
  /** Indicates whether or not the SBLC is reinstatable upon receipt of payment from the borrower */
  public Boolean getIndReinstatbl();
  /** Keep the accrual rule info for the 2 SBLC fees separate */
  public Boolean getIndSepacrfees();
  /** none */
  public Boolean getIndSyncPcRp();
  /** A unique user defined name for the outstanding. */
  public String getNmeAlias();

  /** Trimmed version of {@link #getNmeAlias()} */
  public String getNmeAlias_trimmed();
  /** The number of days prior to the Adjusted Due Date that the bill will be prepared. */
  public Integer getNumBillDays();
  /**
   * &quot;The number of periods by which the SBLC will be extended, if automatic extension applies.
   * (Number of Periods X Period Length = Extension Period)&quot;
   */
  public Integer getNumExtIncr();
  /** The number of days prior to an autoextend that the involved parties should be notified. */
  public Integer getNumNotificatn();
  /**
   * &quot;If foreign withholding pertains to this outstanding, indicates the foreign withholding
   * percentage.&quot;
   */
  public BigDecimal getPctFrgWthhld();
  /**
   * Defines the threshold percentage for the loan?s past due calculation, above which the loan is
   * eligible to be automatically placed in Non Accrual Status.
   */
  public BigDecimal getPctNacrTlrnc();
  /**
   * &quot;When a tax exempt category has been selected, indicates the percentage of the outstanding
   * that is tax exempt.&quot;
   */
  public BigDecimal getPctTaxExempt();
  /** The Deal RID (Record ID) associated with the outstanding. */
  public String getPidDeal();

  /** Trimmed version of {@link #getPidDeal()} */
  public String getPidDeal_trimmed();
  /** The Facility RID (Record ID) associated with the outstanding. */
  public String getPidFacility();

  /** Trimmed version of {@link #getPidFacility()} */
  public String getPidFacility_trimmed();
  /** The Sublimit RID (Record ID) associated with the outstanding. */
  public String getPidSublimit();

  /** Trimmed version of {@link #getPidSublimit()} */
  public String getPidSublimit_trimmed();
  /** Contains RID of collateral group each outstanding belongs to */
  public String getRidCollatDef();

  /** Trimmed version of {@link #getRidCollatDef()} */
  public String getRidCollatDef_trimmed();
  /** Uniquely identifies the late charge rule, if any, assigned to this loan. */
  public String getRidLchgRule();

  /** Trimmed version of {@link #getRidLchgRule()} */
  public String getRidLchgRule_trimmed();
  /** The RID (Record ID) that uniquely identifies this outstanding. */
  public String getRidOutstandng();

  /** Trimmed version of {@link #getRidOutstandng()} */
  public String getRidOutstandng_trimmed();
  /**
   * The historical exchange rate (FX Rate) needed to convert outstandings into the currency of the
   * facility.
   */
  public BigDecimal getRteFcHsRate();
  /**
   * &quot;The current (or ,&apos;spot,&apos;) exchange rate (FX Rate) needed to convert
   * outstandings into the currency of the facility.&quot;&quot;&quot;
   */
  public BigDecimal getRteFcRate();
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
  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public LiqCustomer getLiqCustomerBorrower();
  /**
   * The deal table. A record of a borrowing agreement between the lender and the borrower which may
   * encompass one or more credit facilities.
   */
  public LiqDeal getLiqDeal();
  /** The facility table. A credit arrangement established by the bank for the client. */
  public LiqFacility getLiqFacility();
  /** The outstanding transaction table. Transactions directly related to outstandings. */
  public List<LiqOstTran> getLiqOriginalOstTrans();
  /** The outstanding transaction table. Transactions directly related to outstandings. */
  public List<LiqOstTran> getLiqOstTrans();
}
