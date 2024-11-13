package org.smartdatahub.liq.entity.dao;

public class VlsPropertiesContainer {
	
//	String fieldNameJpa;
	int fieldLength;
	boolean isTrimString = true;
	boolean hasUniqueConstraint = false;
	boolean isLikeSearchPossible = false;
	
	
	public int getFieldLength() {
		return fieldLength;
	}
	public void setFieldLength(int fieldLength) {
		this.fieldLength = fieldLength;
	}
	public boolean isTrimString() {
		return isTrimString;
	}
	public void setTrimString(boolean isTrimString) {
		this.isTrimString = isTrimString;
	}
	public boolean isHasUniqueConstraint() {
		return hasUniqueConstraint;
	}
	public void setHasUniqueConstraint(boolean hasUniqueConstraint) {
		this.hasUniqueConstraint = hasUniqueConstraint;
	}
	public boolean isLikeSearchPossible() {
		return isLikeSearchPossible;
	}
	public void setLikeSearchPossible(boolean isLikeSearchPossible) {
		this.isLikeSearchPossible = isLikeSearchPossible;
	}

}
