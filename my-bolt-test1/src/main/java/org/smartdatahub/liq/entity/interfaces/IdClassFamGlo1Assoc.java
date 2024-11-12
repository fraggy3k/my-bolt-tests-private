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
public class IdClassFamGlo1Assoc implements Serializable {
  private static final long serialVersionUID = 1L;

  private String cdeFkey1;
  private String cdeFkey2;
  private String tidTableId;

  public IdClassFamGlo1Assoc() {}

  public IdClassFamGlo1Assoc(String cdeFkey1, String cdeFkey2, String tidTableId) {
    this.cdeFkey1 = StringUtils.rightPad(cdeFkey1, 5);
    this.cdeFkey2 = StringUtils.rightPad(cdeFkey2, 5);
    this.tidTableId = StringUtils.rightPad(tidTableId, 3);
  }

  public String getCdeFkey1() {
    return cdeFkey1;
  }

  public String getCdeFkey2() {
    return cdeFkey2;
  }

  public String getTidTableId() {
    return tidTableId;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(cdeFkey1);
    builder.append(cdeFkey2);
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
    IdClassFamGlo1Assoc other = (IdClassFamGlo1Assoc) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cdeFkey1, other.cdeFkey1);
    builder.append(this.cdeFkey2, other.cdeFkey2);
    builder.append(this.tidTableId, other.tidTableId);
    return builder.isEquals();
  }
}
