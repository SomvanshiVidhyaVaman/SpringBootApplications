package com.mahagan.SpringbootApplication.controller;

import com.mahagan.SpringbootApplication.domain.Patient;
import com.mahagan.SpringbootApplication.service.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    PatientServiceImpl patientService;
    @PostMapping("/patient")
    public Patient savePatient(@RequestBody Patient patient){
        return patientService.savePatient(patient);
    }

    @GetMapping("/patient")
    public List<Patient>  fecthPatientList(){
        return patientService.fecthPatientList();
    }
    @PutMapping("/patient{id}")
    public Patient updatepatientById(@RequestBody Patient patient, @PathVariable("id") int patient_Id){
        return patientService.updatePatient(patient,patient_Id);
    }
    @DeleteMapping("/patient/{id}")
    public String deletePatientById(@PathVariable("id") int patient_Id){
        patientService.deletePatientById(patient_Id);
        return "Resource delete successfully";
    }

}
