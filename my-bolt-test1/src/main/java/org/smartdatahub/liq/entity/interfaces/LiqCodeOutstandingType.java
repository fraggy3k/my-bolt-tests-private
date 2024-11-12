/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import org.smartdatahub.liq.entity.utils.LiqFamGlobal2;

/** @author Julian Egyptien (smartdatahub.org) */
public interface LiqCodeOutstandingType extends LiqFamGlobal2 {

  /** Code */
  public String getCode();

  /** Trimmed version of {@link #getCode */
  public String getCode_trimmed();
  /** Description */
  public String getDescription();

  /** Trimmed version of {@link #getDescription */
  public String getDescription_trimmed();
  /** */
  public Boolean getActive();

  /** */
  public Boolean getMayDeactivate();

  /** Affects Aggregate Outstandings */
  public Boolean getAffectsAggregateOutstandings();

  /** Include in Bills */
  public Boolean getIncludeInBills();

  /** Include in Payoff Statements */
  public Boolean getIncludeInPayoffStatements();

  /** Is Swappable */
  public Boolean getIsSwappable();

  /** Allows Short Settlement */
  public Boolean getAllowsShortSettlement();

  /** Eligible for MultiCCY Discount */
  public Boolean getEligibleForMulticcyDiscount();

  /** Background Only */
  public Boolean getBackgroundOnly();

  /** Allows Foreign Currency Indexed Working Capital */
  public Boolean getAllowsForeignCurrencyIndexedWorkingCapital();

  /** Map Post-Maturity Interest Receivables Separately */
  public Boolean getMapPostmaturityInterestReceivablesSeparately();
}
