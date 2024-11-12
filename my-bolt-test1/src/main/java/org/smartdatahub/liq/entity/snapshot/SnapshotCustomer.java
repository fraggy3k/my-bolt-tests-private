/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.snapshot;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name = "SNAP_CUSTOMER")
public class SnapshotCustomer
    implements LiqCustomer,
        Identifiable<String>,
        Serializable,
        EqualsSimpleFieldSupport<SnapshotCustomer> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "CUS";

  @Id
  @Column(name = "ID", length = 35)
  private /*4*/ String id;

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

  @Column(name = "CUS_CID_CUST_ID", nullable = false, length = 8)
  private /*4*/ String cidCustId;

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

  @Column(name = "SNAPSHOT_ID", length = 50)
  private /*4*/ String snapshotId;

  @ManyToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "SNAPSHOT_INFO")
  private /*3*/ SnapshotInfo snapshotInfo;

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

  @ManyToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  private /*3*/ SnapshotCodeBank liqCodeBank;

  @ManyToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "S_CUSTOMER_IMM_PARENT_PARENT")
  private /*3*/ SnapshotCustomer liqCustomerImmParentParent;

  @ManyToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "S_CUSTOMER_ULT_PARENT_PARENT")
  private /*3*/ SnapshotCustomer liqCustomerUltParentParent;

  @Fetch(value = FetchMode.SUBSELECT)
  @OneToMany(
      mappedBy = "liqCustomer",
      fetch = FetchType.LAZY,
      targetEntity = SnapshotBranch.class,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  private List</*1*/ LiqBranch> liqBranchs;

  @OneToMany(
      mappedBy = "liqCustomer",
      fetch = FetchType.LAZY,
      targetEntity = SnapshotDealAdmin.class,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  private List</*1*/ LiqDealAdmin> liqDealAdmins;

  @OneToMany(
      mappedBy = "liqCustomer",
      fetch = FetchType.LAZY,
      targetEntity = SnapshotDealBorrower.class,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  private List</*1*/ LiqDealBorrower> liqDealBorrowers;

  @OneToMany(
      mappedBy = "liqCustomerImmParentParent",
      fetch = FetchType.LAZY,
      targetEntity = SnapshotCustomer.class,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  private List</*1*/ LiqCustomer> liqImmParentCustomers;

  @OneToMany(
      mappedBy = "liqCustomerBorrower",
      fetch = FetchType.LAZY,
      targetEntity = SnapshotOutstanding.class,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  private List</*1*/ LiqOutstanding> liqOutstandings;

  @OneToMany(
      mappedBy = "liqCustomerUltParentParent",
      fetch = FetchType.LAZY,
      targetEntity = SnapshotCustomer.class,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  private List</*1*/ LiqCustomer> liqUltParentCustomers;

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>cidCustId</code>
   */
  @Override
  public String getOriginId() {
    return cidCustId;
  }
  /** */
  public String getId() {
    return id;
  }

  /** Trimmed version of {@link #getId()} */
  public String getId_trimmed() {
    return (id == null) ? null : id.trim();
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

  /** The Record ID (RID) for the customer. */
  public String getCidCustId() {
    return cidCustId;
  }

  /** Trimmed version of {@link #getCidCustId()} */
  public String getCidCustId_trimmed() {
    return (cidCustId == null) ? null : cidCustId.trim();
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

  /** */
  public String getSnapshotId() {
    return snapshotId;
  }

  /** Trimmed version of {@link #getSnapshotId()} */
  public String getSnapshotId_trimmed() {
    return (snapshotId == null) ? null : snapshotId.trim();
  }

  /** */
  public SnapshotInfo getSnapshotInfo() {
    return snapshotInfo;
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

  // Setter HERE
  /** */
  public void setId(String id) {
    this.id = id;
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

  /** The Record ID (RID) for the customer. */
  public void setCidCustId(String cidCustId) {
    this.cidCustId = cidCustId;
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

  /** */
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  /** */
  public void setSnapshotInfo(SnapshotInfo snapshotInfo) {
    this.snapshotInfo = snapshotInfo;
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
  public void setLiqCodeBank(SnapshotCodeBank liqCodeBank) {
    this.liqCodeBank = liqCodeBank;
  }

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public void setLiqCustomerImmParentParent(SnapshotCustomer liqCustomerImmParentParent) {
    this.liqCustomerImmParentParent = liqCustomerImmParentParent;
  }

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public void setLiqCustomerUltParentParent(SnapshotCustomer liqCustomerUltParentParent) {
    this.liqCustomerUltParentParent = liqCustomerUltParentParent;
  }

  /** The branch table. */
  public void addLiqBranchs(List<SnapshotBranch> liqBranchs) {
    if (this.liqBranchs == null) {
      this.liqBranchs = new ArrayList<>(liqBranchs.size());
    }
    this.liqBranchs.addAll(liqBranchs);
    liqBranchs.forEach(e -> e.setLiqCustomer(this));
  }

  /** The deal administrator table. Management of money transfer between lenders and borrowers. */
  public void addLiqDealAdmins(List<SnapshotDealAdmin> liqDealAdmins) {
    if (this.liqDealAdmins == null) {
      this.liqDealAdmins = new ArrayList<>(liqDealAdmins.size());
    }
    this.liqDealAdmins.addAll(liqDealAdmins);
    liqDealAdmins.forEach(e -> e.setLiqCustomer(this));
  }

  /** The deal borrower table. The borrowers that are associated with a deal. */
  public void addLiqDealBorrowers(List<SnapshotDealBorrower> liqDealBorrowers) {
    if (this.liqDealBorrowers == null) {
      this.liqDealBorrowers = new ArrayList<>(liqDealBorrowers.size());
    }
    this.liqDealBorrowers.addAll(liqDealBorrowers);
    liqDealBorrowers.forEach(e -> e.setLiqCustomer(this));
  }

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public void addLiqImmParentCustomers(List<SnapshotCustomer> liqImmParentCustomers) {
    if (this.liqImmParentCustomers == null) {
      this.liqImmParentCustomers = new ArrayList<>(liqImmParentCustomers.size());
    }
    this.liqImmParentCustomers.addAll(liqImmParentCustomers);
    liqImmParentCustomers.forEach(e -> e.setLiqCustomerImmParentParent(this));
  }

  /** The outstanding table. Outstanding amounts and dates for loans and letters of credit. */
  public void addLiqOutstandings(List<SnapshotOutstanding> liqOutstandings) {
    if (this.liqOutstandings == null) {
      this.liqOutstandings = new ArrayList<>(liqOutstandings.size());
    }
    this.liqOutstandings.addAll(liqOutstandings);
    liqOutstandings.forEach(e -> e.setLiqCustomerBorrower(this));
  }

  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public void addLiqUltParentCustomers(List<SnapshotCustomer> liqUltParentCustomers) {
    if (this.liqUltParentCustomers == null) {
      this.liqUltParentCustomers = new ArrayList<>(liqUltParentCustomers.size());
    }
    this.liqUltParentCustomers.addAll(liqUltParentCustomers);
    liqUltParentCustomers.forEach(e -> e.setLiqCustomerUltParentParent(this));
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(id);
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
    SnapshotCustomer other = (SnapshotCustomer) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.id, other.id);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(SnapshotCustomer other) {
    CompareHelper helper = new CompareHelper();
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
    helper.append("cidCustId", this.cidCustId, other.cidCustId);
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
