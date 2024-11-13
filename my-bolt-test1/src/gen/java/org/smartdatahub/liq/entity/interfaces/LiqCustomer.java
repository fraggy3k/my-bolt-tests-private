/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.smartdatahub.liq.entity.utils.DomainObject;

/**
 * The customer table. Enterprises which conducts or may be interested in conducting commercial
 * lending business with the bank is considered a customer.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public interface LiqCustomer extends DomainObject {

  public static final String TABLE_ID = "CUS";

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>cidCustId</code>
   */
  public String getOriginId();

  /**
   * Limit for total of all outstandings (all types except Deposits). Null or zero value means no
   * limit.
   */
  public BigDecimal getAmtOsLimit();
  /** The code identifying the LS2 Client Bank (the purchaser of LS2). */
  public String getCdeBank();

  /** Trimmed version of {@link #getCdeBank()} */
  public String getCdeBank_trimmed();
  /** The code for the customer&apos;s branch. */
  public String getCdeBranch();

  /** Trimmed version of {@link #getCdeBranch()} */
  public String getCdeBranch_trimmed();
  /** The code for the customer&apos;s primary country. */
  public String getCdeCountry();

  /** Trimmed version of {@link #getCdeCountry()} */
  public String getCdeCountry_trimmed();
  /** The code for the customer classification. */
  public String getCdeCustDesc();

  /** Trimmed version of {@link #getCdeCustDesc()} */
  public String getCdeCustDesc_trimmed();
  /** The customer status code. */
  public String getCdeCustStat();

  /** Trimmed version of {@link #getCdeCustStat()} */
  public String getCdeCustStat_trimmed();
  /** The code for the customer department subtype. */
  public String getCdeDepSubtyp();

  /** Trimmed version of {@link #getCdeDepSubtyp()} */
  public String getCdeDepSubtyp_trimmed();
  /** The code for the customer department. */
  public String getCdeDept();

  /** Trimmed version of {@link #getCdeDept()} */
  public String getCdeDept_trimmed();
  /** The expense code for the customer. */
  public String getCdeExpense();

  /** Trimmed version of {@link #getCdeExpense()} */
  public String getCdeExpense_trimmed();
  /** Optional language code for the customer */
  public String getCdeLanguage();

  /** Trimmed version of {@link #getCdeLanguage()} */
  public String getCdeLanguage_trimmed();
  /** The legal code for the customer. */
  public String getCdeLegal();

  /** Trimmed version of {@link #getCdeLegal()} */
  public String getCdeLegal_trimmed();
  /** Used in conjunction with Trade Ticket Entry. */
  public String getCdeMasterAct();

  /** Trimmed version of {@link #getCdeMasterAct()} */
  public String getCdeMasterAct_trimmed();
  /**
   * Code which speicifies where the customer the creation of the customer occured -- online, via
   * api, etc. Values are from Customer Origin code table.
   */
  public String getCdeOrigin();

  /** Trimmed version of {@link #getCdeOrigin()} */
  public String getCdeOrigin_trimmed();
  /** Currency for the limit amount. */
  public String getCdeOsLimCcy();

  /** Trimmed version of {@link #getCdeOsLimCcy()} */
  public String getCdeOsLimCcy_trimmed();
  /** The customer&apos;s primary SIC (Standard Industry Code). */
  public String getCdePrimSic();

  /** Trimmed version of {@link #getCdePrimSic()} */
  public String getCdePrimSic_trimmed();
  /**
   * &quot;For customers identified as &quot;&quot;prospects,&quot;&quot; identifies the prospect
   * type.&quot;
   */
  public String getCdeProspect();

  /** Trimmed version of {@link #getCdeProspect()} */
  public String getCdeProspect_trimmed();
  /**
   * The country code necessary to uniquely identify the correct SIC as country is part of SIC
   * primary key
   */
  public String getCdeSicCntry();

  /** Trimmed version of {@link #getCdeSicCntry()} */
  public String getCdeSicCntry_trimmed();
  /** The code for the treasury reporting area for the customer. */
  public String getCdeTrsRptAr();

  /** Trimmed version of {@link #getCdeTrsRptAr()} */
  public String getCdeTrsRptAr_trimmed();
  /** The Record ID (RID) for the customer. */
  public String getCidCustId();

  /** Trimmed version of {@link #getCidCustId()} */
  public String getCidCustId_trimmed();
  /** The Record ID (RID) of the customer&apos;s immediate parent. */
  public String getCidImmParent();

  /** Trimmed version of {@link #getCidImmParent()} */
  public String getCidImmParent_trimmed();
  /** The Record ID (RID) of the customer&apos;s ultimate parent. */
  public String getCidUltParent();

  /** Trimmed version of {@link #getCidUltParent()} */
  public String getCidUltParent_trimmed();
  /** Indicates whether or not the customer has a beneficiary profile. */
  public Boolean getIndBenefic();
  /** Indicates whether or not the customer has a borrower profile. */
  public Boolean getIndBorrower();
  /** */
  public Boolean getIndBroker();
  /** Indicates whether or not the customer falls under the community reinvestment act. */
  public Boolean getIndCra();
  /** Indicates whether or not the customer has a guarantor profile. */
  public Boolean getIndGuarantor();
  /**
   * &quot;Indicates whether or not the customer is a Host Bank Legal Entity. (When a Branch in the
   * Branch Table is associated with a Customer, that Customer is a &quot;&quot;Host Bank Legal
   * Entity&quot;&quot; and the legend &quot;&quot;A (Bank) Legal Entity&quot;&quot; appears on
   * first&quot;
   */
  public Boolean getIndIntrlEnt();
  /** Indicates whether or not the customer has a lender profile. */
  public Boolean getIndInvestor();
  /** Indicates whether or not the customer is a major underwriter. */
  public Boolean getIndMajUndwrt();
  /** */
  public Boolean getIndOsLimErl();
  /** Indicates whether or not access to the customer is restricted to specific users. */
  public Boolean getIndRestrict();
  /** Indicator which specifies wether customer is a simple customer or not. */
  public Boolean getIndSimplified();
  /** Indicates whether or not the customer belongs to the special loan group. */
  public Boolean getIndSlg();
  /** none */
  public Boolean getIndThrdPtyon();
  /** */
  public Boolean getIndVatSubjct();
  /** The full legal name of the customer. */
  public String getNmeFullName();

  /** Trimmed version of {@link #getNmeFullName()} */
  public String getNmeFullName_trimmed();
  /** The abbreviated name of the customer. */
  public String getNmeShortName();

  /** Trimmed version of {@link #getNmeShortName()} */
  public String getNmeShortName_trimmed();
  /** Timestamp from when this row was created. */
  public Date getTspRecCreate();
  /** Timestamp from when this row was last updated. */
  public Date getTspRecUpdate();
  /** */
  public String getTxtVatNumber();

  /** Trimmed version of {@link #getTxtVatNumber()} */
  public String getTxtVatNumber_trimmed();
  /** User ID that created this row. This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID. */
  public String getUidRecCreate();

  /** Trimmed version of {@link #getUidRecCreate()} */
  public String getUidRecCreate_trimmed();
  /**
   * User ID that last updated this row. This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID.
   */
  public String getUidRecUpdate();

  /** Trimmed version of {@link #getUidRecUpdate()} */
  public String getUidRecUpdate_trimmed();
  /** The external customer ID. */
  public String getXidCustId();

  /** Trimmed version of {@link #getXidCustId()} */
  public String getXidCustId_trimmed();
  /** */
  public LiqCodeBank getLiqCodeBank();
  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public LiqCustomer getLiqCustomerImmParentParent();
  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public LiqCustomer getLiqCustomerUltParentParent();
  /** The branch table. */
  public List<LiqBranch> getLiqBranchs();
  /** The deal administrator table. Management of money transfer between lenders and borrowers. */
  public List<LiqDealAdmin> getLiqDealAdmins();
  /** The deal borrower table. The borrowers that are associated with a deal. */
  public List<LiqDealBorrower> getLiqDealBorrowers();
  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public List<LiqCustomer> getLiqImmParentCustomers();
  /** The outstanding table. Outstanding amounts and dates for loans and letters of credit. */
  public List<LiqOutstanding> getLiqOutstandings();
  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public List<LiqCustomer> getLiqUltParentCustomers();
}
