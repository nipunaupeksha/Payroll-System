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
public class Loan {

    private String loanId;
    private String date;
    private String employeeId;
    private String description;
    private double loanAmount;
    private double monthlyInstallment;
    private int timePeriod;
    private String dueDate;
    private String guarantor1;
    private String guarantor2;

    public Loan() {
    }

    public Loan(String loanId, String date, String employeeId, String description, double loanAmount, double monthlyInstallment, int timePeriod, String dueDate, String guarantor1, String guarantor2) {
        this.loanId = loanId;
        this.date = date;
        this.employeeId = employeeId;
        this.description = description;
        this.loanAmount = loanAmount;
        this.monthlyInstallment = monthlyInstallment;
        this.timePeriod = timePeriod;
        this.dueDate = dueDate;
        this.guarantor1 = guarantor1;
        this.guarantor2 = guarantor2;
    }

    /**
     * @return the loanId
     */
    public String getLoanId() {
        return loanId;
    }

    /**
     * @param loanId the loanId to set
     */
    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the employeeId
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the loanAmount
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * @param loanAmount the loanAmount to set
     */
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * @return the monthlyInstallment
     */
    public double getMonthlyInstallment() {
        return monthlyInstallment;
    }

    /**
     * @param monthlyInstallment the monthlyInstallment to set
     */
    public void setMonthlyInstallment(double monthlyInstallment) {
        this.monthlyInstallment = monthlyInstallment;
    }

    /**
     * @return the timePeriod
     */
    public int getTimePeriod() {
        return timePeriod;
    }

    /**
     * @param timePeriod the timePeriod to set
     */
    public void setTimePeriod(int timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * @return the dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the guarantor1
     */
    public String getGuarantor1() {
        return guarantor1;
    }

    /**
     * @param guarantor1 the guarantor1 to set
     */
    public void setGuarantor1(String guarantor1) {
        this.guarantor1 = guarantor1;
    }

    /**
     * @return the guarantor2
     */
    public String getGuarantor2() {
        return guarantor2;
    }

    /**
     * @param guarantor2 the guarantor2 to set
     */
    public void setGuarantor2(String guarantor2) {
        this.guarantor2 = guarantor2;
    }

}
