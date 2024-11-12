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
import org.smartdatahub.liq.api.response.ResponseFacilityType;
import org.smartdatahub.liq.commons.SdhUtils;
import org.smartdatahub.liq.commons.Util;
import org.smartdatahub.liq.entity.dao.VlsFacilityTypeDAO;
import org.smartdatahub.liq.entity.interfaces.LiqFacilityType;
import org.smartdatahub.liq.entity.original.VlsFacilityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The facililty type table (Please note VLS_FACILITY_TYPE is used and not the code table FAT.html -
 * facility type.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@RestController
@RequestMapping(ApiVersions.V1 + "/facilityType")
public class VlsFacilityTypeRestApi {

  private int DEFAULT_MAX_RESULTS = 100;

  private static Logger LOG = LoggerFactory.getLogger(VlsFacilityTypeRestApi.class);

  @Autowired private VlsFacilityTypeDAO dao;
  @Autowired private DozerBeanMapper mapper;

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facilityType/XXXXXX <br>
   * - http://localhost:8090/v1/facilityType/findById?id=XXXXX<br>
   */
  @RequestMapping(
      value = {"/{id}", "/findById"},
      method = {RequestMethod.GET})
  public ResponseFacilityType findById(
      @PathVariable(value = "id", required = false) String id1,
      @RequestParam(value = "id", required = false) String id2) {
    String id = (id1 != null) ? id1 : id2;
    Objects.requireNonNull(id, "id can not be null");
    VlsFacilityType entity = dao.findById(id);
    return map(entity);
  }
  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/facilityType/findByIds?id=XXXXX&id=ABCSDE&id=123456<br>
   * <br>
   * - https://localhost:8090/v1/facilityType/findByIds?sqlList='XXXXX','ABCSDE','123456'<br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = {"/findByIds"},
      method = {RequestMethod.GET})
  public List<ResponseFacilityType> findByIds(
      @RequestParam(value = "id", required = false) List<String> ids,
      @RequestParam(value = "sqlList", required = false) String sqlList) {
    if (ids == null || ids.isEmpty()) {
      ids = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    return map(dao.findByIds(ids));
  }
  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facilityType/list/0-100<br>
   */
  @RequestMapping(
      value = "/list/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseFacilityType> listPaging(
      @PathVariable("offset") Integer offset, @PathVariable("maxResults") Integer maxResults) {
    return list(offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/facilityType/list<br>
   */
  @RequestMapping(
      value = "/list",
      method = {RequestMethod.GET})
  public List<ResponseFacilityType> list(
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {

    List<VlsFacilityType> list =
        dao.list(
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  private ResponseFacilityType map(LiqFacilityType entity) {
    ResponseFacilityType response = mapper.map(entity, ResponseFacilityType.class);
    return response;
  }

  private List<ResponseFacilityType> map(List<? extends LiqFacilityType> list) {
    return list.stream().map(e -> map(e)).collect(Collectors.toList());
  }
}
