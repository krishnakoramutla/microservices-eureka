package com.microservice.citizenservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.microservice.citizenservice.entity.Citizen;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Integer> {

	@Query("SELECT c from Citizen c where c.vaccinationCenterId=?1" )
	public List<Citizen> findbyVaccinationCenterId(Integer vaccinationCenterId);

}
