package SpringBoot.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import SpringBoot.Entity.Doctor;

import javax.transaction.Transactional;
import java.util.Optional;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
    Optional<Doctor> findBy_id(int id);

    @Transactional
    void deleteBy_id(int id);
}