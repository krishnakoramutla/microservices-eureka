package com.microservice.VaccinationCenter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vaccination_center")
public class VaccinationCenter {

	@Id
	private int id;
	@Column(name = "center_name")
	private String centerName;
	@Column(name = "center_address")
	private String centerAddress;

	public VaccinationCenter() {
	}

	public VaccinationCenter(int id, String centerName, String centerAddress) {
		super();
		this.id = id;
		this.centerName = centerName;
		this.centerAddress = centerAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterAddress() {
		return centerAddress;
	}

	public void setCenterAddress(String centerAddress) {
		this.centerAddress = centerAddress;
	}

	@Override
	public String toString() {
		return "VaccinationCenter [id=" + id + ", centerName=" + centerName + ", centerAddress=" + centerAddress + "]";
	}

}
