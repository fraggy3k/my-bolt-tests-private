/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.snapshot;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqOstTran;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.utils.BooleanToStringConverter;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * The outstanding table. Outstanding amounts and dates for loans and letters of credit.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@Entity
@Table(name = "SNAP_OUTSTANDING")
public class SnapshotOutstanding
    implements LiqOutstanding,
        Identifiable<String>,
        Serializable,
        EqualsSimpleFieldSupport<SnapshotOutstanding> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "OST";

  @Id
  @Column(name = "ID", length = 35)
  private /*4*/ String id;

  @Column(name = "OST_AMT_BANK_GROSS", nullable = false, length = 28, scale = 3)
  private /*4*/ BigDecimal amtBankGross;

  @Column(name = "OST_AMT_BANK_NET", nullable = false, length = 28, scale = 3)
  private /*4*/ BigDecimal amtBankNet;

  @Column(name = "OST_AMT_CURRENT", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtCurrent;

  @Column(name = "OST_AMT_FC_BNK_GRS", nullable = false, length = 28, scale = 3)
  private /*4*/ BigDecimal amtFcBnkGrs;

  @Column(name = "OST_AMT_FC_BNK_NET", nullable = false, length = 28, scale = 3)
  private /*4*/ BigDecimal amtFcBnkNet;

  @Column(name = "OST_AMT_FC_CURRENT", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtFcCurrent;

  @Column(name = "OST_AMT_NACR_TLRNC", nullable = false, length = 28, scale = 3)
  private /*4*/ BigDecimal amtNacrTlrnc;

  @Column(name = "OST_AMT_ORIGINAL", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtOriginal;

  @Column(name = "OST_AMT_SCHED_BAL", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtSchedBal;

  @Column(name = "OST_CDE_ACR_PERIOD", nullable = true, length = 5)
  private /*4*/ String cdeAcrPeriod;

  @Column(name = "OST_CDE_ACT_ACR_RL", nullable = true, length = 5)
  private /*4*/ String cdeActAcrRl;

  @Column(name = "OST_CDE_ANVDTE_EOM", nullable = true, length = 5)
  private /*4*/ String cdeAnvdteEom;

  @Column(name = "OST_CDE_CURRENCY", nullable = true, length = 3)
  private /*4*/ String cdeCurrency;

  @Column(name = "OST_CDE_DEC_PRECN", nullable = true, length = 5)
  private /*4*/ String cdeDecPrecn;

  @Column(name = "OST_CDE_DEC_ROUND", nullable = true, length = 5)
  private /*4*/ String cdeDecRound;

  @Column(name = "OST_CDE_ENDTE_RULE", nullable = false, length = 5)
  private /*4*/ String cdeEndteRule;

  @Column(name = "OST_CDE_EXTENSION", nullable = true, length = 5)
  private /*4*/ String cdeExtension;

  @Column(name = "OST_CDE_FRAC_IRATE", nullable = true, length = 5)
  private /*4*/ String cdeFracIrate;

  @Column(name = "OST_CDE_FRAC_ROUND", nullable = true, length = 5)
  private /*4*/ String cdeFracRound;

  @Column(name = "OST_CDE_FRG_WTHHLD", nullable = true, length = 5)
  private /*4*/ String cdeFrgWthhld;

  @Column(name = "OST_CDE_GL_CLASS", nullable = true, length = 5)
  private /*4*/ String cdeGlClass;

  @Column(name = "OST_CDE_LOAN_PURP", nullable = true, length = 5)
  private /*4*/ String cdeLoanPurp;

  @Column(name = "OST_CDE_OB_ST_CTG", nullable = false, length = 5)
  private /*4*/ String cdeObStCtg;

  @Column(name = "OST_CDE_OBJ_STATE", nullable = false, length = 5)
  private /*4*/ String cdeObjState;

  @Column(name = "OST_CDE_OUTSTD_TYP", nullable = false, length = 5)
  private /*4*/ String cdeOutstdTyp;

  @Column(name = "OST_CDE_OVERAGE_RL", nullable = true, length = 5)
  private /*4*/ String cdeOverageRl;

  @Column(name = "OST_CDE_PERF_STAT", nullable = false, length = 5)
  private /*4*/ String cdePerfStat;

  @Column(name = "OST_CDE_PRICE_OPT", nullable = false, length = 5)
  private /*4*/ String cdePriceOpt;

  @Column(name = "OST_CDE_RAC_REPRIC", nullable = true, length = 5)
  private /*4*/ String cdeRacRepric;

  @Column(name = "OST_CDE_RAP_MTHD", nullable = true, length = 5)
  private /*4*/ String cdeRapMthd;

  @Column(name = "OST_CDE_REPR_FREQ", nullable = true, length = 5)
  private /*4*/ String cdeReprFreq;

  @Column(name = "OST_CDE_RISK_TYPE", nullable = true, length = 5)
  private /*4*/ String cdeRiskType;

  @Column(name = "OST_CDE_RQST_CCY", nullable = false, length = 3)
  private /*4*/ String cdeRqstCcy;

  @Column(name = "OST_CDE_SIC", nullable = true, length = 10)
  private /*4*/ String cdeSic;

  @Column(name = "OST_CDE_SIC_CNTRY", nullable = true, length = 2)
  private /*4*/ String cdeSicCntry;

  @Column(name = "OST_CDE_TAX_EXEMPT", nullable = true, length = 5)
  private /*4*/ String cdeTaxExempt;

  @Column(name = "OST_CDE_TRSRY_AREA", nullable = false, length = 5)
  private /*4*/ String cdeTrsryArea;

  @Column(name = "OST_CID_BORROWER", nullable = false, length = 8)
  private /*4*/ String cidBorrower;

  @Column(name = "OST_DTE_ACT_REPRIC", nullable = true)
  private /*4*/ Date dteActRepric;

  @Column(name = "OST_DTE_ANIVERSARY", nullable = true)
  private /*4*/ Date dteAniversary;

  @Column(name = "OST_DTE_EFFECTIVE", nullable = true)
  private /*4*/ Date dteEffective;

  @Column(name = "OST_DTE_EXPIRY_CLC", nullable = true)
  private /*4*/ Date dteExpiryClc;

  @Column(name = "OST_DTE_EXPIRY_ENT", nullable = true)
  private /*4*/ Date dteExpiryEnt;

  @Column(name = "OST_DTE_EXPIRY_FNL", nullable = true)
  private /*4*/ Date dteExpiryFnl;

  @Column(name = "OST_DTE_PAID_DOWN", nullable = true)
  private /*4*/ Date dtePaidDown;

  @Column(name = "OST_DTE_RAC_REPRIC", nullable = true)
  private /*4*/ Date dteRacRepric;

  @Column(name = "OST_DTE_REPRICING", nullable = true)
  private /*4*/ Date dteRepricing;

  @Column(name = "OST_IND_AC_CF_ONLY", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indAcCfOnly;

  @Column(name = "OST_IND_AC_SCD_BAL", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indAcScdBal;

  @Column(name = "OST_IND_ACCRUABLE", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indAccruable;

  @Column(name = "OST_IND_ANV_DTE_AP", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indAnvDteAp;

  @Column(name = "OST_IND_AUTO_EXTND", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indAutoExtnd;

  @Column(name = "OST_IND_AUTO_PREPF", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indAutoPrepf;

  @Column(name = "OST_IND_BILL_BORR", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indBillBorr;

  @Column(name = "OST_IND_BILL_MATR", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indBillMatr;

  @Column(name = "OST_IND_DONT_MAIL", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indDontMail;

  @Column(name = "OST_IND_DONT_PRNT", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indDontPrnt;

  @Column(name = "OST_IND_FACING_FEE", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indFacingFee;

  @Column(name = "OST_IND_FLOAT_RATE", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indFloatRate;

  @Column(name = "OST_IND_HAS_RPR_DT", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indHasRprDt;

  @Column(name = "OST_IND_INC_XMLBIL", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indIncXmlbil;

  @Column(name = "OST_IND_INT_DUE_RP", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indIntDueRp;

  @Column(name = "OST_IND_ISSUIN_FEE", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indIssuinFee;

  @Column(name = "OST_IND_MATCH_FUND", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indMatchFund;

  @Column(name = "OST_IND_NOTF_RCVD", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indNotfRcvd;

  @Column(name = "OST_IND_PMAT_INT", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indPmatInt;

  @Column(name = "OST_IND_REINSTATBL", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indReinstatbl;

  @Column(name = "OST_IND_SEPACRFEES", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indSepacrfees;

  @Column(name = "OST_IND_SYNC_PC_RP", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indSyncPcRp;

  @Column(name = "OST_NME_ALIAS", nullable = false, length = 15)
  private /*4*/ String nmeAlias;

  @Column(name = "OST_NUM_BILL_DAYS", nullable = false, length = 2)
  private /*4*/ Integer numBillDays;

  @Column(name = "OST_NUM_EXT_INCR", nullable = true, length = 4)
  private /*4*/ Integer numExtIncr;

  @Column(name = "OST_NUM_NOTIFICATN", nullable = true, length = 2)
  private /*4*/ Integer numNotificatn;

  @Column(name = "OST_PCT_FRG_WTHHLD", nullable = true, length = 15, scale = 14)
  private /*4*/ BigDecimal pctFrgWthhld;

  @Column(name = "OST_PCT_NACR_TLRNC", nullable = false, length = 15, scale = 14)
  private /*4*/ BigDecimal pctNacrTlrnc;

  @Column(name = "OST_PCT_TAX_EXEMPT", nullable = true, length = 15, scale = 14)
  private /*4*/ BigDecimal pctTaxExempt;

  @Column(name = "OST_PID_DEAL", nullable = false, length = 8)
  private /*4*/ String pidDeal;

  @Column(name = "OST_PID_FACILITY", nullable = false, length = 8)
  private /*4*/ String pidFacility;

  @Column(name = "OST_PID_SUBLIMIT", nullable = true, length = 8)
  private /*4*/ String pidSublimit;

  @Column(name = "OST_RID_COLLAT_DEF", nullable = true, length = 8)
  private /*4*/ String ridCollatDef;

  @Column(name = "OST_RID_LCHG_RULE", nullable = true, length = 8)
  private /*4*/ String ridLchgRule;

  @Column(name = "OST_RID_OUTSTANDNG", nullable = false, length = 8)
  private /*4*/ String ridOutstandng;

  @Column(name = "OST_RTE_FC_HS_RATE", nullable = false, length = 31, scale = 15)
  private /*4*/ BigDecimal rteFcHsRate;

  @Column(name = "OST_RTE_FC_RATE", nullable = false, length = 31, scale = 15)
  private /*4*/ BigDecimal rteFcRate;

  @Column(name = "SNAPSHOT_ID", length = 50)
  private /*4*/ String snapshotId;

  @ManyToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "SNAPSHOT_INFO")
  private /*3*/ SnapshotInfo snapshotInfo;

  @Column(name = "OST_TSP_REC_CREATE", nullable = false)
  private /*4*/ Date tspRecCreate;

  @Column(name = "OST_TSP_REC_UPDATE", nullable = false)
  private /*4*/ Date tspRecUpdate;

  @Column(name = "OST_UID_REC_CREATE", nullable = false, length = 8)
  private /*4*/ String uidRecCreate;

  @Column(name = "OST_UID_REC_UPDATE", nullable = false, length = 8)
  private /*4*/ String uidRecUpdate;

  @ManyToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "S_CUSTOMER_BORROWER")
  private /*3*/ SnapshotCustomer liqCustomerBorrower;

  @ManyToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "S_DEAL")
  private /*3*/ SnapshotDeal liqDeal;

  @ManyToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "S_FACILITY")
  private /*3*/ SnapshotFacility liqFacility;

  @OneToMany(
      mappedBy = "liqOriginalOutstanding",
      fetch = FetchType.LAZY,
      targetEntity = SnapshotOstTran.class,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  private List</*1*/ LiqOstTran> liqOriginalOstTrans;

  @OneToMany(
      mappedBy = "liqOutstanding",
      fetch = FetchType.LAZY,
      targetEntity = SnapshotOstTran.class,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  private List</*1*/ LiqOstTran> liqOstTrans;

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>ridOutstandng</code>
   */
  @Override
  public String getOriginId() {
    return ridOutstandng;
  }
  /** */
  public String getId() {
    return id;
  }

  /** Trimmed version of {@link #getId()} */
  public String getId_trimmed() {
    return (id == null) ? null : id.trim();
  }

  /** The host bank gross share of the global current outstandings. */
  public BigDecimal getAmtBankGross() {
    return amtBankGross;
  }

  /** The host bank net share of the global current outstandings. */
  public BigDecimal getAmtBankNet() {
    return amtBankNet;
  }

  /** The global current outstandings. */
  public BigDecimal getAmtCurrent() {
    return amtCurrent;
  }

  /**
   * &quot;The host bank gross share of the global current outstandings, expressed in the facility
   * currency.&quot;
   */
  public BigDecimal getAmtFcBnkGrs() {
    return amtFcBnkGrs;
  }

  /**
   * &quot;The host bank net share of the global current outstandings, expressed in the facility
   * currency.&quot;
   */
  public BigDecimal getAmtFcBnkNet() {
    return amtFcBnkNet;
  }

  /** &quot;The global current outstandings, expressed in the facility currency.&quot; */
  public BigDecimal getAmtFcCurrent() {
    return amtFcCurrent;
  }

  /**
   * Defines the threshold amount for the loan?s past due calculation, above which the loan is
   * eligible to be automatically placed in Non Accrual Status.
   */
  public BigDecimal getAmtNacrTlrnc() {
    return amtNacrTlrnc;
  }

  /** The global amount of the outstanding at the time it became active. */
  public BigDecimal getAmtOriginal() {
    return amtOriginal;
  }

  /** the schedule balance amount for accruals */
  public BigDecimal getAmtSchedBal() {
    return amtSchedBal;
  }

  /** The code for the accrual period (or length) of the cycle. */
  public String getCdeAcrPeriod() {
    return cdeAcrPeriod;
  }

  /** Trimmed version of {@link #getCdeAcrPeriod()} */
  public String getCdeAcrPeriod_trimmed() {
    return (cdeAcrPeriod == null) ? null : cdeAcrPeriod.trim();
  }

  /**
   * For monthly accrual frequencies, will determine if last day of month should be used or another
   * day that is the last day of the month in some months (i.e 30).
   */
  public String getCdeActAcrRl() {
    return cdeActAcrRl;
  }

  /** Trimmed version of {@link #getCdeActAcrRl()} */
  public String getCdeActAcrRl_trimmed() {
    return (cdeActAcrRl == null) ? null : cdeActAcrRl.trim();
  }

  /** none */
  public String getCdeAnvdteEom() {
    return cdeAnvdteEom;
  }

  /** Trimmed version of {@link #getCdeAnvdteEom()} */
  public String getCdeAnvdteEom_trimmed() {
    return (cdeAnvdteEom == null) ? null : cdeAnvdteEom.trim();
  }

  /** The currency code for this outstanding. */
  public String getCdeCurrency() {
    return cdeCurrency;
  }

  /** Trimmed version of {@link #getCdeCurrency()} */
  public String getCdeCurrency_trimmed() {
    return (cdeCurrency == null) ? null : cdeCurrency.trim();
  }

  /** none */
  public String getCdeDecPrecn() {
    return cdeDecPrecn;
  }

  /** Trimmed version of {@link #getCdeDecPrecn()} */
  public String getCdeDecPrecn_trimmed() {
    return (cdeDecPrecn == null) ? null : cdeDecPrecn.trim();
  }

  /** none */
  public String getCdeDecRound() {
    return cdeDecRound;
  }

  /** Trimmed version of {@link #getCdeDecRound()} */
  public String getCdeDecRound_trimmed() {
    return (cdeDecRound == null) ? null : cdeDecRound.trim();
  }

  /**
   * The code representing the rule used when calculating an outstanding&apos;s accrual cycle end
   * date.
   */
  public String getCdeEndteRule() {
    return cdeEndteRule;
  }

  /** Trimmed version of {@link #getCdeEndteRule()} */
  public String getCdeEndteRule_trimmed() {
    return (cdeEndteRule == null) ? null : cdeEndteRule.trim();
  }

  /**
   * &quot;The length of the period by which an SBLC should be extended, if automatic extension
   * applies (Number of Periods X Period Length = Extension Period).&quot;
   */
  public String getCdeExtension() {
    return cdeExtension;
  }

  /** Trimmed version of {@link #getCdeExtension()} */
  public String getCdeExtension_trimmed() {
    return (cdeExtension == null) ? null : cdeExtension.trim();
  }

  /** none */
  public String getCdeFracIrate() {
    return cdeFracIrate;
  }

  /** Trimmed version of {@link #getCdeFracIrate()} */
  public String getCdeFracIrate_trimmed() {
    return (cdeFracIrate == null) ? null : cdeFracIrate.trim();
  }

  /** none */
  public String getCdeFracRound() {
    return cdeFracRound;
  }

  /** Trimmed version of {@link #getCdeFracRound()} */
  public String getCdeFracRound_trimmed() {
    return (cdeFracRound == null) ? null : cdeFracRound.trim();
  }

  /** The foreign withholding code. */
  public String getCdeFrgWthhld() {
    return cdeFrgWthhld;
  }

  /** Trimmed version of {@link #getCdeFrgWthhld()} */
  public String getCdeFrgWthhld_trimmed() {
    return (cdeFrgWthhld == null) ? null : cdeFrgWthhld.trim();
  }

  /** The G/L Class Mapping Code for the outstanding. */
  public String getCdeGlClass() {
    return cdeGlClass;
  }

  /** Trimmed version of {@link #getCdeGlClass()} */
  public String getCdeGlClass_trimmed() {
    return (cdeGlClass == null) ? null : cdeGlClass.trim();
  }

  /** The purpose code for this outstanding. */
  public String getCdeLoanPurp() {
    return cdeLoanPurp;
  }

  /** Trimmed version of {@link #getCdeLoanPurp()} */
  public String getCdeLoanPurp_trimmed() {
    return (cdeLoanPurp == null) ? null : cdeLoanPurp.trim();
  }

  /**
   * &quot;The code that describes the life cycle category (e.g. potential, actual, inactive).&quot;
   */
  public String getCdeObStCtg() {
    return cdeObStCtg;
  }

  /** Trimmed version of {@link #getCdeObStCtg()} */
  public String getCdeObStCtg_trimmed() {
    return (cdeObStCtg == null) ? null : cdeObStCtg.trim();
  }

  /**
   * &quot;The code that describes the state of the object during its life cycle (e.g. pending,
   * awaiting approval).&quot;
   */
  public String getCdeObjState() {
    return cdeObjState;
  }

  /** Trimmed version of {@link #getCdeObjState()} */
  public String getCdeObjState_trimmed() {
    return (cdeObjState == null) ? null : cdeObjState.trim();
  }

  /** The code for the outstanding type. */
  public String getCdeOutstdTyp() {
    return cdeOutstdTyp;
  }

  /** Trimmed version of {@link #getCdeOutstdTyp()} */
  public String getCdeOutstdTyp_trimmed() {
    return (cdeOutstdTyp == null) ? null : cdeOutstdTyp.trim();
  }

  /** Overage rule to be used for overpayment from borrower */
  public String getCdeOverageRl() {
    return cdeOverageRl;
  }

  /** Trimmed version of {@link #getCdeOverageRl()} */
  public String getCdeOverageRl_trimmed() {
    return (cdeOverageRl == null) ? null : cdeOverageRl.trim();
  }

  /** The performing status code for the outstanding. */
  public String getCdePerfStat() {
    return cdePerfStat;
  }

  /** Trimmed version of {@link #getCdePerfStat()} */
  public String getCdePerfStat_trimmed() {
    return (cdePerfStat == null) ? null : cdePerfStat.trim();
  }

  /** The pricing option code for the outstanding. */
  public String getCdePriceOpt() {
    return cdePriceOpt;
  }

  /** Trimmed version of {@link #getCdePriceOpt()} */
  public String getCdePriceOpt_trimmed() {
    return (cdePriceOpt == null) ? null : cdePriceOpt.trim();
  }

  /** The RAC repricing frequency for this loan. */
  public String getCdeRacRepric() {
    return cdeRacRepric;
  }

  /** Trimmed version of {@link #getCdeRacRepric()} */
  public String getCdeRacRepric_trimmed() {
    return (cdeRacRepric == null) ? null : cdeRacRepric.trim();
  }

  /** none */
  public String getCdeRapMthd() {
    return cdeRapMthd;
  }

  /** Trimmed version of {@link #getCdeRapMthd()} */
  public String getCdeRapMthd_trimmed() {
    return (cdeRapMthd == null) ? null : cdeRapMthd.trim();
  }

  /** The code for the repricing frequency of the outstanding. */
  public String getCdeReprFreq() {
    return cdeReprFreq;
  }

  /** Trimmed version of {@link #getCdeReprFreq()} */
  public String getCdeReprFreq_trimmed() {
    return (cdeReprFreq == null) ? null : cdeReprFreq.trim();
  }

  /** The code for the risk type of the outstanding. */
  public String getCdeRiskType() {
    return cdeRiskType;
  }

  /** Trimmed version of {@link #getCdeRiskType()} */
  public String getCdeRiskType_trimmed() {
    return (cdeRiskType == null) ? null : cdeRiskType.trim();
  }

  /**
   * The indicator to allow a loan to be requested in a denomination other than the currency of the
   * actual drawdown.
   */
  public String getCdeRqstCcy() {
    return cdeRqstCcy;
  }

  /** Trimmed version of {@link #getCdeRqstCcy()} */
  public String getCdeRqstCcy_trimmed() {
    return (cdeRqstCcy == null) ? null : cdeRqstCcy.trim();
  }

  /** The outstanding&apos;s SIC (Standard Industry Code). */
  public String getCdeSic() {
    return cdeSic;
  }

  /** Trimmed version of {@link #getCdeSic()} */
  public String getCdeSic_trimmed() {
    return (cdeSic == null) ? null : cdeSic.trim();
  }

  /** The SIC country code. */
  public String getCdeSicCntry() {
    return cdeSicCntry;
  }

  /** Trimmed version of {@link #getCdeSicCntry()} */
  public String getCdeSicCntry_trimmed() {
    return (cdeSicCntry == null) ? null : cdeSicCntry.trim();
  }

  /** The tax exempt category for the outstanding. */
  public String getCdeTaxExempt() {
    return cdeTaxExempt;
  }

  /** Trimmed version of {@link #getCdeTaxExempt()} */
  public String getCdeTaxExempt_trimmed() {
    return (cdeTaxExempt == null) ? null : cdeTaxExempt.trim();
  }

  /** The treasury reporting area for the outstanding. */
  public String getCdeTrsryArea() {
    return cdeTrsryArea;
  }

  /** Trimmed version of {@link #getCdeTrsryArea()} */
  public String getCdeTrsryArea_trimmed() {
    return (cdeTrsryArea == null) ? null : cdeTrsryArea.trim();
  }

  /** The Customer ID (RID) of the borrower on the outstanding. */
  public String getCidBorrower() {
    return cidBorrower;
  }

  /** Trimmed version of {@link #getCidBorrower()} */
  public String getCidBorrower_trimmed() {
    return (cidBorrower == null) ? null : cidBorrower.trim();
  }

  /** none */
  public Date getDteActRepric() {
    return dteActRepric;
  }

  /** none */
  public Date getDteAniversary() {
    return dteAniversary;
  }

  /** The effective date of the outstanding (the date on which it became active). */
  public Date getDteEffective() {
    return dteEffective;
  }

  /**
   * &quot;The adjusted expiry date (for an SBLC or non-loan). System adjusts the user-entered
   * expiry date to fall on a non-business day, when applicable.&quot;
   */
  public Date getDteExpiryClc() {
    return dteExpiryClc;
  }

  /**
   * For an SBLC or Non-Loan it is the user entered expiry date.For a Loan it is the maturity Date.
   */
  public Date getDteExpiryEnt() {
    return dteExpiryEnt;
  }

  /**
   * The final expiry date (for an SBLC). Indicates the final date to which an SBLC can be
   * automatically extended.
   */
  public Date getDteExpiryFnl() {
    return dteExpiryFnl;
  }

  /** The date on which the outstanding was paid down to zero. */
  public Date getDtePaidDown() {
    return dtePaidDown;
  }

  /** The RAC repricing date for this loan. */
  public Date getDteRacRepric() {
    return dteRacRepric;
  }

  /** The date on which the outstanding is scheduled to be repriced. */
  public Date getDteRepricing() {
    return dteRepricing;
  }

  /**
   * &apos;Y&apos; means that the COF should accrue, but regular shares should not. It is set by
   * amortizing Outstanding Types.
   */
  public Boolean getIndAcCfOnly() {
    return indAcCfOnly;
  }

  /**
   * indicates whether a loan should accrue on schedule balance instead of actual principal balance
   */
  public Boolean getIndAcScdBal() {
    return indAcScdBal;
  }

  /**
   * &quot;Indicates whether or not this outstanding, once paid down to zero and inactivated, is to
   * be re-accrued during &quot;&quot;as-of&quot;&quot; processing.&quot;
   */
  public Boolean getIndAccruable() {
    return indAccruable;
  }

  /** none */
  public Boolean getIndAnvDteAp() {
    return indAnvDteAp;
  }

  /**
   * Indicates whether or not the SBLC should be automatically extended upon reaching its adjusted
   * expiry date.
   */
  public Boolean getIndAutoExtnd() {
    return indAutoExtnd;
  }

  /**
   * Indicate whether to charge the Prepayment Penalty Event Fee automaticaly. Default value is
   * &apos;N&apos;
   */
  public Boolean getIndAutoPrepf() {
    return indAutoPrepf;
  }

  /**
   * Indicates whether or not interest on this option should be included when preparing borrower
   * bills.
   */
  public Boolean getIndBillBorr() {
    return indBillBorr;
  }

  /**
   * When set to N, no bill will be automatically produced for any billing cycle whose Adjusted Due
   * Date is equal to or greater than the Loan Maturity Date
   */
  public Boolean getIndBillMatr() {
    return indBillMatr;
  }

  /**
   * When set to Y, indicates that any bills that are produced and printed for this loan are not to
   * be mailed (or distributed by any other means) to the Borrower
   */
  public Boolean getIndDontMail() {
    return indDontMail;
  }

  /**
   * When set to Y, it indicates that any bills that are produced for this loan are not to be
   * printed, and therefore are not to be sent to the Borrower
   */
  public Boolean getIndDontPrnt() {
    return indDontPrnt;
  }

  /** Indicates whether or not a facing fee has been defined for this SBLC. */
  public Boolean getIndFacingFee() {
    return indFacingFee;
  }

  /** Indicates whether the rate for this outstanding is floating (or fixed). */
  public Boolean getIndFloatRate() {
    return indFloatRate;
  }

  /**
   * Indicates whether or not a repricing date and a repricing frequency apply to this outstanding.
   */
  public Boolean getIndHasRprDt() {
    return indHasRprDt;
  }

  /** none */
  public Boolean getIndIncXmlbil() {
    return indIncXmlbil;
  }

  /** none */
  public Boolean getIndIntDueRp() {
    return indIntDueRp;
  }

  /** Indicates whether or not an issuance rate fee has been defined for this SBLC. */
  public Boolean getIndIssuinFee() {
    return indIssuinFee;
  }

  /**
   * &quot;Indicates whether the pricing option for this outstanding is defined as
   * &quot;&quot;match-funded&quot;&quot;. If so, some or all of the host bank net share of this
   * outstanding may be &quot;&quot;match-funded&quot;&quot; (the remainder being allocated to a
   * &quot;&quot;non-match-funded&quot;&quot;).&quot;
   */
  public Boolean getIndMatchFund() {
    return indMatchFund;
  }

  /** Indicates whether or not notification has been received concerning the SBLC autoextension. */
  public Boolean getIndNotfRcvd() {
    return indNotfRcvd;
  }

  /** none */
  public Boolean getIndPmatInt() {
    return indPmatInt;
  }

  /** Indicates whether or not the SBLC is reinstatable upon receipt of payment from the borrower */
  public Boolean getIndReinstatbl() {
    return indReinstatbl;
  }

  /** Keep the accrual rule info for the 2 SBLC fees separate */
  public Boolean getIndSepacrfees() {
    return indSepacrfees;
  }

  /** none */
  public Boolean getIndSyncPcRp() {
    return indSyncPcRp;
  }

  /** A unique user defined name for the outstanding. */
  public String getNmeAlias() {
    return nmeAlias;
  }

  /** Trimmed version of {@link #getNmeAlias()} */
  public String getNmeAlias_trimmed() {
    return (nmeAlias == null) ? null : nmeAlias.trim();
  }

  /** The number of days prior to the Adjusted Due Date that the bill will be prepared. */
  public Integer getNumBillDays() {
    return numBillDays;
  }

  /**
   * &quot;The number of periods by which the SBLC will be extended, if automatic extension applies.
   * (Number of Periods X Period Length = Extension Period)&quot;
   */
  public Integer getNumExtIncr() {
    return numExtIncr;
  }

  /** The number of days prior to an autoextend that the involved parties should be notified. */
  public Integer getNumNotificatn() {
    return numNotificatn;
  }

  /**
   * &quot;If foreign withholding pertains to this outstanding, indicates the foreign withholding
   * percentage.&quot;
   */
  public BigDecimal getPctFrgWthhld() {
    return pctFrgWthhld;
  }

  /**
   * Defines the threshold percentage for the loan?s past due calculation, above which the loan is
   * eligible to be automatically placed in Non Accrual Status.
   */
  public BigDecimal getPctNacrTlrnc() {
    return pctNacrTlrnc;
  }

  /**
   * &quot;When a tax exempt category has been selected, indicates the percentage of the outstanding
   * that is tax exempt.&quot;
   */
  public BigDecimal getPctTaxExempt() {
    return pctTaxExempt;
  }

  /** The Deal RID (Record ID) associated with the outstanding. */
  public String getPidDeal() {
    return pidDeal;
  }

  /** Trimmed version of {@link #getPidDeal()} */
  public String getPidDeal_trimmed() {
    return (pidDeal == null) ? null : pidDeal.trim();
  }

  /** The Facility RID (Record ID) associated with the outstanding. */
  public String getPidFacility() {
    return pidFacility;
  }

  /** Trimmed version of {@link #getPidFacility()} */
  public String getPidFacility_trimmed() {
    return (pidFacility == null) ? null : pidFacility.trim();
  }

  /** The Sublimit RID (Record ID) associated with the outstanding. */
  public String getPidSublimit() {
    return pidSublimit;
  }

  /** Trimmed version of {@link #getPidSublimit()} */
  public String getPidSublimit_trimmed() {
    return (pidSublimit == null) ? null : pidSublimit.trim();
  }

  /** Contains RID of collateral group each outstanding belongs to */
  public String getRidCollatDef() {
    return ridCollatDef;
  }

  /** Trimmed version of {@link #getRidCollatDef()} */
  public String getRidCollatDef_trimmed() {
    return (ridCollatDef == null) ? null : ridCollatDef.trim();
  }

  /** Uniquely identifies the late charge rule, if any, assigned to this loan. */
  public String getRidLchgRule() {
    return ridLchgRule;
  }

  /** Trimmed version of {@link #getRidLchgRule()} */
  public String getRidLchgRule_trimmed() {
    return (ridLchgRule == null) ? null : ridLchgRule.trim();
  }

  /** The RID (Record ID) that uniquely identifies this outstanding. */
  public String getRidOutstandng() {
    return ridOutstandng;
  }

  /** Trimmed version of {@link #getRidOutstandng()} */
  public String getRidOutstandng_trimmed() {
    return (ridOutstandng == null) ? null : ridOutstandng.trim();
  }

  /**
   * The historical exchange rate (FX Rate) needed to convert outstandings into the currency of the
   * facility.
   */
  public BigDecimal getRteFcHsRate() {
    return rteFcHsRate;
  }

  /**
   * &quot;The current (or ,&apos;spot,&apos;) exchange rate (FX Rate) needed to convert
   * outstandings into the currency of the facility.&quot;&quot;&quot;
   */
  public BigDecimal getRteFcRate() {
    return rteFcRate;
  }

  /** */
  public String getSnapshotId() {
    return snapshotId;
  }

  /** Trimmed version of {@link #getSnapshotId()} */
  public String getSnapshotId_trimmed() {
    return (snapshotId == null) ? null : snapshotId.trim();
  }

  /** */
  public SnapshotInfo getSnapshotInfo() {
    return snapshotInfo;
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
  public LiqCustomer getLiqCustomerBorrower() {
    return nullIfNotFound(liqCustomerBorrower);
  }

  /**
   * The deal table. A record of a borrowing agreement between the lender and the borrower which may
   * encompass one or more credit facilities.
   */
  public LiqDeal getLiqDeal() {
    return nullIfNotFound(liqDeal);
  }

  /** The facility table. A credit arrangement established by the bank for the client. */
  public LiqFacility getLiqFacility() {
    return nullIfNotFound(liqFacility);
  }

  /** The outstanding transaction table. Transactions directly related to outstandings. */
  public List<LiqOstTran> getLiqOriginalOstTrans() {
    return nullIfNotFound(liqOriginalOstTrans);
  }

  /** The outstanding transaction table. Transactions directly related to outstandings. */
  public List<LiqOstTran> getLiqOstTrans() {
    return nullIfNotFound(liqOstTrans);
  }

  // Setter HERE
  /** */
  public void setId(String id) {
    this.id = id;
  }

  /** The host bank gross share of the global current outstandings. */
  public void setAmtBankGross(BigDecimal amtBankGross) {
    this.amtBankGross = amtBankGross;
  }

  /** The host bank net share of the global current outstandings. */
  public void setAmtBankNet(BigDecimal amtBankNet) {
    this.amtBankNet = amtBankNet;
  }

  /** The global current outstandings. */
  public void setAmtCurrent(BigDecimal amtCurrent) {
    this.amtCurrent = amtCurrent;
  }

  /**
   * &quot;The host bank gross share of the global current outstandings, expressed in the facility
   * currency.&quot;
   */
  public void setAmtFcBnkGrs(BigDecimal amtFcBnkGrs) {
    this.amtFcBnkGrs = amtFcBnkGrs;
  }

  /**
   * &quot;The host bank net share of the global current outstandings, expressed in the facility
   * currency.&quot;
   */
  public void setAmtFcBnkNet(BigDecimal amtFcBnkNet) {
    this.amtFcBnkNet = amtFcBnkNet;
  }

  /** &quot;The global current outstandings, expressed in the facility currency.&quot; */
  public void setAmtFcCurrent(BigDecimal amtFcCurrent) {
    this.amtFcCurrent = amtFcCurrent;
  }

  /**
   * Defines the threshold amount for the loan?s past due calculation, above which the loan is
   * eligible to be automatically placed in Non Accrual Status.
   */
  public void setAmtNacrTlrnc(BigDecimal amtNacrTlrnc) {
    this.amtNacrTlrnc = amtNacrTlrnc;
  }

  /** The global amount of the outstanding at the time it became active. */
  public void setAmtOriginal(BigDecimal amtOriginal) {
    this.amtOriginal = amtOriginal;
  }

  /** the schedule balance amount for accruals */
  public void setAmtSchedBal(BigDecimal amtSchedBal) {
    this.amtSchedBal = amtSchedBal;
  }

  /** The code for the accrual period (or length) of the cycle. */
  public void setCdeAcrPeriod(String cdeAcrPeriod) {
    this.cdeAcrPeriod = cdeAcrPeriod;
  }

  /**
   * For monthly accrual frequencies, will determine if last day of month should be used or another
   * day that is the last day of the month in some months (i.e 30).
   */
  public void setCdeActAcrRl(String cdeActAcrRl) {
    this.cdeActAcrRl = cdeActAcrRl;
  }

  /** none */
  public void setCdeAnvdteEom(String cdeAnvdteEom) {
    this.cdeAnvdteEom = cdeAnvdteEom;
  }

  /** The currency code for this outstanding. */
  public void setCdeCurrency(String cdeCurrency) {
    this.cdeCurrency = cdeCurrency;
  }

  /** none */
  public void setCdeDecPrecn(String cdeDecPrecn) {
    this.cdeDecPrecn = cdeDecPrecn;
  }

  /** none */
  public void setCdeDecRound(String cdeDecRound) {
    this.cdeDecRound = cdeDecRound;
  }

  /**
   * The code representing the rule used when calculating an outstanding&apos;s accrual cycle end
   * date.
   */
  public void setCdeEndteRule(String cdeEndteRule) {
    this.cdeEndteRule = cdeEndteRule;
  }

  /**
   * &quot;The length of the period by which an SBLC should be extended, if automatic extension
   * applies (Number of Periods X Period Length = Extension Period).&quot;
   */
  public void setCdeExtension(String cdeExtension) {
    this.cdeExtension = cdeExtension;
  }

  /** none */
  public void setCdeFracIrate(String cdeFracIrate) {
    this.cdeFracIrate = cdeFracIrate;
  }

  /** none */
  public void setCdeFracRound(String cdeFracRound) {
    this.cdeFracRound = cdeFracRound;
  }

  /** The foreign withholding code. */
  public void setCdeFrgWthhld(String cdeFrgWthhld) {
    this.cdeFrgWthhld = cdeFrgWthhld;
  }

  /** The G/L Class Mapping Code for the outstanding. */
  public void setCdeGlClass(String cdeGlClass) {
    this.cdeGlClass = cdeGlClass;
  }

  /** The purpose code for this outstanding. */
  public void setCdeLoanPurp(String cdeLoanPurp) {
    this.cdeLoanPurp = cdeLoanPurp;
  }

  /**
   * &quot;The code that describes the life cycle category (e.g. potential, actual, inactive).&quot;
   */
  public void setCdeObStCtg(String cdeObStCtg) {
    this.cdeObStCtg = cdeObStCtg;
  }

  /**
   * &quot;The code that describes the state of the object during its life cycle (e.g. pending,
   * awaiting approval).&quot;
   */
  public void setCdeObjState(String cdeObjState) {
    this.cdeObjState = cdeObjState;
  }

  /** The code for the outstanding type. */
  public void setCdeOutstdTyp(String cdeOutstdTyp) {
    this.cdeOutstdTyp = cdeOutstdTyp;
  }

  /** Overage rule to be used for overpayment from borrower */
  public void setCdeOverageRl(String cdeOverageRl) {
    this.cdeOverageRl = cdeOverageRl;
  }

  /** The performing status code for the outstanding. */
  public void setCdePerfStat(String cdePerfStat) {
    this.cdePerfStat = cdePerfStat;
  }

  /** The pricing option code for the outstanding. */
  public void setCdePriceOpt(String cdePriceOpt) {
    this.cdePriceOpt = cdePriceOpt;
  }

  /** The RAC repricing frequency for this loan. */
  public void setCdeRacRepric(String cdeRacRepric) {
    this.cdeRacRepric = cdeRacRepric;
  }

  /** none */
  public void setCdeRapMthd(String cdeRapMthd) {
    this.cdeRapMthd = cdeRapMthd;
  }

  /** The code for the repricing frequency of the outstanding. */
  public void setCdeReprFreq(String cdeReprFreq) {
    this.cdeReprFreq = cdeReprFreq;
  }

  /** The code for the risk type of the outstanding. */
  public void setCdeRiskType(String cdeRiskType) {
    this.cdeRiskType = cdeRiskType;
  }

  /**
   * The indicator to allow a loan to be requested in a denomination other than the currency of the
   * actual drawdown.
   */
  public void setCdeRqstCcy(String cdeRqstCcy) {
    this.cdeRqstCcy = cdeRqstCcy;
  }

  /** The outstanding&apos;s SIC (Standard Industry Code). */
  public void setCdeSic(String cdeSic) {
    this.cdeSic = cdeSic;
  }

  /** The SIC country code. */
  public void setCdeSicCntry(String cdeSicCntry) {
    this.cdeSicCntry = cdeSicCntry;
  }

  /** The tax exempt category for the outstanding. */
  public void setCdeTaxExempt(String cdeTaxExempt) {
    this.cdeTaxExempt = cdeTaxExempt;
  }

  /** The treasury reporting area for the outstanding. */
  public void setCdeTrsryArea(String cdeTrsryArea) {
    this.cdeTrsryArea = cdeTrsryArea;
  }

  /** The Customer ID (RID) of the borrower on the outstanding. */
  public void setCidBorrower(String cidBorrower) {
    this.cidBorrower = cidBorrower;
  }

  /** none */
  public void setDteActRepric(Date dteActRepric) {
    this.dteActRepric = dteActRepric;
  }

  /** none */
  public void setDteAniversary(Date dteAniversary) {
    this.dteAniversary = dteAniversary;
  }

  /** The effective date of the outstanding (the date on which it became active). */
  public void setDteEffective(Date dteEffective) {
    this.dteEffective = dteEffective;
  }

  /**
   * &quot;The adjusted expiry date (for an SBLC or non-loan). System adjusts the user-entered
   * expiry date to fall on a non-business day, when applicable.&quot;
   */
  public void setDteExpiryClc(Date dteExpiryClc) {
    this.dteExpiryClc = dteExpiryClc;
  }

  /**
   * For an SBLC or Non-Loan it is the user entered expiry date.For a Loan it is the maturity Date.
   */
  public void setDteExpiryEnt(Date dteExpiryEnt) {
    this.dteExpiryEnt = dteExpiryEnt;
  }

  /**
   * The final expiry date (for an SBLC). Indicates the final date to which an SBLC can be
   * automatically extended.
   */
  public void setDteExpiryFnl(Date dteExpiryFnl) {
    this.dteExpiryFnl = dteExpiryFnl;
  }

  /** The date on which the outstanding was paid down to zero. */
  public void setDtePaidDown(Date dtePaidDown) {
    this.dtePaidDown = dtePaidDown;
  }

  /** The RAC repricing date for this loan. */
  public void setDteRacRepric(Date dteRacRepric) {
    this.dteRacRepric = dteRacRepric;
  }

  /** The date on which the outstanding is scheduled to be repriced. */
  public void setDteRepricing(Date dteRepricing) {
    this.dteRepricing = dteRepricing;
  }

  /**
   * &apos;Y&apos; means that the COF should accrue, but regular shares should not. It is set by
   * amortizing Outstanding Types.
   */
  public void setIndAcCfOnly(Boolean indAcCfOnly) {
    this.indAcCfOnly = indAcCfOnly;
  }

  /**
   * indicates whether a loan should accrue on schedule balance instead of actual principal balance
   */
  public void setIndAcScdBal(Boolean indAcScdBal) {
    this.indAcScdBal = indAcScdBal;
  }

  /**
   * &quot;Indicates whether or not this outstanding, once paid down to zero and inactivated, is to
   * be re-accrued during &quot;&quot;as-of&quot;&quot; processing.&quot;
   */
  public void setIndAccruable(Boolean indAccruable) {
    this.indAccruable = indAccruable;
  }

  /** none */
  public void setIndAnvDteAp(Boolean indAnvDteAp) {
    this.indAnvDteAp = indAnvDteAp;
  }

  /**
   * Indicates whether or not the SBLC should be automatically extended upon reaching its adjusted
   * expiry date.
   */
  public void setIndAutoExtnd(Boolean indAutoExtnd) {
    this.indAutoExtnd = indAutoExtnd;
  }

  /**
   * Indicate whether to charge the Prepayment Penalty Event Fee automaticaly. Default value is
   * &apos;N&apos;
   */
  public void setIndAutoPrepf(Boolean indAutoPrepf) {
    this.indAutoPrepf = indAutoPrepf;
  }

  /**
   * Indicates whether or not interest on this option should be included when preparing borrower
   * bills.
   */
  public void setIndBillBorr(Boolean indBillBorr) {
    this.indBillBorr = indBillBorr;
  }

  /**
   * When set to N, no bill will be automatically produced for any billing cycle whose Adjusted Due
   * Date is equal to or greater than the Loan Maturity Date
   */
  public void setIndBillMatr(Boolean indBillMatr) {
    this.indBillMatr = indBillMatr;
  }

  /**
   * When set to Y, indicates that any bills that are produced and printed for this loan are not to
   * be mailed (or distributed by any other means) to the Borrower
   */
  public void setIndDontMail(Boolean indDontMail) {
    this.indDontMail = indDontMail;
  }

  /**
   * When set to Y, it indicates that any bills that are produced for this loan are not to be
   * printed, and therefore are not to be sent to the Borrower
   */
  public void setIndDontPrnt(Boolean indDontPrnt) {
    this.indDontPrnt = indDontPrnt;
  }

  /** Indicates whether or not a facing fee has been defined for this SBLC. */
  public void setIndFacingFee(Boolean indFacingFee) {
    this.indFacingFee = indFacingFee;
  }

  /** Indicates whether the rate for this outstanding is floating (or fixed). */
  public void setIndFloatRate(Boolean indFloatRate) {
    this.indFloatRate = indFloatRate;
  }

  /**
   * Indicates whether or not a repricing date and a repricing frequency apply to this outstanding.
   */
  public void setIndHasRprDt(Boolean indHasRprDt) {
    this.indHasRprDt = indHasRprDt;
  }

  /** none */
  public void setIndIncXmlbil(Boolean indIncXmlbil) {
    this.indIncXmlbil = indIncXmlbil;
  }

  /** none */
  public void setIndIntDueRp(Boolean indIntDueRp) {
    this.indIntDueRp = indIntDueRp;
  }

  /** Indicates whether or not an issuance rate fee has been defined for this SBLC. */
  public void setIndIssuinFee(Boolean indIssuinFee) {
    this.indIssuinFee = indIssuinFee;
  }

  /**
   * &quot;Indicates whether the pricing option for this outstanding is defined as
   * &quot;&quot;match-funded&quot;&quot;. If so, some or all of the host bank net share of this
   * outstanding may be &quot;&quot;match-funded&quot;&quot; (the remainder being allocated to a
   * &quot;&quot;non-match-funded&quot;&quot;).&quot;
   */
  public void setIndMatchFund(Boolean indMatchFund) {
    this.indMatchFund = indMatchFund;
  }

  /** Indicates whether or not notification has been received concerning the SBLC autoextension. */
  public void setIndNotfRcvd(Boolean indNotfRcvd) {
    this.indNotfRcvd = indNotfRcvd;
  }

  /** none */
  public void setIndPmatInt(Boolean indPmatInt) {
    this.indPmatInt = indPmatInt;
  }

  /** Indicates whether or not the SBLC is reinstatable upon receipt of payment from the borrower */
  public void setIndReinstatbl(Boolean indReinstatbl) {
    this.indReinstatbl = indReinstatbl;
  }

  /** Keep the accrual rule info for the 2 SBLC fees separate */
  public void setIndSepacrfees(Boolean indSepacrfees) {
    this.indSepacrfees = indSepacrfees;
  }

  /** none */
  public void setIndSyncPcRp(Boolean indSyncPcRp) {
    this.indSyncPcRp = indSyncPcRp;
  }

  /** A unique user defined name for the outstanding. */
  public void setNmeAlias(String nmeAlias) {
    this.nmeAlias = nmeAlias;
  }

  /** The number of days prior to the Adjusted Due Date that the bill will be prepared. */
  public void setNumBillDays(Integer numBillDays) {
    this.numBillDays = numBillDays;
  }

  /**
   * &quot;The number of periods by which the SBLC will be extended, if automatic extension applies.
   * (Number of Periods X Period Length = Extension Period)&quot;
   */
  public void setNumExtIncr(Integer numExtIncr) {
    this.numExtIncr = numExtIncr;
  }

  /** The number of days prior to an autoextend that the involved parties should be notified. */
  public void setNumNotificatn(Integer numNotificatn) {
    this.numNotificatn = numNotificatn;
  }

  /**
   * &quot;If foreign withholding pertains to this outstanding, indicates the foreign withholding
   * percentage.&quot;
   */
  public void setPctFrgWthhld(BigDecimal pctFrgWthhld) {
    this.pctFrgWthhld = pctFrgWthhld;
  }

  /**
   * Defines the threshold percentage for the loan?s past due calculation, above which the loan is
   * eligible to be automatically placed in Non Accrual Status.
   */
  public void setPctNacrTlrnc(BigDecimal pctNacrTlrnc) {
    this.pctNacrTlrnc = pctNacrTlrnc;
  }

  /**
   * &quot;When a tax exempt category has been selected, indicates the percentage of the outstanding
   * that is tax exempt.&quot;
   */
  public void setPctTaxExempt(BigDecimal pctTaxExempt) {
    this.pctTaxExempt = pctTaxExempt;
  }

  /** The Deal RID (Record ID) associated with the outstanding. */
  public void setPidDeal(String pidDeal) {
    this.pidDeal = pidDeal;
  }

  /** The Facility RID (Record ID) associated with the outstanding. */
  public void setPidFacility(String pidFacility) {
    this.pidFacility = pidFacility;
  }

  /** The Sublimit RID (Record ID) associated with the outstanding. */
  public void setPidSublimit(String pidSublimit) {
    this.pidSublimit = pidSublimit;
  }

  /** Contains RID of collateral group each outstanding belongs to */
  public void setRidCollatDef(String ridCollatDef) {
    this.ridCollatDef = ridCollatDef;
  }

  /** Uniquely identifies the late charge rule, if any, assigned to this loan. */
  public void setRidLchgRule(String ridLchgRule) {
    this.ridLchgRule = ridLchgRule;
  }

  /** The RID (Record ID) that uniquely identifies this outstanding. */
  public void setRidOutstandng(String ridOutstandng) {
    this.ridOutstandng = ridOutstandng;
  }

  /**
   * The historical exchange rate (FX Rate) needed to convert outstandings into the currency of the
   * facility.
   */
  public void setRteFcHsRate(BigDecimal rteFcHsRate) {
    this.rteFcHsRate = rteFcHsRate;
  }

  /**
   * &quot;The current (or ,&apos;spot,&apos;) exchange rate (FX Rate) needed to convert
   * outstandings into the currency of the facility.&quot;&quot;&quot;
   */
  public void setRteFcRate(BigDecimal rteFcRate) {
    this.rteFcRate = rteFcRate;
  }

  /** */
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  /** */
  public void setSnapshotInfo(SnapshotInfo snapshotInfo) {
    this.snapshotInfo = snapshotInfo;
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
  public void setLiqCustomerBorrower(SnapshotCustomer liqCustomerBorrower) {
    this.liqCustomerBorrower = liqCustomerBorrower;
  }

  /**
   * The deal table. A record of a borrowing agreement between the lender and the borrower which may
   * encompass one or more credit facilities.
   */
  public void setLiqDeal(SnapshotDeal liqDeal) {
    this.liqDeal = liqDeal;
  }

  /** The facility table. A credit arrangement established by the bank for the client. */
  public void setLiqFacility(SnapshotFacility liqFacility) {
    this.liqFacility = liqFacility;
  }

  /** The outstanding transaction table. Transactions directly related to outstandings. */
  public void addLiqOriginalOstTrans(List<SnapshotOstTran> liqOriginalOstTrans) {
    if (this.liqOriginalOstTrans == null) {
      this.liqOriginalOstTrans = new ArrayList<>(liqOriginalOstTrans.size());
    }
    this.liqOriginalOstTrans.addAll(liqOriginalOstTrans);
    liqOriginalOstTrans.forEach(e -> e.setLiqOriginalOutstanding(this));
  }

  /** The outstanding transaction table. Transactions directly related to outstandings. */
  public void addLiqOstTrans(List<SnapshotOstTran> liqOstTrans) {
    if (this.liqOstTrans == null) {
      this.liqOstTrans = new ArrayList<>(liqOstTrans.size());
    }
    this.liqOstTrans.addAll(liqOstTrans);
    liqOstTrans.forEach(e -> e.setLiqOutstanding(this));
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(id);
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
    SnapshotOutstanding other = (SnapshotOutstanding) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.id, other.id);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(SnapshotOutstanding other) {
    CompareHelper helper = new CompareHelper();
    helper.append("amtBankGross", this.amtBankGross, other.amtBankGross);
    helper.append("amtBankNet", this.amtBankNet, other.amtBankNet);
    helper.append("amtCurrent", this.amtCurrent, other.amtCurrent);
    helper.append("amtFcBnkGrs", this.amtFcBnkGrs, other.amtFcBnkGrs);
    helper.append("amtFcBnkNet", this.amtFcBnkNet, other.amtFcBnkNet);
    helper.append("amtFcCurrent", this.amtFcCurrent, other.amtFcCurrent);
    helper.append("amtNacrTlrnc", this.amtNacrTlrnc, other.amtNacrTlrnc);
    helper.append("amtOriginal", this.amtOriginal, other.amtOriginal);
    helper.append("amtSchedBal", this.amtSchedBal, other.amtSchedBal);
    helper.append("cdeAcrPeriod", this.cdeAcrPeriod, other.cdeAcrPeriod);
    helper.append("cdeActAcrRl", this.cdeActAcrRl, other.cdeActAcrRl);
    helper.append("cdeAnvdteEom", this.cdeAnvdteEom, other.cdeAnvdteEom);
    helper.append("cdeCurrency", this.cdeCurrency, other.cdeCurrency);
    helper.append("cdeDecPrecn", this.cdeDecPrecn, other.cdeDecPrecn);
    helper.append("cdeDecRound", this.cdeDecRound, other.cdeDecRound);
    helper.append("cdeEndteRule", this.cdeEndteRule, other.cdeEndteRule);
    helper.append("cdeExtension", this.cdeExtension, other.cdeExtension);
    helper.append("cdeFracIrate", this.cdeFracIrate, other.cdeFracIrate);
    helper.append("cdeFracRound", this.cdeFracRound, other.cdeFracRound);
    helper.append("cdeFrgWthhld", this.cdeFrgWthhld, other.cdeFrgWthhld);
    helper.append("cdeGlClass", this.cdeGlClass, other.cdeGlClass);
    helper.append("cdeLoanPurp", this.cdeLoanPurp, other.cdeLoanPurp);
    helper.append("cdeObStCtg", this.cdeObStCtg, other.cdeObStCtg);
    helper.append("cdeObjState", this.cdeObjState, other.cdeObjState);
    helper.append("cdeOutstdTyp", this.cdeOutstdTyp, other.cdeOutstdTyp);
    helper.append("cdeOverageRl", this.cdeOverageRl, other.cdeOverageRl);
    helper.append("cdePerfStat", this.cdePerfStat, other.cdePerfStat);
    helper.append("cdePriceOpt", this.cdePriceOpt, other.cdePriceOpt);
    helper.append("cdeRacRepric", this.cdeRacRepric, other.cdeRacRepric);
    helper.append("cdeRapMthd", this.cdeRapMthd, other.cdeRapMthd);
    helper.append("cdeReprFreq", this.cdeReprFreq, other.cdeReprFreq);
    helper.append("cdeRiskType", this.cdeRiskType, other.cdeRiskType);
    helper.append("cdeRqstCcy", this.cdeRqstCcy, other.cdeRqstCcy);
    helper.append("cdeSic", this.cdeSic, other.cdeSic);
    helper.append("cdeSicCntry", this.cdeSicCntry, other.cdeSicCntry);
    helper.append("cdeTaxExempt", this.cdeTaxExempt, other.cdeTaxExempt);
    helper.append("cdeTrsryArea", this.cdeTrsryArea, other.cdeTrsryArea);
    helper.append("cidBorrower", this.cidBorrower, other.cidBorrower);
    helper.append("dteActRepric", this.dteActRepric, other.dteActRepric);
    helper.append("dteAniversary", this.dteAniversary, other.dteAniversary);
    helper.append("dteEffective", this.dteEffective, other.dteEffective);
    helper.append("dteExpiryClc", this.dteExpiryClc, other.dteExpiryClc);
    helper.append("dteExpiryEnt", this.dteExpiryEnt, other.dteExpiryEnt);
    helper.append("dteExpiryFnl", this.dteExpiryFnl, other.dteExpiryFnl);
    helper.append("dtePaidDown", this.dtePaidDown, other.dtePaidDown);
    helper.append("dteRacRepric", this.dteRacRepric, other.dteRacRepric);
    helper.append("dteRepricing", this.dteRepricing, other.dteRepricing);
    helper.append("indAcCfOnly", this.indAcCfOnly, other.indAcCfOnly);
    helper.append("indAcScdBal", this.indAcScdBal, other.indAcScdBal);
    helper.append("indAccruable", this.indAccruable, other.indAccruable);
    helper.append("indAnvDteAp", this.indAnvDteAp, other.indAnvDteAp);
    helper.append("indAutoExtnd", this.indAutoExtnd, other.indAutoExtnd);
    helper.append("indAutoPrepf", this.indAutoPrepf, other.indAutoPrepf);
    helper.append("indBillBorr", this.indBillBorr, other.indBillBorr);
    helper.append("indBillMatr", this.indBillMatr, other.indBillMatr);
    helper.append("indDontMail", this.indDontMail, other.indDontMail);
    helper.append("indDontPrnt", this.indDontPrnt, other.indDontPrnt);
    helper.append("indFacingFee", this.indFacingFee, other.indFacingFee);
    helper.append("indFloatRate", this.indFloatRate, other.indFloatRate);
    helper.append("indHasRprDt", this.indHasRprDt, other.indHasRprDt);
    helper.append("indIncXmlbil", this.indIncXmlbil, other.indIncXmlbil);
    helper.append("indIntDueRp", this.indIntDueRp, other.indIntDueRp);
    helper.append("indIssuinFee", this.indIssuinFee, other.indIssuinFee);
    helper.append("indMatchFund", this.indMatchFund, other.indMatchFund);
    helper.append("indNotfRcvd", this.indNotfRcvd, other.indNotfRcvd);
    helper.append("indPmatInt", this.indPmatInt, other.indPmatInt);
    helper.append("indReinstatbl", this.indReinstatbl, other.indReinstatbl);
    helper.append("indSepacrfees", this.indSepacrfees, other.indSepacrfees);
    helper.append("indSyncPcRp", this.indSyncPcRp, other.indSyncPcRp);
    helper.append("nmeAlias", this.nmeAlias, other.nmeAlias);
    helper.append("numBillDays", this.numBillDays, other.numBillDays);
    helper.append("numExtIncr", this.numExtIncr, other.numExtIncr);
    helper.append("numNotificatn", this.numNotificatn, other.numNotificatn);
    helper.append("pctFrgWthhld", this.pctFrgWthhld, other.pctFrgWthhld);
    helper.append("pctNacrTlrnc", this.pctNacrTlrnc, other.pctNacrTlrnc);
    helper.append("pctTaxExempt", this.pctTaxExempt, other.pctTaxExempt);
    helper.append("pidDeal", this.pidDeal, other.pidDeal);
    helper.append("pidFacility", this.pidFacility, other.pidFacility);
    helper.append("pidSublimit", this.pidSublimit, other.pidSublimit);
    helper.append("ridCollatDef", this.ridCollatDef, other.ridCollatDef);
    helper.append("ridLchgRule", this.ridLchgRule, other.ridLchgRule);
    helper.append("ridOutstandng", this.ridOutstandng, other.ridOutstandng);
    helper.append("rteFcHsRate", this.rteFcHsRate, other.rteFcHsRate);
    helper.append("rteFcRate", this.rteFcRate, other.rteFcRate);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
