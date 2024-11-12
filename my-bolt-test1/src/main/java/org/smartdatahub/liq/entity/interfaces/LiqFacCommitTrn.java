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
 * The facility commitment transaction table. Transactions which affect a lender's position in a
 * facility.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public interface LiqFacCommitTrn extends DomainObject {

  public static final String TABLE_ID = "FTR";

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>ridCommitTrn</code>
   */
  public String getOriginId();

  /** The borrower&apos;s requested global amount of the commitment transaction. */
  public BigDecimal getAmtCommitment();
  /** The unavailable amount of the commitment transaction. */
  public BigDecimal getAmtUnavail();
  /** The code for the state of the circle. */
  public String getCdeCircState();

  /** Trimmed version of {@link #getCdeCircState()} */
  public String getCdeCircState_trimmed();
  /** The code for the state of the contra circle. */
  public String getCdeContraSt();

  /** Trimmed version of {@link #getCdeContraSt()} */
  public String getCdeContraSt_trimmed();
  /** The code for the investment type. */
  public String getCdeInvType();

  /** Trimmed version of {@link #getCdeInvType()} */
  public String getCdeInvType_trimmed();
  /** code of object linked */
  public String getCdeLinkType();

  /** Trimmed version of {@link #getCdeLinkType()} */
  public String getCdeLinkType_trimmed();
  /** The code for the object state category. */
  public String getCdeObStCtg();

  /** Trimmed version of {@link #getCdeObStCtg()} */
  public String getCdeObStCtg_trimmed();
  /** The code for the object state. */
  public String getCdeObjState();

  /** Trimmed version of {@link #getCdeObjState()} */
  public String getCdeObjState_trimmed();
  /** The code for the buyer&apos;s risk book. */
  public String getCdeRskBkByr();

  /** Trimmed version of {@link #getCdeRskBkByr()} */
  public String getCdeRskBkByr_trimmed();
  /** The code for the seller&apos;s risk book. */
  public String getCdeRskBkSlr();

  /** Trimmed version of {@link #getCdeRskBkSlr()} */
  public String getCdeRskBkSlr_trimmed();
  /** The code for the transaction type. */
  public String getCdeTransType();

  /** Trimmed version of {@link #getCdeTransType()} */
  public String getCdeTransType_trimmed();
  /** The code for the type of facility commitment transaction. */
  public String getCdeType();

  /** Trimmed version of {@link #getCdeType()} */
  public String getCdeType_trimmed();
  /** The date the circle was closed. */
  public Date getDteCircClose();
  /** The effective date of the facility commitment transaction. */
  public Date getDteEffective();
  /** The release date of the facility commitment transaction. */
  public Date getDteRelease();
  /** The Record ID (RID) for the facility investment. */
  public String getFidFacInvId();

  /** Trimmed version of {@link #getFidFacInvId()} */
  public String getFidFacInvId_trimmed();
  /** The Record ID (RID) for the investment. */
  public String getIidInvId();

  /** Trimmed version of {@link #getIidInvId()} */
  public String getIidInvId_trimmed();
  /**
   * Indicates whether or not the circle which created this commitment transaction affected trading
   * lines.
   */
  public Boolean getIndAffTrdLn();
  /**
   * Indicates whether or not the transaction should be automatically released on the effective
   * date.
   */
  public Boolean getIndAutoRelse();
  /** Indicates whether the associated circle is a marketing circle. */
  public Boolean getIndMarketing();
  /** Indicates whether the associated circle is linked to a marketing circle. */
  public Boolean getIndMktgLink();
  /** The buy/sell price of the facility investment. */
  public BigDecimal getPctPrice();
  /** The interest skim of the facility investment. */
  public BigDecimal getPctSkimInt();
  /** The Record ID (RID) for the deal associated with the facility commitment transaction. */
  public String getPidDeal();

  /** Trimmed version of {@link #getPidDeal()} */
  public String getPidDeal_trimmed();
  /** The Record ID (RID) for the facility associated with the transaction. */
  public String getPidFacility();

  /** Trimmed version of {@link #getPidFacility()} */
  public String getPidFacility_trimmed();
  /** The Record ID (RID) for the commitment transaction. */
  public String getRidCommitTrn();

  /** Trimmed version of {@link #getRidCommitTrn()} */
  public String getRidCommitTrn_trimmed();
  /** the outgoing portfolio allocation RID in a Portfolio Transfer Transaction */
  public String getRidFrom();

  /** Trimmed version of {@link #getRidFrom()} */
  public String getRidFrom_trimmed();
  /** The Record ID (RID) for the group transaction. */
  public String getRidGroupTrn();

  /** Trimmed version of {@link #getRidGroupTrn()} */
  public String getRidGroupTrn_trimmed();
  /** unique id of linked object */
  public String getRidLink();

  /** Trimmed version of {@link #getRidLink()} */
  public String getRidLink_trimmed();
  /** The Record ID (RID) for the pool transaction. */
  public String getRidPool();

  /** Trimmed version of {@link #getRidPool()} */
  public String getRidPool_trimmed();
  /** the incoming portfolio allocation RID in a Portfolio Transfer Transaction */
  public String getRidTo();

  /** Trimmed version of {@link #getRidTo()} */
  public String getRidTo_trimmed();
  /** Timestamp from when this row was created. */
  public Date getTspRecCreate();
  /** Timestamp from when this row was last updated. */
  public Date getTspRecUpdate();
  /** The amendment number. */
  public String getTxtAmendNum();

  /** Trimmed version of {@link #getTxtAmendNum()} */
  public String getTxtAmendNum_trimmed();
  /** The User ID (UID) of the processor. */
  public String getUidProcessor();

  /** Trimmed version of {@link #getUidProcessor()} */
  public String getUidProcessor_trimmed();
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
  /** The outstanding transaction table. Transactions directly related to outstandings. */
  public LiqOstTran getLiqOstTran();
  /** The outstanding transaction table. Transactions directly related to outstandings. */
  public List<LiqOstTran> getLiqOstTransCommitTrn();
}
