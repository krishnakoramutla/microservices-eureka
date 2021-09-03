package com.microservice.citizenservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.citizenservice.entity.Citizen;
import com.microservice.citizenservice.services.CitizenService;

@RestController
public class CitizenController {

	@Autowired
	private CitizenService service;

	@PostMapping("/citizen")
	public Citizen addCitizen(@RequestBody Citizen citizen) {
		return service.addCitizen(citizen);
	}

	@GetMapping("/citizen")
	public List<Citizen> findaallCitizens() {
		List<Citizen> citizens = service.getCitizens();
		return citizens;
	}

	@GetMapping("/citizen/id/{id}")
	public List<Citizen> findCitizensByvaccinationCenterId(@PathVariable Integer id) {
		List<Citizen> citizens = service.findbyVaccinationCenterId(id);
		return citizens;
	}

}
