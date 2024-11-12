package org.smartdatahub.liq.context;
import org.smartdatahub.liq.context.loader.AbstractLoaderUtils;
import org.smartdatahub.liq.context.loader.PojoBranchLoader;
import org.smartdatahub.liq.context.loader.PojoCodeBankLoader;
import org.smartdatahub.liq.context.loader.PojoCodeOutstandingTypeLoader;
import org.smartdatahub.liq.context.loader.PojoCustomerLoader;
import org.smartdatahub.liq.context.loader.PojoDealAdminLoader;
import org.smartdatahub.liq.context.loader.PojoDealBorrowerLoader;
import org.smartdatahub.liq.context.loader.PojoDealLoader;
import org.smartdatahub.liq.context.loader.PojoFacBorrDetlLoader;
import org.smartdatahub.liq.context.loader.PojoFacCommitTrnLoader;
import org.smartdatahub.liq.context.loader.PojoFacHostAgrLoader;
import org.smartdatahub.liq.context.loader.PojoFacilityAdminLoader;
import org.smartdatahub.liq.context.loader.PojoFacilityLoader;
import org.smartdatahub.liq.context.loader.PojoFacilityTypeLoader;
import org.smartdatahub.liq.context.loader.PojoFamGlobal3Loader;
import org.smartdatahub.liq.context.loader.PojoOstTranLoader;
import org.smartdatahub.liq.context.loader.PojoOutstandingLoader;
import org.smartdatahub.liq.context.loader.PojoTimeRegionLoader;
import org.smartdatahub.liq.entity.pojo.PojoBranch;
import org.smartdatahub.liq.entity.pojo.PojoCodeBank;
import org.smartdatahub.liq.entity.pojo.PojoCodeOutstandingType;
import org.smartdatahub.liq.entity.pojo.PojoCustomer;
import org.smartdatahub.liq.entity.pojo.PojoDeal;
import org.smartdatahub.liq.entity.pojo.PojoDealAdmin;
import org.smartdatahub.liq.entity.pojo.PojoDealBorrower;
import org.smartdatahub.liq.entity.pojo.PojoFacBorrDetl;
import org.smartdatahub.liq.entity.pojo.PojoFacCommitTrn;
import org.smartdatahub.liq.entity.pojo.PojoFacHostAgr;
import org.smartdatahub.liq.entity.pojo.PojoFacility;
import org.smartdatahub.liq.entity.pojo.PojoFacilityAdmin;
import org.smartdatahub.liq.entity.pojo.PojoFacilityType;
import org.smartdatahub.liq.entity.pojo.PojoFamGlobal3;
import org.smartdatahub.liq.entity.pojo.PojoOstTran;
import org.smartdatahub.liq.entity.pojo.PojoOutstanding;
import org.smartdatahub.liq.entity.pojo.PojoTimeRegion;

public class PojoLoaderUtils extends AbstractLoaderUtils{ 
	
	private AbstractContext context;

	public PojoLoaderUtils(AbstractContext context) {
		this.context = context;
	}
	
	public PojoCodeBankLoader getPojoCodeBankLoader() {
	   return (PojoCodeBankLoader) this.context.getLoader(PojoCodeBank.class);	
	}
	public PojoBranchLoader getPojoBranchLoader() {
	   return (PojoBranchLoader) this.context.getLoader(PojoBranch.class);	
	}
	public PojoCustomerLoader getPojoCustomerLoader() {
	   return (PojoCustomerLoader) this.context.getLoader(PojoCustomer.class);	
	}
	public PojoDealLoader getPojoDealLoader() {
	   return (PojoDealLoader) this.context.getLoader(PojoDeal.class);	
	}
	public PojoDealAdminLoader getPojoDealAdminLoader() {
	   return (PojoDealAdminLoader) this.context.getLoader(PojoDealAdmin.class);	
	}
	public PojoDealBorrowerLoader getPojoDealBorrowerLoader() {
	   return (PojoDealBorrowerLoader) this.context.getLoader(PojoDealBorrower.class);	
	}
	public PojoFacBorrDetlLoader getPojoFacBorrDetlLoader() {
	   return (PojoFacBorrDetlLoader) this.context.getLoader(PojoFacBorrDetl.class);	
	}
	public PojoFacCommitTrnLoader getPojoFacCommitTrnLoader() {
	   return (PojoFacCommitTrnLoader) this.context.getLoader(PojoFacCommitTrn.class);	
	}
	public PojoFacHostAgrLoader getPojoFacHostAgrLoader() {
	   return (PojoFacHostAgrLoader) this.context.getLoader(PojoFacHostAgr.class);	
	}
	public PojoFacilityLoader getPojoFacilityLoader() {
	   return (PojoFacilityLoader) this.context.getLoader(PojoFacility.class);	
	}
	public PojoFacilityAdminLoader getPojoFacilityAdminLoader() {
	   return (PojoFacilityAdminLoader) this.context.getLoader(PojoFacilityAdmin.class);	
	}
	public PojoFacilityTypeLoader getPojoFacilityTypeLoader() {
	   return (PojoFacilityTypeLoader) this.context.getLoader(PojoFacilityType.class);	
	}
	public PojoFamGlobal3Loader getPojoFamGlobal3Loader() {
	   return (PojoFamGlobal3Loader) this.context.getLoader(PojoFamGlobal3.class);	
	}
	public PojoOstTranLoader getPojoOstTranLoader() {
	   return (PojoOstTranLoader) this.context.getLoader(PojoOstTran.class);	
	}
	public PojoOutstandingLoader getPojoOutstandingLoader() {
	   return (PojoOutstandingLoader) this.context.getLoader(PojoOutstanding.class);	
	}
	public PojoCodeOutstandingTypeLoader getPojoCodeOutstandingTypeLoader() {
	   return (PojoCodeOutstandingTypeLoader) this.context.getLoader(PojoCodeOutstandingType.class);	
	}
	public PojoTimeRegionLoader getPojoTimeRegionLoader() {
	   return (PojoTimeRegionLoader) this.context.getLoader(PojoTimeRegion.class);	
	}
}