/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.model.file;

import java.io.Serializable;

import javax.persistence.Id;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.utils.CompareHelper;
import org.smartdatahub.liq.entity.utils.EqualsSimpleFieldSupport;
import org.smartdatahub.liq.entity.utils.Identifiable;

/**
 * SELECT FAT_CDE_FAC_TYPE, FAT_IND_REVOLVER, FAT_IND_TERM, FROM blablabla
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public class CsvFacilityType
    implements Identifiable<String>, Serializable, EqualsSimpleFieldSupport<CsvFacilityType> {

  private static final long serialVersionUID = 1L;
  public static final String TABLE_ID = "FAT";

  @Id private /*4*/ String cdeFacType;
  private /*4*/ Boolean indRevolver;
  private /*4*/ Boolean indTerm;
  private /*4*/ String snapshotId;

  /**
   * Special Getter for the ID of this entity.
   *
   * @returns - the field <code>cdeFacType</code>
   */
  @Override
  public String getId() {
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

  /** */
  public String getSnapshotId() {
    return snapshotId;
  }

  /** Trimmed version of {@link #getSnapshotId()} */
  public String getSnapshotId_trimmed() {
    return (snapshotId == null) ? null : snapshotId.trim();
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

  /** */
  public void setSnapshotId(String snapshotId) {
    this.snapshotId = snapshotId;
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
    CsvFacilityType other = (CsvFacilityType) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cdeFacType, other.cdeFacType);
    return builder.isEquals();
  }

  @Override
  public CompareHelper equalsSimpleFields(CsvFacilityType other) {
    CompareHelper helper = new CompareHelper();
    helper.append("cdeFacType", this.cdeFacType, other.cdeFacType);
    helper.append("indRevolver", this.indRevolver, other.indRevolver);
    helper.append("indTerm", this.indTerm, other.indTerm);
    return helper;
  }
}
