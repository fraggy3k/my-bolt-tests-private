package org.smartdatahub.liq.entity.fields.enums;

public enum VlsCashflowDbCols {

	CFL_RID_TRANS("CHAR", 8, "ridTrans"), CFL_CDE_TRAN_TYPE("CHAR", 3, "cdeTranType");

	private int dbLength;
	private String dbDataType;
	private String jpaField;

	private VlsCashflowDbCols(String dbDataType, int dbLength, String jpaField) {
		this.dbDataType = dbDataType;
		this.dbLength = dbLength;
		this.jpaField = jpaField;
	}

	public static final String tableId = "CFL";
	public static final String tableName = "VLS_CASHFLOW";

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
