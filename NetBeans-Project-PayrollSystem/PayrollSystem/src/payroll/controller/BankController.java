/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.controller;

import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import payroll.dbconnector.DBConnection;
import payroll.model.Bank;

/**
 *
 * @author ASUS
 */
public class BankController {

    public static boolean addBank(String bankName) throws ClassNotFoundException, SQLException {
        String sql = "Insert into bank values('" + bankName + "')";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    public static String[] giveBankNames() throws SQLException, ClassNotFoundException {
        String sql = "Select * from bank";
        int count = 0;
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()) {
            count++;
        }
        String str[] = new String[count];
        rst.beforeFirst();
        int i = 0;
        while (rst.next()) {
            str[i] = rst.getString("bankName");
            i++;
        }
        return str;
    }

    public static boolean deleteBank(String bankName) throws ClassNotFoundException, SQLException {
        String sql = "Delete from bank where bankName='" + bankName + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    public static Bank searchBank(String bankName) throws SQLException, ClassNotFoundException {
        String sql = "Select * from bank where bankName='" + bankName + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Bank bank = null;
        if (rst.next()) {
            bank = new Bank(rst.getString("bankName"));
        }
        return bank;
    }

    public static boolean bankValidity(String bankName) throws SQLException, ClassNotFoundException {
        String sql = "Select * from bank where bankName='" + bankName + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if (rst.next()) {
            return false;
        } else {
            return true;
        }
    }
}
