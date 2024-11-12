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
import org.smartdatahub.liq.entity.original.VlsCustomer;
import org.smartdatahub.liq.enums.VlsCustomerFields;
import org.springframework.stereotype.Component;

/** @author Julian Egyptien (smartdatahub.org) */
@Component
public class VlsCustomerDAO extends AbstractJpaDAO<VlsCustomer, String> {

  public VlsCustomerDAO() {
    super(VlsCustomer.class, String.class);
  }

  private static String QUERY_BY_BANK =
      "select e from VlsCustomer e where e.liqCodeBank.cdeCode in (:bnkCdeCodeList)";
  private static String QUERY_BY_CUSTOMER_IMM_PARENT_PARENT =
      "select e from VlsCustomer e where e.liqCustomerImmParentParent.cidCustId in (:cusCidCustIdList)";
  private static String QUERY_BY_CUSTOMER_ULT_PARENT_PARENT =
      "select e from VlsCustomer e where e.liqCustomerUltParentParent.cidCustId in (:cusCidCustIdList)";

  public List<VlsCustomer> getCustomersByCidCustId(String value) {
    return getCustomersByCidCustId(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCidCustId(String value, int offset, int maxResults) {
    return getCustomersByCidCustId(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCidCustId(List<String> values) {
    return getCustomersByCidCustId(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCidCustId(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cidCustId, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeBank(String value) {
    return getCustomersByCdeBank(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeBank(String value, int offset, int maxResults) {
    return getCustomersByCdeBank(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeBank(List<String> values) {
    return getCustomersByCdeBank(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeBank(List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeBank, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeBranch(String value) {
    return getCustomersByCdeBranch(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeBranch(String value, int offset, int maxResults) {
    return getCustomersByCdeBranch(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeBranch(List<String> values) {
    return getCustomersByCdeBranch(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeBranch(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeBranch, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeCountry(String value) {
    return getCustomersByCdeCountry(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeCountry(String value, int offset, int maxResults) {
    return getCustomersByCdeCountry(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeCountry(List<String> values) {
    return getCustomersByCdeCountry(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeCountry(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeCountry, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeCustDesc(String value) {
    return getCustomersByCdeCustDesc(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeCustDesc(String value, int offset, int maxResults) {
    return getCustomersByCdeCustDesc(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeCustDesc(List<String> values) {
    return getCustomersByCdeCustDesc(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeCustDesc(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeCustDesc, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeCustStat(String value) {
    return getCustomersByCdeCustStat(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeCustStat(String value, int offset, int maxResults) {
    return getCustomersByCdeCustStat(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeCustStat(List<String> values) {
    return getCustomersByCdeCustStat(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeCustStat(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeCustStat, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeDepSubtyp(String value) {
    return getCustomersByCdeDepSubtyp(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeDepSubtyp(String value, int offset, int maxResults) {
    return getCustomersByCdeDepSubtyp(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeDepSubtyp(List<String> values) {
    return getCustomersByCdeDepSubtyp(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeDepSubtyp(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeDepSubtyp, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeDept(String value) {
    return getCustomersByCdeDept(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeDept(String value, int offset, int maxResults) {
    return getCustomersByCdeDept(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeDept(List<String> values) {
    return getCustomersByCdeDept(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeDept(List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeDept, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeExpense(String value) {
    return getCustomersByCdeExpense(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeExpense(String value, int offset, int maxResults) {
    return getCustomersByCdeExpense(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeExpense(List<String> values) {
    return getCustomersByCdeExpense(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeExpense(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeExpense, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeLanguage(String value) {
    return getCustomersByCdeLanguage(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeLanguage(String value, int offset, int maxResults) {
    return getCustomersByCdeLanguage(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeLanguage(List<String> values) {
    return getCustomersByCdeLanguage(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeLanguage(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeLanguage, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeLegal(String value) {
    return getCustomersByCdeLegal(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeLegal(String value, int offset, int maxResults) {
    return getCustomersByCdeLegal(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeLegal(List<String> values) {
    return getCustomersByCdeLegal(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeLegal(List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeLegal, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeMasterAct(String value) {
    return getCustomersByCdeMasterAct(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeMasterAct(String value, int offset, int maxResults) {
    return getCustomersByCdeMasterAct(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeMasterAct(List<String> values) {
    return getCustomersByCdeMasterAct(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeMasterAct(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeMasterAct, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeOrigin(String value) {
    return getCustomersByCdeOrigin(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeOrigin(String value, int offset, int maxResults) {
    return getCustomersByCdeOrigin(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeOrigin(List<String> values) {
    return getCustomersByCdeOrigin(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeOrigin(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeOrigin, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeOsLimCcy(String value) {
    return getCustomersByCdeOsLimCcy(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeOsLimCcy(String value, int offset, int maxResults) {
    return getCustomersByCdeOsLimCcy(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeOsLimCcy(List<String> values) {
    return getCustomersByCdeOsLimCcy(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeOsLimCcy(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeOsLimCcy, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdePrimSic(String value) {
    return getCustomersByCdePrimSic(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdePrimSic(String value, int offset, int maxResults) {
    return getCustomersByCdePrimSic(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdePrimSic(List<String> values) {
    return getCustomersByCdePrimSic(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdePrimSic(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdePrimSic, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeProspect(String value) {
    return getCustomersByCdeProspect(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeProspect(String value, int offset, int maxResults) {
    return getCustomersByCdeProspect(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeProspect(List<String> values) {
    return getCustomersByCdeProspect(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeProspect(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeProspect, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeSicCntry(String value) {
    return getCustomersByCdeSicCntry(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeSicCntry(String value, int offset, int maxResults) {
    return getCustomersByCdeSicCntry(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeSicCntry(List<String> values) {
    return getCustomersByCdeSicCntry(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeSicCntry(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeSicCntry, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeTrsRptAr(String value) {
    return getCustomersByCdeTrsRptAr(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeTrsRptAr(String value, int offset, int maxResults) {
    return getCustomersByCdeTrsRptAr(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCdeTrsRptAr(List<String> values) {
    return getCustomersByCdeTrsRptAr(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCdeTrsRptAr(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cdeTrsRptAr, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCidImmParent(String value) {
    return getCustomersByCidImmParent(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCidImmParent(String value, int offset, int maxResults) {
    return getCustomersByCidImmParent(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCidImmParent(List<String> values) {
    return getCustomersByCidImmParent(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCidImmParent(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cidImmParent, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCidUltParent(String value) {
    return getCustomersByCidUltParent(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCidUltParent(String value, int offset, int maxResults) {
    return getCustomersByCidUltParent(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCidUltParent(List<String> values) {
    return getCustomersByCidUltParent(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCidUltParent(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.cidUltParent, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByNmeFullName(String value) {
    return getCustomersByNmeFullName(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByNmeFullName(String value, int offset, int maxResults) {
    return getCustomersByNmeFullName(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByNmeFullName(List<String> values) {
    return getCustomersByNmeFullName(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByNmeFullName(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.nmeFullName, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByNmeShortName(String value) {
    return getCustomersByNmeShortName(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByNmeShortName(String value, int offset, int maxResults) {
    return getCustomersByNmeShortName(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByNmeShortName(List<String> values) {
    return getCustomersByNmeShortName(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByNmeShortName(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.nmeShortName, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByTxtVatNumber(String value) {
    return getCustomersByTxtVatNumber(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByTxtVatNumber(String value, int offset, int maxResults) {
    return getCustomersByTxtVatNumber(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByTxtVatNumber(List<String> values) {
    return getCustomersByTxtVatNumber(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByTxtVatNumber(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.txtVatNumber, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByUidRecCreate(String value) {
    return getCustomersByUidRecCreate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByUidRecCreate(String value, int offset, int maxResults) {
    return getCustomersByUidRecCreate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByUidRecCreate(List<String> values) {
    return getCustomersByUidRecCreate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByUidRecCreate(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.uidRecCreate, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByUidRecUpdate(String value) {
    return getCustomersByUidRecUpdate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByUidRecUpdate(String value, int offset, int maxResults) {
    return getCustomersByUidRecUpdate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByUidRecUpdate(List<String> values) {
    return getCustomersByUidRecUpdate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByUidRecUpdate(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.uidRecUpdate, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByXidCustId(String value) {
    return getCustomersByXidCustId(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByXidCustId(String value, int offset, int maxResults) {
    return getCustomersByXidCustId(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByXidCustId(List<String> values) {
    return getCustomersByXidCustId(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByXidCustId(
      List<String> values, int offset, int maxResults) {
    return getCustomersByColumnValue(VlsCustomerFields.xidCustId, values, offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByBank(String bnkCdeCode) {
    return getCustomersByBank(Collections.singletonList(bnkCdeCode), 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByBank(String bnkCdeCode, int offset, int maxResults) {
    return getCustomersByBank(Collections.singletonList(bnkCdeCode), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByBank(List<String> bnkCdeCodeList) {
    return getCustomersByBank(bnkCdeCodeList, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByBank(
      List<String> bnkCdeCodeList, int offset, int maxResults) {
    TypedQuery<VlsCustomer> query = createQuery(QUERY_BY_BANK);
    List<String> list =
        bnkCdeCodeList.stream().map(s -> StringUtils.rightPad(s, 5)).collect(Collectors.toList());
    query.setParameter("bnkCdeCodeList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsCustomer> getCustomersByCustomerImmParentParent(String cusCidCustId) {
    return getCustomersByCustomerImmParentParent(
        Collections.singletonList(cusCidCustId), 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCustomerImmParentParent(
      String cusCidCustId, int offset, int maxResults) {
    return getCustomersByCustomerImmParentParent(
        Collections.singletonList(cusCidCustId), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCustomerImmParentParent(List<String> cusCidCustIdList) {
    return getCustomersByCustomerImmParentParent(cusCidCustIdList, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCustomerImmParentParent(
      List<String> cusCidCustIdList, int offset, int maxResults) {
    TypedQuery<VlsCustomer> query = createQuery(QUERY_BY_CUSTOMER_IMM_PARENT_PARENT);
    List<String> list =
        cusCidCustIdList.stream().map(s -> StringUtils.rightPad(s, 8)).collect(Collectors.toList());
    query.setParameter("cusCidCustIdList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsCustomer> getCustomersByCustomerUltParentParent(String cusCidCustId) {
    return getCustomersByCustomerUltParentParent(
        Collections.singletonList(cusCidCustId), 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCustomerUltParentParent(
      String cusCidCustId, int offset, int maxResults) {
    return getCustomersByCustomerUltParentParent(
        Collections.singletonList(cusCidCustId), offset, maxResults);
  }

  public List<VlsCustomer> getCustomersByCustomerUltParentParent(List<String> cusCidCustIdList) {
    return getCustomersByCustomerUltParentParent(cusCidCustIdList, 0, Integer.MAX_VALUE);
  }

  public List<VlsCustomer> getCustomersByCustomerUltParentParent(
      List<String> cusCidCustIdList, int offset, int maxResults) {
    TypedQuery<VlsCustomer> query = createQuery(QUERY_BY_CUSTOMER_ULT_PARENT_PARENT);
    List<String> list =
        cusCidCustIdList.stream().map(s -> StringUtils.rightPad(s, 8)).collect(Collectors.toList());
    query.setParameter("cusCidCustIdList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsCustomer> getCustomersByColumnValue(
      VlsCustomerFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsCustomer> getCustomersByColumnValue(
      VlsCustomerFields column1,
      List<String> values1,
      VlsCustomerFields column2,
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
