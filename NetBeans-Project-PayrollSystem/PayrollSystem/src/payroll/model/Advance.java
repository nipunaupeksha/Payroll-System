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
public class Advance {
    private String employeeId;
    private String Date;
    private double advanceAmount; 

    public Advance(String employeeId, String Date, double advanceAmount) {
        this.employeeId = employeeId;
        this.Date = Date;
        this.advanceAmount = advanceAmount;
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
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the advanceAmount
     */
    public double getAdvanceAmount() {
        return advanceAmount;
    }

    /**
     * @param advanceAmount the advanceAmount to set
     */
    public void setAdvanceAmount(double advanceAmount) {
        this.advanceAmount = advanceAmount;
    }
}
