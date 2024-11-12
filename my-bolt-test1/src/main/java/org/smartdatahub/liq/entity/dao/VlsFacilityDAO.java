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
import org.smartdatahub.liq.entity.original.VlsFacility;
import org.smartdatahub.liq.enums.VlsFacilityFields;
import org.springframework.stereotype.Component;

/** @author Julian Egyptien (smartdatahub.org) */
@Component
public class VlsFacilityDAO extends AbstractJpaDAO<VlsFacility, String> {

  public VlsFacilityDAO() {
    super(VlsFacility.class, String.class);
  }

  private static String QUERY_BY_BANK =
      "select e from VlsFacility e where e.liqCodeBank.cdeCode in (:bnkCdeCodeList)";
  private static String QUERY_BY_BRANCH =
      "select e from VlsFacility e where e.liqBranch.cdeBranch in (:brnCdeBranchList)";
  private static String QUERY_BY_DEAL =
      "select e from VlsFacility e where e.liqDeal.pidDeal in (:deaPidDealList)";
  private static String QUERY_BY_FACILITY_TYPE =
      "select e from VlsFacility e where e.liqFacilityType.cdeFacType in (:fatCdeFacTypeList)";

  public List<VlsFacility> getFacilitiesByPidFacility(String value) {
    return getFacilitiesByPidFacility(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByPidFacility(String value, int offset, int maxResults) {
    return getFacilitiesByPidFacility(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByPidFacility(List<String> values) {
    return getFacilitiesByPidFacility(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByPidFacility(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.pidFacility, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeAmrtUsed(String value) {
    return getFacilitiesByCdeAmrtUsed(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeAmrtUsed(String value, int offset, int maxResults) {
    return getFacilitiesByCdeAmrtUsed(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeAmrtUsed(List<String> values) {
    return getFacilitiesByCdeAmrtUsed(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeAmrtUsed(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeAmrtUsed, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeBank(String value) {
    return getFacilitiesByCdeBank(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeBank(String value, int offset, int maxResults) {
    return getFacilitiesByCdeBank(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeBank(List<String> values) {
    return getFacilitiesByCdeBank(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeBank(List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeBank, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeBranch(String value) {
    return getFacilitiesByCdeBranch(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeBranch(String value, int offset, int maxResults) {
    return getFacilitiesByCdeBranch(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeBranch(List<String> values) {
    return getFacilitiesByCdeBranch(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeBranch(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeBranch, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeCurrency(String value) {
    return getFacilitiesByCdeCurrency(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeCurrency(String value, int offset, int maxResults) {
    return getFacilitiesByCdeCurrency(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeCurrency(List<String> values) {
    return getFacilitiesByCdeCurrency(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeCurrency(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeCurrency, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeFacType(String value) {
    return getFacilitiesByCdeFacType(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeFacType(String value, int offset, int maxResults) {
    return getFacilitiesByCdeFacType(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeFacType(List<String> values) {
    return getFacilitiesByCdeFacType(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeFacType(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeFacType, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeFlGlMap(String value) {
    return getFacilitiesByCdeFlGlMap(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeFlGlMap(String value, int offset, int maxResults) {
    return getFacilitiesByCdeFlGlMap(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeFlGlMap(List<String> values) {
    return getFacilitiesByCdeFlGlMap(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeFlGlMap(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeFlGlMap, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeFndMthAf(String value) {
    return getFacilitiesByCdeFndMthAf(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeFndMthAf(String value, int offset, int maxResults) {
    return getFacilitiesByCdeFndMthAf(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeFndMthAf(List<String> values) {
    return getFacilitiesByCdeFndMthAf(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeFndMthAf(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeFndMthAf, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeFndMthBf(String value) {
    return getFacilitiesByCdeFndMthBf(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeFndMthBf(String value, int offset, int maxResults) {
    return getFacilitiesByCdeFndMthBf(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeFndMthBf(List<String> values) {
    return getFacilitiesByCdeFndMthBf(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeFndMthBf(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeFndMthBf, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeLineBusns(String value) {
    return getFacilitiesByCdeLineBusns(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeLineBusns(String value, int offset, int maxResults) {
    return getFacilitiesByCdeLineBusns(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeLineBusns(List<String> values) {
    return getFacilitiesByCdeLineBusns(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeLineBusns(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeLineBusns, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdePerforming(String value) {
    return getFacilitiesByCdePerforming(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdePerforming(String value, int offset, int maxResults) {
    return getFacilitiesByCdePerforming(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdePerforming(List<String> values) {
    return getFacilitiesByCdePerforming(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdePerforming(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdePerforming, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdePfClawbck(String value) {
    return getFacilitiesByCdePfClawbck(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdePfClawbck(String value, int offset, int maxResults) {
    return getFacilitiesByCdePfClawbck(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdePfClawbck(List<String> values) {
    return getFacilitiesByCdePfClawbck(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdePfClawbck(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdePfClawbck, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdePfCurRul(String value) {
    return getFacilitiesByCdePfCurRul(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdePfCurRul(String value, int offset, int maxResults) {
    return getFacilitiesByCdePfCurRul(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdePfCurRul(List<String> values) {
    return getFacilitiesByCdePfCurRul(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdePfCurRul(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdePfCurRul, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdePnltyStat(String value) {
    return getFacilitiesByCdePnltyStat(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdePnltyStat(String value, int offset, int maxResults) {
    return getFacilitiesByCdePnltyStat(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdePnltyStat(List<String> values) {
    return getFacilitiesByCdePnltyStat(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdePnltyStat(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdePnltyStat, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeProcArea(String value) {
    return getFacilitiesByCdeProcArea(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeProcArea(String value, int offset, int maxResults) {
    return getFacilitiesByCdeProcArea(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeProcArea(List<String> values) {
    return getFacilitiesByCdeProcArea(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeProcArea(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeProcArea, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeRmtAmMth(String value) {
    return getFacilitiesByCdeRmtAmMth(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeRmtAmMth(String value, int offset, int maxResults) {
    return getFacilitiesByCdeRmtAmMth(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeRmtAmMth(List<String> values) {
    return getFacilitiesByCdeRmtAmMth(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeRmtAmMth(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeRmtAmMth, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeSic(String value) {
    return getFacilitiesByCdeSic(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeSic(String value, int offset, int maxResults) {
    return getFacilitiesByCdeSic(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeSic(List<String> values) {
    return getFacilitiesByCdeSic(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeSic(List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeSic, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeSicCntry(String value) {
    return getFacilitiesByCdeSicCntry(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeSicCntry(String value, int offset, int maxResults) {
    return getFacilitiesByCdeSicCntry(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeSicCntry(List<String> values) {
    return getFacilitiesByCdeSicCntry(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeSicCntry(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeSicCntry, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeSubtype(String value) {
    return getFacilitiesByCdeSubtype(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeSubtype(String value, int offset, int maxResults) {
    return getFacilitiesByCdeSubtype(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeSubtype(List<String> values) {
    return getFacilitiesByCdeSubtype(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeSubtype(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeSubtype, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeUnfAmMth(String value) {
    return getFacilitiesByCdeUnfAmMth(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeUnfAmMth(String value, int offset, int maxResults) {
    return getFacilitiesByCdeUnfAmMth(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByCdeUnfAmMth(List<String> values) {
    return getFacilitiesByCdeUnfAmMth(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByCdeUnfAmMth(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.cdeUnfAmMth, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByNmeFacility(String value) {
    return getFacilitiesByNmeFacility(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByNmeFacility(String value, int offset, int maxResults) {
    return getFacilitiesByNmeFacility(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByNmeFacility(List<String> values) {
    return getFacilitiesByNmeFacility(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByNmeFacility(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.nmeFacility, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByNumFacCntl(String value) {
    return getFacilitiesByNumFacCntl(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByNumFacCntl(String value, int offset, int maxResults) {
    return getFacilitiesByNumFacCntl(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByNumFacCntl(List<String> values) {
    return getFacilitiesByNumFacCntl(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByNumFacCntl(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.numFacCntl, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByPidDeal(String value) {
    return getFacilitiesByPidDeal(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByPidDeal(String value, int offset, int maxResults) {
    return getFacilitiesByPidDeal(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByPidDeal(List<String> values) {
    return getFacilitiesByPidDeal(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByPidDeal(List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.pidDeal, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByRidCollatDef(String value) {
    return getFacilitiesByRidCollatDef(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByRidCollatDef(String value, int offset, int maxResults) {
    return getFacilitiesByRidCollatDef(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByRidCollatDef(List<String> values) {
    return getFacilitiesByRidCollatDef(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByRidCollatDef(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.ridCollatDef, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByTxtCusipNum(String value) {
    return getFacilitiesByTxtCusipNum(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByTxtCusipNum(String value, int offset, int maxResults) {
    return getFacilitiesByTxtCusipNum(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByTxtCusipNum(List<String> values) {
    return getFacilitiesByTxtCusipNum(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByTxtCusipNum(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.txtCusipNum, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByTxtIsinNum(String value) {
    return getFacilitiesByTxtIsinNum(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByTxtIsinNum(String value, int offset, int maxResults) {
    return getFacilitiesByTxtIsinNum(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByTxtIsinNum(List<String> values) {
    return getFacilitiesByTxtIsinNum(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByTxtIsinNum(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.txtIsinNum, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByUidRecCreate(String value) {
    return getFacilitiesByUidRecCreate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByUidRecCreate(String value, int offset, int maxResults) {
    return getFacilitiesByUidRecCreate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByUidRecCreate(List<String> values) {
    return getFacilitiesByUidRecCreate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByUidRecCreate(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.uidRecCreate, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByUidRecUpdate(String value) {
    return getFacilitiesByUidRecUpdate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByUidRecUpdate(String value, int offset, int maxResults) {
    return getFacilitiesByUidRecUpdate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByUidRecUpdate(List<String> values) {
    return getFacilitiesByUidRecUpdate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByUidRecUpdate(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.uidRecUpdate, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByXidAnsiId(String value) {
    return getFacilitiesByXidAnsiId(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByXidAnsiId(String value, int offset, int maxResults) {
    return getFacilitiesByXidAnsiId(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByXidAnsiId(List<String> values) {
    return getFacilitiesByXidAnsiId(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByXidAnsiId(
      List<String> values, int offset, int maxResults) {
    return getFacilitiesByColumnValue(VlsFacilityFields.xidAnsiId, values, offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByBank(String bnkCdeCode) {
    return getFacilitiesByBank(Collections.singletonList(bnkCdeCode), 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByBank(String bnkCdeCode, int offset, int maxResults) {
    return getFacilitiesByBank(Collections.singletonList(bnkCdeCode), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByBank(List<String> bnkCdeCodeList) {
    return getFacilitiesByBank(bnkCdeCodeList, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByBank(
      List<String> bnkCdeCodeList, int offset, int maxResults) {
    TypedQuery<VlsFacility> query = createQuery(QUERY_BY_BANK);
    List<String> list =
        bnkCdeCodeList.stream().map(s -> StringUtils.rightPad(s, 5)).collect(Collectors.toList());
    query.setParameter("bnkCdeCodeList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsFacility> getFacilitiesByBranch(String brnCdeBranch) {
    return getFacilitiesByBranch(Collections.singletonList(brnCdeBranch), 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByBranch(String brnCdeBranch, int offset, int maxResults) {
    return getFacilitiesByBranch(Collections.singletonList(brnCdeBranch), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByBranch(List<String> brnCdeBranchList) {
    return getFacilitiesByBranch(brnCdeBranchList, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByBranch(
      List<String> brnCdeBranchList, int offset, int maxResults) {
    TypedQuery<VlsFacility> query = createQuery(QUERY_BY_BRANCH);
    List<String> list =
        brnCdeBranchList.stream().map(s -> StringUtils.rightPad(s, 5)).collect(Collectors.toList());
    query.setParameter("brnCdeBranchList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsFacility> getFacilitiesByDeal(String deaPidDeal) {
    return getFacilitiesByDeal(Collections.singletonList(deaPidDeal), 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByDeal(String deaPidDeal, int offset, int maxResults) {
    return getFacilitiesByDeal(Collections.singletonList(deaPidDeal), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByDeal(List<String> deaPidDealList) {
    return getFacilitiesByDeal(deaPidDealList, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByDeal(
      List<String> deaPidDealList, int offset, int maxResults) {
    TypedQuery<VlsFacility> query = createQuery(QUERY_BY_DEAL);
    List<String> list =
        deaPidDealList.stream().map(s -> StringUtils.rightPad(s, 8)).collect(Collectors.toList());
    query.setParameter("deaPidDealList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsFacility> getFacilitiesByFacilityType(String fatCdeFacType) {
    return getFacilitiesByFacilityType(
        Collections.singletonList(fatCdeFacType), 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByFacilityType(
      String fatCdeFacType, int offset, int maxResults) {
    return getFacilitiesByFacilityType(
        Collections.singletonList(fatCdeFacType), offset, maxResults);
  }

  public List<VlsFacility> getFacilitiesByFacilityType(List<String> fatCdeFacTypeList) {
    return getFacilitiesByFacilityType(fatCdeFacTypeList, 0, Integer.MAX_VALUE);
  }

  public List<VlsFacility> getFacilitiesByFacilityType(
      List<String> fatCdeFacTypeList, int offset, int maxResults) {
    TypedQuery<VlsFacility> query = createQuery(QUERY_BY_FACILITY_TYPE);
    List<String> list =
        fatCdeFacTypeList.stream()
            .map(s -> StringUtils.rightPad(s, 5))
            .collect(Collectors.toList());
    query.setParameter("fatCdeFacTypeList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsFacility> getFacilitiesByColumnValue(
      VlsFacilityFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsFacility> getFacilitiesByColumnValue(
      VlsFacilityFields column1,
      List<String> values1,
      VlsFacilityFields column2,
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
