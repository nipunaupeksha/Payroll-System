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
import payroll.model.Role;

/**
 *
 * @author ASUS
 */
public class RoleContoller {

    public static ArrayList<Role> getAllRoles() throws ClassNotFoundException, SQLException {
        String sql = "Select * from role";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Role> roleList = new ArrayList();
        while (rst.next()) {
            Role role = new Role(rst.getString("roleId"), rst.getString("roleName"));
            roleList.add(role);
        }
        return roleList;
    }

    public static String getRoleId(String roleName) throws SQLException, ClassNotFoundException {
        String sql = "Select roleId from role where roleName='" + roleName + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return rst.getString("roleId");
        } else {
            return null;
        }
    }

    public static String getRoleName(String roleId) throws ClassNotFoundException, SQLException {
        String sql = "Select roleName from role where roleId='" + roleId + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return rst.getString("roleName");
        } else {
            return null;
        }
    }

    public static boolean addOrUpdateRole(Role role, boolean addOrUpdate) throws ClassNotFoundException, SQLException {
        String sql = "";
        if (addOrUpdate) {
            sql = "Insert into role values('" + role.getRoleId() + "','" + role.getRoleName() + "')";
        } else {
            sql = "Update role set roleName='" + role.getRoleName() + "' where roleId='" + role.getRoleId() + "'";
        }
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    public static boolean searchRole(String roleName) throws SQLException, ClassNotFoundException {
        String sql = "Select * from role where roleName='" + roleName + "'";
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
