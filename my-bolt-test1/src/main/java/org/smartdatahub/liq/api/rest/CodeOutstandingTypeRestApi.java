/*
   THIS IS A GENERATED CLASS
   Please do not edit this class
*/
package org.smartdatahub.liq.api.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smartdatahub.liq.api.response.ResponseCodeOutstandingType;
import org.smartdatahub.liq.commons.Util;
import org.smartdatahub.liq.entity.dao.CodeOutstandingTypeDAO;
import org.smartdatahub.liq.entity.interfaces.IdClassFamGlobal2;
import org.smartdatahub.liq.entity.interfaces.LiqCodeOutstandingType;
import org.smartdatahub.liq.entity.original.CodeOutstandingType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** @author Julian Egyptien (smartdatahub.org) */
@RestController
@RequestMapping(ApiVersions.V1 + "/outstandingType")
public class CodeOutstandingTypeRestApi {

  private int DEFAULT_MAX_RESULTS = 100;

  private static Logger LOG = LoggerFactory.getLogger(CodeOutstandingTypeRestApi.class);

  @Autowired private CodeOutstandingTypeDAO dao;
  @Autowired private DozerBeanMapper mapper;

  @RequestMapping(
      value = "/findById",
      method = {RequestMethod.GET})
  public ResponseCodeOutstandingType findById(@RequestParam("cdeCode") String cdeCode) {
    IdClassFamGlobal2 id = new IdClassFamGlobal2(cdeCode, CodeOutstandingType.DISCRIMINATOR_VALUE);
    CodeOutstandingType entity = dao.findById(id);
    return map(entity);
  }
  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/outstandingType/list/0-100<br>
   */
  @RequestMapping(
      value = "/list/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseCodeOutstandingType> listPaging(
      @PathVariable("offset") Integer offset, @PathVariable("maxResults") Integer maxResults) {
    return list(offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/outstandingType/list<br>
   */
  @RequestMapping(
      value = "/list",
      method = {RequestMethod.GET})
  public List<ResponseCodeOutstandingType> list(
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {

    List<CodeOutstandingType> list =
        dao.list(
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  private ResponseCodeOutstandingType map(LiqCodeOutstandingType entity) {
    ResponseCodeOutstandingType response = mapper.map(entity, ResponseCodeOutstandingType.class);
    return response;
  }

  private List<ResponseCodeOutstandingType> map(List<? extends LiqCodeOutstandingType> list) {
    return list.stream().map(e -> map(e)).collect(Collectors.toList());
  }
}
