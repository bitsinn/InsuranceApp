package com.insurance.application.incuranceApp.repositories;

import com.insurance.application.incuranceApp.modules.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface insuranceRepository extends JpaRepository<Insurance, Long> {
    List<Insurance> findByFirstName(String firstName);
    List<Insurance> findByLastName(String firstName);

}
