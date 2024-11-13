package org.smartdatahub.liq.api.entity.info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder="")
public class InfoCustomer {

	@XmlID
	private String id;
	
	private String idExternalId;
	private String nmeInternalLong;
	private String nmeInternalShort;
	private boolean isBranchCustomer;
	private String infoConcatenated;
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdExternalId() {
		return idExternalId;
	}
	public void setIdExternalId(String idExternalId) {
		this.idExternalId = idExternalId;
	}
	public String getNmeInternalLong() {
		return nmeInternalLong;
	}
	public void setNmeInternalLong(String nmeInternalLong) {
		this.nmeInternalLong = nmeInternalLong;
	}
	public String getNmeInternalShort() {
		return nmeInternalShort;
	}
	public void setNmeInternalShort(String nmeInternalShort) {
		this.nmeInternalShort = nmeInternalShort;
	}
	public boolean isBranchCustomer() {
		return isBranchCustomer;
	}
	public void setBranchCustomer(boolean isBranchCustomer) {
		this.isBranchCustomer = isBranchCustomer;
	}
	public String getInfoConcatenated() {
		return infoConcatenated;
	}
	public void setInfoConcatenated(String infoConcatenated) {
		this.infoConcatenated = infoConcatenated;
	}
	
	// TODO later find a model for noting how other entities call the same customers
//	private String idAgentId;
//	private String nmeAgentLong;
//	private String nmeAgentShort;
//	private String idBorrowerId;
//	private String nmeBorrowerLong;
//	private String nmeBorrowerShort;
	
	
	
	
}
