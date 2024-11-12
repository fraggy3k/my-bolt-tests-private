/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * The facility host bank agregation. Finstra version was almost empty -> filled by best knowledge
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public class IdClassFacHostAgr implements Serializable {
  private static final long serialVersionUID = 1L;

  private String pidDeal;
  private String pidFacility;

  public IdClassFacHostAgr() {}

  public IdClassFacHostAgr(String pidDeal, String pidFacility) {
    this.pidDeal = StringUtils.rightPad(pidDeal, 8);
    this.pidFacility = StringUtils.rightPad(pidFacility, 8);
  }

  public String getPidDeal() {
    return pidDeal;
  }

  public String getPidFacility() {
    return pidFacility;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(pidDeal);
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
    IdClassFacHostAgr other = (IdClassFacHostAgr) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.pidDeal, other.pidDeal);
    builder.append(this.pidFacility, other.pidFacility);
    return builder.isEquals();
  }
}
