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
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqFacCommitTrn;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqOstTran;
import org.smartdatahub.liq.entity.utils.BooleanToStringConverter;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * The facility commitment transaction table. Transactions which affect a lender's position in a
 * facility.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@Entity
@Table(name = "VLS_FAC_COMMIT_TRN")
public class VlsFacCommitTrn
    implements LiqFacCommitTrn,
        Identifiable<String>,
        Serializable,
        EqualsSimpleFieldSupport<VlsFacCommitTrn> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "FTR";

  @Column(name = "FTR_RID_COMMIT_TRN", nullable = false, length = 8)
  @Id
  private /*4*/ String ridCommitTrn;

  @Column(name = "FTR_AMT_COMMITMENT", nullable = false, length = 28, scale = 3)
  private /*4*/ BigDecimal amtCommitment;

  @Column(name = "FTR_AMT_UNAVAIL", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtUnavail;

  @Column(name = "FTR_CDE_CIRC_STATE", nullable = true, length = 5)
  private /*4*/ String cdeCircState;

  @Column(name = "FTR_CDE_CONTRA_ST", nullable = true, length = 5)
  private /*4*/ String cdeContraSt;

  @Column(name = "FTR_CDE_INV_TYPE", nullable = true, length = 5)
  private /*4*/ String cdeInvType;

  @Column(name = "FTR_CDE_LINK_TYPE", nullable = true, length = 5)
  private /*4*/ String cdeLinkType;

  @Column(name = "FTR_CDE_OB_ST_CTG", nullable = false, length = 5)
  private /*4*/ String cdeObStCtg;

  @Column(name = "FTR_CDE_OBJ_STATE", nullable = false, length = 5)
  private /*4*/ String cdeObjState;

  @Column(name = "FTR_CDE_RSK_BK_BYR", nullable = true, length = 5)
  private /*4*/ String cdeRskBkByr;

  @Column(name = "FTR_CDE_RSK_BK_SLR", nullable = true, length = 5)
  private /*4*/ String cdeRskBkSlr;

  @Column(name = "FTR_CDE_TRANS_TYPE", nullable = true, length = 5)
  private /*4*/ String cdeTransType;

  @Column(name = "FTR_CDE_TYPE", nullable = false, length = 5)
  private /*4*/ String cdeType;

  @Column(name = "FTR_DTE_CIRC_CLOSE", nullable = true)
  private /*4*/ Date dteCircClose;

  @Column(name = "FTR_DTE_EFFECTIVE", nullable = true)
  private /*4*/ Date dteEffective;

  @Column(name = "FTR_DTE_RELEASE", nullable = true)
  private /*4*/ Date dteRelease;

  @Column(name = "FTR_FID_FAC_INV_ID", nullable = true, length = 8)
  private /*4*/ String fidFacInvId;

  @Column(name = "FTR_IID_INV_ID", nullable = true, length = 8)
  private /*4*/ String iidInvId;

  @Column(name = "FTR_IND_AFF_TRD_LN", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indAffTrdLn;

  @Column(name = "FTR_IND_AUTO_RELSE", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indAutoRelse;

  @Column(name = "FTR_IND_MARKETING", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indMarketing;

  @Column(name = "FTR_IND_MKTG_LINK", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indMktgLink;

  @Column(name = "FTR_PCT_PRICE", nullable = true, length = 15, scale = 14)
  private /*4*/ BigDecimal pctPrice;

  @Column(name = "FTR_PCT_SKIM_INT", nullable = true, length = 15, scale = 14)
  private /*4*/ BigDecimal pctSkimInt;

  @Column(name = "FTR_PID_DEAL", nullable = false, length = 8)
  private /*4*/ String pidDeal;

  @Column(name = "FTR_PID_FACILITY", nullable = false, length = 8)
  private /*4*/ String pidFacility;

  @Column(name = "FTR_RID_FROM", nullable = true, length = 8)
  private /*4*/ String ridFrom;

  @Column(name = "FTR_RID_GROUP_TRN", nullable = true, length = 8)
  private /*4*/ String ridGroupTrn;

  @Column(name = "FTR_RID_LINK", nullable = true, length = 8)
  private /*4*/ String ridLink;

  @Column(name = "FTR_RID_POOL", nullable = true, length = 8)
  private /*4*/ String ridPool;

  @Column(name = "FTR_RID_TO", nullable = true, length = 8)
  private /*4*/ String ridTo;

  @Column(name = "FTR_TSP_REC_CREATE", nullable = false)
  private /*4*/ Date tspRecCreate;

  @Column(name = "FTR_TSP_REC_UPDATE", nullable = false)
  private /*4*/ Date tspRecUpdate;

  @Column(name = "FTR_TXT_AMEND_NUM", nullable = true, length = 5)
  private /*4*/ String txtAmendNum;

  @Column(name = "FTR_UID_PROCESSOR", nullable = false, length = 8)
  private /*4*/ String uidProcessor;

  @Column(name = "FTR_UID_REC_CREATE", nullable = false, length = 8)
  private /*4*/ String uidRecCreate;

  @Column(name = "FTR_UID_REC_UPDATE", nullable = false, length = 8)
  private /*4*/ String uidRecUpdate;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "FTR_PID_DEAL", insertable = false, updatable = false)
  private /*3*/ VlsDeal liqDeal;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "FTR_PID_FACILITY", insertable = false, updatable = false)
  private /*3*/ VlsFacility liqFacility;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "FTR_RID_GROUP_TRN", insertable = false, updatable = false)
  private /*3*/ VlsOstTran liqOstTran;

  @OneToMany(
      mappedBy = "liqFacCommitTrnCommitTrn",
      fetch = FetchType.LAZY,
      targetEntity = VlsOstTran.class)
  private List</*1*/ LiqOstTran> liqOstTransCommitTrn;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - the field <code>ridCommitTrn</code>
   */
  @Override
  public String getId() {
    return ridCommitTrn;
  }
  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>ridCommitTrn</code>
   */
  @Override
  public String getOriginId() {
    return ridCommitTrn;
  }
  /** The Record ID (RID) for the commitment transaction. */
  public String getRidCommitTrn() {
    return ridCommitTrn;
  }

  /** Trimmed version of {@link #getRidCommitTrn()} */
  public String getRidCommitTrn_trimmed() {
    return (ridCommitTrn == null) ? null : ridCommitTrn.trim();
  }

  /** The borrower&apos;s requested global amount of the commitment transaction. */
  public BigDecimal getAmtCommitment() {
    return amtCommitment;
  }

  /** The unavailable amount of the commitment transaction. */
  public BigDecimal getAmtUnavail() {
    return amtUnavail;
  }

  /** The code for the state of the circle. */
  public String getCdeCircState() {
    return cdeCircState;
  }

  /** Trimmed version of {@link #getCdeCircState()} */
  public String getCdeCircState_trimmed() {
    return (cdeCircState == null) ? null : cdeCircState.trim();
  }

  /** The code for the state of the contra circle. */
  public String getCdeContraSt() {
    return cdeContraSt;
  }

  /** Trimmed version of {@link #getCdeContraSt()} */
  public String getCdeContraSt_trimmed() {
    return (cdeContraSt == null) ? null : cdeContraSt.trim();
  }

  /** The code for the investment type. */
  public String getCdeInvType() {
    return cdeInvType;
  }

  /** Trimmed version of {@link #getCdeInvType()} */
  public String getCdeInvType_trimmed() {
    return (cdeInvType == null) ? null : cdeInvType.trim();
  }

  /** code of object linked */
  public String getCdeLinkType() {
    return cdeLinkType;
  }

  /** Trimmed version of {@link #getCdeLinkType()} */
  public String getCdeLinkType_trimmed() {
    return (cdeLinkType == null) ? null : cdeLinkType.trim();
  }

  /** The code for the object state category. */
  public String getCdeObStCtg() {
    return cdeObStCtg;
  }

  /** Trimmed version of {@link #getCdeObStCtg()} */
  public String getCdeObStCtg_trimmed() {
    return (cdeObStCtg == null) ? null : cdeObStCtg.trim();
  }

  /** The code for the object state. */
  public String getCdeObjState() {
    return cdeObjState;
  }

  /** Trimmed version of {@link #getCdeObjState()} */
  public String getCdeObjState_trimmed() {
    return (cdeObjState == null) ? null : cdeObjState.trim();
  }

  /** The code for the buyer&apos;s risk book. */
  public String getCdeRskBkByr() {
    return cdeRskBkByr;
  }

  /** Trimmed version of {@link #getCdeRskBkByr()} */
  public String getCdeRskBkByr_trimmed() {
    return (cdeRskBkByr == null) ? null : cdeRskBkByr.trim();
  }

  /** The code for the seller&apos;s risk book. */
  public String getCdeRskBkSlr() {
    return cdeRskBkSlr;
  }

  /** Trimmed version of {@link #getCdeRskBkSlr()} */
  public String getCdeRskBkSlr_trimmed() {
    return (cdeRskBkSlr == null) ? null : cdeRskBkSlr.trim();
  }

  /** The code for the transaction type. */
  public String getCdeTransType() {
    return cdeTransType;
  }

  /** Trimmed version of {@link #getCdeTransType()} */
  public String getCdeTransType_trimmed() {
    return (cdeTransType == null) ? null : cdeTransType.trim();
  }

  /** The code for the type of facility commitment transaction. */
  public String getCdeType() {
    return cdeType;
  }

  /** Trimmed version of {@link #getCdeType()} */
  public String getCdeType_trimmed() {
    return (cdeType == null) ? null : cdeType.trim();
  }

  /** The date the circle was closed. */
  public Date getDteCircClose() {
    return dteCircClose;
  }

  /** The effective date of the facility commitment transaction. */
  public Date getDteEffective() {
    return dteEffective;
  }

  /** The release date of the facility commitment transaction. */
  public Date getDteRelease() {
    return dteRelease;
  }

  /** The Record ID (RID) for the facility investment. */
  public String getFidFacInvId() {
    return fidFacInvId;
  }

  /** Trimmed version of {@link #getFidFacInvId()} */
  public String getFidFacInvId_trimmed() {
    return (fidFacInvId == null) ? null : fidFacInvId.trim();
  }

  /** The Record ID (RID) for the investment. */
  public String getIidInvId() {
    return iidInvId;
  }

  /** Trimmed version of {@link #getIidInvId()} */
  public String getIidInvId_trimmed() {
    return (iidInvId == null) ? null : iidInvId.trim();
  }

  /**
   * Indicates whether or not the circle which created this commitment transaction affected trading
   * lines.
   */
  public Boolean getIndAffTrdLn() {
    return indAffTrdLn;
  }

  /**
   * Indicates whether or not the transaction should be automatically released on the effective
   * date.
   */
  public Boolean getIndAutoRelse() {
    return indAutoRelse;
  }

  /** Indicates whether the associated circle is a marketing circle. */
  public Boolean getIndMarketing() {
    return indMarketing;
  }

  /** Indicates whether the associated circle is linked to a marketing circle. */
  public Boolean getIndMktgLink() {
    return indMktgLink;
  }

  /** The buy/sell price of the facility investment. */
  public BigDecimal getPctPrice() {
    return pctPrice;
  }

  /** The interest skim of the facility investment. */
  public BigDecimal getPctSkimInt() {
    return pctSkimInt;
  }

  /** The Record ID (RID) for the deal associated with the facility commitment transaction. */
  public String getPidDeal() {
    return pidDeal;
  }

  /** Trimmed version of {@link #getPidDeal()} */
  public String getPidDeal_trimmed() {
    return (pidDeal == null) ? null : pidDeal.trim();
  }

  /** The Record ID (RID) for the facility associated with the transaction. */
  public String getPidFacility() {
    return pidFacility;
  }

  /** Trimmed version of {@link #getPidFacility()} */
  public String getPidFacility_trimmed() {
    return (pidFacility == null) ? null : pidFacility.trim();
  }

  /** the outgoing portfolio allocation RID in a Portfolio Transfer Transaction */
  public String getRidFrom() {
    return ridFrom;
  }

  /** Trimmed version of {@link #getRidFrom()} */
  public String getRidFrom_trimmed() {
    return (ridFrom == null) ? null : ridFrom.trim();
  }

  /** The Record ID (RID) for the group transaction. */
  public String getRidGroupTrn() {
    return ridGroupTrn;
  }

  /** Trimmed version of {@link #getRidGroupTrn()} */
  public String getRidGroupTrn_trimmed() {
    return (ridGroupTrn == null) ? null : ridGroupTrn.trim();
  }

  /** unique id of linked object */
  public String getRidLink() {
    return ridLink;
  }

  /** Trimmed version of {@link #getRidLink()} */
  public String getRidLink_trimmed() {
    return (ridLink == null) ? null : ridLink.trim();
  }

  /** The Record ID (RID) for the pool transaction. */
  public String getRidPool() {
    return ridPool;
  }

  /** Trimmed version of {@link #getRidPool()} */
  public String getRidPool_trimmed() {
    return (ridPool == null) ? null : ridPool.trim();
  }

  /** the incoming portfolio allocation RID in a Portfolio Transfer Transaction */
  public String getRidTo() {
    return ridTo;
  }

  /** Trimmed version of {@link #getRidTo()} */
  public String getRidTo_trimmed() {
    return (ridTo == null) ? null : ridTo.trim();
  }

  /** Timestamp from when this row was created. */
  public Date getTspRecCreate() {
    return tspRecCreate;
  }

  /** Timestamp from when this row was last updated. */
  public Date getTspRecUpdate() {
    return tspRecUpdate;
  }

  /** The amendment number. */
  public String getTxtAmendNum() {
    return txtAmendNum;
  }

  /** Trimmed version of {@link #getTxtAmendNum()} */
  public String getTxtAmendNum_trimmed() {
    return (txtAmendNum == null) ? null : txtAmendNum.trim();
  }

  /** The User ID (UID) of the processor. */
  public String getUidProcessor() {
    return uidProcessor;
  }

  /** Trimmed version of {@link #getUidProcessor()} */
  public String getUidProcessor_trimmed() {
    return (uidProcessor == null) ? null : uidProcessor.trim();
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

  /**
   * The deal table. A record of a borrowing agreement between the lender and the borrower which may
   * encompass one or more credit facilities.
   */
  public LiqDeal getLiqDeal() {
    return nullIfNotFound(liqDeal);
  }

  /** The facility table. A credit arrangement established by the bank for the client. */
  public LiqFacility getLiqFacility() {
    return nullIfNotFound(liqFacility);
  }

  /** The outstanding transaction table. Transactions directly related to outstandings. */
  public LiqOstTran getLiqOstTran() {
    return nullIfNotFound(liqOstTran);
  }

  /** The outstanding transaction table. Transactions directly related to outstandings. */
  public List<LiqOstTran> getLiqOstTransCommitTrn() {
    return nullIfNotFound(liqOstTransCommitTrn);
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(ridCommitTrn);
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
    VlsFacCommitTrn other = (VlsFacCommitTrn) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.ridCommitTrn, other.ridCommitTrn);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(VlsFacCommitTrn other) {
    CompareHelper helper = new CompareHelper();
    helper.append("ridCommitTrn", this.ridCommitTrn, other.ridCommitTrn);
    helper.append("amtCommitment", this.amtCommitment, other.amtCommitment);
    helper.append("amtUnavail", this.amtUnavail, other.amtUnavail);
    helper.append("cdeCircState", this.cdeCircState, other.cdeCircState);
    helper.append("cdeContraSt", this.cdeContraSt, other.cdeContraSt);
    helper.append("cdeInvType", this.cdeInvType, other.cdeInvType);
    helper.append("cdeLinkType", this.cdeLinkType, other.cdeLinkType);
    helper.append("cdeObStCtg", this.cdeObStCtg, other.cdeObStCtg);
    helper.append("cdeObjState", this.cdeObjState, other.cdeObjState);
    helper.append("cdeRskBkByr", this.cdeRskBkByr, other.cdeRskBkByr);
    helper.append("cdeRskBkSlr", this.cdeRskBkSlr, other.cdeRskBkSlr);
    helper.append("cdeTransType", this.cdeTransType, other.cdeTransType);
    helper.append("cdeType", this.cdeType, other.cdeType);
    helper.append("dteCircClose", this.dteCircClose, other.dteCircClose);
    helper.append("dteEffective", this.dteEffective, other.dteEffective);
    helper.append("dteRelease", this.dteRelease, other.dteRelease);
    helper.append("fidFacInvId", this.fidFacInvId, other.fidFacInvId);
    helper.append("iidInvId", this.iidInvId, other.iidInvId);
    helper.append("indAffTrdLn", this.indAffTrdLn, other.indAffTrdLn);
    helper.append("indAutoRelse", this.indAutoRelse, other.indAutoRelse);
    helper.append("indMarketing", this.indMarketing, other.indMarketing);
    helper.append("indMktgLink", this.indMktgLink, other.indMktgLink);
    helper.append("pctPrice", this.pctPrice, other.pctPrice);
    helper.append("pctSkimInt", this.pctSkimInt, other.pctSkimInt);
    helper.append("pidDeal", this.pidDeal, other.pidDeal);
    helper.append("pidFacility", this.pidFacility, other.pidFacility);
    helper.append("ridFrom", this.ridFrom, other.ridFrom);
    helper.append("ridGroupTrn", this.ridGroupTrn, other.ridGroupTrn);
    helper.append("ridLink", this.ridLink, other.ridLink);
    helper.append("ridPool", this.ridPool, other.ridPool);
    helper.append("ridTo", this.ridTo, other.ridTo);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("txtAmendNum", this.txtAmendNum, other.txtAmendNum);
    helper.append("uidProcessor", this.uidProcessor, other.uidProcessor);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
