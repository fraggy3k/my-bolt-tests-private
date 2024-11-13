package org.smartdatahub.liq.api.entity.info;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;

import org.smartdatahub.liq.model.util.LiqUtilsDeal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder="")
public class InfoDeal {
	
	@XmlID
	private String id;
	
	private LiqUtilsDeal.AgencyType agencyType;
	private InfoCustomer InfoCusDealAgent;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	public InfoCustomer getInfoCusDealAgent() {
		return InfoCusDealAgent;
	}
	public void setInfoCusDealAgent(InfoCustomer infoCusDealAgent) {
		InfoCusDealAgent = infoCusDealAgent;
	}
	public LiqUtilsDeal.AgencyType getAgencyType() {
		return agencyType;
	}
	public void setAgencyType(LiqUtilsDeal.AgencyType agencyType) {
		this.agencyType = agencyType;
	}
	
	

}
