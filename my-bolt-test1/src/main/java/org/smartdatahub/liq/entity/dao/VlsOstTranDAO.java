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
import org.smartdatahub.liq.entity.original.VlsOstTran;
import org.smartdatahub.liq.enums.VlsOstTranFields;
import org.springframework.stereotype.Component;

/** @author Julian Egyptien (smartdatahub.org) */
@Component
public class VlsOstTranDAO extends AbstractJpaDAO<VlsOstTran, String> {

  public VlsOstTranDAO() {
    super(VlsOstTran.class, String.class);
  }

  private static String QUERY_BY_FAC_COMMIT_TRN_COMMIT_TRN =
      "select e from VlsOstTran e where e.liqFacCommitTrnCommitTrn.ridCommitTrn in (:ftrRidCommitTrnList)";
  private static String QUERY_BY_ORIGINAL_OUTSTANDING =
      "select e from VlsOstTran e where e.liqOriginalOutstanding.ridOutstandng in (:ostRidOutstandngList)";
  private static String QUERY_BY_OUTSTANDING =
      "select e from VlsOstTran e where e.liqOutstanding.ridOutstandng in (:ostRidOutstandngList)";

  public List<VlsOstTran> getOstTransByRidOstTran(String value) {
    return getOstTransByRidOstTran(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByRidOstTran(String value, int offset, int maxResults) {
    return getOstTransByRidOstTran(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByRidOstTran(List<String> values) {
    return getOstTransByRidOstTran(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByRidOstTran(List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.ridOstTran, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeAccrFreq(String value) {
    return getOstTransByCdeAccrFreq(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeAccrFreq(String value, int offset, int maxResults) {
    return getOstTransByCdeAccrFreq(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeAccrFreq(List<String> values) {
    return getOstTransByCdeAccrFreq(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeAccrFreq(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.cdeAccrFreq, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeGroupType(String value) {
    return getOstTransByCdeGroupType(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeGroupType(String value, int offset, int maxResults) {
    return getOstTransByCdeGroupType(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeGroupType(List<String> values) {
    return getOstTransByCdeGroupType(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeGroupType(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.cdeGroupType, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeLoanPurp(String value) {
    return getOstTransByCdeLoanPurp(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeLoanPurp(String value, int offset, int maxResults) {
    return getOstTransByCdeLoanPurp(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeLoanPurp(List<String> values) {
    return getOstTransByCdeLoanPurp(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeLoanPurp(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.cdeLoanPurp, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeObStCtg(String value) {
    return getOstTransByCdeObStCtg(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeObStCtg(String value, int offset, int maxResults) {
    return getOstTransByCdeObStCtg(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeObStCtg(List<String> values) {
    return getOstTransByCdeObStCtg(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeObStCtg(List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.cdeObStCtg, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeObjState(String value) {
    return getOstTransByCdeObjState(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeObjState(String value, int offset, int maxResults) {
    return getOstTransByCdeObjState(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeObjState(List<String> values) {
    return getOstTransByCdeObjState(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeObjState(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.cdeObjState, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeProcArea(String value) {
    return getOstTransByCdeProcArea(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeProcArea(String value, int offset, int maxResults) {
    return getOstTransByCdeProcArea(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeProcArea(List<String> values) {
    return getOstTransByCdeProcArea(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeProcArea(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.cdeProcArea, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeReprFreq(String value) {
    return getOstTransByCdeReprFreq(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeReprFreq(String value, int offset, int maxResults) {
    return getOstTransByCdeReprFreq(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeReprFreq(List<String> values) {
    return getOstTransByCdeReprFreq(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeReprFreq(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.cdeReprFreq, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeRiskType(String value) {
    return getOstTransByCdeRiskType(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeRiskType(String value, int offset, int maxResults) {
    return getOstTransByCdeRiskType(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeRiskType(List<String> values) {
    return getOstTransByCdeRiskType(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeRiskType(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.cdeRiskType, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeTrnsPurp(String value) {
    return getOstTransByCdeTrnsPurp(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeTrnsPurp(String value, int offset, int maxResults) {
    return getOstTransByCdeTrnsPurp(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeTrnsPurp(List<String> values) {
    return getOstTransByCdeTrnsPurp(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeTrnsPurp(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.cdeTrnsPurp, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeType(String value) {
    return getOstTransByCdeType(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeType(String value, int offset, int maxResults) {
    return getOstTransByCdeType(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByCdeType(List<String> values) {
    return getOstTransByCdeType(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByCdeType(List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.cdeType, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByPidSublimit(String value) {
    return getOstTransByPidSublimit(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByPidSublimit(String value, int offset, int maxResults) {
    return getOstTransByPidSublimit(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByPidSublimit(List<String> values) {
    return getOstTransByPidSublimit(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByPidSublimit(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.pidSublimit, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByRidCommitTrn(String value) {
    return getOstTransByRidCommitTrn(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByRidCommitTrn(String value, int offset, int maxResults) {
    return getOstTransByRidCommitTrn(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByRidCommitTrn(List<String> values) {
    return getOstTransByRidCommitTrn(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByRidCommitTrn(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.ridCommitTrn, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByRidGroupTran(String value) {
    return getOstTransByRidGroupTran(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByRidGroupTran(String value, int offset, int maxResults) {
    return getOstTransByRidGroupTran(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByRidGroupTran(List<String> values) {
    return getOstTransByRidGroupTran(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByRidGroupTran(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.ridGroupTran, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByRidLinkTrn(String value) {
    return getOstTransByRidLinkTrn(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByRidLinkTrn(String value, int offset, int maxResults) {
    return getOstTransByRidLinkTrn(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByRidLinkTrn(List<String> values) {
    return getOstTransByRidLinkTrn(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByRidLinkTrn(List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.ridLinkTrn, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByRidOrigOst(String value) {
    return getOstTransByRidOrigOst(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByRidOrigOst(String value, int offset, int maxResults) {
    return getOstTransByRidOrigOst(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByRidOrigOst(List<String> values) {
    return getOstTransByRidOrigOst(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByRidOrigOst(List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.ridOrigOst, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByRidOutstandng(String value) {
    return getOstTransByRidOutstandng(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByRidOutstandng(String value, int offset, int maxResults) {
    return getOstTransByRidOutstandng(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByRidOutstandng(List<String> values) {
    return getOstTransByRidOutstandng(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByRidOutstandng(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.ridOutstandng, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByUidProcessor(String value) {
    return getOstTransByUidProcessor(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByUidProcessor(String value, int offset, int maxResults) {
    return getOstTransByUidProcessor(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByUidProcessor(List<String> values) {
    return getOstTransByUidProcessor(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByUidProcessor(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.uidProcessor, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByUidRecCreate(String value) {
    return getOstTransByUidRecCreate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByUidRecCreate(String value, int offset, int maxResults) {
    return getOstTransByUidRecCreate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByUidRecCreate(List<String> values) {
    return getOstTransByUidRecCreate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByUidRecCreate(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.uidRecCreate, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByUidRecUpdate(String value) {
    return getOstTransByUidRecUpdate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByUidRecUpdate(String value, int offset, int maxResults) {
    return getOstTransByUidRecUpdate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByUidRecUpdate(List<String> values) {
    return getOstTransByUidRecUpdate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByUidRecUpdate(
      List<String> values, int offset, int maxResults) {
    return getOstTransByColumnValue(VlsOstTranFields.uidRecUpdate, values, offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByFacCommitTrnCommitTrn(String ftrRidCommitTrn) {
    return getOstTransByFacCommitTrnCommitTrn(
        Collections.singletonList(ftrRidCommitTrn), 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByFacCommitTrnCommitTrn(
      String ftrRidCommitTrn, int offset, int maxResults) {
    return getOstTransByFacCommitTrnCommitTrn(
        Collections.singletonList(ftrRidCommitTrn), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByFacCommitTrnCommitTrn(List<String> ftrRidCommitTrnList) {
    return getOstTransByFacCommitTrnCommitTrn(ftrRidCommitTrnList, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByFacCommitTrnCommitTrn(
      List<String> ftrRidCommitTrnList, int offset, int maxResults) {
    TypedQuery<VlsOstTran> query = createQuery(QUERY_BY_FAC_COMMIT_TRN_COMMIT_TRN);
    List<String> list =
        ftrRidCommitTrnList.stream()
            .map(s -> StringUtils.rightPad(s, 8))
            .collect(Collectors.toList());
    query.setParameter("ftrRidCommitTrnList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsOstTran> getOstTransByOriginalOutstanding(String ostRidOutstandng) {
    return getOstTransByOriginalOutstanding(
        Collections.singletonList(ostRidOutstandng), 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByOriginalOutstanding(
      String ostRidOutstandng, int offset, int maxResults) {
    return getOstTransByOriginalOutstanding(
        Collections.singletonList(ostRidOutstandng), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByOriginalOutstanding(List<String> ostRidOutstandngList) {
    return getOstTransByOriginalOutstanding(ostRidOutstandngList, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByOriginalOutstanding(
      List<String> ostRidOutstandngList, int offset, int maxResults) {
    TypedQuery<VlsOstTran> query = createQuery(QUERY_BY_ORIGINAL_OUTSTANDING);
    List<String> list =
        ostRidOutstandngList.stream()
            .map(s -> StringUtils.rightPad(s, 8))
            .collect(Collectors.toList());
    query.setParameter("ostRidOutstandngList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsOstTran> getOstTransByOutstanding(String ostRidOutstandng) {
    return getOstTransByOutstanding(
        Collections.singletonList(ostRidOutstandng), 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByOutstanding(
      String ostRidOutstandng, int offset, int maxResults) {
    return getOstTransByOutstanding(
        Collections.singletonList(ostRidOutstandng), offset, maxResults);
  }

  public List<VlsOstTran> getOstTransByOutstanding(List<String> ostRidOutstandngList) {
    return getOstTransByOutstanding(ostRidOutstandngList, 0, Integer.MAX_VALUE);
  }

  public List<VlsOstTran> getOstTransByOutstanding(
      List<String> ostRidOutstandngList, int offset, int maxResults) {
    TypedQuery<VlsOstTran> query = createQuery(QUERY_BY_OUTSTANDING);
    List<String> list =
        ostRidOutstandngList.stream()
            .map(s -> StringUtils.rightPad(s, 8))
            .collect(Collectors.toList());
    query.setParameter("ostRidOutstandngList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsOstTran> getOstTransByColumnValue(
      VlsOstTranFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsOstTran> getOstTransByColumnValue(
      VlsOstTranFields column1,
      List<String> values1,
      VlsOstTranFields column2,
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
