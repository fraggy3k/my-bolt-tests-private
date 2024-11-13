/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/**
 * The facililty type table (Please note VLS_FACILITY_TYPE is used and not the code table FAT.html -
 * facility type.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsFacilityTypeFields {
  cdeFacType("FAT_CDE_FAC_TYPE", "cdeFacType", ColumnDataType.CHARACTER, 5),
  indRevolver("FAT_IND_REVOLVER", "indRevolver", ColumnDataType.CHAR, 1),
  indTerm("FAT_IND_TERM", "indTerm", ColumnDataType.CHAR, 1),
  facilities("FAT_CDE_FAC_TYPE", "facilities", ColumnDataType.CHAR, 5),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsFacilityTypeFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
