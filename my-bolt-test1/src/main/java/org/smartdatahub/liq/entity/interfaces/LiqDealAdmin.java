/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import java.util.Date;

import org.smartdatahub.liq.entity.utils.DomainObject;

/**
 * The deal administrator table. Management of money transfer between lenders and borrowers.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public interface LiqDealAdmin extends DomainObject {

  public static final String TABLE_ID = "DAD";

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>pidDeal</code>
   */
  public String getOriginId();

  /** The Record ID (RID) for the customer chosen as the agent for the deal. */
  public String getCidCustId();

  /** Trimmed version of {@link #getCidCustId()} */
  public String getCidCustId_trimmed();
  /** The Record ID (RID) for the deal. */
  public String getPidDeal();

  /** Trimmed version of {@link #getPidDeal()} */
  public String getPidDeal_trimmed();
  /** The Record ID (RID) for the agent&apos;s servicing group. */
  public String getRidFaxGroup();

  /** Trimmed version of {@link #getRidFaxGroup()} */
  public String getRidFaxGroup_trimmed();
  /** The Record ID (RID) for the agent&apos;s location. */
  public String getRidLocation();

  /** Trimmed version of {@link #getRidLocation()} */
  public String getRidLocation_trimmed();
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
  /**
   * The customer table. Enterprises which conducts or may be interested in conducting commercial
   * lending business with the bank is considered a customer.
   */
  public LiqCustomer getLiqCustomer();
  /**
   * The deal table. A record of a borrowing agreement between the lender and the borrower which may
   * encompass one or more credit facilities.
   */
  public LiqDeal getLiqDeal();
}
