/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.snapshot;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "SNAP_FACILITY_TYPE")
public class SnapshotFacilityType
    implements LiqFacilityType,
        Identifiable<String>,
        Serializable,
        EqualsSimpleFieldSupport<SnapshotFacilityType> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "FAT";

  @Id
  @Column(name = "ID", length = 35)
  private /*4*/ String id;

  @Column(name = "FAT_CDE_FAC_TYPE", nullable = false, length = 5)
  private /*4*/ String cdeFacType;

  @Column(name = "FAT_IND_REVOLVER", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indRevolver;

  @Column(name = "FAT_IND_TERM", nullable = false)
  @Convert(converter = BooleanToStringConverter.class)
  private /*4*/ Boolean indTerm;

  @Column(name = "SNAPSHOT_ID", length = 50)
  private /*4*/ String snapshotId;

  @ManyToOne(
      fetch = FetchType.LAZY,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "SNAPSHOT_INFO")
  private /*3*/ SnapshotInfo snapshotInfo;

  @Fetch(value = FetchMode.SUBSELECT)
  @OneToMany(
      mappedBy = "liqFacilityType",
      fetch = FetchType.LAZY,
      targetEntity = SnapshotFacility.class,
      cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
  private List</*1*/ LiqFacility> liqFacilities;

  /**
   * Special Getter for the origin ID
   *
   * @returns - the field <code>cdeFacType</code>
   */
  @Override
  public String getOriginId() {
    return cdeFacType;
  }
  /** */
  public String getId() {
    return id;
  }

  /** Trimmed version of {@link #getId()} */
  public String getId_trimmed() {
    return (id == null) ? null : id.trim();
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

  /** */
  public String getSnapshotId() {
    return snapshotId;
  }

  /** Trimmed version of {@link #getSnapshotId()} */
  public String getSnapshotId_trimmed() {
    return (snapshotId == null) ? null : snapshotId.trim();
  }

  /** */
  public SnapshotInfo getSnapshotInfo() {
    return snapshotInfo;
  }

  /** The facility table. A credit arrangement established by the bank for the client. */
  public List<LiqFacility> getLiqFacilities() {
    return nullIfNotFound(liqFacilities);
  }

  // Setter HERE
  /** */
  public void setId(String id) {
    this.id = id;
  }

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

  /** */
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
  }

  /** */
  public void setSnapshotInfo(SnapshotInfo snapshotInfo) {
    this.snapshotInfo = snapshotInfo;
  }

  /** The facility table. A credit arrangement established by the bank for the client. */
  public void addLiqFacilities(List<SnapshotFacility> liqFacilities) {
    if (this.liqFacilities == null) {
      this.liqFacilities = new ArrayList<>(liqFacilities.size());
    }
    this.liqFacilities.addAll(liqFacilities);
    liqFacilities.forEach(e -> e.setLiqFacilityType(this));
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(id);
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
    SnapshotFacilityType other = (SnapshotFacilityType) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.id, other.id);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(SnapshotFacilityType other) {
    CompareHelper helper = new CompareHelper();
    helper.append("cdeFacType", this.cdeFacType, other.cdeFacType);
    helper.append("indRevolver", this.indRevolver, other.indRevolver);
    helper.append("indTerm", this.indTerm, other.indTerm);
    return helper;
  }
}
