/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.api.response;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;

/** @author Julian Egyptien (smartdatahub.org) */
@ApiModel(value = "Bank", description = " # tbd. #")
public class ResponseCodeBank extends ResponseFamGlobal2 implements Serializable {

  public static final /*4*/ String DISCRIMINATOR_VALUE = "BNK";
  public static final /*4*/ String QUOTED_DISCRIMINATOR_VALUE = "'BNK'";

  /** Code */
  public String getCode() {
    return getCdeCode();
  }

  /** Trimmed version of {@link #getCode */
  public String getCode_trimmed() {
    return (getCdeCode() == null) ? null : getCdeCode().trim();
  }

  /** Currency */
  public String getCurrency() {
    return super.getCdeFkey1();
  }

  /** Trimmed version of {@link #getCurrency */
  public String getCurrency_trimmed() {
    return (super.getCdeFkey1() == null) ? null : getCdeFkey1().trim();
  }

  /** Description */
  public String getDescription() {
    return super.getDscCode();
  }

  /** Trimmed version of {@link #getDescription */
  public String getDescription_trimmed() {
    return (super.getDscCode() == null) ? null : getDscCode().trim();
  }

  /** */
  public Boolean getActive() {
    return super.getIndActive();
  }

  /** */
  public Boolean getMayDeactivate() {
    return super.getIndMayDeact();
  }

  /** Code */
  public void setCode(String value) {
    setCdeCode(value);
  }
  /** Currency */
  public void setCurrency(String value) {
    super.setCdeFkey1(value);
  }
  /** Description */
  public void setDescription(String value) {
    super.setDscCode(value);
  }
  /** */
  public void setActive(Boolean value) {
    super.setIndActive(value);
  }
  /** */
  public void setMayDeactivate(Boolean value) {
    super.setIndMayDeact(value);
  }
}
