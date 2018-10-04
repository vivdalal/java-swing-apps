/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author vivekdalal
 */
public class Person {

    private String firstName;
    private String lastName;
    private String dob;
    private String ssn;

    private Address workAddress;
    private Address homeAddress;
    private Address localAddress;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * @param ssn the ssn to set
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * @return the workAddress
     */
    public Address getWorkAddress() {
        return workAddress;
    }

    /**
     * @param workAddress the workAddress to set
     */
    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    /**
     * @return the homeAddress
     */
    public Address getHomeAddress() {
        return homeAddress;
    }

    /**
     * @param homeAddress the homeAddress to set
     */
    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * @return the localAddress
     */
    public Address getLocalAddress() {
        return localAddress;
    }

    /**
     * @param localAddress the locaAddress to set
     */
    public void setLocalAddress(Address localAddress) {
        this.localAddress = localAddress;
    }

}
