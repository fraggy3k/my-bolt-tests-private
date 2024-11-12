/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.model.file;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * SELECT CUS_CID_CUST_ID, CUS_AMT_OS_LIMIT, CUS_CDE_BANK, CUS_CDE_BRANCH, CUS_CDE_COUNTRY,
 * CUS_CDE_CUST_DESC, CUS_CDE_CUST_STAT, CUS_CDE_DEP_SUBTYP, CUS_CDE_DEPT, CUS_CDE_EXPENSE,
 * CUS_CDE_LANGUAGE, CUS_CDE_LEGAL, CUS_CDE_MASTER_ACT, CUS_CDE_ORIGIN, CUS_CDE_OS_LIM_CCY,
 * CUS_CDE_PRIM_SIC, CUS_CDE_PROSPECT, CUS_CDE_SIC_CNTRY, CUS_CDE_TRS_RPT_AR, CUS_CID_IMM_PARENT,
 * CUS_CID_ULT_PARENT, CUS_IND_BENEFIC, CUS_IND_BORROWER, CUS_IND_BROKER, CUS_IND_CRA,
 * CUS_IND_GUARANTOR, CUS_IND_INTRL_ENT, CUS_IND_INVESTOR, CUS_IND_MAJ_UNDWRT, CUS_IND_OS_LIM_ERL,
 * CUS_IND_RESTRICT, CUS_IND_SIMPLIFIED, CUS_IND_SLG, CUS_IND_THRD_PTYON, CUS_IND_VAT_SUBJCT,
 * CUS_NME_FULL_NAME, CUS_NME_SHORT_NAME, CUS_TSP_REC_CREATE, CUS_TSP_REC_UPDATE,
 * CUS_TXT_VAT_NUMBER, CUS_UID_REC_CREATE, CUS_UID_REC_UPDATE, CUS_XID_CUST_ID, FROM blablabla
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public class CsvCustomer
    implements Identifiable<String>, Serializable, EqualsSimpleFieldSupport<CsvCustomer> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "CUS";

  @Id private /*4*/ String cidCustId;
  private /*4*/ BigDecimal amtOsLimit;
  private /*4*/ String cdeBank;
  private /*4*/ String cdeBranch;
  private /*4*/ String cdeCountry;
  private /*4*/ String cdeCustDesc;
  private /*4*/ String cdeCustStat;
  private /*4*/ String cdeDepSubtyp;
  private /*4*/ String cdeDept;
  private /*4*/ String cdeExpense;
  private /*4*/ String cdeLanguage;
  private /*4*/ String cdeLegal;
  private /*4*/ String cdeMasterAct;
  private /*4*/ String cdeOrigin;
  private /*4*/ String cdeOsLimCcy;
  private /*4*/ String cdePrimSic;
  private /*4*/ String cdeProspect;
  private /*4*/ String cdeSicCntry;
  private /*4*/ String cdeTrsRptAr;
  private /*4*/ String cidImmParent;
  private /*4*/ String cidUltParent;
  private /*4*/ Boolean indBenefic;
  private /*4*/ Boolean indBorrower;
  private /*4*/ Boolean indBroker;
  private /*4*/ Boolean indCra;
  private /*4*/ Boolean indGuarantor;
  private /*4*/ Boolean indIntrlEnt;
  private /*4*/ Boolean indInvestor;
  private /*4*/ Boolean indMajUndwrt;
  private /*4*/ Boolean indOsLimErl;
  private /*4*/ Boolean indRestrict;
  private /*4*/ Boolean indSimplified;
  private /*4*/ Boolean indSlg;
  private /*4*/ Boolean indThrdPtyon;
  private /*4*/ Boolean indVatSubjct;
  private /*4*/ String nmeFullName;
  private /*4*/ String nmeShortName;
  private /*4*/ Date tspRecCreate;
  private /*4*/ Date tspRecUpdate;
  private /*4*/ String txtVatNumber;
  private /*4*/ String uidRecCreate;
  private /*4*/ String uidRecUpdate;
  private /*4*/ String xidCustId;
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
    CsvCustomer other = (CsvCustomer) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cidCustId, other.cidCustId);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(CsvCustomer other) {
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
