package SpringBoot.Controller;


import org.hibernate.engine.jndi.spi.JndiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import SpringBoot.Entity.Doctor;

import java.util.Optional;

@RestController
public class DoctorController {

    @Autowired(required = true)
    private JndiService doctorService;

    @PostMapping("/createDoctorDetails")
    public Doctor createDoctorDetails(@RequestBody Doctor doctor) {
        return ((DoctorController) doctorService).createDoctorDetails(doctor);
    }

    @DeleteMapping("deleteDoctor/{id}")
    public boolean deleteDoctor(@PathVariable("id") int id) {
        ((DoctorController) doctorService).deleteDoctor(id);
        return true;
    }

    @GetMapping("/getDoctorDetails/{id}")
    public Optional<Doctor> getDoctorDetails(@PathVariable("id") int id) {
        return ((DoctorController) doctorService).getDoctorDetails(id);
    }

    @PutMapping("/updateDoctorDetails/{id}")
    public Doctor updateDoctorDetails(@RequestBody Doctor doctor) {
        return ((DoctorController) doctorService).updateDoctorDetails(doctor);
    }

}