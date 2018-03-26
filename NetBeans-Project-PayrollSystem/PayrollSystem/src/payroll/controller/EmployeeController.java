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
import payroll.model.Employee;

/**
 *
 * @author ASUS
 */
public class EmployeeController {

    public static boolean addEmployee(Employee employee) throws ClassNotFoundException, SQLException {
        String sql = "Insert into employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, employee.getEmployeeId());
        stm.setObject(2, employee.getFirstName());
        stm.setObject(3, employee.getSecondName());
        stm.setObject(4, employee.getNic());
        stm.setObject(5, employee.getDob());
        stm.setObject(6, employee.getAddress());
        stm.setObject(7, employee.getGender());
        stm.setObject(8, employee.getMaritialStatus());
        stm.setObject(9, employee.getMobileNum());
        stm.setObject(10, employee.getLandNum());
        stm.setObject(11, employee.getEmail());
        stm.setObject(12, employee.getJoiningDate());
        stm.setObject(13, employee.getDepartmentId());
        stm.setObject(14, employee.getGradeId());
        stm.setObject(15, employee.getRoleId());
        stm.setObject(16, employee.getBasicSalary());
        stm.setObject(17, employee.getBank());
        stm.setObject(18, employee.getAccNum());
        stm.setObject(19, employee.getTransportType());
        int res = stm.executeUpdate();
        return res > 0;
    }

    public static Employee searchEmployee(String employeeId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from employee where employeeId='" + employeeId + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Employee employee = null;
        if (rst.next()) {
            employee = new Employee(rst.getString("employeeId"), rst.getString("firstName"), rst.getString("secondName"), rst.getString("nic"), rst.getString("dob"), rst.getString("address"), rst.getString("gender"), rst.getString("maritialStatus"), rst.getString("mobileNum"), rst.getString("landNum"), rst.getString("email"), rst.getString("joiningDate"), rst.getString("departmentId"), rst.getString("gradeId"), rst.getString("roleId"), rst.getDouble("basicSalary"), rst.getString("bank"), rst.getString("accNum"), rst.getInt("transportType"));
        }
        return employee;
    }

    public static boolean updateEmployee(Employee employee) throws ClassNotFoundException, SQLException {
        String sql = "Update employee set firstName=?,secondName=?,address=?,maritialStatus=?,mobileNum=?,landNum=?,email=?,departmentId=?,gradeId=?,roleId=?,basicSalary=?,bank=?,accNum=?,transportType=? where employeeId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, employee.getFirstName());
        stm.setObject(2, employee.getSecondName());
        stm.setObject(3, employee.getAddress());
        stm.setObject(4, employee.getMaritialStatus());
        stm.setObject(5, employee.getMobileNum());
        stm.setObject(6, employee.getLandNum());
        stm.setObject(7, employee.getEmail());
        stm.setObject(8, employee.getDepartmentId());
        stm.setObject(9, employee.getGradeId());
        stm.setObject(10, employee.getRoleId());
        stm.setObject(11, employee.getBasicSalary());
        stm.setObject(12, employee.getBank());
        stm.setObject(13, employee.getAccNum());
        stm.setObject(14, employee.getEmployeeId());
        stm.setObject(15, employee.getTransportType());
        int res = stm.executeUpdate();
        return res > 0;
    }

    public static boolean deleteEmployee(String employeeId) throws ClassNotFoundException, SQLException {
        String sql = "Delete from employee where employeeId='" + employeeId + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    public static ArrayList<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
        String sql = "Select * from employee";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Employee> employeeList = new ArrayList();
        while (rst.next()) {
            Employee employee = new Employee(rst.getString("employeeId"), rst.getString("firstName"), rst.getString("secondName"), rst.getString("nic"), rst.getString("dob"), rst.getString("address"), rst.getString("gender"), rst.getString("maritialStatus"), rst.getString("mobileNum"), rst.getString("landNum"), rst.getString("email"), rst.getString("joiningDate"), rst.getString("departmentId"), rst.getString("gradeId"), rst.getString("roleId"), rst.getDouble("basicSalary"), rst.getString("bank"), rst.getString("accNum"), rst.getInt("transport"));
            employeeList.add(employee);
        }
        return employeeList;
    }

    public static ArrayList<Employee> getAllEmployeesById(String employeeId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from employee where employeeId='" + employeeId + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Employee> employeeList = new ArrayList();
        if (rst.next()) {
            Employee employee = new Employee(rst.getString("employeeId"), rst.getString("firstName"), rst.getString("secondName"), rst.getString("nic"), rst.getString("dob"), rst.getString("address"), rst.getString("gender"), rst.getString("maritialStatus"), rst.getString("mobileNum"), rst.getString("landNum"), rst.getString("email"), rst.getString("joiningDate"), rst.getString("departmentId"), rst.getString("gradeId"), rst.getString("roleId"), rst.getDouble("basicSalary"), rst.getString("bank"), rst.getString("accNum"), rst.getInt("transportType"));
            employeeList.add(employee);
        }
        return employeeList;
    }

    public static ArrayList<Employee> getAllDepartments(String departmentId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from employee where departmentId='" + departmentId + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Employee> employeeList = new ArrayList();
        while (rst.next()) {
            Employee employee = new Employee(rst.getString("employeeId"), rst.getString("firstName"), rst.getString("secondName"), rst.getString("nic"), rst.getString("dob"), rst.getString("address"), rst.getString("gender"), rst.getString("maritialStatus"), rst.getString("mobileNum"), rst.getString("landNum"), rst.getString("email"), rst.getString("joiningDate"), rst.getString("departmentId"), rst.getString("gradeId"), rst.getString("roleId"), rst.getDouble("basicSalary"), rst.getString("bank"), rst.getString("accNum"), rst.getInt("transportType"));
            employeeList.add(employee);
        }
        return employeeList;
    }

    public static ArrayList<Employee> getAllGrades(String gradeId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from employee where gradeId='" + gradeId + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Employee> employeeList = new ArrayList();
        while (rst.next()) {
            Employee employee = new Employee(rst.getString("employeeId"), rst.getString("firstName"), rst.getString("secondName"), rst.getString("nic"), rst.getString("dob"), rst.getString("address"), rst.getString("gender"), rst.getString("maritialStatus"), rst.getString("mobileNum"), rst.getString("landNum"), rst.getString("email"), rst.getString("joiningDate"), rst.getString("departmentId"), rst.getString("gradeId"), rst.getString("roleId"), rst.getDouble("basicSalary"), rst.getString("accNum"), rst.getString("accNum"), rst.getInt("transportType"));
            employeeList.add(employee);
        }
        return employeeList;
    }

    public static ArrayList<Employee> getAllRoles(String roleId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from employee where roleId='" + roleId + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Employee> employeeList = new ArrayList();
        while (rst.next()) {
            Employee employee = new Employee(rst.getString("employeeId"), rst.getString("firstName"), rst.getString("secondName"), rst.getString("nic"), rst.getString("dob"), rst.getString("address"), rst.getString("gender"), rst.getString("maritialStatus"), rst.getString("mobileNum"), rst.getString("landNum"), rst.getString("email"), rst.getString("joiningDate"), rst.getString("departmentId"), rst.getString("gradeId"), rst.getString("roleId"), rst.getDouble("basicSalary"), rst.getString("bank"), rst.getString("accNum"), rst.getInt("transportType"));
            employeeList.add(employee);
        }
        return employeeList;
    }

}
