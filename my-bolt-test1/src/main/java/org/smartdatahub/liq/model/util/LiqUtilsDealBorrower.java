package org.smartdatahub.liq.model.util;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;

/**
 * 
 * @author Sonja Piel
 *
 */

public class LiqUtilsDealBorrower {
	
	
	/**
	 * TODO What is better - list oder set ?
	 * 
	 * @param borrowers
	 * @return
	 */
	public static List<LiqDeal> getDeals(List<LiqDealBorrower> borrowers){
		List<LiqDeal> subSet = new LinkedList<>();
		for (LiqDealBorrower dbr : borrowers){
			subSet.add(dbr.getLiqDeal());
		}
		return subSet;
	}
	
	public static List<LiqDeal> getDealsWhereCustIsDealBorrower(LiqCustomer cus){
		List<LiqDeal> subSet = new LinkedList<>();
		for (LiqDealBorrower dbr : cus.getLiqDealBorrowers()){
			subSet.add(dbr.getLiqDeal());
		}
		return subSet;
	}
	

	
	
	
	public static LiqDealBorrower getPrimaryBorrower(List<LiqDealBorrower> borrowers){
		for (LiqDealBorrower bor : borrowers){
			if (bor.getIndPrimBorr()){
				return bor;
			}
		}
		return null;
	}
	
	public static LiqCustomer getPrimaryBorrowerCustomer(List<LiqDealBorrower> borrowers){
		LiqDealBorrower primBor = getPrimaryBorrower(borrowers);
		if (primBor != null){
			return primBor.getLiqCustomer();
		}
		return null;
	}

	/**
	 * 
	 * @param borrowers		Entry set: list of DealBorrowers (and/or Depositors)
	 * @param isBorrower	if true: only select possible borrowers
	 * @param isDepositor 	if true: only select possible depositors
	 * @return				set of matching DealBorrower (and/or Depositors)
	 * 						true  , true  => all Borrower and/or Depositor
	 * 						true  , false => all Borrower
	 * 						false , true  => all Depositor
	 * 						false , false => null 
	 */
	public static Set<LiqDealBorrower> getDealBorrowersSelection(List<LiqDealBorrower> borrowers, boolean isBorrower, boolean isDepositor){
		Set<LiqDealBorrower> subSet = new HashSet<>();
		for (LiqDealBorrower bor : borrowers){
			if (isBorrower && bor.getIndBorrower()){
				subSet.add(bor);
			} else if (isDepositor & bor.getIndDepositor()){
				subSet.add(bor);
			}
		}
		if (subSet.isEmpty()){
			return null;
			// TODO return null or empty list?
		}
		return subSet;
	}
	
	public static Set<LiqDealBorrower> getDealBorrowersWithIndBorrower(List<LiqDealBorrower> borrowers){
		return getDealBorrowersSelection(borrowers, true, false);
	}
	
	public static Set<LiqDealBorrower> getDealBorrowersWithIndDepositor(List<LiqDealBorrower> borrowers){
		return getDealBorrowersSelection(borrowers, false, true);
	}
}
