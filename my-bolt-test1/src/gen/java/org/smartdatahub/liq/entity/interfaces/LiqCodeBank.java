/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import org.smartdatahub.liq.entity.utils.LiqFamGlobal2;

/** @author Julian Egyptien (smartdatahub.org) */
public interface LiqCodeBank extends LiqFamGlobal2 {

  /** Code */
  public String getCode();

  /** Trimmed version of {@link #getCode */
  public String getCode_trimmed();
  /** Currency */
  public String getCurrency();

  /** Trimmed version of {@link #getCurrency */
  public String getCurrency_trimmed();
  /** Description */
  public String getDescription();

  /** Trimmed version of {@link #getDescription */
  public String getDescription_trimmed();
  /** */
  public Boolean getActive();

  /** */
  public Boolean getMayDeactivate();
}
