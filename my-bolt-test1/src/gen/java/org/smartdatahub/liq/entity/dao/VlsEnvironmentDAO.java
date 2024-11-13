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
import org.smartdatahub.liq.entity.interfaces.IdClassEnvironment;
import org.smartdatahub.liq.entity.original.VlsEnvironment;
import org.smartdatahub.liq.enums.VlsEnvironmentFields;
import org.springframework.stereotype.Component;

@Component
public class VlsEnvironmentDAO extends AbstractJpaDAO<VlsEnvironment, IdClassEnvironment> {

  public VlsEnvironmentDAO() {
    super(VlsEnvironment.class, IdClassEnvironment.class);
  }

  private static String QUERY_BY_TIME_REGION =
      "select e from VlsEnvironment e where e.liqTimeRegion.cdeCode in (:trgCdeCodeList)";

  public List<VlsEnvironment> getEnvironmentsByNmeVarClass(String value) {
    return getEnvironmentsByNmeVarClass(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsEnvironment> getEnvironmentsByNmeVarClass(
      String value, int offset, int maxResults) {
    return getEnvironmentsByNmeVarClass(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsEnvironment> getEnvironmentsByNmeVarClass(List<String> values) {
    return getEnvironmentsByNmeVarClass(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsEnvironment> getEnvironmentsByNmeVarClass(
      List<String> values, int offset, int maxResults) {
    return getEnvironmentsByColumnValue(
        VlsEnvironmentFields.nmeVarClass, values, offset, maxResults);
  }

  public List<VlsEnvironment> getEnvironmentsByNmeVarName(String value) {
    return getEnvironmentsByNmeVarName(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsEnvironment> getEnvironmentsByNmeVarName(
      String value, int offset, int maxResults) {
    return getEnvironmentsByNmeVarName(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsEnvironment> getEnvironmentsByNmeVarName(List<String> values) {
    return getEnvironmentsByNmeVarName(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsEnvironment> getEnvironmentsByNmeVarName(
      List<String> values, int offset, int maxResults) {
    return getEnvironmentsByColumnValue(
        VlsEnvironmentFields.nmeVarName, values, offset, maxResults);
  }

  public List<VlsEnvironment> getEnvironmentsByTxtComment(String value) {
    return getEnvironmentsByTxtComment(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsEnvironment> getEnvironmentsByTxtComment(
      String value, int offset, int maxResults) {
    return getEnvironmentsByTxtComment(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsEnvironment> getEnvironmentsByTxtComment(List<String> values) {
    return getEnvironmentsByTxtComment(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsEnvironment> getEnvironmentsByTxtComment(
      List<String> values, int offset, int maxResults) {
    return getEnvironmentsByColumnValue(
        VlsEnvironmentFields.txtComment, values, offset, maxResults);
  }

  public List<VlsEnvironment> getEnvironmentsByTxtVarValue(String value) {
    return getEnvironmentsByTxtVarValue(value, 0, Integer.MAX_VALUE);
  }

  public List<VlsEnvironment> getEnvironmentsByTxtVarValue(
      String value, int offset, int maxResults) {
    return getEnvironmentsByTxtVarValue(Collections.singletonList(value), offset, maxResults);
  }

  public List<VlsEnvironment> getEnvironmentsByTxtVarValue(List<String> values) {
    return getEnvironmentsByTxtVarValue(values, 0, Integer.MAX_VALUE);
  }

  public List<VlsEnvironment> getEnvironmentsByTxtVarValue(
      List<String> values, int offset, int maxResults) {
    return getEnvironmentsByColumnValue(
        VlsEnvironmentFields.txtVarValue, values, offset, maxResults);
  }

  public List<VlsEnvironment> getEnvironmentsByTimeRegion(String trgCdeCode) {
    return getEnvironmentsByTimeRegion(Collections.singletonList(trgCdeCode), 0, Integer.MAX_VALUE);
  }

  public List<VlsEnvironment> getEnvironmentsByTimeRegion(
      String trgCdeCode, int offset, int maxResults) {
    return getEnvironmentsByTimeRegion(Collections.singletonList(trgCdeCode), offset, maxResults);
  }

  public List<VlsEnvironment> getEnvironmentsByTimeRegion(List<String> trgCdeCodeList) {
    return getEnvironmentsByTimeRegion(trgCdeCodeList, 0, Integer.MAX_VALUE);
  }

  public List<VlsEnvironment> getEnvironmentsByTimeRegion(
      List<String> trgCdeCodeList, int offset, int maxResults) {
    TypedQuery<VlsEnvironment> query = createQuery(QUERY_BY_TIME_REGION);
    List<String> list =
        trgCdeCodeList.stream().map(s -> StringUtils.rightPad(s, 5)).collect(Collectors.toList());
    query.setParameter("trgCdeCodeList", list);
    query.setMaxResults(maxResults);
    query.setFirstResult(offset);
    return query.getResultList();
  }

  public List<VlsEnvironment> getEnvironmentsByColumnValue(
      VlsEnvironmentFields column, List<String> values, int offset, int maxResults) {
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

  public List<VlsEnvironment> getEnvironmentsByColumnValue(
      VlsEnvironmentFields column1,
      List<String> values1,
      VlsEnvironmentFields column2,
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
