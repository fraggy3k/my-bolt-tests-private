/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import java.math.BigDecimal;
import java.util.Date;

import org.smartdatahub.liq.entity.utils.DomainObject;

/**
 * The facility host bank agregation. Finstra version was almost empty -> filled by best knowledge
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public interface LiqFacHostAgr extends DomainObject {

  public static final String TABLE_ID = "FHA";

  /**
   * Special Getter for the origin ID
   *
   * @returns - a IdClassFacHostAgr object
   */
  public IdClassFacHostAgr getOriginId();

  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtClosing();
  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtDcClose();
  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtDcGross();
  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtDcGrsAdj();
  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtDcNet();
  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtDcNetAdj();
  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtDcPreclos();
  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtGross();
  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtGrossAdj();
  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtNet();
  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtNetAdj();
  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtPreclose();
  /** The Record ID (RID) for the deal. */
  public String getPidDeal();

  /** Trimmed version of {@link #getPidDeal()} */
  public String getPidDeal_trimmed();
  /** The Record ID (RID) for the facility. */
  public String getPidFacility();

  /** Trimmed version of {@link #getPidFacility()} */
  public String getPidFacility_trimmed();
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
   * The deal table. A record of a borrowing agreement between the lender and the borrower which may
   * encompass one or more credit facilities.
   */
  public LiqDeal getLiqDeal();
  /** The facility table. A credit arrangement established by the bank for the client. */
  public LiqFacility getLiqFacility();
}
