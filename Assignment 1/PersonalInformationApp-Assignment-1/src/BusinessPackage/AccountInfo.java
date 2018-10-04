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
public class AccountInfo {
    
    private String bankName;
    private String routingNum;
    private String acctNum;
    private double acctBal;
    private String acctTyp;

    /**
     * @return the bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * @param aBankName the bankName to set
     */
    public void setBankName(String aBankName) {
        bankName = aBankName;
    }

    /**
     * @return the routingNum
     */
    public String getRoutingNum() {
        return routingNum;
    }

    /**
     * @param aRoutingNum the routingNum to set
     */
    public void setRoutingNum(String aRoutingNum) {
        routingNum = aRoutingNum;
    }

    /**
     * @return the acctNum
     */
    public String getAcctNum() {
        return acctNum;
    }

    /**
     * @param aAcctNum the acctNum to set
     */
    public void setAcctNum(String aAcctNum) {
        acctNum = aAcctNum;
    }

    /**
     * @return the acctBal
     */
    public double getAcctBal() {
        return acctBal;
    }

    /**
     * @param aAcctBal the acctBal to set
     */
    public void setAcctBal(double aAcctBal) {
        acctBal = aAcctBal;
    }

    /**
     * @return the acctTyp
     */
    public String getAcctTyp() {
        return acctTyp;
    }

    /**
     * @param aAcctTyp the acctTyp to set
     */
    public void setAcctTyp(String aAcctTyp) {
        acctTyp = aAcctTyp;
    }
    
    
}
