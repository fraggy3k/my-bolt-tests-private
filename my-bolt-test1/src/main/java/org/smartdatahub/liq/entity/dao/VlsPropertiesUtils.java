package org.smartdatahub.liq.entity.dao;

import javassist.NotFoundException;

public class VlsPropertiesUtils {
	
	public static VlsPropertiesContainer createPropertiesContainer(String fieldNameDb) throws NotFoundException {

		VlsPropertiesContainer container = new VlsPropertiesContainer();

		switch (fieldNameDb) {
		case "CUS_CID_CUST_ID":
//			fieldNameJpa = "cidCustId";
			container.setFieldLength(8);
			container.setHasUniqueConstraint(true);
			break;
		case "CUS_NME_FULL_NAME":
//			fieldNameJpa = "nmeFullName";
			container.setFieldLength(140);
			container.setTrimString(false);
			container.setLikeSearchPossible(true);
			break;
		case "CUS_NME_SHORT_NAME":
//			fieldNameJpa = "nmeShortName";
			container.setFieldLength(30);
			container.setLikeSearchPossible(true);
			break;
		case "CUS_XID_CUST_ID":
//			fieldNameJpa = "xidCustId";
			container.setFieldLength(15);
			break;
		default:
			throw new NotFoundException("No match found for DB field : " + fieldNameDb);
		}
		
		return container;
}


}
