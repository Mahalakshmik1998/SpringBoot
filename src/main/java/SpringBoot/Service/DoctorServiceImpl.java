package SpringBoot.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBoot.Entity.Doctor;
import SpringBoot.dao.DoctorRepo;

import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepo doctorRepo;

    @Override
    public Doctor createDoctorDetails(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    @Override
    public void deleteDoctor(int id) {
        doctorRepo.deleteBy_id(id);
        
    }

    @Override
    public Optional<Doctor> getDoctorDetails(int id) {
        return doctorRepo.findBy_id(id);
    }

    @Override
    public Doctor updateDoctorDetails(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

}