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
public class Settings {

    private double epfRate;
    private double etfRate;
    private double taxRate;
    private double damageRate;
    private double loanRate;
    private double yearlyIncome;
    private double attendanceInsentive1;
    private double attendanceInsentive2;
    private double attendanceInsentive3;
    private int maxHalfDayLeaves;
    private int maxCasualLeave;
    private int maxMedicalLeaves;
    private int maxVacationLeaves;
    private int maxPregnantLeaves;
    private int allMaximumLeaves;

    public Settings() {
    }

    public Settings(double epfRate, double etfRate, double taxRate, double damageRate, double loanRate, double yearlyIncome, double attendanceInsentive1, double attendanceInsentive2, double attendanceInsentive3, int maxHalfDayLeaves, int maxCasualLeave, int maxMedicalLeaves, int maxVacationLeaves, int maxPregnantLeaves, int allMaximumLeaves) {
        this.epfRate = epfRate;
        this.etfRate = etfRate;
        this.taxRate = taxRate;
        this.damageRate = damageRate;
        this.loanRate = loanRate;
        this.yearlyIncome = yearlyIncome;
        this.attendanceInsentive1 = attendanceInsentive1;
        this.attendanceInsentive2 = attendanceInsentive2;
        this.attendanceInsentive3 = attendanceInsentive3;
        this.maxHalfDayLeaves = maxHalfDayLeaves;
        this.maxCasualLeave = maxCasualLeave;
        this.maxMedicalLeaves = maxMedicalLeaves;
        this.maxVacationLeaves = maxVacationLeaves;
        this.maxPregnantLeaves = maxPregnantLeaves;
        this.allMaximumLeaves = allMaximumLeaves;
    }

    /**
     * @return the epfRate
     */
    public double getEpfRate() {
        return epfRate;
    }

    /**
     * @param epfRate the epfRate to set
     */
    public void setEpfRate(double epfRate) {
        this.epfRate = epfRate;
    }

    /**
     * @return the etfRate
     */
    public double getEtfRate() {
        return etfRate;
    }

    /**
     * @param etfRate the etfRate to set
     */
    public void setEtfRate(double etfRate) {
        this.etfRate = etfRate;
    }

    /**
     * @return the taxRate
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * @param taxRate the taxRate to set
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * @return the damageRate
     */
    public double getDamageRate() {
        return damageRate;
    }

    /**
     * @param damageRate the damageRate to set
     */
    public void setDamageRate(double damageRate) {
        this.damageRate = damageRate;
    }

    /**
     * @return the loanRate
     */
    public double getLoanRate() {
        return loanRate;
    }

    /**
     * @param loanRate the loanRate to set
     */
    public void setLoanRate(double loanRate) {
        this.loanRate = loanRate;
    }

    /**
     * @return the yearlyIncome
     */
    public double getYearlyIncome() {
        return yearlyIncome;
    }

    /**
     * @param yearlyIncome the yearlyIncome to set
     */
    public void setYearlyIncome(double yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    /**
     * @return the attendanceInsentive1
     */
    public double getAttendanceInsentive1() {
        return attendanceInsentive1;
    }

    /**
     * @param attendanceInsentive1 the attendanceInsentive1 to set
     */
    public void setAttendanceInsentive1(double attendanceInsentive1) {
        this.attendanceInsentive1 = attendanceInsentive1;
    }

    /**
     * @return the attendanceInsentive2
     */
    public double getAttendanceInsentive2() {
        return attendanceInsentive2;
    }

    /**
     * @param attendanceInsentive2 the attendanceInsentive2 to set
     */
    public void setAttendanceInsentive2(double attendanceInsentive2) {
        this.attendanceInsentive2 = attendanceInsentive2;
    }

    /**
     * @return the attendanceInsentive3
     */
    public double getAttendanceInsentive3() {
        return attendanceInsentive3;
    }

    /**
     * @param attendanceInsentive3 the attendanceInsentive3 to set
     */
    public void setAttendanceInsentive3(double attendanceInsentive3) {
        this.attendanceInsentive3 = attendanceInsentive3;
    }

    /**
     * @return the maxHalfDayLeaves
     */
    public int getMaxHalfDayLeaves() {
        return maxHalfDayLeaves;
    }

    /**
     * @param maxHalfDayLeaves the maxHalfDayLeaves to set
     */
    public void setMaxHalfDayLeaves(int maxHalfDayLeaves) {
        this.maxHalfDayLeaves = maxHalfDayLeaves;
    }

    /**
     * @return the maxCasualLeave
     */
    public int getMaxCasualLeave() {
        return maxCasualLeave;
    }

    /**
     * @param maxCasualLeave the maxCasualLeave to set
     */
    public void setMaxCasualLeave(int maxCasualLeave) {
        this.maxCasualLeave = maxCasualLeave;
    }

    /**
     * @return the maxMedicalLeaves
     */
    public int getMaxMedicalLeaves() {
        return maxMedicalLeaves;
    }

    /**
     * @param maxMedicalLeaves the maxMedicalLeaves to set
     */
    public void setMaxMedicalLeaves(int maxMedicalLeaves) {
        this.maxMedicalLeaves = maxMedicalLeaves;
    }

    /**
     * @return the maxVacationLeaves
     */
    public int getMaxVacationLeaves() {
        return maxVacationLeaves;
    }

    /**
     * @param maxVacationLeaves the maxVacationLeaves to set
     */
    public void setMaxVacationLeaves(int maxVacationLeaves) {
        this.maxVacationLeaves = maxVacationLeaves;
    }

    /**
     * @return the maxPregnantLeaves
     */
    public int getMaxPregnantLeaves() {
        return maxPregnantLeaves;
    }

    /**
     * @param maxPregnantLeaves the maxPregnantLeaves to set
     */
    public void setMaxPregnantLeaves(int maxPregnantLeaves) {
        this.maxPregnantLeaves = maxPregnantLeaves;
    }

    /**
     * @return the allMaximumLeaves
     */
    public int getAllMaximumLeaves() {
        return allMaximumLeaves;
    }

    /**
     * @param allMaximumLeaves the allMaximumLeaves to set
     */
    public void setAllMaximumLeaves(int allMaximumLeaves) {
        this.allMaximumLeaves = allMaximumLeaves;
    }

}
