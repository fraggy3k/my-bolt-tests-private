/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/** @author Julian Egyptien (smartdatahub.org) */
public class IdClassFamGlo2Assoc implements Serializable {
  private static final long serialVersionUID = 1L;

  private String ridFg2Assoc;
  private String tidTableId;

  public IdClassFamGlo2Assoc() {}

  public IdClassFamGlo2Assoc(String ridFg2Assoc, String tidTableId) {
    this.ridFg2Assoc = StringUtils.rightPad(ridFg2Assoc, 8);
    this.tidTableId = StringUtils.rightPad(tidTableId, 3);
  }

  public String getRidFg2Assoc() {
    return ridFg2Assoc;
  }

  public String getTidTableId() {
    return tidTableId;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(ridFg2Assoc);
    builder.append(tidTableId);
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
    IdClassFamGlo2Assoc other = (IdClassFamGlo2Assoc) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.ridFg2Assoc, other.ridFg2Assoc);
    builder.append(this.tidTableId, other.tidTableId);
    return builder.isEquals();
  }
}
