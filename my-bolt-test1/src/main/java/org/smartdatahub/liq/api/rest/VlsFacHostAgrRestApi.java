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
import org.smartdatahub.liq.api.response.ResponseFacHostAgr;
import org.smartdatahub.liq.commons.SdhUtils;
import org.smartdatahub.liq.commons.Util;
import org.smartdatahub.liq.entity.dao.VlsFacHostAgrDAO;
import org.smartdatahub.liq.entity.interfaces.IdClassFacHostAgr;
import org.smartdatahub.liq.entity.interfaces.LiqFacHostAgr;
import org.smartdatahub.liq.entity.original.VlsFacHostAgr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The facility host bank agregation. Finstra version was almost empty -> filled by best knowledge
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@RestController
@RequestMapping(ApiVersions.V1 + "/facHostAgr")
public class VlsFacHostAgrRestApi {

  private int DEFAULT_MAX_RESULTS = 100;

  private static Logger LOG = LoggerFactory.getLogger(VlsFacHostAgrRestApi.class);

  @Autowired private VlsFacHostAgrDAO dao;
  @Autowired private DozerBeanMapper mapper;

  @RequestMapping(
      value = {"/findById", "/{pidDeal}/{pidFacility}"},
      method = {RequestMethod.GET})
  public ResponseFacHostAgr findById(
      @PathVariable(value = "pidDeal", required = false) String pidDeal1,
      @RequestParam(value = "pidDeal", required = false) String pidDeal2,
      @PathVariable(value = "pidFacility", required = false) String pidFacility1,
      @RequestParam(value = "pidFacility", required = false) String pidFacility2) {
    String pidDeal = (pidDeal1 != null) ? pidDeal1 : pidDeal2;
    Objects.requireNonNull(pidDeal, "pidDeal can not be null");
    String pidFacility = (pidFacility1 != null) ? pidFacility1 : pidFacility2;
    Objects.requireNonNull(pidFacility, "pidFacility can not be null");
    IdClassFacHostAgr id = new IdClassFacHostAgr(pidDeal, pidFacility);
    VlsFacHostAgr entity = dao.findById(id);
    return map(entity);
  }
  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facHostAgr/list/0-100<br>
   */
  @RequestMapping(
      value = "/list/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseFacHostAgr> listPaging(
      @PathVariable("offset") Integer offset, @PathVariable("maxResults") Integer maxResults) {
    return list(offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facHostAgr/list<br>
   */
  @RequestMapping(
      value = "/list",
      method = {RequestMethod.GET})
  public List<ResponseFacHostAgr> list(
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {

    List<VlsFacHostAgr> list =
        dao.list(
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facHostAgr/getFacHostAgrsByDeal/XXXXX <br>
   * - http://localhost:8090/v1/facHostAgr/getFacHostAgrsByDeal/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getFacHostAgrsByDeal/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseFacHostAgr> getFacHostAgrsByDealPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getFacHostAgrsByDeal(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/facHostAgr/getFacHostAgrsByDeal?id=XXXXX <br>
   * - https://localhost:8090/v1/facHostAgr/getFacHostAgrsByDeal?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/facHostAgr/getFacHostAgrsByDeal?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getFacHostAgrsByDeal",
      method = {RequestMethod.GET})
  public List<ResponseFacHostAgr> getFacHostAgrsByDeal(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsFacHostAgr> list =
        dao.getFacHostAgrsByDeal(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facHostAgr/getFacHostAgrsByFacility/XXXXX <br>
   * - http://localhost:8090/v1/facHostAgr/getFacHostAgrsByFacility/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getFacHostAgrsByFacility/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseFacHostAgr> getFacHostAgrsByFacilityPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getFacHostAgrsByFacility(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/facHostAgr/getFacHostAgrsByFacility?id=XXXXX <br>
   * -
   * https://localhost:8090/v1/facHostAgr/getFacHostAgrsByFacility?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/facHostAgr/getFacHostAgrsByFacility?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getFacHostAgrsByFacility",
      method = {RequestMethod.GET})
  public List<ResponseFacHostAgr> getFacHostAgrsByFacility(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsFacHostAgr> list =
        dao.getFacHostAgrsByFacility(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  private ResponseFacHostAgr map(LiqFacHostAgr entity) {
    ResponseFacHostAgr response = mapper.map(entity, ResponseFacHostAgr.class);
    return response;
  }

  private List<ResponseFacHostAgr> map(List<? extends LiqFacHostAgr> list) {
    return list.stream().map(e -> map(e)).collect(Collectors.toList());
  }
}
