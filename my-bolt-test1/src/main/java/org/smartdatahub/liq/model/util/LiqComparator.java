package org.smartdatahub.liq.model.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;

/**
 * 
 * @author Sonja Piel
 *
 */

public class LiqComparator {
	
	
	/**
	 * returns a sorted List of Liq objects (sorted by comparator)
	 * 
	 * @return the sorted list
	 */
	public static <T> int compareItems(T o1, T o2, Comparator<T> comparator) {
		return comparator.compare(o1, o2);
	}
	
	/**
	 * returns a sorted List of Liq objects (sorted by comparator)
	 * 
	 * @return the sorted list
	 */
	public static <T> List<T> sort(Collection<T> coll, Comparator<T> comparator) {
		List<T> list = new ArrayList<>(coll);
		Collections.sort(list, comparator);
		return list;
	}
	
	/**
	 * returns a sorted List of Liq objects (sorted by comparator)
	 * @param <T>
	 * 
	 * @return the sorted list
	 */
	public static <T> boolean contains(T item, Collection<T> coll, Comparator<T> comparator) {
		List<T> list = new ArrayList<>(coll);
		Collections.sort(list, comparator);
		for (T itemColl : list){
			if (comparator.compare(item, itemColl) == 0){
				return true;
			}
		}
		
		return false;
	}
	
	public static int compareInt(int i1, int i2){
		if (i1 == i2){
			return 0;
		} else if (i1 > i2){
			return 1;
		} else {
			return -1;
		}
	}
	
	
	public static <T> int compareWithNull(T o1, T o2){
		if (o1 == null && o2 == null)  {
			return 0;
		}		
		if (o1 == null && o2 != null){
			return -1;
		} 
		if (o1 != null && o2 == null){
			return 1;
		} 
		throw new IllegalArgumentException("");								
	}
	
	public static boolean  isNullAny(Object... objs) {
		for (Object object : objs) {
			if (object == null) {
				return true;
			}
		}
		return false;
	}
	
	public static final String getOrderId(String item, String[] orderListe){
		for (int i=0; i<orderListe.length; i++){
			if (item.equals(orderListe[i])){
				return "o" + (i+1);
			}
		}
		return item;
	}
	
//	public static final Comparator<SnapshotDeal> compSnapshotDeal = new Comparator<SnapshotDeal>() {
//		public int compare(SnapshotDeal o1, SnapshotDeal o2) {
//			return (isNullAny(o1, o2) ? compareWithNull(o1, o2) : o1.getId().compareTo(o2.getId()));
//		}
//	};
	
//	public static final Comparator<AbstractSnapshot> compSnapshotObject = new Comparator<AbstractSnapshot>() {
//		public int compare(AbstractSnapshot o1, AbstractSnapshot o2) {
//			return (isNullAny(o1, o2) ? compareWithNull(o1, o2) : o1.compareTo(o2));
//		}
//	};
	
	public static final Comparator<LiqOutstanding> compOutstandingBySonja = new Comparator<LiqOutstanding>() {
		public int compare(LiqOutstanding o1, LiqOutstanding o2) {
			return (isNullAny(o1, o2) ? compareWithNull(o1, o2) : o1.getRidOutstandng().compareTo(o2.getRidOutstandng()));
		}
	};


//	public static final NullComparator compOutstandingByRid = new NullComparator( 
//			new Comparator<LiqOutstanding>() {
//				public int compare(LiqOutstanding o1, LiqOutstanding o2) {
//					return o1.getRidOutstandng().compareTo(o2.getRidOutstandng());
//				}
//			}
//	);

	public static final Comparator<LiqOutstanding> compOutstandingByRid = new Comparator<LiqOutstanding>() {
		public int compare(LiqOutstanding o1, LiqOutstanding o2) {
			if (isNullAny(o1, o2)){
				return compareWithNull(o1, o2);
			}
			return o1.getRidOutstandng().compareTo(o2.getRidOutstandng());
		}
	};
	
	public static final Comparator<LiqOutstanding> compOutstandingByAlias = new Comparator<LiqOutstanding>() {
		public int compare(LiqOutstanding o1, LiqOutstanding o2) {
			if (isNullAny(o1, o2)){
				return compareWithNull(o1, o2);
			}
			return o1.getNmeAlias().compareTo(o2.getNmeAlias());
		}
	};
	
	public static final Comparator<LiqFacility> compFacilityByPid = new Comparator<LiqFacility>() {
		public int compare(LiqFacility o1, LiqFacility o2) {
			if (isNullAny(o1, o2)){
				return compareWithNull(o1, o2);
			}
			return o1.getPidFacility().compareTo(o2.getPidFacility());
		}
	};
	
	public static final Comparator<LiqFacility> compFacilityByCntl = new Comparator<LiqFacility>() {
		public int compare(LiqFacility o1, LiqFacility o2) {
			if (isNullAny(o1, o2)){
				return compareWithNull(o1, o2);
			}
			return o1.getNumFacCntl().compareTo(o2.getNumFacCntl());
		}
	};
	
	public static final Comparator<LiqDeal> compDealByPid = new Comparator<LiqDeal>() {
		public int compare(LiqDeal o1, LiqDeal o2) {
			if (isNullAny(o1, o2)){
				return compareWithNull(o1, o2);
			}
			return o1.getPidDeal().compareTo(o2.getPidDeal());
		}
	};
	
	public static final Comparator<LiqDeal> compDealByCntl = new Comparator<LiqDeal>() {
		public int compare(LiqDeal o1, LiqDeal o2) {
			if (isNullAny(o1, o2)){
				return compareWithNull(o1, o2);
			}
			return o1.getNumDealCntl().compareTo(o2.getNumDealCntl());
		}
	};
	
	public static Comparator<LiqCustomer> compCustomerByXid = new java.util.Comparator<LiqCustomer>(){
		public int compare(LiqCustomer o1, LiqCustomer o2) {
			if (isNullAny(o1, o2)){
				return compareWithNull(o1, o2);
			}
			return o1.getXidCustId().compareTo(o2.getXidCustId());
		}
	};
	
	public static Comparator<LiqCustomer> compCustomerByCid = new java.util.Comparator<LiqCustomer>(){
		public int compare(LiqCustomer o1, LiqCustomer o2) {
			if (isNullAny(o1, o2)){
				return compareWithNull(o1, o2);
			}
			return o1.getCidCustId().compareTo(o2.getCidCustId());
		}
	};
	
	public static Comparator<LiqCustomer> compCustomerByShrtNme = new java.util.Comparator<LiqCustomer>(){
		public int compare(LiqCustomer o1, LiqCustomer o2) {
			if (isNullAny(o1, o2)){
				return compareWithNull(o1, o2);
			}
			return o1.getNmeShortName_trimmed().compareTo(o2.getNmeShortName());
		}
	};
	
//	public static String getKey(LiqAccrualCycle acc){
//		StringBuffer key = new StringBuffer();
//
//	}

//	public static Comparator<LiqAccrualCycle> compAccrualCycle = new java.util.Comparator<LiqAccrualCycle>(){
//		public int compare(LiqAccrualCycle o1, LiqAccrualCycle o2) {
//			if (isNullAny(o1, o2)){
//				return compareWithNull(o1, o2);
//			}
//			return o1.getRidAcrCycle().compareTo(o2.getRidAcrCycle());
//		}
//	};






//	public static Comparator<xxx> compxxxBy = new java.util.Comparator<xxx>(){
//		public int compare(xxx o1, xxx o2) {
//			if (isNullAny(o1, o2)){
//				return compareWithNull(o1, o2);
//			}
//			return o1.get.compareTo(o2.get);
//		}
//	};
//
//	public static Comparator<xxx> compxxxBy = new java.util.Comparator<xxx>(){
//		public int compare(xxx o1, xxx o2) {
//			if (isNullAny(o1, o2)){
//				return compareWithNull(o1, o2);
//			}
//			return o1.get.compareTo(o2.get);
//		}
//	};
//	
//	public static final Comparator<LiqProdLoanPurp> compProdLoanPurpByCdeLoanPurp = new Comparator<LiqProdLoanPurp>() {
//		public int compare(LiqProdLoanPurp o1, LiqProdLoanPurp o2) {
//			if (isNullAny(o1, o2)){
//				return compareWithNull(o1, o2);
//			}
//			return o1.getCdeLoanPurp().compareTo(o2.getCdeLoanPurp());
//		}
//	};
//	
	/**
     * <p>Left pad a String with a specified character.</p>
     *
     * <p>Pad to a size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.leftPad(null, *, *)     = null
     * StringUtils.leftPad("", 3, 'z')     = "zzz"
     * StringUtils.leftPad("bat", 3, 'z')  = "bat"
     * StringUtils.leftPad("bat", 5, 'z')  = "zzbat"
     * StringUtils.leftPad("bat", 1, 'z')  = "bat"
     * StringUtils.leftPad("bat", -1, 'z') = "bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @param padChar  the character to pad with
     * @return left padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     */
	public static String padLeft(String str, int size, char c, boolean returnNull) {
		if (str == null && returnNull)
			return null;
		if (str == null && !returnNull)
			str = "";
		if (str.length() > size)
			return str.substring(str.length() - size);	
		return StringUtils.leftPad(str, size, c);
	}
	public static String padLeft(String str, int size, char c) {
		return padLeft(str, size, c, true);
	}
	
	/**
     * <p>Left pad a String with a specified character.</p>
     *
     * <p>Pad to a size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.leftPad(null, *, *)     = null
     * StringUtils.leftPad("", 3, 'z')     = "zzz"
     * StringUtils.leftPad("bat", 3, 'z')  = "bat"
     * StringUtils.leftPad("bat", 5, 'z')  = "zzbat"
     * StringUtils.leftPad("bat", 1, 'z')  = "bat"
     * StringUtils.leftPad("bat", -1, 'z') = "bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @param padChar  the character to pad with
     * @return left padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     */
	public static String padRight(String str, int size, char c, boolean returnNull) {
		if (str == null && returnNull)
			return null;
		if (str == null && !returnNull)
			str = "";
		if (str.length() > size)
			return str.substring(0, size);	
		return StringUtils.rightPad(str, size, c);
	}
	public static String padRight(String str, int size, char c) {
		return padRight(str, size, c, true);
	}

}
