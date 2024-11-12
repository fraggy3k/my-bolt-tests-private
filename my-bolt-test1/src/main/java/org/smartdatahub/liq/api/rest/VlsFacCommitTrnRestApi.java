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
import org.smartdatahub.liq.api.response.ResponseFacCommitTrn;
import org.smartdatahub.liq.commons.SdhUtils;
import org.smartdatahub.liq.commons.Util;
import org.smartdatahub.liq.entity.dao.VlsFacCommitTrnDAO;
import org.smartdatahub.liq.entity.interfaces.LiqFacCommitTrn;
import org.smartdatahub.liq.entity.original.VlsFacCommitTrn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The facility commitment transaction table. Transactions which affect a lender's position in a
 * facility.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@RestController
@RequestMapping(ApiVersions.V1 + "/facCommitTrn")
public class VlsFacCommitTrnRestApi {

  private int DEFAULT_MAX_RESULTS = 100;

  private static Logger LOG = LoggerFactory.getLogger(VlsFacCommitTrnRestApi.class);

  @Autowired private VlsFacCommitTrnDAO dao;
  @Autowired private DozerBeanMapper mapper;

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facCommitTrn/XXXXXX <br>
   * - http://localhost:8090/v1/facCommitTrn/findById?id=XXXXX<br>
   */
  @RequestMapping(
      value = {"/{id}", "/findById"},
      method = {RequestMethod.GET})
  public ResponseFacCommitTrn findById(
      @PathVariable(value = "id", required = false) String id1,
      @RequestParam(value = "id", required = false) String id2) {
    String id = (id1 != null) ? id1 : id2;
    Objects.requireNonNull(id, "id can not be null");
    VlsFacCommitTrn entity = dao.findById(id);
    return map(entity);
  }
  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/facCommitTrn/findByIds?id=XXXXX&id=ABCSDE&id=123456<br>
   * <br>
   * - https://localhost:8090/v1/facCommitTrn/findByIds?sqlList='XXXXX','ABCSDE','123456'<br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = {"/findByIds"},
      method = {RequestMethod.GET})
  public List<ResponseFacCommitTrn> findByIds(
      @RequestParam(value = "id", required = false) List<String> ids,
      @RequestParam(value = "sqlList", required = false) String sqlList) {
    if (ids == null || ids.isEmpty()) {
      ids = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    return map(dao.findByIds(ids));
  }
  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facCommitTrn/list/0-100<br>
   */
  @RequestMapping(
      value = "/list/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseFacCommitTrn> listPaging(
      @PathVariable("offset") Integer offset, @PathVariable("maxResults") Integer maxResults) {
    return list(offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facCommitTrn/list<br>
   */
  @RequestMapping(
      value = "/list",
      method = {RequestMethod.GET})
  public List<ResponseFacCommitTrn> list(
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {

    List<VlsFacCommitTrn> list =
        dao.list(
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByDeal/XXXXX <br>
   * - http://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByDeal/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getFacCommitTrnsByDeal/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseFacCommitTrn> getFacCommitTrnsByDealPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getFacCommitTrnsByDeal(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByDeal?id=XXXXX <br>
   * -
   * https://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByDeal?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByDeal?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getFacCommitTrnsByDeal",
      method = {RequestMethod.GET})
  public List<ResponseFacCommitTrn> getFacCommitTrnsByDeal(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsFacCommitTrn> list =
        dao.getFacCommitTrnsByDeal(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByFacility/XXXXX <br>
   * - http://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByFacility/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getFacCommitTrnsByFacility/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseFacCommitTrn> getFacCommitTrnsByFacilityPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getFacCommitTrnsByFacility(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByFacility?id=XXXXX <br>
   * -
   * https://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByFacility?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByFacility?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getFacCommitTrnsByFacility",
      method = {RequestMethod.GET})
  public List<ResponseFacCommitTrn> getFacCommitTrnsByFacility(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsFacCommitTrn> list =
        dao.getFacCommitTrnsByFacility(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByOstTran/XXXXX <br>
   * - http://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByOstTran/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getFacCommitTrnsByOstTran/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseFacCommitTrn> getFacCommitTrnsByOstTranPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getFacCommitTrnsByOstTran(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByOstTran?id=XXXXX <br>
   * -
   * https://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByOstTran?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/facCommitTrn/getFacCommitTrnsByOstTran?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getFacCommitTrnsByOstTran",
      method = {RequestMethod.GET})
  public List<ResponseFacCommitTrn> getFacCommitTrnsByOstTran(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsFacCommitTrn> list =
        dao.getFacCommitTrnsByOstTran(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  private ResponseFacCommitTrn map(LiqFacCommitTrn entity) {
    ResponseFacCommitTrn response = mapper.map(entity, ResponseFacCommitTrn.class);
    return response;
  }

  private List<ResponseFacCommitTrn> map(List<? extends LiqFacCommitTrn> list) {
    return list.stream().map(e -> map(e)).collect(Collectors.toList());
  }
}
