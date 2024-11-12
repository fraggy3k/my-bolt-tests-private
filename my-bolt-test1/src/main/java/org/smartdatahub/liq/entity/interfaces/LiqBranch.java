/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import java.util.Date;
import java.util.List;

import org.smartdatahub.liq.entity.utils.DomainObject;

/**
 * The branch table.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public interface LiqBranch extends DomainObject {

  public static final String TABLE_ID = "BRN";

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>cdeBranch</code>
   */
  public String getOriginId();

  /** The code for the parent bank of the branch. */
  public String getCdeBank();

  /** Trimmed version of {@link #getCdeBank()} */
  public String getCdeBank_trimmed();
  /** The code that uniquely identifies this bank branch. */
  public String getCdeBranch();

  /** Trimmed version of {@link #getCdeBranch()} */
  public String getCdeBranch_trimmed();
  /** The code for the country of the branch. */
  public String getCdeCountry();

  /** Trimmed version of {@link #getCdeCountry()} */
  public String getCdeCountry_trimmed();
  /** The code describing the functional currency of the branch&apos;s home office. */
  public String getCdeFunctCcy();

  /** Trimmed version of {@link #getCdeFunctCcy()} */
  public String getCdeFunctCcy_trimmed();
  /** The code for the General Ledger of the branch. */
  public String getCdeGl();

  /** Trimmed version of {@link #getCdeGl()} */
  public String getCdeGl_trimmed();
  /** The code describing the local currency (the currency of a local branch). */
  public String getCdeLocalCcy();

  /** Trimmed version of {@link #getCdeLocalCcy()} */
  public String getCdeLocalCcy_trimmed();
  /** The code for the time region of the branch. */
  public String getCdeTmeRegion();

  /** Trimmed version of {@link #getCdeTmeRegion()} */
  public String getCdeTmeRegion_trimmed();
  /** The customer ID associated with this branch. */
  public String getCidCustId();

  /** Trimmed version of {@link #getCidCustId()} */
  public String getCidCustId_trimmed();
  /** User entered description of the branch. */
  public String getDscBranch();

  /** Trimmed version of {@link #getDscBranch()} */
  public String getDscBranch_trimmed();
  /** SDH: Indicator weather branch (or central service unit) is active. */
  public Boolean getIndActive();
  /** Indicator which specifies wether branch is a central branch (or central service unit). */
  public Boolean getIndCentralSc();
  /** Indicator which specifies wether match funded cost of funds accounting is enabled. */
  public Boolean getIndMfcofAcct();
  /** Provides a default value for trans that have a borrower net indicator. */
  public Boolean getIndNetBorr();
  /** Indicator which determines if cashflow should be netted or not. */
  public Boolean getIndNetCashfl();
  /** Two digits (01-12) representing the month that the fiscal year ends. */
  public Integer getNumFiscMm();
  /** Timestamp from when this row was created. */
  public Date getTspRecCreate();
  /** Timestamp from when this row was last updated. */
  public Date getTspRecUpdate();
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
  /** */
  public LiqCodeBank getLiqCodeBank();
  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public LiqCustomer getLiqCustomer();
  /** */
  public LiqTimeRegion getLiqTimeRegion();
  /**
   * The deal table. A record of a borrowing agreement between the lender and the borrower which may
   * encompass one or more credit facilities.
   */
  public List<LiqDeal> getLiqDeals();
  /** The facility table. A credit arrangement established by the bank for the client. */
  public List<LiqFacility> getLiqFacilities();
}
