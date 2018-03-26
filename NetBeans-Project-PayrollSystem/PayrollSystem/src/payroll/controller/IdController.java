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
public class IdController {

    public static String getlastId(String tableName) throws SQLException, ClassNotFoundException {
        String sql = "select * from " + tableName + " order by 1 desc limit 1";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String id = null;
        if (rst.next()) {
            id = rst.getString(1);
        }
        return id;
    }

}
