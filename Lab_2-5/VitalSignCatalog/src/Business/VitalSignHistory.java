/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vivekdalal
 */
public class VitalSignHistory {

    private List<VitalSigns> vitalSignsList;

    public VitalSignHistory() {
        vitalSignsList = new ArrayList<>();
    }

    /**
     * @return the vitalSignsList
     */
    public List<VitalSigns> getVitalSignsList() {
        return vitalSignsList;
    }

    /**
     * @param vitalSignsList the vitalSignsList to set
     */
    public void setVitalSignsList(ArrayList<VitalSigns> vitalSignsList) {
        this.vitalSignsList = vitalSignsList;
    }

    public VitalSigns addVitalSign() {
        VitalSigns vitalSigns = new VitalSigns();
        vitalSignsList.add(vitalSigns);
        return vitalSigns;
    }

    public void deleteVitalSign(VitalSigns vitalSigns) {
        vitalSignsList.remove(vitalSigns);
    }

    public List<VitalSigns> getAbnormalVSList(double maxBP, double minBP) {
        List<VitalSigns> abnormalVSList = new ArrayList<>();

//        vitalSignsList.stream().filter((vs) -> (vs.getBloodPressure() > maxBP || vs.getBloodPressure() < minBP)).forEachOrdered((vs) -> {
//            abnormalVSList.add(vs);
//        });
        for (VitalSigns vs : vitalSignsList) {
            if (vs.getBloodPressure() > maxBP || vs.getBloodPressure() < minBP) {
                abnormalVSList.add(vs);
            }
        }

        return abnormalVSList;
    }
}
