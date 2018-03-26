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
import payroll.model.Leaves;

/**
 *
 * @author ASUS
 */
public class LeavesController {

    public static boolean addLeave(Leaves leave) throws ClassNotFoundException, SQLException {
        String sql = "Insert into leaves values(?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, leave.getEmployeeId());
        stm.setObject(2, leave.getLeaveDate());
        stm.setObject(3, leave.getNoOfDays());
        stm.setObject(4, leave.getLeaveType());
        int res = stm.executeUpdate();
        return res>0;
    }

    public static int getLeaveCount(String employeeId, String leaveType) throws ClassNotFoundException, SQLException {
        String sql ="Select SUM(noOfDays) as leaveCount from leaves where employeeId='"+employeeId+"' && YEAR(leaveDate)=YEAR(curdate()) && leaveType='"+leaveType+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return rst.getInt("leaveCount");
        }else{
            return 0;
        }
    }
    
    public static ArrayList<Leaves> getAllEmployeeLeaves(String employeeId) throws ClassNotFoundException, SQLException{
        String sql="Select * from leaves where employeeId='"+employeeId+"' && YEAR(leaveDate)=YEAR(curdate())";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Leaves> leaveList=new ArrayList<>();
        while(rst.next()){
            leaveList.add(new Leaves(rst.getString("employeeId"),rst.getString("leaveDate"),rst.getInt("noOfDays"),rst.getString("leaveType")));
        }
        return leaveList;
    }
    
    public static int getMonthlyLeaveCount(String employeeId,String leaveType) throws ClassNotFoundException, SQLException{
        String sql="Select SUM(noOfDays) as leaveCount from leaves where employeeId='"+employeeId+"' && MONTH(Date)=MONTH(curdate()) && leaveType='"+leaveType+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return rst.getInt("leaveCount");
        }else{
            return 0;
        }
    }
    
    public static int getMonthlyAllLeaveCount(String employeeId) throws ClassNotFoundException, SQLException{
        String sql="Select SUM(noOfDays) as leaveCount from leaves where employeeId='"+employeeId+"' && MONTH(leaveDate)=MONTH(curdate())";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return rst.getInt("leaveCount");
        }else{
            return 0;
        }
    }
        

}
