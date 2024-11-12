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
import org.smartdatahub.liq.entity.original.VlsFacBorrDetl;
import org.smartdatahub.liq.enums.VlsFacBorrDetlFields;
import org.springframework.stereotype.Component;

/** @author Julian Egyptien (smartdatahub.org) */
@Component
public class VlsFacBorrDetlDAO extends AbstractJpaDAO<VlsFacBorrDetl, String> {

  public VlsFacBorrDetlDAO() {
    super(VlsFacBorrDetl.class, String.class);
  }

  private static String QUERY_BY_DEAL_BORROWER =
      "select e from VlsFacBorrDetl e where e.liqDealBorrower.ridDealBorr in (:dbrRidDealBorrList)";
  private static String QUERY_BY_FACILITY =
      "select e from VlsFacBorrDetl e where e.liqFacility.pidFacility in (:facPidFacilityList)";

  public List<VlsFacBorrDetl> getFacBorrDetlsByRidBorrDetls(String value) {
    return getFacBorrDetlsByRidBorrDetls(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByRidBorrDetls(
      String value, int offset, int maxResults) {
    return getFacBorrDetlsByRidBorrDetls(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByRidBorrDetls(List<String> values) {
    return getFacBorrDetlsByRidBorrDetls(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByRidBorrDetls(
      List<String> values, int offset, int maxResults) {
    return getFacBorrDetlsByColumnValue(
        VlsFacBorrDetlFields.ridBorrDetls, values, offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByCdeFrgWthhld(String value) {
    return getFacBorrDetlsByCdeFrgWthhld(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByCdeFrgWthhld(
      String value, int offset, int maxResults) {
    return getFacBorrDetlsByCdeFrgWthhld(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByCdeFrgWthhld(List<String> values) {
    return getFacBorrDetlsByCdeFrgWthhld(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByCdeFrgWthhld(
      List<String> values, int offset, int maxResults) {
    return getFacBorrDetlsByColumnValue(
        VlsFacBorrDetlFields.cdeFrgWthhld, values, offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByCdeTaxExempt(String value) {
    return getFacBorrDetlsByCdeTaxExempt(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByCdeTaxExempt(
      String value, int offset, int maxResults) {
    return getFacBorrDetlsByCdeTaxExempt(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByCdeTaxExempt(List<String> values) {
    return getFacBorrDetlsByCdeTaxExempt(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByCdeTaxExempt(
      List<String> values, int offset, int maxResults) {
    return getFacBorrDetlsByColumnValue(
        VlsFacBorrDetlFields.cdeTaxExempt, values, offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByPidFacility(String value) {
    return getFacBorrDetlsByPidFacility(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByPidFacility(
      String value, int offset, int maxResults) {
    return getFacBorrDetlsByPidFacility(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByPidFacility(List<String> values) {
    return getFacBorrDetlsByPidFacility(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByPidFacility(
      List<String> values, int offset, int maxResults) {
    return getFacBorrDetlsByColumnValue(
        VlsFacBorrDetlFields.pidFacility, values, offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByRidDealBorr(String value) {
    return getFacBorrDetlsByRidDealBorr(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByRidDealBorr(
      String value, int offset, int maxResults) {
    return getFacBorrDetlsByRidDealBorr(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByRidDealBorr(List<String> values) {
    return getFacBorrDetlsByRidDealBorr(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByRidDealBorr(
      List<String> values, int offset, int maxResults) {
    return getFacBorrDetlsByColumnValue(
        VlsFacBorrDetlFields.ridDealBorr, values, offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByUidRecCreate(String value) {
    return getFacBorrDetlsByUidRecCreate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByUidRecCreate(
      String value, int offset, int maxResults) {
    return getFacBorrDetlsByUidRecCreate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByUidRecCreate(List<String> values) {
    return getFacBorrDetlsByUidRecCreate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByUidRecCreate(
      List<String> values, int offset, int maxResults) {
    return getFacBorrDetlsByColumnValue(
        VlsFacBorrDetlFields.uidRecCreate, values, offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByUidRecUpdate(String value) {
    return getFacBorrDetlsByUidRecUpdate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByUidRecUpdate(
      String value, int offset, int maxResults) {
    return getFacBorrDetlsByUidRecUpdate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByUidRecUpdate(List<String> values) {
    return getFacBorrDetlsByUidRecUpdate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByUidRecUpdate(
      List<String> values, int offset, int maxResults) {
    return getFacBorrDetlsByColumnValue(
        VlsFacBorrDetlFields.uidRecUpdate, values, offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByDealBorrower(String dbrRidDealBorr) {
    return getFacBorrDetlsByDealBorrower(
        Collections.singletonList(dbrRidDealBorr), 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByDealBorrower(
      String dbrRidDealBorr, int offset, int maxResults) {
    return getFacBorrDetlsByDealBorrower(
        Collections.singletonList(dbrRidDealBorr), offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByDealBorrower(List<String> dbrRidDealBorrList) {
    return getFacBorrDetlsByDealBorrower(dbrRidDealBorrList, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByDealBorrower(
      List<String> dbrRidDealBorrList, int offset, int maxResults) {
    TypedQuery<VlsFacBorrDetl> query = createQuery(QUERY_BY_DEAL_BORROWER);
    List<String> list =
        dbrRidDealBorrList.stream()
            .map(s -> StringUtils.rightPad(s, 8))
            .collect(Collectors.toList());
    query.setParameter("dbrRidDealBorrList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByFacility(String facPidFacility) {
    return getFacBorrDetlsByFacility(
        Collections.singletonList(facPidFacility), 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByFacility(
      String facPidFacility, int offset, int maxResults) {
    return getFacBorrDetlsByFacility(Collections.singletonList(facPidFacility), offset, maxResults);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByFacility(List<String> facPidFacilityList) {
    return getFacBorrDetlsByFacility(facPidFacilityList, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByFacility(
      List<String> facPidFacilityList, int offset, int maxResults) {
    TypedQuery<VlsFacBorrDetl> query = createQuery(QUERY_BY_FACILITY);
    List<String> list =
        facPidFacilityList.stream()
            .map(s -> StringUtils.rightPad(s, 8))
            .collect(Collectors.toList());
    query.setParameter("facPidFacilityList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsFacBorrDetl> getFacBorrDetlsByColumnValue(
      VlsFacBorrDetlFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsFacBorrDetl> getFacBorrDetlsByColumnValue(
      VlsFacBorrDetlFields column1,
      List<String> values1,
      VlsFacBorrDetlFields column2,
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
