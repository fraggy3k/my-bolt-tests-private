package org.smartdatahub.liq.entity.fields.enums;

public enum VlsCustomerDbCols {

	CUS_CID_CUST_ID("CHAR", 8, "cidCustId"), CUS_NME_FULL_NAME("VARCHAR2", 140, "nmeFullName"), CUS_NME_SHORT_NAME("CHAR", 30, "nmeShortName"), CUS_XID_CUST_ID("CHAR", 15, "xidCustId");

	private int dbLength;
	private String dbDataType;
	private String jpaField;

	private VlsCustomerDbCols(String dbDataType, int dbLength, String jpaField) {
		this.dbDataType = dbDataType;
		this.dbLength = dbLength;
		this.jpaField = jpaField;
	}

	public static final String tableId = "CUS";
	public static final String tableName = "VLS_CUSTOMER";

	public int getDbLength() {
		return dbLength;
	}
	public String getDbDataType() {
		return dbDataType;
	}
	public String getJpaField() {
		return jpaField;
	}

}
