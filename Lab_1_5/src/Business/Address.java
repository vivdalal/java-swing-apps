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
public class Address {

    private String addrLn1;
    private String addrLn2;
    private String city;
    private String state;
    private String zipCd;

    /**
     * @return the addrLn1
     */
    public String getAddrLn1() {
        return addrLn1;
    }

    /**
     * @param addrLn1 the addrLn1 to set
     */
    public void setAddrLn1(String addrLn1) {
        this.addrLn1 = addrLn1;
    }

    /**
     * @return the addrLn2
     */
    public String getAddrLn2() {
        return addrLn2;
    }

    /**
     * @param addrLn2 the addrLn2 to set
     */
    public void setAddrLn2(String addrLn2) {
        this.addrLn2 = addrLn2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zipCd
     */
    public String getZipCd() {
        return zipCd;
    }

    /**
     * @param zipCd the zipCd to set
     */
    public void setZipCd(String zipCd) {
        this.zipCd = zipCd;
    }

}
