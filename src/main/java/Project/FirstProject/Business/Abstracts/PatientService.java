package Project.FirstProject.Business.Abstracts;

import java.util.List;

import Project.FirstProject.Entities.Concretes.Patient;

public interface PatientService {
    List<Patient> getAll();
}
