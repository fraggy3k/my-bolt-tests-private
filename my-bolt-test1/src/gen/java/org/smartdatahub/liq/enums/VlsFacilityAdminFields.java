/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/**
 * The facility administrator table. Facility administrators handle cashflows associated with
 * facilities and their loans.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsFacilityAdminFields {
  ridAdmin("FAD_RID_ADMIN", "ridAdmin", ColumnDataType.CHARACTER, 8),
  indCashflow("FAD_IND_CASHFLOW", "indCashflow", ColumnDataType.CHARACTER, 1),
  pidFacility("FAD_PID_FACILITY", "pidFacility", ColumnDataType.CHARACTER, 8),
  ridFaxGroup("FAD_RID_FAX_GROUP", "ridFaxGroup", ColumnDataType.CHARACTER, 8),
  tspRecCreate("FAD_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.TIMESTAMP, 10),
  tspRecUpdate("FAD_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.TIMESTAMP, 10),
  uidRecCreate("FAD_UID_REC_CREATE", "uidRecCreate", ColumnDataType.CHARACTER, 8),
  uidRecUpdate("FAD_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.CHARACTER, 8),
  facility("FAD_PID_FACILITY", "facility", ColumnDataType.CHAR, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsFacilityAdminFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
