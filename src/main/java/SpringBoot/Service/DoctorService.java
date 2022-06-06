package SpringBoot.Service;



import java.util.Optional;

import SpringBoot.Entity.Doctor;

public interface DoctorService {
    Doctor createDoctorDetails(Doctor doctor);
    void deleteDoctor(int id);
    Optional<Doctor> getDoctorDetails (int id);
    Doctor updateDoctorDetails(Doctor doctor);
}