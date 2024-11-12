/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.enums;

/**
 * The customer table. Enterprises which conducts or may be interested in conducting commercial
 * lending business with the bank is considered a customer.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
import org.smartdatahub.liq.entity.utils.ColumnDataType;

public enum VlsCustomerFields {
  cidCustId("CUS_CID_CUST_ID", "cidCustId", ColumnDataType.CHARACTER, 8),
  amtOsLimit("CUS_AMT_OS_LIMIT", "amtOsLimit", ColumnDataType.DECIMAL, -1),
  cdeBank("CUS_CDE_BANK", "cdeBank", ColumnDataType.CHARACTER, 5),
  cdeBranch("CUS_CDE_BRANCH", "cdeBranch", ColumnDataType.CHARACTER, 5),
  cdeCountry("CUS_CDE_COUNTRY", "cdeCountry", ColumnDataType.CHARACTER, 2),
  cdeCustDesc("CUS_CDE_CUST_DESC", "cdeCustDesc", ColumnDataType.CHARACTER, 5),
  cdeCustStat("CUS_CDE_CUST_STAT", "cdeCustStat", ColumnDataType.CHARACTER, 5),
  cdeDepSubtyp("CUS_CDE_DEP_SUBTYP", "cdeDepSubtyp", ColumnDataType.CHARACTER, 5),
  cdeDept("CUS_CDE_DEPT", "cdeDept", ColumnDataType.CHARACTER, 5),
  cdeExpense("CUS_CDE_EXPENSE", "cdeExpense", ColumnDataType.CHARACTER, 15),
  cdeLanguage("CUS_CDE_LANGUAGE", "cdeLanguage", ColumnDataType.CHARACTER, 5),
  cdeLegal("CUS_CDE_LEGAL", "cdeLegal", ColumnDataType.CHARACTER, 5),
  cdeMasterAct("CUS_CDE_MASTER_ACT", "cdeMasterAct", ColumnDataType.CHARACTER, 5),
  cdeOrigin("CUS_CDE_ORIGIN", "cdeOrigin", ColumnDataType.CHARACTER, 5),
  cdeOsLimCcy("CUS_CDE_OS_LIM_CCY", "cdeOsLimCcy", ColumnDataType.CHARACTER, 3),
  cdePrimSic("CUS_CDE_PRIM_SIC", "cdePrimSic", ColumnDataType.CHARACTER, 10),
  cdeProspect("CUS_CDE_PROSPECT", "cdeProspect", ColumnDataType.CHARACTER, 5),
  cdeSicCntry("CUS_CDE_SIC_CNTRY", "cdeSicCntry", ColumnDataType.CHARACTER, 2),
  cdeTrsRptAr("CUS_CDE_TRS_RPT_AR", "cdeTrsRptAr", ColumnDataType.CHARACTER, 5),
  cidImmParent("CUS_CID_IMM_PARENT", "cidImmParent", ColumnDataType.CHARACTER, 8),
  cidUltParent("CUS_CID_ULT_PARENT", "cidUltParent", ColumnDataType.CHARACTER, 8),
  indBenefic("CUS_IND_BENEFIC", "indBenefic", ColumnDataType.CHARACTER, 1),
  indBorrower("CUS_IND_BORROWER", "indBorrower", ColumnDataType.CHARACTER, 1),
  indBroker("CUS_IND_BROKER", "indBroker", ColumnDataType.CHARACTER, 1),
  indCra("CUS_IND_CRA", "indCra", ColumnDataType.CHARACTER, 1),
  indGuarantor("CUS_IND_GUARANTOR", "indGuarantor", ColumnDataType.CHARACTER, 1),
  indIntrlEnt("CUS_IND_INTRL_ENT", "indIntrlEnt", ColumnDataType.CHARACTER, 1),
  indInvestor("CUS_IND_INVESTOR", "indInvestor", ColumnDataType.CHARACTER, 1),
  indMajUndwrt("CUS_IND_MAJ_UNDWRT", "indMajUndwrt", ColumnDataType.CHARACTER, 1),
  indOsLimErl("CUS_IND_OS_LIM_ERL", "indOsLimErl", ColumnDataType.CHARACTER, 1),
  indRestrict("CUS_IND_RESTRICT", "indRestrict", ColumnDataType.CHARACTER, 1),
  indSimplified("CUS_IND_SIMPLIFIED", "indSimplified", ColumnDataType.CHARACTER, 1),
  indSlg("CUS_IND_SLG", "indSlg", ColumnDataType.CHARACTER, 1),
  indThrdPtyon("CUS_IND_THRD_PTYON", "indThrdPtyon", ColumnDataType.CHAR, 1),
  indVatSubjct("CUS_IND_VAT_SUBJCT", "indVatSubjct", ColumnDataType.CHARACTER, 1),
  nmeFullName("CUS_NME_FULL_NAME", "nmeFullName", ColumnDataType.VARCHAR, 140),
  nmeShortName("CUS_NME_SHORT_NAME", "nmeShortName", ColumnDataType.CHARACTER, 30),
  tspRecCreate("CUS_TSP_REC_CREATE", "tspRecCreate", ColumnDataType.TIMESTAMP, 10),
  tspRecUpdate("CUS_TSP_REC_UPDATE", "tspRecUpdate", ColumnDataType.TIMESTAMP, 10),
  txtVatNumber("CUS_TXT_VAT_NUMBER", "txtVatNumber", ColumnDataType.CHARACTER, 15),
  uidRecCreate("CUS_UID_REC_CREATE", "uidRecCreate", ColumnDataType.CHARACTER, 8),
  uidRecUpdate("CUS_UID_REC_UPDATE", "uidRecUpdate", ColumnDataType.CHARACTER, 8),
  xidCustId("CUS_XID_CUST_ID", "xidCustId", ColumnDataType.CHARACTER, 15),
  bank("CUS_CDE_BANK", "bank", ColumnDataType.CHAR, 5),
  customerImmParentParent("CUS_CID_IMM_PARENT", "customerImmParentParent", ColumnDataType.CHAR, 8),
  customerUltParentParent("CUS_CID_ULT_PARENT", "customerUltParentParent", ColumnDataType.CHAR, 8),
  branchs("CUS_CID_CUST_ID", "branchs", ColumnDataType.CHAR, 8),
  dealAdmins("CUS_CID_CUST_ID", "dealAdmins", ColumnDataType.CHAR, 8),
  dealBorrowers("CUS_CID_CUST_ID", "dealBorrowers", ColumnDataType.CHAR, 8),
  immParentCustomers("CUS_CID_CUST_ID", "immParentCustomers", ColumnDataType.CHAR, 8),
  outstandings("CUS_CID_CUST_ID", "outstandings", ColumnDataType.CHAR, 8),
  ultParentCustomers("CUS_CID_CUST_ID", "ultParentCustomers", ColumnDataType.CHAR, 8),
  ;

  final String columnName;
  final String fieldName;
  final ColumnDataType type;
  final int length;

  VlsCustomerFields(String columnName, String fieldName, ColumnDataType type, int length) {
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
