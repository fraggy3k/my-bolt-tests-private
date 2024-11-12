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
import org.smartdatahub.liq.api.response.ResponseCodeBank;
import org.smartdatahub.liq.commons.Util;
import org.smartdatahub.liq.entity.dao.CodeBankDAO;
import org.smartdatahub.liq.entity.interfaces.IdClassFamGlobal2;
import org.smartdatahub.liq.entity.interfaces.LiqCodeBank;
import org.smartdatahub.liq.entity.original.CodeBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** @author Julian Egyptien (smartdatahub.org) */
@RestController
@RequestMapping(ApiVersions.V1 + "/bank")
public class CodeBankRestApi {

  private int DEFAULT_MAX_RESULTS = 100;

  private static Logger LOG = LoggerFactory.getLogger(CodeBankRestApi.class);

  @Autowired private CodeBankDAO dao;
  @Autowired private DozerBeanMapper mapper;

  @RequestMapping(
      value = "/findById",
      method = {RequestMethod.GET})
  public ResponseCodeBank findById(@RequestParam("cdeCode") String cdeCode) {
    IdClassFamGlobal2 id = new IdClassFamGlobal2(cdeCode, CodeBank.DISCRIMINATOR_VALUE);
    CodeBank entity = dao.findById(id);
    return map(entity);
  }
  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/bank/list/0-100<br>
   */
  @RequestMapping(
      value = "/list/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseCodeBank> listPaging(
      @PathVariable("offset") Integer offset, @PathVariable("maxResults") Integer maxResults) {
    return list(offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/bank/list<br>
   */
  @RequestMapping(
      value = "/list",
      method = {RequestMethod.GET})
  public List<ResponseCodeBank> list(
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {

    List<CodeBank> list =
        dao.list(
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  private ResponseCodeBank map(LiqCodeBank entity) {
    ResponseCodeBank response = mapper.map(entity, ResponseCodeBank.class);
    return response;
  }

  private List<ResponseCodeBank> map(List<? extends LiqCodeBank> list) {
    return list.stream().map(e -> map(e)).collect(Collectors.toList());
  }
}
