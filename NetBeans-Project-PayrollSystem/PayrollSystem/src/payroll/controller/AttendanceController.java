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
import payroll.model.Attendance;

/**
 *
 * @author ASUS
 */
public class AttendanceController{
    public static void markAttendanceIn(Attendance attendance) throws ClassNotFoundException, SQLException{
        String sql="Insert into attendance values('"+attendance.getEmployeeId()+"','"+attendance.getDate()+"','"+attendance.getInTime()+"','"+attendance.getShortLeaveOutTime()+"','"+attendance.getShortLeaveInTime()+"','"+attendance.getOutTime()+"','0')";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        stm.executeUpdate(sql);
    }
    
    public static void updateAttendance(Attendance attendance) throws ClassNotFoundException, SQLException{
        String sql="Update attendance set outTime='"+attendance.getOutTime()+"',shortLeaveOutTime='"+attendance.getShortLeaveOutTime()+"',shortLeaveInTime='"+attendance.getShortLeaveInTime()+"',otHours='"+attendance.getOtHours()+"' where employeeId='"+attendance.getEmployeeId()+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        stm.executeUpdate(sql);
    }
    
    public static Attendance getEmployeeAttendance(String employeeId,String date) throws ClassNotFoundException, SQLException{
        String sql="Select * from attendance where date='"+date+"' && employeeId='"+employeeId+"'";        
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Attendance attendance=null;
        while(rst.next()){
            attendance=new Attendance(rst.getString("employeeId"),rst.getString("Date"),rst.getString("inTime"),rst.getString("shortLeaveOutTime"),rst.getString("shortLeaveInTime"),rst.getString("outTime"),rst.getInt("otHours"));            
            
        }
        
        return attendance;
        
    }
    
    public static ArrayList<Attendance> getYearAttendance(int year) throws ClassNotFoundException, SQLException{
        String sql="Select * from attendance where year(date)='"+year+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Attendance> attendanceList=new ArrayList<>();
        while(rst.next()){
            Attendance attendance=new Attendance(rst.getString("employeeId"),rst.getString("Date"),rst.getString("inTime"),rst.getString("shortLeaveOutTime"),rst.getString("shortLeaveInTime"),rst.getString("outTime"),rst.getInt("otHours"));
            attendanceList.add(attendance);
        }
        return attendanceList;
    }
    
    public static ArrayList<Attendance> getMonthAttendance(int month) throws ClassNotFoundException, SQLException{
        String sql="Select * from attendance where month(date)='"+month+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Attendance> attendanceList=new ArrayList<>();
        while(rst.next()){
            Attendance attendance=new Attendance(rst.getString("employeeId"),rst.getString("Date"),rst.getString("inTime"),rst.getString("shortLeaveOutTime"),rst.getString("shortLeaveInTime"),rst.getString("outTime"),rst.getInt("otHours"));
            attendanceList.add(attendance);
        }
        return attendanceList;
    }
    
    public static ArrayList<Attendance> getSelectedDayAttendance(String date) throws ClassNotFoundException, SQLException{
        String sql="Select * from attendance where date='"+date+"'";       
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Attendance> attendanceList=new ArrayList<>();
        while(rst.next()){
            Attendance attendance=new Attendance(rst.getString("employeeId"),rst.getString("Date"),rst.getString("inTime"),rst.getString("shortLeaveOutTime"),rst.getString("shortLeaveInTime"),rst.getString("outTime"),rst.getInt("otHours"));
            attendanceList.add(attendance);
        }
        return attendanceList;
    }
    
    public static ArrayList<Attendance> getTodayAttendance(String date) throws ClassNotFoundException, SQLException{
        String sql="Select * from attendance where date=curdate()";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Attendance> attendanceList=new ArrayList<>();
        while(rst.next()){
            Attendance attendance=new Attendance(rst.getString("employeeId"),rst.getString("Date"),rst.getString("inTime"),rst.getString("shortLeaveOutTime"),rst.getString("shortLeaveInTime"),rst.getString("outTime"),rst.getInt("otHours"));
            attendanceList.add(attendance);
        }
        return attendanceList;
    }
    
    public static int getMinutes(String Date, String shortLeaveOutTime, String shortLeaveInTime) throws ClassNotFoundException, SQLException{
        String sql="Select TIMESTAMPDIFF(MINUTE,'"+Date+" "+shortLeaveOutTime+"','"+Date+" "+shortLeaveInTime+"') as minutes";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return rst.getInt("minutes");
        }else{
            return 0;
        }
    }
    
    public static int getAbsenties() throws ClassNotFoundException, SQLException{
        String sql="Select (COUNT(employeeId) - (Select COUNT(employeeId) from Attendance where date=curdate())) as absenties from Employee";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return rst.getInt("absenties");
        }else{
            return 0;
        }
    }
    
    public static int getNormalOt(String employeeId) throws ClassNotFoundException, SQLException{
        String sql="Select SUM(otHours) as totalNormalOt from Attendance where MONTH(date)=MONTH(curdate()) && employeeId='"+employeeId+"' && (DAYNAME(date)!='Saturday' || DAYNAME(date)!='Sunday')";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return rst.getInt("totalNormalOt");
        }else{
            return 0;
        }
    }
    
    public static int getWeekendOt(String employeeId) throws ClassNotFoundException, SQLException{
        String sql="Select SUM(otHours) as totalWeekendOt from Attendance where MONTH(date)=MONTH(curdate()) && employeeId='"+employeeId+"' && (DAYNAME(date)='Saturday' || DAYNAME(Date)='Sunday')";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return rst.getInt("totalWeekendOt");
        }else{
            return 0;
        }
    }
    
    public static int getShortLeaveCount(String employeeId) throws ClassNotFoundException, SQLException{
        String sql="Select COUNT(shortLeaveInTime) as shortLeaveCount from Attendance where employeeId='"+employeeId+"' && MONTH(date)=MONTH(curdate())";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return rst.getInt("shortLeaveCount");
        }else{
            return 0;
        }
    }
    
   
}

        