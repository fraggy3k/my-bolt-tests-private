/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.interfaces;

import java.math.BigDecimal;
import java.util.Date;

import org.smartdatahub.liq.entity.utils.DomainObject;

/** @author Julian Egyptien (smartdatahub.org) */
public interface LiqFamGlobal3 extends DomainObject {

  public static final String TABLE_ID = "GB3";

  /**
   * Special Getter for the origin ID
   *
   * @returns - a IdClassFamGlobal3 object
   */
  public IdClassFamGlobal3 getOriginId();

  /** */
  public String getCdeCode();

  /** Trimmed version of {@link #getCdeCode()} */
  public String getCdeCode_trimmed();
  /** */
  public String getCdeFkey1();

  /** Trimmed version of {@link #getCdeFkey1()} */
  public String getCdeFkey1_trimmed();
  /** */
  public String getDscCode();

  /** Trimmed version of {@link #getDscCode()} */
  public String getDscCode_trimmed();
  /** */
  public Boolean getIndActive();
  /** */
  public Boolean getIndMayDeact();
  /** */
  public Boolean getIndOptional1();
  /** */
  public Boolean getIndOptional2();
  /** */
  public BigDecimal getRtoOptional();
  /** */
  public BigDecimal getRtoOptional1();
  /** */
  public String getTidTableId();

  /** Trimmed version of {@link #getTidTableId()} */
  public String getTidTableId_trimmed();
  /** */
  public Date getTspRecCreate();
  /** */
  public Date getTspRecUpdate();
  /** */
  public String getUidRecCreate();

  /** Trimmed version of {@link #getUidRecCreate()} */
  public String getUidRecCreate_trimmed();
  /** */
  public String getUidRecUpdate();

  /** Trimmed version of {@link #getUidRecUpdate()} */
  public String getUidRecUpdate_trimmed();
}
