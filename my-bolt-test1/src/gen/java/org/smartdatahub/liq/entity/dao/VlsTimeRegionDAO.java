/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.dao;

import java.util.Collections;
import java.util.List;

import org.smartdatahub.liq.entity.original.VlsTimeRegion;
import org.smartdatahub.liq.enums.VlsTimeRegionFields;
import org.springframework.stereotype.Component;

/** @author Julian Egyptien (smartdatahub.org) */
@Component
public class VlsTimeRegionDAO extends AbstractJpaDAO<VlsTimeRegion, String> {

  public VlsTimeRegionDAO() {
    super(VlsTimeRegion.class, String.class);
  }

  public List<VlsTimeRegion> getTimeRegionsByCdeCode(String value) {
    return getTimeRegionsByCdeCode(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsTimeRegion> getTimeRegionsByCdeCode(String value, int offset, int maxResults) {
    return getTimeRegionsByCdeCode(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsTimeRegion> getTimeRegionsByCdeCode(List<String> values) {
    return getTimeRegionsByCdeCode(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsTimeRegion> getTimeRegionsByCdeCode(
      List<String> values, int offset, int maxResults) {
    return getTimeRegionsByColumnValue(VlsTimeRegionFields.cdeCode, values, offset, maxResults);
  }

  public List<VlsTimeRegion> getTimeRegionsByDscCode(String value) {
    return getTimeRegionsByDscCode(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsTimeRegion> getTimeRegionsByDscCode(String value, int offset, int maxResults) {
    return getTimeRegionsByDscCode(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsTimeRegion> getTimeRegionsByDscCode(List<String> values) {
    return getTimeRegionsByDscCode(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsTimeRegion> getTimeRegionsByDscCode(
      List<String> values, int offset, int maxResults) {
    return getTimeRegionsByColumnValue(VlsTimeRegionFields.dscCode, values, offset, maxResults);
  }

  public List<VlsTimeRegion> getTimeRegionsByUidRecCreate(String value) {
    return getTimeRegionsByUidRecCreate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsTimeRegion> getTimeRegionsByUidRecCreate(
      String value, int offset, int maxResults) {
    return getTimeRegionsByUidRecCreate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsTimeRegion> getTimeRegionsByUidRecCreate(List<String> values) {
    return getTimeRegionsByUidRecCreate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsTimeRegion> getTimeRegionsByUidRecCreate(
      List<String> values, int offset, int maxResults) {
    return getTimeRegionsByColumnValue(
        VlsTimeRegionFields.uidRecCreate, values, offset, maxResults);
  }

  public List<VlsTimeRegion> getTimeRegionsByUidRecUpdate(String value) {
    return getTimeRegionsByUidRecUpdate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsTimeRegion> getTimeRegionsByUidRecUpdate(
      String value, int offset, int maxResults) {
    return getTimeRegionsByUidRecUpdate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsTimeRegion> getTimeRegionsByUidRecUpdate(List<String> values) {
    return getTimeRegionsByUidRecUpdate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsTimeRegion> getTimeRegionsByUidRecUpdate(
      List<String> values, int offset, int maxResults) {
    return getTimeRegionsByColumnValue(
        VlsTimeRegionFields.uidRecUpdate, values, offset, maxResults);
  }

  public List<VlsTimeRegion> getTimeRegionsByColumnValue(
      VlsTimeRegionFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsTimeRegion> getTimeRegionsByColumnValue(
      VlsTimeRegionFields column1,
      List<String> values1,
      VlsTimeRegionFields column2,
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
