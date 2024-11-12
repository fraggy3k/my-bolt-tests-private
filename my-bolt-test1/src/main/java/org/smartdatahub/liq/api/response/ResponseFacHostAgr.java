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
import org.smartdatahub.liq.entity.interfaces.IdClassFacHostAgr;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The facility host bank agregation. Finstra version was almost empty -> filled by best knowledge
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@ApiModel(
    value = "FacHostAgr",
    description =
        "The facility host bank agregation.  Finstra version was almost empty -> filled by best knowledge")
public class ResponseFacHostAgr
    implements Identifiable<IdClassFacHostAgr>,
        Serializable,
        EqualsSimpleFieldSupport<ResponseFacHostAgr> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "FHA";

  @Id
  @ApiModelProperty(value = "The Record ID (RID) for the deal.")
  private /*4*/ String pidDeal;

  @Id
  @ApiModelProperty(value = "The Record ID (RID) for the facility.")
  private /*4*/ String pidFacility;

  @ApiModelProperty(value = "Finstra version was almost empty -> filled by best knowledge")
  private /*4*/ BigDecimal amtClosing;

  @ApiModelProperty(value = "Finstra version was almost empty -> filled by best knowledge")
  private /*4*/ BigDecimal amtDcClose;

  @ApiModelProperty(value = "Finstra version was almost empty -> filled by best knowledge")
  private /*4*/ BigDecimal amtDcGross;

  @ApiModelProperty(value = "Finstra version was almost empty -> filled by best knowledge")
  private /*4*/ BigDecimal amtDcGrsAdj;

  @ApiModelProperty(value = "Finstra version was almost empty -> filled by best knowledge")
  private /*4*/ BigDecimal amtDcNet;

  @ApiModelProperty(value = "Finstra version was almost empty -> filled by best knowledge")
  private /*4*/ BigDecimal amtDcNetAdj;

  @ApiModelProperty(value = "Finstra version was almost empty -> filled by best knowledge")
  private /*4*/ BigDecimal amtDcPreclos;

  @ApiModelProperty(value = "Finstra version was almost empty -> filled by best knowledge")
  private /*4*/ BigDecimal amtGross;

  @ApiModelProperty(value = "Finstra version was almost empty -> filled by best knowledge")
  private /*4*/ BigDecimal amtGrossAdj;

  @ApiModelProperty(value = "Finstra version was almost empty -> filled by best knowledge")
  private /*4*/ BigDecimal amtNet;

  @ApiModelProperty(value = "Finstra version was almost empty -> filled by best knowledge")
  private /*4*/ BigDecimal amtNetAdj;

  @ApiModelProperty(value = "Finstra version was almost empty -> filled by best knowledge")
  private /*4*/ BigDecimal amtPreclose;

  @ApiModelProperty(value = "Timestamp from when this row was created.")
  private /*4*/ Date tspRecCreate;

  @ApiModelProperty(value = "Timestamp from when this row was last updated.")
  private /*4*/ Date tspRecUpdate;

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
   * @returns - a IdClassFacHostAgr object
   */
  @Override
  public IdClassFacHostAgr getId() {
    IdClassFacHostAgr id = new IdClassFacHostAgr(this.pidDeal, this.pidFacility);
    return id;
  }
  /** The Record ID (RID) for the deal. */
  public String getPidDeal() {
    return pidDeal;
  }

  /** Trimmed version of {@link #getPidDeal()} */
  public String getPidDeal_trimmed() {
    return (pidDeal == null) ? null : pidDeal.trim();
  }

  /** The Record ID (RID) for the facility. */
  public String getPidFacility() {
    return pidFacility;
  }

  /** Trimmed version of {@link #getPidFacility()} */
  public String getPidFacility_trimmed() {
    return (pidFacility == null) ? null : pidFacility.trim();
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtClosing() {
    return amtClosing;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtDcClose() {
    return amtDcClose;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtDcGross() {
    return amtDcGross;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtDcGrsAdj() {
    return amtDcGrsAdj;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtDcNet() {
    return amtDcNet;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtDcNetAdj() {
    return amtDcNetAdj;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtDcPreclos() {
    return amtDcPreclos;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtGross() {
    return amtGross;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtGrossAdj() {
    return amtGrossAdj;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtNet() {
    return amtNet;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtNetAdj() {
    return amtNetAdj;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public BigDecimal getAmtPreclose() {
    return amtPreclose;
  }

  /** Timestamp from when this row was created. */
  public Date getTspRecCreate() {
    return tspRecCreate;
  }

  /** Timestamp from when this row was last updated. */
  public Date getTspRecUpdate() {
    return tspRecUpdate;
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
  /** The Record ID (RID) for the deal. */
  public void setPidDeal(String pidDeal) {
    this.pidDeal = pidDeal;
  }

  /** The Record ID (RID) for the facility. */
  public void setPidFacility(String pidFacility) {
    this.pidFacility = pidFacility;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public void setAmtClosing(BigDecimal amtClosing) {
    this.amtClosing = amtClosing;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public void setAmtDcClose(BigDecimal amtDcClose) {
    this.amtDcClose = amtDcClose;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public void setAmtDcGross(BigDecimal amtDcGross) {
    this.amtDcGross = amtDcGross;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public void setAmtDcGrsAdj(BigDecimal amtDcGrsAdj) {
    this.amtDcGrsAdj = amtDcGrsAdj;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public void setAmtDcNet(BigDecimal amtDcNet) {
    this.amtDcNet = amtDcNet;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public void setAmtDcNetAdj(BigDecimal amtDcNetAdj) {
    this.amtDcNetAdj = amtDcNetAdj;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public void setAmtDcPreclos(BigDecimal amtDcPreclos) {
    this.amtDcPreclos = amtDcPreclos;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public void setAmtGross(BigDecimal amtGross) {
    this.amtGross = amtGross;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public void setAmtGrossAdj(BigDecimal amtGrossAdj) {
    this.amtGrossAdj = amtGrossAdj;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public void setAmtNet(BigDecimal amtNet) {
    this.amtNet = amtNet;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public void setAmtNetAdj(BigDecimal amtNetAdj) {
    this.amtNetAdj = amtNetAdj;
  }

  /** Finstra version was almost empty -> filled by best knowledge */
  public void setAmtPreclose(BigDecimal amtPreclose) {
    this.amtPreclose = amtPreclose;
  }

  /** Timestamp from when this row was created. */
  public void setTspRecCreate(Date tspRecCreate) {
    this.tspRecCreate = tspRecCreate;
  }

  /** Timestamp from when this row was last updated. */
  public void setTspRecUpdate(Date tspRecUpdate) {
    this.tspRecUpdate = tspRecUpdate;
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
    builder.append(pidDeal);
    builder.append(pidFacility);
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
    ResponseFacHostAgr other = (ResponseFacHostAgr) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.pidDeal, other.pidDeal);
    builder.append(this.pidFacility, other.pidFacility);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(ResponseFacHostAgr other) {
    CompareHelper helper = new CompareHelper();
    helper.append("pidDeal", this.pidDeal, other.pidDeal);
    helper.append("pidFacility", this.pidFacility, other.pidFacility);
    helper.append("amtClosing", this.amtClosing, other.amtClosing);
    helper.append("amtDcClose", this.amtDcClose, other.amtDcClose);
    helper.append("amtDcGross", this.amtDcGross, other.amtDcGross);
    helper.append("amtDcGrsAdj", this.amtDcGrsAdj, other.amtDcGrsAdj);
    helper.append("amtDcNet", this.amtDcNet, other.amtDcNet);
    helper.append("amtDcNetAdj", this.amtDcNetAdj, other.amtDcNetAdj);
    helper.append("amtDcPreclos", this.amtDcPreclos, other.amtDcPreclos);
    helper.append("amtGross", this.amtGross, other.amtGross);
    helper.append("amtGrossAdj", this.amtGrossAdj, other.amtGrossAdj);
    helper.append("amtNet", this.amtNet, other.amtNet);
    helper.append("amtNetAdj", this.amtNetAdj, other.amtNetAdj);
    helper.append("amtPreclose", this.amtPreclose, other.amtPreclose);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
