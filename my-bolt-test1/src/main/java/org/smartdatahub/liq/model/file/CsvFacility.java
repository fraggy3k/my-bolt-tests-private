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
 * SELECT FAC_PID_FACILITY, FAC_AMT_DC_GL_CURR, FAC_AMT_DC_GL_ORIG, FAC_AMT_GLO_PRECLO,
 * FAC_AMT_GLOBL_CURR, FAC_AMT_GLOBL_ORIG, FAC_AMT_UNAVAIL, FAC_CDE_AMRT_USED, FAC_CDE_BANK,
 * FAC_CDE_BRANCH, FAC_CDE_CURRENCY, FAC_CDE_FAC_TYPE, FAC_CDE_FL_GL_MAP, FAC_CDE_FND_MTH_AF,
 * FAC_CDE_FND_MTH_BF, FAC_CDE_LINE_BUSNS, FAC_CDE_PERFORMING, FAC_CDE_PF_CLAWBCK,
 * FAC_CDE_PF_CUR_RUL, FAC_CDE_PNLTY_STAT, FAC_CDE_PROC_AREA, FAC_CDE_RMT_AM_MTH, FAC_CDE_SIC,
 * FAC_CDE_SIC_CNTRY, FAC_CDE_SUBTYPE, FAC_CDE_UNF_AM_MTH, FAC_DTE_AGREEMENT, FAC_DTE_AMRT_MTRTY,
 * FAC_DTE_EFFECTIVE, FAC_DTE_EXPIRY, FAC_DTE_FINAL_MAT, FAC_DTE_FL_DRAWDWN, FAC_DTE_PAST_DUE,
 * FAC_DTE_SBLC_EXPRY, FAC_DTE_SBLC_ISSUE, FAC_DTE_TERM_FAC, FAC_IND_CMPN_BAL_R, FAC_IND_CUSIP_LST,
 * FAC_IND_DONT_MAIL, FAC_IND_DONT_PRNT, FAC_IND_FLOAT_LOAN, FAC_IND_INC_XMLBIL, FAC_IND_MAT_ADV_CH,
 * FAC_IND_MULTI_CURR, FAC_IND_SNGLE_DRAW, FAC_NME_FACILITY, FAC_NUM_FAC_CNTL, FAC_NUM_MAX_CUR_OT,
 * FAC_NUM_PNSPR_GRPR, FAC_NUM_PRC_OUT_CN, FAC_PCT_DEAL_FXRTE, FAC_PCT_EST_USAGE,
 * FAC_PCT_PNLTY_SPRD, FAC_PCT_TOL_FXRTE, FAC_PCT_USE_THRESH, FAC_PID_DEAL, FAC_RID_COLLAT_DEF,
 * FAC_TSP_REC_CREATE, FAC_TSP_REC_UPDATE, FAC_TXT_CUSIP_NUM, FAC_TXT_ISIN_NUM, FAC_UID_REC_CREATE,
 * FAC_UID_REC_UPDATE, FAC_XID_ANSI_ID, FROM blablabla
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public class CsvFacility
    implements Identifiable<String>, Serializable, EqualsSimpleFieldSupport<CsvFacility> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "FAC";

  @Id private /*4*/ String pidFacility;
  private /*4*/ BigDecimal amtDcGlCurr;
  private /*4*/ BigDecimal amtDcGlOrig;
  private /*4*/ BigDecimal amtGloPreclo;
  private /*4*/ BigDecimal amtGloblCurr;
  private /*4*/ BigDecimal amtGloblOrig;
  private /*4*/ BigDecimal amtUnavail;
  private /*4*/ String cdeAmrtUsed;
  private /*4*/ String cdeBank;
  private /*4*/ String cdeBranch;
  private /*4*/ String cdeCurrency;
  private /*4*/ String cdeFacType;
  private /*4*/ String cdeFlGlMap;
  private /*4*/ String cdeFndMthAf;
  private /*4*/ String cdeFndMthBf;
  private /*4*/ String cdeLineBusns;
  private /*4*/ String cdePerforming;
  private /*4*/ String cdePfClawbck;
  private /*4*/ String cdePfCurRul;
  private /*4*/ String cdePnltyStat;
  private /*4*/ String cdeProcArea;
  private /*4*/ String cdeRmtAmMth;
  private /*4*/ String cdeSic;
  private /*4*/ String cdeSicCntry;
  private /*4*/ String cdeSubtype;
  private /*4*/ String cdeUnfAmMth;
  private /*4*/ Date dteAgreement;
  private /*4*/ Date dteAmrtMtrty;
  private /*4*/ Date dteEffective;
  private /*4*/ Date dteExpiry;
  private /*4*/ Date dteFinalMat;
  private /*4*/ Date dteFlDrawdwn;
  private /*4*/ Date dtePastDue;
  private /*4*/ Date dteSblcExpry;
  private /*4*/ Date dteSblcIssue;
  private /*4*/ Date dteTermFac;
  private /*4*/ Boolean indCmpnBalR;
  private /*4*/ Boolean indCusipLst;
  private /*4*/ Boolean indDontMail;
  private /*4*/ Boolean indDontPrnt;
  private /*4*/ Boolean indFloatLoan;
  private /*4*/ Boolean indIncXmlbil;
  private /*4*/ Boolean indMatAdvCh;
  private /*4*/ Boolean indMultiCurr;
  private /*4*/ Boolean indSngleDraw;
  private /*4*/ String nmeFacility;
  private /*4*/ String numFacCntl;
  private /*4*/ Integer numMaxCurOt;
  private /*4*/ Integer numPnsprGrpr;
  private /*4*/ Integer numPrcOutCn;
  private /*4*/ BigDecimal pctDealFxrte;
  private /*4*/ BigDecimal pctEstUsage;
  private /*4*/ BigDecimal pctPnltySprd;
  private /*4*/ BigDecimal pctTolFxrte;
  private /*4*/ BigDecimal pctUseThresh;
  private /*4*/ String pidDeal;
  private /*4*/ String ridCollatDef;
  private /*4*/ Date tspRecCreate;
  private /*4*/ Date tspRecUpdate;
  private /*4*/ String txtCusipNum;
  private /*4*/ String txtIsinNum;
  private /*4*/ String uidRecCreate;
  private /*4*/ String uidRecUpdate;
  private /*4*/ String xidAnsiId;
  private /*4*/ String snapshotId;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - the field <code>pidFacility</code>
   */
  @Override
  public String getId() {
    return pidFacility;
  }
  /** The Facility RID (Record ID). */
  public String getPidFacility() {
    return pidFacility;
  }

  /** Trimmed version of {@link #getPidFacility()} */
  public String getPidFacility_trimmed() {
    return (pidFacility == null) ? null : pidFacility.trim();
  }

  /** &quot;The global facility current commitment, expressed in the deal currency.&quot; */
  public BigDecimal getAmtDcGlCurr() {
    return amtDcGlCurr;
  }

  /** &quot;The global facility closing commitment, expressed in the deal currency.&quot; */
  public BigDecimal getAmtDcGlOrig() {
    return amtDcGlOrig;
  }

  /**
   * The global facility proposed commitment (the amount requested by the borrower from the
   * syndicate prior to closing the deal).
   */
  public BigDecimal getAmtGloPreclo() {
    return amtGloPreclo;
  }

  /** The global facility current commitment. */
  public BigDecimal getAmtGloblCurr() {
    return amtGloblCurr;
  }

  /** The global facility closing commitment. */
  public BigDecimal getAmtGloblOrig() {
    return amtGloblOrig;
  }

  /**
   * The amount of the global facility current commitment that is presently unavailable to the
   * borrower(s).
   */
  public BigDecimal getAmtUnavail() {
    return amtUnavail;
  }

  /** The amortization method last used by this facility. */
  public String getCdeAmrtUsed() {
    return cdeAmrtUsed;
  }

  /** Trimmed version of {@link #getCdeAmrtUsed()} */
  public String getCdeAmrtUsed_trimmed() {
    return (cdeAmrtUsed == null) ? null : cdeAmrtUsed.trim();
  }

  /** The code identifying the LS2 Client Bank (the purchaser of LS2). */
  public String getCdeBank() {
    return cdeBank;
  }

  /** Trimmed version of {@link #getCdeBank()} */
  public String getCdeBank_trimmed() {
    return (cdeBank == null) ? null : cdeBank.trim();
  }

  /** The Owning Branch of the facility. */
  public String getCdeBranch() {
    return cdeBranch;
  }

  /** Trimmed version of {@link #getCdeBranch()} */
  public String getCdeBranch_trimmed() {
    return (cdeBranch == null) ? null : cdeBranch.trim();
  }

  /** The facility currency. */
  public String getCdeCurrency() {
    return cdeCurrency;
  }

  /** Trimmed version of {@link #getCdeCurrency()} */
  public String getCdeCurrency_trimmed() {
    return (cdeCurrency == null) ? null : cdeCurrency.trim();
  }

  /** The facility type code. */
  public String getCdeFacType() {
    return cdeFacType;
  }

  /** Trimmed version of {@link #getCdeFacType()} */
  public String getCdeFacType_trimmed() {
    return (cdeFacType == null) ? null : cdeFacType.trim();
  }

  /** The facility G/L Class Mapping Code. */
  public String getCdeFlGlMap() {
    return cdeFlGlMap;
  }

  /** Trimmed version of {@link #getCdeFlGlMap()} */
  public String getCdeFlGlMap_trimmed() {
    return (cdeFlGlMap == null) ? null : cdeFlGlMap.trim();
  }

  /** The funded amortization method used after the facility expiry date. */
  public String getCdeFndMthAf() {
    return cdeFndMthAf;
  }

  /** Trimmed version of {@link #getCdeFndMthAf()} */
  public String getCdeFndMthAf_trimmed() {
    return (cdeFndMthAf == null) ? null : cdeFndMthAf.trim();
  }

  /** The funded amortization method used before the facility expiry date. */
  public String getCdeFndMthBf() {
    return cdeFndMthBf;
  }

  /** Trimmed version of {@link #getCdeFndMthBf()} */
  public String getCdeFndMthBf_trimmed() {
    return (cdeFndMthBf == null) ? null : cdeFndMthBf.trim();
  }

  /** */
  public String getCdeLineBusns() {
    return cdeLineBusns;
  }

  /** Trimmed version of {@link #getCdeLineBusns()} */
  public String getCdeLineBusns_trimmed() {
    return (cdeLineBusns == null) ? null : cdeLineBusns.trim();
  }

  /** The performing status code for the facility. */
  public String getCdePerforming() {
    return cdePerforming;
  }

  /** Trimmed version of {@link #getCdePerforming()} */
  public String getCdePerforming_trimmed() {
    return (cdePerforming == null) ? null : cdePerforming.trim();
  }

  /** none */
  public String getCdePfClawbck() {
    return cdePfClawbck;
  }

  /** Trimmed version of {@link #getCdePfClawbck()} */
  public String getCdePfClawbck_trimmed() {
    return (cdePfClawbck == null) ? null : cdePfClawbck.trim();
  }

  /** none */
  public String getCdePfCurRul() {
    return cdePfCurRul;
  }

  /** Trimmed version of {@link #getCdePfCurRul()} */
  public String getCdePfCurRul_trimmed() {
    return (cdePfCurRul == null) ? null : cdePfCurRul.trim();
  }

  /**
   * &quot;The current penalty spread status. Possible values are &quot;&quot;On,&quot;&quot;
   * &quot;&quot;Off,&quot;&quot; and &quot;&quot;Waived&quot;&quot;.&quot;
   */
  public String getCdePnltyStat() {
    return cdePnltyStat;
  }

  /** Trimmed version of {@link #getCdePnltyStat()} */
  public String getCdePnltyStat_trimmed() {
    return (cdePnltyStat == null) ? null : cdePnltyStat.trim();
  }

  /** The facility processing area. */
  public String getCdeProcArea() {
    return cdeProcArea;
  }

  /** Trimmed version of {@link #getCdeProcArea()} */
  public String getCdeProcArea_trimmed() {
    return (cdeProcArea == null) ? null : cdeProcArea.trim();
  }

  /** The remote amortizaton method. */
  public String getCdeRmtAmMth() {
    return cdeRmtAmMth;
  }

  /** Trimmed version of {@link #getCdeRmtAmMth()} */
  public String getCdeRmtAmMth_trimmed() {
    return (cdeRmtAmMth == null) ? null : cdeRmtAmMth.trim();
  }

  /** The facility SIC (Standard Industry Code). */
  public String getCdeSic() {
    return cdeSic;
  }

  /** Trimmed version of {@link #getCdeSic()} */
  public String getCdeSic_trimmed() {
    return (cdeSic == null) ? null : cdeSic.trim();
  }

  /** The SIC Country Code. */
  public String getCdeSicCntry() {
    return cdeSicCntry;
  }

  /** Trimmed version of {@link #getCdeSicCntry()} */
  public String getCdeSicCntry_trimmed() {
    return (cdeSicCntry == null) ? null : cdeSicCntry.trim();
  }

  /** The facility subtype code. */
  public String getCdeSubtype() {
    return cdeSubtype;
  }

  /** Trimmed version of {@link #getCdeSubtype()} */
  public String getCdeSubtype_trimmed() {
    return (cdeSubtype == null) ? null : cdeSubtype.trim();
  }

  /** The unfunded amortization method. */
  public String getCdeUnfAmMth() {
    return cdeUnfAmMth;
  }

  /** Trimmed version of {@link #getCdeUnfAmMth()} */
  public String getCdeUnfAmMth_trimmed() {
    return (cdeUnfAmMth == null) ? null : cdeUnfAmMth.trim();
  }

  /** The date of a Credit Agreement governing this specific facility. */
  public Date getDteAgreement() {
    return dteAgreement;
  }

  /**
   * The estimated maturity/life of the facility (needed for amortization of discount when the
   * facility does not specify a facility maturity date).
   */
  public Date getDteAmrtMtrty() {
    return dteAmrtMtrty;
  }

  /** The effective date of the facility (prior to which no loans or fees can be released). */
  public Date getDteEffective() {
    return dteEffective;
  }

  /** The facility expiry date (after which no new loans or increases can be released). */
  public Date getDteExpiry() {
    return dteExpiry;
  }

  /**
   * The facility final maturity date (after which no new fees can be released and all interest and
   * fees due from the borrower(s) must be paid in full).
   */
  public Date getDteFinalMat() {
    return dteFinalMat;
  }

  /** The date of the first drawdown released for this facility. */
  public Date getDteFlDrawdwn() {
    return dteFlDrawdwn;
  }

  /** Earliest past due date (of all past due principal and interest) for this facility. */
  public Date getDtePastDue() {
    return dtePastDue;
  }

  /**
   * &quot;The SBLC Usage Expiration Date, representing the latest date on which an SBLC for this
   * facility can expire.&quot;
   */
  public Date getDteSblcExpry() {
    return dteSblcExpry;
  }

  /**
   * &quot;The SBLC &quot;&quot;Last Issuance By&quot;&quot; Date, representing the date after which
   * no new SBLC&apos;s can be issued for this facility.&quot;
   */
  public Date getDteSblcIssue() {
    return dteSblcIssue;
  }

  /** The termination date of the facility. */
  public Date getDteTermFac() {
    return dteTermFac;
  }

  /** Indicates whether or not compensating balances are required. */
  public Boolean getIndCmpnBalR() {
    return indCmpnBalR;
  }

  /** Indicator whether a facility cusip is listed or not */
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

  /** Defines the type of loans to which the penalty spread will apply. */
  public Boolean getIndFloatLoan() {
    return indFloatLoan;
  }

  /** none */
  public Boolean getIndIncXmlbil() {
    return indIncXmlbil;
  }

  /** Indicates whether or not the facility has a material adverse change clause. */
  public Boolean getIndMatAdvCh() {
    return indMatAdvCh;
  }

  /**
   * Indicates whether or not outstandings can exist under this facility in more than one currency.
   */
  public Boolean getIndMultiCurr() {
    return indMultiCurr;
  }

  /**
   * &quot;Indicates whether or not this is a single draw facility. In a future release, once a
   * portion of a single draw facility commitment is drawn down, the unused portion of the
   * commitment will no longer be available.&quot;
   */
  public Boolean getIndSngleDraw() {
    return indSngleDraw;
  }

  /** The name of the facility. */
  public String getNmeFacility() {
    return nmeFacility;
  }

  /** Trimmed version of {@link #getNmeFacility()} */
  public String getNmeFacility_trimmed() {
    return (nmeFacility == null) ? null : nmeFacility.trim();
  }

  /** The user assigned facility control number used as an alias for the facility. */
  public String getNumFacCntl() {
    return numFacCntl;
  }

  /** Trimmed version of {@link #getNumFacCntl()} */
  public String getNumFacCntl_trimmed() {
    return (numFacCntl == null) ? null : numFacCntl.trim();
  }

  /** The maximum number of currencies in which outstandings can exist at a given time. */
  public Integer getNumMaxCurOt() {
    return numMaxCurOt;
  }

  /**
   * The penalty grace period for the facility. Specifies the number of days after the due date on
   * which the penalty spread will become effective.
   */
  public Integer getNumPnsprGrpr() {
    return numPnsprGrpr;
  }

  /**
   * The number of outside conditions specified in facility pricing. This field is not maintained
   * and should be removed from the database.
   */
  public Integer getNumPrcOutCn() {
    return numPrcOutCn;
  }

  /**
   * &quot;The Effective FX Rate for the facility, used to translate the Facility Commitment Amounts
   * into the Deal Currency.&quot;
   */
  public BigDecimal getPctDealFxrte() {
    return pctDealFxrte;
  }

  /** The estimated usage percent for this facility. */
  public BigDecimal getPctEstUsage() {
    return pctEstUsage;
  }

  /**
   * &quot;The current penalty spread rate in effect for the facility, representing the additional
   * percentage points to be added as a &quot;&quot;penalty&quot;&quot; to the all-in-rate of a past
   * due loan. Penalty spread is never assessed on past-due fees.&quot;
   */
  public BigDecimal getPctPnltySprd() {
    return pctPnltySprd;
  }

  /** The loan repricing FX tolerance rate for facility. */
  public BigDecimal getPctTolFxrte() {
    return pctTolFxrte;
  }

  /** The usage threshold percent specified for the facility. */
  public BigDecimal getPctUseThresh() {
    return pctUseThresh;
  }

  /** The Deal RID (Record ID). */
  public String getPidDeal() {
    return pidDeal;
  }

  /** Trimmed version of {@link #getPidDeal()} */
  public String getPidDeal_trimmed() {
    return (pidDeal == null) ? null : pidDeal.trim();
  }

  /** contains RID of collateral group each facility belongs to */
  public String getRidCollatDef() {
    return ridCollatDef;
  }

  /** Trimmed version of {@link #getRidCollatDef()} */
  public String getRidCollatDef_trimmed() {
    return (ridCollatDef == null) ? null : ridCollatDef.trim();
  }

  /** Timestamp from when this row was created. */
  public Date getTspRecCreate() {
    return tspRecCreate;
  }

  /** Timestamp from when this row was last updated. */
  public Date getTspRecUpdate() {
    return tspRecUpdate;
  }

  /** To store the 9-digit facility cusip number */
  public String getTxtCusipNum() {
    return txtCusipNum;
  }

  /** Trimmed version of {@link #getTxtCusipNum()} */
  public String getTxtCusipNum_trimmed() {
    return (txtCusipNum == null) ? null : txtCusipNum.trim();
  }

  /** To store the 12-digit facility isin number */
  public String getTxtIsinNum() {
    return txtIsinNum;
  }

  /** Trimmed version of {@link #getTxtIsinNum()} */
  public String getTxtIsinNum_trimmed() {
    return (txtIsinNum == null) ? null : txtIsinNum.trim();
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

  /** The ANSI ID assigned by the Loan Pricing Corporation to uniquely identify this facility. */
  public String getXidAnsiId() {
    return xidAnsiId;
  }

  /** Trimmed version of {@link #getXidAnsiId()} */
  public String getXidAnsiId_trimmed() {
    return (xidAnsiId == null) ? null : xidAnsiId.trim();
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
  /** The Facility RID (Record ID). */
  public void setPidFacility(String pidFacility) {
    this.pidFacility = pidFacility;
  }

  /** &quot;The global facility current commitment, expressed in the deal currency.&quot; */
  public void setAmtDcGlCurr(BigDecimal amtDcGlCurr) {
    this.amtDcGlCurr = amtDcGlCurr;
  }

  /** &quot;The global facility closing commitment, expressed in the deal currency.&quot; */
  public void setAmtDcGlOrig(BigDecimal amtDcGlOrig) {
    this.amtDcGlOrig = amtDcGlOrig;
  }

  /**
   * The global facility proposed commitment (the amount requested by the borrower from the
   * syndicate prior to closing the deal).
   */
  public void setAmtGloPreclo(BigDecimal amtGloPreclo) {
    this.amtGloPreclo = amtGloPreclo;
  }

  /** The global facility current commitment. */
  public void setAmtGloblCurr(BigDecimal amtGloblCurr) {
    this.amtGloblCurr = amtGloblCurr;
  }

  /** The global facility closing commitment. */
  public void setAmtGloblOrig(BigDecimal amtGloblOrig) {
    this.amtGloblOrig = amtGloblOrig;
  }

  /**
   * The amount of the global facility current commitment that is presently unavailable to the
   * borrower(s).
   */
  public void setAmtUnavail(BigDecimal amtUnavail) {
    this.amtUnavail = amtUnavail;
  }

  /** The amortization method last used by this facility. */
  public void setCdeAmrtUsed(String cdeAmrtUsed) {
    this.cdeAmrtUsed = cdeAmrtUsed;
  }

  /** The code identifying the LS2 Client Bank (the purchaser of LS2). */
  public void setCdeBank(String cdeBank) {
    this.cdeBank = cdeBank;
  }

  /** The Owning Branch of the facility. */
  public void setCdeBranch(String cdeBranch) {
    this.cdeBranch = cdeBranch;
  }

  /** The facility currency. */
  public void setCdeCurrency(String cdeCurrency) {
    this.cdeCurrency = cdeCurrency;
  }

  /** The facility type code. */
  public void setCdeFacType(String cdeFacType) {
    this.cdeFacType = cdeFacType;
  }

  /** The facility G/L Class Mapping Code. */
  public void setCdeFlGlMap(String cdeFlGlMap) {
    this.cdeFlGlMap = cdeFlGlMap;
  }

  /** The funded amortization method used after the facility expiry date. */
  public void setCdeFndMthAf(String cdeFndMthAf) {
    this.cdeFndMthAf = cdeFndMthAf;
  }

  /** The funded amortization method used before the facility expiry date. */
  public void setCdeFndMthBf(String cdeFndMthBf) {
    this.cdeFndMthBf = cdeFndMthBf;
  }

  /** */
  public void setCdeLineBusns(String cdeLineBusns) {
    this.cdeLineBusns = cdeLineBusns;
  }

  /** The performing status code for the facility. */
  public void setCdePerforming(String cdePerforming) {
    this.cdePerforming = cdePerforming;
  }

  /** none */
  public void setCdePfClawbck(String cdePfClawbck) {
    this.cdePfClawbck = cdePfClawbck;
  }

  /** none */
  public void setCdePfCurRul(String cdePfCurRul) {
    this.cdePfCurRul = cdePfCurRul;
  }

  /**
   * &quot;The current penalty spread status. Possible values are &quot;&quot;On,&quot;&quot;
   * &quot;&quot;Off,&quot;&quot; and &quot;&quot;Waived&quot;&quot;.&quot;
   */
  public void setCdePnltyStat(String cdePnltyStat) {
    this.cdePnltyStat = cdePnltyStat;
  }

  /** The facility processing area. */
  public void setCdeProcArea(String cdeProcArea) {
    this.cdeProcArea = cdeProcArea;
  }

  /** The remote amortizaton method. */
  public void setCdeRmtAmMth(String cdeRmtAmMth) {
    this.cdeRmtAmMth = cdeRmtAmMth;
  }

  /** The facility SIC (Standard Industry Code). */
  public void setCdeSic(String cdeSic) {
    this.cdeSic = cdeSic;
  }

  /** The SIC Country Code. */
  public void setCdeSicCntry(String cdeSicCntry) {
    this.cdeSicCntry = cdeSicCntry;
  }

  /** The facility subtype code. */
  public void setCdeSubtype(String cdeSubtype) {
    this.cdeSubtype = cdeSubtype;
  }

  /** The unfunded amortization method. */
  public void setCdeUnfAmMth(String cdeUnfAmMth) {
    this.cdeUnfAmMth = cdeUnfAmMth;
  }

  /** The date of a Credit Agreement governing this specific facility. */
  public void setDteAgreement(Date dteAgreement) {
    this.dteAgreement = dteAgreement;
  }

  /**
   * The estimated maturity/life of the facility (needed for amortization of discount when the
   * facility does not specify a facility maturity date).
   */
  public void setDteAmrtMtrty(Date dteAmrtMtrty) {
    this.dteAmrtMtrty = dteAmrtMtrty;
  }

  /** The effective date of the facility (prior to which no loans or fees can be released). */
  public void setDteEffective(Date dteEffective) {
    this.dteEffective = dteEffective;
  }

  /** The facility expiry date (after which no new loans or increases can be released). */
  public void setDteExpiry(Date dteExpiry) {
    this.dteExpiry = dteExpiry;
  }

  /**
   * The facility final maturity date (after which no new fees can be released and all interest and
   * fees due from the borrower(s) must be paid in full).
   */
  public void setDteFinalMat(Date dteFinalMat) {
    this.dteFinalMat = dteFinalMat;
  }

  /** The date of the first drawdown released for this facility. */
  public void setDteFlDrawdwn(Date dteFlDrawdwn) {
    this.dteFlDrawdwn = dteFlDrawdwn;
  }

  /** Earliest past due date (of all past due principal and interest) for this facility. */
  public void setDtePastDue(Date dtePastDue) {
    this.dtePastDue = dtePastDue;
  }

  /**
   * &quot;The SBLC Usage Expiration Date, representing the latest date on which an SBLC for this
   * facility can expire.&quot;
   */
  public void setDteSblcExpry(Date dteSblcExpry) {
    this.dteSblcExpry = dteSblcExpry;
  }

  /**
   * &quot;The SBLC &quot;&quot;Last Issuance By&quot;&quot; Date, representing the date after which
   * no new SBLC&apos;s can be issued for this facility.&quot;
   */
  public void setDteSblcIssue(Date dteSblcIssue) {
    this.dteSblcIssue = dteSblcIssue;
  }

  /** The termination date of the facility. */
  public void setDteTermFac(Date dteTermFac) {
    this.dteTermFac = dteTermFac;
  }

  /** Indicates whether or not compensating balances are required. */
  public void setIndCmpnBalR(Boolean indCmpnBalR) {
    this.indCmpnBalR = indCmpnBalR;
  }

  /** Indicator whether a facility cusip is listed or not */
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

  /** Defines the type of loans to which the penalty spread will apply. */
  public void setIndFloatLoan(Boolean indFloatLoan) {
    this.indFloatLoan = indFloatLoan;
  }

  /** none */
  public void setIndIncXmlbil(Boolean indIncXmlbil) {
    this.indIncXmlbil = indIncXmlbil;
  }

  /** Indicates whether or not the facility has a material adverse change clause. */
  public void setIndMatAdvCh(Boolean indMatAdvCh) {
    this.indMatAdvCh = indMatAdvCh;
  }

  /**
   * Indicates whether or not outstandings can exist under this facility in more than one currency.
   */
  public void setIndMultiCurr(Boolean indMultiCurr) {
    this.indMultiCurr = indMultiCurr;
  }

  /**
   * &quot;Indicates whether or not this is a single draw facility. In a future release, once a
   * portion of a single draw facility commitment is drawn down, the unused portion of the
   * commitment will no longer be available.&quot;
   */
  public void setIndSngleDraw(Boolean indSngleDraw) {
    this.indSngleDraw = indSngleDraw;
  }

  /** The name of the facility. */
  public void setNmeFacility(String nmeFacility) {
    this.nmeFacility = nmeFacility;
  }

  /** The user assigned facility control number used as an alias for the facility. */
  public void setNumFacCntl(String numFacCntl) {
    this.numFacCntl = numFacCntl;
  }

  /** The maximum number of currencies in which outstandings can exist at a given time. */
  public void setNumMaxCurOt(Integer numMaxCurOt) {
    this.numMaxCurOt = numMaxCurOt;
  }

  /**
   * The penalty grace period for the facility. Specifies the number of days after the due date on
   * which the penalty spread will become effective.
   */
  public void setNumPnsprGrpr(Integer numPnsprGrpr) {
    this.numPnsprGrpr = numPnsprGrpr;
  }

  /**
   * The number of outside conditions specified in facility pricing. This field is not maintained
   * and should be removed from the database.
   */
  public void setNumPrcOutCn(Integer numPrcOutCn) {
    this.numPrcOutCn = numPrcOutCn;
  }

  /**
   * &quot;The Effective FX Rate for the facility, used to translate the Facility Commitment Amounts
   * into the Deal Currency.&quot;
   */
  public void setPctDealFxrte(BigDecimal pctDealFxrte) {
    this.pctDealFxrte = pctDealFxrte;
  }

  /** The estimated usage percent for this facility. */
  public void setPctEstUsage(BigDecimal pctEstUsage) {
    this.pctEstUsage = pctEstUsage;
  }

  /**
   * &quot;The current penalty spread rate in effect for the facility, representing the additional
   * percentage points to be added as a &quot;&quot;penalty&quot;&quot; to the all-in-rate of a past
   * due loan. Penalty spread is never assessed on past-due fees.&quot;
   */
  public void setPctPnltySprd(BigDecimal pctPnltySprd) {
    this.pctPnltySprd = pctPnltySprd;
  }

  /** The loan repricing FX tolerance rate for facility. */
  public void setPctTolFxrte(BigDecimal pctTolFxrte) {
    this.pctTolFxrte = pctTolFxrte;
  }

  /** The usage threshold percent specified for the facility. */
  public void setPctUseThresh(BigDecimal pctUseThresh) {
    this.pctUseThresh = pctUseThresh;
  }

  /** The Deal RID (Record ID). */
  public void setPidDeal(String pidDeal) {
    this.pidDeal = pidDeal;
  }

  /** contains RID of collateral group each facility belongs to */
  public void setRidCollatDef(String ridCollatDef) {
    this.ridCollatDef = ridCollatDef;
  }

  /** Timestamp from when this row was created. */
  public void setTspRecCreate(Date tspRecCreate) {
    this.tspRecCreate = tspRecCreate;
  }

  /** Timestamp from when this row was last updated. */
  public void setTspRecUpdate(Date tspRecUpdate) {
    this.tspRecUpdate = tspRecUpdate;
  }

  /** To store the 9-digit facility cusip number */
  public void setTxtCusipNum(String txtCusipNum) {
    this.txtCusipNum = txtCusipNum;
  }

  /** To store the 12-digit facility isin number */
  public void setTxtIsinNum(String txtIsinNum) {
    this.txtIsinNum = txtIsinNum;
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

  /** The ANSI ID assigned by the Loan Pricing Corporation to uniquely identify this facility. */
  public void setXidAnsiId(String xidAnsiId) {
    this.xidAnsiId = xidAnsiId;
  }

  /** */
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(pidFacility);
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
    CsvFacility other = (CsvFacility) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.pidFacility, other.pidFacility);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(CsvFacility other) {
    CompareHelper helper = new CompareHelper();
    helper.append("pidFacility", this.pidFacility, other.pidFacility);
    helper.append("amtDcGlCurr", this.amtDcGlCurr, other.amtDcGlCurr);
    helper.append("amtDcGlOrig", this.amtDcGlOrig, other.amtDcGlOrig);
    helper.append("amtGloPreclo", this.amtGloPreclo, other.amtGloPreclo);
    helper.append("amtGloblCurr", this.amtGloblCurr, other.amtGloblCurr);
    helper.append("amtGloblOrig", this.amtGloblOrig, other.amtGloblOrig);
    helper.append("amtUnavail", this.amtUnavail, other.amtUnavail);
    helper.append("cdeAmrtUsed", this.cdeAmrtUsed, other.cdeAmrtUsed);
    helper.append("cdeBank", this.cdeBank, other.cdeBank);
    helper.append("cdeBranch", this.cdeBranch, other.cdeBranch);
    helper.append("cdeCurrency", this.cdeCurrency, other.cdeCurrency);
    helper.append("cdeFacType", this.cdeFacType, other.cdeFacType);
    helper.append("cdeFlGlMap", this.cdeFlGlMap, other.cdeFlGlMap);
    helper.append("cdeFndMthAf", this.cdeFndMthAf, other.cdeFndMthAf);
    helper.append("cdeFndMthBf", this.cdeFndMthBf, other.cdeFndMthBf);
    helper.append("cdeLineBusns", this.cdeLineBusns, other.cdeLineBusns);
    helper.append("cdePerforming", this.cdePerforming, other.cdePerforming);
    helper.append("cdePfClawbck", this.cdePfClawbck, other.cdePfClawbck);
    helper.append("cdePfCurRul", this.cdePfCurRul, other.cdePfCurRul);
    helper.append("cdePnltyStat", this.cdePnltyStat, other.cdePnltyStat);
    helper.append("cdeProcArea", this.cdeProcArea, other.cdeProcArea);
    helper.append("cdeRmtAmMth", this.cdeRmtAmMth, other.cdeRmtAmMth);
    helper.append("cdeSic", this.cdeSic, other.cdeSic);
    helper.append("cdeSicCntry", this.cdeSicCntry, other.cdeSicCntry);
    helper.append("cdeSubtype", this.cdeSubtype, other.cdeSubtype);
    helper.append("cdeUnfAmMth", this.cdeUnfAmMth, other.cdeUnfAmMth);
    helper.append("dteAgreement", this.dteAgreement, other.dteAgreement);
    helper.append("dteAmrtMtrty", this.dteAmrtMtrty, other.dteAmrtMtrty);
    helper.append("dteEffective", this.dteEffective, other.dteEffective);
    helper.append("dteExpiry", this.dteExpiry, other.dteExpiry);
    helper.append("dteFinalMat", this.dteFinalMat, other.dteFinalMat);
    helper.append("dteFlDrawdwn", this.dteFlDrawdwn, other.dteFlDrawdwn);
    helper.append("dtePastDue", this.dtePastDue, other.dtePastDue);
    helper.append("dteSblcExpry", this.dteSblcExpry, other.dteSblcExpry);
    helper.append("dteSblcIssue", this.dteSblcIssue, other.dteSblcIssue);
    helper.append("dteTermFac", this.dteTermFac, other.dteTermFac);
    helper.append("indCmpnBalR", this.indCmpnBalR, other.indCmpnBalR);
    helper.append("indCusipLst", this.indCusipLst, other.indCusipLst);
    helper.append("indDontMail", this.indDontMail, other.indDontMail);
    helper.append("indDontPrnt", this.indDontPrnt, other.indDontPrnt);
    helper.append("indFloatLoan", this.indFloatLoan, other.indFloatLoan);
    helper.append("indIncXmlbil", this.indIncXmlbil, other.indIncXmlbil);
    helper.append("indMatAdvCh", this.indMatAdvCh, other.indMatAdvCh);
    helper.append("indMultiCurr", this.indMultiCurr, other.indMultiCurr);
    helper.append("indSngleDraw", this.indSngleDraw, other.indSngleDraw);
    helper.append("nmeFacility", this.nmeFacility, other.nmeFacility);
    helper.append("numFacCntl", this.numFacCntl, other.numFacCntl);
    helper.append("numMaxCurOt", this.numMaxCurOt, other.numMaxCurOt);
    helper.append("numPnsprGrpr", this.numPnsprGrpr, other.numPnsprGrpr);
    helper.append("numPrcOutCn", this.numPrcOutCn, other.numPrcOutCn);
    helper.append("pctDealFxrte", this.pctDealFxrte, other.pctDealFxrte);
    helper.append("pctEstUsage", this.pctEstUsage, other.pctEstUsage);
    helper.append("pctPnltySprd", this.pctPnltySprd, other.pctPnltySprd);
    helper.append("pctTolFxrte", this.pctTolFxrte, other.pctTolFxrte);
    helper.append("pctUseThresh", this.pctUseThresh, other.pctUseThresh);
    helper.append("pidDeal", this.pidDeal, other.pidDeal);
    helper.append("ridCollatDef", this.ridCollatDef, other.ridCollatDef);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("txtCusipNum", this.txtCusipNum, other.txtCusipNum);
    helper.append("txtIsinNum", this.txtIsinNum, other.txtIsinNum);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    helper.append("xidAnsiId", this.xidAnsiId, other.xidAnsiId);
    return helper;
  }
}
