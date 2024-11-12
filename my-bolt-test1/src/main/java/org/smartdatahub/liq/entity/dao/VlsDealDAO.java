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
import org.smartdatahub.liq.entity.original.VlsDeal;
import org.smartdatahub.liq.enums.VlsDealFields;
import org.springframework.stereotype.Component;

/** @author Julian Egyptien (smartdatahub.org) */
@Component
public class VlsDealDAO extends AbstractJpaDAO<VlsDeal, String> {

  public VlsDealDAO() {
    super(VlsDeal.class, String.class);
  }

  private static String QUERY_BY_BANK =
      "select e from VlsDeal e where e.liqCodeBank.cdeCode in (:bnkCdeCodeList)";
  private static String QUERY_BY_BRANCH =
      "select e from VlsDeal e where e.liqBranch.cdeBranch in (:brnCdeBranchList)";

  public List<VlsDeal> getDealsByPidDeal(String value) {
    return getDealsByPidDeal(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByPidDeal(String value, int offset, int maxResults) {
    return getDealsByPidDeal(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByPidDeal(List<String> values) {
    return getDealsByPidDeal(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByPidDeal(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.pidDeal, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeBank(String value) {
    return getDealsByCdeBank(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeBank(String value, int offset, int maxResults) {
    return getDealsByCdeBank(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeBank(List<String> values) {
    return getDealsByCdeBank(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeBank(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeBank, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeBranch(String value) {
    return getDealsByCdeBranch(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeBranch(String value, int offset, int maxResults) {
    return getDealsByCdeBranch(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeBranch(List<String> values) {
    return getDealsByCdeBranch(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeBranch(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeBranch, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeCrAsn(String value) {
    return getDealsByCdeCrAsn(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeCrAsn(String value, int offset, int maxResults) {
    return getDealsByCdeCrAsn(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeCrAsn(List<String> values) {
    return getDealsByCdeCrAsn(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeCrAsn(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeCrAsn, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeCrPartic(String value) {
    return getDealsByCdeCrPartic(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeCrPartic(String value, int offset, int maxResults) {
    return getDealsByCdeCrPartic(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeCrPartic(List<String> values) {
    return getDealsByCdeCrPartic(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeCrPartic(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeCrPartic, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeDealClass(String value) {
    return getDealsByCdeDealClass(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeDealClass(String value, int offset, int maxResults) {
    return getDealsByCdeDealClass(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeDealClass(List<String> values) {
    return getDealsByCdeDealClass(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeDealClass(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeDealClass, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeDealStat(String value) {
    return getDealsByCdeDealStat(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeDealStat(String value, int offset, int maxResults) {
    return getDealsByCdeDealStat(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeDealStat(List<String> values) {
    return getDealsByCdeDealStat(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeDealStat(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeDealStat, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeDepSubtyp(String value) {
    return getDealsByCdeDepSubtyp(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeDepSubtyp(String value, int offset, int maxResults) {
    return getDealsByCdeDepSubtyp(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeDepSubtyp(List<String> values) {
    return getDealsByCdeDepSubtyp(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeDepSubtyp(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeDepSubtyp, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeDept(String value) {
    return getDealsByCdeDept(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeDept(String value, int offset, int maxResults) {
    return getDealsByCdeDept(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeDept(List<String> values) {
    return getDealsByCdeDept(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeDept(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeDept, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeExpense(String value) {
    return getDealsByCdeExpense(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeExpense(String value, int offset, int maxResults) {
    return getDealsByCdeExpense(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeExpense(List<String> values) {
    return getDealsByCdeExpense(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeExpense(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeExpense, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeInpalRule(String value) {
    return getDealsByCdeInpalRule(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeInpalRule(String value, int offset, int maxResults) {
    return getDealsByCdeInpalRule(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeInpalRule(List<String> values) {
    return getDealsByCdeInpalRule(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeInpalRule(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeInpalRule, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeOrigCcy(String value) {
    return getDealsByCdeOrigCcy(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeOrigCcy(String value, int offset, int maxResults) {
    return getDealsByCdeOrigCcy(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeOrigCcy(List<String> values) {
    return getDealsByCdeOrigCcy(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeOrigCcy(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeOrigCcy, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdePdlgcRule(String value) {
    return getDealsByCdePdlgcRule(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdePdlgcRule(String value, int offset, int maxResults) {
    return getDealsByCdePdlgcRule(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdePdlgcRule(List<String> values) {
    return getDealsByCdePdlgcRule(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdePdlgcRule(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdePdlgcRule, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdePerforming(String value) {
    return getDealsByCdePerforming(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdePerforming(String value, int offset, int maxResults) {
    return getDealsByCdePerforming(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdePerforming(List<String> values) {
    return getDealsByCdePerforming(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdePerforming(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdePerforming, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeProcArea(String value) {
    return getDealsByCdeProcArea(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeProcArea(String value, int offset, int maxResults) {
    return getDealsByCdeProcArea(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeProcArea(List<String> values) {
    return getDealsByCdeProcArea(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeProcArea(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeProcArea, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeReasonNfs(String value) {
    return getDealsByCdeReasonNfs(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeReasonNfs(String value, int offset, int maxResults) {
    return getDealsByCdeReasonNfs(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeReasonNfs(List<String> values) {
    return getDealsByCdeReasonNfs(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeReasonNfs(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeReasonNfs, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeSellStage(String value) {
    return getDealsByCdeSellStage(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeSellStage(String value, int offset, int maxResults) {
    return getDealsByCdeSellStage(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeSellStage(List<String> values) {
    return getDealsByCdeSellStage(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeSellStage(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeSellStage, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeTermReasn(String value) {
    return getDealsByCdeTermReasn(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeTermReasn(String value, int offset, int maxResults) {
    return getDealsByCdeTermReasn(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByCdeTermReasn(List<String> values) {
    return getDealsByCdeTermReasn(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByCdeTermReasn(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.cdeTermReasn, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByNmeAliasName(String value) {
    return getDealsByNmeAliasName(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByNmeAliasName(String value, int offset, int maxResults) {
    return getDealsByNmeAliasName(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByNmeAliasName(List<String> values) {
    return getDealsByNmeAliasName(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByNmeAliasName(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.nmeAliasName, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByNmeDeal(String value) {
    return getDealsByNmeDeal(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByNmeDeal(String value, int offset, int maxResults) {
    return getDealsByNmeDeal(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByNmeDeal(List<String> values) {
    return getDealsByNmeDeal(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByNmeDeal(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.nmeDeal, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByNumDealCntl(String value) {
    return getDealsByNumDealCntl(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByNumDealCntl(String value, int offset, int maxResults) {
    return getDealsByNumDealCntl(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByNumDealCntl(List<String> values) {
    return getDealsByNumDealCntl(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByNumDealCntl(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.numDealCntl, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByRidCollatDef(String value) {
    return getDealsByRidCollatDef(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByRidCollatDef(String value, int offset, int maxResults) {
    return getDealsByRidCollatDef(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByRidCollatDef(List<String> values) {
    return getDealsByRidCollatDef(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByRidCollatDef(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.ridCollatDef, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByTxtCusipNum(String value) {
    return getDealsByTxtCusipNum(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByTxtCusipNum(String value, int offset, int maxResults) {
    return getDealsByTxtCusipNum(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByTxtCusipNum(List<String> values) {
    return getDealsByTxtCusipNum(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByTxtCusipNum(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.txtCusipNum, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByTxtIsinNum(String value) {
    return getDealsByTxtIsinNum(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByTxtIsinNum(String value, int offset, int maxResults) {
    return getDealsByTxtIsinNum(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByTxtIsinNum(List<String> values) {
    return getDealsByTxtIsinNum(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByTxtIsinNum(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.txtIsinNum, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByUidAdmnstratr(String value) {
    return getDealsByUidAdmnstratr(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByUidAdmnstratr(String value, int offset, int maxResults) {
    return getDealsByUidAdmnstratr(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByUidAdmnstratr(List<String> values) {
    return getDealsByUidAdmnstratr(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByUidAdmnstratr(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.uidAdmnstratr, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByUidLastRevwr(String value) {
    return getDealsByUidLastRevwr(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByUidLastRevwr(String value, int offset, int maxResults) {
    return getDealsByUidLastRevwr(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByUidLastRevwr(List<String> values) {
    return getDealsByUidLastRevwr(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByUidLastRevwr(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.uidLastRevwr, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByUidOriginator(String value) {
    return getDealsByUidOriginator(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByUidOriginator(String value, int offset, int maxResults) {
    return getDealsByUidOriginator(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByUidOriginator(List<String> values) {
    return getDealsByUidOriginator(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByUidOriginator(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.uidOriginator, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByUidRecCreate(String value) {
    return getDealsByUidRecCreate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByUidRecCreate(String value, int offset, int maxResults) {
    return getDealsByUidRecCreate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByUidRecCreate(List<String> values) {
    return getDealsByUidRecCreate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByUidRecCreate(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.uidRecCreate, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByUidRecUpdate(String value) {
    return getDealsByUidRecUpdate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByUidRecUpdate(String value, int offset, int maxResults) {
    return getDealsByUidRecUpdate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByUidRecUpdate(List<String> values) {
    return getDealsByUidRecUpdate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByUidRecUpdate(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.uidRecUpdate, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByUidRelManagr(String value) {
    return getDealsByUidRelManagr(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByUidRelManagr(String value, int offset, int maxResults) {
    return getDealsByUidRelManagr(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByUidRelManagr(List<String> values) {
    return getDealsByUidRelManagr(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByUidRelManagr(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.uidRelManagr, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByXidAltDealid(String value) {
    return getDealsByXidAltDealid(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByXidAltDealid(String value, int offset, int maxResults) {
    return getDealsByXidAltDealid(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByXidAltDealid(List<String> values) {
    return getDealsByXidAltDealid(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByXidAltDealid(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.xidAltDealid, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByXidAnsiId(String value) {
    return getDealsByXidAnsiId(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByXidAnsiId(String value, int offset, int maxResults) {
    return getDealsByXidAnsiId(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByXidAnsiId(List<String> values) {
    return getDealsByXidAnsiId(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByXidAnsiId(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.xidAnsiId, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByXidNatnlCrdt(String value) {
    return getDealsByXidNatnlCrdt(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByXidNatnlCrdt(String value, int offset, int maxResults) {
    return getDealsByXidNatnlCrdt(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsDeal> getDealsByXidNatnlCrdt(List<String> values) {
    return getDealsByXidNatnlCrdt(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByXidNatnlCrdt(List<String> values, int offset, int maxResults) {
    return getDealsByColumnValue(VlsDealFields.xidNatnlCrdt, values, offset, maxResults);
  }

  public List<VlsDeal> getDealsByBank(String bnkCdeCode) {
    return getDealsByBank(Collections.singletonList(bnkCdeCode), 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByBank(String bnkCdeCode, int offset, int maxResults) {
    return getDealsByBank(Collections.singletonList(bnkCdeCode), offset, maxResults);
  }

  public List<VlsDeal> getDealsByBank(List<String> bnkCdeCodeList) {
    return getDealsByBank(bnkCdeCodeList, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByBank(List<String> bnkCdeCodeList, int offset, int maxResults) {
    TypedQuery<VlsDeal> query = createQuery(QUERY_BY_BANK);
    List<String> list =
        bnkCdeCodeList.stream().map(s -> StringUtils.rightPad(s, 5)).collect(Collectors.toList());
    query.setParameter("bnkCdeCodeList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsDeal> getDealsByBranch(String brnCdeBranch) {
    return getDealsByBranch(Collections.singletonList(brnCdeBranch), 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByBranch(String brnCdeBranch, int offset, int maxResults) {
    return getDealsByBranch(Collections.singletonList(brnCdeBranch), offset, maxResults);
  }

  public List<VlsDeal> getDealsByBranch(List<String> brnCdeBranchList) {
    return getDealsByBranch(brnCdeBranchList, 0, Integer.MAX_VALUE);
  }

  public List<VlsDeal> getDealsByBranch(List<String> brnCdeBranchList, int offset, int maxResults) {
    TypedQuery<VlsDeal> query = createQuery(QUERY_BY_BRANCH);
    List<String> list =
        brnCdeBranchList.stream().map(s -> StringUtils.rightPad(s, 5)).collect(Collectors.toList());
    query.setParameter("brnCdeBranchList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsDeal> getDealsByColumnValue(
      VlsDealFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsDeal> getDealsByColumnValue(
      VlsDealFields column1,
      List<String> values1,
      VlsDealFields column2,
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
