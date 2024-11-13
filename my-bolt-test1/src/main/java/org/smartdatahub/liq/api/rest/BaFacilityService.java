package org.smartdatahub.liq.api.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

import javax.persistence.EntityNotFoundException;

import org.apache.logging.log4j.core.net.Facility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smartdatahub.liq.entity.dao.VlsEnvironmentDAO;
import org.smartdatahub.liq.entity.dao.VlsEnvironmentQueryDAO;
import org.smartdatahub.liq.entity.dao.VlsFacilityDAO;
import org.smartdatahub.liq.entity.dao.VrpFacStatusQueryDAO;
import org.smartdatahub.liq.entity.interfaces.LiqEnvironment;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.original.VlsEnvironment;
import org.smartdatahub.liq.entity.original.VlsFacility;
import org.smartdatahub.liq.entity.view.VrpFacStatus;
import org.smartdatahub.liq.model.util.LiqUtilsEnvironment;
import org.smartdatahub.liq.model.util.LiqUtilsFacility;
import org.smartdatahub.liq.model.util.LiqUtilsFacility.FacilityStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(ApiVersions.V1 + "/facility")
public class BaFacilityService { // extends AbstractV1Service {

	
	private static Logger logger = LoggerFactory.getLogger(BaFacilityService.class);

	@Autowired
	private VlsFacilityDAO daoFac;
	@Autowired
	private VlsEnvironmentDAO daoEnv;
	@Autowired
	private VlsEnvironmentQueryDAO daoEnvQ;
	@Autowired
	private VrpFacStatusQueryDAO daoVrpFss;


	public BaFacilityService() {
		
	}

	/**
	 * Calculates the {@link FacilityStatus} of the given {@link Facility} as of given businessDate
	 * <BR> REST call example:  https://localhost:8443/v1/facility/getFacilityStatus?pid=ZOBYZHH1
	 * 
	 * @param pid  Facility Id
	 * @return {@link FacilityStatus} as String
	 * @throws IOException
	 * @throws IllegalAccessException
	 */
	@RequestMapping(
			value = "/getFacilityStatus",
			method = {RequestMethod.GET}
	 )
	public String getFacilityStatus(@RequestParam(value = "pid") String pid)
			throws IOException, IllegalAccessException {

		//LiqFacility fac = em.find(VlsFacility.class, pid);
		LiqFacility fac = daoFac.findById(pid); 
		String zone = fac.getLiqBranch().getCdeTmeRegion_trimmed();
		List<LiqEnvironment> listEnv = daoEnvQ.getEnvironmentDatesAndZoneNumByZone(zone);
		Date dteCurrBusinessDate = LiqUtilsEnvironment.getCurrentBusinessDate(listEnv);

		String facilityStatus = LiqUtilsFacility.calculateFacilityStatus(fac, dteCurrBusinessDate, false).toString();
		return facilityStatus;
	}



//	/**
//	 * https://localhost:8443/v1/facility/getFacilityStatusInclHistory?pid=ZOBYZHH1
//	 * 
//	 * @param pid
//	 * @return
//	 * @throws IOException
//	 * @throws IllegalAccessException
//	 */
//	@RequestMapping(
//			value = "/getFacilityStatusInclHistory",
//			method = {RequestMethod.GET}
//	 )
//	public TreeMap<FacilityStatus, Date> getFacilityStatusInclHistory(@RequestParam(value = "pid") String pid)
//			throws IOException, IllegalAccessException {
//		logger.debug("start getByPid");
//		LiqFacility fac = daoFac.findById(pid);
//		String zone = fac.getLiqBranch().getCdeTmeRegion_trimmed();
//		List<LiqEnvironment> listEnv = daoEnvQ.getEnvironmentDatesAndZoneNumByZone(zone);
//		Date dteCurrBusinessDate = LiqUtilsEnvironment.getCurrentBusinessDate(listEnv);
//
//		TreeMap<FacilityStatus, Date> result = LiqUtilsFacility.calculateFacilityStatusInclHistory(fac,
//				dteCurrBusinessDate);
//		return result;
//	}

	/**
	 * http://localhost:8443/v1/facility/getFacilityStatusForAllFacilities
	 * 
	 * @param pid
	 * @return
	 * @throws IOException
	 * @throws IllegalAccessException
	 */
	@RequestMapping(
			value = "/getFacilityStatusForAllFacilities",
			method = {RequestMethod.GET}
	 )
	public TreeMap<String, FacilityStatus> getFacilityStatusForAllFacilities() {

		TreeMap<String, FacilityStatus> ret = new TreeMap<>();
		long startTime = System.currentTimeMillis();

		List<VlsFacility> listFac = daoFac.findAll(); // queries.getAllFacilities();

		for (LiqFacility fac : listFac) {
			try {
				String zone = fac.getLiqBranch().getCdeTmeRegion_trimmed();
				List<LiqEnvironment> listEnv = daoEnvQ.getEnvironmentDatesAndZoneNumByZone(zone); // queries.getEnvionmentDataById(fac.getLiqBranch().getCdeTmeRegion_trimmed());
				Date dteCurrBusinessDate = LiqUtilsEnvironment.getCurrentBusinessDate(listEnv);

				FacilityStatus facilityStatus = LiqUtilsFacility.calculateFacilityStatus(fac, dteCurrBusinessDate,
						false);
				ret.put(fac.getPidFacility_trimmed(), facilityStatus);
				logger.debug("Processed: " + fac.getPidFacility_trimmed() + " | " + facilityStatus);
			} catch (EntityNotFoundException enfe) {
				logger.info("EntityNotFoundException for facPidFacility " + fac.getPidFacility_trimmed() + " cdeBranch "
						+ fac.getCdeBranch_trimmed() + " message: " + enfe.getMessage());
				ret.put(fac.getPidFacility_trimmed(), null);
				continue;
			} catch (NullPointerException npe) {
				logger.info("NullPointerException for facPidFacility " + fac.getPidFacility_trimmed()
						+ " cdeBranch " + fac.getCdeBranch_trimmed() + " message: " + npe.getMessage());
				ret.put(fac.getPidFacility_trimmed(), null);
				continue;
			}
		}
		logger.info("Excecution time 'getFacilityStatusForAllFacilities': " + (System.currentTimeMillis() - startTime));
		return ret;
	}

	/**
	 * https://localhost:8443/v1/facility/checkFacilityStatusForAllFacilities
	 * https://localhost:8443/v1/facility/checkFacilityStatusForAllFacilities?isEnhanced=true
	 * 
	 * @param pid
	 * @return
	 * @throws IOException
	 * @throws IllegalAccessException
	 */
	@RequestMapping(
			value = "/checkFacilityStatusForAllFacilities",
			method = {RequestMethod.GET}
	 )
	public TreeMap<String, FacilityStatus> checkFacilityStatusForAllFacilities(
			@RequestParam(defaultValue = "false") boolean isEnhanced) {

		TreeMap<String, FacilityStatus> ret = new TreeMap<>();
		long startTime = System.currentTimeMillis();

		List<VlsEnvironment> listEnv = daoEnv.findAll();
		TreeMap<String, Date> curBusinessDatesPerZone = LiqUtilsEnvironment
				.getCurrentBusinessDates(new ArrayList<LiqEnvironment>(listEnv));
		List<VlsFacility> listFac = daoFac.findAll(); // queries.getAllFacilities();

		for (LiqFacility fac : listFac) {
			VrpFacStatus fss = daoVrpFss.findById(fac.getPidFacility_trimmed());

			FacilityStatus facilityStatusVrp = (fss == null ? FacilityStatus.UNDETERMINABLE
					: FacilityStatus.valueOf(fss.getDscStatus_trimmed()));
			FacilityStatus facilityStatusCalc;

			try {
				String zone = fac.getLiqBranch().getCdeTmeRegion_trimmed();
				Date dteCurrBusinessDate = curBusinessDatesPerZone.get(zone);
				facilityStatusCalc = LiqUtilsFacility.calculateFacilityStatus(fac, dteCurrBusinessDate, isEnhanced);
			} catch (EntityNotFoundException enfe) {
				logger.warn("EntityNotFoundException for facPidFacility " + fac.getPidFacility_trimmed() + " cdeBranch "
						+ fac.getCdeBranch_trimmed() + " message: " + enfe.getMessage());
				facilityStatusCalc = FacilityStatus.UNDETERMINABLE;
				// ret.put(fac.getPidFacility_trimmed(), facilityStatusCalc);
			} catch (NullPointerException npe) {
				logger.warn("NullPointerException for facPidFacility " + fac.getPidFacility_trimmed() + " cdeBranch "
						+ fac.getCdeBranch_trimmed() + " message: " + npe.getMessage());
				facilityStatusCalc = FacilityStatus.UNDETERMINABLE;
				// ret.put(fac.getPidFacility_trimmed(), facilityStatusCalc);
			}
			if (facilityStatusCalc == FacilityStatus.UNDETERMINABLE || facilityStatusVrp != facilityStatusCalc) {
				logger.warn("Mismatch on facility status for " + fac.getPidFacility_trimmed() + " VRP: "
						+ facilityStatusVrp + " calc: " + facilityStatusCalc);
				ret.put(fac.getPidFacility_trimmed(), facilityStatusCalc);
			}
			logger.debug("Processed: " + fac.getPidFacility_trimmed() + " | " + facilityStatusCalc);

		}
		logger.info("Excecution time 'getFacilityStatusForAllFacilities': " + (System.currentTimeMillis() - startTime));
		return ret;
	}


	/**
	 * For a given facility id, retrieve the facility and determine the business dates linked to the facility
	 * http(s)://localhost:8443/v1/facility/businessDatesForEntity?id=ACC862FG
	 * 
	 * @param pid
	 * @return the relevate dates of the zone - previous, current and next business date in a Treemap representation.
	 * TODO check for proper return entity
	 * @throws IOException
	 * @throws IllegalAccessException
	 */
	@RequestMapping(
			value = "/businessDatesForEntity",
			method = {RequestMethod.GET}
	 )
	public TreeMap<String, String> businessDatesForEntity(@RequestParam String id,
			@RequestParam(defaultValue = "false") boolean isDatesOnly) {
		VlsFacility fac = daoFac.findById(id);
		String zone = fac.getLiqBranch().getCdeTmeRegion_trimmed();
		List<LiqEnvironment> listEnv = daoEnvQ.getEnvironmentByZone(zone);
		logger.debug("env: " + listEnv.toString());
		return LiqUtilsEnvironment.getAllBusinessDatesPerZone(listEnv, zone , isDatesOnly);
	}
	


}