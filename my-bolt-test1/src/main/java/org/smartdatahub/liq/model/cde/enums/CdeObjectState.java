package org.smartdatahub.liq.model.cde.enums;

public enum CdeObjectState {
	
	   APRVE       // Approved - Y
	 , ARCHV       // Archived - Y
	 , AUTOR       // Awaiting Auto-Release - Y
	 , AWA         // Awaiting Approval - Y
	 , AWASA       // Open/Awaiting Settlement Approval - Y
	 , AWSTA       // Awaiting Send To Approval - Y
	 , CAN         // Cancelled - Y
	 , CLOSE       // Closed - Y
	 , CLSD        // Closed - Y
	 , CNCLD       // Cancelled - Y
	 , CNPRM       // Permanently Cancelled - Y
	 , DEPOS       // Deposited - Y
	 , EXPIR       // Expired - Y
	 , EXPTD       // Expected - Y
	 , INACT       // Inactive - Y
	 , INCAN       // Inactive-Cancelled - Y
	 , INCOM       // In Compliance - Y
	 , INVIO       // In Violation - Y
	 , LAWCF       // Awaiting Cost Of Funds - Y
	 , LAWFX       // Awaiting Intent Notice - Y
	 , LAWLS       // Awaiting Lender Shares - Y
	 , LRELS       // Active - Y
	 , LWFX2       // Awaiting Rate Setting Notice - Y
	 , LWRAT       // Awaiting Rate Setting - Y
	 , LWREL       // Awaiting Release - Y
	 , MONTR       // To Be Monitored - Y
	 , NNHST       // Closed - Y
	 , NNTRM       // Terminated - Y
	 , OPEN        // Open - Y
	 , OPSA        // Open/Settlement Approved - Y
	 , PEND        // Pending - Y
	 , PLDGD       // Pledged - Y
	 , RECVD       // Received - Y
	 , RELSD       // Released - Y
	 , REVEW       // Needs Review - Y
	 , RFAPR       // Awaiting Approval - Y
	 , RJECT       // Rejected - Y
	 , RTRND       // Returned - Y
	 , TERM        // Terminated - Y
	 , UNVER       // Closed Unverified - Y
	 , VNOTE       // Violation Noted - Y
	 , WAIVD       // Waived - Y
	 , WTHDN       // Withdrawn - Y
	 , AGENT       // Closed - Y
	 , APRVD       // Approved - Y
	 , APPRV       // Approved - Y
	 , DCLND       // Declined - Y
	 , TPNST       // Terminated Pending Settlement - Y
	 , APTTM       // Active - Partially Terminated - Y
	 , UPTRN       // Unpaid Payment - Y
	 , UPPAR       // Partially Unpaid - Y
	 , UPIPR       // Indemnity Payment Received - Y
	 , UPPRC       // Partial Recuperation - Y
	 , UPBPR       // Borrower Payment Received - Y
	 , UPRPI       // Risk Participation Intervention - Y
	 , UPEIR       // Exporter Intervention Received - Y
	 , UPCDB       // Collateral Disbursed - Y
	 , AWRA        // Awaiting Rate Approval - Y
	 , AWSRA       // Awaiting Send to Rate Approval - Y
	 , UNPD        // Unpaid - Y
	 , PRTPD       // Partially Paid - Y
	 , FULPD       // Fully Paid - Y
	 , RVRSD       // Reversed - Y
	 , APCCA       // Awaiting Credit Control Approval - Y
	 , PARCM       // Partially Completed - Y
	 , COMP        // Completed - Y
	 , INCMP       // Incomplete - Y
	 , BAL         // Balance - Y
	 , BALPN       // Pending Balance - Y
	 , ERROR       // Error - Y
	 , WAA         // Watchful Account Approval - Y
	 , AECR        // Awaiting External Cash Reconciliation - Y
	 , FAIL        // Failed - Y
	 , AWCOM       // Awaiting Completion - Y
	 , DELV        // Delivered - Y
	 , CONF        // Confirmed - Y
	 , ARNCC       // Awaiting Receipt of Non-Cash Components - Y
	 , AWARS       // Awaiting Auto Rate Setting - Y
	 , AWRSA       // Awaiting Rate Set Approval - Y
	 , LABDP       // Abandonment in Progress - Y
	 , LNABD       // Abandoned - Y
	 ;

	public static final String tableId          = "OLS";
	public static final String tableName        = "VGM_OBJECT_STATE";
	public static final String source           = "TLS_FAM_GLOBAL";
	public static final String tableNameLogical = "Object State";	
	public static final boolean updateable = false;

}
