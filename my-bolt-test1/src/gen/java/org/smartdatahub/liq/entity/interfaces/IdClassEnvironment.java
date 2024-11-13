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
 * Details of the user environment.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public class IdClassEnvironment implements Serializable {
  private static final long serialVersionUID = 1L;

  private String nmeVarClass;
  private String nmeVarName;

  public IdClassEnvironment() {}

  public IdClassEnvironment(String nmeVarClass, String nmeVarName) {
    this.nmeVarClass = StringUtils.rightPad(nmeVarClass, 8);
    this.nmeVarName = StringUtils.rightPad(nmeVarName, 32);
  }

  public String getNmeVarClass() {
    return nmeVarClass;
  }

  public String getNmeVarName() {
    return nmeVarName;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    builder.append(nmeVarClass);
    builder.append(nmeVarName);
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
    IdClassEnvironment other = (IdClassEnvironment) obj;
    EqualsBuilder builder = new EqualsBuilder();
    builder.append(this.nmeVarClass, other.nmeVarClass);
    builder.append(this.nmeVarName, other.nmeVarName);
    return builder.isEquals();
  }
}
