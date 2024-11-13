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
import org.smartdatahub.liq.api.response.ResponseEnvironment;
import org.smartdatahub.liq.commons.SdhUtils;
import org.smartdatahub.liq.commons.Util;
import org.smartdatahub.liq.entity.dao.VlsEnvironmentDAO;
import org.smartdatahub.liq.entity.interfaces.IdClassEnvironment;
import org.smartdatahub.liq.entity.interfaces.LiqEnvironment;
import org.smartdatahub.liq.entity.original.VlsEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Details of the user environment.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@RestController
@RequestMapping(ApiVersions.V1 + "/environment")
public class VlsEnvironmentRestApi {

  private int DEFAULT_MAX_RESULTS = 100;

  private static Logger LOG = LoggerFactory.getLogger(VlsEnvironmentRestApi.class);

  @Autowired private VlsEnvironmentDAO dao;
  @Autowired private DozerBeanMapper mapper;

  @RequestMapping(
      value = {"/findById", "/{nmeVarClass}/{nmeVarName}"},
      method = {RequestMethod.GET})
  public ResponseEnvironment findById(
      @PathVariable(value = "nmeVarClass", required = false) String nmeVarClass1,
      @RequestParam(value = "nmeVarClass", required = false) String nmeVarClass2,
      @PathVariable(value = "nmeVarName", required = false) String nmeVarName1,
      @RequestParam(value = "nmeVarName", required = false) String nmeVarName2) {
    String nmeVarClass = (nmeVarClass1 != null) ? nmeVarClass1 : nmeVarClass2;
    Objects.requireNonNull(nmeVarClass, "nmeVarClass can not be null");
    String nmeVarName = (nmeVarName1 != null) ? nmeVarName1 : nmeVarName2;
    Objects.requireNonNull(nmeVarName, "nmeVarName can not be null");
    IdClassEnvironment id = new IdClassEnvironment(nmeVarClass, nmeVarName);
    VlsEnvironment entity = dao.findById(id);
    return map(entity);
  }
  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/environment/list/0-100<br>
   */
  @RequestMapping(
      value = "/list/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseEnvironment> listPaging(
      @PathVariable("offset") Integer offset, @PathVariable("maxResults") Integer maxResults) {
    return list(offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/environment/list<br>
   */
  @RequestMapping(
      value = "/list",
      method = {RequestMethod.GET})
  public List<ResponseEnvironment> list(
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {

    List<VlsEnvironment> list =
        dao.list(
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/environment/getEnvironmentsByTimeRegion/XXXXX <br>
   * - http://localhost:8090/v1/environment/getEnvironmentsByTimeRegion/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getEnvironmentsByTimeRegion/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseEnvironment> getEnvironmentsByTimeRegionPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getEnvironmentsByTimeRegion(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/environment/getEnvironmentsByTimeRegion?id=XXXXX <br>
   * -
   * https://localhost:8090/v1/environment/getEnvironmentsByTimeRegion?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/environment/getEnvironmentsByTimeRegion?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getEnvironmentsByTimeRegion",
      method = {RequestMethod.GET})
  public List<ResponseEnvironment> getEnvironmentsByTimeRegion(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsEnvironment> list =
        dao.getEnvironmentsByTimeRegion(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  private ResponseEnvironment map(LiqEnvironment entity) {
    ResponseEnvironment response = mapper.map(entity, ResponseEnvironment.class);
    return response;
  }

  private List<ResponseEnvironment> map(List<? extends LiqEnvironment> list) {
    return list.stream().map(e -> map(e)).collect(Collectors.toList());
  }
}
