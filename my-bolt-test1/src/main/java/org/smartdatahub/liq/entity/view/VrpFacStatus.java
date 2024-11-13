package org.smartdatahub.liq.entity.view;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.smartdatahub.liq.entity.utils.Identifiable;


@Entity
@Table(name = "VRP_FAC_STATUS")
public class VrpFacStatus implements Identifiable<String>, Serializable{ //, EqualsSimpleFieldSupport<VrpFacStatus> 

private static final long serialVersionUID = 1L;


  @Id
  @Column(name = "FSS_PID_FACILITY", nullable = false)
  private String pidFacility;
  
  @Column(name = "FSS_DSC_STATUS", nullable = false)
  private String dscStatus;


  /**
   * Special Getter for the ID of this entity.
   */
  @Override
  public String getId() {
    return pidFacility;
  }

  public String getDscStatus() {
    return dscStatus;
  }

  public String getDscStatus_trimmed() {
    return (dscStatus == null) ? null : dscStatus.trim();
  }
  
  public String getPidFacility() {
    return pidFacility;
  }

  public String getPidFacility_trimmed() {
    return (pidFacility == null) ? null : pidFacility.trim();
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(pidFacility);
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
    VrpFacStatus other = (VrpFacStatus) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.pidFacility, other.pidFacility);
    return builder.isEquals();
  }

}
