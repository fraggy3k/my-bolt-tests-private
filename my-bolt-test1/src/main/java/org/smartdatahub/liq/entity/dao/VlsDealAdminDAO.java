/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.entity.dao;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.TypedQuery;

import org.apache.commons.lang3.StringUtils;
import org.smartdatahub.liq.entity.original.VlsDealAdmin;
import org.smartdatahub.liq.enums.VlsDealAdminFields;
import org.springframework.stereotype.Component;

/** @author Julian Egyptien (smartdatahub.org) */
@Component
public class VlsDealAdminDAO extends AbstractJpaDAO<VlsDealAdmin, String> {

  public VlsDealAdminDAO() {
    super(VlsDealAdmin.class, String.class);
  }

  private static String QUERY_BY_CUSTOMER =
      "select e from VlsDealAdmin e where e.liqCustomer.cidCustId in (:cusCidCustIdList)";

  public List<VlsDealAdmin> getDealAdminsByPidDeal(String value) {
    return getDealAdminsByPidDeal(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealAdmin> getDealAdminsByPidDeal(String value, int offset, int maxResults) {
    return getDealAdminsByPidDeal(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDealAdmin> getDealAdminsByPidDeal(List<String> values) {
    return getDealAdminsByPidDeal(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealAdmin> getDealAdminsByPidDeal(
      List<String> values, int offset, int maxResults) {
    return getDealAdminsByColumnValue(VlsDealAdminFields.pidDeal, values, offset, maxResults);
  }

  public List<VlsDealAdmin> getDealAdminsByCidCustId(String value) {
    return getDealAdminsByCidCustId(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealAdmin> getDealAdminsByCidCustId(String value, int offset, int maxResults) {
    return getDealAdminsByCidCustId(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDealAdmin> getDealAdminsByCidCustId(List<String> values) {
    return getDealAdminsByCidCustId(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealAdmin> getDealAdminsByCidCustId(
      List<String> values, int offset, int maxResults) {
    return getDealAdminsByColumnValue(VlsDealAdminFields.cidCustId, values, offset, maxResults);
  }

  public List<VlsDealAdmin> getDealAdminsByRidFaxGroup(String value) {
    return getDealAdminsByRidFaxGroup(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealAdmin> getDealAdminsByRidFaxGroup(String value, int offset, int maxResults) {
    return getDealAdminsByRidFaxGroup(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDealAdmin> getDealAdminsByRidFaxGroup(List<String> values) {
    return getDealAdminsByRidFaxGroup(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealAdmin> getDealAdminsByRidFaxGroup(
      List<String> values, int offset, int maxResults) {
    return getDealAdminsByColumnValue(VlsDealAdminFields.ridFaxGroup, values, offset, maxResults);
  }

  public List<VlsDealAdmin> getDealAdminsByRidLocation(String value) {
    return getDealAdminsByRidLocation(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealAdmin> getDealAdminsByRidLocation(String value, int offset, int maxResults) {
    return getDealAdminsByRidLocation(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDealAdmin> getDealAdminsByRidLocation(List<String> values) {
    return getDealAdminsByRidLocation(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealAdmin> getDealAdminsByRidLocation(
      List<String> values, int offset, int maxResults) {
    return getDealAdminsByColumnValue(VlsDealAdminFields.ridLocation, values, offset, maxResults);
  }

  public List<VlsDealAdmin> getDealAdminsByUidRecCreate(String value) {
    return getDealAdminsByUidRecCreate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealAdmin> getDealAdminsByUidRecCreate(String value, int offset, int maxResults) {
    return getDealAdminsByUidRecCreate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDealAdmin> getDealAdminsByUidRecCreate(List<String> values) {
    return getDealAdminsByUidRecCreate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealAdmin> getDealAdminsByUidRecCreate(
      List<String> values, int offset, int maxResults) {
    return getDealAdminsByColumnValue(VlsDealAdminFields.uidRecCreate, values, offset, maxResults);
  }

  public List<VlsDealAdmin> getDealAdminsByUidRecUpdate(String value) {
    return getDealAdminsByUidRecUpdate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealAdmin> getDealAdminsByUidRecUpdate(String value, int offset, int maxResults) {
    return getDealAdminsByUidRecUpdate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDealAdmin> getDealAdminsByUidRecUpdate(List<String> values) {
    return getDealAdminsByUidRecUpdate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealAdmin> getDealAdminsByUidRecUpdate(
      List<String> values, int offset, int maxResults) {
    return getDealAdminsByColumnValue(VlsDealAdminFields.uidRecUpdate, values, offset, maxResults);
  }

  public List<VlsDealAdmin> getDealAdminsByCustomer(String cusCidCustId) {
    return getDealAdminsByCustomer(Collections.singletonList(cusCidCustId), 0, Integer.MAX_VALUE);
  }

  public List<VlsDealAdmin> getDealAdminsByCustomer(
      String cusCidCustId, int offset, int maxResults) {
    return getDealAdminsByCustomer(Collections.singletonList(cusCidCustId), offset, maxResults);
  }

  public List<VlsDealAdmin> getDealAdminsByCustomer(List<String> cusCidCustIdList) {
    return getDealAdminsByCustomer(cusCidCustIdList, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealAdmin> getDealAdminsByCustomer(
      List<String> cusCidCustIdList, int offset, int maxResults) {
    TypedQuery<VlsDealAdmin> query = createQuery(QUERY_BY_CUSTOMER);
    List<String> list =
        cusCidCustIdList.stream().map(s -> StringUtils.rightPad(s, 8)).collect(Collectors.toList());
    query.setParameter("cusCidCustIdList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsDealAdmin> getDealAdminsByColumnValue(
      VlsDealAdminFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsDealAdmin> getDealAdminsByColumnValue(
      VlsDealAdminFields column1,
      List<String> values1,
      VlsDealAdminFields column2,
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
