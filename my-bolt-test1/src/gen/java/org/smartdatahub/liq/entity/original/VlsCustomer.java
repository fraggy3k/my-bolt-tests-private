/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.original;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;
import org.hibernate.annotations.JoinFormula;
import org.smartdatahub.liq.entity.interfaces.LiqBranch;
import org.smartdatahub.liq.entity.interfaces.LiqCodeBank;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDealAdmin;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.utils.BooleanToStringConverter;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * The customer table. Enterprises which conducts or may be interested in conducting commercial
 * lending business with the bank is considered a customer.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@Entity
@Table(name = "VLS_CUSTOMER")
public class VlsCustomer
    implements LiqCustomer,
        Identifiable<String>,
        Serializable,
        EqualsSimpleFieldSupport<VlsCustomer> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "CUS";

  @Column(name = "CUS_CID_CUST_ID", nullable = false, length = 8)
  @Id
  private /*4*/ String cidCustId;

  @Column(name = "CUS_AMT_OS_LIMIT", nullable = false, length = 28, scale = 3)
  private /*4*/ BigDecimal amtOsLimit;

  @Column(name = "CUS_CDE_BANK", nullable = false, length = 5)
  private /*4*/ String cdeBank;

  @Column(name = "CUS_CDE_BRANCH", nullable = true, length = 5)
  private /*4*/ String cdeBranch;

  @Column(name = "CUS_CDE_COUNTRY", nullable = false, length = 2)
  private /*4*/ String cdeCountry;

  @Column(name = "CUS_CDE_CUST_DESC", nullable = true, length = 5)
  private /*4*/ String cdeCustDesc;

  @Column(name = "CUS_CDE_CUST_STAT", nullable = false, length = 5)
  private /*4*/ String cdeCustStat;

  @Column(name = "CUS_CDE_DEP_SUBTYP", nullable = true, length = 5)
  private /*4*/ String cdeDepSubtyp;

  @Column(name = "CUS_CDE_DEPT", nullable = true, length = 5)
  private /*4*/ String cdeDept;

  @Column(name = "CUS_CDE_EXPENSE", nullable = true, length = 15)
  private /*4*/ String cdeExpense;

  @Column(name = "CUS_CDE_LANGUAGE", nullable = true, length = 5)
  private /*4*/ String cdeLanguage;

  @Column(name = "CUS_CDE_LEGAL", nullable = true, length = 5)
  private /*4*/ String cdeLegal;

  @Column(name = "CUS_CDE_MASTER_ACT", nullable = true, length = 5)
  private /*4*/ String cdeMasterAct;

  @Column(name = "CUS_CDE_ORIGIN", nullable = true, length = 5)
  private /*4*/ String cdeOrigin;

  @Column(name = "CUS_CDE_OS_LIM_CCY", nullable = true, length = 3)
  private /*4*/ String cdeOsLimCcy;

  @Column(name = "CUS_CDE_PRIM_SIC", nullable = true, length = 10)
  private /*4*/ String cdePrimSic;

  @Column(name = "CUS_CDE_PROSPECT", nullable = true, length = 5)
  private /*4*/ String cdeProspect;

  @Column(name = "CUS_CDE_SIC_CNTRY", nullable = true, length = 2)
  private /*4*/ String cdeSicCntry;

  @Column(name = "CUS_CDE_TRS_RPT_AR", nullable = false, length = 5)
  private /*4*/ String cdeTrsRptAr;

  @Column(name = "CUS_CID_IMM_PARENT", nullable = true, length = 8)
  private /*4*/ String cidImmParent;

  @Column(name = "CUS_CID_ULT_PARENT", nullable = true, length = 8)
  private /*4*/ String cidUltParent;

  @Column(name = "CUS_IND_BENEFIC", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indBenefic;

  @Column(name = "CUS_IND_BORROWER", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indBorrower;

  @Column(name = "CUS_IND_BROKER", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indBroker;

  @Column(name = "CUS_IND_CRA", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indCra;

  @Column(name = "CUS_IND_GUARANTOR", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indGuarantor;

  @Column(name = "CUS_IND_INTRL_ENT", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indIntrlEnt;

  @Column(name = "CUS_IND_INVESTOR", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indInvestor;

  @Column(name = "CUS_IND_MAJ_UNDWRT", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indMajUndwrt;

  @Column(name = "CUS_IND_OS_LIM_ERL", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOsLimErl;

  @Column(name = "CUS_IND_RESTRICT", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indRestrict;

  @Column(name = "CUS_IND_SIMPLIFIED", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indSimplified;

  @Column(name = "CUS_IND_SLG", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indSlg;

  @Column(name = "CUS_IND_THRD_PTYON", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indThrdPtyon;

  @Column(name = "CUS_IND_VAT_SUBJCT", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indVatSubjct;

  @Column(name = "CUS_NME_FULL_NAME", nullable = false, length = 140)
  private /*4*/ String nmeFullName;

  @Column(name = "CUS_NME_SHORT_NAME", nullable = false, length = 30)
  private /*4*/ String nmeShortName;

  @Column(name = "CUS_TSP_REC_CREATE", nullable = false)
  private /*4*/ Date tspRecCreate;

  @Column(name = "CUS_TSP_REC_UPDATE", nullable = false)
  private /*4*/ Date tspRecUpdate;

  @Column(name = "CUS_TXT_VAT_NUMBER", nullable = false, length = 15)
  private /*4*/ String txtVatNumber;

  @Column(name = "CUS_UID_REC_CREATE", nullable = false, length = 8)
  private /*4*/ String uidRecCreate;

  @Column(name = "CUS_UID_REC_UPDATE", nullable = false, length = 8)
  private /*4*/ String uidRecUpdate;

  @Column(name = "CUS_XID_CUST_ID", nullable = false, length = 15)
  private /*4*/ String xidCustId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumnsOrFormulas(
      value = {
        @JoinColumnOrFormula(
            formula =
                @JoinFormula(
                    referencedColumnName = VlsFamGlobal2.DISCRIMINATOR_COLUMN,
                    value = CodeBank.QUOTED_DISCRIMINATOR_VALUE)),
        @JoinColumnOrFormula(
            column =
                @JoinColumn(
                    name = "CUS_CDE_BANK",
                    referencedColumnName = "GB2_CDE_CODE",
                    insertable = false,
                    updatable = false))
      })
  private /*3*/ CodeBank liqCodeBank;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CUS_CID_IMM_PARENT", insertable = false, updatable = false)
  private /*3*/ VlsCustomer liqCustomerImmParentParent;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "CUS_CID_ULT_PARENT", insertable = false, updatable = false)
  private /*3*/ VlsCustomer liqCustomerUltParentParent;

  @Fetch(value = FetchMode.SUBSELECT)
  @OneToMany(mappedBy = "liqCustomer", fetch = FetchType.LAZY, targetEntity = VlsBranch.class)
  private List</*1*/ LiqBranch> liqBranchs;

  @OneToMany(mappedBy = "liqCustomer", fetch = FetchType.LAZY, targetEntity = VlsDealAdmin.class)
  private List</*1*/ LiqDealAdmin> liqDealAdmins;

  @OneToMany(mappedBy = "liqCustomer", fetch = FetchType.LAZY, targetEntity = VlsDealBorrower.class)
  private List</*1*/ LiqDealBorrower> liqDealBorrowers;

  @OneToMany(
      mappedBy = "liqCustomerImmParentParent",
      fetch = FetchType.LAZY,
      targetEntity = VlsCustomer.class)
  private List</*1*/ LiqCustomer> liqImmParentCustomers;

  @OneToMany(
      mappedBy = "liqCustomerBorrower",
      fetch = FetchType.LAZY,
      targetEntity = VlsOutstanding.class)
  private List</*1*/ LiqOutstanding> liqOutstandings;

  @OneToMany(
      mappedBy = "liqCustomerUltParentParent",
      fetch = FetchType.LAZY,
      targetEntity = VlsCustomer.class)
  private List</*1*/ LiqCustomer> liqUltParentCustomers;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - the field <code>cidCustId</code>
   */
  @Override
  public String getId() {
    return cidCustId;
  }
  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>cidCustId</code>
   */
  @Override
  public String getOriginId() {
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
  public LiqCodeBank getLiqCodeBank() {
    return nullIfNotFound(liqCodeBank);
  }

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public LiqCustomer getLiqCustomerImmParentParent() {
    return nullIfNotFound(liqCustomerImmParentParent);
  }

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public LiqCustomer getLiqCustomerUltParentParent() {
    return nullIfNotFound(liqCustomerUltParentParent);
  }

  /** The branch table. */
  public List<LiqBranch> getLiqBranchs() {
    return nullIfNotFound(liqBranchs);
  }

  /** The deal administrator table. Management of money transfer between lenders and borrowers. */
  public List<LiqDealAdmin> getLiqDealAdmins() {
    return nullIfNotFound(liqDealAdmins);
  }

  /** The deal borrower table. The borrowers that are associated with a deal. */
  public List<LiqDealBorrower> getLiqDealBorrowers() {
    return nullIfNotFound(liqDealBorrowers);
  }

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public List<LiqCustomer> getLiqImmParentCustomers() {
    return nullIfNotFound(liqImmParentCustomers);
  }

  /** The outstanding table. Outstanding amounts and dates for loans and letters of credit. */
  public List<LiqOutstanding> getLiqOutstandings() {
    return nullIfNotFound(liqOutstandings);
  }

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public List<LiqCustomer> getLiqUltParentCustomers() {
    return nullIfNotFound(liqUltParentCustomers);
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
    VlsCustomer other = (VlsCustomer) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cidCustId, other.cidCustId);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(VlsCustomer other) {
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
