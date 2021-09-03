package com.microservice.citizenservice.services;

import java.util.List;

import com.microservice.citizenservice.entity.Citizen;

public interface CitizenService {

	public List<Citizen> getCitizens();
	public Citizen getCitizenById(int id);
	public Citizen addCitizen(Citizen citizen);
	public Citizen updateCitizen(Citizen citizen);
	public void deleteCitizen(int id);
	public List<Citizen> findbyVaccinationCenterId(Integer id);
}
