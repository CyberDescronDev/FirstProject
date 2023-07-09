package Project.FirstProject.WepAPI.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import Project.FirstProject.Business.Abstracts.PatientService;
import Project.FirstProject.Entities.Concretes.Patient;

@RestController
@RequestMapping("/api/patients")
public class PatientsController{
  
    private PatientService patientService;

    @Autowired
    public PatientsController(PatientService patientService) {
        this.patientService = patientService;
    }
    @GetMapping("/getAll")
    public List<Patient> getAll(){
        return patientService.getAll();
    }
    
    
}
