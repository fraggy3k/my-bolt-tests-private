/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.api.response;

import java.io.Serializable;

import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.interfaces.IdClassEnvironment;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Details of the user environment.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@ApiModel(value = "Environment", description = "Details of the user environment.")
public class ResponseEnvironment
    implements Identifiable<IdClassEnvironment>,
        Serializable,
        EqualsSimpleFieldSupport<ResponseEnvironment> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "ENV";

  @Id
  @ApiModelProperty(value = "The name for the variable class.")
  private /*4*/ String nmeVarClass;

  @Id
  @ApiModelProperty(value = "The variable name.")
  private /*4*/ String nmeVarName;

  @ApiModelProperty(value = "The comment describing the user environment.")
  private /*4*/ String txtComment;

  @ApiModelProperty(value = "The text describing the possible values of the variable.")
  private /*4*/ String txtVarValue;

  private /*4*/ String snapshotId;

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
  public String getSnapshotId() {
    return snapshotId;
  }

  /** Trimmed version of {@link #getSnapshotId()} */
  public String getSnapshotId_trimmed() {
    return (snapshotId == null) ? null : snapshotId.trim();
  }

  // Setter HERE
  /** The name for the variable class. */
  public void setNmeVarClass(String nmeVarClass) {
    this.nmeVarClass = nmeVarClass;
  }

  /** The variable name. */
  public void setNmeVarName(String nmeVarName) {
    this.nmeVarName = nmeVarName;
  }

  /** The comment describing the user environment. */
  public void setTxtComment(String txtComment) {
    this.txtComment = txtComment;
  }

  /** The text describing the possible values of the variable. */
  public void setTxtVarValue(String txtVarValue) {
    this.txtVarValue = txtVarValue;
  }

  /** */
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
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
    ResponseEnvironment other = (ResponseEnvironment) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.nmeVarClass, other.nmeVarClass);
    builder.append(this.nmeVarName, other.nmeVarName);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(ResponseEnvironment other) {
    CompareHelper helper = new CompareHelper();
    helper.append("nmeVarClass", this.nmeVarClass, other.nmeVarClass);
    helper.append("nmeVarName", this.nmeVarName, other.nmeVarName);
    helper.append("txtComment", this.txtComment, other.txtComment);
    helper.append("txtVarValue", this.txtVarValue, other.txtVarValue);
    return helper;
  }
}
