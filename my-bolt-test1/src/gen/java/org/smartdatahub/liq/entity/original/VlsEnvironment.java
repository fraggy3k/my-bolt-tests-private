/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.original;

import java.io.Serializable;

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
import org.smartdatahub.liq.entity.interfaces.IdClassEnvironment;
import org.smartdatahub.liq.entity.interfaces.LiqEnvironment;
import org.smartdatahub.liq.entity.interfaces.LiqTimeRegion;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * Details of the user environment.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@Entity
@Table(name = "VLS_ENVIRONMENT")
@IdClass(value = IdClassEnvironment.class)
public class VlsEnvironment
    implements LiqEnvironment,
        Identifiable<IdClassEnvironment>,
        Serializable,
        EqualsSimpleFieldSupport<VlsEnvironment> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "ENV";

  @Column(name = "ENV_NME_VAR_CLASS", nullable = false, length = 8)
  @Id
  private /*4*/ String nmeVarClass;

  @Column(name = "ENV_NME_VAR_NAME", nullable = false, length = 32)
  @Id
  private /*4*/ String nmeVarName;

  @Column(name = "ENV_TXT_COMMENT", nullable = false, length = 80)
  private /*4*/ String txtComment;

  @Column(name = "ENV_TXT_VAR_VALUE", nullable = false, length = 80)
  private /*4*/ String txtVarValue;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ENV_NME_VAR_CLASS", insertable = false, updatable = false)
  private /*3*/ VlsTimeRegion liqTimeRegion;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - a IdClassEnvironment object
   */
  @Override
  public IdClassEnvironment getId() {
    IdClassEnvironment id = new IdClassEnvironment(this.nmeVarClass, this.nmeVarName);
    return id;
  }
  /**
   * Special Getter for the origin ID
   *
   * @returns - a IdClassEnvironment object
   */
  @Override
  public IdClassEnvironment getOriginId() {
    IdClassEnvironment id = new IdClassEnvironment(this.nmeVarClass, this.nmeVarName);
    return id;
  }
  /** The name for the variable class. */
  public String getNmeVarClass() {
    return nmeVarClass;
  }

  /** Trimmed version of {@link #getNmeVarClass()} */
  public String getNmeVarClass_trimmed() {
    return (nmeVarClass == null) ? null : nmeVarClass.trim();
  }

  /** The variable name. */
  public String getNmeVarName() {
    return nmeVarName;
  }

  /** Trimmed version of {@link #getNmeVarName()} */
  public String getNmeVarName_trimmed() {
    return (nmeVarName == null) ? null : nmeVarName.trim();
  }

  /** The comment describing the user environment. */
  public String getTxtComment() {
    return txtComment;
  }

  /** Trimmed version of {@link #getTxtComment()} */
  public String getTxtComment_trimmed() {
    return (txtComment == null) ? null : txtComment.trim();
  }

  /** The text describing the possible values of the variable. */
  public String getTxtVarValue() {
    return txtVarValue;
  }

  /** Trimmed version of {@link #getTxtVarValue()} */
  public String getTxtVarValue_trimmed() {
    return (txtVarValue == null) ? null : txtVarValue.trim();
  }

  /** */
  public LiqTimeRegion getLiqTimeRegion() {
    return nullIfNotFound(liqTimeRegion);
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(nmeVarClass);
    builder.append(nmeVarName);
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
    VlsEnvironment other = (VlsEnvironment) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.nmeVarClass, other.nmeVarClass);
    builder.append(this.nmeVarName, other.nmeVarName);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(VlsEnvironment other) {
    CompareHelper helper = new CompareHelper();
    helper.append("nmeVarClass", this.nmeVarClass, other.nmeVarClass);
    helper.append("nmeVarName", this.nmeVarName, other.nmeVarName);
    helper.append("txtComment", this.txtComment, other.txtComment);
    helper.append("txtVarValue", this.txtVarValue, other.txtVarValue);
    return helper;
  }
}
