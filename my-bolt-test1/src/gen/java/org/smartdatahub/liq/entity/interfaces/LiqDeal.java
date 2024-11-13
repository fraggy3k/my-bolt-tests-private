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
 * The deal table. A record of a borrowing agreement between the lender and the borrower which may
 * encompass one or more credit facilities.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public interface LiqDeal extends DomainObject {

  public static final String TABLE_ID = "DEA";

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>pidDeal</code>
   */
  public String getOriginId();

  /** The global deal proposed commitment amount (requested by the borrower prior to deal close). */
  public BigDecimal getAmtGloPreclo();
  /** */
  public BigDecimal getAmtNacrTlrnc();
  /** The code identifying the LS2 Client Bank (the purchaser of LS2). */
  public String getCdeBank();

  /** Trimmed version of {@link #getCdeBank()} */
  public String getCdeBank_trimmed();
  /** The Owning Branch of the deal. */
  public String getCdeBranch();

  /** Trimmed version of {@link #getCdeBranch()} */
  public String getCdeBranch_trimmed();
  /** The deal create assignment code; indicates if assignments can be created in deal. */
  public String getCdeCrAsn();

  /** Trimmed version of {@link #getCdeCrAsn()} */
  public String getCdeCrAsn_trimmed();
  /** The deal create participation code; indicates if participations can be created in the deal. */
  public String getCdeCrPartic();

  /** Trimmed version of {@link #getCdeCrPartic()} */
  public String getCdeCrPartic_trimmed();
  /** The deal classification code. */
  public String getCdeDealClass();

  /** Trimmed version of {@link #getCdeDealClass()} */
  public String getCdeDealClass_trimmed();
  /** The deal status code. */
  public String getCdeDealStat();

  /** Trimmed version of {@link #getCdeDealStat()} */
  public String getCdeDealStat_trimmed();
  /** The deal department subtype code. */
  public String getCdeDepSubtyp();

  /** Trimmed version of {@link #getCdeDepSubtyp()} */
  public String getCdeDepSubtyp_trimmed();
  /** The deal department code. */
  public String getCdeDept();

  /** Trimmed version of {@link #getCdeDept()} */
  public String getCdeDept_trimmed();
  /** The deal expense code. */
  public String getCdeExpense();

  /** Trimmed version of {@link #getCdeExpense()} */
  public String getCdeExpense_trimmed();
  /**
   * determines the order in which payments from the borrower should be applied to billed items
   * (i.e. Principal, then interest, then Fees, etc.). If not set at the deal level, the Syatem
   * Parameter value is used.
   */
  public String getCdeInpalRule();

  /** Trimmed version of {@link #getCdeInpalRule()} */
  public String getCdeInpalRule_trimmed();
  /** The deal currency. */
  public String getCdeOrigCcy();

  /** Trimmed version of {@link #getCdeOrigCcy()} */
  public String getCdeOrigCcy_trimmed();
  /**
   * determines how payments from the borrower should be applied to past due bill items (i.e. start
   * from the oldest bill each in entirety based on the INPAL rule, start from current bill each in
   * entirety based on the INPAL rule, current or oldest paying off all of one category at a time
   * based on INPAL rule)
   */
  public String getCdePdlgcRule();

  /** Trimmed version of {@link #getCdePdlgcRule()} */
  public String getCdePdlgcRule_trimmed();
  /**
   * &quot;The deal&apos;s performing status, indicating whether or not the Admin Fees defined for
   * this deal are accruing or amortizing, as applicable.&quot;
   */
  public String getCdePerforming();

  /** Trimmed version of {@link #getCdePerforming()} */
  public String getCdePerforming_trimmed();
  /** The deal&apos;s processing area. */
  public String getCdeProcArea();

  /** Trimmed version of {@link #getCdeProcArea()} */
  public String getCdeProcArea_trimmed();
  /** &quot;The reason why this deal has been marked &quot;&quot;Not For Sale&quot;&quot;.&quot; */
  public String getCdeReasonNfs();

  /** Trimmed version of {@link #getCdeReasonNfs()} */
  public String getCdeReasonNfs_trimmed();
  /** The deal&apos;s selling stage code. */
  public String getCdeSellStage();

  /** Trimmed version of {@link #getCdeSellStage()} */
  public String getCdeSellStage_trimmed();
  /**
   * The reason why this deal was terminated. This field is no longer maintained and should be
   * removed from the database.
   */
  public String getCdeTermReasn();

  /** Trimmed version of {@link #getCdeTermReasn()} */
  public String getCdeTermReasn_trimmed();
  /** The date of the Credit Agreement governing the deal. */
  public Date getDteAgreement();
  /** The date the deal was approved. */
  public Date getDteApproved();
  /** The effective date of the cancellation of the deal. */
  public Date getDteCancelEff();
  /** The date the commitment letter was received. */
  public Date getDteCommitLtr();
  /**
   * &quot;The effective date of the deal closing (sometimes referred to as the &quot;&quot;Deal
   * Effective Date&quot;&quot;).&quot;
   */
  public Date getDteDealClsd();
  /** The cut-off date to add a facility to the deal. */
  public Date getDteFacCutoff();
  /** The date the deal was last reviewed. */
  public Date getDteLastRevwd();
  /** The projected closing date for the deal. */
  public Date getDteProjClose();
  /** The SBLC Usage Expiration Date (the latest date on which an SBLC for this deal can expire). */
  public Date getDteSblcExp();
  /**
   * &quot;The SBLC &quot;&quot;Last Issuance By&quot;&quot; Date, after which no new SBLC&apos;s
   * can be issued for this deal.&quot;
   */
  public Date getDteSblcIssue();
  /** The effective date of the termination. */
  public Date getDteTermEff();
  /** Indicates whether or not accounting is enabled. */
  public Boolean getIndAcctEnabl();
  /** Indicates whether or not the deal is active. */
  public Boolean getIndActive();
  /**
   * &quot;Indicates if circles for this deal settle &quot;&quot;Actual&quot;&quot; or
   * &quot;&quot;Flat&quot;&quot; during an Interest or Fee period. &quot;&quot;Actual&quot;&quot;:
   * seller receives interest/fees prior to settlement and buyer receives interest/fees after
   * settlement. &quot;&quot;Flat&quot;&quot;: buyer r&quot;
   */
  public Boolean getIndActual();
  /** Indicates whether transactions for this deal will be auto-generated. */
  public Boolean getIndAutoGen();
  /** */
  public Boolean getIndAutoNonp();
  /**
   * Indicate whether to charge the Prepayment Penalty Event Fee automaticaly. Default value is
   * &apos;N&apos;
   */
  public Boolean getIndAutoPrepf();
  /** Indicates whether transactions for this deal will be auto-released. */
  public Boolean getIndAutoRel();
  /** Indicates whether or not bills for this deal are consolidated. */
  public Boolean getIndCnslBill();
  /** Indicates whether or not this deal complies with the Community Reinvestment Act. */
  public Boolean getIndCra();
  /** Indicator whether a deal cusip is listed or not */
  public Boolean getIndCusipLst();
  /** none */
  public Boolean getIndDontMail();
  /** none */
  public Boolean getIndDontPrnt();
  /**
   * &quot;Indicates whether or not the deal is in the ,&apos;early discussion,&apos; stage. If so,
   * salespersons. traders and asset managers will not be able to see the deal.&quot;
   */
  public Boolean getIndEarlyDisc();
  /** &quot;Indicates whether or not it is &quot;&quot;OK to Fund&quot;&quot; this deal.&quot; */
  public Boolean getIndFund();
  /** Indicates whether or not a guarantee exists at the deal level. */
  public Boolean getIndGuarDeal();
  /** Indicates whether or not the deal is a highly leveraged transaction (HLT). */
  public Boolean getIndHlt();
  /** none */
  public Boolean getIndIncXmlbil();
  /**
   * &quot;Indicates whether or not the deal is eligible for &quot;&quot;Shared National
   * Credit&quot;&quot; reporting.&quot;
   */
  public Boolean getIndNatnlCrdt();
  /**
   * Indicates whether or not the deal is a Closed Non-Host Bank Deal. This field is not maintained
   * and should be removed from the database.
   */
  public Boolean getIndOutsdDeal();
  /** */
  public Boolean getIndPastDueb();
  /** Indicates whether or not access to the deal is restricted to specific users. */
  public Boolean getIndRestrict();
  /**
   * &quot;Indicates whether or not &quot;&quot;reserve adjusted rates&quot;&quot; apply to this
   * deal.&quot;
   */
  public Boolean getIndRsrvAdj();
  /**
   * &quot;Indicates whether or not the deal is a &quot;&quot;sole lender deal,&quot;&quot; meaning
   * it has only one contractual circle (the Host Bank Origination Primary).&quot;
   */
  public Boolean getIndSoleLendr();
  /** The alias name for the deal. */
  public String getNmeAliasName();

  /** Trimmed version of {@link #getNmeAliasName()} */
  public String getNmeAliasName_trimmed();
  /** The name of the deal. */
  public String getNmeDeal();

  /** Trimmed version of {@link #getNmeDeal()} */
  public String getNmeDeal_trimmed();
  /**
   * &quot;The Deal Tracking Number, a control number providing another way of uniquely identifying
   * the deal.&quot;
   */
  public String getNumDealCntl();

  /** Trimmed version of {@link #getNumDealCntl()} */
  public String getNumDealCntl_trimmed();
  /** Euro Interim Rounding Precision */
  public Integer getNumEuroIntrm();
  /**
   * &quot;The deal&apos;s grace period, defining the number of days after which an interest or
   * principal payment will be considered &quot;&quot;past due&quot;&quot; for the purpose of
   * assessing a &quot;&quot;defoult penalty spread&quot;&quot;. (Should not be confused with the
   * General Ledg&quot;
   */
  public Integer getNumGracePer();
  /** The maximum number of active matchfunded loans allowed for the deal. */
  public Integer getNumMatchDraw();
  /** The maximum number of active loans allowed for the deal. */
  public Integer getNumMaxDraw();
  /** */
  public BigDecimal getPctNacrTlrnc();
  /** The Unique ID of the Deal. */
  public String getPidDeal();

  /** Trimmed version of {@link #getPidDeal()} */
  public String getPidDeal_trimmed();
  /** contains RID of collateral group each deal belongs to */
  public String getRidCollatDef();

  /** Trimmed version of {@link #getRidCollatDef()} */
  public String getRidCollatDef_trimmed();
  /**
   * &quot;Number between 0 and 100 that represents the difficulty factor for selling the deal,
   * referenced when assigning sales credit.&quot;
   */
  public BigDecimal getRtoFctSaldif();
  /** Timestamp from when this row was created. */
  public Date getTspRecCreate();
  /** Timestamp from when this row was last updated. */
  public Date getTspRecUpdate();
  /** To store 9-digit deal cusip number */
  public String getTxtCusipNum();

  /** Trimmed version of {@link #getTxtCusipNum()} */
  public String getTxtCusipNum_trimmed();
  /** To store 12-digit deal isin number */
  public String getTxtIsinNum();

  /** Trimmed version of {@link #getTxtIsinNum()} */
  public String getTxtIsinNum_trimmed();
  /** The User ID of the Deal Adminstrator specifically assigned to the Deal Team. */
  public String getUidAdmnstratr();

  /** Trimmed version of {@link #getUidAdmnstratr()} */
  public String getUidAdmnstratr_trimmed();
  /** The User ID of the last reviewer. */
  public String getUidLastRevwr();

  /** Trimmed version of {@link #getUidLastRevwr()} */
  public String getUidLastRevwr_trimmed();
  /** The User ID of the originator of the deal. */
  public String getUidOriginator();

  /** Trimmed version of {@link #getUidOriginator()} */
  public String getUidOriginator_trimmed();
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
  /** The User ID of the Relationship Manager specifically assigned to the Deal Team. */
  public String getUidRelManagr();

  /** Trimmed version of {@link #getUidRelManagr()} */
  public String getUidRelManagr_trimmed();
  /**
   * &quot;The Alternate ID, providing an alternate method of uniquely identifying the deal.&quot;
   */
  public String getXidAltDealid();

  /** Trimmed version of {@link #getXidAltDealid()} */
  public String getXidAltDealid_trimmed();
  /**
   * &quot;The ANSI ID, a Loan Identification Number assigned by the Loan Pricing Corporation to
   * uniquely identify the deal.&quot;
   */
  public String getXidAnsiId();

  /** Trimmed version of {@link #getXidAnsiId()} */
  public String getXidAnsiId_trimmed();
  /**
   * &quot;The Reference ID optionally assigned to a deal that is eligible for &quot;&quot;Shared
   * National Credit&quot;&quot; reporting.&quot;
   */
  public String getXidNatnlCrdt();

  /** Trimmed version of {@link #getXidNatnlCrdt()} */
  public String getXidNatnlCrdt_trimmed();
  /** */
  public LiqCodeBank getLiqCodeBank();
  /** The branch table. */
  public LiqBranch getLiqBranch();
  /** The deal administrator table. Management of money transfer between lenders and borrowers. */
  public LiqDealAdmin getLiqDealAdmin();
  /** The deal borrower table. The borrowers that are associated with a deal. */
  public List<LiqDealBorrower> getLiqDealBorrowers();
  /**
   * The facility commitment transaction table. Transactions which affect a lender's position in a
   * facility.
   */
  public List<LiqFacCommitTrn> getLiqFacCommitTrns();
  /** The facility table. A credit arrangement established by the bank for the client. */
  public List<LiqFacility> getLiqFacilities();
  /** The outstanding table. Outstanding amounts and dates for loans and letters of credit. */
  public List<LiqOutstanding> getLiqOutstandings();
}
