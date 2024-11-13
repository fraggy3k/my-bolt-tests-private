/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/**
 * The branch table.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsBranchFields {
  cdeBranch("BRN_CDE_BRANCH", "cdeBranch", ColumnDataType.CHARACTER, 5),
  cdeBank("BRN_CDE_BANK", "cdeBank", ColumnDataType.CHARACTER, 5),
  cdeCountry("BRN_CDE_COUNTRY", "cdeCountry", ColumnDataType.CHARACTER, 2),
  cdeFunctCcy("BRN_CDE_FUNCT_CCY", "cdeFunctCcy", ColumnDataType.CHARACTER, 3),
  cdeGl("BRN_CDE_GL", "cdeGl", ColumnDataType.CHARACTER, 5),
  cdeLocalCcy("BRN_CDE_LOCAL_CCY", "cdeLocalCcy", ColumnDataType.CHARACTER, 3),
  cdeTmeRegion("BRN_CDE_TME_REGION", "cdeTmeRegion", ColumnDataType.CHARACTER, 5),
  cidCustId("BRN_CID_CUST_ID", "cidCustId", ColumnDataType.CHARACTER, 8),
  dscBranch("BRN_DSC_BRANCH", "dscBranch", ColumnDataType.CHARACTER, 70),
  indActive("BRN_IND_ACTIVE", "indActive", ColumnDataType.CHARACTER, 1),
  indCentralSc("BRN_IND_CENTRAL_SC", "indCentralSc", ColumnDataType.CHARACTER, 1),
  indMfcofAcct("BRN_IND_MFCOF_ACCT", "indMfcofAcct", ColumnDataType.CHARACTER, 1),
  indNetBorr("BRN_IND_NET_BORR", "indNetBorr", ColumnDataType.CHARACTER, 1),
  indNetCashfl("BRN_IND_NET_CASHFL", "indNetCashfl", ColumnDataType.CHARACTER, 1),
  numFiscMm("BRN_NUM_FISC_MM", "numFiscMm", ColumnDataType.SMALLINT, 2),
  tspRecCreate("BRN_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.TIMESTAMP, 10),
  tspRecUpdate("BRN_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.TIMESTAMP, 10),
  uidRecCreate("BRN_UID_REC_CREATE", "uidRecCreate", ColumnDataType.CHARACTER, 8),
  uidRecUpdate("BRN_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.CHARACTER, 8),
  bank("BRN_CDE_BANK", "bank", ColumnDataType.CHAR, 5),
  customer("BRN_CID_CUST_ID", "customer", ColumnDataType.CHAR, 8),
  timeRegion("BRN_CDE_TME_REGION", "timeRegion", ColumnDataType.CHAR, 5),
  deals("BRN_CDE_BRANCH", "deals", ColumnDataType.CHAR, 5),
  facilities("BRN_CDE_BRANCH", "facilities", ColumnDataType.CHAR, 5),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsBranchFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
