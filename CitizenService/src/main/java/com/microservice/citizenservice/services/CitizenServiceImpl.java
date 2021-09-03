package com.microservice.citizenservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.citizenservice.entity.Citizen;
import com.microservice.citizenservice.repository.CitizenRepository;
@Service
public class CitizenServiceImpl implements CitizenService {

	@Autowired
	CitizenRepository repository;
	
	@Override
	public List<Citizen> getCitizens() {
		List<Citizen> citizens=repository.findAll();
		return citizens;
		
	}

	@Override
	public Citizen getCitizenById(int id) {
		Optional<Citizen> optionalCitizen=repository.findById(id);
		Citizen citizen=null;
		if (optionalCitizen.isPresent()) {
			citizen=optionalCitizen.get();
		}
		return citizen;
	}

	@Override
	public Citizen addCitizen(Citizen citizen) {
		return repository.save(citizen);
	}

	@Override
	public Citizen updateCitizen(Citizen citizen) {
		return repository.save(citizen);
	}

	@Override
	public void deleteCitizen(int id) {
	
		repository.deleteById(id);
		
	}

	@Override
	public List<Citizen> findbyVaccinationCenterId(Integer id) {
		List<Citizen> citizens=repository.findbyVaccinationCenterId(id);
		return citizens;
	}

}
