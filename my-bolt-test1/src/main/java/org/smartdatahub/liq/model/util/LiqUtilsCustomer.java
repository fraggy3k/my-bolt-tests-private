package org.smartdatahub.liq.model.util;

import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smartdatahub.liq.entity.interfaces.LiqBranch;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
//import org.smartdatahub.liq.entity.interfaces.LiqOstTrPrtShr;
//import org.smartdatahub.liq.entity.interfaces.LiqOstTrSgShr;
import org.smartdatahub.liq.entity.interfaces.LiqOstTran;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;



public class LiqUtilsCustomer {


	private static Logger logger = LoggerFactory.getLogger(LiqUtilsCustomer.class);
	

	public static enum TypeExternalId {CUS_XID, ALIAS_MEI, ALIAS_GRID};
	

	public static LiqCustomer getBranchCustomer(LiqBranch brn){
		Objects.requireNonNull(brn, "Input parm cannot be null.");
		LiqCustomer cus = brn.getLiqCustomer();
		if (!cus.getIndIntrlEnt()){
			throw new IllegalStateException("Branch Customer " + cus.getXidCustId() + " is no internal entity for Branch " + brn.getCdeBranch());
		}
		return brn.getLiqCustomer();
	}	
	public static LiqCustomer getBranchCustomer(LiqFacility vlsFacility){
		return getBranchCustomer(vlsFacility.getLiqBranch());
	}	
	public static LiqCustomer getBranchCustomer(LiqOutstanding vlsOutstanding){
		return getBranchCustomer(vlsOutstanding.getLiqFacility());
	}	
	public static LiqCustomer getBranchCustomer(LiqOstTran vlsOstTran){
		return getBranchCustomer(vlsOstTran.getLiqOutstanding());
	}	
//	public static LiqCustomer getBranchCustomer(LiqOstTrSgShr vlsOstTrSgShr){
//		return getBranchCustomer(vlsOstTrSgShr.getLiqOstTran());
//	}
	
	
	public static LiqBranch getBranchCustomer(LiqCustomer cus){
		Objects.requireNonNull(cus, "Input parm cannot be null.");
		List<LiqBranch> brnList = cus.getLiqBranchs();
		if (brnList.isEmpty()){
			return null;
		} else if (brnList.size() == 1){
			return brnList.get(0);
		}
		throw new IllegalStateException("Unexpected multiple branch customers! Customer " +  cus.getCidCustId_trimmed() + " has " + brnList.size() + " references in branch table" );
	}
	
	
	public static boolean isBranchCustomer(LiqCustomer cus){
		Objects.requireNonNull(cus, "Input parm cannot be null."); 
		return (getBranchCustomer(cus) != null);
	}
	
	public static boolean isCustomerBranchCustomer(LiqCustomer vlsCustomer, LiqBranch vlsBranch){
		LiqCustomer cusBranch = getBranchCustomer(vlsBranch);
		if (LiqComparator.compCustomerByCid.compare(cusBranch, vlsCustomer) == 0){ //TODO define standard comparator on object id
			return true;
		}
		return false;
	}	
	public static boolean isCustomerBranchCustomer(LiqCustomer vlsCustomer, LiqOutstanding vlsOutstanding){
		return isCustomerBranchCustomer(vlsCustomer, vlsOutstanding.getLiqFacility().getLiqBranch());
	}
	public static boolean isCustomerBranchCustomer(LiqCustomer vlsCustomer, LiqOstTran vlsOstTran){
		return isCustomerBranchCustomer(vlsCustomer, vlsOstTran.getLiqOutstanding().getLiqFacility().getLiqBranch());
	}
//	public static boolean isCustomerBranchCustomer(LiqCustomer vlsCustomer, LiqOstTrPrtShr vlsOstTrPrtShr){
//		return isCustomerBranchCustomer(vlsCustomer, vlsOstTrPrtShr.getLiqOstTranOwner().getLiqOutstanding());
//	}
	
	
	
}


