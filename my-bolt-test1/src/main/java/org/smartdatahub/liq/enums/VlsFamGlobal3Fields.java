/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/** @author Julian Egyptien (smartdatahub.org) */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsFamGlobal3Fields {
  cdeCode("GB3_CDE_CODE", "cdeCode", ColumnDataType.VARCHAR2, 5),
  cdeFkey1("GB3_CDE_FKEY1", "cdeFkey1", ColumnDataType.VARCHAR2, 5),
  tidTableId("GB3_TID_TABLE_ID", "tidTableId", ColumnDataType.VARCHAR2, 3),
  dscCode("GB3_DSC_CODE", "dscCode", ColumnDataType.VARCHAR2, 400),
  indActive("GB3_IND_ACTIVE", "indActive", ColumnDataType.VARCHAR2, 1),
  indMayDeact("GB3_IND_MAY_DEACT", "indMayDeact", ColumnDataType.VARCHAR2, 1),
  indOptional1("GB3_IND_OPTIONAL_1", "indOptional1", ColumnDataType.VARCHAR2, 1),
  indOptional2("GB3_IND_OPTIONAL_2", "indOptional2", ColumnDataType.VARCHAR2, 1),
  rtoOptional("GB3_RTO_OPTIONAL", "rtoOptional", ColumnDataType.VARCHAR2, 22),
  rtoOptional1("GB3_RTO_OPTIONAL_1", "rtoOptional1", ColumnDataType.VARCHAR2, 22),
  tspRecCreate("GB3_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.VARCHAR2, 7),
  tspRecUpdate("GB3_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.VARCHAR2, 7),
  uidRecCreate("GB3_UID_REC_CREATE", "uidRecCreate", ColumnDataType.VARCHAR2, 8),
  uidRecUpdate("GB3_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.VARCHAR2, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsFamGlobal3Fields(String columnName, String fieldName, ColumnDataType type, int length) {
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
