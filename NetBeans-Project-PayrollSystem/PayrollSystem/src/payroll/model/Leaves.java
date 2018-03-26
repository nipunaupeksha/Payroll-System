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
public class Leaves {

    private String employeeId;
    private String leaveDate;
    private int noOfDays;
    private String leaveType;

    public Leaves() {
    }

    public Leaves(String employeeId, String leaveDate, int noOfDays, String leaveType) {
        this.employeeId = employeeId;
        this.leaveDate = leaveDate;
        this.noOfDays = noOfDays;
        this.leaveType = leaveType;
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
     * @return the leaveDate
     */
    public String getLeaveDate() {
        return leaveDate;
    }

    /**
     * @param leaveDate the leaveDate to set
     */
    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    /**
     * @return the noOfDays
     */
    public int getNoOfDays() {
        return noOfDays;
    }

    /**
     * @param noOfDays the noOfDays to set
     */
    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    /**
     * @return the leaveType
     */
    public String getLeaveType() {
        return leaveType;
    }

    /**
     * @param leaveType the leaveType to set
     */
    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

}
