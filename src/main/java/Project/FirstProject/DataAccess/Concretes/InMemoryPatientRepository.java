package Project.FirstProject.DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Project.FirstProject.DataAccess.Abstracts.PatientRepository;
import Project.FirstProject.Entities.Concretes.Patient;
@Repository
public class InMemoryPatientRepository implements PatientRepository{

    List<Patient> patients;

    public InMemoryPatientRepository(){
        patients = new ArrayList<Patient>();
        patients.add(new Patient(1, null, null, null));
        patients.add(new Patient(2, null, null, null));
        patients.add(new Patient(3, null, null, null));
        patients.add(new Patient(4, null, null, null));
        patients.add(new Patient(5, null, null, null));
    }

    @Override
    public List<Patient> getAll() {
        
        return patients;
    }

}