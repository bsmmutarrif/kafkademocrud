package com.example.kafkademocrud.repository;

import com.example.kafkademocrud.entity.LicenseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LicenseTypeRepository extends
        JpaRepository<LicenseType, String> {
    Optional<LicenseType> findByLicenseTypeCodeAndActiveTrue(String licenseTypeCode);

}
