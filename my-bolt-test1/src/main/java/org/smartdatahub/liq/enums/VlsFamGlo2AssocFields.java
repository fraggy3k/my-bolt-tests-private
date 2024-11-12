/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/** @author Julian Egyptien (smartdatahub.org) */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsFamGlo2AssocFields {
  ridFg2Assoc("GA2_RID_FG2_ASSOC", "ridFg2Assoc", ColumnDataType.VARCHAR2, 8),
  tidTableId("GA2_TID_TABLE_ID", "tidTableId", ColumnDataType.VARCHAR2, 3),
  cdeFkey1("GA2_CDE_FKEY1", "cdeFkey1", ColumnDataType.VARCHAR2, 5),
  cdeFkey2("GA2_CDE_FKEY2", "cdeFkey2", ColumnDataType.VARCHAR2, 5),
  cdeFkey3("GA2_CDE_FKEY3", "cdeFkey3", ColumnDataType.VARCHAR2, 5),
  indActive("GA2_IND_ACTIVE", "indActive", ColumnDataType.VARCHAR2, 1),
  indMayDeact("GA2_IND_MAY_DEACT", "indMayDeact", ColumnDataType.VARCHAR2, 1),
  tspRecCreate("GA2_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.VARCHAR2, 7),
  tspRecUpdate("GA2_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.VARCHAR2, 7),
  uidRecCreate("GA2_UID_REC_CREATE", "uidRecCreate", ColumnDataType.VARCHAR2, 8),
  uidRecUpdate("GA2_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.VARCHAR2, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsFamGlo2AssocFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
