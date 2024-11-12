/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/** @author Julian Egyptien (smartdatahub.org) */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum CodeOutstandingTypeFields {
  cdeCode("GB2_CDE_CODE", "cdeCode", ColumnDataType.VARCHAR2, 5),
  dscCode("GB2_DSC_CODE", "dscCode", ColumnDataType.VARCHAR2, 400),
  indActive("GB2_IND_ACTIVE", "indActive", ColumnDataType.VARCHAR2, 1),
  indMayDeact("GB2_IND_MAY_DEACT", "indMayDeact", ColumnDataType.VARCHAR2, 1),
  indOptional1("GB2_IND_OPTIONAL_1", "indOptional1", ColumnDataType.VARCHAR2, 1),
  indOptional2("GB2_IND_OPTIONAL_2", "indOptional2", ColumnDataType.VARCHAR2, 1),
  indOptional3("GB2_IND_OPTIONAL_3", "indOptional3", ColumnDataType.VARCHAR2, 1),
  indOptional4("GB2_IND_OPTIONAL_4", "indOptional4", ColumnDataType.VARCHAR2, 1),
  indOptional5("GB2_IND_OPTIONAL_5", "indOptional5", ColumnDataType.VARCHAR2, 1),
  indOptional6("GB2_IND_OPTIONAL_6", "indOptional6", ColumnDataType.VARCHAR2, 1),
  indOptional7("GB2_IND_OPTIONAL_7", "indOptional7", ColumnDataType.VARCHAR2, 1),
  indOptional8("GB2_IND_OPTIONAL_8", "indOptional8", ColumnDataType.VARCHAR2, 1),
  indOptional9("GB2_IND_OPTIONAL_9", "indOptional9", ColumnDataType.VARCHAR2, 1),
  tidTableId("GB2_TID_TABLE_ID", "tidTableId", ColumnDataType.VARCHAR2, 3),
  tspRecUpdate("GB2_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.VARCHAR2, 7),
  uidRecUpdate("GB2_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.VARCHAR2, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  CodeOutstandingTypeFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
