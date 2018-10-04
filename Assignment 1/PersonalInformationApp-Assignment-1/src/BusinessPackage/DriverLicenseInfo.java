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
public class DriverLicenseInfo {

    private String licenseNum;
    private String dateIssued;
    private String dateExpiry;
    private String bloodTyp;
    private String imagePathOnDisc; //need to figure this out

    /**
     * @return the licenseNum
     */
    public String getLicenseNum() {
        return licenseNum;
    }

    /**
     * @param licenseNum the licenseNum to set
     */
    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    /**
     * @return the dateIssued
     */
    public String getDateIssued() {
        return dateIssued;
    }

    /**
     * @param dateIssued the dateIssued to set
     */
    public void setDateIssued(String dateIssued) {
        this.dateIssued = dateIssued;
    }

    /**
     * @return the dateExpiry
     */
    public String getDateExpiry() {
        return dateExpiry;
    }

    /**
     * @param dateExpiry the dateExpiry to set
     */
    public void setDateExpiry(String dateExpiry) {
        this.dateExpiry = dateExpiry;
    }

    /**
     * @return the bloodTyp
     */
    public String getBloodTyp() {
        return bloodTyp;
    }

    /**
     * @param bloodTyp the bloodTyp to set
     */
    public void setBloodTyp(String bloodTyp) {
        this.bloodTyp = bloodTyp;
    }

    /**
     * @return the imagePathOnDisc
     */
    public String getImagePathOnDisc() {
        return imagePathOnDisc;
    }

    /**
     * @param imagePathOnDisc the imagePathOnDisc to set
     */
    public void setImagePathOnDisc(String imagePathOnDisc) {
        this.imagePathOnDisc = imagePathOnDisc;
    }

}
