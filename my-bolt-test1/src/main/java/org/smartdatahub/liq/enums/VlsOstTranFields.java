/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/**
 * The outstanding transaction table. Transactions directly related to outstandings.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsOstTranFields {
  ridOstTran("OTR_RID_OST_TRAN", "ridOstTran", ColumnDataType.CHARACTER, 8),
  amtActual("OTR_AMT_ACTUAL", "amtActual", ColumnDataType.DECIMAL, -1),
  amtFundFrozn("OTR_AMT_FUND_FROZN", "amtFundFrozn", ColumnDataType.DECIMAL, -1),
  amtNewRelse("OTR_AMT_NEW_RELSE", "amtNewRelse", ColumnDataType.DECIMAL, -1),
  amtPremium("OTR_AMT_PREMIUM", "amtPremium", ColumnDataType.DECIMAL, -1),
  amtRequested("OTR_AMT_REQUESTED", "amtRequested", ColumnDataType.DECIMAL, -1),
  amtSchedBal("OTR_AMT_SCHED_BAL", "amtSchedBal", ColumnDataType.DECIMAL, -1),
  cdeAccrFreq("OTR_CDE_ACCR_FREQ", "cdeAccrFreq", ColumnDataType.CHARACTER, 5),
  cdeGroupType("OTR_CDE_GROUP_TYPE", "cdeGroupType", ColumnDataType.CHARACTER, 5),
  cdeLoanPurp("OTR_CDE_LOAN_PURP", "cdeLoanPurp", ColumnDataType.CHARACTER, 5),
  cdeObStCtg("OTR_CDE_OB_ST_CTG", "cdeObStCtg", ColumnDataType.CHARACTER, 5),
  cdeObjState("OTR_CDE_OBJ_STATE", "cdeObjState", ColumnDataType.CHARACTER, 5),
  cdeProcArea("OTR_CDE_PROC_AREA", "cdeProcArea", ColumnDataType.CHARACTER, 5),
  cdeReprFreq("OTR_CDE_REPR_FREQ", "cdeReprFreq", ColumnDataType.CHARACTER, 5),
  cdeRiskType("OTR_CDE_RISK_TYPE", "cdeRiskType", ColumnDataType.CHARACTER, 5),
  cdeTrnsPurp("OTR_CDE_TRNS_PURP", "cdeTrnsPurp", ColumnDataType.CHARACTER, 5),
  cdeType("OTR_CDE_TYPE", "cdeType", ColumnDataType.CHARACTER, 5),
  dteEffective("OTR_DTE_EFFECTIVE", "dteEffective", ColumnDataType.DATE, 4),
  dteRelease("OTR_DTE_RELEASE", "dteRelease", ColumnDataType.DATE, 4),
  dteRepricing("OTR_DTE_REPRICING", "dteRepricing", ColumnDataType.DATE, 4),
  indAutoRduce("OTR_IND_AUTO_RDUCE", "indAutoRduce", ColumnDataType.CHARACTER, 1),
  indAutoRelse("OTR_IND_AUTO_RELSE", "indAutoRelse", ColumnDataType.CHARACTER, 1),
  indCreateTrn("OTR_IND_CREATE_TRN", "indCreateTrn", ColumnDataType.CHARACTER, 1),
  indNonAccr("OTR_IND_NON_ACCR", "indNonAccr", ColumnDataType.CHARACTER, 1),
  indPmtFrBor("OTR_IND_PMT_FR_BOR", "indPmtFrBor", ColumnDataType.CHARACTER, 1),
  pidSublimit("OTR_PID_SUBLIMIT", "pidSublimit", ColumnDataType.CHARACTER, 8),
  ridCommitTrn("OTR_RID_COMMIT_TRN", "ridCommitTrn", ColumnDataType.CHARACTER, 8),
  ridGroupTran("OTR_RID_GROUP_TRAN", "ridGroupTran", ColumnDataType.CHARACTER, 8),
  ridLinkTrn("OTR_RID_LINK_TRN", "ridLinkTrn", ColumnDataType.CHARACTER, 8),
  ridOrigOst("OTR_RID_ORIG_OST", "ridOrigOst", ColumnDataType.CHARACTER, 8),
  ridOutstandng("OTR_RID_OUTSTANDNG", "ridOutstandng", ColumnDataType.CHARACTER, 8),
  tspRecCreate("OTR_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.TIMESTAMP, 10),
  tspRecUpdate("OTR_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.TIMESTAMP, 10),
  uidProcessor("OTR_UID_PROCESSOR", "uidProcessor", ColumnDataType.CHARACTER, 8),
  uidRecCreate("OTR_UID_REC_CREATE", "uidRecCreate", ColumnDataType.CHARACTER, 8),
  uidRecUpdate("OTR_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.CHARACTER, 8),
  facCommitTrnCommitTrn("OTR_RID_COMMIT_TRN", "facCommitTrnCommitTrn", ColumnDataType.CHAR, 8),
  originalOutstanding("OTR_RID_ORIG_OST", "originalOutstanding", ColumnDataType.CHAR, 8),
  outstanding("OTR_RID_OUTSTANDNG", "outstanding", ColumnDataType.CHAR, 8),
  facCommitTrns("OTR_RID_OST_TRAN", "facCommitTrns", ColumnDataType.CHAR, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsOstTranFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
