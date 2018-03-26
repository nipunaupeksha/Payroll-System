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
import payroll.dbconnector.DBConnection;
import payroll.model.Advance;

/**
 *
 * @author ASUS
 */
public class AdvanceController {
    public static boolean addAdvance(Advance advance) throws ClassNotFoundException, SQLException{
        String sql="Insert into advance values(?,?,?)";
        Connection conn=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=conn.prepareStatement(sql);
        stm.setObject(1,advance.getEmployeeId());
        stm.setObject(2,advance.getDate());
        stm.setObject(3,advance.getAdvanceAmount());
        int res=stm.executeUpdate();
        return res>0;
    }
    
    public static double getMonthAdvance(String employeeId) throws ClassNotFoundException, SQLException{
        String sql="Select advanceAmount from advance where employeeId='"+employeeId+"'&& MONTH(date)=MONTH(curdate())";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return rst.getDouble("advanceAmount");
        }else{
            return 0;
        }
    }
    
}
