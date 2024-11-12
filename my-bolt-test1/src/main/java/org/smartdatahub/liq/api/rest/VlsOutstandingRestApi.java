/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.api.rest;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smartdatahub.liq.api.response.ResponseOutstanding;
import org.smartdatahub.liq.commons.SdhUtils;
import org.smartdatahub.liq.commons.Util;
import org.smartdatahub.liq.entity.dao.VlsOutstandingDAO;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.original.VlsOutstanding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The outstanding table. Outstanding amounts and dates for loans and letters of credit.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@RestController
@RequestMapping(ApiVersions.V1 + "/outstanding")
public class VlsOutstandingRestApi {

  private int DEFAULT_MAX_RESULTS = 100;

  private static Logger LOG = LoggerFactory.getLogger(VlsOutstandingRestApi.class);

  @Autowired private VlsOutstandingDAO dao;
  @Autowired private DozerBeanMapper mapper;

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/outstanding/XXXXXX <br>
   * - http://localhost:8090/v1/outstanding/findById?id=XXXXX<br>
   */
  @RequestMapping(
      value = {"/{id}", "/findById"},
      method = {RequestMethod.GET})
  public ResponseOutstanding findById(
      @PathVariable(value = "id", required = false) String id1,
      @RequestParam(value = "id", required = false) String id2) {
    String id = (id1 != null) ? id1 : id2;
    Objects.requireNonNull(id, "id can not be null");
    VlsOutstanding entity = dao.findById(id);
    return map(entity);
  }
  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/outstanding/findByIds?id=XXXXX&id=ABCSDE&id=123456<br>
   * <br>
   * - https://localhost:8090/v1/outstanding/findByIds?sqlList='XXXXX','ABCSDE','123456'<br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = {"/findByIds"},
      method = {RequestMethod.GET})
  public List<ResponseOutstanding> findByIds(
      @RequestParam(value = "id", required = false) List<String> ids,
      @RequestParam(value = "sqlList", required = false) String sqlList) {
    if (ids == null || ids.isEmpty()) {
      ids = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    return map(dao.findByIds(ids));
  }
  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/outstanding/list/0-100<br>
   */
  @RequestMapping(
      value = "/list/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseOutstanding> listPaging(
      @PathVariable("offset") Integer offset, @PathVariable("maxResults") Integer maxResults) {
    return list(offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/outstanding/list<br>
   */
  @RequestMapping(
      value = "/list",
      method = {RequestMethod.GET})
  public List<ResponseOutstanding> list(
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {

    List<VlsOutstanding> list =
        dao.list(
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/outstanding/getOutstandingsByCustomerBorrower/XXXXX <br>
   * - http://localhost:8090/v1/outstanding/getOutstandingsByCustomerBorrower/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getOutstandingsByCustomerBorrower/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseOutstanding> getOutstandingsByCustomerBorrowerPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getOutstandingsByCustomerBorrower(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/outstanding/getOutstandingsByCustomerBorrower?id=XXXXX <br>
   * -
   * https://localhost:8090/v1/outstanding/getOutstandingsByCustomerBorrower?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/outstanding/getOutstandingsByCustomerBorrower?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getOutstandingsByCustomerBorrower",
      method = {RequestMethod.GET})
  public List<ResponseOutstanding> getOutstandingsByCustomerBorrower(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsOutstanding> list =
        dao.getOutstandingsByCustomerBorrower(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/outstanding/getOutstandingsByDeal/XXXXX <br>
   * - http://localhost:8090/v1/outstanding/getOutstandingsByDeal/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getOutstandingsByDeal/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseOutstanding> getOutstandingsByDealPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getOutstandingsByDeal(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/outstanding/getOutstandingsByDeal?id=XXXXX <br>
   * - https://localhost:8090/v1/outstanding/getOutstandingsByDeal?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/outstanding/getOutstandingsByDeal?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getOutstandingsByDeal",
      method = {RequestMethod.GET})
  public List<ResponseOutstanding> getOutstandingsByDeal(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsOutstanding> list =
        dao.getOutstandingsByDeal(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/outstanding/getOutstandingsByFacility/XXXXX <br>
   * - http://localhost:8090/v1/outstanding/getOutstandingsByFacility/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getOutstandingsByFacility/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseOutstanding> getOutstandingsByFacilityPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getOutstandingsByFacility(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/outstanding/getOutstandingsByFacility?id=XXXXX <br>
   * -
   * https://localhost:8090/v1/outstanding/getOutstandingsByFacility?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/outstanding/getOutstandingsByFacility?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getOutstandingsByFacility",
      method = {RequestMethod.GET})
  public List<ResponseOutstanding> getOutstandingsByFacility(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsOutstanding> list =
        dao.getOutstandingsByFacility(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  private ResponseOutstanding map(LiqOutstanding entity) {
    ResponseOutstanding response = mapper.map(entity, ResponseOutstanding.class);
    return response;
  }

  private List<ResponseOutstanding> map(List<? extends LiqOutstanding> list) {
    return list.stream().map(e -> map(e)).collect(Collectors.toList());
  }
}
