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
import org.smartdatahub.liq.api.response.ResponseOstTran;
import org.smartdatahub.liq.commons.SdhUtils;
import org.smartdatahub.liq.commons.Util;
import org.smartdatahub.liq.entity.dao.VlsOstTranDAO;
import org.smartdatahub.liq.entity.interfaces.LiqOstTran;
import org.smartdatahub.liq.entity.original.VlsOstTran;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The outstanding transaction table. Transactions directly related to outstandings.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@RestController
@RequestMapping(ApiVersions.V1 + "/ostTran")
public class VlsOstTranRestApi {

  private int DEFAULT_MAX_RESULTS = 100;

  private static Logger LOG = LoggerFactory.getLogger(VlsOstTranRestApi.class);

  @Autowired private VlsOstTranDAO dao;
  @Autowired private DozerBeanMapper mapper;

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/ostTran/XXXXXX <br>
   * - http://localhost:8090/v1/ostTran/findById?id=XXXXX<br>
   */
  @RequestMapping(
      value = {"/{id}", "/findById"},
      method = {RequestMethod.GET})
  public ResponseOstTran findById(
      @PathVariable(value = "id", required = false) String id1,
      @RequestParam(value = "id", required = false) String id2) {
    String id = (id1 != null) ? id1 : id2;
    Objects.requireNonNull(id, "id can not be null");
    VlsOstTran entity = dao.findById(id);
    return map(entity);
  }
  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/ostTran/findByIds?id=XXXXX&id=ABCSDE&id=123456<br>
   * <br>
   * - https://localhost:8090/v1/ostTran/findByIds?sqlList='XXXXX','ABCSDE','123456'<br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = {"/findByIds"},
      method = {RequestMethod.GET})
  public List<ResponseOstTran> findByIds(
      @RequestParam(value = "id", required = false) List<String> ids,
      @RequestParam(value = "sqlList", required = false) String sqlList) {
    if (ids == null || ids.isEmpty()) {
      ids = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    return map(dao.findByIds(ids));
  }
  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/ostTran/list/0-100<br>
   */
  @RequestMapping(
      value = "/list/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseOstTran> listPaging(
      @PathVariable("offset") Integer offset, @PathVariable("maxResults") Integer maxResults) {
    return list(offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/ostTran/list<br>
   */
  @RequestMapping(
      value = "/list",
      method = {RequestMethod.GET})
  public List<ResponseOstTran> list(
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {

    List<VlsOstTran> list =
        dao.list(
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/ostTran/getOstTransByFacCommitTrnCommitTrn/XXXXX <br>
   * - http://localhost:8090/v1/ostTran/getOstTransByFacCommitTrnCommitTrn/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getOstTransByFacCommitTrnCommitTrn/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseOstTran> getOstTransByFacCommitTrnCommitTrnPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getOstTransByFacCommitTrnCommitTrn(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/ostTran/getOstTransByFacCommitTrnCommitTrn?id=XXXXX <br>
   * -
   * https://localhost:8090/v1/ostTran/getOstTransByFacCommitTrnCommitTrn?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/ostTran/getOstTransByFacCommitTrnCommitTrn?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getOstTransByFacCommitTrnCommitTrn",
      method = {RequestMethod.GET})
  public List<ResponseOstTran> getOstTransByFacCommitTrnCommitTrn(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsOstTran> list =
        dao.getOstTransByFacCommitTrnCommitTrn(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/ostTran/getOstTransByOriginalOutstanding/XXXXX <br>
   * - http://localhost:8090/v1/ostTran/getOstTransByOriginalOutstanding/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getOstTransByOriginalOutstanding/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseOstTran> getOstTransByOriginalOutstandingPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getOstTransByOriginalOutstanding(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/ostTran/getOstTransByOriginalOutstanding?id=XXXXX <br>
   * -
   * https://localhost:8090/v1/ostTran/getOstTransByOriginalOutstanding?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/ostTran/getOstTransByOriginalOutstanding?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getOstTransByOriginalOutstanding",
      method = {RequestMethod.GET})
  public List<ResponseOstTran> getOstTransByOriginalOutstanding(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsOstTran> list =
        dao.getOstTransByOriginalOutstanding(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/ostTran/getOstTransByOutstanding/XXXXX <br>
   * - http://localhost:8090/v1/ostTran/getOstTransByOutstanding/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getOstTransByOutstanding/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseOstTran> getOstTransByOutstandingPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getOstTransByOutstanding(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/ostTran/getOstTransByOutstanding?id=XXXXX <br>
   * - https://localhost:8090/v1/ostTran/getOstTransByOutstanding?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/ostTran/getOstTransByOutstanding?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getOstTransByOutstanding",
      method = {RequestMethod.GET})
  public List<ResponseOstTran> getOstTransByOutstanding(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsOstTran> list =
        dao.getOstTransByOutstanding(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  private ResponseOstTran map(LiqOstTran entity) {
    ResponseOstTran response = mapper.map(entity, ResponseOstTran.class);
    return response;
  }

  private List<ResponseOstTran> map(List<? extends LiqOstTran> list) {
    return list.stream().map(e -> map(e)).collect(Collectors.toList());
  }
}
