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
import payroll.model.Damage;

/**
 *
 * @author ASUS
 */
public class DamageController {

    public static boolean addDamage(Damage damage) throws ClassNotFoundException, SQLException {
        String sql = "Insert into damage values(?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, damage.getEmployeeId());
        stm.setObject(2, damage.getDate());
        stm.setObject(3, damage.getDepartmentId());
        stm.setObject(4, damage.getDescription());
        stm.setObject(5, damage.getDamageCost());
        stm.setObject(6, damage.getMonthlyDeduction());
        stm.setObject(7, damage.getTimePeriod());
        stm.setObject(8, damage.getDueDate());
        int res=stm.executeUpdate();
        return res>0;
    }

    public static ArrayList<Damage> getAllDamages() throws ClassNotFoundException, SQLException {
        String sql = "Select * from damage";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Damage> damageList = new ArrayList();
        while (rst.next()) {
            Damage damage = new Damage(rst.getString("employeeId"), rst.getString("Date"),rst.getString("departmentId"), rst.getString("description"), rst.getDouble("damageCost"), rst.getDouble("monthlyDeduction"),rst.getInt("timePeriod"),rst.getString("dueDate"));
            damageList.add(damage);
        }
        return damageList;
    }

    public static ArrayList<Damage> getEmployeeDamages(String employeeId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from damage where employeeId='" + employeeId + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Damage> damageList = new ArrayList();
        while (rst.next()) {
            Damage damage = new Damage(rst.getString("employeeId"), rst.getString("Date"),rst.getString("departmentId"), rst.getString("description"), rst.getDouble("damageCost"), rst.getDouble("monthlyDeduction"),rst.getInt("timePeriod"),rst.getString("dueDate"));
            damageList.add(damage);
        }
        return damageList;
    }

    public static ArrayList<Damage> getMonthDamages(int month) throws ClassNotFoundException, SQLException {        
        String sql = "Select * from damage where month(Date)='"+month+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Damage> monthDamagesList = new ArrayList();
        while(rst.next()) {            
            Damage damage = new Damage(rst.getString("employeeId"), rst.getString("Date"),rst.getString("departmentId"), rst.getString("description"), rst.getDouble("damageCost"), rst.getDouble("monthlyDeduction"),rst.getInt("timePeriod"),rst.getString("dueDate"));
            monthDamagesList.add(damage);
        }
        return monthDamagesList;
    }
    
    public static ArrayList<Damage> getYearDamages(int year) throws ClassNotFoundException, SQLException {        
        String sql = "Select * from damage where year(Date)='"+year+"'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Damage> monthDamagesList = new ArrayList();
        while(rst.next()) {            
            Damage damage = new Damage(rst.getString("employeeId"), rst.getString("Date"),rst.getString("departmentId"), rst.getString("description"), rst.getDouble("damageCost"), rst.getDouble("monthlyDeduction"),rst.getInt("timePeriod"),rst.getString("dueDate"));
            monthDamagesList.add(damage);
        }
        return monthDamagesList;
    }    
    
    public static double getMonthlyDeduction(String employeeId) throws ClassNotFoundException, SQLException{
        String sql="Select SUM(monthlyDeduction) as totalDamageDeduction from damage where employeeId='"+employeeId+"' && Date(dueDate) > Date(curdate())";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return rst.getDouble("totalDamageDeduction");
        }else{
            return 0;
        }
    }
    
    public static ArrayList<Damage> checkPaymentStatus(String employeeId) throws ClassNotFoundException, SQLException{
        String sql="Select * from damage where employeeId='"+employeeId+"' && Date(dueDate) < Date(curdate())";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Damage> damagelist=new ArrayList<>();
        while(rst.next()){
            damagelist.add(new Damage(rst.getString("employeeId"),rst.getString("Date"),rst.getString("departmentId"),rst.getString("Description"),rst.getDouble("damageCost"),rst.getDouble("monthlyDeduction"),rst.getInt("timePeriod"),rst.getString("dueDate")));
        }
        return damagelist;
    }
}
