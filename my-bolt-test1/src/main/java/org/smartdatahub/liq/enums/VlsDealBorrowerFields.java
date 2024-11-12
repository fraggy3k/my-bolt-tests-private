/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/**
 * The deal borrower table. The borrowers that are associated with a deal.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsDealBorrowerFields {
  ridDealBorr("DBR_RID_DEAL_BORR", "ridDealBorr", ColumnDataType.CHARACTER, 8),
  cidCustId("DBR_CID_CUST_ID", "cidCustId", ColumnDataType.CHARACTER, 8),
  indBorrower("DBR_IND_BORROWER", "indBorrower", ColumnDataType.CHARACTER, 1),
  indDepositor("DBR_IND_DEPOSITOR", "indDepositor", ColumnDataType.CHARACTER, 1),
  indPrimBorr("DBR_IND_PRIM_BORR", "indPrimBorr", ColumnDataType.CHARACTER, 1),
  pidDeal("DBR_PID_DEAL", "pidDeal", ColumnDataType.CHARACTER, 8),
  ridCusSvcGr("DBR_RID_CUS_SVC_GR", "ridCusSvcGr", ColumnDataType.CHARACTER, 8),
  ridLocation("DBR_RID_LOCATION", "ridLocation", ColumnDataType.CHARACTER, 8),
  tspRecCreate("DBR_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.TIMESTAMP, 10),
  tspRecUpdate("DBR_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.TIMESTAMP, 10),
  uidRecCreate("DBR_UID_REC_CREATE", "uidRecCreate", ColumnDataType.CHARACTER, 8),
  uidRecUpdate("DBR_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.CHARACTER, 8),
  customer("DBR_CID_CUST_ID", "customer", ColumnDataType.CHAR, 8),
  deal("DBR_PID_DEAL", "deal", ColumnDataType.CHAR, 8),
  facBorrDetls("DBR_RID_DEAL_BORR", "facBorrDetls", ColumnDataType.CHAR, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsDealBorrowerFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
