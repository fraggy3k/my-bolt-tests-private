/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/** @author Julian Egyptien (smartdatahub.org) */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum CodeBankFields {
  branchs("GB2_CDE_CODE", "branchs", ColumnDataType.CHAR, 5),
  customers("GB2_CDE_CODE", "customers", ColumnDataType.CHAR, 5),
  deals("GB2_CDE_CODE", "deals", ColumnDataType.CHAR, 5),
  facilities("GB2_CDE_CODE", "facilities", ColumnDataType.CHAR, 5),
  cdeCode("GB2_CDE_CODE", "cdeCode", ColumnDataType.VARCHAR2, 5),
  cdeFkey1("GB2_CDE_FKEY1", "cdeFkey1", ColumnDataType.VARCHAR2, 5),
  dscCode("GB2_DSC_CODE", "dscCode", ColumnDataType.VARCHAR2, 400),
  indActive("GB2_IND_ACTIVE", "indActive", ColumnDataType.VARCHAR2, 1),
  indMayDeact("GB2_IND_MAY_DEACT", "indMayDeact", ColumnDataType.VARCHAR2, 1),
  tidTableId("GB2_TID_TABLE_ID", "tidTableId", ColumnDataType.VARCHAR2, 3),
  tspRecUpdate("GB2_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.VARCHAR2, 7),
  uidRecUpdate("GB2_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.VARCHAR2, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  CodeBankFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
