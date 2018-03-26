/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.model;

/**
 *
 * @author ASUS
 */
public class Grade {

    private String garadeId;
    private String gradeName;
    private double noPayRate;
    private double normalOtAmount;
    private double weekendOtAmount;
    private double maxLoanAmount;
    private double maxAdvanceRate;
    private double vehicleAllowences;

    public Grade() {
    }

    public Grade(String garadeId, String gradeName, double noPayRate, double normalOtAmount, double weekendOtAmount, double maxLoanAmount, double maxAdvanceRate, double vehicleAllowences) {
        this.garadeId = garadeId;
        this.gradeName = gradeName;
        this.noPayRate = noPayRate;
        this.normalOtAmount = normalOtAmount;
        this.weekendOtAmount = weekendOtAmount;
        this.maxLoanAmount = maxLoanAmount;
        this.maxAdvanceRate = maxAdvanceRate;
        this.vehicleAllowences = vehicleAllowences;
    }

    /**
     * @return the garadeId
     */
    public String getGaradeId() {
        return garadeId;
    }

    /**
     * @param garadeId the garadeId to set
     */
    public void setGaradeId(String garadeId) {
        this.garadeId = garadeId;
    }

    /**
     * @return the gradeName
     */
    public String getGradeName() {
        return gradeName;
    }

    /**
     * @param gradeName the gradeName to set
     */
    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    /**
     * @return the noPayRate
     */
    public double getNoPayRate() {
        return noPayRate;
    }

    /**
     * @param noPayRate the noPayRate to set
     */
    public void setNoPayRate(double noPayRate) {
        this.noPayRate = noPayRate;
    }

    /**
     * @return the normalOtAmount
     */
    public double getNormalOtAmount() {
        return normalOtAmount;
    }

    /**
     * @param normalOtAmount the normalOtAmount to set
     */
    public void setNormalOtAmount(double normalOtAmount) {
        this.normalOtAmount = normalOtAmount;
    }

    /**
     * @return the weekendOtAmount
     */
    public double getWeekendOtAmount() {
        return weekendOtAmount;
    }

    /**
     * @param weekendOtAmount the weekendOtAmount to set
     */
    public void setWeekendOtAmount(double weekendOtAmount) {
        this.weekendOtAmount = weekendOtAmount;
    }

    /**
     * @return the maxLoanAmount
     */
    public double getMaxLoanAmount() {
        return maxLoanAmount;
    }

    /**
     * @param maxLoanAmount the maxLoanAmount to set
     */
    public void setMaxLoanAmount(double maxLoanAmount) {
        this.maxLoanAmount = maxLoanAmount;
    }

    /**
     * @return the maxAdvanceRate
     */
    public double getMaxAdvanceRate() {
        return maxAdvanceRate;
    }

    /**
     * @param maxAdvanceRate the maxAdvanceRate to set
     */
    public void setMaxAdvanceRate(double maxAdvanceRate) {
        this.maxAdvanceRate = maxAdvanceRate;
    }

    /**
     * @return the vehicleAllowences
     */
    public double getVehicleAllowences() {
        return vehicleAllowences;
    }

    /**
     * @param vehicleAllowences the vehicleAllowences to set
     */
    public void setVehicleAllowences(double vehicleAllowences) {
        this.vehicleAllowences = vehicleAllowences;
    }

}
