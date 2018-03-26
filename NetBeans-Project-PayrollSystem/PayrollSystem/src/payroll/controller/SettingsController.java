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
import payroll.model.Settings;

/**
 *
 * @author ASUS
 */
public class SettingsController {
    public static Settings getAllSettings() throws ClassNotFoundException, SQLException{
        String sql="Select * from settings";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return new Settings(rst.getDouble("epfRate"),rst.getDouble("etfRate"),rst.getDouble("taxRate"),rst.getDouble("damageRate"),rst.getDouble("loanRate"),rst.getDouble("yearlyIncome"),rst.getDouble("attendanceInsentive1"),rst.getDouble("attendanceInsentive2"),rst.getDouble("attendanceInsentive3"),rst.getInt("maxHalfDayLeaves"),rst.getInt("maxCasualLeaves"),rst.getInt("maxMedicalLeaves"),rst.getInt("maxVacationLeaves"),rst.getInt("maxPregnantLeaves"),rst.getInt("allMaximumLeaves"));
        }else{
            return null;
        }
    }
    
    public static boolean updateSettings(Settings settings) throws ClassNotFoundException, SQLException{
        String sql="Update settings set epfRate='"+settings.getEpfRate()+"',etfRate='"+settings.getEtfRate()+"',taxRate='"+settings.getTaxRate()+"',damageRate='"+settings.getDamageRate()+"',loanRate='"+settings.getLoanRate()+"',yearlyIncome='"+settings.getYearlyIncome()+"',attendanceInsentive1='"+settings.getAttendanceInsentive1()+"',attendanceInsentive2='"+settings.getAttendanceInsentive2()+"',attendanceInsentive3='"+settings.getAttendanceInsentive3()+"',maxHalfDayLeaves='"+settings.getMaxHalfDayLeaves()+"',maxCasualLeaves='"+settings.getMaxCasualLeave()+"',maxMedicalLeaves='"+settings.getMaxMedicalLeaves()+"',maxPregnantLeaves='"+settings.getMaxPregnantLeaves()+"',maxVacationLeaves='"+settings.getMaxVacationLeaves()+"', allMaximumLeaves='"+settings.getAllMaximumLeaves()+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res>0;
    }
}
