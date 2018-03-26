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
import payroll.model.Bonus;

/**
 *
 * @author ASUS
 */
public class BonusController {
    public static boolean addBonus(Bonus bonus) throws ClassNotFoundException, SQLException{
        String sql="Insert into bonus values(?,?,?,?)";
        Connection conn=DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=conn.prepareStatement(sql);
        stm.setObject(1, bonus.getGradeId());
        stm.setObject(2, bonus.getDate());
        stm.setObject(3, bonus.getBonusType());
        stm.setObject(4, bonus.getAmount());
        int res=stm.executeUpdate();
        return res>0;
    }
    
    public static double getTotalBonus(String gradeId) throws ClassNotFoundException, SQLException{
        String sql="Select SUM(amount) as totalBonus from bonus where MONTH(Date)=MONTH(curdate()) && gradeId='"+gradeId+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return rst.getDouble("totalBonus");
        }else{
            return 0;
        }
    }
}
