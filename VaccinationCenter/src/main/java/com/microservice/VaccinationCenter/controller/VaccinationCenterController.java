package com.microservice.VaccinationCenter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.VaccinationCenter.entity.VaccinationCenter;
import com.microservice.VaccinationCenter.model.Citizen;
import com.microservice.VaccinationCenter.model.Response;
import com.microservice.VaccinationCenter.repository.VaccinationCenterRepo;

@RestController
@RequestMapping("/vaccinationCenter")
public class VaccinationCenterController {

	@Autowired
	private VaccinationCenterRepo repo;
	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/add")
	public VaccinationCenter addCenter(@RequestBody VaccinationCenter center) {
		return repo.save(center);

	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Response> getAllDataBasedOnCenterId(@PathVariable Integer id) {
		Response response = new Response();
		// get vaccination center details
		VaccinationCenter center = repo.findById(id).get();
		response.setCenter(center);

		// get the citizen details
		List<Citizen> listCitizens = restTemplate.getForObject("http://CITIZEN-SERVICE/citizen/id/" + id, List.class);
		response.setCitizens(listCitizens);
		return new ResponseEntity<Response>(response,HttpStatus.OK);

	}
}
