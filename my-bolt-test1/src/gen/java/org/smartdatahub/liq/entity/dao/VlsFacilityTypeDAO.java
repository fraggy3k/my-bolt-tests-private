/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.dao;

import java.util.Collections;
import java.util.List;

import org.smartdatahub.liq.entity.original.VlsFacilityType;
import org.smartdatahub.liq.enums.VlsFacilityTypeFields;
import org.springframework.stereotype.Component;

/** @author Julian Egyptien (smartdatahub.org) */
@Component
public class VlsFacilityTypeDAO extends AbstractJpaDAO<VlsFacilityType, String> {

  public VlsFacilityTypeDAO() {
    super(VlsFacilityType.class, String.class);
  }

  public List<VlsFacilityType> getFacilityTypesByCdeFacType(String value) {
    return getFacilityTypesByCdeFacType(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacilityType> getFacilityTypesByCdeFacType(
      String value, int offset, int maxResults) {
    return getFacilityTypesByCdeFacType(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacilityType> getFacilityTypesByCdeFacType(List<String> values) {
    return getFacilityTypesByCdeFacType(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacilityType> getFacilityTypesByCdeFacType(
      List<String> values, int offset, int maxResults) {
    return getFacilityTypesByColumnValue(
        VlsFacilityTypeFields.cdeFacType, values, offset, maxResults);
  }

  public List<VlsFacilityType> getFacilityTypesByColumnValue(
      VlsFacilityTypeFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsFacilityType> getFacilityTypesByColumnValue(
      VlsFacilityTypeFields column1,
      List<String> values1,
      VlsFacilityTypeFields column2,
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
