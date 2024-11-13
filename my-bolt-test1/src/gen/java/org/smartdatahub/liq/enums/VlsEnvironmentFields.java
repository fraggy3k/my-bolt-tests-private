/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/**
 * Details of the user environment.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsEnvironmentFields {
  nmeVarClass("ENV_NME_VAR_CLASS", "nmeVarClass", ColumnDataType.CHARACTER, 8),
  nmeVarName("ENV_NME_VAR_NAME", "nmeVarName", ColumnDataType.CHARACTER, 32),
  txtComment("ENV_TXT_COMMENT", "txtComment", ColumnDataType.VARCHAR, 80),
  txtVarValue("ENV_TXT_VAR_VALUE", "txtVarValue", ColumnDataType.VARCHAR, 80),
  timeRegion("ENV_NME_VAR_CLASS", "timeRegion", ColumnDataType.CHAR, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsEnvironmentFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
