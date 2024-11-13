/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import org.smartdatahub.liq.entity.utils.DomainObject;

/**
 * Details of the user environment.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
public interface LiqEnvironment extends DomainObject {

  public static final String TABLE_ID = "ENV";

  /**
   * Special Getter for the origin ID
   *
   * @returns - a IdClassEnvironment object
   */
  public IdClassEnvironment getOriginId();

  /** The name for the variable class. */
  public String getNmeVarClass();

  /** Trimmed version of {@link #getNmeVarClass()} */
  public String getNmeVarClass_trimmed();
  /** The variable name. */
  public String getNmeVarName();

  /** Trimmed version of {@link #getNmeVarName()} */
  public String getNmeVarName_trimmed();
  /** The comment describing the user environment. */
  public String getTxtComment();

  /** Trimmed version of {@link #getTxtComment()} */
  public String getTxtComment_trimmed();
  /** The text describing the possible values of the variable. */
  public String getTxtVarValue();

  /** Trimmed version of {@link #getTxtVarValue()} */
  public String getTxtVarValue_trimmed();
  /** */
  public LiqTimeRegion getLiqTimeRegion();
}
