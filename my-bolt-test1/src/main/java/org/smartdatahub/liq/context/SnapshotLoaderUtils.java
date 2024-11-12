package org.smartdatahub.liq.context;
import org.smartdatahub.liq.context.loader.AbstractLoaderUtils;
import org.smartdatahub.liq.context.loader.SnapshotBranchLoader;
import org.smartdatahub.liq.context.loader.SnapshotCodeBankLoader;
import org.smartdatahub.liq.context.loader.SnapshotCodeOutstandingTypeLoader;
import org.smartdatahub.liq.context.loader.SnapshotCustomerLoader;
import org.smartdatahub.liq.context.loader.SnapshotDealAdminLoader;
import org.smartdatahub.liq.context.loader.SnapshotDealBorrowerLoader;
import org.smartdatahub.liq.context.loader.SnapshotDealLoader;
import org.smartdatahub.liq.context.loader.SnapshotFacBorrDetlLoader;
import org.smartdatahub.liq.context.loader.SnapshotFacCommitTrnLoader;
import org.smartdatahub.liq.context.loader.SnapshotFacHostAgrLoader;
import org.smartdatahub.liq.context.loader.SnapshotFacilityAdminLoader;
import org.smartdatahub.liq.context.loader.SnapshotFacilityLoader;
import org.smartdatahub.liq.context.loader.SnapshotFacilityTypeLoader;
import org.smartdatahub.liq.context.loader.SnapshotFamGlobal3Loader;
import org.smartdatahub.liq.context.loader.SnapshotOstTranLoader;
import org.smartdatahub.liq.context.loader.SnapshotOutstandingLoader;
import org.smartdatahub.liq.context.loader.SnapshotTimeRegionLoader;
import org.smartdatahub.liq.entity.snapshot.SnapshotBranch;
import org.smartdatahub.liq.entity.snapshot.SnapshotCodeBank;
import org.smartdatahub.liq.entity.snapshot.SnapshotCodeOutstandingType;
import org.smartdatahub.liq.entity.snapshot.SnapshotCustomer;
import org.smartdatahub.liq.entity.snapshot.SnapshotDeal;
import org.smartdatahub.liq.entity.snapshot.SnapshotDealAdmin;
import org.smartdatahub.liq.entity.snapshot.SnapshotDealBorrower;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacBorrDetl;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacCommitTrn;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacHostAgr;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacility;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacilityAdmin;
import org.smartdatahub.liq.entity.snapshot.SnapshotFacilityType;
import org.smartdatahub.liq.entity.snapshot.SnapshotFamGlobal3;
import org.smartdatahub.liq.entity.snapshot.SnapshotOstTran;
import org.smartdatahub.liq.entity.snapshot.SnapshotOutstanding;
import org.smartdatahub.liq.entity.snapshot.SnapshotTimeRegion;

public class SnapshotLoaderUtils extends AbstractLoaderUtils{ 
	private AbstractContext context;

	public SnapshotLoaderUtils(AbstractContext context) {
		this.context = context;
	}
	
	public SnapshotCodeBankLoader getSnapshotCodeBankLoader() {
	   return (SnapshotCodeBankLoader) context.getLoader(SnapshotCodeBank.class);	
	}
	public SnapshotBranchLoader getSnapshotBranchLoader() {
	   return (SnapshotBranchLoader) context.getLoader(SnapshotBranch.class);	
	}
	public SnapshotCustomerLoader getSnapshotCustomerLoader() {
	   return (SnapshotCustomerLoader) context.getLoader(SnapshotCustomer.class);	
	}
	public SnapshotDealLoader getSnapshotDealLoader() {
	   return (SnapshotDealLoader) context.getLoader(SnapshotDeal.class);	
	}
	public SnapshotDealAdminLoader getSnapshotDealAdminLoader() {
	   return (SnapshotDealAdminLoader) context.getLoader(SnapshotDealAdmin.class);	
	}
	public SnapshotDealBorrowerLoader getSnapshotDealBorrowerLoader() {
	   return (SnapshotDealBorrowerLoader) context.getLoader(SnapshotDealBorrower.class);	
	}
	public SnapshotFacBorrDetlLoader getSnapshotFacBorrDetlLoader() {
	   return (SnapshotFacBorrDetlLoader) context.getLoader(SnapshotFacBorrDetl.class);	
	}
	public SnapshotFacCommitTrnLoader getSnapshotFacCommitTrnLoader() {
	   return (SnapshotFacCommitTrnLoader) context.getLoader(SnapshotFacCommitTrn.class);	
	}
	public SnapshotFacHostAgrLoader getSnapshotFacHostAgrLoader() {
	   return (SnapshotFacHostAgrLoader) context.getLoader(SnapshotFacHostAgr.class);	
	}
	public SnapshotFacilityLoader getSnapshotFacilityLoader() {
	   return (SnapshotFacilityLoader) context.getLoader(SnapshotFacility.class);	
	}
	public SnapshotFacilityAdminLoader getSnapshotFacilityAdminLoader() {
	   return (SnapshotFacilityAdminLoader) context.getLoader(SnapshotFacilityAdmin.class);	
	}
	public SnapshotFacilityTypeLoader getSnapshotFacilityTypeLoader() {
	   return (SnapshotFacilityTypeLoader) context.getLoader(SnapshotFacilityType.class);	
	}
	public SnapshotFamGlobal3Loader getSnapshotFamGlobal3Loader() {
	   return (SnapshotFamGlobal3Loader) context.getLoader(SnapshotFamGlobal3.class);	
	}
	public SnapshotOstTranLoader getSnapshotOstTranLoader() {
	   return (SnapshotOstTranLoader) context.getLoader(SnapshotOstTran.class);	
	}
	public SnapshotOutstandingLoader getSnapshotOutstandingLoader() {
	   return (SnapshotOutstandingLoader) context.getLoader(SnapshotOutstanding.class);	
	}
	public SnapshotCodeOutstandingTypeLoader getSnapshotCodeOutstandingTypeLoader() {
	   return (SnapshotCodeOutstandingTypeLoader) context.getLoader(SnapshotCodeOutstandingType.class);	
	}
	public SnapshotTimeRegionLoader getSnapshotTimeRegionLoader() {
	   return (SnapshotTimeRegionLoader) context.getLoader(SnapshotTimeRegion.class);	
	}

}