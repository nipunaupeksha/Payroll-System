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
public class Employee {

    private String employeeId;
    private String firstName;
    private String secondName;
    private String nic;
    private String dob;
    private String address;
    private String gender;
    private String maritialStatus;
    private String mobileNum;
    private String landNum;
    private String email;
    private String joiningDate;
    private String departmentId;
    private String gradeId;
    private String roleId;
    private double basicSalary;
    private String bank;
    private String accNum;
    private int transportType;

    public Employee() {
    }

    public Employee(String employeeId, String firstName, String secondName, String nic, String dob, String address, String gender, String maritialStatus, String mobileNum, String landNum, String email, String joiningDate, String departmentId, String gradeId, String roleId, double basicSalary, String bank, String accNum,int transportType) {
       this.employeeId=employeeId;
       this.firstName=firstName;
       this.secondName=secondName;
       this.nic=nic;
       this.dob=dob;
       this.address=address;
       this.gender=gender;
       this.maritialStatus=maritialStatus;
       this.mobileNum=mobileNum;
       this.landNum=landNum;
       this.email=email;
       this.joiningDate=joiningDate;
       this.departmentId=departmentId;
       this.gradeId=gradeId;
       this.roleId=roleId;
       this.basicSalary=basicSalary;
       this.bank=bank;
       this.accNum=accNum;
       this.transportType=transportType;
    }
    
    public Employee(String employeeId, String firstName,String secondName,String address, String maritialStatus, String mobileNum, String landNum, String email, String departmentId, String gradeId, String roleId, double basicSalary, String bank, String accNum,int transportType) {
        this.employeeId=employeeId;
        this.firstName=firstName;
        this.secondName=secondName;
        this.address=address;
        this.maritialStatus=maritialStatus;
        this.mobileNum=mobileNum;
        this.landNum=landNum;
        this.email=email;
        this.departmentId=departmentId;
        this.gradeId=gradeId;
        this.roleId=roleId;
        this.basicSalary=basicSalary;
        this.bank=bank;
        this.accNum=accNum;
        this.transportType=transportType;
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
     * @return the secondName
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * @param secondName the secondName to set
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the maritialStatus
     */
    public String getMaritialStatus() {
        return maritialStatus;
    }

    /**
     * @param maritialStatus the maritialStatus to set
     */
    public void setMaritialStatus(String maritialStatus) {
        this.maritialStatus = maritialStatus;
    }

    /**
     * @return the mobileNum
     */
    public String getMobileNum() {
        return mobileNum;
    }

    /**
     * @param mobileNum the mobileNum to set
     */
    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    /**
     * @return the landNum
     */
    public String getLandNum() {
        return landNum;
    }

    /**
     * @param landNum the landNum to set
     */
    public void setLandNum(String landNum) {
        this.landNum = landNum;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the joiningDate
     */
    public String getJoiningDate() {
        return joiningDate;
    }

    /**
     * @param joiningDate the joiningDate to set
     */
    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
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
     * @return the gradeId
     */
    public String getGradeId() {
        return gradeId;
    }

    /**
     * @param gradeId the gradeId to set
     */
    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    /**
     * @return the roleId
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * @param roleId the roleId to set
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * @return the basicSalary
     */
    public double getBasicSalary() {
        return basicSalary;
    }

    /**
     * @param basicSalary the basicSalary to set
     */
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    /**
     * @return the bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * @param bank the bank to set
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * @return the accNum
     */
    public String getAccNum() {
        return accNum;
    }

    /**
     * @param accNum the accNum to set
     */
    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    /**
     * @return the transportType
     */
    public int getTransportType() {
        return transportType;
    }

    /**
     * @param transportType the transportType to set
     */
    public void setTransportType(int transportType) {
        this.transportType = transportType;
    }

}
