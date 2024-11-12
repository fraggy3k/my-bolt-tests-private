/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.original;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.smartdatahub.liq.entity.interfaces.LiqCodeOutstandingType;

/** @author Julian Egyptien (smartdatahub.org) */
@Entity
@DiscriminatorValue(value = CodeOutstandingType.DISCRIMINATOR_VALUE)
public class CodeOutstandingType extends VlsFamGlobal2
    implements Serializable, LiqCodeOutstandingType {

  public static final /*4*/ String DISCRIMINATOR_VALUE = "OUT";
  public static final /*4*/ String QUOTED_DISCRIMINATOR_VALUE = "'OUT'";

  /** Code */
  public String getCode() {
    return getCdeCode();
  }

  /** Trimmed version of {@link #getCode */
  public String getCode_trimmed() {
    return (getCdeCode() == null) ? null : getCdeCode().trim();
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

  /** Affects Aggregate Outstandings */
  public Boolean getAffectsAggregateOutstandings() {
    return super.getIndOptional1();
  }

  /** Include in Bills */
  public Boolean getIncludeInBills() {
    return super.getIndOptional2();
  }

  /** Include in Payoff Statements */
  public Boolean getIncludeInPayoffStatements() {
    return super.getIndOptional3();
  }

  /** Is Swappable */
  public Boolean getIsSwappable() {
    return super.getIndOptional4();
  }

  /** Allows Short Settlement */
  public Boolean getAllowsShortSettlement() {
    return super.getIndOptional5();
  }

  /** Eligible for MultiCCY Discount */
  public Boolean getEligibleForMulticcyDiscount() {
    return super.getIndOptional6();
  }

  /** Background Only */
  public Boolean getBackgroundOnly() {
    return super.getIndOptional7();
  }

  /** Allows Foreign Currency Indexed Working Capital */
  public Boolean getAllowsForeignCurrencyIndexedWorkingCapital() {
    return super.getIndOptional8();
  }

  /** Map Post-Maturity Interest Receivables Separately */
  public Boolean getMapPostmaturityInterestReceivablesSeparately() {
    return super.getIndOptional9();
  }
}
