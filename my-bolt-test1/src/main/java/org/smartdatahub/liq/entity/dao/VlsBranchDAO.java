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
import org.smartdatahub.liq.entity.original.VlsBranch;
import org.smartdatahub.liq.enums.VlsBranchFields;
import org.springframework.stereotype.Component;

/** @author Julian Egyptien (smartdatahub.org) */
@Component
public class VlsBranchDAO extends AbstractJpaDAO<VlsBranch, String> {

  public VlsBranchDAO() {
    super(VlsBranch.class, String.class);
  }

  private static String QUERY_BY_BANK =
      "select e from VlsBranch e where e.liqCodeBank.cdeCode in (:bnkCdeCodeList)";
  private static String QUERY_BY_CUSTOMER =
      "select e from VlsBranch e where e.liqCustomer.cidCustId in (:cusCidCustIdList)";
  private static String QUERY_BY_TIME_REGION =
      "select e from VlsBranch e where e.liqTimeRegion.cdeCode in (:trgCdeCodeList)";

  public List<VlsBranch> getBranchsByCdeBranch(String value) {
    return getBranchsByCdeBranch(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCdeBranch(String value, int offset, int maxResults) {
    return getBranchsByCdeBranch(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCdeBranch(List<String> values) {
    return getBranchsByCdeBranch(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCdeBranch(List<String> values, int offset, int maxResults) {
    return getBranchsByColumnValue(VlsBranchFields.cdeBranch, values, offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCdeBank(String value) {
    return getBranchsByCdeBank(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCdeBank(String value, int offset, int maxResults) {
    return getBranchsByCdeBank(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCdeBank(List<String> values) {
    return getBranchsByCdeBank(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCdeBank(List<String> values, int offset, int maxResults) {
    return getBranchsByColumnValue(VlsBranchFields.cdeBank, values, offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCdeCountry(String value) {
    return getBranchsByCdeCountry(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCdeCountry(String value, int offset, int maxResults) {
    return getBranchsByCdeCountry(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCdeCountry(List<String> values) {
    return getBranchsByCdeCountry(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCdeCountry(List<String> values, int offset, int maxResults) {
    return getBranchsByColumnValue(VlsBranchFields.cdeCountry, values, offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCdeFunctCcy(String value) {
    return getBranchsByCdeFunctCcy(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCdeFunctCcy(String value, int offset, int maxResults) {
    return getBranchsByCdeFunctCcy(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCdeFunctCcy(List<String> values) {
    return getBranchsByCdeFunctCcy(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCdeFunctCcy(List<String> values, int offset, int maxResults) {
    return getBranchsByColumnValue(VlsBranchFields.cdeFunctCcy, values, offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCdeGl(String value) {
    return getBranchsByCdeGl(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCdeGl(String value, int offset, int maxResults) {
    return getBranchsByCdeGl(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCdeGl(List<String> values) {
    return getBranchsByCdeGl(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCdeGl(List<String> values, int offset, int maxResults) {
    return getBranchsByColumnValue(VlsBranchFields.cdeGl, values, offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCdeLocalCcy(String value) {
    return getBranchsByCdeLocalCcy(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCdeLocalCcy(String value, int offset, int maxResults) {
    return getBranchsByCdeLocalCcy(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCdeLocalCcy(List<String> values) {
    return getBranchsByCdeLocalCcy(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCdeLocalCcy(List<String> values, int offset, int maxResults) {
    return getBranchsByColumnValue(VlsBranchFields.cdeLocalCcy, values, offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCdeTmeRegion(String value) {
    return getBranchsByCdeTmeRegion(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCdeTmeRegion(String value, int offset, int maxResults) {
    return getBranchsByCdeTmeRegion(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCdeTmeRegion(List<String> values) {
    return getBranchsByCdeTmeRegion(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCdeTmeRegion(List<String> values, int offset, int maxResults) {
    return getBranchsByColumnValue(VlsBranchFields.cdeTmeRegion, values, offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCidCustId(String value) {
    return getBranchsByCidCustId(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCidCustId(String value, int offset, int maxResults) {
    return getBranchsByCidCustId(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCidCustId(List<String> values) {
    return getBranchsByCidCustId(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCidCustId(List<String> values, int offset, int maxResults) {
    return getBranchsByColumnValue(VlsBranchFields.cidCustId, values, offset, maxResults);
  }

  public List<VlsBranch> getBranchsByDscBranch(String value) {
    return getBranchsByDscBranch(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByDscBranch(String value, int offset, int maxResults) {
    return getBranchsByDscBranch(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsBranch> getBranchsByDscBranch(List<String> values) {
    return getBranchsByDscBranch(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByDscBranch(List<String> values, int offset, int maxResults) {
    return getBranchsByColumnValue(VlsBranchFields.dscBranch, values, offset, maxResults);
  }

  public List<VlsBranch> getBranchsByUidRecCreate(String value) {
    return getBranchsByUidRecCreate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByUidRecCreate(String value, int offset, int maxResults) {
    return getBranchsByUidRecCreate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsBranch> getBranchsByUidRecCreate(List<String> values) {
    return getBranchsByUidRecCreate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByUidRecCreate(List<String> values, int offset, int maxResults) {
    return getBranchsByColumnValue(VlsBranchFields.uidRecCreate, values, offset, maxResults);
  }

  public List<VlsBranch> getBranchsByUidRecUpdate(String value) {
    return getBranchsByUidRecUpdate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByUidRecUpdate(String value, int offset, int maxResults) {
    return getBranchsByUidRecUpdate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsBranch> getBranchsByUidRecUpdate(List<String> values) {
    return getBranchsByUidRecUpdate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByUidRecUpdate(List<String> values, int offset, int maxResults) {
    return getBranchsByColumnValue(VlsBranchFields.uidRecUpdate, values, offset, maxResults);
  }

  public List<VlsBranch> getBranchsByBank(String bnkCdeCode) {
    return getBranchsByBank(Collections.singletonList(bnkCdeCode), 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByBank(String bnkCdeCode, int offset, int maxResults) {
    return getBranchsByBank(Collections.singletonList(bnkCdeCode), offset, maxResults);
  }

  public List<VlsBranch> getBranchsByBank(List<String> bnkCdeCodeList) {
    return getBranchsByBank(bnkCdeCodeList, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByBank(List<String> bnkCdeCodeList, int offset, int maxResults) {
    TypedQuery<VlsBranch> query = createQuery(QUERY_BY_BANK);
    List<String> list =
        bnkCdeCodeList.stream().map(s -> StringUtils.rightPad(s, 5)).collect(Collectors.toList());
    query.setParameter("bnkCdeCodeList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsBranch> getBranchsByCustomer(String cusCidCustId) {
    return getBranchsByCustomer(Collections.singletonList(cusCidCustId), 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCustomer(String cusCidCustId, int offset, int maxResults) {
    return getBranchsByCustomer(Collections.singletonList(cusCidCustId), offset, maxResults);
  }

  public List<VlsBranch> getBranchsByCustomer(List<String> cusCidCustIdList) {
    return getBranchsByCustomer(cusCidCustIdList, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByCustomer(
      List<String> cusCidCustIdList, int offset, int maxResults) {
    TypedQuery<VlsBranch> query = createQuery(QUERY_BY_CUSTOMER);
    List<String> list =
        cusCidCustIdList.stream().map(s -> StringUtils.rightPad(s, 8)).collect(Collectors.toList());
    query.setParameter("cusCidCustIdList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsBranch> getBranchsByTimeRegion(String trgCdeCode) {
    return getBranchsByTimeRegion(Collections.singletonList(trgCdeCode), 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByTimeRegion(String trgCdeCode, int offset, int maxResults) {
    return getBranchsByTimeRegion(Collections.singletonList(trgCdeCode), offset, maxResults);
  }

  public List<VlsBranch> getBranchsByTimeRegion(List<String> trgCdeCodeList) {
    return getBranchsByTimeRegion(trgCdeCodeList, 0, Integer.MAX_VALUE);
  }

  public List<VlsBranch> getBranchsByTimeRegion(
      List<String> trgCdeCodeList, int offset, int maxResults) {
    TypedQuery<VlsBranch> query = createQuery(QUERY_BY_TIME_REGION);
    List<String> list =
        trgCdeCodeList.stream().map(s -> StringUtils.rightPad(s, 5)).collect(Collectors.toList());
    query.setParameter("trgCdeCodeList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsBranch> getBranchsByColumnValue(
      VlsBranchFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsBranch> getBranchsByColumnValue(
      VlsBranchFields column1,
      List<String> values1,
      VlsBranchFields column2,
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
