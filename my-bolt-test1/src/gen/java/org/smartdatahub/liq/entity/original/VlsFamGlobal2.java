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
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.IdClassFamGlobal2;
import org.smartdatahub.liq.entity.utils.BooleanToStringConverter;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/** @author Julian Egyptien (smartdatahub.org) */
@Entity
@Table(name = "VLS_FAM_GLOBAL2")
@DiscriminatorColumn(name = VlsFamGlobal2.DISCRIMINATOR_COLUMN)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@IdClass(value = IdClassFamGlobal2.class)
public class VlsFamGlobal2
    implements Identifiable<IdClassFamGlobal2>,
        Serializable,
        EqualsSimpleFieldSupport<VlsFamGlobal2> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "GB2";

  public static final /*4*/ String DISCRIMINATOR_COLUMN = "GB2_TID_TABLE_ID";

  @Column(name = "GB2_CDE_CODE", nullable = false, length = 5)
  @Id
  private /*4*/ String cdeCode;

  @Column(
      name = "GB2_TID_TABLE_ID",
      nullable = false,
      length = 3,
      insertable = false,
      updatable = false)
  @Id
  private /*4*/ String tidTableId;

  @Column(name = "GB2_AMT_OPTIONAL1", nullable = true, length = 22)
  private /*4*/ BigDecimal amtOptional1;

  @Column(name = "GB2_AMT_OPTIONAL2", nullable = true, length = 22)
  private /*4*/ BigDecimal amtOptional2;

  @Column(name = "GB2_AMT_OPTIONAL3", nullable = true, length = 22)
  private /*4*/ BigDecimal amtOptional3;

  @Column(name = "GB2_AMT_OPTIONAL4", nullable = true, length = 22)
  private /*4*/ BigDecimal amtOptional4;

  @Column(name = "GB2_AMT_OPTIONAL5", nullable = true, length = 22)
  private /*4*/ BigDecimal amtOptional5;

  @Column(name = "GB2_CDE_FKEY1", nullable = true, length = 5)
  private /*4*/ String cdeFkey1;

  @Column(name = "GB2_CDE_FKEY10", nullable = true, length = 5)
  private /*4*/ String cdeFkey10;

  @Column(name = "GB2_CDE_FKEY11", nullable = true, length = 5)
  private /*4*/ String cdeFkey11;

  @Column(name = "GB2_CDE_FKEY12", nullable = true, length = 5)
  private /*4*/ String cdeFkey12;

  @Column(name = "GB2_CDE_FKEY13", nullable = true, length = 5)
  private /*4*/ String cdeFkey13;

  @Column(name = "GB2_CDE_FKEY2", nullable = true, length = 5)
  private /*4*/ String cdeFkey2;

  @Column(name = "GB2_CDE_FKEY3", nullable = true, length = 5)
  private /*4*/ String cdeFkey3;

  @Column(name = "GB2_CDE_FKEY4", nullable = true, length = 5)
  private /*4*/ String cdeFkey4;

  @Column(name = "GB2_CDE_FKEY5", nullable = true, length = 5)
  private /*4*/ String cdeFkey5;

  @Column(name = "GB2_CDE_FKEY6", nullable = true, length = 5)
  private /*4*/ String cdeFkey6;

  @Column(name = "GB2_CDE_FKEY7", nullable = true, length = 5)
  private /*4*/ String cdeFkey7;

  @Column(name = "GB2_CDE_FKEY8", nullable = true, length = 5)
  private /*4*/ String cdeFkey8;

  @Column(name = "GB2_CDE_FKEY9", nullable = true, length = 5)
  private /*4*/ String cdeFkey9;

  @Column(name = "GB2_DSC_CODE", nullable = false, length = 400)
  private /*4*/ String dscCode;

  @Column(name = "GB2_IND_ACTIVE", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indActive;

  @Column(name = "GB2_IND_MAY_DEACT", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indMayDeact;

  @Column(name = "GB2_IND_OPTIONAL_1", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptional1;

  @Column(name = "GB2_IND_OPTIONAL_2", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptional2;

  @Column(name = "GB2_IND_OPTIONAL_3", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptional3;

  @Column(name = "GB2_IND_OPTIONAL_4", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptional4;

  @Column(name = "GB2_IND_OPTIONAL_5", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptional5;

  @Column(name = "GB2_IND_OPTIONAL_6", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptional6;

  @Column(name = "GB2_IND_OPTIONAL_7", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptional7;

  @Column(name = "GB2_IND_OPTIONAL_8", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptional8;

  @Column(name = "GB2_IND_OPTIONAL_9", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptional9;

  @Column(name = "GB2_IND_OPTIONL_10", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptionl10;

  @Column(name = "GB2_IND_OPTIONL_11", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptionl11;

  @Column(name = "GB2_IND_OPTIONL_12", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptionl12;

  @Column(name = "GB2_IND_OPTIONL_13", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptionl13;

  @Column(name = "GB2_IND_OPTIONL_14", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptionl14;

  @Column(name = "GB2_IND_OPTIONL_15", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptionl15;

  @Column(name = "GB2_IND_OPTIONL_20", nullable = true)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indOptionl20;

  @Column(name = "GB2_NUM_OPTIONAL", nullable = true, length = 22)
  private /*4*/ Long numOptional;

  @Column(name = "GB2_NUM_OPTIONAL1", nullable = true, length = 22)
  private /*4*/ Long numOptional1;

  @Column(name = "GB2_NUM_OPTIONAL2", nullable = true, length = 22)
  private /*4*/ Long numOptional2;

  @Column(name = "GB2_NUM_OPTIONAL3", nullable = true, length = 22)
  private /*4*/ Long numOptional3;

  @Column(name = "GB2_PRC_OPTIONAL_1", nullable = true, length = 22)
  private /*4*/ BigDecimal prcOptional1;

  @Column(name = "GB2_RTO_OPTIONAL", nullable = true, length = 22)
  private /*4*/ BigDecimal rtoOptional;

  @Column(name = "GB2_RTO_OPTIONAL_2", nullable = true, length = 22)
  private /*4*/ BigDecimal rtoOptional2;

  @Column(name = "GB2_RTO_OPTIONAL_3", nullable = true, length = 22)
  private /*4*/ BigDecimal rtoOptional3;

  @Column(name = "GB2_TSP_REC_CREATE", nullable = false)
  private /*4*/ Date tspRecCreate;

  @Column(name = "GB2_TSP_REC_UPDATE", nullable = false)
  private /*4*/ Date tspRecUpdate;

  @Column(name = "GB2_TXT_COMMENT", nullable = true, length = 4000)
  private /*4*/ String txtComment;

  @Column(name = "GB2_UID_REC_CREATE", nullable = false, length = 8)
  private /*4*/ String uidRecCreate;

  @Column(name = "GB2_UID_REC_UPDATE", nullable = false, length = 8)
  private /*4*/ String uidRecUpdate;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - a IdClassFamGlobal2 object
   */
  @Override
  public IdClassFamGlobal2 getId() {
    IdClassFamGlobal2 id = new IdClassFamGlobal2(this.cdeCode, this.tidTableId);
    return id;
  }
  /** */
  protected String getCdeCode() {
    return cdeCode;
  }

  /** Trimmed version of {@link #getCdeCode()} */
  protected String getCdeCode_trimmed() {
    return (cdeCode == null) ? null : cdeCode.trim();
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
  protected BigDecimal getAmtOptional1() {
    return amtOptional1;
  }

  /** */
  protected BigDecimal getAmtOptional2() {
    return amtOptional2;
  }

  /** */
  protected BigDecimal getAmtOptional3() {
    return amtOptional3;
  }

  /** */
  protected BigDecimal getAmtOptional4() {
    return amtOptional4;
  }

  /** */
  protected BigDecimal getAmtOptional5() {
    return amtOptional5;
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
  protected String getCdeFkey10() {
    return cdeFkey10;
  }

  /** Trimmed version of {@link #getCdeFkey10()} */
  protected String getCdeFkey10_trimmed() {
    return (cdeFkey10 == null) ? null : cdeFkey10.trim();
  }

  /** */
  protected String getCdeFkey11() {
    return cdeFkey11;
  }

  /** Trimmed version of {@link #getCdeFkey11()} */
  protected String getCdeFkey11_trimmed() {
    return (cdeFkey11 == null) ? null : cdeFkey11.trim();
  }

  /** */
  protected String getCdeFkey12() {
    return cdeFkey12;
  }

  /** Trimmed version of {@link #getCdeFkey12()} */
  protected String getCdeFkey12_trimmed() {
    return (cdeFkey12 == null) ? null : cdeFkey12.trim();
  }

  /** */
  protected String getCdeFkey13() {
    return cdeFkey13;
  }

  /** Trimmed version of {@link #getCdeFkey13()} */
  protected String getCdeFkey13_trimmed() {
    return (cdeFkey13 == null) ? null : cdeFkey13.trim();
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
  protected String getCdeFkey7() {
    return cdeFkey7;
  }

  /** Trimmed version of {@link #getCdeFkey7()} */
  protected String getCdeFkey7_trimmed() {
    return (cdeFkey7 == null) ? null : cdeFkey7.trim();
  }

  /** */
  protected String getCdeFkey8() {
    return cdeFkey8;
  }

  /** Trimmed version of {@link #getCdeFkey8()} */
  protected String getCdeFkey8_trimmed() {
    return (cdeFkey8 == null) ? null : cdeFkey8.trim();
  }

  /** */
  protected String getCdeFkey9() {
    return cdeFkey9;
  }

  /** Trimmed version of {@link #getCdeFkey9()} */
  protected String getCdeFkey9_trimmed() {
    return (cdeFkey9 == null) ? null : cdeFkey9.trim();
  }

  /** */
  protected String getDscCode() {
    return dscCode;
  }

  /** Trimmed version of {@link #getDscCode()} */
  protected String getDscCode_trimmed() {
    return (dscCode == null) ? null : dscCode.trim();
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
  protected Boolean getIndOptional1() {
    return indOptional1;
  }

  /** */
  protected Boolean getIndOptional2() {
    return indOptional2;
  }

  /** */
  protected Boolean getIndOptional3() {
    return indOptional3;
  }

  /** */
  protected Boolean getIndOptional4() {
    return indOptional4;
  }

  /** */
  protected Boolean getIndOptional5() {
    return indOptional5;
  }

  /** */
  protected Boolean getIndOptional6() {
    return indOptional6;
  }

  /** */
  protected Boolean getIndOptional7() {
    return indOptional7;
  }

  /** */
  protected Boolean getIndOptional8() {
    return indOptional8;
  }

  /** */
  protected Boolean getIndOptional9() {
    return indOptional9;
  }

  /** */
  protected Boolean getIndOptionl10() {
    return indOptionl10;
  }

  /** */
  protected Boolean getIndOptionl11() {
    return indOptionl11;
  }

  /** */
  protected Boolean getIndOptionl12() {
    return indOptionl12;
  }

  /** */
  protected Boolean getIndOptionl13() {
    return indOptionl13;
  }

  /** */
  protected Boolean getIndOptionl14() {
    return indOptionl14;
  }

  /** */
  protected Boolean getIndOptionl15() {
    return indOptionl15;
  }

  /** */
  protected Boolean getIndOptionl20() {
    return indOptionl20;
  }

  /** */
  protected Long getNumOptional() {
    return numOptional;
  }

  /** */
  protected Long getNumOptional1() {
    return numOptional1;
  }

  /** */
  protected Long getNumOptional2() {
    return numOptional2;
  }

  /** */
  protected Long getNumOptional3() {
    return numOptional3;
  }

  /** */
  protected BigDecimal getPrcOptional1() {
    return prcOptional1;
  }

  /** */
  protected BigDecimal getRtoOptional() {
    return rtoOptional;
  }

  /** */
  protected BigDecimal getRtoOptional2() {
    return rtoOptional2;
  }

  /** */
  protected BigDecimal getRtoOptional3() {
    return rtoOptional3;
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
  protected String getTxtComment() {
    return txtComment;
  }

  /** Trimmed version of {@link #getTxtComment()} */
  protected String getTxtComment_trimmed() {
    return (txtComment == null) ? null : txtComment.trim();
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
    VlsFamGlobal2 other = (VlsFamGlobal2) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cdeCode, other.cdeCode);
    builder.append(this.tidTableId, other.tidTableId);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(VlsFamGlobal2 other) {
    CompareHelper helper = new CompareHelper();
    helper.append("DISCRIMINATOR_COLUMN", this.DISCRIMINATOR_COLUMN, other.DISCRIMINATOR_COLUMN);
    helper.append("cdeCode", this.cdeCode, other.cdeCode);
    helper.append("tidTableId", this.tidTableId, other.tidTableId);
    helper.append("amtOptional1", this.amtOptional1, other.amtOptional1);
    helper.append("amtOptional2", this.amtOptional2, other.amtOptional2);
    helper.append("amtOptional3", this.amtOptional3, other.amtOptional3);
    helper.append("amtOptional4", this.amtOptional4, other.amtOptional4);
    helper.append("amtOptional5", this.amtOptional5, other.amtOptional5);
    helper.append("cdeFkey1", this.cdeFkey1, other.cdeFkey1);
    helper.append("cdeFkey10", this.cdeFkey10, other.cdeFkey10);
    helper.append("cdeFkey11", this.cdeFkey11, other.cdeFkey11);
    helper.append("cdeFkey12", this.cdeFkey12, other.cdeFkey12);
    helper.append("cdeFkey13", this.cdeFkey13, other.cdeFkey13);
    helper.append("cdeFkey2", this.cdeFkey2, other.cdeFkey2);
    helper.append("cdeFkey3", this.cdeFkey3, other.cdeFkey3);
    helper.append("cdeFkey4", this.cdeFkey4, other.cdeFkey4);
    helper.append("cdeFkey5", this.cdeFkey5, other.cdeFkey5);
    helper.append("cdeFkey6", this.cdeFkey6, other.cdeFkey6);
    helper.append("cdeFkey7", this.cdeFkey7, other.cdeFkey7);
    helper.append("cdeFkey8", this.cdeFkey8, other.cdeFkey8);
    helper.append("cdeFkey9", this.cdeFkey9, other.cdeFkey9);
    helper.append("dscCode", this.dscCode, other.dscCode);
    helper.append("indActive", this.indActive, other.indActive);
    helper.append("indMayDeact", this.indMayDeact, other.indMayDeact);
    helper.append("indOptional1", this.indOptional1, other.indOptional1);
    helper.append("indOptional2", this.indOptional2, other.indOptional2);
    helper.append("indOptional3", this.indOptional3, other.indOptional3);
    helper.append("indOptional4", this.indOptional4, other.indOptional4);
    helper.append("indOptional5", this.indOptional5, other.indOptional5);
    helper.append("indOptional6", this.indOptional6, other.indOptional6);
    helper.append("indOptional7", this.indOptional7, other.indOptional7);
    helper.append("indOptional8", this.indOptional8, other.indOptional8);
    helper.append("indOptional9", this.indOptional9, other.indOptional9);
    helper.append("indOptionl10", this.indOptionl10, other.indOptionl10);
    helper.append("indOptionl11", this.indOptionl11, other.indOptionl11);
    helper.append("indOptionl12", this.indOptionl12, other.indOptionl12);
    helper.append("indOptionl13", this.indOptionl13, other.indOptionl13);
    helper.append("indOptionl14", this.indOptionl14, other.indOptionl14);
    helper.append("indOptionl15", this.indOptionl15, other.indOptionl15);
    helper.append("indOptionl20", this.indOptionl20, other.indOptionl20);
    helper.append("numOptional", this.numOptional, other.numOptional);
    helper.append("numOptional1", this.numOptional1, other.numOptional1);
    helper.append("numOptional2", this.numOptional2, other.numOptional2);
    helper.append("numOptional3", this.numOptional3, other.numOptional3);
    helper.append("prcOptional1", this.prcOptional1, other.prcOptional1);
    helper.append("rtoOptional", this.rtoOptional, other.rtoOptional);
    helper.append("rtoOptional2", this.rtoOptional2, other.rtoOptional2);
    helper.append("rtoOptional3", this.rtoOptional3, other.rtoOptional3);
    helper.append("tspRecCreate", this.tspRecCreate, other.tspRecCreate);
    helper.append("tspRecUpdate", this.tspRecUpdate, other.tspRecUpdate);
    helper.append("txtComment", this.txtComment, other.txtComment);
    helper.append("uidRecCreate", this.uidRecCreate, other.uidRecCreate);
    helper.append("uidRecUpdate", this.uidRecUpdate, other.uidRecUpdate);
    return helper;
  }
}
