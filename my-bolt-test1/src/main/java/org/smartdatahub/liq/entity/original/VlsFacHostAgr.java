/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.original;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.IdClassFacHostAgr;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqFacHostAgr;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * The facility host bank agregation. Finstra version was almost empty -> filled by best knowledge
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@Entity
@Table(name = "VLS_FAC_HOST_AGR")
@IdClass(value = IdClassFacHostAgr.class)
public class VlsFacHostAgr
    implements LiqFacHostAgr,
        Identifiable<IdClassFacHostAgr>,
        Serializable,
        EqualsSimpleFieldSupport<VlsFacHostAgr> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "FHA";

  @Column(name = "FHA_PID_DEAL", nullable = false, length = 8)
  @Id
  private /*4*/ String pidDeal;

  @Column(name = "FHA_PID_FACILITY", nullable = false, length = 8)
  @Id
  private /*4*/ String pidFacility;

  @Column(name = "FHA_AMT_CLOSING", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtClosing;

  @Column(name = "FHA_AMT_DC_CLOSE", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtDcClose;

  @Column(name = "FHA_AMT_DC_GROSS", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtDcGross;

  @Column(name = "FHA_AMT_DC_GRS_ADJ", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtDcGrsAdj;

  @Column(name = "FHA_AMT_DC_NET", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtDcNet;

  @Column(name = "FHA_AMT_DC_NET_ADJ", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtDcNetAdj;

  @Column(name = "FHA_AMT_DC_PRECLOS", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtDcPreclos;

  @Column(name = "FHA_AMT_GROSS", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtGross;

  @Column(name = "FHA_AMT_GROSS_ADJ", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtGrossAdj;

  @Column(name = "FHA_AMT_NET", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtNet;

  @Column(name = "FHA_AMT_NET_ADJ", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtNetAdj;

  @Column(name = "FHA_AMT_PRECLOSE", nullable = true, length = 28, scale = 3)
  private /*4*/ BigDecimal amtPreclose;

  @Column(name = "FHA_TSP_REC_CREATE", nullable = false)
  private /*4*/ Date tspRecCreate;

  @Column(name = "FHA_TSP_REC_UPDATE", nullable = false)
  private /*4*/ Date tspRecUpdate;

  @Column(name = "FHA_UID_REC_CREATE", nullable = false, length = 8)
  private /*4*/ String uidRecCreate;

  @Column(name = "FHA_UID_REC_UPDATE", nullable = false, length = 8)
  private /*4*/ String uidRecUpdate;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "FHA_PID_DEAL", insertable = false, updatable = false)
  private /*3*/ VlsDeal liqDeal;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "FHA_PID_FACILITY", insertable = false, updatable = false)
  private /*3*/ VlsFacility liqFacility;

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
  /**
   * Special Getter for the origin ID
   *
   * @returns - a IdClassFacHostAgr object
   */
  @Override
  public IdClassFacHostAgr getOriginId() {
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
    VlsFacHostAgr other = (VlsFacHostAgr) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.pidDeal, other.pidDeal);
    builder.append(this.pidFacility, other.pidFacility);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(VlsFacHostAgr other) {
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
