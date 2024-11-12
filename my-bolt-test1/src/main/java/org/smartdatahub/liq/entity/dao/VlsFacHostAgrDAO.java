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
import org.smartdatahub.liq.entity.interfaces.IdClassFacHostAgr;
import org.smartdatahub.liq.entity.original.VlsFacHostAgr;
import org.smartdatahub.liq.enums.VlsFacHostAgrFields;
import org.springframework.stereotype.Component;

@Component
public class VlsFacHostAgrDAO extends AbstractJpaDAO<VlsFacHostAgr, IdClassFacHostAgr> {

  public VlsFacHostAgrDAO() {
    super(VlsFacHostAgr.class, IdClassFacHostAgr.class);
  }

  private static String QUERY_BY_DEAL =
      "select e from VlsFacHostAgr e where e.liqDeal.pidDeal in (:deaPidDealList)";
  private static String QUERY_BY_FACILITY =
      "select e from VlsFacHostAgr e where e.liqFacility.pidFacility in (:facPidFacilityList)";

  public List<VlsFacHostAgr> getFacHostAgrsByPidDeal(String value) {
    return getFacHostAgrsByPidDeal(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByPidDeal(String value, int offset, int maxResults) {
    return getFacHostAgrsByPidDeal(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByPidDeal(List<String> values) {
    return getFacHostAgrsByPidDeal(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByPidDeal(
      List<String> values, int offset, int maxResults) {
    return getFacHostAgrsByColumnValue(VlsFacHostAgrFields.pidDeal, values, offset, maxResults);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByPidFacility(String value) {
    return getFacHostAgrsByPidFacility(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByPidFacility(String value, int offset, int maxResults) {
    return getFacHostAgrsByPidFacility(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByPidFacility(List<String> values) {
    return getFacHostAgrsByPidFacility(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByPidFacility(
      List<String> values, int offset, int maxResults) {
    return getFacHostAgrsByColumnValue(VlsFacHostAgrFields.pidFacility, values, offset, maxResults);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByUidRecCreate(String value) {
    return getFacHostAgrsByUidRecCreate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByUidRecCreate(
      String value, int offset, int maxResults) {
    return getFacHostAgrsByUidRecCreate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByUidRecCreate(List<String> values) {
    return getFacHostAgrsByUidRecCreate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByUidRecCreate(
      List<String> values, int offset, int maxResults) {
    return getFacHostAgrsByColumnValue(
        VlsFacHostAgrFields.uidRecCreate, values, offset, maxResults);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByUidRecUpdate(String value) {
    return getFacHostAgrsByUidRecUpdate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByUidRecUpdate(
      String value, int offset, int maxResults) {
    return getFacHostAgrsByUidRecUpdate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByUidRecUpdate(List<String> values) {
    return getFacHostAgrsByUidRecUpdate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByUidRecUpdate(
      List<String> values, int offset, int maxResults) {
    return getFacHostAgrsByColumnValue(
        VlsFacHostAgrFields.uidRecUpdate, values, offset, maxResults);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByDeal(String deaPidDeal) {
    return getFacHostAgrsByDeal(Collections.singletonList(deaPidDeal), 0, Integer.MAX_VALUE);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByDeal(String deaPidDeal, int offset, int maxResults) {
    return getFacHostAgrsByDeal(Collections.singletonList(deaPidDeal), offset, maxResults);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByDeal(List<String> deaPidDealList) {
    return getFacHostAgrsByDeal(deaPidDealList, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByDeal(
      List<String> deaPidDealList, int offset, int maxResults) {
    TypedQuery<VlsFacHostAgr> query = createQuery(QUERY_BY_DEAL);
    List<String> list =
        deaPidDealList.stream().map(s -> StringUtils.rightPad(s, 8)).collect(Collectors.toList());
    query.setParameter("deaPidDealList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsFacHostAgr> getFacHostAgrsByFacility(String facPidFacility) {
    return getFacHostAgrsByFacility(
        Collections.singletonList(facPidFacility), 0, Integer.MAX_VALUE);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByFacility(
      String facPidFacility, int offset, int maxResults) {
    return getFacHostAgrsByFacility(Collections.singletonList(facPidFacility), offset, maxResults);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByFacility(List<String> facPidFacilityList) {
    return getFacHostAgrsByFacility(facPidFacilityList, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacHostAgr> getFacHostAgrsByFacility(
      List<String> facPidFacilityList, int offset, int maxResults) {
    TypedQuery<VlsFacHostAgr> query = createQuery(QUERY_BY_FACILITY);
    List<String> list =
        facPidFacilityList.stream()
            .map(s -> StringUtils.rightPad(s, 8))
            .collect(Collectors.toList());
    query.setParameter("facPidFacilityList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsFacHostAgr> getFacHostAgrsByColumnValue(
      VlsFacHostAgrFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsFacHostAgr> getFacHostAgrsByColumnValue(
      VlsFacHostAgrFields column1,
      List<String> values1,
      VlsFacHostAgrFields column2,
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
