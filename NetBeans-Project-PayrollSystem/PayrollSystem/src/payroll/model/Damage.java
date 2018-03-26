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
public class Damage {

    private String employeeId;
    private String date;
    private String departmentId;
    private String description;
    private double damageCost;
    private double monthlyDeduction;
    private int timePeriod;
    private String dueDate;

    public Damage() {
    }

    public Damage(String employeeId, String date, String departmentId, String description, double damageCost, double monthlyDeduction, int timePeriod, String dueDate) {
        this.employeeId = employeeId;
        this.date = date;
        this.departmentId = departmentId;
        this.description = description;
        this.damageCost = damageCost;
        this.monthlyDeduction = monthlyDeduction;
        this.timePeriod = timePeriod;
        this.dueDate = dueDate;
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
     * @return the departmentId
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * @param departmentId the departmentId to set
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
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
     * @return the damageCost
     */
    public double getDamageCost() {
        return damageCost;
    }

    /**
     * @param damageCost the damageCost to set
     */
    public void setDamageCost(double damageCost) {
        this.damageCost = damageCost;
    }

    /**
     * @return the monthlyDeduction
     */
    public double getMonthlyDeduction() {
        return monthlyDeduction;
    }

    /**
     * @param monthlyDeduction the monthlyDeduction to set
     */
    public void setMonthlyDeduction(double monthlyDeduction) {
        this.monthlyDeduction = monthlyDeduction;
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

}
