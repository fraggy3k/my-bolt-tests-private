package org.smartdatahub.liq.model.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smartdatahub.liq.entity.interfaces.LiqEnvironment;

public class LiqUtilsEnvironment {

	private static final Logger logger = LoggerFactory.getLogger(LiqUtilsEnvironment.class);

	public static final String ENV_CLASS_ZONE           = "EnvironmentClassZone";
	public static final String ENV_VAR_NAME_PREV_B_DATE = "Previous Business Date";
	public static final String ENV_VAR_NAME_CURR_B_DATE = "Current Business Date";
	public static final String ENV_VAR_NAME_NEXT_B_DATE = "Next Business Date";
	public static final String ENV_VAR_NAME_REGION_ID = "RGNID";
	public static final String ENV_DATE_FORMAT = "MM-dd-yyyy";


	public static final List<String> ENV_DATE_LIST = Arrays.asList(ENV_VAR_NAME_PREV_B_DATE, ENV_VAR_NAME_CURR_B_DATE, ENV_VAR_NAME_NEXT_B_DATE);
	
	
	public static Date getPreviousBusinessDate(List<LiqEnvironment> envs){
		return getEnvValueAsDate(envs, ENV_VAR_NAME_PREV_B_DATE);
	}

	public static Date getCurrentBusinessDate(List<? extends LiqEnvironment> envs) {
		return getEnvValueAsDate(envs, ENV_VAR_NAME_CURR_B_DATE);
	}

	public static Date getNextBusinessDate(List<LiqEnvironment> envs) {
		return getEnvValueAsDate(envs, ENV_VAR_NAME_NEXT_B_DATE);
	}

	public static TreeMap<String, Date> getCurrentBusinessDates(List<LiqEnvironment> envs) {
		TreeMap<String, Date> ret = new TreeMap<>();
		for (LiqEnvironment env : envs) {
			if (ENV_VAR_NAME_CURR_B_DATE.equals(env.getNmeVarName_trimmed())) {
				Date temp = getEnvValueAsDate(env);
				ret.put(env.getNmeVarClass_trimmed(), temp);
			}
		}
		// return getEnvValueAsDate(envs, ENV_VAR_NAME_CURR_B_DATE);
		return ret;
	}
	
	/**
	 * return all 3 business dates for a given zone
	 * 
	 * @param listEnv
	 * @param zone
	 * @return
	 */
	public static TreeMap<String, String> getAllBusinessDatesPerZone(List<LiqEnvironment> listEnv, 
			String zone,
			boolean isDatesOnly) {
		TreeMap<String, String> ret = new TreeMap<>();
		Objects.requireNonNull(zone, "The parameter zone cannot be null");
		Objects.requireNonNull(listEnv, "Environment data for zone " + zone + " is null");

		if (listEnv.isEmpty()) {
			 throw new IllegalArgumentException("Environment data for zone " + zone + " is empty");
		}
		for (LiqEnvironment env : listEnv) {
			if (!zone.trim().equals(env.getNmeVarClass_trimmed())) {
				continue;
			}
			if (isDatesOnly && !ENV_DATE_LIST.contains(env.getNmeVarName_trimmed())) {
				continue;
			}
			ret.put(env.getNmeVarName_trimmed(), env.getTxtVarValue_trimmed());
		}
		if (ret.isEmpty()) {
			 throw new IllegalStateException("No matches found for zone " + zone + ", example of zone in first environment in list: " + listEnv.get(0).getNmeVarClass_trimmed());
		} else {
			ret.put(ENV_CLASS_ZONE, zone);
		}
		return ret;
	}

	private static Date getEnvValueAsDate(LiqEnvironment env) {
		try {
			Date date = new SimpleDateFormat(ENV_DATE_FORMAT).parse(env.getTxtVarValue_trimmed());
			return date;
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	private static Date getEnvValueAsDate(List<? extends LiqEnvironment> envs, String envVarName) {
		try {
			String value = getEnvValue(envs, envVarName);
			Date date = new SimpleDateFormat(ENV_DATE_FORMAT).parse(value);
			return date;
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	private static String getEnvValue(List<? extends LiqEnvironment> envs, String envVarName) {
		String value = envs.stream()
				.filter(env -> env.getNmeVarName_trimmed().equals(envVarName))
				.map(env -> env.getTxtVarValue_trimmed())
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException("Can not find envVar for name " + envVarName));
		return value;
	}

}
