/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.api.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The customer table. Enterprises which conducts or may be interested in conducting commercial
 * lending business with the bank is considered a customer.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@ApiModel(
    value = "Customer",
    description =
        "The customer table.  Enterprises which conducts or may be interested in conducting commercial lending business with the bank is considered a customer.")
public class ResponseCustomer
    implements Identifiable<String>, Serializable, EqualsSimpleFieldSupport<ResponseCustomer> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "CUS";

  @Id
  @ApiModelProperty(value = "The Record ID (RID) for the customer.")
  private /*4*/ String cidCustId;

  @ApiModelProperty(
      value =
          "Limit for total of all outstandings (all types except Deposits).  Null or zero value means no limit.")
  private /*4*/ BigDecimal amtOsLimit;

  @ApiModelProperty(value = "The code identifying the LS2 Client Bank (the purchaser of LS2).")
  private /*4*/ String cdeBank;

  @ApiModelProperty(value = "The code for the customer&apos;s branch.")
  private /*4*/ String cdeBranch;

  @ApiModelProperty(value = "The code for the customer&apos;s primary country.")
  private /*4*/ String cdeCountry;

  @ApiModelProperty(value = "The code for the customer classification.")
  private /*4*/ String cdeCustDesc;

  @ApiModelProperty(value = "The customer status code.")
  private /*4*/ String cdeCustStat;

  @ApiModelProperty(value = "The code for the customer department subtype.")
  private /*4*/ String cdeDepSubtyp;

  @ApiModelProperty(value = "The code for the customer department.")
  private /*4*/ String cdeDept;

  @ApiModelProperty(value = "The expense code for the customer.")
  private /*4*/ String cdeExpense;

  @ApiModelProperty(value = "Optional language code for the customer")
  private /*4*/ String cdeLanguage;

  @ApiModelProperty(value = "The legal code for the customer.")
  private /*4*/ String cdeLegal;

  @ApiModelProperty(value = "Used in conjunction with Trade Ticket Entry.")
  private /*4*/ String cdeMasterAct;

  @ApiModelProperty(
      value =
          "Code which speicifies where the customer the creation of the customer occured -- online, via api, etc.  Values are from Customer Origin code table.")
  private /*4*/ String cdeOrigin;

  @ApiModelProperty(value = "Currency for the limit amount.")
  private /*4*/ String cdeOsLimCcy;

  @ApiModelProperty(value = "The customer&apos;s primary SIC (Standard Industry Code).")
  private /*4*/ String cdePrimSic;

  @ApiModelProperty(
      value =
          "&quot;For customers identified as &quot;&quot;prospects,&quot;&quot; identifies the prospect type.&quot;")
  private /*4*/ String cdeProspect;

  @ApiModelProperty(
      value =
          "The country code necessary to uniquely identify the correct SIC as country is part of SIC primary key")
  private /*4*/ String cdeSicCntry;

  @ApiModelProperty(value = "The code for the treasury reporting area for the customer.")
  private /*4*/ String cdeTrsRptAr;

  @ApiModelProperty(value = "The Record ID (RID) of the customer&apos;s immediate parent.")
  private /*4*/ String cidImmParent;

  @ApiModelProperty(value = "The Record ID (RID) of the customer&apos;s ultimate parent.")
  private /*4*/ String cidUltParent;

  @ApiModelProperty(value = "Indicates whether or not the customer has a beneficiary profile.")
  private /*4*/ Boolean indBenefic;

  @ApiModelProperty(value = "Indicates whether or not the customer has a borrower profile.")
  private /*4*/ Boolean indBorrower;

  private /*4*/ Boolean indBroker;

  @ApiModelProperty(
      value = "Indicates whether or not the customer falls under the community reinvestment act.")
  private /*4*/ Boolean indCra;

  @ApiModelProperty(value = "Indicates whether or not the customer has a guarantor profile.")
  private /*4*/ Boolean indGuarantor;

  @ApiModelProperty(
      value =
          "&quot;Indicates whether or not the customer is a Host Bank Legal Entity.  (When a Branch in the Branch Table is associated with a Customer, that Customer is a &quot;&quot;Host Bank Legal Entity&quot;&quot; and the legend &quot;&quot;A (Bank) Legal Entity&quot;&quot; appears on first&quot;")
  private /*4*/ Boolean indIntrlEnt;

  @ApiModelProperty(value = "Indicates whether or not the customer has a lender profile.")
  private /*4*/ Boolean indInvestor;

  @ApiModelProperty(value = "Indicates whether or not the customer is a major underwriter.")
  private /*4*/ Boolean indMajUndwrt;

  private /*4*/ Boolean indOsLimErl;

  @ApiModelProperty(
      value = "Indicates whether or not access to the customer is restricted to specific users.")
  private /*4*/ Boolean indRestrict;

  @ApiModelProperty(
      value = "Indicator which specifies wether customer is a simple customer or not.")
  private /*4*/ Boolean indSimplified;

  @ApiModelProperty(
      value = "Indicates whether or not the customer belongs to the special loan group.")
  private /*4*/ Boolean indSlg;

  @ApiModelProperty(value = "none")
  private /*4*/ Boolean indThrdPtyon;

  private /*4*/ Boolean indVatSubjct;

  @ApiModelProperty(value = "The full legal name of the customer.")
  private /*4*/ String nmeFullName;

  @ApiModelProperty(value = "The abbreviated name of the customer.")
  private /*4*/ String nmeShortName;

  @ApiModelProperty(value = "Timestamp from when this row was created.")
  private /*4*/ Date tspRecCreate;

  @ApiModelProperty(value = "Timestamp from when this row was last updated.")
  private /*4*/ Date tspRecUpdate;

  private /*4*/ String txtVatNumber;

  @ApiModelProperty(
      value =
          "User ID that created this row.  This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID.")
  private /*4*/ String uidRecCreate;

  @ApiModelProperty(
      value =
          "User ID that last updated this row.  This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID.")
  private /*4*/ String uidRecUpdate;

  @ApiModelProperty(value = "The external customer ID.")
  private /*4*/ String xidCustId;

  @ApiModelProperty(
      value =
          "The customer table.  Enterprises which conducts or may be interested in conducting commercial lending business with the bank is considered a customer.")
  private /*3*/ ResponseCustomer responseCustomerImmParentParent;

  @ApiModelProperty(
      value =
          "The customer table.  Enterprises which conducts or may be interested in conducting commercial lending business with the bank is considered a customer.")
  private /*3*/ ResponseCustomer responseCustomerUltParentParent;

  private /*4*/ String snapshotId;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - the field <code>cidCustId</code>
   */
  @Override
  public String getId() {
    return cidCustId;
  }
  /** The Record ID (RID) for the customer. */
  public String getCidCustId() {
    return cidCustId;
  }

  /** Trimmed version of {@link #getCidCustId()} */
  public String getCidCustId_trimmed() {
    return (cidCustId == null) ? null : cidCustId.trim();
  }

  /**
   * Limit for total of all outstandings (all types except Deposits). Null or zero value means no
   * limit.
   */
  public BigDecimal getAmtOsLimit() {
    return amtOsLimit;
  }

  /** The code identifying the LS2 Client Bank (the purchaser of LS2). */
  public String getCdeBank() {
    return cdeBank;
  }

  /** Trimmed version of {@link #getCdeBank()} */
  public String getCdeBank_trimmed() {
    return (cdeBank == null) ? null : cdeBank.trim();
  }

  /** The code for the customer&apos;s branch. */
  public String getCdeBranch() {
    return cdeBranch;
  }

  /** Trimmed version of {@link #getCdeBranch()} */
  public String getCdeBranch_trimmed() {
    return (cdeBranch == null) ? null : cdeBranch.trim();
  }

  /** The code for the customer&apos;s primary country. */
  public String getCdeCountry() {
    return cdeCountry;
  }

  /** Trimmed version of {@link #getCdeCountry()} */
  public String getCdeCountry_trimmed() {
    return (cdeCountry == null) ? null : cdeCountry.trim();
  }

  /** The code for the customer classification. */
  public String getCdeCustDesc() {
    return cdeCustDesc;
  }

  /** Trimmed version of {@link #getCdeCustDesc()} */
  public String getCdeCustDesc_trimmed() {
    return (cdeCustDesc == null) ? null : cdeCustDesc.trim();
  }

  /** The customer status code. */
  public String getCdeCustStat() {
    return cdeCustStat;
  }

  /** Trimmed version of {@link #getCdeCustStat()} */
  public String getCdeCustStat_trimmed() {
    return (cdeCustStat == null) ? null : cdeCustStat.trim();
  }

  /** The code for the customer department subtype. */
  public String getCdeDepSubtyp() {
    return cdeDepSubtyp;
  }

  /** Trimmed version of {@link #getCdeDepSubtyp()} */
  public String getCdeDepSubtyp_trimmed() {
    return (cdeDepSubtyp == null) ? null : cdeDepSubtyp.trim();
  }

  /** The code for the customer department. */
  public String getCdeDept() {
    return cdeDept;
  }

  /** Trimmed version of {@link #getCdeDept()} */
  public String getCdeDept_trimmed() {
    return (cdeDept == null) ? null : cdeDept.trim();
  }

  /** The expense code for the customer. */
  public String getCdeExpense() {
    return cdeExpense;
  }

  /** Trimmed version of {@link #getCdeExpense()} */
  public String getCdeExpense_trimmed() {
    return (cdeExpense == null) ? null : cdeExpense.trim();
  }

  /** Optional language code for the customer */
  public String getCdeLanguage() {
    return cdeLanguage;
  }

  /** Trimmed version of {@link #getCdeLanguage()} */
  public String getCdeLanguage_trimmed() {
    return (cdeLanguage == null) ? null : cdeLanguage.trim();
  }

  /** The legal code for the customer. */
  public String getCdeLegal() {
    return cdeLegal;
  }

  /** Trimmed version of {@link #getCdeLegal()} */
  public String getCdeLegal_trimmed() {
    return (cdeLegal == null) ? null : cdeLegal.trim();
  }

  /** Used in conjunction with Trade Ticket Entry. */
  public String getCdeMasterAct() {
    return cdeMasterAct;
  }

  /** Trimmed version of {@link #getCdeMasterAct()} */
  public String getCdeMasterAct_trimmed() {
    return (cdeMasterAct == null) ? null : cdeMasterAct.trim();
  }

  /**
   * Code which speicifies where the customer the creation of the customer occured -- online, via
   * api, etc. Values are from Customer Origin code table.
   */
  public String getCdeOrigin() {
    return cdeOrigin;
  }

  /** Trimmed version of {@link #getCdeOrigin()} */
  public String getCdeOrigin_trimmed() {
    return (cdeOrigin == null) ? null : cdeOrigin.trim();
  }

  /** Currency for the limit amount. */
  public String getCdeOsLimCcy() {
    return cdeOsLimCcy;
  }

  /** Trimmed version of {@link #getCdeOsLimCcy()} */
  public String getCdeOsLimCcy_trimmed() {
    return (cdeOsLimCcy == null) ? null : cdeOsLimCcy.trim();
  }

  /** The customer&apos;s primary SIC (Standard Industry Code). */
  public String getCdePrimSic() {
    return cdePrimSic;
  }

  /** Trimmed version of {@link #getCdePrimSic()} */
  public String getCdePrimSic_trimmed() {
    return (cdePrimSic == null) ? null : cdePrimSic.trim();
  }

  /**
   * &quot;For customers identified as &quot;&quot;prospects,&quot;&quot; identifies the prospect
   * type.&quot;
   */
  public String getCdeProspect() {
    return cdeProspect;
  }

  /** Trimmed version of {@link #getCdeProspect()} */
  public String getCdeProspect_trimmed() {
    return (cdeProspect == null) ? null : cdeProspect.trim();
  }

  /**
   * The country code necessary to uniquely identify the correct SIC as country is part of SIC
   * primary key
   */
  public String getCdeSicCntry() {
    return cdeSicCntry;
  }

  /** Trimmed version of {@link #getCdeSicCntry()} */
  public String getCdeSicCntry_trimmed() {
    return (cdeSicCntry == null) ? null : cdeSicCntry.trim();
  }

  /** The code for the treasury reporting area for the customer. */
  public String getCdeTrsRptAr() {
    return cdeTrsRptAr;
  }

  /** Trimmed version of {@link #getCdeTrsRptAr()} */
  public String getCdeTrsRptAr_trimmed() {
    return (cdeTrsRptAr == null) ? null : cdeTrsRptAr.trim();
  }

  /** The Record ID (RID) of the customer&apos;s immediate parent. */
  public String getCidImmParent() {
    return cidImmParent;
  }

  /** Trimmed version of {@link #getCidImmParent()} */
  public String getCidImmParent_trimmed() {
    return (cidImmParent == null) ? null : cidImmParent.trim();
  }

  /** The Record ID (RID) of the customer&apos;s ultimate parent. */
  public String getCidUltParent() {
    return cidUltParent;
  }

  /** Trimmed version of {@link #getCidUltParent()} */
  public String getCidUltParent_trimmed() {
    return (cidUltParent == null) ? null : cidUltParent.trim();
  }

  /** Indicates whether or not the customer has a beneficiary profile. */
  public Boolean getIndBenefic() {
    return indBenefic;
  }

  /** Indicates whether or not the customer has a borrower profile. */
  public Boolean getIndBorrower() {
    return indBorrower;
  }

  /** */
  public Boolean getIndBroker() {
    return indBroker;
  }

  /** Indicates whether or not the customer falls under the community reinvestment act. */
  public Boolean getIndCra() {
    return indCra;
  }

  /** Indicates whether or not the customer has a guarantor profile. */
  public Boolean getIndGuarantor() {
    return indGuarantor;
  }

  /**
   * &quot;Indicates whether or not the customer is a Host Bank Legal Entity. (When a Branch in the
   * Branch Table is associated with a Customer, that Customer is a &quot;&quot;Host Bank Legal
   * Entity&quot;&quot; and the legend &quot;&quot;A (Bank) Legal Entity&quot;&quot; appears on
   * first&quot;
   */
  public Boolean getIndIntrlEnt() {
    return indIntrlEnt;
  }

  /** Indicates whether or not the customer has a lender profile. */
  public Boolean getIndInvestor() {
    return indInvestor;
  }

  /** Indicates whether or not the customer is a major underwriter. */
  public Boolean getIndMajUndwrt() {
    return indMajUndwrt;
  }

  /** */
  public Boolean getIndOsLimErl() {
    return indOsLimErl;
  }

  /** Indicates whether or not access to the customer is restricted to specific users. */
  public Boolean getIndRestrict() {
    return indRestrict;
  }

  /** Indicator which specifies wether customer is a simple customer or not. */
  public Boolean getIndSimplified() {
    return indSimplified;
  }

  /** Indicates whether or not the customer belongs to the special loan group. */
  public Boolean getIndSlg() {
    return indSlg;
  }

  /** none */
  public Boolean getIndThrdPtyon() {
    return indThrdPtyon;
  }

  /** */
  public Boolean getIndVatSubjct() {
    return indVatSubjct;
  }

  /** The full legal name of the customer. */
  public String getNmeFullName() {
    return nmeFullName;
  }

  /** Trimmed version of {@link #getNmeFullName()} */
  public String getNmeFullName_trimmed() {
    return (nmeFullName == null) ? null : nmeFullName.trim();
  }

  /** The abbreviated name of the customer. */
  public String getNmeShortName() {
    return nmeShortName;
  }

  /** Trimmed version of {@link #getNmeShortName()} */
  public String getNmeShortName_trimmed() {
    return (nmeShortName == null) ? null : nmeShortName.trim();
  }

  /** Timestamp from when this row was created. */
  public Date getTspRecCreate() {
    return tspRecCreate;
  }

  /** Timestamp from when this row was last updated. */
  public Date getTspRecUpdate() {
    return tspRecUpdate;
  }

  /** */
  public String getTxtVatNumber() {
    return txtVatNumber;
  }

  /** Trimmed version of {@link #getTxtVatNumber()} */
  public String getTxtVatNumber_trimmed() {
    return (txtVatNumber == null) ? null : txtVatNumber.trim();
  }

  /** User ID that created this row. This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID. */
  public String getUidRecCreate() {
    return uidRecCreate;
  }

  /** Trimmed version of {@link #getUidRecCreate()} */
  public String getUidRecCreate_trimmed() {
    return (uidRecCreate == null) ? null : uidRecCreate.trim();
  }

  /**
   * User ID that last updated this row. This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID.
   */
  public String getUidRecUpdate() {
    return uidRecUpdate;
  }

  /** Trimmed version of {@link #getUidRecUpdate()} */
  public String getUidRecUpdate_trimmed() {
    return (uidRecUpdate == null) ? null : uidRecUpdate.trim();
  }

  /** The external customer ID. */
  public String getXidCustId() {
    return xidCustId;
  }

  /** Trimmed version of {@link #getXidCustId()} */
  public String getXidCustId_trimmed() {
    return (xidCustId == null) ? null : xidCustId.trim();
  }

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public ResponseCustomer getResponseCustomerImmParentParent() {
    return nullIfNotFound(responseCustomerImmParentParent);
  }

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public ResponseCustomer getResponseCustomerUltParentParent() {
    return nullIfNotFound(responseCustomerUltParentParent);
  }

  /** */
  public String getSnapshotId() {
    return snapshotId;
  }

  /** Trimmed version of {@link #getSnapshotId()} */
  public String getSnapshotId_trimmed() {
    return (snapshotId == null) ? null : snapshotId.trim();
  }

  // Setter HERE
  /** The Record ID (RID) for the customer. */
  public void setCidCustId(String cidCustId) {
    this.cidCustId = cidCustId;
  }

  /**
   * Limit for total of all outstandings (all types except Deposits). Null or zero value means no
   * limit.
   */
  public void setAmtOsLimit(BigDecimal amtOsLimit) {
    this.amtOsLimit = amtOsLimit;
  }

  /** The code identifying the LS2 Client Bank (the purchaser of LS2). */
  public void setCdeBank(String cdeBank) {
    this.cdeBank = cdeBank;
  }

  /** The code for the customer&apos;s branch. */
  public void setCdeBranch(String cdeBranch) {
    this.cdeBranch = cdeBranch;
  }

  /** The code for the customer&apos;s primary country. */
  public void setCdeCountry(String cdeCountry) {
    this.cdeCountry = cdeCountry;
  }

  /** The code for the customer classification. */
  public void setCdeCustDesc(String cdeCustDesc) {
    this.cdeCustDesc = cdeCustDesc;
  }

  /** The customer status code. */
  public void setCdeCustStat(String cdeCustStat) {
    this.cdeCustStat = cdeCustStat;
  }

  /** The code for the customer department subtype. */
  public void setCdeDepSubtyp(String cdeDepSubtyp) {
    this.cdeDepSubtyp = cdeDepSubtyp;
  }

  /** The code for the customer department. */
  public void setCdeDept(String cdeDept) {
    this.cdeDept = cdeDept;
  }

  /** The expense code for the customer. */
  public void setCdeExpense(String cdeExpense) {
    this.cdeExpense = cdeExpense;
  }

  /** Optional language code for the customer */
  public void setCdeLanguage(String cdeLanguage) {
    this.cdeLanguage = cdeLanguage;
  }

  /** The legal code for the customer. */
  public void setCdeLegal(String cdeLegal) {
    this.cdeLegal = cdeLegal;
  }

  /** Used in conjunction with Trade Ticket Entry. */
  public void setCdeMasterAct(String cdeMasterAct) {
    this.cdeMasterAct = cdeMasterAct;
  }

  /**
   * Code which speicifies where the customer the creation of the customer occured -- online, via
   * api, etc. Values are from Customer Origin code table.
   */
  public void setCdeOrigin(String cdeOrigin) {
    this.cdeOrigin = cdeOrigin;
  }

  /** Currency for the limit amount. */
  public void setCdeOsLimCcy(String cdeOsLimCcy) {
    this.cdeOsLimCcy = cdeOsLimCcy;
  }

  /** The customer&apos;s primary SIC (Standard Industry Code). */
  public void setCdePrimSic(String cdePrimSic) {
    this.cdePrimSic = cdePrimSic;
  }

  /**
   * &quot;For customers identified as &quot;&quot;prospects,&quot;&quot; identifies the prospect
   * type.&quot;
   */
  public void setCdeProspect(String cdeProspect) {
    this.cdeProspect = cdeProspect;
  }

  /**
   * The country code necessary to uniquely identify the correct SIC as country is part of SIC
   * primary key
   */
  public void setCdeSicCntry(String cdeSicCntry) {
    this.cdeSicCntry = cdeSicCntry;
  }

  /** The code for the treasury reporting area for the customer. */
  public void setCdeTrsRptAr(String cdeTrsRptAr) {
    this.cdeTrsRptAr = cdeTrsRptAr;
  }

  /** The Record ID (RID) of the customer&apos;s immediate parent. */
  public void setCidImmParent(String cidImmParent) {
    this.cidImmParent = cidImmParent;
  }

  /** The Record ID (RID) of the customer&apos;s ultimate parent. */
  public void setCidUltParent(String cidUltParent) {
    this.cidUltParent = cidUltParent;
  }

  /** Indicates whether or not the customer has a beneficiary profile. */
  public void setIndBenefic(Boolean indBenefic) {
    this.indBenefic = indBenefic;
  }

  /** Indicates whether or not the customer has a borrower profile. */
  public void setIndBorrower(Boolean indBorrower) {
    this.indBorrower = indBorrower;
  }

  /** */
  public void setIndBroker(Boolean indBroker) {
    this.indBroker = indBroker;
  }

  /** Indicates whether or not the customer falls under the community reinvestment act. */
  public void setIndCra(Boolean indCra) {
    this.indCra = indCra;
  }

  /** Indicates whether or not the customer has a guarantor profile. */
  public void setIndGuarantor(Boolean indGuarantor) {
    this.indGuarantor = indGuarantor;
  }

  /**
   * &quot;Indicates whether or not the customer is a Host Bank Legal Entity. (When a Branch in the
   * Branch Table is associated with a Customer, that Customer is a &quot;&quot;Host Bank Legal
   * Entity&quot;&quot; and the legend &quot;&quot;A (Bank) Legal Entity&quot;&quot; appears on
   * first&quot;
   */
  public void setIndIntrlEnt(Boolean indIntrlEnt) {
    this.indIntrlEnt = indIntrlEnt;
  }

  /** Indicates whether or not the customer has a lender profile. */
  public void setIndInvestor(Boolean indInvestor) {
    this.indInvestor = indInvestor;
  }

  /** Indicates whether or not the customer is a major underwriter. */
  public void setIndMajUndwrt(Boolean indMajUndwrt) {
    this.indMajUndwrt = indMajUndwrt;
  }

  /** */
  public void setIndOsLimErl(Boolean indOsLimErl) {
    this.indOsLimErl = indOsLimErl;
  }

  /** Indicates whether or not access to the customer is restricted to specific users. */
  public void setIndRestrict(Boolean indRestrict) {
    this.indRestrict = indRestrict;
  }

  /** Indicator which specifies wether customer is a simple customer or not. */
  public void setIndSimplified(Boolean indSimplified) {
    this.indSimplified = indSimplified;
  }

  /** Indicates whether or not the customer belongs to the special loan group. */
  public void setIndSlg(Boolean indSlg) {
    this.indSlg = indSlg;
  }

  /** none */
  public void setIndThrdPtyon(Boolean indThrdPtyon) {
    this.indThrdPtyon = indThrdPtyon;
  }

  /** */
  public void setIndVatSubjct(Boolean indVatSubjct) {
    this.indVatSubjct = indVatSubjct;
  }

  /** The full legal name of the customer. */
  public void setNmeFullName(String nmeFullName) {
    this.nmeFullName = nmeFullName;
  }

  /** The abbreviated name of the customer. */
  public void setNmeShortName(String nmeShortName) {
    this.nmeShortName = nmeShortName;
  }

  /** Timestamp from when this row was created. */
  public void setTspRecCreate(Date tspRecCreate) {
    this.tspRecCreate = tspRecCreate;
  }

  /** Timestamp from when this row was last updated. */
  public void setTspRecUpdate(Date tspRecUpdate) {
    this.tspRecUpdate = tspRecUpdate;
  }

  /** */
  public void setTxtVatNumber(String txtVatNumber) {
    this.txtVatNumber = txtVatNumber;
  }

  /** User ID that created this row. This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID. */
  public void setUidRecCreate(String uidRecCreate) {
    this.uidRecCreate = uidRecCreate;
  }

  /**
   * User ID that last updated this row. This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID.
   */
  public void setUidRecUpdate(String uidRecUpdate) {
    this.uidRecUpdate = uidRecUpdate;
  }

  /** The external customer ID. */
  public void setXidCustId(String xidCustId) {
    this.xidCustId = xidCustId;
  }

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public void setResponseCustomerImmParentParent(ResponseCustomer responseCustomerImmParentParent) {
    this.responseCustomerImmParentParent = responseCustomerImmParentParent;
  }

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public void setResponseCustomerUltParentParent(ResponseCustomer responseCustomerUltParentParent) {
    this.responseCustomerUltParentParent = responseCustomerUltParentParent;
  }

  /** */
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(cidCustId);
    return builder.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj == this) {
      return true;
    }
    if (obj.getClass() != getClass()) {
      return false;
    }
    ResponseCustomer other = (ResponseCustomer) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cidCustId, other.cidCustId);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(ResponseCustomer other) {
    CompareHelper helper = new CompareHelper();
    helper.append("cidCustId", this.cidCustId, other.cidCustId);
    helper.append("amtOsLimit", this.amtOsLimit, other.amtOsLimit);
    helper.append("cdeBank", this.cdeBank, other.cdeBank);
    helper.append("cdeBranch", this.cdeBranch, other.cdeBranch);
    helper.append("cdeCountry", this.cdeCountry, other.cdeCountry);
    helper.append("cdeCustDesc", this.cdeCustDesc, other.cdeCustDesc);
    helper.append("cdeCustStat", this.cdeCustStat, other.cdeCustStat);
    helper.append("cdeDepSubtyp", this.cdeDepSubtyp, other.cdeDepSubtyp);
    helper.append("cdeDept", this.cdeDept, other.cdeDept);
    helper.append("cdeExpense", this.cdeExpense, other.cdeExpense);
    helper.append("cdeLanguage", this.cdeLanguage, other.cdeLanguage);
    helper.append("cdeLegal", this.cdeLegal, other.cdeLegal);
    helper.append("cdeMasterAct", this.cdeMasterAct, other.cdeMasterAct);
    helper.append("cdeOrigin", this.cdeOrigin, other.cdeOrigin);
    helper.append("cdeOsLimCcy", this.cdeOsLimCcy, other.cdeOsLimCcy);
    helper.append("cdePrimSic", this.cdePrimSic, other.cdePrimSic);
    helper.append("cdeProspect", this.cdeProspect, other.cdeProspect);
    helper.append("cdeSicCntry", this.cdeSicCntry, other.cdeSicCntry);
    helper.append("cdeTrsRptAr", this.cdeTrsRptAr, other.cdeTrsRptAr);
    helper.append("cidImmParent", this.cidImmParent, other.cidImmParent);
    helper.append("cidUltParent", this.cidUltParent, other.cidUltParent);
    helper.append("indBenefic", this.indBenefic, other.indBenefic);
    helper.append("indBorrower", this.indBorrower, other.indBorrower);
    helper.append("indBroker", this.indBroker, other.indBroker);
    helper.append("indCra", this.indCra, other.indCra);
    helper.append("indGuarantor", this.indGuarantor, other.indGuarantor);
    helper.append("indIntrlEnt", this.indIntrlEnt, other.indIntrlEnt);
    helper.append("indInvestor", this.indInvestor, other.indInvestor);
    helper.append("indMajUndwrt", this.indMajUndwrt, other.indMajUndwrt);
    helper.append("indOsLimErl", this.indOsLimErl, other.indOsLimErl);
    helper.append("indRestrict", this.indRestrict, other.indRestrict);
    helper.append("indSimplified", this.indSimplified, other.indSimplified);
    helper.append("indSlg", this.indSlg, other.indSlg);
    helper.append("indThrdPtyon", this.indThrdPtyon, other.indThrdPtyon);
    helper.append("indVatSubjct", this.indVatSubjct, other.indVatSubjct);
    helper.append("nmeFullName", this.nmeFullName, other.nmeFullName);
    helper.append("nmeShortName", this.nmeShortName, other.nmeShortName);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("txtVatNumber", this.txtVatNumber, other.txtVatNumber);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    helper.append("xidCustId", this.xidCustId, other.xidCustId);
    return helper;
  }
}
