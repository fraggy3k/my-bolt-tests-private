/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/**
 * The deal table. A record of a borrowing agreement between the lender and the borrower which may
 * encompass one or more credit facilities.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsDealFields {
  pidDeal("DEA_PID_DEAL", "pidDeal", ColumnDataType.CHARACTER, 8),
  amtGloPreclo("DEA_AMT_GLO_PRECLO", "amtGloPreclo", ColumnDataType.DECIMAL, -1),
  amtNacrTlrnc("DEA_AMT_NACR_TLRNC", "amtNacrTlrnc", ColumnDataType.DECIMAL, -1),
  cdeBank("DEA_CDE_BANK", "cdeBank", ColumnDataType.CHARACTER, 5),
  cdeBranch("DEA_CDE_BRANCH", "cdeBranch", ColumnDataType.CHARACTER, 5),
  cdeCrAsn("DEA_CDE_CR_ASN", "cdeCrAsn", ColumnDataType.CHARACTER, 5),
  cdeCrPartic("DEA_CDE_CR_PARTIC", "cdeCrPartic", ColumnDataType.CHARACTER, 5),
  cdeDealClass("DEA_CDE_DEAL_CLASS", "cdeDealClass", ColumnDataType.CHARACTER, 5),
  cdeDealStat("DEA_CDE_DEAL_STAT", "cdeDealStat", ColumnDataType.CHARACTER, 5),
  cdeDepSubtyp("DEA_CDE_DEP_SUBTYP", "cdeDepSubtyp", ColumnDataType.CHARACTER, 5),
  cdeDept("DEA_CDE_DEPT", "cdeDept", ColumnDataType.CHARACTER, 5),
  cdeExpense("DEA_CDE_EXPENSE", "cdeExpense", ColumnDataType.CHARACTER, 15),
  cdeInpalRule("DEA_CDE_INPAL_RULE", "cdeInpalRule", ColumnDataType.CHARACTER, 10),
  cdeOrigCcy("DEA_CDE_ORIG_CCY", "cdeOrigCcy", ColumnDataType.CHARACTER, 3),
  cdePdlgcRule("DEA_CDE_PDLGC_RULE", "cdePdlgcRule", ColumnDataType.CHARACTER, 10),
  cdePerforming("DEA_CDE_PERFORMING", "cdePerforming", ColumnDataType.CHARACTER, 5),
  cdeProcArea("DEA_CDE_PROC_AREA", "cdeProcArea", ColumnDataType.CHARACTER, 5),
  cdeReasonNfs("DEA_CDE_REASON_NFS", "cdeReasonNfs", ColumnDataType.CHARACTER, 5),
  cdeSellStage("DEA_CDE_SELL_STAGE", "cdeSellStage", ColumnDataType.CHARACTER, 5),
  cdeTermReasn("DEA_CDE_TERM_REASN", "cdeTermReasn", ColumnDataType.CHARACTER, 5),
  dteAgreement("DEA_DTE_AGREEMENT", "dteAgreement", ColumnDataType.DATE, 4),
  dteApproved("DEA_DTE_APPROVED", "dteApproved", ColumnDataType.DATE, 4),
  dteCancelEff("DEA_DTE_CANCEL_EFF", "dteCancelEff", ColumnDataType.DATE, 4),
  dteCommitLtr("DEA_DTE_COMMIT_LTR", "dteCommitLtr", ColumnDataType.DATE, 4),
  dteDealClsd("DEA_DTE_DEAL_CLSD", "dteDealClsd", ColumnDataType.DATE, 4),
  dteFacCutoff("DEA_DTE_FAC_CUTOFF", "dteFacCutoff", ColumnDataType.DATE, 4),
  dteLastRevwd("DEA_DTE_LAST_REVWD", "dteLastRevwd", ColumnDataType.DATE, 4),
  dteProjClose("DEA_DTE_PROJ_CLOSE", "dteProjClose", ColumnDataType.DATE, 4),
  dteSblcExp("DEA_DTE_SBLC_EXP", "dteSblcExp", ColumnDataType.DATE, 4),
  dteSblcIssue("DEA_DTE_SBLC_ISSUE", "dteSblcIssue", ColumnDataType.DATE, 4),
  dteTermEff("DEA_DTE_TERM_EFF", "dteTermEff", ColumnDataType.DATE, 4),
  indAcctEnabl("DEA_IND_ACCT_ENABL", "indAcctEnabl", ColumnDataType.CHARACTER, 1),
  indActive("DEA_IND_ACTIVE", "indActive", ColumnDataType.CHARACTER, 1),
  indActual("DEA_IND_ACTUAL", "indActual", ColumnDataType.CHARACTER, 1),
  indAutoGen("DEA_IND_AUTO_GEN", "indAutoGen", ColumnDataType.CHARACTER, 1),
  indAutoNonp("DEA_IND_AUTO_NONP", "indAutoNonp", ColumnDataType.CHARACTER, 1),
  indAutoPrepf("DEA_IND_AUTO_PREPF", "indAutoPrepf", ColumnDataType.CHARACTER, 1),
  indAutoRel("DEA_IND_AUTO_REL", "indAutoRel", ColumnDataType.CHARACTER, 1),
  indCnslBill("DEA_IND_CNSL_BILL", "indCnslBill", ColumnDataType.CHARACTER, 1),
  indCra("DEA_IND_CRA", "indCra", ColumnDataType.CHARACTER, 1),
  indCusipLst("DEA_IND_CUSIP_LST", "indCusipLst", ColumnDataType.CHARACTER, 1),
  indDontMail("DEA_IND_DONT_MAIL", "indDontMail", ColumnDataType.CHAR, 1),
  indDontPrnt("DEA_IND_DONT_PRNT", "indDontPrnt", ColumnDataType.CHAR, 1),
  indEarlyDisc("DEA_IND_EARLY_DISC", "indEarlyDisc", ColumnDataType.CHARACTER, 1),
  indFund("DEA_IND_FUND", "indFund", ColumnDataType.CHARACTER, 1),
  indGuarDeal("DEA_IND_GUAR_DEAL", "indGuarDeal", ColumnDataType.CHARACTER, 1),
  indHlt("DEA_IND_HLT", "indHlt", ColumnDataType.CHARACTER, 1),
  indIncXmlbil("DEA_IND_INC_XMLBIL", "indIncXmlbil", ColumnDataType.CHAR, 1),
  indNatnlCrdt("DEA_IND_NATNL_CRDT", "indNatnlCrdt", ColumnDataType.CHARACTER, 1),
  indOutsdDeal("DEA_IND_OUTSD_DEAL", "indOutsdDeal", ColumnDataType.CHARACTER, 1),
  indPastDueb("DEA_IND_PAST_DUEB", "indPastDueb", ColumnDataType.CHARACTER, 1),
  indRestrict("DEA_IND_RESTRICT", "indRestrict", ColumnDataType.CHARACTER, 1),
  indRsrvAdj("DEA_IND_RSRV_ADJ", "indRsrvAdj", ColumnDataType.CHARACTER, 1),
  indSoleLendr("DEA_IND_SOLE_LENDR", "indSoleLendr", ColumnDataType.CHARACTER, 1),
  nmeAliasName("DEA_NME_ALIAS_NAME", "nmeAliasName", ColumnDataType.CHARACTER, 40),
  nmeDeal("DEA_NME_DEAL", "nmeDeal", ColumnDataType.CHARACTER, 40),
  numDealCntl("DEA_NUM_DEAL_CNTL", "numDealCntl", ColumnDataType.CHARACTER, 12),
  numEuroIntrm("DEA_NUM_EURO_INTRM", "numEuroIntrm", ColumnDataType.SMALLINT, 2),
  numGracePer("DEA_NUM_GRACE_PER", "numGracePer", ColumnDataType.INTEGER, 4),
  numMatchDraw("DEA_NUM_MATCH_DRAW", "numMatchDraw", ColumnDataType.SMALLINT, 2),
  numMaxDraw("DEA_NUM_MAX_DRAW", "numMaxDraw", ColumnDataType.SMALLINT, 2),
  pctNacrTlrnc("DEA_PCT_NACR_TLRNC", "pctNacrTlrnc", ColumnDataType.DECIMAL, -1),
  ridCollatDef("DEA_RID_COLLAT_DEF", "ridCollatDef", ColumnDataType.CHARACTER, 8),
  rtoFctSaldif("DEA_RTO_FCT_SALDIF", "rtoFctSaldif", ColumnDataType.DECIMAL, -1),
  tspRecCreate("DEA_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.TIMESTAMP, 10),
  tspRecUpdate("DEA_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.TIMESTAMP, 10),
  txtCusipNum("DEA_TXT_CUSIP_NUM", "txtCusipNum", ColumnDataType.CHARACTER, 9),
  txtIsinNum("DEA_TXT_ISIN_NUM", "txtIsinNum", ColumnDataType.CHARACTER, 12),
  uidAdmnstratr("DEA_UID_ADMNSTRATR", "uidAdmnstratr", ColumnDataType.CHARACTER, 8),
  uidLastRevwr("DEA_UID_LAST_REVWR", "uidLastRevwr", ColumnDataType.CHARACTER, 8),
  uidOriginator("DEA_UID_ORIGINATOR", "uidOriginator", ColumnDataType.CHARACTER, 8),
  uidRecCreate("DEA_UID_REC_CREATE", "uidRecCreate", ColumnDataType.CHARACTER, 8),
  uidRecUpdate("DEA_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.CHARACTER, 8),
  uidRelManagr("DEA_UID_REL_MANAGR", "uidRelManagr", ColumnDataType.CHARACTER, 8),
  xidAltDealid("DEA_XID_ALT_DEALID", "xidAltDealid", ColumnDataType.CHARACTER, 10),
  xidAnsiId("DEA_XID_ANSI_ID", "xidAnsiId", ColumnDataType.CHARACTER, 9),
  xidNatnlCrdt("DEA_XID_NATNL_CRDT", "xidNatnlCrdt", ColumnDataType.CHARACTER, 8),
  bank("DEA_CDE_BANK", "bank", ColumnDataType.CHAR, 5),
  branch("DEA_CDE_BRANCH", "branch", ColumnDataType.CHAR, 5),
  dealAdmin("DEA_PID_DEAL", "dealAdmin", ColumnDataType.CHAR, 8),
  dealBorrowers("DEA_PID_DEAL", "dealBorrowers", ColumnDataType.CHAR, 8),
  facCommitTrns("DEA_PID_DEAL", "facCommitTrns", ColumnDataType.CHAR, 8),
  facHostAgrs("DEA_PID_DEAL", "facHostAgrs", ColumnDataType.CHAR, 8),
  facilities("DEA_PID_DEAL", "facilities", ColumnDataType.CHAR, 8),
  outstandings("DEA_PID_DEAL", "outstandings", ColumnDataType.CHAR, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsDealFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
