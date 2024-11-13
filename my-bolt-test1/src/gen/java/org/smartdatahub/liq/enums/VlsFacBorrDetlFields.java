/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/**
 * The facility borrower detail table. Aspects of the facility borrower.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsFacBorrDetlFields {
  ridBorrDetls("FBD_RID_BORR_DETLS", "ridBorrDetls", ColumnDataType.CHARACTER, 8),
  amtGloblCurr("FBD_AMT_GLOBL_CURR", "amtGloblCurr", ColumnDataType.DECIMAL, -1),
  cdeFrgWthhld("FBD_CDE_FRG_WTHHLD", "cdeFrgWthhld", ColumnDataType.CHARACTER, 5),
  cdeTaxExempt("FBD_CDE_TAX_EXEMPT", "cdeTaxExempt", ColumnDataType.CHARACTER, 5),
  dteEffective("FBD_DTE_EFFECTIVE", "dteEffective", ColumnDataType.DATE, 4),
  dteExpiry("FBD_DTE_EXPIRY", "dteExpiry", ColumnDataType.DATE, 4),
  indActive("FBD_IND_ACTIVE", "indActive", ColumnDataType.CHARACTER, 1),
  indPrimBorr("FBD_IND_PRIM_BORR", "indPrimBorr", ColumnDataType.CHARACTER, 1),
  pctFrgWthhld("FBD_PCT_FRG_WTHHLD", "pctFrgWthhld", ColumnDataType.DECIMAL, -1),
  pctTaxExempt("FBD_PCT_TAX_EXEMPT", "pctTaxExempt", ColumnDataType.DECIMAL, -1),
  pidFacility("FBD_PID_FACILITY", "pidFacility", ColumnDataType.CHARACTER, 8),
  ridDealBorr("FBD_RID_DEAL_BORR", "ridDealBorr", ColumnDataType.CHARACTER, 8),
  tspRecCreate("FBD_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.TIMESTAMP, 10),
  tspRecUpdate("FBD_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.TIMESTAMP, 10),
  uidRecCreate("FBD_UID_REC_CREATE", "uidRecCreate", ColumnDataType.CHARACTER, 8),
  uidRecUpdate("FBD_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.CHARACTER, 8),
  dealBorrower("FBD_RID_DEAL_BORR", "dealBorrower", ColumnDataType.CHAR, 8),
  facility("FBD_PID_FACILITY", "facility", ColumnDataType.CHAR, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsFacBorrDetlFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
