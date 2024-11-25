package com.example.kafkademocrud.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class SimplifiedLicense {
    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    @Id
    private String licenseCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getBinNumber() {
        return binNumber;
    }

    public void setBinNumber(String binNumber) {
        this.binNumber = binNumber;
    }

    private String binNumber;

    public int getPackagesAllowed() {
        return packagesAllowed;
    }

    public void setPackagesAllowed(int packagesAllowed) {
        this.packagesAllowed = packagesAllowed;
    }

    private int packagesAllowed;

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    private LocalDate expirationDate;

    public int getRemainingPackages() {
        return remainingPackages;
    }

    public void setRemainingPackages(int remainingPackages) {
        this.remainingPackages = remainingPackages;
    }

    private int remainingPackages;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    private boolean active;



}