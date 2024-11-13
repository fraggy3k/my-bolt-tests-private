package org.smartdatahub.liq.api.rest;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

import org.dozer.DozerBeanMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.smartdatahub.liq.api.response.mapper.ResponseMapper;
import org.smartdatahub.liq.api.rest.exception.NotFoundException;
import org.smartdatahub.liq.entity.dao.VlsDealDAO;
import org.smartdatahub.liq.entity.dao.VlsDealQueryDAO;
import org.smartdatahub.liq.entity.dao.VlsEnvironmentDAO;
import org.smartdatahub.liq.entity.dao.VlsEnvironmentQueryDAO;
import org.smartdatahub.liq.entity.dao.VrpFacStatusQueryDAO;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqEnvironment;
import org.smartdatahub.liq.model.util.LiqUtilsEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//TODO rename to BaDeal
@RestController
@RequestMapping(ApiVersions.V1 + "/deal")
public class DealService { // extends AbstractV1Service {

	private static Logger logger = LoggerFactory.getLogger(DealService.class);

	@Autowired private VlsDealDAO         		daoDea;
	@Autowired private VlsDealQueryDAO 			daoContext;
	@Autowired private VlsEnvironmentDAO      	daoEnv;
	@Autowired private VlsEnvironmentQueryDAO 	daoEnvQ;
	@Autowired private VrpFacStatusQueryDAO   	daoVrpFss;
	
	@Autowired private DozerBeanMapper mapper;
	
//	@PersistenceContext(unitName = SOURCE_EM)
//	private EntityManager em;

	public DealService() throws IOException {
		
	}
	
	

	
	
	/**
	 * https://localhost:8443/v1/deal/businessDatesForEntity?id=X(C84883
	 * 
	 * @param id
	 * @return
	 * @throws IOException
	 * @throws IllegalAccessException
	 */
	@RequestMapping("/businessDatesForEntity")
	public TreeMap<String, String>  businessDatesForEntity(@RequestParam String id, @RequestParam(defaultValue = "false") boolean isDatesOnly) {
		
		LiqDeal dea = daoDea.findById(id);           
		String zone = dea.getLiqBranch().getCdeTmeRegion_trimmed();
		logger.info("zone for dealId " + id + " is " + zone);
		List<LiqEnvironment> listEnv = Collections.unmodifiableList(daoEnvQ.getEnvironmentByZone(zone));
//		List<LiqEnvironment> listLiqEnv = Collections.unmodifiableList(listEnv);
		return LiqUtilsEnvironment.getAllBusinessDatesPerZone(listEnv , zone.trim(), isDatesOnly);
		
//		return ret;
	}
	
	

	
	/**
	 * https://localhost:8443/v1/deal/getListOfNameAndIdOverview?nameOrId=X(C84883
	 * https://localhost:8443/v1/deal/getListOfNameAndIdOverview?nameOrId=OCEAN

	 * @param nameOrId
	 * @return
	 * @throws IOException
	 * @throws IllegalAccessException
	 */
	@RequestMapping("/getListOfNameAndIdOverview")
	public TreeMap<String, String> getListOfNameAndIdOverview(@RequestParam(value = "nameOrId") String nameOrId) throws IOException, IllegalAccessException {

//		DbQueriesLiqEntity dataQueries = new DbQueriesLiqEntity(em);
//		List<LiqDeal> deals = dataQueries.getDealLikeNameOrEqualToId(nameOrId);

		List<LiqDeal> deals = daoContext.getDealsLikeNameOrEqualToId(nameOrId);
		
		TreeMap<String, String> returnList = new TreeMap<>();
		for (LiqDeal deal : deals){
			returnList.put(deal.getPidDeal(), deal.getNmeDeal_trimmed());
		}
		if(returnList.isEmpty()){
			throw new NotFoundException("No match found for seacrch String : " + nameOrId);
		}
		return returnList;
	} 

//	/**
//	 * http(s)://localhost:xxxx/v1/deal/getDealsByNamePartOrId?nameOrId=-6BZ1X4I
//	 * 
//	 * @param nameOrId
//	 * @return
//	 * @throws IOException
//	 * @throws IllegalAccessException
//	 */
//	@RequestMapping("/getDealsByNamePartOrId")
//	public List<ResponseDeal> getDealsByNamePartOrId(@RequestParam(value = "nameOrId") String nameOrId) throws IOException, IllegalAccessException {
//
//		List<LiqDeal> deals = daoContext.getDealsLikeNameOrEqualToId(nameOrId);
//
//		if(deals.isEmpty()){
//			throw new NotFoundException("No match found for seacrch String : " + nameOrId);
//		}
//		return mapper.mapLiqDeal(deals, mapper);
//	} 
	

}