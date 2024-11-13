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
import org.smartdatahub.liq.entity.original.VlsFacCommitTrn;
import org.smartdatahub.liq.enums.VlsFacCommitTrnFields;
import org.springframework.stereotype.Component;

/** @author Julian Egyptien (smartdatahub.org) */
@Component
public class VlsFacCommitTrnDAO extends AbstractJpaDAO<VlsFacCommitTrn, String> {

  public VlsFacCommitTrnDAO() {
    super(VlsFacCommitTrn.class, String.class);
  }

  private static String QUERY_BY_DEAL =
      "select e from VlsFacCommitTrn e where e.liqDeal.pidDeal in (:deaPidDealList)";
  private static String QUERY_BY_FACILITY =
      "select e from VlsFacCommitTrn e where e.liqFacility.pidFacility in (:facPidFacilityList)";
  private static String QUERY_BY_OST_TRAN =
      "select e from VlsFacCommitTrn e where e.liqOstTran.ridOstTran in (:otrRidOstTranList)";

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidCommitTrn(String value) {
    return getFacCommitTrnsByRidCommitTrn(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidCommitTrn(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByRidCommitTrn(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidCommitTrn(List<String> values) {
    return getFacCommitTrnsByRidCommitTrn(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidCommitTrn(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.ridCommitTrn, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeCircState(String value) {
    return getFacCommitTrnsByCdeCircState(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeCircState(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByCdeCircState(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeCircState(List<String> values) {
    return getFacCommitTrnsByCdeCircState(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeCircState(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.cdeCircState, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeContraSt(String value) {
    return getFacCommitTrnsByCdeContraSt(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeContraSt(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByCdeContraSt(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeContraSt(List<String> values) {
    return getFacCommitTrnsByCdeContraSt(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeContraSt(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.cdeContraSt, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeInvType(String value) {
    return getFacCommitTrnsByCdeInvType(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeInvType(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByCdeInvType(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeInvType(List<String> values) {
    return getFacCommitTrnsByCdeInvType(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeInvType(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.cdeInvType, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeLinkType(String value) {
    return getFacCommitTrnsByCdeLinkType(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeLinkType(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByCdeLinkType(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeLinkType(List<String> values) {
    return getFacCommitTrnsByCdeLinkType(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeLinkType(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.cdeLinkType, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeObStCtg(String value) {
    return getFacCommitTrnsByCdeObStCtg(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeObStCtg(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByCdeObStCtg(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeObStCtg(List<String> values) {
    return getFacCommitTrnsByCdeObStCtg(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeObStCtg(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.cdeObStCtg, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeObjState(String value) {
    return getFacCommitTrnsByCdeObjState(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeObjState(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByCdeObjState(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeObjState(List<String> values) {
    return getFacCommitTrnsByCdeObjState(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeObjState(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.cdeObjState, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeRskBkByr(String value) {
    return getFacCommitTrnsByCdeRskBkByr(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeRskBkByr(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByCdeRskBkByr(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeRskBkByr(List<String> values) {
    return getFacCommitTrnsByCdeRskBkByr(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeRskBkByr(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.cdeRskBkByr, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeRskBkSlr(String value) {
    return getFacCommitTrnsByCdeRskBkSlr(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeRskBkSlr(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByCdeRskBkSlr(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeRskBkSlr(List<String> values) {
    return getFacCommitTrnsByCdeRskBkSlr(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeRskBkSlr(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.cdeRskBkSlr, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeTransType(String value) {
    return getFacCommitTrnsByCdeTransType(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeTransType(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByCdeTransType(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeTransType(List<String> values) {
    return getFacCommitTrnsByCdeTransType(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeTransType(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.cdeTransType, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeType(String value) {
    return getFacCommitTrnsByCdeType(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeType(String value, int offset, int maxResults) {
    return getFacCommitTrnsByCdeType(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeType(List<String> values) {
    return getFacCommitTrnsByCdeType(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByCdeType(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(VlsFacCommitTrnFields.cdeType, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByFidFacInvId(String value) {
    return getFacCommitTrnsByFidFacInvId(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByFidFacInvId(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByFidFacInvId(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByFidFacInvId(List<String> values) {
    return getFacCommitTrnsByFidFacInvId(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByFidFacInvId(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.fidFacInvId, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByIidInvId(String value) {
    return getFacCommitTrnsByIidInvId(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByIidInvId(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByIidInvId(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByIidInvId(List<String> values) {
    return getFacCommitTrnsByIidInvId(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByIidInvId(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.iidInvId, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByPidDeal(String value) {
    return getFacCommitTrnsByPidDeal(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByPidDeal(String value, int offset, int maxResults) {
    return getFacCommitTrnsByPidDeal(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByPidDeal(List<String> values) {
    return getFacCommitTrnsByPidDeal(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByPidDeal(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(VlsFacCommitTrnFields.pidDeal, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByPidFacility(String value) {
    return getFacCommitTrnsByPidFacility(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByPidFacility(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByPidFacility(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByPidFacility(List<String> values) {
    return getFacCommitTrnsByPidFacility(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByPidFacility(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.pidFacility, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidFrom(String value) {
    return getFacCommitTrnsByRidFrom(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidFrom(String value, int offset, int maxResults) {
    return getFacCommitTrnsByRidFrom(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidFrom(List<String> values) {
    return getFacCommitTrnsByRidFrom(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidFrom(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(VlsFacCommitTrnFields.ridFrom, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidGroupTrn(String value) {
    return getFacCommitTrnsByRidGroupTrn(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidGroupTrn(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByRidGroupTrn(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidGroupTrn(List<String> values) {
    return getFacCommitTrnsByRidGroupTrn(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidGroupTrn(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.ridGroupTrn, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidLink(String value) {
    return getFacCommitTrnsByRidLink(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidLink(String value, int offset, int maxResults) {
    return getFacCommitTrnsByRidLink(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidLink(List<String> values) {
    return getFacCommitTrnsByRidLink(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidLink(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(VlsFacCommitTrnFields.ridLink, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidPool(String value) {
    return getFacCommitTrnsByRidPool(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidPool(String value, int offset, int maxResults) {
    return getFacCommitTrnsByRidPool(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidPool(List<String> values) {
    return getFacCommitTrnsByRidPool(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidPool(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(VlsFacCommitTrnFields.ridPool, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidTo(String value) {
    return getFacCommitTrnsByRidTo(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidTo(String value, int offset, int maxResults) {
    return getFacCommitTrnsByRidTo(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidTo(List<String> values) {
    return getFacCommitTrnsByRidTo(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByRidTo(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(VlsFacCommitTrnFields.ridTo, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByTxtAmendNum(String value) {
    return getFacCommitTrnsByTxtAmendNum(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByTxtAmendNum(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByTxtAmendNum(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByTxtAmendNum(List<String> values) {
    return getFacCommitTrnsByTxtAmendNum(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByTxtAmendNum(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.txtAmendNum, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByUidProcessor(String value) {
    return getFacCommitTrnsByUidProcessor(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByUidProcessor(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByUidProcessor(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByUidProcessor(List<String> values) {
    return getFacCommitTrnsByUidProcessor(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByUidProcessor(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.uidProcessor, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByUidRecCreate(String value) {
    return getFacCommitTrnsByUidRecCreate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByUidRecCreate(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByUidRecCreate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByUidRecCreate(List<String> values) {
    return getFacCommitTrnsByUidRecCreate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByUidRecCreate(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.uidRecCreate, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByUidRecUpdate(String value) {
    return getFacCommitTrnsByUidRecUpdate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByUidRecUpdate(
      String value, int offset, int maxResults) {
    return getFacCommitTrnsByUidRecUpdate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByUidRecUpdate(List<String> values) {
    return getFacCommitTrnsByUidRecUpdate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByUidRecUpdate(
      List<String> values, int offset, int maxResults) {
    return getFacCommitTrnsByColumnValue(
        VlsFacCommitTrnFields.uidRecUpdate, values, offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByDeal(String deaPidDeal) {
    return getFacCommitTrnsByDeal(Collections.singletonList(deaPidDeal), 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByDeal(
      String deaPidDeal, int offset, int maxResults) {
    return getFacCommitTrnsByDeal(Collections.singletonList(deaPidDeal), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByDeal(List<String> deaPidDealList) {
    return getFacCommitTrnsByDeal(deaPidDealList, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByDeal(
      List<String> deaPidDealList, int offset, int maxResults) {
    TypedQuery<VlsFacCommitTrn> query = createQuery(QUERY_BY_DEAL);
    List<String> list =
        deaPidDealList.stream().map(s -> StringUtils.rightPad(s, 8)).collect(Collectors.toList());
    query.setParameter("deaPidDealList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByFacility(String facPidFacility) {
    return getFacCommitTrnsByFacility(
        Collections.singletonList(facPidFacility), 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByFacility(
      String facPidFacility, int offset, int maxResults) {
    return getFacCommitTrnsByFacility(
        Collections.singletonList(facPidFacility), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByFacility(List<String> facPidFacilityList) {
    return getFacCommitTrnsByFacility(facPidFacilityList, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByFacility(
      List<String> facPidFacilityList, int offset, int maxResults) {
    TypedQuery<VlsFacCommitTrn> query = createQuery(QUERY_BY_FACILITY);
    List<String> list =
        facPidFacilityList.stream()
            .map(s -> StringUtils.rightPad(s, 8))
            .collect(Collectors.toList());
    query.setParameter("facPidFacilityList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByOstTran(String otrRidOstTran) {
    return getFacCommitTrnsByOstTran(
        Collections.singletonList(otrRidOstTran), 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByOstTran(
      String otrRidOstTran, int offset, int maxResults) {
    return getFacCommitTrnsByOstTran(Collections.singletonList(otrRidOstTran), offset, maxResults);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByOstTran(List<String> otrRidOstTranList) {
    return getFacCommitTrnsByOstTran(otrRidOstTranList, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByOstTran(
      List<String> otrRidOstTranList, int offset, int maxResults) {
    TypedQuery<VlsFacCommitTrn> query = createQuery(QUERY_BY_OST_TRAN);
    List<String> list =
        otrRidOstTranList.stream()
            .map(s -> StringUtils.rightPad(s, 8))
            .collect(Collectors.toList());
    query.setParameter("otrRidOstTranList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsFacCommitTrn> getFacCommitTrnsByColumnValue(
      VlsFacCommitTrnFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsFacCommitTrn> getFacCommitTrnsByColumnValue(
      VlsFacCommitTrnFields column1,
      List<String> values1,
      VlsFacCommitTrnFields column2,
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
