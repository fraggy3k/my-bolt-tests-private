	package org.smartdatahub.liq.model.util;

    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
    import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
    import org.smartdatahub.liq.entity.interfaces.LiqFacBorrDetl;
    import org.smartdatahub.liq.entity.interfaces.LiqFacility;

    import java.util.LinkedList;
    import java.util.List;
import java.util.Objects;



/**
 * 
 * @author Sonja Piel
 *
 */


public class LiqUtilsFacilityBorrower {
	

	private static Logger logger = LoggerFactory.getLogger(LiqUtilsFacilityBorrower.class);
	
	public static LiqFacBorrDetl getFacilityBorrower(String cidCustomer, LiqFacility fac){
		LiqFacBorrDetl ret = null;
		for (LiqFacBorrDetl fbd : fac.getLiqFacBorrDetls()){
			if (fbd.getLiqDealBorrower().getCidCustId_trimmed().equals(cidCustomer.trim())){
				if (ret != null){
					throw new IllegalStateException("This should never happen: the facility borrower must be unique for a customer id. cusId/facId: " + cidCustomer + "/" + fac.getPidFacility_trimmed());
				}
				ret = fbd;
			}
		}
		return ret;
	}
	
	public static LiqFacBorrDetl getFacilityBorrower(LiqCustomer cus, LiqFacility fac){
		return getFacilityBorrower(cus.getCidCustId_trimmed(), fac);
	}

	
	public static LiqFacBorrDetl getPrimaryBorrower(List<LiqFacBorrDetl> borrowers){
		for (LiqFacBorrDetl bor : borrowers){
			if (bor.getIndPrimBorr()){
				return bor;
			}
		} 
		return null;
	}
	
	public static LiqCustomer getPrimaryBorrowerCustomer(List<LiqFacBorrDetl> borrowers) {
		Objects.requireNonNull(borrowers, "'borrowers' cannot be null.");
		if (borrowers.isEmpty()){
			throw new IllegalArgumentException("'borrowers' cannot be empty.");
		}
		LiqFacBorrDetl primBor = getPrimaryBorrower(borrowers);
		if (primBor != null){
			return primBor.getLiqDealBorrower().getLiqCustomer();
		}
		return null;
	}

	public static List<LiqFacility> getFacilitiesWhereCustIsFacBorrower(LiqCustomer cus){
		List<LiqFacility> subSet = new LinkedList<>();
		for (LiqDealBorrower dbr : cus.getLiqDealBorrowers()){
			for (LiqFacBorrDetl fbd : dbr.getLiqFacBorrDetls()){
				subSet.add(fbd.getLiqFacility());
			}
		}
		return subSet;
	}
}
