/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage;

/**
 *
 * @author vivekdalal
 */
public class Person {

    private DemographicInfo personalInfo;
    private Address address;
    private DriverLicenseInfo driverLicenseInfo;
    private MedicalRecord medicalRecord;
    private AccountInfo accountInfo;

    /**
     * @return the personalInfo
     */
    public DemographicInfo getPersonalInfo() {
        return personalInfo;
    }

    /**
     * @param personalInfo the personalInfo to set
     */
    public void setPersonalInfo(DemographicInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return the driverLicenseInfo
     */
    public DriverLicenseInfo getDriverLicenseInfo() {
        return driverLicenseInfo;
    }

    /**
     * @param driverLicenseInfo the driverLicenseInfo to set
     */
    public void setDriverLicenseInfo(DriverLicenseInfo driverLicenseInfo) {
        this.driverLicenseInfo = driverLicenseInfo;
    }

    /**
     * @return the medicalRecord
     */
    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    /**
     * @param medicalRecord the medicalRecord to set
     */
    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    /**
     * @return the accountInfo
     */
    public AccountInfo getAccountInfo() {
        return accountInfo;
    }

    /**
     * @param accountInfo the accountInfo to set
     */
    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }

}
