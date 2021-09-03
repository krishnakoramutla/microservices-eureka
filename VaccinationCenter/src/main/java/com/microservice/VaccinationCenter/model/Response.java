package com.microservice.VaccinationCenter.model;

import java.util.List;

import com.microservice.VaccinationCenter.entity.VaccinationCenter;

public class Response {
	
	private VaccinationCenter center;
	private List<Citizen> citizens;
	
	public Response() {}
	
	public Response(VaccinationCenter center, List<Citizen> citizens) {
		this.center = center;
		this.citizens = citizens;
	}
	public VaccinationCenter getCenter() {
		return center;
	}
	public void setCenter(VaccinationCenter center) {
		this.center = center;
	}
	public List<Citizen> getCitizens() {
		return citizens;
	}
	public void setCitizens(List<Citizen> citizens) {
		this.citizens = citizens;
	}
	@Override
	public String toString() {
		return "Response [center=" + center + ", citizens=" + citizens + "]";
	}
	
	

}
