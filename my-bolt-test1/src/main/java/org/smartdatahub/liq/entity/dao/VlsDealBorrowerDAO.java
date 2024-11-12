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
import org.smartdatahub.liq.entity.original.VlsDealBorrower;
import org.smartdatahub.liq.enums.VlsDealBorrowerFields;
import org.springframework.stereotype.Component;

/** @author Julian Egyptien (smartdatahub.org) */
@Component
public class VlsDealBorrowerDAO extends AbstractJpaDAO<VlsDealBorrower, String> {

  public VlsDealBorrowerDAO() {
    super(VlsDealBorrower.class, String.class);
  }

  private static String QUERY_BY_CUSTOMER =
      "select e from VlsDealBorrower e where e.liqCustomer.cidCustId in (:cusCidCustIdList)";
  private static String QUERY_BY_DEAL =
      "select e from VlsDealBorrower e where e.liqDeal.pidDeal in (:deaPidDealList)";

  public List<VlsDealBorrower> getDealBorrowersByRidDealBorr(String value) {
    return getDealBorrowersByRidDealBorr(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByRidDealBorr(
      String value, int offset, int maxResults) {
    return getDealBorrowersByRidDealBorr(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByRidDealBorr(List<String> values) {
    return getDealBorrowersByRidDealBorr(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByRidDealBorr(
      List<String> values, int offset, int maxResults) {
    return getDealBorrowersByColumnValue(
        VlsDealBorrowerFields.ridDealBorr, values, offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByCidCustId(String value) {
    return getDealBorrowersByCidCustId(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByCidCustId(
      String value, int offset, int maxResults) {
    return getDealBorrowersByCidCustId(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByCidCustId(List<String> values) {
    return getDealBorrowersByCidCustId(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByCidCustId(
      List<String> values, int offset, int maxResults) {
    return getDealBorrowersByColumnValue(
        VlsDealBorrowerFields.cidCustId, values, offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByPidDeal(String value) {
    return getDealBorrowersByPidDeal(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByPidDeal(String value, int offset, int maxResults) {
    return getDealBorrowersByPidDeal(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByPidDeal(List<String> values) {
    return getDealBorrowersByPidDeal(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByPidDeal(
      List<String> values, int offset, int maxResults) {
    return getDealBorrowersByColumnValue(VlsDealBorrowerFields.pidDeal, values, offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByRidCusSvcGr(String value) {
    return getDealBorrowersByRidCusSvcGr(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByRidCusSvcGr(
      String value, int offset, int maxResults) {
    return getDealBorrowersByRidCusSvcGr(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByRidCusSvcGr(List<String> values) {
    return getDealBorrowersByRidCusSvcGr(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByRidCusSvcGr(
      List<String> values, int offset, int maxResults) {
    return getDealBorrowersByColumnValue(
        VlsDealBorrowerFields.ridCusSvcGr, values, offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByRidLocation(String value) {
    return getDealBorrowersByRidLocation(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByRidLocation(
      String value, int offset, int maxResults) {
    return getDealBorrowersByRidLocation(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByRidLocation(List<String> values) {
    return getDealBorrowersByRidLocation(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByRidLocation(
      List<String> values, int offset, int maxResults) {
    return getDealBorrowersByColumnValue(
        VlsDealBorrowerFields.ridLocation, values, offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByUidRecCreate(String value) {
    return getDealBorrowersByUidRecCreate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByUidRecCreate(
      String value, int offset, int maxResults) {
    return getDealBorrowersByUidRecCreate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByUidRecCreate(List<String> values) {
    return getDealBorrowersByUidRecCreate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByUidRecCreate(
      List<String> values, int offset, int maxResults) {
    return getDealBorrowersByColumnValue(
        VlsDealBorrowerFields.uidRecCreate, values, offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByUidRecUpdate(String value) {
    return getDealBorrowersByUidRecUpdate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByUidRecUpdate(
      String value, int offset, int maxResults) {
    return getDealBorrowersByUidRecUpdate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByUidRecUpdate(List<String> values) {
    return getDealBorrowersByUidRecUpdate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByUidRecUpdate(
      List<String> values, int offset, int maxResults) {
    return getDealBorrowersByColumnValue(
        VlsDealBorrowerFields.uidRecUpdate, values, offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByCustomer(String cusCidCustId) {
    return getDealBorrowersByCustomer(
        Collections.singletonList(cusCidCustId), 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByCustomer(
      String cusCidCustId, int offset, int maxResults) {
    return getDealBorrowersByCustomer(Collections.singletonList(cusCidCustId), offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByCustomer(List<String> cusCidCustIdList) {
    return getDealBorrowersByCustomer(cusCidCustIdList, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByCustomer(
      List<String> cusCidCustIdList, int offset, int maxResults) {
    TypedQuery<VlsDealBorrower> query = createQuery(QUERY_BY_CUSTOMER);
    List<String> list =
        cusCidCustIdList.stream().map(s -> StringUtils.rightPad(s, 8)).collect(Collectors.toList());
    query.setParameter("cusCidCustIdList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsDealBorrower> getDealBorrowersByDeal(String deaPidDeal) {
    return getDealBorrowersByDeal(Collections.singletonList(deaPidDeal), 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByDeal(
      String deaPidDeal, int offset, int maxResults) {
    return getDealBorrowersByDeal(Collections.singletonList(deaPidDeal), offset, maxResults);
  }

  public List<VlsDealBorrower> getDealBorrowersByDeal(List<String> deaPidDealList) {
    return getDealBorrowersByDeal(deaPidDealList, 0, Integer.MAX_VALUE);
  }

  public List<VlsDealBorrower> getDealBorrowersByDeal(
      List<String> deaPidDealList, int offset, int maxResults) {
    TypedQuery<VlsDealBorrower> query = createQuery(QUERY_BY_DEAL);
    List<String> list =
        deaPidDealList.stream().map(s -> StringUtils.rightPad(s, 8)).collect(Collectors.toList());
    query.setParameter("deaPidDealList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsDealBorrower> getDealBorrowersByColumnValue(
      VlsDealBorrowerFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsDealBorrower> getDealBorrowersByColumnValue(
      VlsDealBorrowerFields column1,
      List<String> values1,
      VlsDealBorrowerFields column2,
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
