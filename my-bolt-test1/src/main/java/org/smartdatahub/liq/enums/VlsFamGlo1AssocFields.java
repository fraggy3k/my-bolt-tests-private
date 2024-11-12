/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/** @author Julian Egyptien (smartdatahub.org) */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsFamGlo1AssocFields {
  cdeFkey1("GA1_CDE_FKEY1", "cdeFkey1", ColumnDataType.VARCHAR2, 5),
  cdeFkey2("GA1_CDE_FKEY2", "cdeFkey2", ColumnDataType.VARCHAR2, 5),
  tidTableId("GA1_TID_TABLE_ID", "tidTableId", ColumnDataType.VARCHAR2, 3),
  amtAmount1("GA1_AMT_AMOUNT1", "amtAmount1", ColumnDataType.VARCHAR2, 22),
  cdeFkey3("GA1_CDE_FKEY3", "cdeFkey3", ColumnDataType.VARCHAR2, 5),
  cdeFkey4("GA1_CDE_FKEY4", "cdeFkey4", ColumnDataType.VARCHAR2, 5),
  cdeFkey5("GA1_CDE_FKEY5", "cdeFkey5", ColumnDataType.VARCHAR2, 5),
  cdeFkey6("GA1_CDE_FKEY6", "cdeFkey6", ColumnDataType.VARCHAR2, 5),
  indActive("GA1_IND_ACTIVE", "indActive", ColumnDataType.VARCHAR2, 1),
  indMayDeact("GA1_IND_MAY_DEACT", "indMayDeact", ColumnDataType.VARCHAR2, 1),
  tspRecCreate("GA1_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.VARCHAR2, 7),
  tspRecUpdate("GA1_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.VARCHAR2, 7),
  uidRecCreate("GA1_UID_REC_CREATE", "uidRecCreate", ColumnDataType.VARCHAR2, 8),
  uidRecUpdate("GA1_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.VARCHAR2, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsFamGlo1AssocFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
