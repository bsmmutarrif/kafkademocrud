package com.example.kafkademocrud.repository;


import com.example.kafkademocrud.entity.SimplifiedLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimplifiedLicenseRepository extends JpaRepository<SimplifiedLicense, String> {
    // Additional query methods (if needed) can be added here
}
