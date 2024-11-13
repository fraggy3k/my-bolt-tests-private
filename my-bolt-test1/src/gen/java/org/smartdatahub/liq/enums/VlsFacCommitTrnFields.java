/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/**
 * The facility commitment transaction table. Transactions which affect a lender's position in a
 * facility.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsFacCommitTrnFields {
  ridCommitTrn("FTR_RID_COMMIT_TRN", "ridCommitTrn", ColumnDataType.CHARACTER, 8),
  amtCommitment("FTR_AMT_COMMITMENT", "amtCommitment", ColumnDataType.DECIMAL, -1),
  amtUnavail("FTR_AMT_UNAVAIL", "amtUnavail", ColumnDataType.DECIMAL, -1),
  cdeCircState("FTR_CDE_CIRC_STATE", "cdeCircState", ColumnDataType.CHARACTER, 5),
  cdeContraSt("FTR_CDE_CONTRA_ST", "cdeContraSt", ColumnDataType.CHARACTER, 5),
  cdeInvType("FTR_CDE_INV_TYPE", "cdeInvType", ColumnDataType.CHARACTER, 5),
  cdeLinkType("FTR_CDE_LINK_TYPE", "cdeLinkType", ColumnDataType.CHARACTER, 5),
  cdeObStCtg("FTR_CDE_OB_ST_CTG", "cdeObStCtg", ColumnDataType.CHARACTER, 5),
  cdeObjState("FTR_CDE_OBJ_STATE", "cdeObjState", ColumnDataType.CHARACTER, 5),
  cdeRskBkByr("FTR_CDE_RSK_BK_BYR", "cdeRskBkByr", ColumnDataType.CHARACTER, 5),
  cdeRskBkSlr("FTR_CDE_RSK_BK_SLR", "cdeRskBkSlr", ColumnDataType.CHARACTER, 5),
  cdeTransType("FTR_CDE_TRANS_TYPE", "cdeTransType", ColumnDataType.CHARACTER, 5),
  cdeType("FTR_CDE_TYPE", "cdeType", ColumnDataType.CHARACTER, 5),
  dteCircClose("FTR_DTE_CIRC_CLOSE", "dteCircClose", ColumnDataType.DATE, 4),
  dteEffective("FTR_DTE_EFFECTIVE", "dteEffective", ColumnDataType.DATE, 4),
  dteRelease("FTR_DTE_RELEASE", "dteRelease", ColumnDataType.DATE, 4),
  fidFacInvId("FTR_FID_FAC_INV_ID", "fidFacInvId", ColumnDataType.CHARACTER, 8),
  iidInvId("FTR_IID_INV_ID", "iidInvId", ColumnDataType.CHARACTER, 8),
  indAffTrdLn("FTR_IND_AFF_TRD_LN", "indAffTrdLn", ColumnDataType.CHARACTER, 1),
  indAutoRelse("FTR_IND_AUTO_RELSE", "indAutoRelse", ColumnDataType.CHARACTER, 1),
  indMarketing("FTR_IND_MARKETING", "indMarketing", ColumnDataType.CHARACTER, 1),
  indMktgLink("FTR_IND_MKTG_LINK", "indMktgLink", ColumnDataType.CHARACTER, 1),
  pctPrice("FTR_PCT_PRICE", "pctPrice", ColumnDataType.DECIMAL, -1),
  pctSkimInt("FTR_PCT_SKIM_INT", "pctSkimInt", ColumnDataType.DECIMAL, -1),
  pidDeal("FTR_PID_DEAL", "pidDeal", ColumnDataType.CHARACTER, 8),
  pidFacility("FTR_PID_FACILITY", "pidFacility", ColumnDataType.CHARACTER, 8),
  ridFrom("FTR_RID_FROM", "ridFrom", ColumnDataType.CHARACTER, 8),
  ridGroupTrn("FTR_RID_GROUP_TRN", "ridGroupTrn", ColumnDataType.CHARACTER, 8),
  ridLink("FTR_RID_LINK", "ridLink", ColumnDataType.CHARACTER, 8),
  ridPool("FTR_RID_POOL", "ridPool", ColumnDataType.CHARACTER, 8),
  ridTo("FTR_RID_TO", "ridTo", ColumnDataType.CHARACTER, 8),
  tspRecCreate("FTR_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.TIMESTAMP, 10),
  tspRecUpdate("FTR_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.TIMESTAMP, 10),
  txtAmendNum("FTR_TXT_AMEND_NUM", "txtAmendNum", ColumnDataType.CHARACTER, 5),
  uidProcessor("FTR_UID_PROCESSOR", "uidProcessor", ColumnDataType.CHARACTER, 8),
  uidRecCreate("FTR_UID_REC_CREATE", "uidRecCreate", ColumnDataType.CHARACTER, 8),
  uidRecUpdate("FTR_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.CHARACTER, 8),
  deal("FTR_PID_DEAL", "deal", ColumnDataType.CHAR, 8),
  facility("FTR_PID_FACILITY", "facility", ColumnDataType.CHAR, 8),
  ostTran("FTR_RID_GROUP_TRN", "ostTran", ColumnDataType.CHAR, 8),
  ostTransCommitTrn("FTR_RID_COMMIT_TRN", "ostTransCommitTrn", ColumnDataType.CHAR, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsFacCommitTrnFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
