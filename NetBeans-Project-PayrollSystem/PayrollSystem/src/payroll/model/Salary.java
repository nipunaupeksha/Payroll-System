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
public class Salary {

    private String salaryId;
    private String employeeId;
    private String date;
    private double salaryAdvance;
    private double loans;
    private double noPay;
    private double damages;
    private double etf;
    private double epf;
    private double tax;
    private double basicSalary;
    private double ot;
    private double bonus;
    private double transport;
    private double insentives;
    private double totalEarnings;
    private double totalDeductions;
    private double netSalary;

    public Salary() {
    }

    public Salary(String salaryId, String employeeId, String date, double salaryAdvance, double loans, double noPay, double damages, double etf, double epf, double tax, double basicSalary, double ot, double bonus, double transport, double insentives, double totalEarnings, double totalDeductions, double netSalary) {
        this.salaryId = salaryId;
        this.employeeId = employeeId;
        this.date = date;
        this.salaryAdvance = salaryAdvance;
        this.loans = loans;
        this.noPay = noPay;
        this.damages = damages;
        this.etf = etf;
        this.epf = epf;
        this.tax = tax;
        this.basicSalary = basicSalary;
        this.ot = ot;
        this.bonus = bonus;
        this.transport = transport;
        this.insentives = insentives;
        this.totalEarnings = totalEarnings;
        this.totalDeductions = totalDeductions;
        this.netSalary = netSalary;
    }

    public Salary(String employeeId, String date, double salaryAdvance, double loans, double noPay, double damages, double etf, double epf, double tax, double basicSalary, double ot, double bonus, double transport, double insentives) {
        this.employeeId = employeeId;
        this.date = date;
        this.salaryAdvance = salaryAdvance;
        this.loans = loans;
        this.noPay = noPay;
        this.damages = damages;
        this.etf = etf;
        this.epf = epf;
        this.tax = tax;
        this.basicSalary = basicSalary;
        this.ot = ot;
        this.bonus = bonus;
        this.transport = transport;
        this.insentives = insentives;
    }

    /**
     * @return the salaryId
     */
    public String getSalaryId() {
        return salaryId;
    }

    /**
     * @param salaryId the salaryId to set
     */
    public void setSalaryId(String salaryId) {
        this.salaryId = salaryId;
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
     * @return the salaryAdvance
     */
    public double getSalaryAdvance() {
        return salaryAdvance;
    }

    /**
     * @param salaryAdvance the salaryAdvance to set
     */
    public void setSalaryAdvance(double salaryAdvance) {
        this.salaryAdvance = salaryAdvance;
    }

    /**
     * @return the loans
     */
    public double getLoans() {
        return loans;
    }

    /**
     * @param loans the loans to set
     */
    public void setLoans(double loans) {
        this.loans = loans;
    }

    /**
     * @return the noPay
     */
    public double getNoPay() {
        return noPay;
    }

    /**
     * @param noPay the noPay to set
     */
    public void setNoPay(double noPay) {
        this.noPay = noPay;
    }

    /**
     * @return the damages
     */
    public double getDamages() {
        return damages;
    }

    /**
     * @param damages the damages to set
     */
    public void setDamages(double damages) {
        this.damages = damages;
    }

    /**
     * @return the etf
     */
    public double getEtf() {
        return etf;
    }

    /**
     * @param etf the etf to set
     */
    public void setEtf(double etf) {
        this.etf = etf;
    }

    /**
     * @return the epf
     */
    public double getEpf() {
        return epf;
    }

    /**
     * @param epf the epf to set
     */
    public void setEpf(double epf) {
        this.epf = epf;
    }

    /**
     * @return the tax
     */
    public double getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(double tax) {
        this.tax = tax;
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
     * @return the ot
     */
    public double getOt() {
        return ot;
    }

    /**
     * @param ot the ot to set
     */
    public void setOt(double ot) {
        this.ot = ot;
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the transport
     */
    public double getTransport() {
        return transport;
    }

    /**
     * @param transport the transport to set
     */
    public void setTransport(double transport) {
        this.transport = transport;
    }

    /**
     * @return the insentives
     */
    public double getInsentives() {
        return insentives;
    }

    /**
     * @param insentives the insentives to set
     */
    public void setInsentives(double insentives) {
        this.insentives = insentives;
    }

    /**
     * @return the totalEarnings
     */
    public double getTotalEarnings() {
        return totalEarnings;
    }

    /**
     * @param totalEarnings the totalEarnings to set
     */
    public void setTotalEarnings(double totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    /**
     * @return the totalDeductions
     */
    public double getTotalDeductions() {
        return totalDeductions;
    }

    /**
     * @param totalDeductions the totalDeductions to set
     */
    public void setTotalDeductions(double totalDeductions) {
        this.totalDeductions = totalDeductions;
    }

    /**
     * @return the netSalary
     */
    public double getNetSalary() {
        return netSalary;
    }

    /**
     * @param netSalary the netSalary to set
     */
    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

}
