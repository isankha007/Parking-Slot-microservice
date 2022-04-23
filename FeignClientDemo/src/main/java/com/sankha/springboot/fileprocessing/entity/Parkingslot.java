package com.sankha.springboot.fileprocessing.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parkingslot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long slotid;
	private String slotName;
	private boolean status;
	
	public Parkingslot() {
		
	}
	
	public Parkingslot(String slotName, boolean status) {
		super();
		this.slotName = slotName;
		this.status = status;
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
	
}
