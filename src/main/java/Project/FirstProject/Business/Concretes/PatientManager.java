package Project.FirstProject.Business.Concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.FirstProject.Business.Abstracts.PatientService;
import Project.FirstProject.DataAccess.Abstracts.PatientRepository;
import Project.FirstProject.Entities.Concretes.Patient;

@Service
public class PatientManager implements PatientService{
    private PatientRepository patientRepository;
    
    @Autowired
    public PatientManager(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<Patient> getAll() {
        
        return patientRepository.getAll();
    }
    
}
