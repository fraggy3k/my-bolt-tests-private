package org.smartdatahub.liq.entity.utils;

import org.apache.commons.lang3.StringUtils;

public enum ColumnDataType {

	CHARACTER, VARCHAR, VARCHAR2, CHAR, DATE, TIMESTAMP, TIME, INTEGER, DECIMAL, SMALLINT, BLOB, UNKOWN;

	public static ColumnDataType fromString(String s) {
		if (StringUtils.isBlank(s)) {
			return UNKOWN;
		}
		s = s.trim().toUpperCase();
		return valueOf(s);
	}

}
