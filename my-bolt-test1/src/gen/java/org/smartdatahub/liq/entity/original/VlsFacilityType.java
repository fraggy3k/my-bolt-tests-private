/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.original;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqFacilityType;
import org.smartdatahub.liq.entity.utils.BooleanToStringConverter;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * The facililty type table (Please note VLS_FACILITY_TYPE is used and not the code table FAT.html -
 * facility type.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@Entity
@Table(name = "VLS_FACILITY_TYPE")
public class VlsFacilityType
    implements LiqFacilityType,
        Identifiable<String>,
        Serializable,
        EqualsSimpleFieldSupport<VlsFacilityType> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "FAT";

  @Column(name = "FAT_CDE_FAC_TYPE", nullable = false, length = 5)
  @Id
  private /*4*/ String cdeFacType;

  @Column(name = "FAT_IND_REVOLVER", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indRevolver;

  @Column(name = "FAT_IND_TERM", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indTerm;

  @Fetch(value = FetchMode.SUBSELECT)
  @OneToMany(mappedBy = "liqFacilityType", fetch = FetchType.LAZY, targetEntity = VlsFacility.class)
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
    VlsFacilityType other = (VlsFacilityType) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cdeFacType, other.cdeFacType);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(VlsFacilityType other) {
    CompareHelper helper = new CompareHelper();
    helper.append("cdeFacType", this.cdeFacType, other.cdeFacType);
    helper.append("indRevolver", this.indRevolver, other.indRevolver);
    helper.append("indTerm", this.indTerm, other.indTerm);
    return helper;
  }
}
