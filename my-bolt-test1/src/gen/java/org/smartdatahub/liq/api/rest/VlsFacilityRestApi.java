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
import org.smartdatahub.liq.api.response.ResponseFacility;
import org.smartdatahub.liq.commons.SdhUtils;
import org.smartdatahub.liq.commons.Util;
import org.smartdatahub.liq.entity.dao.VlsFacilityDAO;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.original.VlsFacility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The facility table. A credit arrangement established by the bank for the client.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@RestController
@RequestMapping(ApiVersions.V1 + "/facility")
public class VlsFacilityRestApi {

  private int DEFAULT_MAX_RESULTS = 100;

  private static Logger LOG = LoggerFactory.getLogger(VlsFacilityRestApi.class);

  @Autowired private VlsFacilityDAO dao;
  @Autowired private DozerBeanMapper mapper;

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facility/XXXXXX <br>
   * - http://localhost:8090/v1/facility/findById?id=XXXXX<br>
   */
  @RequestMapping(
      value = {"/{id}", "/findById"},
      method = {RequestMethod.GET})
  public ResponseFacility findById(
      @PathVariable(value = "id", required = false) String id1,
      @RequestParam(value = "id", required = false) String id2) {
    String id = (id1 != null) ? id1 : id2;
    Objects.requireNonNull(id, "id can not be null");
    VlsFacility entity = dao.findById(id);
    return map(entity);
  }
  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/facility/findByIds?id=XXXXX&id=ABCSDE&id=123456<br>
   * <br>
   * - https://localhost:8090/v1/facility/findByIds?sqlList='XXXXX','ABCSDE','123456'<br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = {"/findByIds"},
      method = {RequestMethod.GET})
  public List<ResponseFacility> findByIds(
      @RequestParam(value = "id", required = false) List<String> ids,
      @RequestParam(value = "sqlList", required = false) String sqlList) {
    if (ids == null || ids.isEmpty()) {
      ids = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    return map(dao.findByIds(ids));
  }
  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facility/list/0-100<br>
   */
  @RequestMapping(
      value = "/list/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseFacility> listPaging(
      @PathVariable("offset") Integer offset, @PathVariable("maxResults") Integer maxResults) {
    return list(offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facility/list<br>
   */
  @RequestMapping(
      value = "/list",
      method = {RequestMethod.GET})
  public List<ResponseFacility> list(
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {

    List<VlsFacility> list =
        dao.list(
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facility/getFacilitiesByBank/XXXXX <br>
   * - http://localhost:8090/v1/facility/getFacilitiesByBank/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getFacilitiesByBank/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseFacility> getFacilitiesByBankPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getFacilitiesByBank(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/facility/getFacilitiesByBank?id=XXXXX <br>
   * - https://localhost:8090/v1/facility/getFacilitiesByBank?id=XXXXX&offset=0&maxResults=100<br>
   * -
   * https://localhost:8090/v1/facility/getFacilitiesByBank?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getFacilitiesByBank",
      method = {RequestMethod.GET})
  public List<ResponseFacility> getFacilitiesByBank(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsFacility> list =
        dao.getFacilitiesByBank(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facility/getFacilitiesByBranch/XXXXX <br>
   * - http://localhost:8090/v1/facility/getFacilitiesByBranch/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getFacilitiesByBranch/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseFacility> getFacilitiesByBranchPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getFacilitiesByBranch(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/facility/getFacilitiesByBranch?id=XXXXX <br>
   * - https://localhost:8090/v1/facility/getFacilitiesByBranch?id=XXXXX&offset=0&maxResults=100<br>
   * -
   * https://localhost:8090/v1/facility/getFacilitiesByBranch?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getFacilitiesByBranch",
      method = {RequestMethod.GET})
  public List<ResponseFacility> getFacilitiesByBranch(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsFacility> list =
        dao.getFacilitiesByBranch(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facility/getFacilitiesByDeal/XXXXX <br>
   * - http://localhost:8090/v1/facility/getFacilitiesByDeal/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getFacilitiesByDeal/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseFacility> getFacilitiesByDealPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getFacilitiesByDeal(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/facility/getFacilitiesByDeal?id=XXXXX <br>
   * - https://localhost:8090/v1/facility/getFacilitiesByDeal?id=XXXXX&offset=0&maxResults=100<br>
   * -
   * https://localhost:8090/v1/facility/getFacilitiesByDeal?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getFacilitiesByDeal",
      method = {RequestMethod.GET})
  public List<ResponseFacility> getFacilitiesByDeal(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsFacility> list =
        dao.getFacilitiesByDeal(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facility/getFacilitiesByFacilityType/XXXXX <br>
   * - http://localhost:8090/v1/facility/getFacilitiesByFacilityType/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getFacilitiesByFacilityType/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseFacility> getFacilitiesByFacilityTypePaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getFacilitiesByFacilityType(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/facility/getFacilitiesByFacilityType?id=XXXXX <br>
   * -
   * https://localhost:8090/v1/facility/getFacilitiesByFacilityType?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/facility/getFacilitiesByFacilityType?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getFacilitiesByFacilityType",
      method = {RequestMethod.GET})
  public List<ResponseFacility> getFacilitiesByFacilityType(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsFacility> list =
        dao.getFacilitiesByFacilityType(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  private ResponseFacility map(LiqFacility entity) {
    ResponseFacility response = mapper.map(entity, ResponseFacility.class);
    return response;
  }

  private List<ResponseFacility> map(List<? extends LiqFacility> list) {
    return list.stream().map(e -> map(e)).collect(Collectors.toList());
  }
}
