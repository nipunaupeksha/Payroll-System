/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import payroll.dbconnector.DBConnection;
import payroll.model.Salary;

/**
 *
 * @author ASUS
 */
public class SalaryController {

    public static boolean addSalary(Salary salary) throws ClassNotFoundException, SQLException {
        String sql = "Insert into salary values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, salary.getEmployeeId());
        stm.setObject(2, salary.getDate());
        stm.setObject(3, salary.getSalaryAdvance());
        stm.setObject(4, salary.getLoans());
        stm.setObject(5, salary.getNoPay());
        stm.setObject(6, salary.getDamages());
        stm.setObject(7, salary.getEtf());
        stm.setObject(8, salary.getEpf());
        stm.setObject(9, salary.getTax());
        stm.setObject(10, salary.getBasicSalary());
        stm.setObject(11, salary.getOt());
        stm.setObject(12, salary.getBonus());
        stm.setObject(13, salary.getTransport());
        stm.setObject(14, salary.getInsentives());
        stm.setObject(15, salary.getTotalEarnings());
        stm.setObject(16, salary.getTotalDeductions());
        stm.setObject(17, salary.getNetSalary());
        int res = stm.executeUpdate();
        return res > 0;
    }

    public static ArrayList<Salary> getAnualReport(int year) throws ClassNotFoundException, SQLException {
        String sql = "Select * from salary where YEAR(Date)='" + year + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Salary> salaryList = new ArrayList<>();
        while (rst.next()) {
            Salary salary = new Salary(rst.getString("employeeId"), rst.getString("Date"), rst.getDouble("salaryAdvance"), rst.getDouble("loans"), rst.getDouble("noPay"), rst.getDouble("damages"), rst.getDouble("etf"), rst.getDouble("etf"), rst.getDouble("tax"), rst.getDouble("basicSalary"), rst.getDouble("ot"), rst.getDouble("bonus"), rst.getDouble("transport"), rst.getDouble("insentives"));
            salaryList.add(salary);
        }
        return salaryList;
    }

    public static ArrayList<Salary> getSalaries(int year, int month) throws ClassNotFoundException, SQLException {
        String sql = "Select * from salary where YEAR(date)='" + year + "' && MONTH(date)='" + month + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Salary> salaryList = new ArrayList<>();
        while (rst.next()) {
            Salary salary = new Salary(rst.getString("employeeId"), rst.getString("Date"), rst.getDouble("salaryAdvance"), rst.getDouble("loans"), rst.getDouble("noPay"), rst.getDouble("damages"), rst.getDouble("etf"), rst.getDouble("etf"), rst.getDouble("tax"), rst.getDouble("basicSalary"), rst.getDouble("ot"), rst.getDouble("bonus"), rst.getDouble("transport"), rst.getDouble("insentives"));
            salaryList.add(salary);
        }
        return salaryList;
    }

    public static boolean salarySaving(String date, String employeeId, String totalDeductions, String totalEarnings, String netSalary, String salaryId) throws SQLException, ClassNotFoundException {
        String sql = "Update salary set totalDeductions='" + totalDeductions + "',totalEarnings='" + totalEarnings + "',netSalary='" + netSalary + "' where employeeId='" + employeeId + "' and date=curdate() and salaryId='" + salaryId + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    public static boolean salaryAdded(Salary salary) throws SQLException, ClassNotFoundException {
        String sql = "Insert into salary values ('" + salary.getSalaryId() + "','" + salary.getEmployeeId() + "','" + salary.getDate() + "','" + salary.getSalaryAdvance() + "','" + salary.getLoans() + "','" + salary.getNoPay() + "','" + salary.getDamages() + "','" + salary.getEtf() + "','" + salary.getEpf() + "','" + salary.getTax() + "','" + salary.getBasicSalary() + "','" + salary.getOt() + "','" + salary.getBonus() + "','" + salary.getTransport() + "','" + salary.getInsentives() + "','" + salary.getTotalEarnings() + "','" + salary.getTotalDeductions() + "','" + salary.getNetSalary() + "')";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    public static boolean salarySearch(String salaryId, String employeeId, int month) throws SQLException, ClassNotFoundException {
        String sql = "Select * from salary where employeeId='" + employeeId + "'and MONTH(date)='" + month + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return false;
        } else {
            return true;
        }
    }
}
