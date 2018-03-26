/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import payroll.dbconnector.DBConnection;
import payroll.model.Department;

/**
 *
 * @author ASUS
 */
public class DepartmentController {

    public static ArrayList<Department> getAllDepartments() throws SQLException, ClassNotFoundException {
        String sql = "Select * from department";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Department> departmentList = new ArrayList();
        while (rst.next()) {
            Department department = new Department(rst.getString("departmentId"), rst.getString("departmentName"));
            departmentList.add(department);
        }
        return departmentList;
    }

    public static String getDepartmentId(String departmentName) throws SQLException, ClassNotFoundException {
        String sql = "Select departmentId from department where departmentName='" + departmentName + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return rst.getString("departmentId");
        } else {
            return null;
        }
    }

    public static String getDepartmentName(String departmentId) throws SQLException, ClassNotFoundException {
        String sql = "Select departmentName from department where departmentId='" + departmentId + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return rst.getString("departmentName");
        } else {
            return null;
        }
    }

    public static boolean addOrUpdateDepartment(Department department, boolean addOrUpdate) throws ClassNotFoundException, SQLException {
        String sql = "";
        if (addOrUpdate) {
            sql = "Insert into department values('" + department.getDepartmentId() + "','" + department.getDepartmentName() + "')";
        } else {
            sql = "Update department set departmentName='" + department.getDepartmentName() + "' where departmentId='" + department.getDepartmentId() + "'";
        }
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    public static boolean searchDepartment(String departmentName) throws SQLException, ClassNotFoundException {
        String sql = "Select * from department where departmentName='"+departmentName+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return true;
        } else {
            return false;
        }
    }
}
