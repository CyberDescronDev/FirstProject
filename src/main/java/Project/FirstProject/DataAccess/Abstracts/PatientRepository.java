package Project.FirstProject.DataAccess.Abstracts;

import java.util.List;



import Project.FirstProject.Entities.Concretes.Patient;

public interface PatientRepository {
    List<Patient> getAll();
}
