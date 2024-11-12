/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/**
 * The facility host bank agregation. Finstra version was almost empty -> filled by best knowledge
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsFacHostAgrFields {
  pidDeal("FHA_PID_DEAL", "pidDeal", ColumnDataType.CHARACTER, 8),
  pidFacility("FHA_PID_FACILITY", "pidFacility", ColumnDataType.CHARACTER, 8),
  amtClosing("FHA_AMT_CLOSING", "amtClosing", ColumnDataType.DECIMAL, -1),
  amtDcClose("FHA_AMT_DC_CLOSE", "amtDcClose", ColumnDataType.DECIMAL, -1),
  amtDcGross("FHA_AMT_DC_GROSS", "amtDcGross", ColumnDataType.DECIMAL, -1),
  amtDcGrsAdj("FHA_AMT_DC_GRS_ADJ", "amtDcGrsAdj", ColumnDataType.DECIMAL, -1),
  amtDcNet("FHA_AMT_DC_NET", "amtDcNet", ColumnDataType.DECIMAL, -1),
  amtDcNetAdj("FHA_AMT_DC_NET_ADJ", "amtDcNetAdj", ColumnDataType.DECIMAL, -1),
  amtDcPreclos("FHA_AMT_DC_PRECLOS", "amtDcPreclos", ColumnDataType.DECIMAL, -1),
  amtGross("FHA_AMT_GROSS", "amtGross", ColumnDataType.DECIMAL, -1),
  amtGrossAdj("FHA_AMT_GROSS_ADJ", "amtGrossAdj", ColumnDataType.DECIMAL, -1),
  amtNet("FHA_AMT_NET", "amtNet", ColumnDataType.DECIMAL, -1),
  amtNetAdj("FHA_AMT_NET_ADJ", "amtNetAdj", ColumnDataType.DECIMAL, -1),
  amtPreclose("FHA_AMT_PRECLOSE", "amtPreclose", ColumnDataType.DECIMAL, -1),
  tspRecCreate("FHA_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.TIMESTAMP, 10),
  tspRecUpdate("FHA_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.TIMESTAMP, 10),
  uidRecCreate("FHA_UID_REC_CREATE", "uidRecCreate", ColumnDataType.CHARACTER, 8),
  uidRecUpdate("FHA_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.CHARACTER, 8),
  deal("FHA_PID_DEAL", "deal", ColumnDataType.CHAR, 8),
  facility("FHA_PID_FACILITY", "facility", ColumnDataType.CHAR, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsFacHostAgrFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
