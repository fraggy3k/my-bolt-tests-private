/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.IdClassFamGlo1Assoc;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/** @author Julian Egyptien (smartdatahub.org) */
public class PojoFamGlo1Assoc
    implements Identifiable<IdClassFamGlo1Assoc>,
        Serializable,
        EqualsSimpleFieldSupport<PojoFamGlo1Assoc> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "GA1";

  public static final /*4*/ String DISCRIMINATOR_COLUMN = "GA1_TID_TABLE_ID";
  @Id private /*4*/ String cdeFkey1;
  @Id private /*4*/ String cdeFkey2;
  @Id private /*4*/ String tidTableId;
  private /*4*/ BigDecimal amtAmount1;
  private /*4*/ String cdeFkey3;
  private /*4*/ String cdeFkey4;
  private /*4*/ String cdeFkey5;
  private /*4*/ String cdeFkey6;
  private /*4*/ Boolean indActive;
  private /*4*/ Boolean indMayDeact;
  private /*4*/ Date tspRecCreate;
  private /*4*/ Date tspRecUpdate;
  private /*4*/ String uidRecCreate;
  private /*4*/ String uidRecUpdate;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - a IdClassFamGlo1Assoc object
   */
  @Override
  public IdClassFamGlo1Assoc getId() {
    IdClassFamGlo1Assoc id = new IdClassFamGlo1Assoc(this.cdeFkey1, this.cdeFkey2, this.tidTableId);
    return id;
  }
  /** */
  protected String getCdeFkey1() {
    return cdeFkey1;
  }

  /** Trimmed version of {@link #getCdeFkey1()} */
  protected String getCdeFkey1_trimmed() {
    return (cdeFkey1 == null) ? null : cdeFkey1.trim();
  }

  /** */
  protected String getCdeFkey2() {
    return cdeFkey2;
  }

  /** Trimmed version of {@link #getCdeFkey2()} */
  protected String getCdeFkey2_trimmed() {
    return (cdeFkey2 == null) ? null : cdeFkey2.trim();
  }

  /** */
  public String getTidTableId() {
    return tidTableId;
  }

  /** Trimmed version of {@link #getTidTableId()} */
  public String getTidTableId_trimmed() {
    return (tidTableId == null) ? null : tidTableId.trim();
  }

  /** */
  protected BigDecimal getAmtAmount1() {
    return amtAmount1;
  }

  /** */
  protected String getCdeFkey3() {
    return cdeFkey3;
  }

  /** Trimmed version of {@link #getCdeFkey3()} */
  protected String getCdeFkey3_trimmed() {
    return (cdeFkey3 == null) ? null : cdeFkey3.trim();
  }

  /** */
  protected String getCdeFkey4() {
    return cdeFkey4;
  }

  /** Trimmed version of {@link #getCdeFkey4()} */
  protected String getCdeFkey4_trimmed() {
    return (cdeFkey4 == null) ? null : cdeFkey4.trim();
  }

  /** */
  protected String getCdeFkey5() {
    return cdeFkey5;
  }

  /** Trimmed version of {@link #getCdeFkey5()} */
  protected String getCdeFkey5_trimmed() {
    return (cdeFkey5 == null) ? null : cdeFkey5.trim();
  }

  /** */
  protected String getCdeFkey6() {
    return cdeFkey6;
  }

  /** Trimmed version of {@link #getCdeFkey6()} */
  protected String getCdeFkey6_trimmed() {
    return (cdeFkey6 == null) ? null : cdeFkey6.trim();
  }

  /** */
  protected Boolean getIndActive() {
    return indActive;
  }

  /** */
  protected Boolean getIndMayDeact() {
    return indMayDeact;
  }

  /** */
  public Date getTspRecCreate() {
    return tspRecCreate;
  }

  /** */
  public Date getTspRecUpdate() {
    return tspRecUpdate;
  }

  /** */
  public String getUidRecCreate() {
    return uidRecCreate;
  }

  /** Trimmed version of {@link #getUidRecCreate()} */
  public String getUidRecCreate_trimmed() {
    return (uidRecCreate == null) ? null : uidRecCreate.trim();
  }

  /** */
  public String getUidRecUpdate() {
    return uidRecUpdate;
  }

  /** Trimmed version of {@link #getUidRecUpdate()} */
  public String getUidRecUpdate_trimmed() {
    return (uidRecUpdate == null) ? null : uidRecUpdate.trim();
  }

  // Setter HERE
  /** */
  protected void setCdeFkey1(String cdeFkey1) {
    this.cdeFkey1 = cdeFkey1;
  }

  /** */
  protected void setCdeFkey2(String cdeFkey2) {
    this.cdeFkey2 = cdeFkey2;
  }

  /** */
  public void setTidTableId(String tidTableId) {
    this.tidTableId = tidTableId;
  }

  /** */
  protected void setAmtAmount1(BigDecimal amtAmount1) {
    this.amtAmount1 = amtAmount1;
  }

  /** */
  protected void setCdeFkey3(String cdeFkey3) {
    this.cdeFkey3 = cdeFkey3;
  }

  /** */
  protected void setCdeFkey4(String cdeFkey4) {
    this.cdeFkey4 = cdeFkey4;
  }

  /** */
  protected void setCdeFkey5(String cdeFkey5) {
    this.cdeFkey5 = cdeFkey5;
  }

  /** */
  protected void setCdeFkey6(String cdeFkey6) {
    this.cdeFkey6 = cdeFkey6;
  }

  /** */
  protected void setIndActive(Boolean indActive) {
    this.indActive = indActive;
  }

  /** */
  protected void setIndMayDeact(Boolean indMayDeact) {
    this.indMayDeact = indMayDeact;
  }

  /** */
  public void setTspRecCreate(Date tspRecCreate) {
    this.tspRecCreate = tspRecCreate;
  }

  /** */
  public void setTspRecUpdate(Date tspRecUpdate) {
    this.tspRecUpdate = tspRecUpdate;
  }

  /** */
  public void setUidRecCreate(String uidRecCreate) {
    this.uidRecCreate = uidRecCreate;
  }

  /** */
  public void setUidRecUpdate(String uidRecUpdate) {
    this.uidRecUpdate = uidRecUpdate;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(cdeFkey1);
    builder.append(cdeFkey2);
    builder.append(tidTableId);
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
    PojoFamGlo1Assoc other = (PojoFamGlo1Assoc) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cdeFkey1, other.cdeFkey1);
    builder.append(this.cdeFkey2, other.cdeFkey2);
    builder.append(this.tidTableId, other.tidTableId);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(PojoFamGlo1Assoc other) {
    CompareHelper helper = new CompareHelper();
    helper.append("DISCRIMINATOR_COLUMN", this.DISCRIMINATOR_COLUMN, other.DISCRIMINATOR_COLUMN);
    helper.append("cdeFkey1", this.cdeFkey1, other.cdeFkey1);
    helper.append("cdeFkey2", this.cdeFkey2, other.cdeFkey2);
    helper.append("tidTableId", this.tidTableId, other.tidTableId);
    helper.append("amtAmount1", this.amtAmount1, other.amtAmount1);
    helper.append("cdeFkey3", this.cdeFkey3, other.cdeFkey3);
    helper.append("cdeFkey4", this.cdeFkey4, other.cdeFkey4);
    helper.append("cdeFkey5", this.cdeFkey5, other.cdeFkey5);
    helper.append("cdeFkey6", this.cdeFkey6, other.cdeFkey6);
    helper.append("indActive", this.indActive, other.indActive);
    helper.append("indMayDeact", this.indMayDeact, other.indMayDeact);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
