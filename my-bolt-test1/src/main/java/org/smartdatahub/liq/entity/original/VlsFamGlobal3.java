/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.original;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.IdClassFamGlobal3;
import org.smartdatahub.liq.entity.interfaces.LiqFamGlobal3;
import org.smartdatahub.liq.entity.utils.BooleanToStringConverter;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/** @author Julian Egyptien (smartdatahub.org) */
@Entity
@Table(name = "VLS_FAM_GLOBAL3")
@IdClass(value = IdClassFamGlobal3.class)
public class VlsFamGlobal3
    implements LiqFamGlobal3,
        Identifiable<IdClassFamGlobal3>,
        Serializable,
        EqualsSimpleFieldSupport<VlsFamGlobal3> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "GB3";

  @Column(name = "GB3_CDE_CODE", nullable = false, length = 5)
  @Id
  private /*4*/ String cdeCode;

  @Column(name = "GB3_CDE_FKEY1", nullable = false, length = 5)
  @Id
  private /*4*/ String cdeFkey1;

  @Column(name = "GB3_TID_TABLE_ID", nullable = false, length = 3)
  @Id
  private /*4*/ String tidTableId;

  @Column(name = "GB3_DSC_CODE", nullable = false, length = 400)
  private /*4*/ String dscCode;

  @Column(name = "GB3_IND_ACTIVE", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indActive;

  @Column(name = "GB3_IND_MAY_DEACT", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indMayDeact;

  @Column(name = "GB3_IND_OPTIONAL_1", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptional1;

  @Column(name = "GB3_IND_OPTIONAL_2", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptional2;

  @Column(name = "GB3_RTO_OPTIONAL", nullable = true, length = 22)
  private /*4*/ BigDecimal rtoOptional;

  @Column(name = "GB3_RTO_OPTIONAL_1", nullable = true, length = 22)
  private /*4*/ BigDecimal rtoOptional1;

  @Column(name = "GB3_TSP_REC_CREATE", nullable = false)
  private /*4*/ Date tspRecCreate;

  @Column(name = "GB3_TSP_REC_UPDATE", nullable = false)
  private /*4*/ Date tspRecUpdate;

  @Column(name = "GB3_UID_REC_CREATE", nullable = false, length = 8)
  private /*4*/ String uidRecCreate;

  @Column(name = "GB3_UID_REC_UPDATE", nullable = false, length = 8)
  private /*4*/ String uidRecUpdate;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - a IdClassFamGlobal3 object
   */
  @Override
  public IdClassFamGlobal3 getId() {
    IdClassFamGlobal3 id = new IdClassFamGlobal3(this.cdeCode, this.cdeFkey1, this.tidTableId);
    return id;
  }
  /**
   * Special Getter for the origin ID
   *
   * @returns - a IdClassFamGlobal3 object
   */
  @Override
  public IdClassFamGlobal3 getOriginId() {
    IdClassFamGlobal3 id = new IdClassFamGlobal3(this.cdeCode, this.cdeFkey1, this.tidTableId);
    return id;
  }
  /** */
  public String getCdeCode() {
    return cdeCode;
  }

  /** Trimmed version of {@link #getCdeCode()} */
  public String getCdeCode_trimmed() {
    return (cdeCode == null) ? null : cdeCode.trim();
  }

  /** */
  public String getCdeFkey1() {
    return cdeFkey1;
  }

  /** Trimmed version of {@link #getCdeFkey1()} */
  public String getCdeFkey1_trimmed() {
    return (cdeFkey1 == null) ? null : cdeFkey1.trim();
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
  public String getDscCode() {
    return dscCode;
  }

  /** Trimmed version of {@link #getDscCode()} */
  public String getDscCode_trimmed() {
    return (dscCode == null) ? null : dscCode.trim();
  }

  /** */
  public Boolean getIndActive() {
    return indActive;
  }

  /** */
  public Boolean getIndMayDeact() {
    return indMayDeact;
  }

  /** */
  public Boolean getIndOptional1() {
    return indOptional1;
  }

  /** */
  public Boolean getIndOptional2() {
    return indOptional2;
  }

  /** */
  public BigDecimal getRtoOptional() {
    return rtoOptional;
  }

  /** */
  public BigDecimal getRtoOptional1() {
    return rtoOptional1;
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

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(cdeCode);
    builder.append(cdeFkey1);
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
    VlsFamGlobal3 other = (VlsFamGlobal3) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cdeCode, other.cdeCode);
    builder.append(this.cdeFkey1, other.cdeFkey1);
    builder.append(this.tidTableId, other.tidTableId);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(VlsFamGlobal3 other) {
    CompareHelper helper = new CompareHelper();
    helper.append("cdeCode", this.cdeCode, other.cdeCode);
    helper.append("cdeFkey1", this.cdeFkey1, other.cdeFkey1);
    helper.append("tidTableId", this.tidTableId, other.tidTableId);
    helper.append("dscCode", this.dscCode, other.dscCode);
    helper.append("indActive", this.indActive, other.indActive);
    helper.append("indMayDeact", this.indMayDeact, other.indMayDeact);
    helper.append("indOptional1", this.indOptional1, other.indOptional1);
    helper.append("indOptional2", this.indOptional2, other.indOptional2);
    helper.append("rtoOptional", this.rtoOptional, other.rtoOptional);
    helper.append("rtoOptional1", this.rtoOptional1, other.rtoOptional1);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
