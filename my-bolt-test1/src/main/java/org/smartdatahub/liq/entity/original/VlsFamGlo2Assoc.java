/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.original;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.IdClassFamGlo2Assoc;
import org.smartdatahub.liq.entity.utils.BooleanToStringConverter;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/** @author Julian Egyptien (smartdatahub.org) */
@Entity
@Table(name = "VLS_FAM_GLO2_ASSOC")
@DiscriminatorColumn(name = VlsFamGlo2Assoc.DISCRIMINATOR_COLUMN)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@IdClass(value = IdClassFamGlo2Assoc.class)
public class VlsFamGlo2Assoc
    implements Identifiable<IdClassFamGlo2Assoc>,
        Serializable,
        EqualsSimpleFieldSupport<VlsFamGlo2Assoc> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "GA2";

  public static final /*4*/ String DISCRIMINATOR_COLUMN = "GA2_TID_TABLE_ID";

  @Column(name = "GA2_RID_FG2_ASSOC", nullable = false, length = 8)
  @Id
  private /*4*/ String ridFg2Assoc;

  @Column(
      name = "GA2_TID_TABLE_ID",
      nullable = false,
      length = 3,
      insertable = false,
      updatable = false)
  @Id
  private /*4*/ String tidTableId;

  @Column(name = "GA2_CDE_FKEY1", nullable = false, length = 5)
  private /*4*/ String cdeFkey1;

  @Column(name = "GA2_CDE_FKEY2", nullable = true, length = 5)
  private /*4*/ String cdeFkey2;

  @Column(name = "GA2_CDE_FKEY3", nullable = true, length = 5)
  private /*4*/ String cdeFkey3;

  @Column(name = "GA2_IND_ACTIVE", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indActive;

  @Column(name = "GA2_IND_MAY_DEACT", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indMayDeact;

  @Column(name = "GA2_TSP_REC_CREATE", nullable = false)
  private /*4*/ Date tspRecCreate;

  @Column(name = "GA2_TSP_REC_UPDATE", nullable = false)
  private /*4*/ Date tspRecUpdate;

  @Column(name = "GA2_UID_REC_CREATE", nullable = false, length = 8)
  private /*4*/ String uidRecCreate;

  @Column(name = "GA2_UID_REC_UPDATE", nullable = false, length = 8)
  private /*4*/ String uidRecUpdate;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - a IdClassFamGlo2Assoc object
   */
  @Override
  public IdClassFamGlo2Assoc getId() {
    IdClassFamGlo2Assoc id = new IdClassFamGlo2Assoc(this.ridFg2Assoc, this.tidTableId);
    return id;
  }
  /** */
  protected String getRidFg2Assoc() {
    return ridFg2Assoc;
  }

  /** Trimmed version of {@link #getRidFg2Assoc()} */
  protected String getRidFg2Assoc_trimmed() {
    return (ridFg2Assoc == null) ? null : ridFg2Assoc.trim();
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
  protected String getCdeFkey3() {
    return cdeFkey3;
  }

  /** Trimmed version of {@link #getCdeFkey3()} */
  protected String getCdeFkey3_trimmed() {
    return (cdeFkey3 == null) ? null : cdeFkey3.trim();
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

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(ridFg2Assoc);
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
    VlsFamGlo2Assoc other = (VlsFamGlo2Assoc) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.ridFg2Assoc, other.ridFg2Assoc);
    builder.append(this.tidTableId, other.tidTableId);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(VlsFamGlo2Assoc other) {
    CompareHelper helper = new CompareHelper();
    helper.append("DISCRIMINATOR_COLUMN", this.DISCRIMINATOR_COLUMN, other.DISCRIMINATOR_COLUMN);
    helper.append("ridFg2Assoc", this.ridFg2Assoc, other.ridFg2Assoc);
    helper.append("tidTableId", this.tidTableId, other.tidTableId);
    helper.append("cdeFkey1", this.cdeFkey1, other.cdeFkey1);
    helper.append("cdeFkey2", this.cdeFkey2, other.cdeFkey2);
    helper.append("cdeFkey3", this.cdeFkey3, other.cdeFkey3);
    helper.append("indActive", this.indActive, other.indActive);
    helper.append("indMayDeact", this.indMayDeact, other.indMayDeact);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
