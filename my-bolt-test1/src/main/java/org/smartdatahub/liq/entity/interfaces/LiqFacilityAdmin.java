/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import java.util.Date;

import org.smartdatahub.liq.entity.utils.DomainObject;

/**
 * The facility administrator table. Facility administrators handle cashflows associated with
 * facilities and their loans.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public interface LiqFacilityAdmin extends DomainObject {

  public static final String TABLE_ID = "FAD";

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>ridAdmin</code>
   */
  public String getOriginId();

  /**
   * &quot;Indicates whether or not the cash flows through the main branch. (&quot;&quot;Main
   * Branch&quot;&quot; is defined as the branch noted in the Main Servicing Group).&quot;
   */
  public Boolean getIndCashflow();
  /** The Record ID (RID) for the facility. */
  public String getPidFacility();

  /** Trimmed version of {@link #getPidFacility()} */
  public String getPidFacility_trimmed();
  /** The Record ID (RID) of the Host Bank Lender who is the owner of the Main Servicing Group. */
  public String getRidAdmin();

  /** Trimmed version of {@link #getRidAdmin()} */
  public String getRidAdmin_trimmed();
  /** The Record ID (RID) for the Main Servicing Group. */
  public String getRidFaxGroup();

  /** Trimmed version of {@link #getRidFaxGroup()} */
  public String getRidFaxGroup_trimmed();
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
  /** The facility table. A credit arrangement established by the bank for the client. */
  public LiqFacility getLiqFacility();
}
