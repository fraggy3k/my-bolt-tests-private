/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.original;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.smartdatahub.liq.entity.interfaces.LiqCodeBank;

/** @author Julian Egyptien (smartdatahub.org) */
@Entity
@DiscriminatorValue(value = CodeBank.DISCRIMINATOR_VALUE)
public class CodeBank extends VlsFamGlobal2 implements Serializable, LiqCodeBank {

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
}
