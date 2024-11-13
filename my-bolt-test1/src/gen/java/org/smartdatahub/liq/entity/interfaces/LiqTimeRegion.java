/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import java.util.Date;
import java.util.List;

import org.smartdatahub.liq.entity.utils.DomainObject;

/** @author Julian Egyptien (smartdatahub.org) */
public interface LiqTimeRegion extends DomainObject {

  public static final String TABLE_ID = "TRG";

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>cdeCode</code>
   */
  public String getOriginId();

  /** */
  public String getCdeCode();

  /** Trimmed version of {@link #getCdeCode()} */
  public String getCdeCode_trimmed();
  /** */
  public String getDscCode();

  /** Trimmed version of {@link #getDscCode()} */
  public String getDscCode_trimmed();
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
  /** The branch table. */
  public List<LiqBranch> getLiqBranchs();
  /** Details of the user environment. */
  public List<LiqEnvironment> getLiqEnvironments();
}
