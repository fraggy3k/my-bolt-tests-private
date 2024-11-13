/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.original;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;
import org.hibernate.annotations.JoinFormula;
import org.smartdatahub.liq.entity.interfaces.LiqBranch;
import org.smartdatahub.liq.entity.interfaces.LiqCodeBank;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqDealAdmin;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.interfaces.LiqFacCommitTrn;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.utils.BooleanToStringConverter;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * The deal table. A record of a borrowing agreement between the lender and the borrower which may
 * encompass one or more credit facilities.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@Entity
@Table(name = "VLS_DEAL")
public class VlsDeal
    implements LiqDeal, Identifiable<String>, Serializable, EqualsSimpleFieldSupport<VlsDeal> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "DEA";

  @Column(name = "DEA_PID_DEAL", nullable = false, length = 8)
  @Id
  private /*4*/ String pidDeal;

  @Column(name = "DEA_AMT_GLO_PRECLO", nullable = false, length = 28, scale = 3)
  private /*4*/ BigDecimal amtGloPreclo;

  @Column(name = "DEA_AMT_NACR_TLRNC", nullable = false, length = 28, scale = 3)
  private /*4*/ BigDecimal amtNacrTlrnc;

  @Column(name = "DEA_CDE_BANK", nullable = false, length = 5)
  private /*4*/ String cdeBank;

  @Column(name = "DEA_CDE_BRANCH", nullable = false, length = 5)
  private /*4*/ String cdeBranch;

  @Column(name = "DEA_CDE_CR_ASN", nullable = true, length = 5)
  private /*4*/ String cdeCrAsn;

  @Column(name = "DEA_CDE_CR_PARTIC", nullable = true, length = 5)
  private /*4*/ String cdeCrPartic;

  @Column(name = "DEA_CDE_DEAL_CLASS", nullable = true, length = 5)
  private /*4*/ String cdeDealClass;

  @Column(name = "DEA_CDE_DEAL_STAT", nullable = true, length = 5)
  private /*4*/ String cdeDealStat;

  @Column(name = "DEA_CDE_DEP_SUBTYP", nullable = true, length = 5)
  private /*4*/ String cdeDepSubtyp;

  @Column(name = "DEA_CDE_DEPT", nullable = false, length = 5)
  private /*4*/ String cdeDept;

  @Column(name = "DEA_CDE_EXPENSE", nullable = true, length = 15)
  private /*4*/ String cdeExpense;

  @Column(name = "DEA_CDE_INPAL_RULE", nullable = true, length = 10)
  private /*4*/ String cdeInpalRule;

  @Column(name = "DEA_CDE_ORIG_CCY", nullable = true, length = 3)
  private /*4*/ String cdeOrigCcy;

  @Column(name = "DEA_CDE_PDLGC_RULE", nullable = true, length = 10)
  private /*4*/ String cdePdlgcRule;

  @Column(name = "DEA_CDE_PERFORMING", nullable = false, length = 5)
  private /*4*/ String cdePerforming;

  @Column(name = "DEA_CDE_PROC_AREA", nullable = false, length = 5)
  private /*4*/ String cdeProcArea;

  @Column(name = "DEA_CDE_REASON_NFS", nullable = true, length = 5)
  private /*4*/ String cdeReasonNfs;

  @Column(name = "DEA_CDE_SELL_STAGE", nullable = false, length = 5)
  private /*4*/ String cdeSellStage;

  @Column(name = "DEA_CDE_TERM_REASN", nullable = true, length = 5)
  private /*4*/ String cdeTermReasn;

  @Column(name = "DEA_DTE_AGREEMENT", nullable = true)
  private /*4*/ Date dteAgreement;

  @Column(name = "DEA_DTE_APPROVED", nullable = true)
  private /*4*/ Date dteApproved;

  @Column(name = "DEA_DTE_CANCEL_EFF", nullable = true)
  private /*4*/ Date dteCancelEff;

  @Column(name = "DEA_DTE_COMMIT_LTR", nullable = true)
  private /*4*/ Date dteCommitLtr;

  @Column(name = "DEA_DTE_DEAL_CLSD", nullable = true)
  private /*4*/ Date dteDealClsd;

  @Column(name = "DEA_DTE_FAC_CUTOFF", nullable = true)
  private /*4*/ Date dteFacCutoff;

  @Column(name = "DEA_DTE_LAST_REVWD", nullable = true)
  private /*4*/ Date dteLastRevwd;

  @Column(name = "DEA_DTE_PROJ_CLOSE", nullable = true)
  private /*4*/ Date dteProjClose;

  @Column(name = "DEA_DTE_SBLC_EXP", nullable = true)
  private /*4*/ Date dteSblcExp;

  @Column(name = "DEA_DTE_SBLC_ISSUE", nullable = true)
  private /*4*/ Date dteSblcIssue;

  @Column(name = "DEA_DTE_TERM_EFF", nullable = true)
  private /*4*/ Date dteTermEff;

  @Column(name = "DEA_IND_ACCT_ENABL", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indAcctEnabl;

  @Column(name = "DEA_IND_ACTIVE", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indActive;

  @Column(name = "DEA_IND_ACTUAL", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indActual;

  @Column(name = "DEA_IND_AUTO_GEN", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indAutoGen;

  @Column(name = "DEA_IND_AUTO_NONP", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indAutoNonp;

  @Column(name = "DEA_IND_AUTO_PREPF", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indAutoPrepf;

  @Column(name = "DEA_IND_AUTO_REL", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indAutoRel;

  @Column(name = "DEA_IND_CNSL_BILL", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indCnslBill;

  @Column(name = "DEA_IND_CRA", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indCra;

  @Column(name = "DEA_IND_CUSIP_LST", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indCusipLst;

  @Column(name = "DEA_IND_DONT_MAIL", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indDontMail;

  @Column(name = "DEA_IND_DONT_PRNT", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indDontPrnt;

  @Column(name = "DEA_IND_EARLY_DISC", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indEarlyDisc;

  @Column(name = "DEA_IND_FUND", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indFund;

  @Column(name = "DEA_IND_GUAR_DEAL", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indGuarDeal;

  @Column(name = "DEA_IND_HLT", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indHlt;

  @Column(name = "DEA_IND_INC_XMLBIL", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indIncXmlbil;

  @Column(name = "DEA_IND_NATNL_CRDT", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indNatnlCrdt;

  @Column(name = "DEA_IND_OUTSD_DEAL", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOutsdDeal;

  @Column(name = "DEA_IND_PAST_DUEB", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indPastDueb;

  @Column(name = "DEA_IND_RESTRICT", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indRestrict;

  @Column(name = "DEA_IND_RSRV_ADJ", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indRsrvAdj;

  @Column(name = "DEA_IND_SOLE_LENDR", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indSoleLendr;

  @Column(name = "DEA_NME_ALIAS_NAME", nullable = false, length = 40)
  private /*4*/ String nmeAliasName;

  @Column(name = "DEA_NME_DEAL", nullable = false, length = 40)
  private /*4*/ String nmeDeal;

  @Column(name = "DEA_NUM_DEAL_CNTL", nullable = false, length = 12)
  private /*4*/ String numDealCntl;

  @Column(name = "DEA_NUM_EURO_INTRM", nullable = false, length = 2)
  private /*4*/ Integer numEuroIntrm;

  @Column(name = "DEA_NUM_GRACE_PER", nullable = false, length = 4)
  private /*4*/ Integer numGracePer;

  @Column(name = "DEA_NUM_MATCH_DRAW", nullable = false, length = 2)
  private /*4*/ Integer numMatchDraw;

  @Column(name = "DEA_NUM_MAX_DRAW", nullable = false, length = 2)
  private /*4*/ Integer numMaxDraw;

  @Column(name = "DEA_PCT_NACR_TLRNC", nullable = false, length = 15, scale = 14)
  private /*4*/ BigDecimal pctNacrTlrnc;

  @Column(name = "DEA_RID_COLLAT_DEF", nullable = true, length = 8)
  private /*4*/ String ridCollatDef;

  @Column(name = "DEA_RTO_FCT_SALDIF", nullable = false, length = 15, scale = 11)
  private /*4*/ BigDecimal rtoFctSaldif;

  @Column(name = "DEA_TSP_REC_CREATE", nullable = false)
  private /*4*/ Date tspRecCreate;

  @Column(name = "DEA_TSP_REC_UPDATE", nullable = false)
  private /*4*/ Date tspRecUpdate;

  @Column(name = "DEA_TXT_CUSIP_NUM", nullable = true, length = 9)
  private /*4*/ String txtCusipNum;

  @Column(name = "DEA_TXT_ISIN_NUM", nullable = true, length = 12)
  private /*4*/ String txtIsinNum;

  @Column(name = "DEA_UID_ADMNSTRATR", nullable = true, length = 8)
  private /*4*/ String uidAdmnstratr;

  @Column(name = "DEA_UID_LAST_REVWR", nullable = true, length = 8)
  private /*4*/ String uidLastRevwr;

  @Column(name = "DEA_UID_ORIGINATOR", nullable = true, length = 8)
  private /*4*/ String uidOriginator;

  @Column(name = "DEA_UID_REC_CREATE", nullable = false, length = 8)
  private /*4*/ String uidRecCreate;

  @Column(name = "DEA_UID_REC_UPDATE", nullable = false, length = 8)
  private /*4*/ String uidRecUpdate;

  @Column(name = "DEA_UID_REL_MANAGR", nullable = true, length = 8)
  private /*4*/ String uidRelManagr;

  @Column(name = "DEA_XID_ALT_DEALID", nullable = false, length = 10)
  private /*4*/ String xidAltDealid;

  @Column(name = "DEA_XID_ANSI_ID", nullable = false, length = 9)
  private /*4*/ String xidAnsiId;

  @Column(name = "DEA_XID_NATNL_CRDT", nullable = false, length = 8)
  private /*4*/ String xidNatnlCrdt;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumnsOrFormulas(
      value = {
        @JoinColumnOrFormula(
            formula =
                @JoinFormula(
                    referencedColumnName = VlsFamGlobal2.DISCRIMINATOR_COLUMN,
                    value = CodeBank.QUOTED_DISCRIMINATOR_VALUE)),
        @JoinColumnOrFormula(
            column =
                @JoinColumn(
                    name = "DEA_CDE_BANK",
                    referencedColumnName = "GB2_CDE_CODE",
                    insertable = false,
                    updatable = false))
      })
  private /*3*/ CodeBank liqCodeBank;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "DEA_CDE_BRANCH", insertable = false, updatable = false)
  private /*3*/ VlsBranch liqBranch;

  @OneToOne(mappedBy = "liqDeal", fetch = FetchType.LAZY, targetEntity = VlsDealAdmin.class)
  private /*3*/ VlsDealAdmin liqDealAdmin;

  @OneToMany(mappedBy = "liqDeal", fetch = FetchType.LAZY, targetEntity = VlsDealBorrower.class)
  private List</*1*/ LiqDealBorrower> liqDealBorrowers;

  @OneToMany(mappedBy = "liqDeal", fetch = FetchType.LAZY, targetEntity = VlsFacCommitTrn.class)
  private List</*1*/ LiqFacCommitTrn> liqFacCommitTrns;

  @OneToMany(mappedBy = "liqDeal", fetch = FetchType.LAZY, targetEntity = VlsFacility.class)
  private List</*1*/ LiqFacility> liqFacilities;

  @OneToMany(mappedBy = "liqDeal", fetch = FetchType.LAZY, targetEntity = VlsOutstanding.class)
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

  /** The facility table. A credit arrangement established by the bank for the client. */
  public List<LiqFacility> getLiqFacilities() {
    return nullIfNotFound(liqFacilities);
  }

  /** The outstanding table. Outstanding amounts and dates for loans and letters of credit. */
  public List<LiqOutstanding> getLiqOutstandings() {
    return nullIfNotFound(liqOutstandings);
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
    VlsDeal other = (VlsDeal) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.pidDeal, other.pidDeal);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(VlsDeal other) {
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
