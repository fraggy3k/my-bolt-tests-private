/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.dao;

import java.util.Collections;
import java.util.List;

import org.smartdatahub.liq.entity.interfaces.IdClassFamGlobal3;
import org.smartdatahub.liq.entity.original.VlsFamGlobal3;
import org.smartdatahub.liq.enums.VlsFamGlobal3Fields;
import org.springframework.stereotype.Component;

@Component
public class VlsFamGlobal3DAO extends AbstractJpaDAO<VlsFamGlobal3, IdClassFamGlobal3> {

  public VlsFamGlobal3DAO() {
    super(VlsFamGlobal3.class, IdClassFamGlobal3.class);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByCdeCode(String value) {
    return getFamGlobal3sByCdeCode(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByCdeCode(String value, int offset, int maxResults) {
    return getFamGlobal3sByCdeCode(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByCdeCode(List<String> values) {
    return getFamGlobal3sByCdeCode(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByCdeCode(
      List<String> values, int offset, int maxResults) {
    return getFamGlobal3sByColumnValue(VlsFamGlobal3Fields.cdeCode, values, offset, maxResults);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByCdeFkey1(String value) {
    return getFamGlobal3sByCdeFkey1(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByCdeFkey1(String value, int offset, int maxResults) {
    return getFamGlobal3sByCdeFkey1(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByCdeFkey1(List<String> values) {
    return getFamGlobal3sByCdeFkey1(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByCdeFkey1(
      List<String> values, int offset, int maxResults) {
    return getFamGlobal3sByColumnValue(VlsFamGlobal3Fields.cdeFkey1, values, offset, maxResults);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByTidTableId(String value) {
    return getFamGlobal3sByTidTableId(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByTidTableId(String value, int offset, int maxResults) {
    return getFamGlobal3sByTidTableId(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByTidTableId(List<String> values) {
    return getFamGlobal3sByTidTableId(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByTidTableId(
      List<String> values, int offset, int maxResults) {
    return getFamGlobal3sByColumnValue(VlsFamGlobal3Fields.tidTableId, values, offset, maxResults);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByDscCode(String value) {
    return getFamGlobal3sByDscCode(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByDscCode(String value, int offset, int maxResults) {
    return getFamGlobal3sByDscCode(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByDscCode(List<String> values) {
    return getFamGlobal3sByDscCode(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByDscCode(
      List<String> values, int offset, int maxResults) {
    return getFamGlobal3sByColumnValue(VlsFamGlobal3Fields.dscCode, values, offset, maxResults);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByUidRecCreate(String value) {
    return getFamGlobal3sByUidRecCreate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByUidRecCreate(
      String value, int offset, int maxResults) {
    return getFamGlobal3sByUidRecCreate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByUidRecCreate(List<String> values) {
    return getFamGlobal3sByUidRecCreate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByUidRecCreate(
      List<String> values, int offset, int maxResults) {
    return getFamGlobal3sByColumnValue(
        VlsFamGlobal3Fields.uidRecCreate, values, offset, maxResults);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByUidRecUpdate(String value) {
    return getFamGlobal3sByUidRecUpdate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByUidRecUpdate(
      String value, int offset, int maxResults) {
    return getFamGlobal3sByUidRecUpdate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByUidRecUpdate(List<String> values) {
    return getFamGlobal3sByUidRecUpdate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByUidRecUpdate(
      List<String> values, int offset, int maxResults) {
    return getFamGlobal3sByColumnValue(
        VlsFamGlobal3Fields.uidRecUpdate, values, offset, maxResults);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByColumnValue(
      VlsFamGlobal3Fields column, List<String> values, int offset, int maxResults) {
    return super.getByFieldsWithValue(
        column.getFieldName(),
        column.getLength(),
        values,
        column.isChar(),
        null,
        -1,
        null,
        false,
        offset,
        maxResults);
  }

  public List<VlsFamGlobal3> getFamGlobal3sByColumnValue(
      VlsFamGlobal3Fields column1,
      List<String> values1,
      VlsFamGlobal3Fields column2,
      List<String> values2,
      int offset,
      int maxResults) {
    return super.getByFieldsWithValue(
        column1.getFieldName(),
        column1.getLength(),
        values1,
        column1.isChar(),
        column2.getFieldName(),
        column2.getLength(),
        values2,
        column2.isChar(),
        offset,
        maxResults);
  }
}
