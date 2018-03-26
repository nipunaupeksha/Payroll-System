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
import payroll.model.BonusType;

/**
 *
 * @author ASUS
 */
public class BonusTypeController {
    public static ArrayList<BonusType> getBonusTypeByGrade(String gradeId) throws ClassNotFoundException, SQLException{
        String sql="Select * from bonusType where gradeId='"+gradeId+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<BonusType> bonusList=new ArrayList<>();
        while(rst.next()){
            bonusList.add(new BonusType(rst.getString("gradeId"),rst.getString("bonusType"),rst.getDouble("amount")));
        }
        return bonusList;
    }
    
    public static BonusType getBonusAmount(String gradeId, String bonusType) throws ClassNotFoundException, SQLException{
        String sql="Select * from bonusType where gradeId='"+gradeId+"' && bonusType='"+bonusType+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return new BonusType(rst.getString("gradeId"),rst.getString("bonusType"),rst.getDouble("amount"));
        }else{
            return null;
        }
    }
    
    public static boolean addBonusType(BonusType bonusType) throws ClassNotFoundException, SQLException{
        String sql="Insert into bonusType values('"+bonusType.getGradeId()+"','"+bonusType.getBonusType()+"','"+bonusType.getAmount()+"')";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        int res=stm.executeUpdate(sql);
        return res>0;
    }
}
