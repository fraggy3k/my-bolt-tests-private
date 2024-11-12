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
import org.smartdatahub.liq.api.response.ResponseDealBorrower;
import org.smartdatahub.liq.commons.SdhUtils;
import org.smartdatahub.liq.commons.Util;
import org.smartdatahub.liq.entity.dao.VlsDealBorrowerDAO;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.original.VlsDealBorrower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The deal borrower table. The borrowers that are associated with a deal.
 *
 * @author Julian Egyptien (smartdatahub.org)
 */
@RestController
@RequestMapping(ApiVersions.V1 + "/dealBorrower")
public class VlsDealBorrowerRestApi {

  private int DEFAULT_MAX_RESULTS = 100;

  private static Logger LOG = LoggerFactory.getLogger(VlsDealBorrowerRestApi.class);

  @Autowired private VlsDealBorrowerDAO dao;
  @Autowired private DozerBeanMapper mapper;

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/dealBorrower/XXXXXX <br>
   * - http://localhost:8090/v1/dealBorrower/findById?id=XXXXX<br>
   */
  @RequestMapping(
      value = {"/{id}", "/findById"},
      method = {RequestMethod.GET})
  public ResponseDealBorrower findById(
      @PathVariable(value = "id", required = false) String id1,
      @RequestParam(value = "id", required = false) String id2) {
    String id = (id1 != null) ? id1 : id2;
    Objects.requireNonNull(id, "id can not be null");
    VlsDealBorrower entity = dao.findById(id);
    return map(entity);
  }
  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/dealBorrower/findByIds?id=XXXXX&id=ABCSDE&id=123456<br>
   * <br>
   * - https://localhost:8090/v1/dealBorrower/findByIds?sqlList='XXXXX','ABCSDE','123456'<br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = {"/findByIds"},
      method = {RequestMethod.GET})
  public List<ResponseDealBorrower> findByIds(
      @RequestParam(value = "id", required = false) List<String> ids,
      @RequestParam(value = "sqlList", required = false) String sqlList) {
    if (ids == null || ids.isEmpty()) {
      ids = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    return map(dao.findByIds(ids));
  }
  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/dealBorrower/list/0-100<br>
   */
  @RequestMapping(
      value = "/list/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseDealBorrower> listPaging(
      @PathVariable("offset") Integer offset, @PathVariable("maxResults") Integer maxResults) {
    return list(offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/dealBorrower/list<br>
   */
  @RequestMapping(
      value = "/list",
      method = {RequestMethod.GET})
  public List<ResponseDealBorrower> list(
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {

    List<VlsDealBorrower> list =
        dao.list(
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/dealBorrower/getDealBorrowersByCustomer/XXXXX <br>
   * - http://localhost:8090/v1/dealBorrower/getDealBorrowersByCustomer/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getDealBorrowersByCustomer/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseDealBorrower> getDealBorrowersByCustomerPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getDealBorrowersByCustomer(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/dealBorrower/getDealBorrowersByCustomer?id=XXXXX <br>
   * -
   * https://localhost:8090/v1/dealBorrower/getDealBorrowersByCustomer?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/dealBorrower/getDealBorrowersByCustomer?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getDealBorrowersByCustomer",
      method = {RequestMethod.GET})
  public List<ResponseDealBorrower> getDealBorrowersByCustomer(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsDealBorrower> list =
        dao.getDealBorrowersByCustomer(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  /**
   * E.g.: <br>
   * - http://localhost:8090/v1/dealBorrower/getDealBorrowersByDeal/XXXXX <br>
   * - http://localhost:8090/v1/dealBorrower/getDealBorrowersByDeal/XXXXX/0-100<br>
   */
  @RequestMapping(
      value = "/getDealBorrowersByDeal/{param}/{offset}-{maxResults}",
      method = {RequestMethod.GET})
  public List<ResponseDealBorrower> getDealBorrowersByDealPaging(
      @PathVariable("param") List<String> idList,
      @PathVariable("offset") Integer offset,
      @PathVariable("maxResults") Integer maxResults) {
    return getDealBorrowersByDeal(idList, null, offset, maxResults);
  }

  /**
   * E.g.: <br>
   * - https://localhost:8090/v1/dealBorrower/getDealBorrowersByDeal?id=XXXXX <br>
   * -
   * https://localhost:8090/v1/dealBorrower/getDealBorrowersByDeal?id=XXXXX&offset=0&maxResults=100
   * <br>
   * -
   * https://localhost:8090/v1/dealBorrower/getDealBorrowersByDeal?sqlList='XXXXX','ABCSDE','123456'&offset=0&maxResults=100
   * <br>
   * please note that either 'id' parms or the 'sqlList' parm is processed, if both are entered
   * 'sqlList' is ignored
   */
  @RequestMapping(
      value = "/getDealBorrowersByDeal",
      method = {RequestMethod.GET})
  public List<ResponseDealBorrower> getDealBorrowersByDeal(
      @RequestParam(value = "id", required = false) List<String> idList,
      @RequestParam(value = "sqlList", required = false) String sqlList,
      @RequestParam(value = "offset", required = false) Integer offset,
      @RequestParam(value = "maxResults", required = false) Integer maxResults) {
    if (idList == null || idList.isEmpty()) {
      idList = SdhUtils.extractValuesFromSqlList(sqlList);
    }
    List<VlsDealBorrower> list =
        dao.getDealBorrowersByDeal(
            idList,
            Util.zeroIfNull(offset),
            Math.min(DEFAULT_MAX_RESULTS, Util.defaultIfNull(maxResults, DEFAULT_MAX_RESULTS)));
    return map(list);
  }

  private ResponseDealBorrower map(LiqDealBorrower entity) {
    ResponseDealBorrower response = mapper.map(entity, ResponseDealBorrower.class);
    return response;
  }

  private List<ResponseDealBorrower> map(List<? extends LiqDealBorrower> list) {
    return list.stream().map(e -> map(e)).collect(Collectors.toList());
  }
}
