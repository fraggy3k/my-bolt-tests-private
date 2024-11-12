package org.smartdatahub.liq.context;
import java.util.ArrayList;
import java.util.List;

import org.smartdatahub.liq.entity.interfaces.LiqBranch;
import org.smartdatahub.liq.entity.interfaces.LiqCodeBank;
import org.smartdatahub.liq.entity.interfaces.LiqCodeOutstandingType;
import org.smartdatahub.liq.entity.interfaces.LiqCustomer;
import org.smartdatahub.liq.entity.interfaces.LiqDeal;
import org.smartdatahub.liq.entity.interfaces.LiqDealAdmin;
import org.smartdatahub.liq.entity.interfaces.LiqDealBorrower;
import org.smartdatahub.liq.entity.interfaces.LiqFacBorrDetl;
import org.smartdatahub.liq.entity.interfaces.LiqFacCommitTrn;
import org.smartdatahub.liq.entity.interfaces.LiqFacHostAgr;
import org.smartdatahub.liq.entity.interfaces.LiqFacility;
import org.smartdatahub.liq.entity.interfaces.LiqFacilityAdmin;
import org.smartdatahub.liq.entity.interfaces.LiqFacilityType;
import org.smartdatahub.liq.entity.interfaces.LiqFamGlobal3;
import org.smartdatahub.liq.entity.interfaces.LiqOstTran;
import org.smartdatahub.liq.entity.interfaces.LiqOutstanding;
import org.smartdatahub.liq.entity.interfaces.LiqTimeRegion;
import org.smartdatahub.liq.entity.utils.Relation;

public class RelationFactory { 

	
				public static Relation<LiqBranch, LiqCodeBank> getRelationLiqBranchToLiqCodeBankFromFieldBank() {
					return new Relation<LiqBranch, LiqCodeBank> (LiqBranch.class, LiqCodeBank.class, "bank"
						, "VLS_BRANCH", "BRN_CDE_BANK", "", "Bank", "GB2_CDE_CODE" 
						, "ManyToOne", true);
				}
				public static Relation<LiqBranch, LiqCustomer> getRelationLiqBranchToLiqCustomerFromFieldCustomer() {
					return new Relation<LiqBranch, LiqCustomer> (LiqBranch.class, LiqCustomer.class, "customer"
						, "VLS_BRANCH", "BRN_CID_CUST_ID", "", "VLS_CUSTOMER", "CUS_CID_CUST_ID" 
						, "ManyToOne", true);
				}
				// owning: false REVERSE  oneToMany = ManyToOne or parent -> children    ---  ManyToOne  
				// REV: parent/id        = VLS_BRANCH.BRN_CDE_TME_REGION
				// REV: child /fk/owning = VLS_TIME_REGION.TRG_CDE_CODE and   
				// cardinality   = ManyToOne    
				public static Relation<LiqBranch, LiqTimeRegion> getRelationLiqBranchToLiqTimeRegionFromFieldTimeRegion() {
					return new Relation<LiqBranch, LiqTimeRegion> (LiqBranch.class, LiqTimeRegion.class, "timeRegion"
						, "VLS_TIME_REGION", "TRG_CDE_CODE", "", "VLS_BRANCH", "BRN_CDE_TME_REGION" 
						, "ManyToOne", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_BRANCH.BRN_CDE_BRANCH
				// REV: child /fk/owning = VLS_DEAL.DEA_CDE_BRANCH and   
				// cardinality   = OneToMany    
				public static Relation<LiqBranch, LiqDeal> getRelationLiqBranchToLiqDealFromFieldDeals() {
					return new Relation<LiqBranch, LiqDeal> (LiqBranch.class, LiqDeal.class, "deals"
						, "VLS_DEAL", "DEA_CDE_BRANCH", "", "VLS_BRANCH", "BRN_CDE_BRANCH" 
						, "OneToMany", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_BRANCH.BRN_CDE_BRANCH
				// REV: child /fk/owning = VLS_FACILITY.FAC_CDE_BRANCH and   
				// cardinality   = OneToMany    
				public static Relation<LiqBranch, LiqFacility> getRelationLiqBranchToLiqFacilityFromFieldFacilities() {
					return new Relation<LiqBranch, LiqFacility> (LiqBranch.class, LiqFacility.class, "facilities"
						, "VLS_FACILITY", "FAC_CDE_BRANCH", "", "VLS_BRANCH", "BRN_CDE_BRANCH" 
						, "OneToMany", false);
				}
				public static Relation<LiqCustomer, LiqCodeBank> getRelationLiqCustomerToLiqCodeBankFromFieldBank() {
					return new Relation<LiqCustomer, LiqCodeBank> (LiqCustomer.class, LiqCodeBank.class, "bank"
						, "VLS_CUSTOMER", "CUS_CDE_BANK", "", "Bank", "GB2_CDE_CODE" 
						, "ManyToOne", true);
				}
				public static Relation<LiqCustomer, LiqCustomer> getRelationLiqCustomerToLiqCustomerFromFieldCustomerImmParentParent() {
					return new Relation<LiqCustomer, LiqCustomer> (LiqCustomer.class, LiqCustomer.class, "customerImmParentParent"
						, "VLS_CUSTOMER", "CUS_CID_IMM_PARENT", "", "VLS_CUSTOMER", "CUS_CID_CUST_ID" 
						, "ManyToOne", true);
				}
				public static Relation<LiqCustomer, LiqCustomer> getRelationLiqCustomerToLiqCustomerFromFieldCustomerUltParentParent() {
					return new Relation<LiqCustomer, LiqCustomer> (LiqCustomer.class, LiqCustomer.class, "customerUltParentParent"
						, "VLS_CUSTOMER", "CUS_CID_ULT_PARENT", "", "VLS_CUSTOMER", "CUS_CID_CUST_ID" 
						, "ManyToOne", true);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_CUSTOMER.CUS_CID_CUST_ID
				// REV: child /fk/owning = VLS_BRANCH.BRN_CID_CUST_ID and   
				// cardinality   = OneToMany    
				public static Relation<LiqCustomer, LiqBranch> getRelationLiqCustomerToLiqBranchFromFieldBranchs() {
					return new Relation<LiqCustomer, LiqBranch> (LiqCustomer.class, LiqBranch.class, "branchs"
						, "VLS_BRANCH", "BRN_CID_CUST_ID", "", "VLS_CUSTOMER", "CUS_CID_CUST_ID" 
						, "OneToMany", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_CUSTOMER.CUS_CID_CUST_ID
				// REV: child /fk/owning = VLS_DEAL_ADMIN.DAD_CID_CUST_ID and   
				// cardinality   = OneToMany    
				public static Relation<LiqCustomer, LiqDealAdmin> getRelationLiqCustomerToLiqDealAdminFromFieldDealAdmins() {
					return new Relation<LiqCustomer, LiqDealAdmin> (LiqCustomer.class, LiqDealAdmin.class, "dealAdmins"
						, "VLS_DEAL_ADMIN", "DAD_CID_CUST_ID", "", "VLS_CUSTOMER", "CUS_CID_CUST_ID" 
						, "OneToMany", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_CUSTOMER.CUS_CID_CUST_ID
				// REV: child /fk/owning = VLS_DEAL_BORROWER.DBR_CID_CUST_ID and   
				// cardinality   = OneToMany    
				public static Relation<LiqCustomer, LiqDealBorrower> getRelationLiqCustomerToLiqDealBorrowerFromFieldDealBorrowers() {
					return new Relation<LiqCustomer, LiqDealBorrower> (LiqCustomer.class, LiqDealBorrower.class, "dealBorrowers"
						, "VLS_DEAL_BORROWER", "DBR_CID_CUST_ID", "", "VLS_CUSTOMER", "CUS_CID_CUST_ID" 
						, "OneToMany", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_CUSTOMER.CUS_CID_CUST_ID
				// REV: child /fk/owning = VLS_CUSTOMER.CUS_CID_IMM_PARENT and   
				// cardinality   = OneToMany    
				public static Relation<LiqCustomer, LiqCustomer> getRelationLiqCustomerToLiqCustomerFromFieldImmParentCustomers() {
					return new Relation<LiqCustomer, LiqCustomer> (LiqCustomer.class, LiqCustomer.class, "immParentCustomers"
						, "VLS_CUSTOMER", "CUS_CID_IMM_PARENT", "", "VLS_CUSTOMER", "CUS_CID_CUST_ID" 
						, "OneToMany", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_CUSTOMER.CUS_CID_CUST_ID
				// REV: child /fk/owning = VLS_OUTSTANDING.OST_CID_BORROWER and   
				// cardinality   = OneToMany    
				public static Relation<LiqCustomer, LiqOutstanding> getRelationLiqCustomerToLiqOutstandingFromFieldOutstandings() {
					return new Relation<LiqCustomer, LiqOutstanding> (LiqCustomer.class, LiqOutstanding.class, "outstandings"
						, "VLS_OUTSTANDING", "OST_CID_BORROWER", "", "VLS_CUSTOMER", "CUS_CID_CUST_ID" 
						, "OneToMany", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_CUSTOMER.CUS_CID_CUST_ID
				// REV: child /fk/owning = VLS_CUSTOMER.CUS_CID_ULT_PARENT and   
				// cardinality   = OneToMany    
				public static Relation<LiqCustomer, LiqCustomer> getRelationLiqCustomerToLiqCustomerFromFieldUltParentCustomers() {
					return new Relation<LiqCustomer, LiqCustomer> (LiqCustomer.class, LiqCustomer.class, "ultParentCustomers"
						, "VLS_CUSTOMER", "CUS_CID_ULT_PARENT", "", "VLS_CUSTOMER", "CUS_CID_CUST_ID" 
						, "OneToMany", false);
				}
				public static Relation<LiqDeal, LiqCodeBank> getRelationLiqDealToLiqCodeBankFromFieldBank() {
					return new Relation<LiqDeal, LiqCodeBank> (LiqDeal.class, LiqCodeBank.class, "bank"
						, "VLS_DEAL", "DEA_CDE_BANK", "", "Bank", "GB2_CDE_CODE" 
						, "ManyToOne", true);
				}
				public static Relation<LiqDeal, LiqBranch> getRelationLiqDealToLiqBranchFromFieldBranch() {
					return new Relation<LiqDeal, LiqBranch> (LiqDeal.class, LiqBranch.class, "branch"
						, "VLS_DEAL", "DEA_CDE_BRANCH", "", "VLS_BRANCH", "BRN_CDE_BRANCH" 
						, "ManyToOne", true);
				}
				// owning: false REVERSE  oneToMany = OneToOne or parent -> children    ---  OneToOne  
				// REV: parent/id        = VLS_DEAL.DEA_PID_DEAL
				// REV: child /fk/owning = VLS_DEAL_ADMIN.DAD_PID_DEAL and   
				// cardinality   = OneToOne    
				public static Relation<LiqDeal, LiqDealAdmin> getRelationLiqDealToLiqDealAdminFromFieldDealAdmin() {
					return new Relation<LiqDeal, LiqDealAdmin> (LiqDeal.class, LiqDealAdmin.class, "dealAdmin"
						, "VLS_DEAL_ADMIN", "DAD_PID_DEAL", "", "VLS_DEAL", "DEA_PID_DEAL" 
						, "OneToOne", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_DEAL.DEA_PID_DEAL
				// REV: child /fk/owning = VLS_DEAL_BORROWER.DBR_PID_DEAL and   
				// cardinality   = OneToMany    
				public static Relation<LiqDeal, LiqDealBorrower> getRelationLiqDealToLiqDealBorrowerFromFieldDealBorrowers() {
					return new Relation<LiqDeal, LiqDealBorrower> (LiqDeal.class, LiqDealBorrower.class, "dealBorrowers"
						, "VLS_DEAL_BORROWER", "DBR_PID_DEAL", "", "VLS_DEAL", "DEA_PID_DEAL" 
						, "OneToMany", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_DEAL.DEA_PID_DEAL
				// REV: child /fk/owning = VLS_FAC_COMMIT_TRN.FTR_PID_DEAL and   
				// cardinality   = OneToMany    
				public static Relation<LiqDeal, LiqFacCommitTrn> getRelationLiqDealToLiqFacCommitTrnFromFieldFacCommitTrns() {
					return new Relation<LiqDeal, LiqFacCommitTrn> (LiqDeal.class, LiqFacCommitTrn.class, "facCommitTrns"
						, "VLS_FAC_COMMIT_TRN", "FTR_PID_DEAL", "", "VLS_DEAL", "DEA_PID_DEAL" 
						, "OneToMany", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_DEAL.DEA_PID_DEAL
				// REV: child /fk/owning = VLS_FAC_HOST_AGR.FHA_PID_DEAL and   
				// cardinality   = OneToMany    
				public static Relation<LiqDeal, LiqFacHostAgr> getRelationLiqDealToLiqFacHostAgrFromFieldFacHostAgrs() {
					return new Relation<LiqDeal, LiqFacHostAgr> (LiqDeal.class, LiqFacHostAgr.class, "facHostAgrs"
						, "VLS_FAC_HOST_AGR", "FHA_PID_DEAL", "", "VLS_DEAL", "DEA_PID_DEAL" 
						, "OneToMany", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_DEAL.DEA_PID_DEAL
				// REV: child /fk/owning = VLS_FACILITY.FAC_PID_DEAL and   
				// cardinality   = OneToMany    
				public static Relation<LiqDeal, LiqFacility> getRelationLiqDealToLiqFacilityFromFieldFacilities() {
					return new Relation<LiqDeal, LiqFacility> (LiqDeal.class, LiqFacility.class, "facilities"
						, "VLS_FACILITY", "FAC_PID_DEAL", "", "VLS_DEAL", "DEA_PID_DEAL" 
						, "OneToMany", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_DEAL.DEA_PID_DEAL
				// REV: child /fk/owning = VLS_OUTSTANDING.OST_PID_DEAL and   
				// cardinality   = OneToMany    
				public static Relation<LiqDeal, LiqOutstanding> getRelationLiqDealToLiqOutstandingFromFieldOutstandings() {
					return new Relation<LiqDeal, LiqOutstanding> (LiqDeal.class, LiqOutstanding.class, "outstandings"
						, "VLS_OUTSTANDING", "OST_PID_DEAL", "", "VLS_DEAL", "DEA_PID_DEAL" 
						, "OneToMany", false);
				}
				public static Relation<LiqDealAdmin, LiqCustomer> getRelationLiqDealAdminToLiqCustomerFromFieldCustomer() {
					return new Relation<LiqDealAdmin, LiqCustomer> (LiqDealAdmin.class, LiqCustomer.class, "customer"
						, "VLS_DEAL_ADMIN", "DAD_CID_CUST_ID", "", "VLS_CUSTOMER", "CUS_CID_CUST_ID" 
						, "ManyToOne", true);
				}
				public static Relation<LiqDealAdmin, LiqDeal> getRelationLiqDealAdminToLiqDealFromFieldDeal() {
					return new Relation<LiqDealAdmin, LiqDeal> (LiqDealAdmin.class, LiqDeal.class, "deal"
						, "VLS_DEAL_ADMIN", "DAD_PID_DEAL", "", "VLS_DEAL", "DEA_PID_DEAL" 
						, "OneToOne", true);
				}
				public static Relation<LiqDealBorrower, LiqCustomer> getRelationLiqDealBorrowerToLiqCustomerFromFieldCustomer() {
					return new Relation<LiqDealBorrower, LiqCustomer> (LiqDealBorrower.class, LiqCustomer.class, "customer"
						, "VLS_DEAL_BORROWER", "DBR_CID_CUST_ID", "", "VLS_CUSTOMER", "CUS_CID_CUST_ID" 
						, "ManyToOne", true);
				}
				public static Relation<LiqDealBorrower, LiqDeal> getRelationLiqDealBorrowerToLiqDealFromFieldDeal() {
					return new Relation<LiqDealBorrower, LiqDeal> (LiqDealBorrower.class, LiqDeal.class, "deal"
						, "VLS_DEAL_BORROWER", "DBR_PID_DEAL", "", "VLS_DEAL", "DEA_PID_DEAL" 
						, "ManyToOne", true);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_DEAL_BORROWER.DBR_RID_DEAL_BORR
				// REV: child /fk/owning = VLS_FAC_BORR_DETL.FBD_RID_DEAL_BORR and   
				// cardinality   = OneToMany    
				public static Relation<LiqDealBorrower, LiqFacBorrDetl> getRelationLiqDealBorrowerToLiqFacBorrDetlFromFieldFacBorrDetls() {
					return new Relation<LiqDealBorrower, LiqFacBorrDetl> (LiqDealBorrower.class, LiqFacBorrDetl.class, "facBorrDetls"
						, "VLS_FAC_BORR_DETL", "FBD_RID_DEAL_BORR", "", "VLS_DEAL_BORROWER", "DBR_RID_DEAL_BORR" 
						, "OneToMany", false);
				}
				public static Relation<LiqFacBorrDetl, LiqDealBorrower> getRelationLiqFacBorrDetlToLiqDealBorrowerFromFieldDealBorrower() {
					return new Relation<LiqFacBorrDetl, LiqDealBorrower> (LiqFacBorrDetl.class, LiqDealBorrower.class, "dealBorrower"
						, "VLS_FAC_BORR_DETL", "FBD_RID_DEAL_BORR", "", "VLS_DEAL_BORROWER", "DBR_RID_DEAL_BORR" 
						, "ManyToOne", true);
				}
				public static Relation<LiqFacBorrDetl, LiqFacility> getRelationLiqFacBorrDetlToLiqFacilityFromFieldFacility() {
					return new Relation<LiqFacBorrDetl, LiqFacility> (LiqFacBorrDetl.class, LiqFacility.class, "facility"
						, "VLS_FAC_BORR_DETL", "FBD_PID_FACILITY", "", "VLS_FACILITY", "FAC_PID_FACILITY" 
						, "ManyToOne", true);
				}
				public static Relation<LiqFacCommitTrn, LiqDeal> getRelationLiqFacCommitTrnToLiqDealFromFieldDeal() {
					return new Relation<LiqFacCommitTrn, LiqDeal> (LiqFacCommitTrn.class, LiqDeal.class, "deal"
						, "VLS_FAC_COMMIT_TRN", "FTR_PID_DEAL", "", "VLS_DEAL", "DEA_PID_DEAL" 
						, "ManyToOne", true);
				}
				public static Relation<LiqFacCommitTrn, LiqFacility> getRelationLiqFacCommitTrnToLiqFacilityFromFieldFacility() {
					return new Relation<LiqFacCommitTrn, LiqFacility> (LiqFacCommitTrn.class, LiqFacility.class, "facility"
						, "VLS_FAC_COMMIT_TRN", "FTR_PID_FACILITY", "", "VLS_FACILITY", "FAC_PID_FACILITY" 
						, "ManyToOne", true);
				}
				public static Relation<LiqFacCommitTrn, LiqOstTran> getRelationLiqFacCommitTrnToLiqOstTranFromFieldOstTran() {
					return new Relation<LiqFacCommitTrn, LiqOstTran> (LiqFacCommitTrn.class, LiqOstTran.class, "ostTran"
						, "VLS_FAC_COMMIT_TRN", "FTR_RID_GROUP_TRN", "", "VLS_OST_TRAN", "OTR_RID_OST_TRAN" 
						, "ManyToOne", true);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_FAC_COMMIT_TRN.FTR_RID_COMMIT_TRN
				// REV: child /fk/owning = VLS_OST_TRAN.OTR_RID_COMMIT_TRN and   
				// cardinality   = OneToMany    
				public static Relation<LiqFacCommitTrn, LiqOstTran> getRelationLiqFacCommitTrnToLiqOstTranFromFieldOstTransCommitTrn() {
					return new Relation<LiqFacCommitTrn, LiqOstTran> (LiqFacCommitTrn.class, LiqOstTran.class, "ostTransCommitTrn"
						, "VLS_OST_TRAN", "OTR_RID_COMMIT_TRN", "", "VLS_FAC_COMMIT_TRN", "FTR_RID_COMMIT_TRN" 
						, "OneToMany", false);
				}
				public static Relation<LiqFacHostAgr, LiqDeal> getRelationLiqFacHostAgrToLiqDealFromFieldDeal() {
					return new Relation<LiqFacHostAgr, LiqDeal> (LiqFacHostAgr.class, LiqDeal.class, "deal"
						, "VLS_FAC_HOST_AGR", "FHA_PID_DEAL", "", "VLS_DEAL", "DEA_PID_DEAL" 
						, "ManyToOne", true);
				}
				public static Relation<LiqFacHostAgr, LiqFacility> getRelationLiqFacHostAgrToLiqFacilityFromFieldFacility() {
					return new Relation<LiqFacHostAgr, LiqFacility> (LiqFacHostAgr.class, LiqFacility.class, "facility"
						, "VLS_FAC_HOST_AGR", "FHA_PID_FACILITY", "", "VLS_FACILITY", "FAC_PID_FACILITY" 
						, "ManyToOne", true);
				}
				public static Relation<LiqFacility, LiqCodeBank> getRelationLiqFacilityToLiqCodeBankFromFieldBank() {
					return new Relation<LiqFacility, LiqCodeBank> (LiqFacility.class, LiqCodeBank.class, "bank"
						, "VLS_FACILITY", "FAC_CDE_BANK", "", "Bank", "GB2_CDE_CODE" 
						, "ManyToOne", true);
				}
				public static Relation<LiqFacility, LiqBranch> getRelationLiqFacilityToLiqBranchFromFieldBranch() {
					return new Relation<LiqFacility, LiqBranch> (LiqFacility.class, LiqBranch.class, "branch"
						, "VLS_FACILITY", "FAC_CDE_BRANCH", "", "VLS_BRANCH", "BRN_CDE_BRANCH" 
						, "ManyToOne", true);
				}
				public static Relation<LiqFacility, LiqDeal> getRelationLiqFacilityToLiqDealFromFieldDeal() {
					return new Relation<LiqFacility, LiqDeal> (LiqFacility.class, LiqDeal.class, "deal"
						, "VLS_FACILITY", "FAC_PID_DEAL", "", "VLS_DEAL", "DEA_PID_DEAL" 
						, "ManyToOne", true);
				}
				public static Relation<LiqFacility, LiqFacilityType> getRelationLiqFacilityToLiqFacilityTypeFromFieldFacilityType() {
					return new Relation<LiqFacility, LiqFacilityType> (LiqFacility.class, LiqFacilityType.class, "facilityType"
						, "VLS_FACILITY", "FAC_CDE_FAC_TYPE", "", "VLS_FACILITY_TYPE", "FAT_CDE_FAC_TYPE" 
						, "ManyToOne", true);
				}
				// owning: false REVERSE  oneToMany = OneToOne or parent -> children    ---  OneToOne  
				// REV: parent/id        = VLS_FACILITY.FAC_PID_FACILITY
				// REV: child /fk/owning = VLS_FACILITY_ADMIN.FAD_PID_FACILITY and   
				// cardinality   = OneToOne    
				public static Relation<LiqFacility, LiqFacilityAdmin> getRelationLiqFacilityToLiqFacilityAdminFromFieldFacilityAdmin() {
					return new Relation<LiqFacility, LiqFacilityAdmin> (LiqFacility.class, LiqFacilityAdmin.class, "facilityAdmin"
						, "VLS_FACILITY_ADMIN", "FAD_PID_FACILITY", "", "VLS_FACILITY", "FAC_PID_FACILITY" 
						, "OneToOne", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_FACILITY.FAC_PID_FACILITY
				// REV: child /fk/owning = VLS_FAC_BORR_DETL.FBD_PID_FACILITY and   
				// cardinality   = OneToMany    
				public static Relation<LiqFacility, LiqFacBorrDetl> getRelationLiqFacilityToLiqFacBorrDetlFromFieldFacBorrDetls() {
					return new Relation<LiqFacility, LiqFacBorrDetl> (LiqFacility.class, LiqFacBorrDetl.class, "facBorrDetls"
						, "VLS_FAC_BORR_DETL", "FBD_PID_FACILITY", "", "VLS_FACILITY", "FAC_PID_FACILITY" 
						, "OneToMany", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_FACILITY.FAC_PID_FACILITY
				// REV: child /fk/owning = VLS_FAC_COMMIT_TRN.FTR_PID_FACILITY and   
				// cardinality   = OneToMany    
				public static Relation<LiqFacility, LiqFacCommitTrn> getRelationLiqFacilityToLiqFacCommitTrnFromFieldFacCommitTrns() {
					return new Relation<LiqFacility, LiqFacCommitTrn> (LiqFacility.class, LiqFacCommitTrn.class, "facCommitTrns"
						, "VLS_FAC_COMMIT_TRN", "FTR_PID_FACILITY", "", "VLS_FACILITY", "FAC_PID_FACILITY" 
						, "OneToMany", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_FACILITY.FAC_PID_FACILITY
				// REV: child /fk/owning = VLS_FAC_HOST_AGR.FHA_PID_FACILITY and   
				// cardinality   = OneToMany    
				public static Relation<LiqFacility, LiqFacHostAgr> getRelationLiqFacilityToLiqFacHostAgrFromFieldFacHostAgrs() {
					return new Relation<LiqFacility, LiqFacHostAgr> (LiqFacility.class, LiqFacHostAgr.class, "facHostAgrs"
						, "VLS_FAC_HOST_AGR", "FHA_PID_FACILITY", "", "VLS_FACILITY", "FAC_PID_FACILITY" 
						, "OneToMany", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_FACILITY.FAC_PID_FACILITY
				// REV: child /fk/owning = VLS_OUTSTANDING.OST_PID_FACILITY and   
				// cardinality   = OneToMany    
				public static Relation<LiqFacility, LiqOutstanding> getRelationLiqFacilityToLiqOutstandingFromFieldOutstandings() {
					return new Relation<LiqFacility, LiqOutstanding> (LiqFacility.class, LiqOutstanding.class, "outstandings"
						, "VLS_OUTSTANDING", "OST_PID_FACILITY", "", "VLS_FACILITY", "FAC_PID_FACILITY" 
						, "OneToMany", false);
				}
				public static Relation<LiqFacilityAdmin, LiqFacility> getRelationLiqFacilityAdminToLiqFacilityFromFieldFacility() {
					return new Relation<LiqFacilityAdmin, LiqFacility> (LiqFacilityAdmin.class, LiqFacility.class, "facility"
						, "VLS_FACILITY_ADMIN", "FAD_PID_FACILITY", "", "VLS_FACILITY", "FAC_PID_FACILITY" 
						, "OneToOne", true);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_FACILITY_TYPE.FAT_CDE_FAC_TYPE
				// REV: child /fk/owning = VLS_FACILITY.FAC_CDE_FAC_TYPE and   
				// cardinality   = OneToMany    
				public static Relation<LiqFacilityType, LiqFacility> getRelationLiqFacilityTypeToLiqFacilityFromFieldFacilities() {
					return new Relation<LiqFacilityType, LiqFacility> (LiqFacilityType.class, LiqFacility.class, "facilities"
						, "VLS_FACILITY", "FAC_CDE_FAC_TYPE", "", "VLS_FACILITY_TYPE", "FAT_CDE_FAC_TYPE" 
						, "OneToMany", false);
				}
				public static Relation<LiqOstTran, LiqFacCommitTrn> getRelationLiqOstTranToLiqFacCommitTrnFromFieldFacCommitTrnCommitTrn() {
					return new Relation<LiqOstTran, LiqFacCommitTrn> (LiqOstTran.class, LiqFacCommitTrn.class, "facCommitTrnCommitTrn"
						, "VLS_OST_TRAN", "OTR_RID_COMMIT_TRN", "", "VLS_FAC_COMMIT_TRN", "FTR_RID_COMMIT_TRN" 
						, "ManyToOne", true);
				}
				public static Relation<LiqOstTran, LiqOutstanding> getRelationLiqOstTranToLiqOutstandingFromFieldOriginalOutstanding() {
					return new Relation<LiqOstTran, LiqOutstanding> (LiqOstTran.class, LiqOutstanding.class, "originalOutstanding"
						, "VLS_OST_TRAN", "OTR_RID_ORIG_OST", "", "VLS_OUTSTANDING", "OST_RID_OUTSTANDNG" 
						, "ManyToOne", true);
				}
				public static Relation<LiqOstTran, LiqOutstanding> getRelationLiqOstTranToLiqOutstandingFromFieldOutstanding() {
					return new Relation<LiqOstTran, LiqOutstanding> (LiqOstTran.class, LiqOutstanding.class, "outstanding"
						, "VLS_OST_TRAN", "OTR_RID_OUTSTANDNG", "", "VLS_OUTSTANDING", "OST_RID_OUTSTANDNG" 
						, "ManyToOne", true);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_OST_TRAN.OTR_RID_OST_TRAN
				// REV: child /fk/owning = VLS_FAC_COMMIT_TRN.FTR_RID_GROUP_TRN and   
				// cardinality   = OneToMany    
				public static Relation<LiqOstTran, LiqFacCommitTrn> getRelationLiqOstTranToLiqFacCommitTrnFromFieldFacCommitTrns() {
					return new Relation<LiqOstTran, LiqFacCommitTrn> (LiqOstTran.class, LiqFacCommitTrn.class, "facCommitTrns"
						, "VLS_FAC_COMMIT_TRN", "FTR_RID_GROUP_TRN", "", "VLS_OST_TRAN", "OTR_RID_OST_TRAN" 
						, "OneToMany", false);
				}
				public static Relation<LiqOutstanding, LiqCustomer> getRelationLiqOutstandingToLiqCustomerFromFieldCustomerBorrower() {
					return new Relation<LiqOutstanding, LiqCustomer> (LiqOutstanding.class, LiqCustomer.class, "customerBorrower"
						, "VLS_OUTSTANDING", "OST_CID_BORROWER", "", "VLS_CUSTOMER", "CUS_CID_CUST_ID" 
						, "ManyToOne", true);
				}
				public static Relation<LiqOutstanding, LiqDeal> getRelationLiqOutstandingToLiqDealFromFieldDeal() {
					return new Relation<LiqOutstanding, LiqDeal> (LiqOutstanding.class, LiqDeal.class, "deal"
						, "VLS_OUTSTANDING", "OST_PID_DEAL", "", "VLS_DEAL", "DEA_PID_DEAL" 
						, "ManyToOne", true);
				}
				public static Relation<LiqOutstanding, LiqFacility> getRelationLiqOutstandingToLiqFacilityFromFieldFacility() {
					return new Relation<LiqOutstanding, LiqFacility> (LiqOutstanding.class, LiqFacility.class, "facility"
						, "VLS_OUTSTANDING", "OST_PID_FACILITY", "", "VLS_FACILITY", "FAC_PID_FACILITY" 
						, "ManyToOne", true);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_OUTSTANDING.OST_RID_OUTSTANDNG
				// REV: child /fk/owning = VLS_OST_TRAN.OTR_RID_ORIG_OST and   
				// cardinality   = OneToMany    
				public static Relation<LiqOutstanding, LiqOstTran> getRelationLiqOutstandingToLiqOstTranFromFieldOriginalOstTrans() {
					return new Relation<LiqOutstanding, LiqOstTran> (LiqOutstanding.class, LiqOstTran.class, "originalOstTrans"
						, "VLS_OST_TRAN", "OTR_RID_ORIG_OST", "", "VLS_OUTSTANDING", "OST_RID_OUTSTANDNG" 
						, "OneToMany", false);
				}
				// owning: false REVERSE  oneToMany = OneToMany or parent -> children    ---  OneToMany  
				// REV: parent/id        = VLS_OUTSTANDING.OST_RID_OUTSTANDNG
				// REV: child /fk/owning = VLS_OST_TRAN.OTR_RID_OUTSTANDNG and   
				// cardinality   = OneToMany    
				public static Relation<LiqOutstanding, LiqOstTran> getRelationLiqOutstandingToLiqOstTranFromFieldOstTrans() {
					return new Relation<LiqOutstanding, LiqOstTran> (LiqOutstanding.class, LiqOstTran.class, "ostTrans"
						, "VLS_OST_TRAN", "OTR_RID_OUTSTANDNG", "", "VLS_OUTSTANDING", "OST_RID_OUTSTANDNG" 
						, "OneToMany", false);
				}
				public static Relation<LiqTimeRegion, LiqBranch> getRelationLiqTimeRegionToLiqBranchFromFieldBranchs() {
					return new Relation<LiqTimeRegion, LiqBranch> (LiqTimeRegion.class, LiqBranch.class, "branchs"
						, "VLS_TIME_REGION", "TRG_CDE_CODE", "", "VLS_BRANCH", "BRN_CDE_TME_REGION" 
						, "OneToMany", true);
				}

	public static List<Relation<LiqCodeBank, ?>> getRelationsFromLiqCodeBank() {
		List<Relation<LiqCodeBank, ?>> retList = new ArrayList<>();
		return retList;
	}
	public static List<Relation<LiqBranch, ?>> getRelationsFromLiqBranch() {
		List<Relation<LiqBranch, ?>> retList = new ArrayList<>();
			retList.add(getRelationLiqBranchToLiqCodeBankFromFieldBank());
			//retList.add(new Relation<LiqBranch, LiqCodeBank> (LiqBranch.class, LiqCodeBank.class, "bank"));
			retList.add(getRelationLiqBranchToLiqCustomerFromFieldCustomer());
			//retList.add(new Relation<LiqBranch, LiqCustomer> (LiqBranch.class, LiqCustomer.class, "customer"));
			retList.add(getRelationLiqBranchToLiqTimeRegionFromFieldTimeRegion());
			//retList.add(new Relation<LiqBranch, LiqTimeRegion> (LiqBranch.class, LiqTimeRegion.class, "timeRegion"));
			retList.add(getRelationLiqBranchToLiqDealFromFieldDeals());
			//retList.add(new Relation<LiqBranch, LiqDeal> (LiqBranch.class, LiqDeal.class, "deals"));
			retList.add(getRelationLiqBranchToLiqFacilityFromFieldFacilities());
			//retList.add(new Relation<LiqBranch, LiqFacility> (LiqBranch.class, LiqFacility.class, "facilities"));
		return retList;
	}
	public static List<Relation<LiqCustomer, ?>> getRelationsFromLiqCustomer() {
		List<Relation<LiqCustomer, ?>> retList = new ArrayList<>();
			retList.add(getRelationLiqCustomerToLiqCodeBankFromFieldBank());
			//retList.add(new Relation<LiqCustomer, LiqCodeBank> (LiqCustomer.class, LiqCodeBank.class, "bank"));
			retList.add(getRelationLiqCustomerToLiqCustomerFromFieldCustomerImmParentParent());
			//retList.add(new Relation<LiqCustomer, LiqCustomer> (LiqCustomer.class, LiqCustomer.class, "customerImmParentParent"));
			retList.add(getRelationLiqCustomerToLiqCustomerFromFieldCustomerUltParentParent());
			//retList.add(new Relation<LiqCustomer, LiqCustomer> (LiqCustomer.class, LiqCustomer.class, "customerUltParentParent"));
			retList.add(getRelationLiqCustomerToLiqBranchFromFieldBranchs());
			//retList.add(new Relation<LiqCustomer, LiqBranch> (LiqCustomer.class, LiqBranch.class, "branchs"));
			retList.add(getRelationLiqCustomerToLiqDealAdminFromFieldDealAdmins());
			//retList.add(new Relation<LiqCustomer, LiqDealAdmin> (LiqCustomer.class, LiqDealAdmin.class, "dealAdmins"));
			retList.add(getRelationLiqCustomerToLiqDealBorrowerFromFieldDealBorrowers());
			//retList.add(new Relation<LiqCustomer, LiqDealBorrower> (LiqCustomer.class, LiqDealBorrower.class, "dealBorrowers"));
			retList.add(getRelationLiqCustomerToLiqCustomerFromFieldImmParentCustomers());
			//retList.add(new Relation<LiqCustomer, LiqCustomer> (LiqCustomer.class, LiqCustomer.class, "immParentCustomers"));
			retList.add(getRelationLiqCustomerToLiqOutstandingFromFieldOutstandings());
			//retList.add(new Relation<LiqCustomer, LiqOutstanding> (LiqCustomer.class, LiqOutstanding.class, "outstandings"));
			retList.add(getRelationLiqCustomerToLiqCustomerFromFieldUltParentCustomers());
			//retList.add(new Relation<LiqCustomer, LiqCustomer> (LiqCustomer.class, LiqCustomer.class, "ultParentCustomers"));
		return retList;
	}
	public static List<Relation<LiqDeal, ?>> getRelationsFromLiqDeal() {
		List<Relation<LiqDeal, ?>> retList = new ArrayList<>();
			retList.add(getRelationLiqDealToLiqCodeBankFromFieldBank());
			//retList.add(new Relation<LiqDeal, LiqCodeBank> (LiqDeal.class, LiqCodeBank.class, "bank"));
			retList.add(getRelationLiqDealToLiqBranchFromFieldBranch());
			//retList.add(new Relation<LiqDeal, LiqBranch> (LiqDeal.class, LiqBranch.class, "branch"));
			retList.add(getRelationLiqDealToLiqDealAdminFromFieldDealAdmin());
			//retList.add(new Relation<LiqDeal, LiqDealAdmin> (LiqDeal.class, LiqDealAdmin.class, "dealAdmin"));
			retList.add(getRelationLiqDealToLiqDealBorrowerFromFieldDealBorrowers());
			//retList.add(new Relation<LiqDeal, LiqDealBorrower> (LiqDeal.class, LiqDealBorrower.class, "dealBorrowers"));
			retList.add(getRelationLiqDealToLiqFacCommitTrnFromFieldFacCommitTrns());
			//retList.add(new Relation<LiqDeal, LiqFacCommitTrn> (LiqDeal.class, LiqFacCommitTrn.class, "facCommitTrns"));
			retList.add(getRelationLiqDealToLiqFacHostAgrFromFieldFacHostAgrs());
			//retList.add(new Relation<LiqDeal, LiqFacHostAgr> (LiqDeal.class, LiqFacHostAgr.class, "facHostAgrs"));
			retList.add(getRelationLiqDealToLiqFacilityFromFieldFacilities());
			//retList.add(new Relation<LiqDeal, LiqFacility> (LiqDeal.class, LiqFacility.class, "facilities"));
			retList.add(getRelationLiqDealToLiqOutstandingFromFieldOutstandings());
			//retList.add(new Relation<LiqDeal, LiqOutstanding> (LiqDeal.class, LiqOutstanding.class, "outstandings"));
		return retList;
	}
	public static List<Relation<LiqDealAdmin, ?>> getRelationsFromLiqDealAdmin() {
		List<Relation<LiqDealAdmin, ?>> retList = new ArrayList<>();
			retList.add(getRelationLiqDealAdminToLiqCustomerFromFieldCustomer());
			//retList.add(new Relation<LiqDealAdmin, LiqCustomer> (LiqDealAdmin.class, LiqCustomer.class, "customer"));
			retList.add(getRelationLiqDealAdminToLiqDealFromFieldDeal());
			//retList.add(new Relation<LiqDealAdmin, LiqDeal> (LiqDealAdmin.class, LiqDeal.class, "deal"));
		return retList;
	}
	public static List<Relation<LiqDealBorrower, ?>> getRelationsFromLiqDealBorrower() {
		List<Relation<LiqDealBorrower, ?>> retList = new ArrayList<>();
			retList.add(getRelationLiqDealBorrowerToLiqCustomerFromFieldCustomer());
			//retList.add(new Relation<LiqDealBorrower, LiqCustomer> (LiqDealBorrower.class, LiqCustomer.class, "customer"));
			retList.add(getRelationLiqDealBorrowerToLiqDealFromFieldDeal());
			//retList.add(new Relation<LiqDealBorrower, LiqDeal> (LiqDealBorrower.class, LiqDeal.class, "deal"));
			retList.add(getRelationLiqDealBorrowerToLiqFacBorrDetlFromFieldFacBorrDetls());
			//retList.add(new Relation<LiqDealBorrower, LiqFacBorrDetl> (LiqDealBorrower.class, LiqFacBorrDetl.class, "facBorrDetls"));
		return retList;
	}
	public static List<Relation<LiqFacBorrDetl, ?>> getRelationsFromLiqFacBorrDetl() {
		List<Relation<LiqFacBorrDetl, ?>> retList = new ArrayList<>();
			retList.add(getRelationLiqFacBorrDetlToLiqDealBorrowerFromFieldDealBorrower());
			//retList.add(new Relation<LiqFacBorrDetl, LiqDealBorrower> (LiqFacBorrDetl.class, LiqDealBorrower.class, "dealBorrower"));
			retList.add(getRelationLiqFacBorrDetlToLiqFacilityFromFieldFacility());
			//retList.add(new Relation<LiqFacBorrDetl, LiqFacility> (LiqFacBorrDetl.class, LiqFacility.class, "facility"));
		return retList;
	}
	public static List<Relation<LiqFacCommitTrn, ?>> getRelationsFromLiqFacCommitTrn() {
		List<Relation<LiqFacCommitTrn, ?>> retList = new ArrayList<>();
			retList.add(getRelationLiqFacCommitTrnToLiqDealFromFieldDeal());
			//retList.add(new Relation<LiqFacCommitTrn, LiqDeal> (LiqFacCommitTrn.class, LiqDeal.class, "deal"));
			retList.add(getRelationLiqFacCommitTrnToLiqFacilityFromFieldFacility());
			//retList.add(new Relation<LiqFacCommitTrn, LiqFacility> (LiqFacCommitTrn.class, LiqFacility.class, "facility"));
			retList.add(getRelationLiqFacCommitTrnToLiqOstTranFromFieldOstTran());
			//retList.add(new Relation<LiqFacCommitTrn, LiqOstTran> (LiqFacCommitTrn.class, LiqOstTran.class, "ostTran"));
			retList.add(getRelationLiqFacCommitTrnToLiqOstTranFromFieldOstTransCommitTrn());
			//retList.add(new Relation<LiqFacCommitTrn, LiqOstTran> (LiqFacCommitTrn.class, LiqOstTran.class, "ostTransCommitTrn"));
		return retList;
	}
	public static List<Relation<LiqFacHostAgr, ?>> getRelationsFromLiqFacHostAgr() {
		List<Relation<LiqFacHostAgr, ?>> retList = new ArrayList<>();
			retList.add(getRelationLiqFacHostAgrToLiqDealFromFieldDeal());
			//retList.add(new Relation<LiqFacHostAgr, LiqDeal> (LiqFacHostAgr.class, LiqDeal.class, "deal"));
			retList.add(getRelationLiqFacHostAgrToLiqFacilityFromFieldFacility());
			//retList.add(new Relation<LiqFacHostAgr, LiqFacility> (LiqFacHostAgr.class, LiqFacility.class, "facility"));
		return retList;
	}
	public static List<Relation<LiqFacility, ?>> getRelationsFromLiqFacility() {
		List<Relation<LiqFacility, ?>> retList = new ArrayList<>();
			retList.add(getRelationLiqFacilityToLiqCodeBankFromFieldBank());
			//retList.add(new Relation<LiqFacility, LiqCodeBank> (LiqFacility.class, LiqCodeBank.class, "bank"));
			retList.add(getRelationLiqFacilityToLiqBranchFromFieldBranch());
			//retList.add(new Relation<LiqFacility, LiqBranch> (LiqFacility.class, LiqBranch.class, "branch"));
			retList.add(getRelationLiqFacilityToLiqDealFromFieldDeal());
			//retList.add(new Relation<LiqFacility, LiqDeal> (LiqFacility.class, LiqDeal.class, "deal"));
			retList.add(getRelationLiqFacilityToLiqFacilityTypeFromFieldFacilityType());
			//retList.add(new Relation<LiqFacility, LiqFacilityType> (LiqFacility.class, LiqFacilityType.class, "facilityType"));
			retList.add(getRelationLiqFacilityToLiqFacilityAdminFromFieldFacilityAdmin());
			//retList.add(new Relation<LiqFacility, LiqFacilityAdmin> (LiqFacility.class, LiqFacilityAdmin.class, "facilityAdmin"));
			retList.add(getRelationLiqFacilityToLiqFacBorrDetlFromFieldFacBorrDetls());
			//retList.add(new Relation<LiqFacility, LiqFacBorrDetl> (LiqFacility.class, LiqFacBorrDetl.class, "facBorrDetls"));
			retList.add(getRelationLiqFacilityToLiqFacCommitTrnFromFieldFacCommitTrns());
			//retList.add(new Relation<LiqFacility, LiqFacCommitTrn> (LiqFacility.class, LiqFacCommitTrn.class, "facCommitTrns"));
			retList.add(getRelationLiqFacilityToLiqFacHostAgrFromFieldFacHostAgrs());
			//retList.add(new Relation<LiqFacility, LiqFacHostAgr> (LiqFacility.class, LiqFacHostAgr.class, "facHostAgrs"));
			retList.add(getRelationLiqFacilityToLiqOutstandingFromFieldOutstandings());
			//retList.add(new Relation<LiqFacility, LiqOutstanding> (LiqFacility.class, LiqOutstanding.class, "outstandings"));
		return retList;
	}
	public static List<Relation<LiqFacilityAdmin, ?>> getRelationsFromLiqFacilityAdmin() {
		List<Relation<LiqFacilityAdmin, ?>> retList = new ArrayList<>();
			retList.add(getRelationLiqFacilityAdminToLiqFacilityFromFieldFacility());
			//retList.add(new Relation<LiqFacilityAdmin, LiqFacility> (LiqFacilityAdmin.class, LiqFacility.class, "facility"));
		return retList;
	}
	public static List<Relation<LiqFacilityType, ?>> getRelationsFromLiqFacilityType() {
		List<Relation<LiqFacilityType, ?>> retList = new ArrayList<>();
			retList.add(getRelationLiqFacilityTypeToLiqFacilityFromFieldFacilities());
			//retList.add(new Relation<LiqFacilityType, LiqFacility> (LiqFacilityType.class, LiqFacility.class, "facilities"));
		return retList;
	}
	public static List<Relation<LiqFamGlobal3, ?>> getRelationsFromLiqFamGlobal3() {
		List<Relation<LiqFamGlobal3, ?>> retList = new ArrayList<>();
		return retList;
	}
	public static List<Relation<LiqOstTran, ?>> getRelationsFromLiqOstTran() {
		List<Relation<LiqOstTran, ?>> retList = new ArrayList<>();
			retList.add(getRelationLiqOstTranToLiqFacCommitTrnFromFieldFacCommitTrnCommitTrn());
			//retList.add(new Relation<LiqOstTran, LiqFacCommitTrn> (LiqOstTran.class, LiqFacCommitTrn.class, "facCommitTrnCommitTrn"));
			retList.add(getRelationLiqOstTranToLiqOutstandingFromFieldOriginalOutstanding());
			//retList.add(new Relation<LiqOstTran, LiqOutstanding> (LiqOstTran.class, LiqOutstanding.class, "originalOutstanding"));
			retList.add(getRelationLiqOstTranToLiqOutstandingFromFieldOutstanding());
			//retList.add(new Relation<LiqOstTran, LiqOutstanding> (LiqOstTran.class, LiqOutstanding.class, "outstanding"));
			retList.add(getRelationLiqOstTranToLiqFacCommitTrnFromFieldFacCommitTrns());
			//retList.add(new Relation<LiqOstTran, LiqFacCommitTrn> (LiqOstTran.class, LiqFacCommitTrn.class, "facCommitTrns"));
		return retList;
	}
	public static List<Relation<LiqOutstanding, ?>> getRelationsFromLiqOutstanding() {
		List<Relation<LiqOutstanding, ?>> retList = new ArrayList<>();
			retList.add(getRelationLiqOutstandingToLiqCustomerFromFieldCustomerBorrower());
			//retList.add(new Relation<LiqOutstanding, LiqCustomer> (LiqOutstanding.class, LiqCustomer.class, "customerBorrower"));
			retList.add(getRelationLiqOutstandingToLiqDealFromFieldDeal());
			//retList.add(new Relation<LiqOutstanding, LiqDeal> (LiqOutstanding.class, LiqDeal.class, "deal"));
			retList.add(getRelationLiqOutstandingToLiqFacilityFromFieldFacility());
			//retList.add(new Relation<LiqOutstanding, LiqFacility> (LiqOutstanding.class, LiqFacility.class, "facility"));
			retList.add(getRelationLiqOutstandingToLiqOstTranFromFieldOriginalOstTrans());
			//retList.add(new Relation<LiqOutstanding, LiqOstTran> (LiqOutstanding.class, LiqOstTran.class, "originalOstTrans"));
			retList.add(getRelationLiqOutstandingToLiqOstTranFromFieldOstTrans());
			//retList.add(new Relation<LiqOutstanding, LiqOstTran> (LiqOutstanding.class, LiqOstTran.class, "ostTrans"));
		return retList;
	}
	public static List<Relation<LiqCodeOutstandingType, ?>> getRelationsFromLiqCodeOutstandingType() {
		List<Relation<LiqCodeOutstandingType, ?>> retList = new ArrayList<>();
		return retList;
	}
	public static List<Relation<LiqTimeRegion, ?>> getRelationsFromLiqTimeRegion() {
		List<Relation<LiqTimeRegion, ?>> retList = new ArrayList<>();
			retList.add(getRelationLiqTimeRegionToLiqBranchFromFieldBranchs());
			//retList.add(new Relation<LiqTimeRegion, LiqBranch> (LiqTimeRegion.class, LiqBranch.class, "branchs"));
		return retList;
	}
	
}