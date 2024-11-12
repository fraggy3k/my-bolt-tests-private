/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/** @author Julian Egyptien (smartdatahub.org) */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsFamGlobal1Fields {
  cdeCode("GB1_CDE_CODE", "cdeCode", ColumnDataType.VARCHAR2, 5),
  tidTableId("GB1_TID_TABLE_ID", "tidTableId", ColumnDataType.VARCHAR2, 3),
  dscCode("GB1_DSC_CODE", "dscCode", ColumnDataType.VARCHAR2, 400),
  indActive("GB1_IND_ACTIVE", "indActive", ColumnDataType.VARCHAR2, 1),
  indMayDeact("GB1_IND_MAY_DEACT", "indMayDeact", ColumnDataType.VARCHAR2, 1),
  tspRecCreate("GB1_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.VARCHAR2, 7),
  tspRecUpdate("GB1_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.VARCHAR2, 7),
  uidRecCreate("GB1_UID_REC_CREATE", "uidRecCreate", ColumnDataType.VARCHAR2, 8),
  uidRecUpdate("GB1_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.VARCHAR2, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsFamGlobal1Fields(String columnName, String fieldName, ColumnDataType type, int length) {
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
