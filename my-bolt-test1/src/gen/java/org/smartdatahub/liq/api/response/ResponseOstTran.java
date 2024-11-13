/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.api.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The outstanding transaction table. Transactions directly related to outstandings.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@ApiModel(
    value = "OstTran",
    description =
        "The outstanding transaction table.  Transactions directly related to outstandings.")
public class ResponseOstTran
    implements Identifiable<String>, Serializable, EqualsSimpleFieldSupport<ResponseOstTran> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "OTR";

  @Id
  @ApiModelProperty(
      value = "The Record ID (RID) that uniquely identifies this outstanding transaction.")
  private /*4*/ String ridOstTran;

  @ApiModelProperty(value = "The actual amount of the outstanding transaction.")
  private /*4*/ BigDecimal amtActual;

  @ApiModelProperty(value = "The frozen funding amount.")
  private /*4*/ BigDecimal amtFundFrozn;

  @ApiModelProperty(value = "The global amount of the outstanding at the time of the transaction.")
  private /*4*/ BigDecimal amtNewRelse;

  private /*4*/ BigDecimal amtPremium;

  @ApiModelProperty(value = "The requested amount of the outstanding transaction.")
  private /*4*/ BigDecimal amtRequested;

  @ApiModelProperty(value = "the schedule balance amount for accruals")
  private /*4*/ BigDecimal amtSchedBal;

  @ApiModelProperty(value = "The code for the accrual frequency.")
  private /*4*/ String cdeAccrFreq;

  @ApiModelProperty(value = "The code for the group type.")
  private /*4*/ String cdeGroupType;

  @ApiModelProperty(value = "The loan purpose.")
  private /*4*/ String cdeLoanPurp;

  @ApiModelProperty(value = "The code for the object state category.")
  private /*4*/ String cdeObStCtg;

  @ApiModelProperty(value = "The code for the object state.")
  private /*4*/ String cdeObjState;

  @ApiModelProperty(value = "The processing area.")
  private /*4*/ String cdeProcArea;

  @ApiModelProperty(value = "The repricing frequency.")
  private /*4*/ String cdeReprFreq;

  @ApiModelProperty(value = "The risk type.")
  private /*4*/ String cdeRiskType;

  private /*4*/ String cdeTrnsPurp;

  @ApiModelProperty(value = "The type of transaction.")
  private /*4*/ String cdeType;

  @ApiModelProperty(value = "The effective date of the outstanding transaction.")
  private /*4*/ Date dteEffective;

  @ApiModelProperty(value = "The release date of the outstanding transaction.")
  private /*4*/ Date dteRelease;

  @ApiModelProperty(value = "The repricing date of the outstanding transaction.")
  private /*4*/ Date dteRepricing;

  @ApiModelProperty(
      value =
          "&quot;This indicator is set to true when upon release of this OutstandingTransaction, a FacilityCommitmentDecrease will be created and released as well.  It is nullable, because the option is valid only on certain OutstandingTransactions.&quot;")
  private /*4*/ Boolean indAutoRduce;

  @ApiModelProperty(
      value = "Indicates whether or not the outstanding transaction is subject to auto-release.")
  private /*4*/ Boolean indAutoRelse;

  @ApiModelProperty(
      value =
          "Indicates whether this transaction is a creating transaction or an amending transaction.")
  private /*4*/ Boolean indCreateTrn;

  @ApiModelProperty(
      value = "Indicates whether or not the outstanding will be initially on Non-Accrual.")
  private /*4*/ Boolean indNonAccr;

  @ApiModelProperty(value = "Indicates whether or not payment from borrower.")
  private /*4*/ Boolean indPmtFrBor;

  @ApiModelProperty(value = "The Record ID (RID) for the sublimit.")
  private /*4*/ String pidSublimit;

  @ApiModelProperty(value = "The Record ID (RID) for the commitment transaction.")
  private /*4*/ String ridCommitTrn;

  @ApiModelProperty(value = "The Record ID (RID) for the group transaction.")
  private /*4*/ String ridGroupTran;

  @ApiModelProperty(value = "The Record ID (RID) for the link transaction.")
  private /*4*/ String ridLinkTrn;

  private /*4*/ String ridOrigOst;

  @ApiModelProperty(value = "The Record ID (RID) for the outstanding.")
  private /*4*/ String ridOutstandng;

  @ApiModelProperty(value = "Timestamp from when this row was created.")
  private /*4*/ Date tspRecCreate;

  @ApiModelProperty(value = "Timestamp from when this row was last updated.")
  private /*4*/ Date tspRecUpdate;

  @ApiModelProperty(value = "The User ID of the processor.")
  private /*4*/ String uidProcessor;

  @ApiModelProperty(
      value =
          "User ID that created this row.  This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID.")
  private /*4*/ String uidRecCreate;

  @ApiModelProperty(
      value =
          "User ID that last updated this row.  This is a foreign key to VLS_USER_PROFILE.UPT_UID_USERID.")
  private /*4*/ String uidRecUpdate;

  private /*4*/ String snapshotId;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - the field <code>ridOstTran</code>
   */
  @Override
  public String getId() {
    return ridOstTran;
  }
  /** The Record ID (RID) that uniquely identifies this outstanding transaction. */
  public String getRidOstTran() {
    return ridOstTran;
  }

  /** Trimmed version of {@link #getRidOstTran()} */
  public String getRidOstTran_trimmed() {
    return (ridOstTran == null) ? null : ridOstTran.trim();
  }

  /** The actual amount of the outstanding transaction. */
  public BigDecimal getAmtActual() {
    return amtActual;
  }

  /** The frozen funding amount. */
  public BigDecimal getAmtFundFrozn() {
    return amtFundFrozn;
  }

  /** The global amount of the outstanding at the time of the transaction. */
  public BigDecimal getAmtNewRelse() {
    return amtNewRelse;
  }

  /** */
  public BigDecimal getAmtPremium() {
    return amtPremium;
  }

  /** The requested amount of the outstanding transaction. */
  public BigDecimal getAmtRequested() {
    return amtRequested;
  }

  /** the schedule balance amount for accruals */
  public BigDecimal getAmtSchedBal() {
    return amtSchedBal;
  }

  /** The code for the accrual frequency. */
  public String getCdeAccrFreq() {
    return cdeAccrFreq;
  }

  /** Trimmed version of {@link #getCdeAccrFreq()} */
  public String getCdeAccrFreq_trimmed() {
    return (cdeAccrFreq == null) ? null : cdeAccrFreq.trim();
  }

  /** The code for the group type. */
  public String getCdeGroupType() {
    return cdeGroupType;
  }

  /** Trimmed version of {@link #getCdeGroupType()} */
  public String getCdeGroupType_trimmed() {
    return (cdeGroupType == null) ? null : cdeGroupType.trim();
  }

  /** The loan purpose. */
  public String getCdeLoanPurp() {
    return cdeLoanPurp;
  }

  /** Trimmed version of {@link #getCdeLoanPurp()} */
  public String getCdeLoanPurp_trimmed() {
    return (cdeLoanPurp == null) ? null : cdeLoanPurp.trim();
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

  /** The processing area. */
  public String getCdeProcArea() {
    return cdeProcArea;
  }

  /** Trimmed version of {@link #getCdeProcArea()} */
  public String getCdeProcArea_trimmed() {
    return (cdeProcArea == null) ? null : cdeProcArea.trim();
  }

  /** The repricing frequency. */
  public String getCdeReprFreq() {
    return cdeReprFreq;
  }

  /** Trimmed version of {@link #getCdeReprFreq()} */
  public String getCdeReprFreq_trimmed() {
    return (cdeReprFreq == null) ? null : cdeReprFreq.trim();
  }

  /** The risk type. */
  public String getCdeRiskType() {
    return cdeRiskType;
  }

  /** Trimmed version of {@link #getCdeRiskType()} */
  public String getCdeRiskType_trimmed() {
    return (cdeRiskType == null) ? null : cdeRiskType.trim();
  }

  /** */
  public String getCdeTrnsPurp() {
    return cdeTrnsPurp;
  }

  /** Trimmed version of {@link #getCdeTrnsPurp()} */
  public String getCdeTrnsPurp_trimmed() {
    return (cdeTrnsPurp == null) ? null : cdeTrnsPurp.trim();
  }

  /** The type of transaction. */
  public String getCdeType() {
    return cdeType;
  }

  /** Trimmed version of {@link #getCdeType()} */
  public String getCdeType_trimmed() {
    return (cdeType == null) ? null : cdeType.trim();
  }

  /** The effective date of the outstanding transaction. */
  public Date getDteEffective() {
    return dteEffective;
  }

  /** The release date of the outstanding transaction. */
  public Date getDteRelease() {
    return dteRelease;
  }

  /** The repricing date of the outstanding transaction. */
  public Date getDteRepricing() {
    return dteRepricing;
  }

  /**
   * &quot;This indicator is set to true when upon release of this OutstandingTransaction, a
   * FacilityCommitmentDecrease will be created and released as well. It is nullable, because the
   * option is valid only on certain OutstandingTransactions.&quot;
   */
  public Boolean getIndAutoRduce() {
    return indAutoRduce;
  }

  /** Indicates whether or not the outstanding transaction is subject to auto-release. */
  public Boolean getIndAutoRelse() {
    return indAutoRelse;
  }

  /** Indicates whether this transaction is a creating transaction or an amending transaction. */
  public Boolean getIndCreateTrn() {
    return indCreateTrn;
  }

  /** Indicates whether or not the outstanding will be initially on Non-Accrual. */
  public Boolean getIndNonAccr() {
    return indNonAccr;
  }

  /** Indicates whether or not payment from borrower. */
  public Boolean getIndPmtFrBor() {
    return indPmtFrBor;
  }

  /** The Record ID (RID) for the sublimit. */
  public String getPidSublimit() {
    return pidSublimit;
  }

  /** Trimmed version of {@link #getPidSublimit()} */
  public String getPidSublimit_trimmed() {
    return (pidSublimit == null) ? null : pidSublimit.trim();
  }

  /** The Record ID (RID) for the commitment transaction. */
  public String getRidCommitTrn() {
    return ridCommitTrn;
  }

  /** Trimmed version of {@link #getRidCommitTrn()} */
  public String getRidCommitTrn_trimmed() {
    return (ridCommitTrn == null) ? null : ridCommitTrn.trim();
  }

  /** The Record ID (RID) for the group transaction. */
  public String getRidGroupTran() {
    return ridGroupTran;
  }

  /** Trimmed version of {@link #getRidGroupTran()} */
  public String getRidGroupTran_trimmed() {
    return (ridGroupTran == null) ? null : ridGroupTran.trim();
  }

  /** The Record ID (RID) for the link transaction. */
  public String getRidLinkTrn() {
    return ridLinkTrn;
  }

  /** Trimmed version of {@link #getRidLinkTrn()} */
  public String getRidLinkTrn_trimmed() {
    return (ridLinkTrn == null) ? null : ridLinkTrn.trim();
  }

  /** */
  public String getRidOrigOst() {
    return ridOrigOst;
  }

  /** Trimmed version of {@link #getRidOrigOst()} */
  public String getRidOrigOst_trimmed() {
    return (ridOrigOst == null) ? null : ridOrigOst.trim();
  }

  /** The Record ID (RID) for the outstanding. */
  public String getRidOutstandng() {
    return ridOutstandng;
  }

  /** Trimmed version of {@link #getRidOutstandng()} */
  public String getRidOutstandng_trimmed() {
    return (ridOutstandng == null) ? null : ridOutstandng.trim();
  }

  /** Timestamp from when this row was created. */
  public Date getTspRecCreate() {
    return tspRecCreate;
  }

  /** Timestamp from when this row was last updated. */
  public Date getTspRecUpdate() {
    return tspRecUpdate;
  }

  /** The User ID of the processor. */
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

  /** */
  public String getSnapshotId() {
    return snapshotId;
  }

  /** Trimmed version of {@link #getSnapshotId()} */
  public String getSnapshotId_trimmed() {
    return (snapshotId == null) ? null : snapshotId.trim();
  }

  // Setter HERE
  /** The Record ID (RID) that uniquely identifies this outstanding transaction. */
  public void setRidOstTran(String ridOstTran) {
    this.ridOstTran = ridOstTran;
  }

  /** The actual amount of the outstanding transaction. */
  public void setAmtActual(BigDecimal amtActual) {
    this.amtActual = amtActual;
  }

  /** The frozen funding amount. */
  public void setAmtFundFrozn(BigDecimal amtFundFrozn) {
    this.amtFundFrozn = amtFundFrozn;
  }

  /** The global amount of the outstanding at the time of the transaction. */
  public void setAmtNewRelse(BigDecimal amtNewRelse) {
    this.amtNewRelse = amtNewRelse;
  }

  /** */
  public void setAmtPremium(BigDecimal amtPremium) {
    this.amtPremium = amtPremium;
  }

  /** The requested amount of the outstanding transaction. */
  public void setAmtRequested(BigDecimal amtRequested) {
    this.amtRequested = amtRequested;
  }

  /** the schedule balance amount for accruals */
  public void setAmtSchedBal(BigDecimal amtSchedBal) {
    this.amtSchedBal = amtSchedBal;
  }

  /** The code for the accrual frequency. */
  public void setCdeAccrFreq(String cdeAccrFreq) {
    this.cdeAccrFreq = cdeAccrFreq;
  }

  /** The code for the group type. */
  public void setCdeGroupType(String cdeGroupType) {
    this.cdeGroupType = cdeGroupType;
  }

  /** The loan purpose. */
  public void setCdeLoanPurp(String cdeLoanPurp) {
    this.cdeLoanPurp = cdeLoanPurp;
  }

  /** The code for the object state category. */
  public void setCdeObStCtg(String cdeObStCtg) {
    this.cdeObStCtg = cdeObStCtg;
  }

  /** The code for the object state. */
  public void setCdeObjState(String cdeObjState) {
    this.cdeObjState = cdeObjState;
  }

  /** The processing area. */
  public void setCdeProcArea(String cdeProcArea) {
    this.cdeProcArea = cdeProcArea;
  }

  /** The repricing frequency. */
  public void setCdeReprFreq(String cdeReprFreq) {
    this.cdeReprFreq = cdeReprFreq;
  }

  /** The risk type. */
  public void setCdeRiskType(String cdeRiskType) {
    this.cdeRiskType = cdeRiskType;
  }

  /** */
  public void setCdeTrnsPurp(String cdeTrnsPurp) {
    this.cdeTrnsPurp = cdeTrnsPurp;
  }

  /** The type of transaction. */
  public void setCdeType(String cdeType) {
    this.cdeType = cdeType;
  }

  /** The effective date of the outstanding transaction. */
  public void setDteEffective(Date dteEffective) {
    this.dteEffective = dteEffective;
  }

  /** The release date of the outstanding transaction. */
  public void setDteRelease(Date dteRelease) {
    this.dteRelease = dteRelease;
  }

  /** The repricing date of the outstanding transaction. */
  public void setDteRepricing(Date dteRepricing) {
    this.dteRepricing = dteRepricing;
  }

  /**
   * &quot;This indicator is set to true when upon release of this OutstandingTransaction, a
   * FacilityCommitmentDecrease will be created and released as well. It is nullable, because the
   * option is valid only on certain OutstandingTransactions.&quot;
   */
  public void setIndAutoRduce(Boolean indAutoRduce) {
    this.indAutoRduce = indAutoRduce;
  }

  /** Indicates whether or not the outstanding transaction is subject to auto-release. */
  public void setIndAutoRelse(Boolean indAutoRelse) {
    this.indAutoRelse = indAutoRelse;
  }

  /** Indicates whether this transaction is a creating transaction or an amending transaction. */
  public void setIndCreateTrn(Boolean indCreateTrn) {
    this.indCreateTrn = indCreateTrn;
  }

  /** Indicates whether or not the outstanding will be initially on Non-Accrual. */
  public void setIndNonAccr(Boolean indNonAccr) {
    this.indNonAccr = indNonAccr;
  }

  /** Indicates whether or not payment from borrower. */
  public void setIndPmtFrBor(Boolean indPmtFrBor) {
    this.indPmtFrBor = indPmtFrBor;
  }

  /** The Record ID (RID) for the sublimit. */
  public void setPidSublimit(String pidSublimit) {
    this.pidSublimit = pidSublimit;
  }

  /** The Record ID (RID) for the commitment transaction. */
  public void setRidCommitTrn(String ridCommitTrn) {
    this.ridCommitTrn = ridCommitTrn;
  }

  /** The Record ID (RID) for the group transaction. */
  public void setRidGroupTran(String ridGroupTran) {
    this.ridGroupTran = ridGroupTran;
  }

  /** The Record ID (RID) for the link transaction. */
  public void setRidLinkTrn(String ridLinkTrn) {
    this.ridLinkTrn = ridLinkTrn;
  }

  /** */
  public void setRidOrigOst(String ridOrigOst) {
    this.ridOrigOst = ridOrigOst;
  }

  /** The Record ID (RID) for the outstanding. */
  public void setRidOutstandng(String ridOutstandng) {
    this.ridOutstandng = ridOutstandng;
  }

  /** Timestamp from when this row was created. */
  public void setTspRecCreate(Date tspRecCreate) {
    this.tspRecCreate = tspRecCreate;
  }

  /** Timestamp from when this row was last updated. */
  public void setTspRecUpdate(Date tspRecUpdate) {
    this.tspRecUpdate = tspRecUpdate;
  }

  /** The User ID of the processor. */
  public void setUidProcessor(String uidProcessor) {
    this.uidProcessor = uidProcessor;
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

  /** */
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(ridOstTran);
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
    ResponseOstTran other = (ResponseOstTran) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.ridOstTran, other.ridOstTran);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(ResponseOstTran other) {
    CompareHelper helper = new CompareHelper();
    helper.append("ridOstTran", this.ridOstTran, other.ridOstTran);
    helper.append("amtActual", this.amtActual, other.amtActual);
    helper.append("amtFundFrozn", this.amtFundFrozn, other.amtFundFrozn);
    helper.append("amtNewRelse", this.amtNewRelse, other.amtNewRelse);
    helper.append("amtPremium", this.amtPremium, other.amtPremium);
    helper.append("amtRequested", this.amtRequested, other.amtRequested);
    helper.append("amtSchedBal", this.amtSchedBal, other.amtSchedBal);
    helper.append("cdeAccrFreq", this.cdeAccrFreq, other.cdeAccrFreq);
    helper.append("cdeGroupType", this.cdeGroupType, other.cdeGroupType);
    helper.append("cdeLoanPurp", this.cdeLoanPurp, other.cdeLoanPurp);
    helper.append("cdeObStCtg", this.cdeObStCtg, other.cdeObStCtg);
    helper.append("cdeObjState", this.cdeObjState, other.cdeObjState);
    helper.append("cdeProcArea", this.cdeProcArea, other.cdeProcArea);
    helper.append("cdeReprFreq", this.cdeReprFreq, other.cdeReprFreq);
    helper.append("cdeRiskType", this.cdeRiskType, other.cdeRiskType);
    helper.append("cdeTrnsPurp", this.cdeTrnsPurp, other.cdeTrnsPurp);
    helper.append("cdeType", this.cdeType, other.cdeType);
    helper.append("dteEffective", this.dteEffective, other.dteEffective);
    helper.append("dteRelease", this.dteRelease, other.dteRelease);
    helper.append("dteRepricing", this.dteRepricing, other.dteRepricing);
    helper.append("indAutoRduce", this.indAutoRduce, other.indAutoRduce);
    helper.append("indAutoRelse", this.indAutoRelse, other.indAutoRelse);
    helper.append("indCreateTrn", this.indCreateTrn, other.indCreateTrn);
    helper.append("indNonAccr", this.indNonAccr, other.indNonAccr);
    helper.append("indPmtFrBor", this.indPmtFrBor, other.indPmtFrBor);
    helper.append("pidSublimit", this.pidSublimit, other.pidSublimit);
    helper.append("ridCommitTrn", this.ridCommitTrn, other.ridCommitTrn);
    helper.append("ridGroupTran", this.ridGroupTran, other.ridGroupTran);
    helper.append("ridLinkTrn", this.ridLinkTrn, other.ridLinkTrn);
    helper.append("ridOrigOst", this.ridOrigOst, other.ridOrigOst);
    helper.append("ridOutstandng", this.ridOutstandng, other.ridOutstandng);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidProcessor", this.uidProcessor, other.uidProcessor);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
