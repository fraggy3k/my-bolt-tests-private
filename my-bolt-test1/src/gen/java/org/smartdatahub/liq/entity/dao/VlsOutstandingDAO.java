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
import org.smartdatahub.liq.entity.original.VlsOutstanding;
import org.smartdatahub.liq.enums.VlsOutstandingFields;
import org.springframework.stereotype.Component;

/** @author Julian Egyptien (smartdatahub.org) */
@Component
public class VlsOutstandingDAO extends AbstractJpaDAO<VlsOutstanding, String> {

  public VlsOutstandingDAO() {
    super(VlsOutstanding.class, String.class);
  }

  private static String QUERY_BY_CUSTOMER_BORROWER =
      "select e from VlsOutstanding e where e.liqCustomerBorrower.cidCustId in (:cusCidCustIdList)";
  private static String QUERY_BY_DEAL =
      "select e from VlsOutstanding e where e.liqDeal.pidDeal in (:deaPidDealList)";
  private static String QUERY_BY_FACILITY =
      "select e from VlsOutstanding e where e.liqFacility.pidFacility in (:facPidFacilityList)";

  public List<VlsOutstanding> getOutstandingsByRidOutstandng(String value) {
    return getOutstandingsByRidOutstandng(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByRidOutstandng(
      String value, int offset, int maxResults) {
    return getOutstandingsByRidOutstandng(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByRidOutstandng(List<String> values) {
    return getOutstandingsByRidOutstandng(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByRidOutstandng(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.ridOutstandng, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeAcrPeriod(String value) {
    return getOutstandingsByCdeAcrPeriod(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeAcrPeriod(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeAcrPeriod(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeAcrPeriod(List<String> values) {
    return getOutstandingsByCdeAcrPeriod(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeAcrPeriod(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeAcrPeriod, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeActAcrRl(String value) {
    return getOutstandingsByCdeActAcrRl(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeActAcrRl(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeActAcrRl(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeActAcrRl(List<String> values) {
    return getOutstandingsByCdeActAcrRl(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeActAcrRl(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeActAcrRl, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeAnvdteEom(String value) {
    return getOutstandingsByCdeAnvdteEom(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeAnvdteEom(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeAnvdteEom(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeAnvdteEom(List<String> values) {
    return getOutstandingsByCdeAnvdteEom(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeAnvdteEom(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeAnvdteEom, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeCurrency(String value) {
    return getOutstandingsByCdeCurrency(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeCurrency(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeCurrency(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeCurrency(List<String> values) {
    return getOutstandingsByCdeCurrency(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeCurrency(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeCurrency, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeDecPrecn(String value) {
    return getOutstandingsByCdeDecPrecn(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeDecPrecn(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeDecPrecn(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeDecPrecn(List<String> values) {
    return getOutstandingsByCdeDecPrecn(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeDecPrecn(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeDecPrecn, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeDecRound(String value) {
    return getOutstandingsByCdeDecRound(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeDecRound(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeDecRound(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeDecRound(List<String> values) {
    return getOutstandingsByCdeDecRound(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeDecRound(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeDecRound, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeEndteRule(String value) {
    return getOutstandingsByCdeEndteRule(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeEndteRule(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeEndteRule(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeEndteRule(List<String> values) {
    return getOutstandingsByCdeEndteRule(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeEndteRule(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeEndteRule, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeExtension(String value) {
    return getOutstandingsByCdeExtension(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeExtension(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeExtension(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeExtension(List<String> values) {
    return getOutstandingsByCdeExtension(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeExtension(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeExtension, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeFracIrate(String value) {
    return getOutstandingsByCdeFracIrate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeFracIrate(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeFracIrate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeFracIrate(List<String> values) {
    return getOutstandingsByCdeFracIrate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeFracIrate(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeFracIrate, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeFracRound(String value) {
    return getOutstandingsByCdeFracRound(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeFracRound(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeFracRound(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeFracRound(List<String> values) {
    return getOutstandingsByCdeFracRound(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeFracRound(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeFracRound, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeFrgWthhld(String value) {
    return getOutstandingsByCdeFrgWthhld(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeFrgWthhld(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeFrgWthhld(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeFrgWthhld(List<String> values) {
    return getOutstandingsByCdeFrgWthhld(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeFrgWthhld(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeFrgWthhld, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeGlClass(String value) {
    return getOutstandingsByCdeGlClass(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeGlClass(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeGlClass(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeGlClass(List<String> values) {
    return getOutstandingsByCdeGlClass(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeGlClass(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeGlClass, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeLoanPurp(String value) {
    return getOutstandingsByCdeLoanPurp(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeLoanPurp(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeLoanPurp(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeLoanPurp(List<String> values) {
    return getOutstandingsByCdeLoanPurp(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeLoanPurp(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeLoanPurp, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeObStCtg(String value) {
    return getOutstandingsByCdeObStCtg(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeObStCtg(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeObStCtg(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeObStCtg(List<String> values) {
    return getOutstandingsByCdeObStCtg(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeObStCtg(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeObStCtg, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeObjState(String value) {
    return getOutstandingsByCdeObjState(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeObjState(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeObjState(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeObjState(List<String> values) {
    return getOutstandingsByCdeObjState(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeObjState(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeObjState, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeOutstdTyp(String value) {
    return getOutstandingsByCdeOutstdTyp(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeOutstdTyp(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeOutstdTyp(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeOutstdTyp(List<String> values) {
    return getOutstandingsByCdeOutstdTyp(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeOutstdTyp(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeOutstdTyp, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeOverageRl(String value) {
    return getOutstandingsByCdeOverageRl(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeOverageRl(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeOverageRl(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeOverageRl(List<String> values) {
    return getOutstandingsByCdeOverageRl(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeOverageRl(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeOverageRl, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdePerfStat(String value) {
    return getOutstandingsByCdePerfStat(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdePerfStat(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdePerfStat(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdePerfStat(List<String> values) {
    return getOutstandingsByCdePerfStat(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdePerfStat(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdePerfStat, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdePriceOpt(String value) {
    return getOutstandingsByCdePriceOpt(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdePriceOpt(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdePriceOpt(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdePriceOpt(List<String> values) {
    return getOutstandingsByCdePriceOpt(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdePriceOpt(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdePriceOpt, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRacRepric(String value) {
    return getOutstandingsByCdeRacRepric(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRacRepric(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeRacRepric(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRacRepric(List<String> values) {
    return getOutstandingsByCdeRacRepric(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRacRepric(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeRacRepric, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRapMthd(String value) {
    return getOutstandingsByCdeRapMthd(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRapMthd(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeRapMthd(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRapMthd(List<String> values) {
    return getOutstandingsByCdeRapMthd(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRapMthd(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeRapMthd, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeReprFreq(String value) {
    return getOutstandingsByCdeReprFreq(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeReprFreq(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeReprFreq(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeReprFreq(List<String> values) {
    return getOutstandingsByCdeReprFreq(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeReprFreq(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeReprFreq, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRiskType(String value) {
    return getOutstandingsByCdeRiskType(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRiskType(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeRiskType(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRiskType(List<String> values) {
    return getOutstandingsByCdeRiskType(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRiskType(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeRiskType, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRqstCcy(String value) {
    return getOutstandingsByCdeRqstCcy(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRqstCcy(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeRqstCcy(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRqstCcy(List<String> values) {
    return getOutstandingsByCdeRqstCcy(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeRqstCcy(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeRqstCcy, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeSic(String value) {
    return getOutstandingsByCdeSic(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeSic(String value, int offset, int maxResults) {
    return getOutstandingsByCdeSic(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeSic(List<String> values) {
    return getOutstandingsByCdeSic(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeSic(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(VlsOutstandingFields.cdeSic, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeSicCntry(String value) {
    return getOutstandingsByCdeSicCntry(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeSicCntry(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeSicCntry(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeSicCntry(List<String> values) {
    return getOutstandingsByCdeSicCntry(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeSicCntry(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeSicCntry, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeTaxExempt(String value) {
    return getOutstandingsByCdeTaxExempt(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeTaxExempt(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeTaxExempt(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeTaxExempt(List<String> values) {
    return getOutstandingsByCdeTaxExempt(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeTaxExempt(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeTaxExempt, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeTrsryArea(String value) {
    return getOutstandingsByCdeTrsryArea(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeTrsryArea(
      String value, int offset, int maxResults) {
    return getOutstandingsByCdeTrsryArea(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCdeTrsryArea(List<String> values) {
    return getOutstandingsByCdeTrsryArea(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCdeTrsryArea(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cdeTrsryArea, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCidBorrower(String value) {
    return getOutstandingsByCidBorrower(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCidBorrower(
      String value, int offset, int maxResults) {
    return getOutstandingsByCidBorrower(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCidBorrower(List<String> values) {
    return getOutstandingsByCidBorrower(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCidBorrower(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.cidBorrower, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByNmeAlias(String value) {
    return getOutstandingsByNmeAlias(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByNmeAlias(String value, int offset, int maxResults) {
    return getOutstandingsByNmeAlias(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByNmeAlias(List<String> values) {
    return getOutstandingsByNmeAlias(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByNmeAlias(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(VlsOutstandingFields.nmeAlias, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByPidDeal(String value) {
    return getOutstandingsByPidDeal(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByPidDeal(String value, int offset, int maxResults) {
    return getOutstandingsByPidDeal(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByPidDeal(List<String> values) {
    return getOutstandingsByPidDeal(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByPidDeal(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(VlsOutstandingFields.pidDeal, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByPidFacility(String value) {
    return getOutstandingsByPidFacility(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByPidFacility(
      String value, int offset, int maxResults) {
    return getOutstandingsByPidFacility(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByPidFacility(List<String> values) {
    return getOutstandingsByPidFacility(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByPidFacility(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.pidFacility, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByPidSublimit(String value) {
    return getOutstandingsByPidSublimit(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByPidSublimit(
      String value, int offset, int maxResults) {
    return getOutstandingsByPidSublimit(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByPidSublimit(List<String> values) {
    return getOutstandingsByPidSublimit(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByPidSublimit(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.pidSublimit, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByRidCollatDef(String value) {
    return getOutstandingsByRidCollatDef(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByRidCollatDef(
      String value, int offset, int maxResults) {
    return getOutstandingsByRidCollatDef(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByRidCollatDef(List<String> values) {
    return getOutstandingsByRidCollatDef(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByRidCollatDef(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.ridCollatDef, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByRidLchgRule(String value) {
    return getOutstandingsByRidLchgRule(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByRidLchgRule(
      String value, int offset, int maxResults) {
    return getOutstandingsByRidLchgRule(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByRidLchgRule(List<String> values) {
    return getOutstandingsByRidLchgRule(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByRidLchgRule(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.ridLchgRule, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByUidRecCreate(String value) {
    return getOutstandingsByUidRecCreate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByUidRecCreate(
      String value, int offset, int maxResults) {
    return getOutstandingsByUidRecCreate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByUidRecCreate(List<String> values) {
    return getOutstandingsByUidRecCreate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByUidRecCreate(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.uidRecCreate, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByUidRecUpdate(String value) {
    return getOutstandingsByUidRecUpdate(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByUidRecUpdate(
      String value, int offset, int maxResults) {
    return getOutstandingsByUidRecUpdate(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByUidRecUpdate(List<String> values) {
    return getOutstandingsByUidRecUpdate(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByUidRecUpdate(
      List<String> values, int offset, int maxResults) {
    return getOutstandingsByColumnValue(
        VlsOutstandingFields.uidRecUpdate, values, offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCustomerBorrower(String cusCidCustId) {
    return getOutstandingsByCustomerBorrower(
        Collections.singletonList(cusCidCustId), 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCustomerBorrower(
      String cusCidCustId, int offset, int maxResults) {
    return getOutstandingsByCustomerBorrower(
        Collections.singletonList(cusCidCustId), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByCustomerBorrower(List<String> cusCidCustIdList) {
    return getOutstandingsByCustomerBorrower(cusCidCustIdList, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByCustomerBorrower(
      List<String> cusCidCustIdList, int offset, int maxResults) {
    TypedQuery<VlsOutstanding> query = createQuery(QUERY_BY_CUSTOMER_BORROWER);
    List<String> list =
        cusCidCustIdList.stream().map(s -> StringUtils.rightPad(s, 8)).collect(Collectors.toList());
    query.setParameter("cusCidCustIdList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsOutstanding> getOutstandingsByDeal(String deaPidDeal) {
    return getOutstandingsByDeal(Collections.singletonList(deaPidDeal), 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByDeal(String deaPidDeal, int offset, int maxResults) {
    return getOutstandingsByDeal(Collections.singletonList(deaPidDeal), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByDeal(List<String> deaPidDealList) {
    return getOutstandingsByDeal(deaPidDealList, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByDeal(
      List<String> deaPidDealList, int offset, int maxResults) {
    TypedQuery<VlsOutstanding> query = createQuery(QUERY_BY_DEAL);
    List<String> list =
        deaPidDealList.stream().map(s -> StringUtils.rightPad(s, 8)).collect(Collectors.toList());
    query.setParameter("deaPidDealList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsOutstanding> getOutstandingsByFacility(String facPidFacility) {
    return getOutstandingsByFacility(
        Collections.singletonList(facPidFacility), 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByFacility(
      String facPidFacility, int offset, int maxResults) {
    return getOutstandingsByFacility(Collections.singletonList(facPidFacility), offset, maxResults);
  }

  public List<VlsOutstanding> getOutstandingsByFacility(List<String> facPidFacilityList) {
    return getOutstandingsByFacility(facPidFacilityList, 0, Integer.MAX_VALUE);
  }

  public List<VlsOutstanding> getOutstandingsByFacility(
      List<String> facPidFacilityList, int offset, int maxResults) {
    TypedQuery<VlsOutstanding> query = createQuery(QUERY_BY_FACILITY);
    List<String> list =
        facPidFacilityList.stream()
            .map(s -> StringUtils.rightPad(s, 8))
            .collect(Collectors.toList());
    query.setParameter("facPidFacilityList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsOutstanding> getOutstandingsByColumnValue(
      VlsOutstandingFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsOutstanding> getOutstandingsByColumnValue(
      VlsOutstandingFields column1,
      List<String> values1,
      VlsOutstandingFields column2,
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
