package org.smartdatahub.liq.model.util;

import org.smartdatahub.liq.commons.Util;
import org.apache.logging.log4j.core.net.Facility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smartdatahub.liq.entity.dao.VlsEnvironmentQueryDAO;
import org.smartdatahub.liq.entity.interfaces.*;

import java.util.*;



/**
 * 
 * @author Sonja Piel
 *
 */

public class LiqUtilsFacility {

	private static final Logger logger = LoggerFactory.getLogger(LiqUtilsFacility.class);
	
	public static enum ChoicePurposeCodeSelection {BY_EARLIEST_TIMESTAMP, BY_ALPHA_ORDER_OF_CODE};

	public static enum FacilityStatus {TERMINATED, EXPIRED, ACTIVE, PENDING  // these are the ones from the VRP_FAC_STATUS
		, UNDETERMINABLE, FINALLY_MATURED, AGREEMENT, FINAL_DRAWDOWN, PAST_DUE
		, ENTERED_IN_LIQ
		};

		
	/**
	 * Calculates the {@link FacilityStatus} of the given {@link Facility} as of given businessDate
	 * 
	 * @param fac
	 *            Facility data loaded
	 * @param currBusinessDate The BusinessDate (Currently only valid for "CurrentBusinessDate")
	 * @param isEnhanced
	 *            false = Finastra' code in Data Net view, true = enhanced
	 *            functionality e.g. 'finally matured' added
	 * @return the {@link FacilityStatus} at the given Date
	 */
	public static FacilityStatus calculateFacilityStatus(LiqFacility fac, Date currBusinessDate, boolean isEnhanced){	
		if (fac.getDteTermFac() != null){
			return FacilityStatus.TERMINATED;   //TODO add additional check (=beyond Finstra's standard) that date is in the past!!!
		} 
		if (fac.getDteExpiry() != null 
				&& Util.isDay1BeforeDay2(fac.getDteExpiry(), currBusinessDate)){
			return FacilityStatus.EXPIRED;
		} 
		if (isEnhanced 
				&& fac.getDteFinalMat() != null 
				&& Util.isDay1BeforeDay2(fac.getDteFinalMat(), currBusinessDate)){
			return FacilityStatus.FINALLY_MATURED;  //this is a state which Finastra does not propose, but makes sense
		} 
		if (fac.getDteEffective() != null 
				&& Util.isDate1SameDayOrBefore(fac.getDteEffective(), currBusinessDate)
				&& fac.getDteTermFac() == null
				&& LiqUtilsDeal.isActive(fac.getLiqDeal())){
			return FacilityStatus.ACTIVE;
		}
		return FacilityStatus.PENDING;
		
	}

	/**
	 * quick and dirty method to show the life-cycle of the facility status. 
	 * TODO: build proper return container  
	 * TODO: bring the dates in a proper order
	 * @param fac
	 * @param dteCurrBusiness
	 * @return Map with FacilityStatus and corresponing date
	 */
	public static Map<FacilityStatus, Date> calculateFacilityStatusInclHistory(LiqFacility fac, Date dteCurrBusiness){
		TreeMap<FacilityStatus, Date> ret = new TreeMap<>();
		if (fac.getDteTermFac() != null){
			if (Util.isDate1SameDayOrBefore(fac.getDteTermFac(), dteCurrBusiness)){
				ret.put(FacilityStatus.TERMINATED, fac.getDteTermFac());
			} else {
				throw new IllegalStateException("Unexpected Constellation where date termination is after the current business date for facility " + fac.getOriginId());
			}
		} 
		if (fac.getDteExpiry() != null && Util.isDay1BeforeDay2(fac.getDteExpiry(), dteCurrBusiness)){
			ret.put(FacilityStatus.EXPIRED, fac.getDteExpiry());
		}
		if (fac.getDteEffective() != null && Util.isDate1SameDayOrBefore(fac.getDteEffective(), dteCurrBusiness)
//				 && fac.getDteTermFac() == null       // This is part of the original SQL query, but in the context of history collecting, it leads to wrong results
				&& ret.get(FacilityStatus.TERMINATED) == null   
				&& LiqUtilsDeal.isActive(fac.getLiqDeal())
				){
			ret.put(FacilityStatus.ACTIVE, fac.getDteEffective());
		} 
		if (ret.isEmpty()){
			//Since a pending facility does not have an advanced status, the best date to take is the creation date of the facility.
			ret.put(FacilityStatus.PENDING, fac.getTspRecCreate());  
		}
		
		ret.put(FacilityStatus.ENTERED_IN_LIQ, fac.getTspRecCreate());

		if (fac.getDteFinalMat() != null && Util.isDay1BeforeDay2(fac.getDteFinalMat(), dteCurrBusiness)){
			ret.put(FacilityStatus.FINALLY_MATURED, fac.getDteFinalMat());
		}

		if (fac.getDteAgreement() != null){
			ret.put(FacilityStatus.AGREEMENT, fac.getDteAgreement());
		}

		if (fac.getDteFlDrawdwn() != null){
			ret.put(FacilityStatus.FINAL_DRAWDOWN, fac.getDteFlDrawdwn());
		}

		if (fac.getDtePastDue() != null){
			ret.put(FacilityStatus.PAST_DUE, fac.getDtePastDue());
		}
		
		return ret;
	}

	
//	/**
//	 * On Loan IQ level there are multiple purpose codes possible for one facility. However, for reporting purposes
//	 * often one single purpose code is required on facility level. 
//	 * Several rules might be applied to pick one purpose code of multiples. Two possible rules are implemented.
//	 * @param fac
//	 * @param enumChoice
//	 * @return single purpose code according to rule chosen.
//	 */
//	public static LiqProdLoanPurp getPurposeCodePerChoice(LiqFacility fac, ChoicePurposeCodeSelection enumChoice) {
//		LiqProdLoanPurp liqProdLoanPurp = null;
//		for (LiqProdLoanPurp plp : fac.getLiqProdLoanPurps()){
//			boolean isChooseThisOne = false;
//			if (liqProdLoanPurp == null){
//				liqProdLoanPurp = plp;
//				continue;
//			}
//			switch (enumChoice){
//			case BY_ALPHA_ORDER_OF_CODE:
//				isChooseThisOne = plp.getCdeLoanPurp_trimmed().compareTo(liqProdLoanPurp.getCdeLoanPurp_trimmed()) == -1;
//				break;
//			case BY_EARLIEST_TIMESTAMP:
//				isChooseThisOne = plp.getTspRecCreate().before(liqProdLoanPurp.getTspRecCreate());
//			}
//			if (isChooseThisOne){
//				liqProdLoanPurp = plp;
//			}
//		}
//		return liqProdLoanPurp;
//	}
	
//	public static String getPurposeCodeAsCodePlusDescrPerChoice(LiqFacility fac, ChoicePurposeCodeSelection enumChoice) {
//		LiqProdLoanPurp liqProdLoanPurp = getPurposeCodePerChoice(fac, enumChoice);
//		if (liqProdLoanPurp == null){
//			return null;
//		}
//		return liqProdLoanPurp.getCdeLoanPurp_trimmed() + " - ( to be filled )";  //TODO add CodeTable Purpose Code in generate and call liqProdLoanPurp.getLiqProdLoanPurp.getDesc...
//	}

}
