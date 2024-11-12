/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.model.file;

import java.io.Serializable;

/**
 * SELECT GB2_CDE_CODE, GB2_DSC_CODE, GB2_IND_ACTIVE, GB2_IND_MAY_DEACT, GB2_IND_OPTIONAL_1,
 * GB2_IND_OPTIONAL_2, GB2_IND_OPTIONAL_3, GB2_IND_OPTIONAL_4, GB2_IND_OPTIONAL_5,
 * GB2_IND_OPTIONAL_6, GB2_IND_OPTIONAL_7, GB2_IND_OPTIONAL_8, GB2_IND_OPTIONAL_9, GB2_TID_TABLE_ID,
 * GB2_TSP_REC_UPDATE, GB2_UID_REC_UPDATE, FROM blablabla
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public class CsvCodeOutstandingType extends CsvFamGlobal2 implements Serializable {

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

  /** Code */
  public void setCode(String value) {
    setCdeCode(value);
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
  /** Affects Aggregate Outstandings */
  public void setAffectsAggregateOutstandings(Boolean value) {
    super.setIndOptional1(value);
  }
  /** Include in Bills */
  public void setIncludeInBills(Boolean value) {
    super.setIndOptional2(value);
  }
  /** Include in Payoff Statements */
  public void setIncludeInPayoffStatements(Boolean value) {
    super.setIndOptional3(value);
  }
  /** Is Swappable */
  public void setIsSwappable(Boolean value) {
    super.setIndOptional4(value);
  }
  /** Allows Short Settlement */
  public void setAllowsShortSettlement(Boolean value) {
    super.setIndOptional5(value);
  }
  /** Eligible for MultiCCY Discount */
  public void setEligibleForMulticcyDiscount(Boolean value) {
    super.setIndOptional6(value);
  }
  /** Background Only */
  public void setBackgroundOnly(Boolean value) {
    super.setIndOptional7(value);
  }
  /** Allows Foreign Currency Indexed Working Capital */
  public void setAllowsForeignCurrencyIndexedWorkingCapital(Boolean value) {
    super.setIndOptional8(value);
  }
  /** Map Post-Maturity Interest Receivables Separately */
  public void setMapPostmaturityInterestReceivablesSeparately(Boolean value) {
    super.setIndOptional9(value);
  }
}
