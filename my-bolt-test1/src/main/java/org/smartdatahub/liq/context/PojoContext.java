package org.smartdatahub.liq.context;
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

public class PojoContext extends AbstractContext { 

	private PojoLoaderUtils loaderUtils = new PojoLoaderUtils(this);

	public PojoContext () {
		super();
	}
	
	@Override
	protected void initLoaders () {
		addLoader(PojoCodeBank.class);	
		addLoader(PojoBranch.class);	
		addLoader(PojoCustomer.class);	
		addLoader(PojoDeal.class);	
		addLoader(PojoDealAdmin.class);	
		addLoader(PojoDealBorrower.class);	
		addLoader(PojoFacBorrDetl.class);	
		addLoader(PojoFacCommitTrn.class);	
		addLoader(PojoFacHostAgr.class);	
		addLoader(PojoFacility.class);	
		addLoader(PojoFacilityAdmin.class);	
		addLoader(PojoFacilityType.class);	
		addLoader(PojoFamGlobal3.class);	
		addLoader(PojoOstTran.class);	
		addLoader(PojoOutstanding.class);	
		addLoader(PojoCodeOutstandingType.class);	
		addLoader(PojoTimeRegion.class);	
	}	
	
	@Override
	public PojoLoaderUtils getLoaderUtils() {	
		return loaderUtils;
	}	
	
}