/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/** @author Julian Egyptien (smartdatahub.org) */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsFamGlobal2Fields {
  cdeCode("GB2_CDE_CODE", "cdeCode", ColumnDataType.VARCHAR2, 5),
  tidTableId("GB2_TID_TABLE_ID", "tidTableId", ColumnDataType.VARCHAR2, 3),
  amtOptional1("GB2_AMT_OPTIONAL1", "amtOptional1", ColumnDataType.VARCHAR2, 22),
  amtOptional2("GB2_AMT_OPTIONAL2", "amtOptional2", ColumnDataType.VARCHAR2, 22),
  amtOptional3("GB2_AMT_OPTIONAL3", "amtOptional3", ColumnDataType.VARCHAR2, 22),
  amtOptional4("GB2_AMT_OPTIONAL4", "amtOptional4", ColumnDataType.VARCHAR2, 22),
  amtOptional5("GB2_AMT_OPTIONAL5", "amtOptional5", ColumnDataType.VARCHAR2, 22),
  cdeFkey1("GB2_CDE_FKEY1", "cdeFkey1", ColumnDataType.VARCHAR2, 5),
  cdeFkey10("GB2_CDE_FKEY10", "cdeFkey10", ColumnDataType.VARCHAR2, 5),
  cdeFkey11("GB2_CDE_FKEY11", "cdeFkey11", ColumnDataType.VARCHAR2, 5),
  cdeFkey12("GB2_CDE_FKEY12", "cdeFkey12", ColumnDataType.VARCHAR2, 5),
  cdeFkey13("GB2_CDE_FKEY13", "cdeFkey13", ColumnDataType.VARCHAR2, 5),
  cdeFkey2("GB2_CDE_FKEY2", "cdeFkey2", ColumnDataType.VARCHAR2, 5),
  cdeFkey3("GB2_CDE_FKEY3", "cdeFkey3", ColumnDataType.VARCHAR2, 5),
  cdeFkey4("GB2_CDE_FKEY4", "cdeFkey4", ColumnDataType.VARCHAR2, 5),
  cdeFkey5("GB2_CDE_FKEY5", "cdeFkey5", ColumnDataType.VARCHAR2, 5),
  cdeFkey6("GB2_CDE_FKEY6", "cdeFkey6", ColumnDataType.VARCHAR2, 5),
  cdeFkey7("GB2_CDE_FKEY7", "cdeFkey7", ColumnDataType.VARCHAR2, 5),
  cdeFkey8("GB2_CDE_FKEY8", "cdeFkey8", ColumnDataType.VARCHAR2, 5),
  cdeFkey9("GB2_CDE_FKEY9", "cdeFkey9", ColumnDataType.VARCHAR2, 5),
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
  indOptionl10("GB2_IND_OPTIONL_10", "indOptionl10", ColumnDataType.VARCHAR2, 1),
  indOptionl11("GB2_IND_OPTIONL_11", "indOptionl11", ColumnDataType.VARCHAR2, 1),
  indOptionl12("GB2_IND_OPTIONL_12", "indOptionl12", ColumnDataType.VARCHAR2, 1),
  indOptionl13("GB2_IND_OPTIONL_13", "indOptionl13", ColumnDataType.VARCHAR2, 1),
  indOptionl14("GB2_IND_OPTIONL_14", "indOptionl14", ColumnDataType.VARCHAR2, 1),
  indOptionl15("GB2_IND_OPTIONL_15", "indOptionl15", ColumnDataType.VARCHAR2, 1),
  indOptionl20("GB2_IND_OPTIONL_20", "indOptionl20", ColumnDataType.VARCHAR2, 1),
  numOptional("GB2_NUM_OPTIONAL", "numOptional", ColumnDataType.VARCHAR2, 22),
  numOptional1("GB2_NUM_OPTIONAL1", "numOptional1", ColumnDataType.VARCHAR2, 22),
  numOptional2("GB2_NUM_OPTIONAL2", "numOptional2", ColumnDataType.VARCHAR2, 22),
  numOptional3("GB2_NUM_OPTIONAL3", "numOptional3", ColumnDataType.VARCHAR2, 22),
  prcOptional1("GB2_PRC_OPTIONAL_1", "prcOptional1", ColumnDataType.VARCHAR2, 22),
  rtoOptional("GB2_RTO_OPTIONAL", "rtoOptional", ColumnDataType.VARCHAR2, 22),
  rtoOptional2("GB2_RTO_OPTIONAL_2", "rtoOptional2", ColumnDataType.VARCHAR2, 22),
  rtoOptional3("GB2_RTO_OPTIONAL_3", "rtoOptional3", ColumnDataType.VARCHAR2, 22),
  tspRecCreate("GB2_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.VARCHAR2, 7),
  tspRecUpdate("GB2_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.VARCHAR2, 7),
  txtComment("GB2_TXT_COMMENT", "txtComment", ColumnDataType.VARCHAR2, 4000),
  uidRecCreate("GB2_UID_REC_CREATE", "uidRecCreate", ColumnDataType.VARCHAR2, 8),
  uidRecUpdate("GB2_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.VARCHAR2, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsFamGlobal2Fields(String columnName, String fieldName, ColumnDataType type, int length) {
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
