package org.smartdatahub.liq.model.util;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.model.cde.enums.CdeObjectState;



public class LiqUtilsDeal {
	

	public static enum AgencyType {BILATERAL, AGENT, PARTICIPANT, UNKOWN};
	
	public static final List<Object> ACTIVE_DEAL_STATI =  Arrays.asList(
			  CdeObjectState.NNHST
			, CdeObjectState.UNVER
			, CdeObjectState.AGENT
			, CdeObjectState.CLOSE
			);
	
	public static AgencyType getAgencyType(LiqDeal dea){
		if (isBilateral(dea)){
			return AgencyType.BILATERAL;
		} 
		LiqCustomer cusDealAdmin = getLiqDealAdminCustomer(dea);
		if (cusDealAdmin.getIndIntrlEnt() && LiqUtilsCustomer.isBranchCustomer(cusDealAdmin)){
			return  AgencyType.AGENT;
		} 
		if (!cusDealAdmin.getIndIntrlEnt()){
			return  AgencyType.PARTICIPANT;
		} 
		return AgencyType.UNKOWN;
	}
	
	public static boolean isActive(LiqDeal dea){
//		if (dea == null)
//		if (dea.getCdeDealStat() == null)	
		CdeObjectState cdeObjectState = CdeObjectState.valueOf(dea.getCdeDealStat_trimmed());
		return cdeObjectState != null && ACTIVE_DEAL_STATI.contains(cdeObjectState);
	}
	
	public static boolean isBilateral(LiqDeal dea){
		return (dea.getIndSoleLendr() ? true : false);
	}
	
	public static LiqCustomer getLiqDealAdminCustomer(LiqDeal dea) {
		Objects.requireNonNull(dea, "Deal can not be null");
		Objects.requireNonNull(dea.getLiqDealAdmin(), "Deal "+dea.getPidDeal()+" has no deal Admin!");
		return dea.getLiqDealAdmin().getLiqCustomer();
	}
	
	public static boolean isDealAdminHostBank(LiqDeal dea){
		// or is host bank Agent?
		return (getLiqDealAdminCustomer(dea).getIndIntrlEnt());
	}

	public static boolean isNoneDeal(LiqDeal dea) {
		return dea.getPidDeal_trimmed().equals(LiqConstants.PID_NONE);
	}
	

}
