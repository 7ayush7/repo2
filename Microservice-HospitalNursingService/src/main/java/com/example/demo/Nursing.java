package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nursing {

	@Id
	private int patientId;
	private String wardNo;
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getWardNo() {
		return wardNo;
	}
	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}
}
