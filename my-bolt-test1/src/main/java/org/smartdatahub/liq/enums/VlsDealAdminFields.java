/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/**
 * The deal administrator table. Management of money transfer between lenders and borrowers.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsDealAdminFields {
  pidDeal("DAD_PID_DEAL", "pidDeal", ColumnDataType.CHARACTER, 8),
  cidCustId("DAD_CID_CUST_ID", "cidCustId", ColumnDataType.CHARACTER, 8),
  ridFaxGroup("DAD_RID_FAX_GROUP", "ridFaxGroup", ColumnDataType.CHARACTER, 8),
  ridLocation("DAD_RID_LOCATION", "ridLocation", ColumnDataType.CHARACTER, 8),
  tspRecCreate("DAD_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.TIMESTAMP, 10),
  tspRecUpdate("DAD_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.TIMESTAMP, 10),
  uidRecCreate("DAD_UID_REC_CREATE", "uidRecCreate", ColumnDataType.CHARACTER, 8),
  uidRecUpdate("DAD_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.CHARACTER, 8),
  customer("DAD_CID_CUST_ID", "customer", ColumnDataType.CHAR, 8),
  deal("DAD_PID_DEAL", "deal", ColumnDataType.CHAR, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsDealAdminFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
