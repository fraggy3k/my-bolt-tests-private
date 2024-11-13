/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/**
 * The outstanding table. Outstanding amounts and dates for loans and letters of credit.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsOutstandingFields {
  ridOutstandng("OST_RID_OUTSTANDNG", "ridOutstandng", ColumnDataType.CHARACTER, 8),
  amtBankGross("OST_AMT_BANK_GROSS", "amtBankGross", ColumnDataType.DECIMAL, -1),
  amtBankNet("OST_AMT_BANK_NET", "amtBankNet", ColumnDataType.DECIMAL, -1),
  amtCurrent("OST_AMT_CURRENT", "amtCurrent", ColumnDataType.DECIMAL, -1),
  amtFcBnkGrs("OST_AMT_FC_BNK_GRS", "amtFcBnkGrs", ColumnDataType.DECIMAL, -1),
  amtFcBnkNet("OST_AMT_FC_BNK_NET", "amtFcBnkNet", ColumnDataType.DECIMAL, -1),
  amtFcCurrent("OST_AMT_FC_CURRENT", "amtFcCurrent", ColumnDataType.DECIMAL, -1),
  amtNacrTlrnc("OST_AMT_NACR_TLRNC", "amtNacrTlrnc", ColumnDataType.DECIMAL, -1),
  amtOriginal("OST_AMT_ORIGINAL", "amtOriginal", ColumnDataType.DECIMAL, -1),
  amtSchedBal("OST_AMT_SCHED_BAL", "amtSchedBal", ColumnDataType.DECIMAL, -1),
  cdeAcrPeriod("OST_CDE_ACR_PERIOD", "cdeAcrPeriod", ColumnDataType.CHARACTER, 5),
  cdeActAcrRl("OST_CDE_ACT_ACR_RL", "cdeActAcrRl", ColumnDataType.CHARACTER, 5),
  cdeAnvdteEom("OST_CDE_ANVDTE_EOM", "cdeAnvdteEom", ColumnDataType.CHAR, 5),
  cdeCurrency("OST_CDE_CURRENCY", "cdeCurrency", ColumnDataType.CHARACTER, 3),
  cdeDecPrecn("OST_CDE_DEC_PRECN", "cdeDecPrecn", ColumnDataType.CHAR, 5),
  cdeDecRound("OST_CDE_DEC_ROUND", "cdeDecRound", ColumnDataType.CHAR, 5),
  cdeEndteRule("OST_CDE_ENDTE_RULE", "cdeEndteRule", ColumnDataType.CHARACTER, 5),
  cdeExtension("OST_CDE_EXTENSION", "cdeExtension", ColumnDataType.CHARACTER, 5),
  cdeFracIrate("OST_CDE_FRAC_IRATE", "cdeFracIrate", ColumnDataType.CHAR, 5),
  cdeFracRound("OST_CDE_FRAC_ROUND", "cdeFracRound", ColumnDataType.CHAR, 5),
  cdeFrgWthhld("OST_CDE_FRG_WTHHLD", "cdeFrgWthhld", ColumnDataType.CHARACTER, 5),
  cdeGlClass("OST_CDE_GL_CLASS", "cdeGlClass", ColumnDataType.CHARACTER, 5),
  cdeLoanPurp("OST_CDE_LOAN_PURP", "cdeLoanPurp", ColumnDataType.CHARACTER, 5),
  cdeObStCtg("OST_CDE_OB_ST_CTG", "cdeObStCtg", ColumnDataType.CHARACTER, 5),
  cdeObjState("OST_CDE_OBJ_STATE", "cdeObjState", ColumnDataType.CHARACTER, 5),
  cdeOutstdTyp("OST_CDE_OUTSTD_TYP", "cdeOutstdTyp", ColumnDataType.CHARACTER, 5),
  cdeOverageRl("OST_CDE_OVERAGE_RL", "cdeOverageRl", ColumnDataType.CHARACTER, 5),
  cdePerfStat("OST_CDE_PERF_STAT", "cdePerfStat", ColumnDataType.CHARACTER, 5),
  cdePriceOpt("OST_CDE_PRICE_OPT", "cdePriceOpt", ColumnDataType.CHARACTER, 5),
  cdeRacRepric("OST_CDE_RAC_REPRIC", "cdeRacRepric", ColumnDataType.CHARACTER, 5),
  cdeRapMthd("OST_CDE_RAP_MTHD", "cdeRapMthd", ColumnDataType.CHAR, 5),
  cdeReprFreq("OST_CDE_REPR_FREQ", "cdeReprFreq", ColumnDataType.CHARACTER, 5),
  cdeRiskType("OST_CDE_RISK_TYPE", "cdeRiskType", ColumnDataType.CHARACTER, 5),
  cdeRqstCcy("OST_CDE_RQST_CCY", "cdeRqstCcy", ColumnDataType.CHARACTER, 3),
  cdeSic("OST_CDE_SIC", "cdeSic", ColumnDataType.CHARACTER, 10),
  cdeSicCntry("OST_CDE_SIC_CNTRY", "cdeSicCntry", ColumnDataType.CHARACTER, 2),
  cdeTaxExempt("OST_CDE_TAX_EXEMPT", "cdeTaxExempt", ColumnDataType.CHARACTER, 5),
  cdeTrsryArea("OST_CDE_TRSRY_AREA", "cdeTrsryArea", ColumnDataType.CHARACTER, 5),
  cidBorrower("OST_CID_BORROWER", "cidBorrower", ColumnDataType.CHARACTER, 8),
  dteActRepric("OST_DTE_ACT_REPRIC", "dteActRepric", ColumnDataType.DATE, 4),
  dteAniversary("OST_DTE_ANIVERSARY", "dteAniversary", ColumnDataType.DATE, 4),
  dteEffective("OST_DTE_EFFECTIVE", "dteEffective", ColumnDataType.DATE, 4),
  dteExpiryClc("OST_DTE_EXPIRY_CLC", "dteExpiryClc", ColumnDataType.DATE, 4),
  dteExpiryEnt("OST_DTE_EXPIRY_ENT", "dteExpiryEnt", ColumnDataType.DATE, 4),
  dteExpiryFnl("OST_DTE_EXPIRY_FNL", "dteExpiryFnl", ColumnDataType.DATE, 4),
  dtePaidDown("OST_DTE_PAID_DOWN", "dtePaidDown", ColumnDataType.DATE, 4),
  dteRacRepric("OST_DTE_RAC_REPRIC", "dteRacRepric", ColumnDataType.DATE, 4),
  dteRepricing("OST_DTE_REPRICING", "dteRepricing", ColumnDataType.DATE, 4),
  indAcCfOnly("OST_IND_AC_CF_ONLY", "indAcCfOnly", ColumnDataType.CHARACTER, 1),
  indAcScdBal("OST_IND_AC_SCD_BAL", "indAcScdBal", ColumnDataType.CHARACTER, 1),
  indAccruable("OST_IND_ACCRUABLE", "indAccruable", ColumnDataType.CHARACTER, 1),
  indAnvDteAp("OST_IND_ANV_DTE_AP", "indAnvDteAp", ColumnDataType.CHAR, 1),
  indAutoExtnd("OST_IND_AUTO_EXTND", "indAutoExtnd", ColumnDataType.CHARACTER, 1),
  indAutoPrepf("OST_IND_AUTO_PREPF", "indAutoPrepf", ColumnDataType.CHARACTER, 1),
  indBillBorr("OST_IND_BILL_BORR", "indBillBorr", ColumnDataType.CHARACTER, 1),
  indBillMatr("OST_IND_BILL_MATR", "indBillMatr", ColumnDataType.CHARACTER, 1),
  indDontMail("OST_IND_DONT_MAIL", "indDontMail", ColumnDataType.CHARACTER, 1),
  indDontPrnt("OST_IND_DONT_PRNT", "indDontPrnt", ColumnDataType.CHARACTER, 1),
  indFacingFee("OST_IND_FACING_FEE", "indFacingFee", ColumnDataType.CHARACTER, 1),
  indFloatRate("OST_IND_FLOAT_RATE", "indFloatRate", ColumnDataType.CHARACTER, 1),
  indHasRprDt("OST_IND_HAS_RPR_DT", "indHasRprDt", ColumnDataType.CHARACTER, 1),
  indIncXmlbil("OST_IND_INC_XMLBIL", "indIncXmlbil", ColumnDataType.CHAR, 1),
  indIntDueRp("OST_IND_INT_DUE_RP", "indIntDueRp", ColumnDataType.CHAR, 1),
  indIssuinFee("OST_IND_ISSUIN_FEE", "indIssuinFee", ColumnDataType.CHARACTER, 1),
  indMatchFund("OST_IND_MATCH_FUND", "indMatchFund", ColumnDataType.CHARACTER, 1),
  indNotfRcvd("OST_IND_NOTF_RCVD", "indNotfRcvd", ColumnDataType.CHARACTER, 1),
  indPmatInt("OST_IND_PMAT_INT", "indPmatInt", ColumnDataType.CHAR, 1),
  indReinstatbl("OST_IND_REINSTATBL", "indReinstatbl", ColumnDataType.CHARACTER, 1),
  indSepacrfees("OST_IND_SEPACRFEES", "indSepacrfees", ColumnDataType.CHARACTER, 1),
  indSyncPcRp("OST_IND_SYNC_PC_RP", "indSyncPcRp", ColumnDataType.CHAR, 1),
  nmeAlias("OST_NME_ALIAS", "nmeAlias", ColumnDataType.CHARACTER, 15),
  numBillDays("OST_NUM_BILL_DAYS", "numBillDays", ColumnDataType.SMALLINT, 2),
  numExtIncr("OST_NUM_EXT_INCR", "numExtIncr", ColumnDataType.INTEGER, 4),
  numNotificatn("OST_NUM_NOTIFICATN", "numNotificatn", ColumnDataType.SMALLINT, 2),
  pctFrgWthhld("OST_PCT_FRG_WTHHLD", "pctFrgWthhld", ColumnDataType.DECIMAL, -1),
  pctNacrTlrnc("OST_PCT_NACR_TLRNC", "pctNacrTlrnc", ColumnDataType.DECIMAL, -1),
  pctTaxExempt("OST_PCT_TAX_EXEMPT", "pctTaxExempt", ColumnDataType.DECIMAL, -1),
  pidDeal("OST_PID_DEAL", "pidDeal", ColumnDataType.CHARACTER, 8),
  pidFacility("OST_PID_FACILITY", "pidFacility", ColumnDataType.CHARACTER, 8),
  pidSublimit("OST_PID_SUBLIMIT", "pidSublimit", ColumnDataType.CHARACTER, 8),
  ridCollatDef("OST_RID_COLLAT_DEF", "ridCollatDef", ColumnDataType.CHARACTER, 8),
  ridLchgRule("OST_RID_LCHG_RULE", "ridLchgRule", ColumnDataType.CHARACTER, 8),
  rteFcHsRate("OST_RTE_FC_HS_RATE", "rteFcHsRate", ColumnDataType.DECIMAL, -1),
  rteFcRate("OST_RTE_FC_RATE", "rteFcRate", ColumnDataType.DECIMAL, -1),
  tspRecCreate("OST_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.TIMESTAMP, 10),
  tspRecUpdate("OST_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.TIMESTAMP, 10),
  uidRecCreate("OST_UID_REC_CREATE", "uidRecCreate", ColumnDataType.CHARACTER, 8),
  uidRecUpdate("OST_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.CHARACTER, 8),
  customerBorrower("OST_CID_BORROWER", "customerBorrower", ColumnDataType.CHAR, 8),
  deal("OST_PID_DEAL", "deal", ColumnDataType.CHAR, 8),
  facility("OST_PID_FACILITY", "facility", ColumnDataType.CHAR, 8),
  originalOstTrans("OST_RID_OUTSTANDNG", "originalOstTrans", ColumnDataType.CHAR, 8),
  ostTrans("OST_RID_OUTSTANDNG", "ostTrans", ColumnDataType.CHAR, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsOutstandingFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
