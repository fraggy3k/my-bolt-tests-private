package org.smartdatahub.liq.context;
import java.util.Date;

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
import org.smartdatahub.liq.entity.snapshot.SnapshotInfo;
import org.smartdatahub.liq.entity.snapshot.SnapshotOstTran;
import org.smartdatahub.liq.entity.snapshot.SnapshotOutstanding;
import org.smartdatahub.liq.entity.snapshot.SnapshotTimeRegion;

public class SnapshotContext extends AbstractContext { 

	private final SnapshotLoaderUtils loaderUtils = new SnapshotLoaderUtils(this);
	private final String snapshotId;
	private final SnapshotInfo snapshotInfo;
	
	public SnapshotContext (String snapshotId) {
		super();
		this.snapshotId = snapshotId;
		this.snapshotInfo = new SnapshotInfo(getSnapshotId());
		this.snapshotInfo.setCdeSystemOriginOfData("LIQ");
		this.snapshotInfo.setCdeSystemSource("VLS");
		this.snapshotInfo.setCdeSystemTarget("SNP");
		this.snapshotInfo.setCreationTime(new Date());
	}
	
	public String getSnapshotId() {
		return snapshotId;
	}
		
	@Override
	protected void initLoaders () {
		addLoader(SnapshotCodeBank.class);	
		addLoader(SnapshotBranch.class);	
		addLoader(SnapshotCustomer.class);	
		addLoader(SnapshotDeal.class);	
		addLoader(SnapshotDealAdmin.class);	
		addLoader(SnapshotDealBorrower.class);	
		addLoader(SnapshotFacBorrDetl.class);	
		addLoader(SnapshotFacCommitTrn.class);	
		addLoader(SnapshotFacHostAgr.class);	
		addLoader(SnapshotFacility.class);	
		addLoader(SnapshotFacilityAdmin.class);	
		addLoader(SnapshotFacilityType.class);	
		addLoader(SnapshotFamGlobal3.class);	
		addLoader(SnapshotOstTran.class);	
		addLoader(SnapshotOutstanding.class);	
		addLoader(SnapshotCodeOutstandingType.class);	
		addLoader(SnapshotTimeRegion.class);	
	}	
	
	@Override
	public SnapshotLoaderUtils getLoaderUtils() {	
		return loaderUtils;
	}	
	
	public SnapshotInfo getSnapshotInfo() {
		return this.snapshotInfo;
	}
}