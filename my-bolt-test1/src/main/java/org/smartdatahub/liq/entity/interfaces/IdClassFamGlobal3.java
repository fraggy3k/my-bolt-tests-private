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
public class IdClassFamGlobal3 implements Serializable {
  private static final long serialVersionUID = 1L;

  private String cdeCode;
  private String cdeFkey1;
  private String tidTableId;

  public IdClassFamGlobal3() {}

  public IdClassFamGlobal3(String cdeCode, String cdeFkey1, String tidTableId) {
    this.cdeCode = StringUtils.rightPad(cdeCode, 5);
    this.cdeFkey1 = StringUtils.rightPad(cdeFkey1, 5);
    this.tidTableId = StringUtils.rightPad(tidTableId, 3);
  }

  public String getCdeCode() {
    return cdeCode;
  }

  public String getCdeFkey1() {
    return cdeFkey1;
  }

  public String getTidTableId() {
    return tidTableId;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(cdeCode);
    builder.append(cdeFkey1);
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
    IdClassFamGlobal3 other = (IdClassFamGlobal3) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.cdeCode, other.cdeCode);
    builder.append(this.cdeFkey1, other.cdeFkey1);
    builder.append(this.tidTableId, other.tidTableId);
    return builder.isEquals();
  }
}
