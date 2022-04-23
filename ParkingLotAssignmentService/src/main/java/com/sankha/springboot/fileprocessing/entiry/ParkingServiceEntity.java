package com.sankha.springboot.fileprocessing.entiry;

public class ParkingServiceEntity {
	private Long slotid;
	private String slotName;
	private boolean status;
	private String acknowledgement;
	
	public ParkingServiceEntity() {
		
	}
	
	public ParkingServiceEntity(String slotName, boolean status, String acknowledgement) {
		super();
		this.slotName = slotName;
		this.status = status;
		this.acknowledgement = acknowledgement;
	}
	public Long getSlotid() {
		return slotid;
	}
	
	public String getSlotName() {
		return slotName;
	}
	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getAcknowledgement() {
		return acknowledgement;
	}
	public void setAcknowledgement(String acknowledgement) {
		this.acknowledgement = acknowledgement;
	}
	
	

}
