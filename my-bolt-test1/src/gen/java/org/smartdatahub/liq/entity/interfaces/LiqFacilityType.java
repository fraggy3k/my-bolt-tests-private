/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import java.util.List;

import org.smartdatahub.liq.entity.utils.DomainObject;

/**
 * The facililty type table (Please note VLS_FACILITY_TYPE is used and not the code table FAT.html -
 * facility type.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public interface LiqFacilityType extends DomainObject {

  public static final String TABLE_ID = "FAT";

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>cdeFacType</code>
   */
  public String getOriginId();

  /** unique Id (copied) */
  public String getCdeFacType();

  /** Trimmed version of {@link #getCdeFacType()} */
  public String getCdeFacType_trimmed();
  /** revolver (copied) */
  public Boolean getIndRevolver();
  /** term */
  public Boolean getIndTerm();
  /** The facility table. A credit arrangement established by the bank for the client. */
  public List<LiqFacility> getLiqFacilities();
}
