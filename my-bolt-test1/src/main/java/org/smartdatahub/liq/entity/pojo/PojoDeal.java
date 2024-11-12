/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.LiqBranch;
import org.smartdatahub.liq.entity.interfaces.LiqCodeBank;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqDealAdmin;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.interfaces.LiqFacCommitTrn;
import org.smartdatahub.liq.entity.interfaces.LiqFacHostAgr;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * The deal table. A record of a borrowing agreement between the lender and the borrower which may
 * encompass one or more credit facilities.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public class PojoDeal
    implements LiqDeal, Identifiable<String>, Serializable, EqualsSimpleFieldSupport<PojoDeal> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "DEA";

  @Id private /*4*/ String pidDeal;
  private /*4*/ BigDecimal amtGloPreclo;
  private /*4*/ BigDecimal amtNacrTlrnc;
  private /*4*/ String cdeBank;
  private /*4*/ String cdeBranch;
  private /*4*/ String cdeCrAsn;
  private /*4*/ String cdeCrPartic;
  private /*4*/ String cdeDealClass;
  private /*4*/ String cdeDealStat;
  private /*4*/ String cdeDepSubtyp;
  private /*4*/ String cdeDept;
  private /*4*/ String cdeExpense;
  private /*4*/ String cdeInpalRule;
  private /*4*/ String cdeOrigCcy;
  private /*4*/ String cdePdlgcRule;
  private /*4*/ String cdePerforming;
  private /*4*/ String cdeProcArea;
  private /*4*/ String cdeReasonNfs;
  private /*4*/ String cdeSellStage;
  private /*4*/ String cdeTermReasn;
  private /*4*/ Date dteAgreement;
  private /*4*/ Date dteApproved;
  private /*4*/ Date dteCancelEff;
  private /*4*/ Date dteCommitLtr;
  private /*4*/ Date dteDealClsd;
  private /*4*/ Date dteFacCutoff;
  private /*4*/ Date dteLastRevwd;
  private /*4*/ Date dteProjClose;
  private /*4*/ Date dteSblcExp;
  private /*4*/ Date dteSblcIssue;
  private /*4*/ Date dteTermEff;
  private /*4*/ Boolean indAcctEnabl;
  private /*4*/ Boolean indActive;
  private /*4*/ Boolean indActual;
  private /*4*/ Boolean indAutoGen;
  private /*4*/ Boolean indAutoNonp;
  private /*4*/ Boolean indAutoPrepf;
  private /*4*/ Boolean indAutoRel;
  private /*4*/ Boolean indCnslBill;
  private /*4*/ Boolean indCra;
  private /*4*/ Boolean indCusipLst;
  private /*4*/ Boolean indDontMail;
  private /*4*/ Boolean indDontPrnt;
  private /*4*/ Boolean indEarlyDisc;
  private /*4*/ Boolean indFund;
  private /*4*/ Boolean indGuarDeal;
  private /*4*/ Boolean indHlt;
  private /*4*/ Boolean indIncXmlbil;
  private /*4*/ Boolean indNatnlCrdt;
  private /*4*/ Boolean indOutsdDeal;
  private /*4*/ Boolean indPastDueb;
  private /*4*/ Boolean indRestrict;
  private /*4*/ Boolean indRsrvAdj;
  private /*4*/ Boolean indSoleLendr;
  private /*4*/ String nmeAliasName;
  private /*4*/ String nmeDeal;
  private /*4*/ String numDealCntl;
  private /*4*/ Integer numEuroIntrm;
  private /*4*/ Integer numGracePer;
  private /*4*/ Integer numMatchDraw;
  private /*4*/ Integer numMaxDraw;
  private /*4*/ BigDecimal pctNacrTlrnc;
  private /*4*/ String ridCollatDef;
  private /*4*/ BigDecimal rtoFctSaldif;
  private /*4*/ Date tspRecCreate;
  private /*4*/ Date tspRecUpdate;
  private /*4*/ String txtCusipNum;
  private /*4*/ String txtIsinNum;
  private /*4*/ String uidAdmnstratr;
  private /*4*/ String uidLastRevwr;
  private /*4*/ String uidOriginator;
  private /*4*/ String uidRecCreate;
  private /*4*/ String uidRecUpdate;
  private /*4*/ String uidRelManagr;
  private /*4*/ String xidAltDealid;
  private /*4*/ String xidAnsiId;
  private /*4*/ String xidNatnlCrdt;
  private /*3*/ PojoCodeBank liqCodeBank;
  private /*3*/ PojoBranch liqBranch;
  private /*3*/ PojoDealAdmin liqDealAdmin;
  private List</*1*/ LiqDealBorrower> liqDealBorrowers;
  private List</*1*/ LiqFacCommitTrn> liqFacCommitTrns;
  private List</*1*/ LiqFacHostAgr> liqFacHostAgrs;
  private List</*1*/ LiqFacility> liqFacilities;
  private List</*1*/ LiqOutstanding> liqOutstandings;

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
  /** The Unique ID of the Deal. */
  public String getPidDeal() {
    return pidDeal;
  }

  /** Trimmed version of {@link #getPidDeal()} */
  public String getPidDeal_trimmed() {
    return (pidDeal == null) ? null : pidDeal.trim();
  }

  /** The global deal proposed commitment amount (requested by the borrower prior to deal close). */
  public BigDecimal getAmtGloPreclo() {
    return amtGloPreclo;
  }

  /** */
  public BigDecimal getAmtNacrTlrnc() {
    return amtNacrTlrnc;
  }

  /** The code identifying the LS2 Client Bank (the purchaser of LS2). */
  public String getCdeBank() {
    return cdeBank;
  }

  /** Trimmed version of {@link #getCdeBank()} */
  public String getCdeBank_trimmed() {
    return (cdeBank == null) ? null : cdeBank.trim();
  }

  /** The Owning Branch of the deal. */
  public String getCdeBranch() {
    return cdeBranch;
  }

  /** Trimmed version of {@link #getCdeBranch()} */
  public String getCdeBranch_trimmed() {
    return (cdeBranch == null) ? null : cdeBranch.trim();
  }

  /** The deal create assignment code; indicates if assignments can be created in deal. */
  public String getCdeCrAsn() {
    return cdeCrAsn;
  }

  /** Trimmed version of {@link #getCdeCrAsn()} */
  public String getCdeCrAsn_trimmed() {
    return (cdeCrAsn == null) ? null : cdeCrAsn.trim();
  }

  /** The deal create participation code; indicates if participations can be created in the deal. */
  public String getCdeCrPartic() {
    return cdeCrPartic;
  }

  /** Trimmed version of {@link #getCdeCrPartic()} */
  public String getCdeCrPartic_trimmed() {
    return (cdeCrPartic == null) ? null : cdeCrPartic.trim();
  }

  /** The deal classification code. */
  public String getCdeDealClass() {
    return cdeDealClass;
  }

  /** Trimmed version of {@link #getCdeDealClass()} */
  public String getCdeDealClass_trimmed() {
    return (cdeDealClass == null) ? null : cdeDealClass.trim();
  }

  /** The deal status code. */
  public String getCdeDealStat() {
    return cdeDealStat;
  }

  /** Trimmed version of {@link #getCdeDealStat()} */
  public String getCdeDealStat_trimmed() {
    return (cdeDealStat == null) ? null : cdeDealStat.trim();
  }

  /** The deal department subtype code. */
  public String getCdeDepSubtyp() {
    return cdeDepSubtyp;
  }

  /** Trimmed version of {@link #getCdeDepSubtyp()} */
  public String getCdeDepSubtyp_trimmed() {
    return (cdeDepSubtyp == null) ? null : cdeDepSubtyp.trim();
  }

  /** The deal department code. */
  public String getCdeDept() {
    return cdeDept;
  }

  /** Trimmed version of {@link #getCdeDept()} */
  public String getCdeDept_trimmed() {
    return (cdeDept == null) ? null : cdeDept.trim();
  }

  /** The deal expense code. */
  public String getCdeExpense() {
    return cdeExpense;
  }

  /** Trimmed version of {@link #getCdeExpense()} */
  public String getCdeExpense_trimmed() {
    return (cdeExpense == null) ? null : cdeExpense.trim();
  }

  /**
   * determines the order in which payments from the borrower should be applied to billed items
   * (i.e. Principal, then interest, then Fees, etc.). If not set at the deal level, the Syatem
   * Parameter value is used.
   */
  public String getCdeInpalRule() {
    return cdeInpalRule;
  }

  /** Trimmed version of {@link #getCdeInpalRule()} */
  public String getCdeInpalRule_trimmed() {
    return (cdeInpalRule == null) ? null : cdeInpalRule.trim();
  }

  /** The deal currency. */
  public String getCdeOrigCcy() {
    return cdeOrigCcy;
  }

  /** Trimmed version of {@link #getCdeOrigCcy()} */
  public String getCdeOrigCcy_trimmed() {
    return (cdeOrigCcy == null) ? null : cdeOrigCcy.trim();
  }

  /**
   * determines how payments from the borrower should be applied to past due bill items (i.e. start
   * from the oldest bill each in entirety based on the INPAL rule, start from current bill each in
   * entirety based on the INPAL rule, current or oldest paying off all of one category at a time
   * based on INPAL rule)
   */
  public String getCdePdlgcRule() {
    return cdePdlgcRule;
  }

  /** Trimmed version of {@link #getCdePdlgcRule()} */
  public String getCdePdlgcRule_trimmed() {
    return (cdePdlgcRule == null) ? null : cdePdlgcRule.trim();
  }

  /**
   * &quot;The deal&apos;s performing status, indicating whether or not the Admin Fees defined for
   * this deal are accruing or amortizing, as applicable.&quot;
   */
  public String getCdePerforming() {
    return cdePerforming;
  }

  /** Trimmed version of {@link #getCdePerforming()} */
  public String getCdePerforming_trimmed() {
    return (cdePerforming == null) ? null : cdePerforming.trim();
  }

  /** The deal&apos;s processing area. */
  public String getCdeProcArea() {
    return cdeProcArea;
  }

  /** Trimmed version of {@link #getCdeProcArea()} */
  public String getCdeProcArea_trimmed() {
    return (cdeProcArea == null) ? null : cdeProcArea.trim();
  }

  /** &quot;The reason why this deal has been marked &quot;&quot;Not For Sale&quot;&quot;.&quot; */
  public String getCdeReasonNfs() {
    return cdeReasonNfs;
  }

  /** Trimmed version of {@link #getCdeReasonNfs()} */
  public String getCdeReasonNfs_trimmed() {
    return (cdeReasonNfs == null) ? null : cdeReasonNfs.trim();
  }

  /** The deal&apos;s selling stage code. */
  public String getCdeSellStage() {
    return cdeSellStage;
  }

  /** Trimmed version of {@link #getCdeSellStage()} */
  public String getCdeSellStage_trimmed() {
    return (cdeSellStage == null) ? null : cdeSellStage.trim();
  }

  /**
   * The reason why this deal was terminated. This field is no longer maintained and should be
   * removed from the database.
   */
  public String getCdeTermReasn() {
    return cdeTermReasn;
  }

  /** Trimmed version of {@link #getCdeTermReasn()} */
  public String getCdeTermReasn_trimmed() {
    return (cdeTermReasn == null) ? null : cdeTermReasn.trim();
  }

  /** The date of the Credit Agreement governing the deal. */
  public Date getDteAgreement() {
    return dteAgreement;
  }

  /** The date the deal was approved. */
  public Date getDteApproved() {
    return dteApproved;
  }

  /** The effective date of the cancellation of the deal. */
  public Date getDteCancelEff() {
    return dteCancelEff;
  }

  /** The date the commitment letter was received. */
  public Date getDteCommitLtr() {
    return dteCommitLtr;
  }

  /**
   * &quot;The effective date of the deal closing (sometimes referred to as the &quot;&quot;Deal
   * Effective Date&quot;&quot;).&quot;
   */
  public Date getDteDealClsd() {
    return dteDealClsd;
  }

  /** The cut-off date to add a facility to the deal. */
  public Date getDteFacCutoff() {
    return dteFacCutoff;
  }

  /** The date the deal was last reviewed. */
  public Date getDteLastRevwd() {
    return dteLastRevwd;
  }

  /** The projected closing date for the deal. */
  public Date getDteProjClose() {
    return dteProjClose;
  }

  /** The SBLC Usage Expiration Date (the latest date on which an SBLC for this deal can expire). */
  public Date getDteSblcExp() {
    return dteSblcExp;
  }

  /**
   * &quot;The SBLC &quot;&quot;Last Issuance By&quot;&quot; Date, after which no new SBLC&apos;s
   * can be issued for this deal.&quot;
   */
  public Date getDteSblcIssue() {
    return dteSblcIssue;
  }

  /** The effective date of the termination. */
  public Date getDteTermEff() {
    return dteTermEff;
  }

  /** Indicates whether or not accounting is enabled. */
  public Boolean getIndAcctEnabl() {
    return indAcctEnabl;
  }

  /** Indicates whether or not the deal is active. */
  public Boolean getIndActive() {
    return indActive;
  }

  /**
   * &quot;Indicates if circles for this deal settle &quot;&quot;Actual&quot;&quot; or
   * &quot;&quot;Flat&quot;&quot; during an Interest or Fee period. &quot;&quot;Actual&quot;&quot;:
   * seller receives interest/fees prior to settlement and buyer receives interest/fees after
   * settlement. &quot;&quot;Flat&quot;&quot;: buyer r&quot;
   */
  public Boolean getIndActual() {
    return indActual;
  }

  /** Indicates whether transactions for this deal will be auto-generated. */
  public Boolean getIndAutoGen() {
    return indAutoGen;
  }

  /** */
  public Boolean getIndAutoNonp() {
    return indAutoNonp;
  }

  /**
   * Indicate whether to charge the Prepayment Penalty Event Fee automaticaly. Default value is
   * &apos;N&apos;
   */
  public Boolean getIndAutoPrepf() {
    return indAutoPrepf;
  }

  /** Indicates whether transactions for this deal will be auto-released. */
  public Boolean getIndAutoRel() {
    return indAutoRel;
  }

  /** Indicates whether or not bills for this deal are consolidated. */
  public Boolean getIndCnslBill() {
    return indCnslBill;
  }

  /** Indicates whether or not this deal complies with the Community Reinvestment Act. */
  public Boolean getIndCra() {
    return indCra;
  }

  /** Indicator whether a deal cusip is listed or not */
  public Boolean getIndCusipLst() {
    return indCusipLst;
  }

  /** none */
  public Boolean getIndDontMail() {
    return indDontMail;
  }

  /** none */
  public Boolean getIndDontPrnt() {
    return indDontPrnt;
  }

  /**
   * &quot;Indicates whether or not the deal is in the ,&apos;early discussion,&apos; stage. If so,
   * salespersons. traders and asset managers will not be able to see the deal.&quot;
   */
  public Boolean getIndEarlyDisc() {
    return indEarlyDisc;
  }

  /** &quot;Indicates whether or not it is &quot;&quot;OK to Fund&quot;&quot; this deal.&quot; */
  public Boolean getIndFund() {
    return indFund;
  }

  /** Indicates whether or not a guarantee exists at the deal level. */
  public Boolean getIndGuarDeal() {
    return indGuarDeal;
  }

  /** Indicates whether or not the deal is a highly leveraged transaction (HLT). */
  public Boolean getIndHlt() {
    return indHlt;
  }

  /** none */
  public Boolean getIndIncXmlbil() {
    return indIncXmlbil;
  }

  /**
   * &quot;Indicates whether or not the deal is eligible for &quot;&quot;Shared National
   * Credit&quot;&quot; reporting.&quot;
   */
  public Boolean getIndNatnlCrdt() {
    return indNatnlCrdt;
  }

  /**
   * Indicates whether or not the deal is a Closed Non-Host Bank Deal. This field is not maintained
   * and should be removed from the database.
   */
  public Boolean getIndOutsdDeal() {
    return indOutsdDeal;
  }

  /** */
  public Boolean getIndPastDueb() {
    return indPastDueb;
  }

  /** Indicates whether or not access to the deal is restricted to specific users. */
  public Boolean getIndRestrict() {
    return indRestrict;
  }

  /**
   * &quot;Indicates whether or not &quot;&quot;reserve adjusted rates&quot;&quot; apply to this
   * deal.&quot;
   */
  public Boolean getIndRsrvAdj() {
    return indRsrvAdj;
  }

  /**
   * &quot;Indicates whether or not the deal is a &quot;&quot;sole lender deal,&quot;&quot; meaning
   * it has only one contractual circle (the Host Bank Origination Primary).&quot;
   */
  public Boolean getIndSoleLendr() {
    return indSoleLendr;
  }

  /** The alias name for the deal. */
  public String getNmeAliasName() {
    return nmeAliasName;
  }

  /** Trimmed version of {@link #getNmeAliasName()} */
  public String getNmeAliasName_trimmed() {
    return (nmeAliasName == null) ? null : nmeAliasName.trim();
  }

  /** The name of the deal. */
  public String getNmeDeal() {
    return nmeDeal;
  }

  /** Trimmed version of {@link #getNmeDeal()} */
  public String getNmeDeal_trimmed() {
    return (nmeDeal == null) ? null : nmeDeal.trim();
  }

  /**
   * &quot;The Deal Tracking Number, a control number providing another way of uniquely identifying
   * the deal.&quot;
   */
  public String getNumDealCntl() {
    return numDealCntl;
  }

  /** Trimmed version of {@link #getNumDealCntl()} */
  public String getNumDealCntl_trimmed() {
    return (numDealCntl == null) ? null : numDealCntl.trim();
  }

  /** Euro Interim Rounding Precision */
  public Integer getNumEuroIntrm() {
    return numEuroIntrm;
  }

  /**
   * &quot;The deal&apos;s grace period, defining the number of days after which an interest or
   * principal payment will be considered &quot;&quot;past due&quot;&quot; for the purpose of
   * assessing a &quot;&quot;defoult penalty spread&quot;&quot;. (Should not be confused with the
   * General Ledg&quot;
   */
  public Integer getNumGracePer() {
    return numGracePer;
  }

  /** The maximum number of active matchfunded loans allowed for the deal. */
  public Integer getNumMatchDraw() {
    return numMatchDraw;
  }

  /** The maximum number of active loans allowed for the deal. */
  public Integer getNumMaxDraw() {
    return numMaxDraw;
  }

  /** */
  public BigDecimal getPctNacrTlrnc() {
    return pctNacrTlrnc;
  }

  /** contains RID of collateral group each deal belongs to */
  public String getRidCollatDef() {
    return ridCollatDef;
  }

  /** Trimmed version of {@link #getRidCollatDef()} */
  public String getRidCollatDef_trimmed() {
    return (ridCollatDef == null) ? null : ridCollatDef.trim();
  }

  /**
   * &quot;Number between 0 and 100 that represents the difficulty factor for selling the deal,
   * referenced when assigning sales credit.&quot;
   */
  public BigDecimal getRtoFctSaldif() {
    return rtoFctSaldif;
  }

  /** Timestamp from when this row was created. */
  public Date getTspRecCreate() {
    return tspRecCreate;
  }

  /** Timestamp from when this row was last updated. */
  public Date getTspRecUpdate() {
    return tspRecUpdate;
  }

  /** To store 9-digit deal cusip number */
  public String getTxtCusipNum() {
    return txtCusipNum;
  }

  /** Trimmed version of {@link #getTxtCusipNum()} */
  public String getTxtCusipNum_trimmed() {
    return (txtCusipNum == null) ? null : txtCusipNum.trim();
  }

  /** To store 12-digit deal isin number */
  public String getTxtIsinNum() {
    return txtIsinNum;
  }

  /** Trimmed version of {@link #getTxtIsinNum()} */
  public String getTxtIsinNum_trimmed() {
    return (txtIsinNum == null) ? null : txtIsinNum.trim();
  }

  /** The User ID of the Deal Adminstrator specifically assigned to the Deal Team. */
  public String getUidAdmnstratr() {
    return uidAdmnstratr;
  }

  /** Trimmed version of {@link #getUidAdmnstratr()} */
  public String getUidAdmnstratr_trimmed() {
    return (uidAdmnstratr == null) ? null : uidAdmnstratr.trim();
  }

  /** The User ID of the last reviewer. */
  public String getUidLastRevwr() {
    return uidLastRevwr;
  }

  /** Trimmed version of {@link #getUidLastRevwr()} */
  public String getUidLastRevwr_trimmed() {
    return (uidLastRevwr == null) ? null : uidLastRevwr.trim();
  }

  /** The User ID of the originator of the deal. */
  public String getUidOriginator() {
    return uidOriginator;
  }

  /** Trimmed version of {@link #getUidOriginator()} */
  public String getUidOriginator_trimmed() {
    return (uidOriginator == null) ? null : uidOriginator.trim();
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

  /** The User ID of the Relationship Manager specifically assigned to the Deal Team. */
  public String getUidRelManagr() {
    return uidRelManagr;
  }

  /** Trimmed version of {@link #getUidRelManagr()} */
  public String getUidRelManagr_trimmed() {
    return (uidRelManagr == null) ? null : uidRelManagr.trim();
  }

  /**
   * &quot;The Alternate ID, providing an alternate method of uniquely identifying the deal.&quot;
   */
  public String getXidAltDealid() {
    return xidAltDealid;
  }

  /** Trimmed version of {@link #getXidAltDealid()} */
  public String getXidAltDealid_trimmed() {
    return (xidAltDealid == null) ? null : xidAltDealid.trim();
  }

  /**
   * &quot;The ANSI ID, a Loan Identification Number assigned by the Loan Pricing Corporation to
   * uniquely identify the deal.&quot;
   */
  public String getXidAnsiId() {
    return xidAnsiId;
  }

  /** Trimmed version of {@link #getXidAnsiId()} */
  public String getXidAnsiId_trimmed() {
    return (xidAnsiId == null) ? null : xidAnsiId.trim();
  }

  /**
   * &quot;The Reference ID optionally assigned to a deal that is eligible for &quot;&quot;Shared
   * National Credit&quot;&quot; reporting.&quot;
   */
  public String getXidNatnlCrdt() {
    return xidNatnlCrdt;
  }

  /** Trimmed version of {@link #getXidNatnlCrdt()} */
  public String getXidNatnlCrdt_trimmed() {
    return (xidNatnlCrdt == null) ? null : xidNatnlCrdt.trim();
  }

  /** */
  public LiqCodeBank getLiqCodeBank() {
    return nullIfNotFound(liqCodeBank);
  }

  /** The branch table. */
  public LiqBranch getLiqBranch() {
    return nullIfNotFound(liqBranch);
  }

  /** The deal administrator table. Management of money transfer between lenders and borrowers. */
  public LiqDealAdmin getLiqDealAdmin() {
    return nullIfNotFound(liqDealAdmin);
  }

  /** The deal borrower table. The borrowers that are associated with a deal. */
  public List<LiqDealBorrower> getLiqDealBorrowers() {
    return nullIfNotFound(liqDealBorrowers);
  }

  /**
   * The facility commitment transaction table. Transactions which affect a lender's position in a
   * facility.
   */
  public List<LiqFacCommitTrn> getLiqFacCommitTrns() {
    return nullIfNotFound(liqFacCommitTrns);
  }

  /**
   * The facility host bank agregation. Finstra version was almost empty -> filled by best knowledge
   */
  public List<LiqFacHostAgr> getLiqFacHostAgrs() {
    return nullIfNotFound(liqFacHostAgrs);
  }

  /** The facility table. A credit arrangement established by the bank for the client. */
  public List<LiqFacility> getLiqFacilities() {
    return nullIfNotFound(liqFacilities);
  }

  /** The outstanding table. Outstanding amounts and dates for loans and letters of credit. */
  public List<LiqOutstanding> getLiqOutstandings() {
    return nullIfNotFound(liqOutstandings);
  }

  // Setter HERE
  /** The Unique ID of the Deal. */
  public void setPidDeal(String pidDeal) {
    this.pidDeal = pidDeal;
  }

  /** The global deal proposed commitment amount (requested by the borrower prior to deal close). */
  public void setAmtGloPreclo(BigDecimal amtGloPreclo) {
    this.amtGloPreclo = amtGloPreclo;
  }

  /** */
  public void setAmtNacrTlrnc(BigDecimal amtNacrTlrnc) {
    this.amtNacrTlrnc = amtNacrTlrnc;
  }

  /** The code identifying the LS2 Client Bank (the purchaser of LS2). */
  public void setCdeBank(String cdeBank) {
    this.cdeBank = cdeBank;
  }

  /** The Owning Branch of the deal. */
  public void setCdeBranch(String cdeBranch) {
    this.cdeBranch = cdeBranch;
  }

  /** The deal create assignment code; indicates if assignments can be created in deal. */
  public void setCdeCrAsn(String cdeCrAsn) {
    this.cdeCrAsn = cdeCrAsn;
  }

  /** The deal create participation code; indicates if participations can be created in the deal. */
  public void setCdeCrPartic(String cdeCrPartic) {
    this.cdeCrPartic = cdeCrPartic;
  }

  /** The deal classification code. */
  public void setCdeDealClass(String cdeDealClass) {
    this.cdeDealClass = cdeDealClass;
  }

  /** The deal status code. */
  public void setCdeDealStat(String cdeDealStat) {
    this.cdeDealStat = cdeDealStat;
  }

  /** The deal department subtype code. */
  public void setCdeDepSubtyp(String cdeDepSubtyp) {
    this.cdeDepSubtyp = cdeDepSubtyp;
  }

  /** The deal department code. */
  public void setCdeDept(String cdeDept) {
    this.cdeDept = cdeDept;
  }

  /** The deal expense code. */
  public void setCdeExpense(String cdeExpense) {
    this.cdeExpense = cdeExpense;
  }

  /**
   * determines the order in which payments from the borrower should be applied to billed items
   * (i.e. Principal, then interest, then Fees, etc.). If not set at the deal level, the Syatem
   * Parameter value is used.
   */
  public void setCdeInpalRule(String cdeInpalRule) {
    this.cdeInpalRule = cdeInpalRule;
  }

  /** The deal currency. */
  public void setCdeOrigCcy(String cdeOrigCcy) {
    this.cdeOrigCcy = cdeOrigCcy;
  }

  /**
   * determines how payments from the borrower should be applied to past due bill items (i.e. start
   * from the oldest bill each in entirety based on the INPAL rule, start from current bill each in
   * entirety based on the INPAL rule, current or oldest paying off all of one category at a time
   * based on INPAL rule)
   */
  public void setCdePdlgcRule(String cdePdlgcRule) {
    this.cdePdlgcRule = cdePdlgcRule;
  }

  /**
   * &quot;The deal&apos;s performing status, indicating whether or not the Admin Fees defined for
   * this deal are accruing or amortizing, as applicable.&quot;
   */
  public void setCdePerforming(String cdePerforming) {
    this.cdePerforming = cdePerforming;
  }

  /** The deal&apos;s processing area. */
  public void setCdeProcArea(String cdeProcArea) {
    this.cdeProcArea = cdeProcArea;
  }

  /** &quot;The reason why this deal has been marked &quot;&quot;Not For Sale&quot;&quot;.&quot; */
  public void setCdeReasonNfs(String cdeReasonNfs) {
    this.cdeReasonNfs = cdeReasonNfs;
  }

  /** The deal&apos;s selling stage code. */
  public void setCdeSellStage(String cdeSellStage) {
    this.cdeSellStage = cdeSellStage;
  }

  /**
   * The reason why this deal was terminated. This field is no longer maintained and should be
   * removed from the database.
   */
  public void setCdeTermReasn(String cdeTermReasn) {
    this.cdeTermReasn = cdeTermReasn;
  }

  /** The date of the Credit Agreement governing the deal. */
  public void setDteAgreement(Date dteAgreement) {
    this.dteAgreement = dteAgreement;
  }

  /** The date the deal was approved. */
  public void setDteApproved(Date dteApproved) {
    this.dteApproved = dteApproved;
  }

  /** The effective date of the cancellation of the deal. */
  public void setDteCancelEff(Date dteCancelEff) {
    this.dteCancelEff = dteCancelEff;
  }

  /** The date the commitment letter was received. */
  public void setDteCommitLtr(Date dteCommitLtr) {
    this.dteCommitLtr = dteCommitLtr;
  }

  /**
   * &quot;The effective date of the deal closing (sometimes referred to as the &quot;&quot;Deal
   * Effective Date&quot;&quot;).&quot;
   */
  public void setDteDealClsd(Date dteDealClsd) {
    this.dteDealClsd = dteDealClsd;
  }

  /** The cut-off date to add a facility to the deal. */
  public void setDteFacCutoff(Date dteFacCutoff) {
    this.dteFacCutoff = dteFacCutoff;
  }

  /** The date the deal was last reviewed. */
  public void setDteLastRevwd(Date dteLastRevwd) {
    this.dteLastRevwd = dteLastRevwd;
  }

  /** The projected closing date for the deal. */
  public void setDteProjClose(Date dteProjClose) {
    this.dteProjClose = dteProjClose;
  }

  /** The SBLC Usage Expiration Date (the latest date on which an SBLC for this deal can expire). */
  public void setDteSblcExp(Date dteSblcExp) {
    this.dteSblcExp = dteSblcExp;
  }

  /**
   * &quot;The SBLC &quot;&quot;Last Issuance By&quot;&quot; Date, after which no new SBLC&apos;s
   * can be issued for this deal.&quot;
   */
  public void setDteSblcIssue(Date dteSblcIssue) {
    this.dteSblcIssue = dteSblcIssue;
  }

  /** The effective date of the termination. */
  public void setDteTermEff(Date dteTermEff) {
    this.dteTermEff = dteTermEff;
  }

  /** Indicates whether or not accounting is enabled. */
  public void setIndAcctEnabl(Boolean indAcctEnabl) {
    this.indAcctEnabl = indAcctEnabl;
  }

  /** Indicates whether or not the deal is active. */
  public void setIndActive(Boolean indActive) {
    this.indActive = indActive;
  }

  /**
   * &quot;Indicates if circles for this deal settle &quot;&quot;Actual&quot;&quot; or
   * &quot;&quot;Flat&quot;&quot; during an Interest or Fee period. &quot;&quot;Actual&quot;&quot;:
   * seller receives interest/fees prior to settlement and buyer receives interest/fees after
   * settlement. &quot;&quot;Flat&quot;&quot;: buyer r&quot;
   */
  public void setIndActual(Boolean indActual) {
    this.indActual = indActual;
  }

  /** Indicates whether transactions for this deal will be auto-generated. */
  public void setIndAutoGen(Boolean indAutoGen) {
    this.indAutoGen = indAutoGen;
  }

  /** */
  public void setIndAutoNonp(Boolean indAutoNonp) {
    this.indAutoNonp = indAutoNonp;
  }

  /**
   * Indicate whether to charge the Prepayment Penalty Event Fee automaticaly. Default value is
   * &apos;N&apos;
   */
  public void setIndAutoPrepf(Boolean indAutoPrepf) {
    this.indAutoPrepf = indAutoPrepf;
  }

  /** Indicates whether transactions for this deal will be auto-released. */
  public void setIndAutoRel(Boolean indAutoRel) {
    this.indAutoRel = indAutoRel;
  }

  /** Indicates whether or not bills for this deal are consolidated. */
  public void setIndCnslBill(Boolean indCnslBill) {
    this.indCnslBill = indCnslBill;
  }

  /** Indicates whether or not this deal complies with the Community Reinvestment Act. */
  public void setIndCra(Boolean indCra) {
    this.indCra = indCra;
  }

  /** Indicator whether a deal cusip is listed or not */
  public void setIndCusipLst(Boolean indCusipLst) {
    this.indCusipLst = indCusipLst;
  }

  /** none */
  public void setIndDontMail(Boolean indDontMail) {
    this.indDontMail = indDontMail;
  }

  /** none */
  public void setIndDontPrnt(Boolean indDontPrnt) {
    this.indDontPrnt = indDontPrnt;
  }

  /**
   * &quot;Indicates whether or not the deal is in the ,&apos;early discussion,&apos; stage. If so,
   * salespersons. traders and asset managers will not be able to see the deal.&quot;
   */
  public void setIndEarlyDisc(Boolean indEarlyDisc) {
    this.indEarlyDisc = indEarlyDisc;
  }

  /** &quot;Indicates whether or not it is &quot;&quot;OK to Fund&quot;&quot; this deal.&quot; */
  public void setIndFund(Boolean indFund) {
    this.indFund = indFund;
  }

  /** Indicates whether or not a guarantee exists at the deal level. */
  public void setIndGuarDeal(Boolean indGuarDeal) {
    this.indGuarDeal = indGuarDeal;
  }

  /** Indicates whether or not the deal is a highly leveraged transaction (HLT). */
  public void setIndHlt(Boolean indHlt) {
    this.indHlt = indHlt;
  }

  /** none */
  public void setIndIncXmlbil(Boolean indIncXmlbil) {
    this.indIncXmlbil = indIncXmlbil;
  }

  /**
   * &quot;Indicates whether or not the deal is eligible for &quot;&quot;Shared National
   * Credit&quot;&quot; reporting.&quot;
   */
  public void setIndNatnlCrdt(Boolean indNatnlCrdt) {
    this.indNatnlCrdt = indNatnlCrdt;
  }

  /**
   * Indicates whether or not the deal is a Closed Non-Host Bank Deal. This field is not maintained
   * and should be removed from the database.
   */
  public void setIndOutsdDeal(Boolean indOutsdDeal) {
    this.indOutsdDeal = indOutsdDeal;
  }

  /** */
  public void setIndPastDueb(Boolean indPastDueb) {
    this.indPastDueb = indPastDueb;
  }

  /** Indicates whether or not access to the deal is restricted to specific users. */
  public void setIndRestrict(Boolean indRestrict) {
    this.indRestrict = indRestrict;
  }

  /**
   * &quot;Indicates whether or not &quot;&quot;reserve adjusted rates&quot;&quot; apply to this
   * deal.&quot;
   */
  public void setIndRsrvAdj(Boolean indRsrvAdj) {
    this.indRsrvAdj = indRsrvAdj;
  }

  /**
   * &quot;Indicates whether or not the deal is a &quot;&quot;sole lender deal,&quot;&quot; meaning
   * it has only one contractual circle (the Host Bank Origination Primary).&quot;
   */
  public void setIndSoleLendr(Boolean indSoleLendr) {
    this.indSoleLendr = indSoleLendr;
  }

  /** The alias name for the deal. */
  public void setNmeAliasName(String nmeAliasName) {
    this.nmeAliasName = nmeAliasName;
  }

  /** The name of the deal. */
  public void setNmeDeal(String nmeDeal) {
    this.nmeDeal = nmeDeal;
  }

  /**
   * &quot;The Deal Tracking Number, a control number providing another way of uniquely identifying
   * the deal.&quot;
   */
  public void setNumDealCntl(String numDealCntl) {
    this.numDealCntl = numDealCntl;
  }

  /** Euro Interim Rounding Precision */
  public void setNumEuroIntrm(Integer numEuroIntrm) {
    this.numEuroIntrm = numEuroIntrm;
  }

  /**
   * &quot;The deal&apos;s grace period, defining the number of days after which an interest or
   * principal payment will be considered &quot;&quot;past due&quot;&quot; for the purpose of
   * assessing a &quot;&quot;defoult penalty spread&quot;&quot;. (Should not be confused with the
   * General Ledg&quot;
   */
  public void setNumGracePer(Integer numGracePer) {
    this.numGracePer = numGracePer;
  }

  /** The maximum number of active matchfunded loans allowed for the deal. */
  public void setNumMatchDraw(Integer numMatchDraw) {
    this.numMatchDraw = numMatchDraw;
  }

  /** The maximum number of active loans allowed for the deal. */
  public void setNumMaxDraw(Integer numMaxDraw) {
    this.numMaxDraw = numMaxDraw;
  }

  /** */
  public void setPctNacrTlrnc(BigDecimal pctNacrTlrnc) {
    this.pctNacrTlrnc = pctNacrTlrnc;
  }

  /** contains RID of collateral group each deal belongs to */
  public void setRidCollatDef(String ridCollatDef) {
    this.ridCollatDef = ridCollatDef;
  }

  /**
   * &quot;Number between 0 and 100 that represents the difficulty factor for selling the deal,
   * referenced when assigning sales credit.&quot;
   */
  public void setRtoFctSaldif(BigDecimal rtoFctSaldif) {
    this.rtoFctSaldif = rtoFctSaldif;
  }

  /** Timestamp from when this row was created. */
  public void setTspRecCreate(Date tspRecCreate) {
    this.tspRecCreate = tspRecCreate;
  }

  /** Timestamp from when this row was last updated. */
  public void setTspRecUpdate(Date tspRecUpdate) {
    this.tspRecUpdate = tspRecUpdate;
  }

  /** To store 9-digit deal cusip number */
  public void setTxtCusipNum(String txtCusipNum) {
    this.txtCusipNum = txtCusipNum;
  }

  /** To store 12-digit deal isin number */
  public void setTxtIsinNum(String txtIsinNum) {
    this.txtIsinNum = txtIsinNum;
  }

  /** The User ID of the Deal Adminstrator specifically assigned to the Deal Team. */
  public void setUidAdmnstratr(String uidAdmnstratr) {
    this.uidAdmnstratr = uidAdmnstratr;
  }

  /** The User ID of the last reviewer. */
  public void setUidLastRevwr(String uidLastRevwr) {
    this.uidLastRevwr = uidLastRevwr;
  }

  /** The User ID of the originator of the deal. */
  public void setUidOriginator(String uidOriginator) {
    this.uidOriginator = uidOriginator;
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

  /** The User ID of the Relationship Manager specifically assigned to the Deal Team. */
  public void setUidRelManagr(String uidRelManagr) {
    this.uidRelManagr = uidRelManagr;
  }

  /**
   * &quot;The Alternate ID, providing an alternate method of uniquely identifying the deal.&quot;
   */
  public void setXidAltDealid(String xidAltDealid) {
    this.xidAltDealid = xidAltDealid;
  }

  /**
   * &quot;The ANSI ID, a Loan Identification Number assigned by the Loan Pricing Corporation to
   * uniquely identify the deal.&quot;
   */
  public void setXidAnsiId(String xidAnsiId) {
    this.xidAnsiId = xidAnsiId;
  }

  /**
   * &quot;The Reference ID optionally assigned to a deal that is eligible for &quot;&quot;Shared
   * National Credit&quot;&quot; reporting.&quot;
   */
  public void setXidNatnlCrdt(String xidNatnlCrdt) {
    this.xidNatnlCrdt = xidNatnlCrdt;
  }

  /** */
  public void setLiqCodeBank(PojoCodeBank liqCodeBank) {
    this.liqCodeBank = liqCodeBank;
  }

  /** The branch table. */
  public void setLiqBranch(PojoBranch liqBranch) {
    this.liqBranch = liqBranch;
  }

  /** The deal administrator table. Management of money transfer between lenders and borrowers. */
  public void setLiqDealAdmin(PojoDealAdmin liqDealAdmin) {
    this.liqDealAdmin = liqDealAdmin;
  }

  /** The deal borrower table. The borrowers that are associated with a deal. */
  public void addLiqDealBorrowers(List<PojoDealBorrower> liqDealBorrowers) {
    if (this.liqDealBorrowers == null) {
      this.liqDealBorrowers = new ArrayList<>(liqDealBorrowers.size());
    }
    this.liqDealBorrowers.addAll(liqDealBorrowers);
    liqDealBorrowers.forEach(e -> e.setLiqDeal(this));
  }

  /**
   * The facility commitment transaction table. Transactions which affect a lender's position in a
   * facility.
   */
  public void addLiqFacCommitTrns(List<PojoFacCommitTrn> liqFacCommitTrns) {
    if (this.liqFacCommitTrns == null) {
      this.liqFacCommitTrns = new ArrayList<>(liqFacCommitTrns.size());
    }
    this.liqFacCommitTrns.addAll(liqFacCommitTrns);
    liqFacCommitTrns.forEach(e -> e.setLiqDeal(this));
  }

  /**
   * The facility host bank agregation. Finstra version was almost empty -> filled by best knowledge
   */
  public void addLiqFacHostAgrs(List<PojoFacHostAgr> liqFacHostAgrs) {
    if (this.liqFacHostAgrs == null) {
      this.liqFacHostAgrs = new ArrayList<>(liqFacHostAgrs.size());
    }
    this.liqFacHostAgrs.addAll(liqFacHostAgrs);
    liqFacHostAgrs.forEach(e -> e.setLiqDeal(this));
  }

  /** The facility table. A credit arrangement established by the bank for the client. */
  public void addLiqFacilities(List<PojoFacility> liqFacilities) {
    if (this.liqFacilities == null) {
      this.liqFacilities = new ArrayList<>(liqFacilities.size());
    }
    this.liqFacilities.addAll(liqFacilities);
    liqFacilities.forEach(e -> e.setLiqDeal(this));
  }

  /** The outstanding table. Outstanding amounts and dates for loans and letters of credit. */
  public void addLiqOutstandings(List<PojoOutstanding> liqOutstandings) {
    if (this.liqOutstandings == null) {
      this.liqOutstandings = new ArrayList<>(liqOutstandings.size());
    }
    this.liqOutstandings.addAll(liqOutstandings);
    liqOutstandings.forEach(e -> e.setLiqDeal(this));
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
    PojoDeal other = (PojoDeal) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.pidDeal, other.pidDeal);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(PojoDeal other) {
    CompareHelper helper = new CompareHelper();
    helper.append("pidDeal", this.pidDeal, other.pidDeal);
    helper.append("amtGloPreclo", this.amtGloPreclo, other.amtGloPreclo);
    helper.append("amtNacrTlrnc", this.amtNacrTlrnc, other.amtNacrTlrnc);
    helper.append("cdeBank", this.cdeBank, other.cdeBank);
    helper.append("cdeBranch", this.cdeBranch, other.cdeBranch);
    helper.append("cdeCrAsn", this.cdeCrAsn, other.cdeCrAsn);
    helper.append("cdeCrPartic", this.cdeCrPartic, other.cdeCrPartic);
    helper.append("cdeDealClass", this.cdeDealClass, other.cdeDealClass);
    helper.append("cdeDealStat", this.cdeDealStat, other.cdeDealStat);
    helper.append("cdeDepSubtyp", this.cdeDepSubtyp, other.cdeDepSubtyp);
    helper.append("cdeDept", this.cdeDept, other.cdeDept);
    helper.append("cdeExpense", this.cdeExpense, other.cdeExpense);
    helper.append("cdeInpalRule", this.cdeInpalRule, other.cdeInpalRule);
    helper.append("cdeOrigCcy", this.cdeOrigCcy, other.cdeOrigCcy);
    helper.append("cdePdlgcRule", this.cdePdlgcRule, other.cdePdlgcRule);
    helper.append("cdePerforming", this.cdePerforming, other.cdePerforming);
    helper.append("cdeProcArea", this.cdeProcArea, other.cdeProcArea);
    helper.append("cdeReasonNfs", this.cdeReasonNfs, other.cdeReasonNfs);
    helper.append("cdeSellStage", this.cdeSellStage, other.cdeSellStage);
    helper.append("cdeTermReasn", this.cdeTermReasn, other.cdeTermReasn);
    helper.append("dteAgreement", this.dteAgreement, other.dteAgreement);
    helper.append("dteApproved", this.dteApproved, other.dteApproved);
    helper.append("dteCancelEff", this.dteCancelEff, other.dteCancelEff);
    helper.append("dteCommitLtr", this.dteCommitLtr, other.dteCommitLtr);
    helper.append("dteDealClsd", this.dteDealClsd, other.dteDealClsd);
    helper.append("dteFacCutoff", this.dteFacCutoff, other.dteFacCutoff);
    helper.append("dteLastRevwd", this.dteLastRevwd, other.dteLastRevwd);
    helper.append("dteProjClose", this.dteProjClose, other.dteProjClose);
    helper.append("dteSblcExp", this.dteSblcExp, other.dteSblcExp);
    helper.append("dteSblcIssue", this.dteSblcIssue, other.dteSblcIssue);
    helper.append("dteTermEff", this.dteTermEff, other.dteTermEff);
    helper.append("indAcctEnabl", this.indAcctEnabl, other.indAcctEnabl);
    helper.append("indActive", this.indActive, other.indActive);
    helper.append("indActual", this.indActual, other.indActual);
    helper.append("indAutoGen", this.indAutoGen, other.indAutoGen);
    helper.append("indAutoNonp", this.indAutoNonp, other.indAutoNonp);
    helper.append("indAutoPrepf", this.indAutoPrepf, other.indAutoPrepf);
    helper.append("indAutoRel", this.indAutoRel, other.indAutoRel);
    helper.append("indCnslBill", this.indCnslBill, other.indCnslBill);
    helper.append("indCra", this.indCra, other.indCra);
    helper.append("indCusipLst", this.indCusipLst, other.indCusipLst);
    helper.append("indDontMail", this.indDontMail, other.indDontMail);
    helper.append("indDontPrnt", this.indDontPrnt, other.indDontPrnt);
    helper.append("indEarlyDisc", this.indEarlyDisc, other.indEarlyDisc);
    helper.append("indFund", this.indFund, other.indFund);
    helper.append("indGuarDeal", this.indGuarDeal, other.indGuarDeal);
    helper.append("indHlt", this.indHlt, other.indHlt);
    helper.append("indIncXmlbil", this.indIncXmlbil, other.indIncXmlbil);
    helper.append("indNatnlCrdt", this.indNatnlCrdt, other.indNatnlCrdt);
    helper.append("indOutsdDeal", this.indOutsdDeal, other.indOutsdDeal);
    helper.append("indPastDueb", this.indPastDueb, other.indPastDueb);
    helper.append("indRestrict", this.indRestrict, other.indRestrict);
    helper.append("indRsrvAdj", this.indRsrvAdj, other.indRsrvAdj);
    helper.append("indSoleLendr", this.indSoleLendr, other.indSoleLendr);
    helper.append("nmeAliasName", this.nmeAliasName, other.nmeAliasName);
    helper.append("nmeDeal", this.nmeDeal, other.nmeDeal);
    helper.append("numDealCntl", this.numDealCntl, other.numDealCntl);
    helper.append("numEuroIntrm", this.numEuroIntrm, other.numEuroIntrm);
    helper.append("numGracePer", this.numGracePer, other.numGracePer);
    helper.append("numMatchDraw", this.numMatchDraw, other.numMatchDraw);
    helper.append("numMaxDraw", this.numMaxDraw, other.numMaxDraw);
    helper.append("pctNacrTlrnc", this.pctNacrTlrnc, other.pctNacrTlrnc);
    helper.append("ridCollatDef", this.ridCollatDef, other.ridCollatDef);
    helper.append("rtoFctSaldif", this.rtoFctSaldif, other.rtoFctSaldif);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("txtCusipNum", this.txtCusipNum, other.txtCusipNum);
    helper.append("txtIsinNum", this.txtIsinNum, other.txtIsinNum);
    helper.append("uidAdmnstratr", this.uidAdmnstratr, other.uidAdmnstratr);
    helper.append("uidLastRevwr", this.uidLastRevwr, other.uidLastRevwr);
    helper.append("uidOriginator", this.uidOriginator, other.uidOriginator);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    helper.append("uidRelManagr", this.uidRelManagr, other.uidRelManagr);
    helper.append("xidAltDealid", this.xidAltDealid, other.xidAltDealid);
    helper.append("xidAnsiId", this.xidAnsiId, other.xidAnsiId);
    helper.append("xidNatnlCrdt", this.xidNatnlCrdt, other.xidNatnlCrdt);
    return helper;
  }
}
