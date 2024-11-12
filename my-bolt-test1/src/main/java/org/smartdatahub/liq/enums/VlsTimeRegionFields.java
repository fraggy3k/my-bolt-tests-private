/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/** @author Julian Egyptien (smartdatahub.org) */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsTimeRegionFields {
  cdeCode("TRG_CDE_CODE", "cdeCode", ColumnDataType.CHARACTER, 5),
  dscCode("TRG_DSC_CODE", "dscCode", ColumnDataType.VARCHAR, 100),
  tspRecCreate("TRG_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.TIMESTAMP, 10),
  tspRecUpdate("TRG_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.TIMESTAMP, 10),
  uidRecCreate("TRG_UID_REC_CREATE", "uidRecCreate", ColumnDataType.CHARACTER, 8),
  uidRecUpdate("TRG_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.CHARACTER, 8),
  branchs("TRG_CDE_CODE", "branchs", ColumnDataType.CHAR, 5),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsTimeRegionFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
