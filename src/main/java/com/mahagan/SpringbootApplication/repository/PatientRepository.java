package com.mahagan.SpringbootApplication.repository;

import com.mahagan.SpringbootApplication.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
}
