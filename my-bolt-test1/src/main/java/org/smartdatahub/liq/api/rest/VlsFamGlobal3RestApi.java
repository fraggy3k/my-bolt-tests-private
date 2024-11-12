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
import org.smartdatahub.liq.api.response.ResponseFamGlobal3;
import org.smartdatahub.liq.commons.Util;
import org.smartdatahub.liq.entity.dao.VlsFamGlobal3DAO;
import org.smartdatahub.liq.entity.interfaces.IdClassFamGlobal3;
import org.smartdatahub.liq.entity.interfaces.LiqFamGlobal3;
import org.smartdatahub.liq.entity.original.VlsFamGlobal3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** @author Julian Egyptien (smartdatahub.org) */
@RestController
@RequestMapping(ApiVersions.V1 + "/famGlobal3")
public class VlsFamGlobal3RestApi {

  private int DEFAULT_MAX_RESULTS = 100;

  private static Logger LOG = LoggerFactory.getLogger(VlsFamGlobal3RestApi.class);

  @Autowired private VlsFamGlobal3DAO dao;
  @Autowired private DozerBeanMapper mapper;

  @RequestMapping(
      value = {"/findById", "/{cdeCode}/{cdeFkey1}/{tidTableId}"},
      method = {RequestMethod.GET})
  public ResponseFamGlobal3 findById(
      @PathVariable(value = "cdeCode", required = false) String cdeCode1,
      @RequestParam(value = "cdeCode", required = false) String cdeCode2,
      @PathVariable(value = "cdeFkey1", required = false) String cdeFkey11,
      @RequestParam(value = "cdeFkey1", required = false) String cdeFkey12,
      @PathVariable(value = "tidTableId", required = false) String tidTableId1,
      @RequestParam(value = "tidTableId", required = false) String tidTableId2) {
    String cdeCode = (cdeCode1 != null) ? cdeCode1 : cdeCode2;
    Objects.requireNonNull(cdeCode, "cdeCode can not be null");
    String cdeFkey1 = (cdeFkey11 != null) ? cdeFkey11 : cdeFkey12;
    Objects.requireNonNull(cdeFkey1, "cdeFkey1 can not be null");
    String tidTableId = (tidTableId1 != null) ? tidTableId1 : tidTableId2;
    Objects.requireNonNull(tidTableId, "tidTableId can not be null");
    IdClassFamGlobal3 id = new IdClassFamGlobal3(cdeCode, cdeFkey1, tidTableId);
    VlsFamGlobal3 entity = dao.findById(id);
    return map(entity);
  }
  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/famGlobal3/list/0-100<br>
   */
  @RequestMapping(
      value = "/list/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseFamGlobal3> listPaging(
      @PathVariable("offset") Integer offset, @PathVariable("maxResults") Integer maxResults) {
    return list(offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/famGlobal3/list<br>
   */
  @RequestMapping(
      value = "/list",
      method = {RequestMethod.GET})
  public List<ResponseFamGlobal3> list(
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {

    List<VlsFamGlobal3> list =
        dao.list(
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  private ResponseFamGlobal3 map(LiqFamGlobal3 entity) {
    ResponseFamGlobal3 response = mapper.map(entity, ResponseFamGlobal3.class);
    return response;
  }

  private List<ResponseFamGlobal3> map(List<? extends LiqFamGlobal3> list) {
    return list.stream().map(e -> map(e)).collect(Collectors.toList());
  }
}
