/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.dao;

import java.util.Collections;
import java.util.List;

import org.smartdatahub.liq.entity.original.VlsFacilityAdmin;
import org.smartdatahub.liq.enums.VlsFacilityAdminFields;
import org.springframework.stereotype.Component;

/** @author Julian Egyptien (smartdatahub.org) */
@Component
public class VlsFacilityAdminDAO extends AbstractJpaDAO<VlsFacilityAdmin, String> {

  public VlsFacilityAdminDAO() {
    super(VlsFacilityAdmin.class, String.class);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByRidAdmin(String value) {
    return getFacilityAdminsByRidAdmin(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByRidAdmin(
      String value, int offset, int maxResults) {
    return getFacilityAdminsByRidAdmin(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByRidAdmin(List<String> values) {
    return getFacilityAdminsByRidAdmin(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByRidAdmin(
      List<String> values, int offset, int maxResults) {
    return getFacilityAdminsByColumnValue(
        VlsFacilityAdminFields.ridAdmin, values, offset, maxResults);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByPidFacility(String value) {
    return getFacilityAdminsByPidFacility(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByPidFacility(
      String value, int offset, int maxResults) {
    return getFacilityAdminsByPidFacility(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByPidFacility(List<String> values) {
    return getFacilityAdminsByPidFacility(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByPidFacility(
      List<String> values, int offset, int maxResults) {
    return getFacilityAdminsByColumnValue(
        VlsFacilityAdminFields.pidFacility, values, offset, maxResults);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByRidFaxGroup(String value) {
    return getFacilityAdminsByRidFaxGroup(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByRidFaxGroup(
      String value, int offset, int maxResults) {
    return getFacilityAdminsByRidFaxGroup(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByRidFaxGroup(List<String> values) {
    return getFacilityAdminsByRidFaxGroup(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByRidFaxGroup(
      List<String> values, int offset, int maxResults) {
    return getFacilityAdminsByColumnValue(
        VlsFacilityAdminFields.ridFaxGroup, values, offset, maxResults);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByUidRecCreate(String value) {
    return getFacilityAdminsByUidRecCreate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByUidRecCreate(
      String value, int offset, int maxResults) {
    return getFacilityAdminsByUidRecCreate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByUidRecCreate(List<String> values) {
    return getFacilityAdminsByUidRecCreate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByUidRecCreate(
      List<String> values, int offset, int maxResults) {
    return getFacilityAdminsByColumnValue(
        VlsFacilityAdminFields.uidRecCreate, values, offset, maxResults);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByUidRecUpdate(String value) {
    return getFacilityAdminsByUidRecUpdate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByUidRecUpdate(
      String value, int offset, int maxResults) {
    return getFacilityAdminsByUidRecUpdate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByUidRecUpdate(List<String> values) {
    return getFacilityAdminsByUidRecUpdate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByUidRecUpdate(
      List<String> values, int offset, int maxResults) {
    return getFacilityAdminsByColumnValue(
        VlsFacilityAdminFields.uidRecUpdate, values, offset, maxResults);
  }

  public List<VlsFacilityAdmin> getFacilityAdminsByColumnValue(
      VlsFacilityAdminFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsFacilityAdmin> getFacilityAdminsByColumnValue(
      VlsFacilityAdminFields column1,
      List<String> values1,
      VlsFacilityAdminFields column2,
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
