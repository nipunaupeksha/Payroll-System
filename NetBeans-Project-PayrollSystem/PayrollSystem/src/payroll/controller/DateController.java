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
import payroll.dbconnector.DBConnection;

/**
 *
 * @author ASUS
 */
public class DateController {

    public static String getCalculatedDate(int months, String date) throws SQLException, ClassNotFoundException {
        String query = "Select DATE_ADD('" + date + "',INTERVAL '" + months + "' MONTH) as DueDate";
        Connection connection = DBConnection.getDBConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(query);
        if (rst.next()) {
            return rst.getString("DueDate");
        } else {
            return null;
        }
    }
}
