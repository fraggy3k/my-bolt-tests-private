/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/**
 * The facility table. A credit arrangement established by the bank for the client.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsFacilityFields {
  pidFacility("FAC_PID_FACILITY", "pidFacility", ColumnDataType.CHARACTER, 8),
  amtDcGlCurr("FAC_AMT_DC_GL_CURR", "amtDcGlCurr", ColumnDataType.DECIMAL, -1),
  amtDcGlOrig("FAC_AMT_DC_GL_ORIG", "amtDcGlOrig", ColumnDataType.DECIMAL, -1),
  amtGloPreclo("FAC_AMT_GLO_PRECLO", "amtGloPreclo", ColumnDataType.DECIMAL, -1),
  amtGloblCurr("FAC_AMT_GLOBL_CURR", "amtGloblCurr", ColumnDataType.DECIMAL, -1),
  amtGloblOrig("FAC_AMT_GLOBL_ORIG", "amtGloblOrig", ColumnDataType.DECIMAL, -1),
  amtUnavail("FAC_AMT_UNAVAIL", "amtUnavail", ColumnDataType.DECIMAL, -1),
  cdeAmrtUsed("FAC_CDE_AMRT_USED", "cdeAmrtUsed", ColumnDataType.CHARACTER, 5),
  cdeBank("FAC_CDE_BANK", "cdeBank", ColumnDataType.CHARACTER, 5),
  cdeBranch("FAC_CDE_BRANCH", "cdeBranch", ColumnDataType.CHARACTER, 5),
  cdeCurrency("FAC_CDE_CURRENCY", "cdeCurrency", ColumnDataType.CHARACTER, 3),
  cdeFacType("FAC_CDE_FAC_TYPE", "cdeFacType", ColumnDataType.CHARACTER, 5),
  cdeFlGlMap("FAC_CDE_FL_GL_MAP", "cdeFlGlMap", ColumnDataType.CHARACTER, 5),
  cdeFndMthAf("FAC_CDE_FND_MTH_AF", "cdeFndMthAf", ColumnDataType.CHARACTER, 5),
  cdeFndMthBf("FAC_CDE_FND_MTH_BF", "cdeFndMthBf", ColumnDataType.CHARACTER, 5),
  cdeLineBusns("FAC_CDE_LINE_BUSNS", "cdeLineBusns", ColumnDataType.CHARACTER, 5),
  cdePerforming("FAC_CDE_PERFORMING", "cdePerforming", ColumnDataType.CHARACTER, 5),
  cdePfClawbck("FAC_CDE_PF_CLAWBCK", "cdePfClawbck", ColumnDataType.CHAR, 5),
  cdePfCurRul("FAC_CDE_PF_CUR_RUL", "cdePfCurRul", ColumnDataType.CHAR, 5),
  cdePnltyStat("FAC_CDE_PNLTY_STAT", "cdePnltyStat", ColumnDataType.CHARACTER, 5),
  cdeProcArea("FAC_CDE_PROC_AREA", "cdeProcArea", ColumnDataType.CHARACTER, 5),
  cdeRmtAmMth("FAC_CDE_RMT_AM_MTH", "cdeRmtAmMth", ColumnDataType.CHARACTER, 5),
  cdeSic("FAC_CDE_SIC", "cdeSic", ColumnDataType.CHARACTER, 10),
  cdeSicCntry("FAC_CDE_SIC_CNTRY", "cdeSicCntry", ColumnDataType.CHARACTER, 2),
  cdeSubtype("FAC_CDE_SUBTYPE", "cdeSubtype", ColumnDataType.CHARACTER, 5),
  cdeUnfAmMth("FAC_CDE_UNF_AM_MTH", "cdeUnfAmMth", ColumnDataType.CHARACTER, 5),
  dteAgreement("FAC_DTE_AGREEMENT", "dteAgreement", ColumnDataType.DATE, 4),
  dteAmrtMtrty("FAC_DTE_AMRT_MTRTY", "dteAmrtMtrty", ColumnDataType.DATE, 4),
  dteEffective("FAC_DTE_EFFECTIVE", "dteEffective", ColumnDataType.DATE, 4),
  dteExpiry("FAC_DTE_EXPIRY", "dteExpiry", ColumnDataType.DATE, 4),
  dteFinalMat("FAC_DTE_FINAL_MAT", "dteFinalMat", ColumnDataType.DATE, 4),
  dteFlDrawdwn("FAC_DTE_FL_DRAWDWN", "dteFlDrawdwn", ColumnDataType.DATE, 4),
  dtePastDue("FAC_DTE_PAST_DUE", "dtePastDue", ColumnDataType.DATE, 4),
  dteSblcExpry("FAC_DTE_SBLC_EXPRY", "dteSblcExpry", ColumnDataType.DATE, 4),
  dteSblcIssue("FAC_DTE_SBLC_ISSUE", "dteSblcIssue", ColumnDataType.DATE, 4),
  dteTermFac("FAC_DTE_TERM_FAC", "dteTermFac", ColumnDataType.DATE, 4),
  indCmpnBalR("FAC_IND_CMPN_BAL_R", "indCmpnBalR", ColumnDataType.CHARACTER, 1),
  indCusipLst("FAC_IND_CUSIP_LST", "indCusipLst", ColumnDataType.CHARACTER, 1),
  indDontMail("FAC_IND_DONT_MAIL", "indDontMail", ColumnDataType.CHAR, 1),
  indDontPrnt("FAC_IND_DONT_PRNT", "indDontPrnt", ColumnDataType.CHAR, 1),
  indFloatLoan("FAC_IND_FLOAT_LOAN", "indFloatLoan", ColumnDataType.CHARACTER, 1),
  indIncXmlbil("FAC_IND_INC_XMLBIL", "indIncXmlbil", ColumnDataType.CHAR, 1),
  indMatAdvCh("FAC_IND_MAT_ADV_CH", "indMatAdvCh", ColumnDataType.CHARACTER, 1),
  indMultiCurr("FAC_IND_MULTI_CURR", "indMultiCurr", ColumnDataType.CHARACTER, 1),
  indSngleDraw("FAC_IND_SNGLE_DRAW", "indSngleDraw", ColumnDataType.CHARACTER, 1),
  nmeFacility("FAC_NME_FACILITY", "nmeFacility", ColumnDataType.CHARACTER, 30),
  numFacCntl("FAC_NUM_FAC_CNTL", "numFacCntl", ColumnDataType.CHARACTER, 15),
  numMaxCurOt("FAC_NUM_MAX_CUR_OT", "numMaxCurOt", ColumnDataType.SMALLINT, 2),
  numPnsprGrpr("FAC_NUM_PNSPR_GRPR", "numPnsprGrpr", ColumnDataType.SMALLINT, 2),
  numPrcOutCn("FAC_NUM_PRC_OUT_CN", "numPrcOutCn", ColumnDataType.SMALLINT, 2),
  pctDealFxrte("FAC_PCT_DEAL_FXRTE", "pctDealFxrte", ColumnDataType.DECIMAL, -1),
  pctEstUsage("FAC_PCT_EST_USAGE", "pctEstUsage", ColumnDataType.DECIMAL, -1),
  pctPnltySprd("FAC_PCT_PNLTY_SPRD", "pctPnltySprd", ColumnDataType.DECIMAL, -1),
  pctTolFxrte("FAC_PCT_TOL_FXRTE", "pctTolFxrte", ColumnDataType.DECIMAL, -1),
  pctUseThresh("FAC_PCT_USE_THRESH", "pctUseThresh", ColumnDataType.DECIMAL, -1),
  pidDeal("FAC_PID_DEAL", "pidDeal", ColumnDataType.CHARACTER, 8),
  ridCollatDef("FAC_RID_COLLAT_DEF", "ridCollatDef", ColumnDataType.CHARACTER, 8),
  tspRecCreate("FAC_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.TIMESTAMP, 10),
  tspRecUpdate("FAC_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.TIMESTAMP, 10),
  txtCusipNum("FAC_TXT_CUSIP_NUM", "txtCusipNum", ColumnDataType.CHARACTER, 9),
  txtIsinNum("FAC_TXT_ISIN_NUM", "txtIsinNum", ColumnDataType.CHARACTER, 12),
  uidRecCreate("FAC_UID_REC_CREATE", "uidRecCreate", ColumnDataType.CHARACTER, 8),
  uidRecUpdate("FAC_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.CHARACTER, 8),
  xidAnsiId("FAC_XID_ANSI_ID", "xidAnsiId", ColumnDataType.CHARACTER, 13),
  bank("FAC_CDE_BANK", "bank", ColumnDataType.CHAR, 5),
  branch("FAC_CDE_BRANCH", "branch", ColumnDataType.CHAR, 5),
  deal("FAC_PID_DEAL", "deal", ColumnDataType.CHAR, 8),
  facilityType("FAC_CDE_FAC_TYPE", "facilityType", ColumnDataType.CHAR, 5),
  facilityAdmin("FAC_PID_FACILITY", "facilityAdmin", ColumnDataType.CHAR, 8),
  facBorrDetls("FAC_PID_FACILITY", "facBorrDetls", ColumnDataType.CHAR, 8),
  facCommitTrns("FAC_PID_FACILITY", "facCommitTrns", ColumnDataType.CHAR, 8),
  facHostAgrs("FAC_PID_FACILITY", "facHostAgrs", ColumnDataType.CHAR, 8),
  outstandings("FAC_PID_FACILITY", "outstandings", ColumnDataType.CHAR, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsFacilityFields(String columnName, String fieldName, ColumnDataType type, int length) {
    this.columnName = columnName;
    this.fieldName = fieldName;
    this.type = type;
    this.length = length;
  }

  public String getColumnName() {
    return this.columnName;
  }

  public String getFieldName() {
    return this.fieldName;
  }

  public ColumnDataType getType() {
    return this.type;
  }

  public int getLength() {
    return this.length;
  }

  public boolean isChar() {
    return type == ColumnDataType.CHARACTER;
  }
}
