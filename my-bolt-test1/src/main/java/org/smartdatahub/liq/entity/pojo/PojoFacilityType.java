/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqFacilityType;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * The facililty type table (Please note VLS_FACILITY_TYPE is used and not the code table FAT.html -
 * facility type.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public class PojoFacilityType
    implements LiqFacilityType,
        Identifiable<String>,
        Serializable,
        EqualsSimpleFieldSupport<PojoFacilityType> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "FAT";

  @Id private /*4*/ String cdeFacType;
  private /*4*/ Boolean indRevolver;
  private /*4*/ Boolean indTerm;

  @Fetch(value = FetchMode.SUBSELECT)
  private List</*1*/ LiqFacility> liqFacilities;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - the field <code>cdeFacType</code>
   */
  @Override
  public String getId() {
    return cdeFacType;
  }
  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>cdeFacType</code>
   */
  @Override
  public String getOriginId() {
    return cdeFacType;
  }
  /** unique Id (copied) */
  public String getCdeFacType() {
    return cdeFacType;
  }

  /** Trimmed version of {@link #getCdeFacType()} */
  public String getCdeFacType_trimmed() {
    return (cdeFacType == null) ? null : cdeFacType.trim();
  }

  /** revolver (copied) */
  public Boolean getIndRevolver() {
    return indRevolver;
  }

  /** term */
  public Boolean getIndTerm() {
    return indTerm;
  }

  /** The facility table. A credit arrangement established by the bank for the client. */
  public List<LiqFacility> getLiqFacilities() {
    return nullIfNotFound(liqFacilities);
  }

  // Setter HERE
  /** unique Id (copied) */
  public void setCdeFacType(String cdeFacType) {
    this.cdeFacType = cdeFacType;
  }

  /** revolver (copied) */
  public void setIndRevolver(Boolean indRevolver) {
    this.indRevolver = indRevolver;
  }

  /** term */
  public void setIndTerm(Boolean indTerm) {
    this.indTerm = indTerm;
  }

  /** The facility table. A credit arrangement established by the bank for the client. */
  public void addLiqFacilities(List<PojoFacility> liqFacilities) {
    if (this.liqFacilities == null) {
      this.liqFacilities = new ArrayList<>(liqFacilities.size());
    }
    this.liqFacilities.addAll(liqFacilities);
    liqFacilities.forEach(e -> e.setLiqFacilityType(this));
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(cdeFacType);
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
    PojoFacilityType other = (PojoFacilityType) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cdeFacType, other.cdeFacType);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(PojoFacilityType other) {
    CompareHelper helper = new CompareHelper();
    helper.append("cdeFacType", this.cdeFacType, other.cdeFacType);
    helper.append("indRevolver", this.indRevolver, other.indRevolver);
    helper.append("indTerm", this.indTerm, other.indTerm);
    return helper;
  }
}
