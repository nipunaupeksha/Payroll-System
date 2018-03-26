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
import payroll.model.Loan;

/**
 *
 * @author ASUS
 */
public class LoanController {

    public static boolean addLoan(Loan loan) throws ClassNotFoundException, SQLException {
        String sql = "Insert into loan values(?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, loan.getLoanId());
        stm.setObject(2, loan.getDate());
        stm.setObject(3, loan.getEmployeeId());
        stm.setObject(4, loan.getDescription());
        stm.setObject(5, loan.getLoanAmount());
        stm.setObject(6, loan.getMonthlyInstallment());
        stm.setObject(7, loan.getTimePeriod());
        stm.setObject(8, loan.getDueDate());
        stm.setObject(9, loan.getGuarantor1());
        stm.setObject(10, loan.getGuarantor2());
        int res = stm.executeUpdate();
        return res>0;
    }

    public static ArrayList<Loan> getAllLoansByEmployeeId(String employeeId) throws ClassNotFoundException, SQLException {
        String sql="Select * from loan where employeeId='"+employeeId+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Loan> loanList=new ArrayList();
        while(rst.next()){
            loanList.add(new Loan(rst.getString("loanId"),rst.getString("Date"),rst.getString("employeeId"),rst.getString("Description"),rst.getDouble("loanAmount"),rst.getDouble("monthlyInstallment"),rst.getInt("timePeriod"),rst.getString("dueDate"),rst.getString("guarantor1"),rst.getString("guarantor2")));
        }
        return loanList;
    }
   
    public static Loan getLoanDetailsByLoanId(String loanId) throws ClassNotFoundException, SQLException{
        String sql="Select * from loan where loanId='"+loanId+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Loan loan=null;
        if(rst.next()){
            loan=new Loan(rst.getString("loanId"),rst.getString("Date"),rst.getString("employeeId"),rst.getString("Description"),rst.getDouble("loanAmount"),rst.getDouble("monthlyInstallment"),rst.getInt("timePeriod"),rst.getString("dueDate"),rst.getString("guarantor1"),rst.getString("guarantor2"));
        }
        return loan;
    }
    
    public static ArrayList<Loan> getYearLoans(int year) throws ClassNotFoundException, SQLException{
        String sql="Select * from loan where year(Date)='"+year+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Loan> loanList=new ArrayList();
        while(rst.next()){
            loanList.add(new Loan(rst.getString("loanId"),rst.getString("Date"),rst.getString("employeeId"),rst.getString("Description"),rst.getDouble("loanAmount"),rst.getDouble("monthlyInstallment"),rst.getInt("timePeriod"),rst.getString("dueDate"),rst.getString("guarantor1"),rst.getString("guarantor2")));
        }
        return loanList;
    }
    
    public static ArrayList<Loan> getYearMonthLoans(int year, int month) throws ClassNotFoundException, SQLException{
        String sql="Select * from loan where year(date)='"+year+"' && month(date)='"+month+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Loan> loanList=new ArrayList();
        while(rst.next()){
            loanList.add(new Loan(rst.getString("loanId"),rst.getString("Date"),rst.getString("employeeId"),rst.getString("Description"),rst.getDouble("loanAmount"),rst.getDouble("monthlyInstallment"),rst.getInt("timePeriod"),rst.getString("dueDate"),rst.getString("guarantor1"),rst.getString("guarantor2")));
        }
        return loanList;
    }
    
    public static ArrayList<Loan> getEmployeeLoans(String employeeId) throws ClassNotFoundException, SQLException{
        String sql="Select * from loan where employeeId='"+employeeId+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Loan> loanList=new ArrayList();
        while(rst.next()){
            loanList.add(new Loan(rst.getString("loanId"),rst.getString("Date"),rst.getString("employeeId"),rst.getString("Description"),rst.getDouble("loanAmount"),rst.getDouble("monthlyInstallment"),rst.getInt("timePeriod"),rst.getString("dueDate"),rst.getString("guarantor1"),rst.getString("guarantor2")));
        }
        return loanList;
    }
    
    public static String getLoanPaymentStatus(String dueDate,String loanId) throws ClassNotFoundException, SQLException{
        String sql="Select * from loan where Date("+dueDate+") <= 'curdate()' && loanId='"+loanId+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return "Paid";
        }else{
            return "Not Paid";
        }
    }
    
    public static int getMonthsCount(int currentDate, int loanDate) throws SQLException, ClassNotFoundException{
        String sql="Select PERIOD_DIFF("+currentDate+","+loanDate+") as monthCount";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return rst.getInt("monthCount");
        }else{
            return 0;
        }
    }
    
    public static ArrayList<Loan> getReleasedLoans() throws ClassNotFoundException, SQLException{
        String sql="Select * from loan where Date(dueDate) <= curdate()";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Loan> loanList=new ArrayList<>();
        while(rst.next()){
            loanList.add(new Loan(rst.getString("loanId"),rst.getString("Date"),rst.getString("employeeId"),rst.getString("Description"),rst.getDouble("loanAmount"),rst.getDouble("monthlyInstallment"),rst.getInt("timePeriod"),rst.getString("dueDate"),rst.getString("guarantor1"),rst.getString("guarantor2")));
        }
        return loanList;    
    }
    
    public static Loan getLastLoan(String employeeId) throws ClassNotFoundException, SQLException{
        String sql="Select * from loan where employeeId='"+employeeId+"' order by Date desc limit 1";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        Loan loan=null;
        if(rst.next()){
             loan=new Loan(rst.getString("loanId"),rst.getString("Date"),rst.getString("employeeId"),rst.getString("Description"),rst.getDouble("loanAmount"),rst.getDouble("monthlyInstallment"),rst.getInt("timePeriod"),rst.getString("dueDate"),rst.getString("guarantor1"),rst.getString("guarantor2"));
        }
        return loan;
    }
    
    public static boolean checkLoanValidity(String guranterId) throws ClassNotFoundException, SQLException{
        String sql="Select * from loan where employeeId='"+guranterId+"' && Date(dueDate) >= curdate()";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return true;
        }else{
            return false;
        }
    }
    
    public static double getMonthlyInstallment(String employeeId) throws ClassNotFoundException, SQLException{
        String sql="Select monthlyInstallment from loan where employeeId='"+employeeId+"' && Date(dueDate) > Date(curdate())";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if(rst.next()){
            return rst.getDouble("monthlyInstallment");
        }else{
            return 0;
        }
    }
    
    public static ArrayList<Loan> getPayableLoans() throws ClassNotFoundException, SQLException{
        String sql="Select * from loan where Date(dueDate) > curdate()";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Loan> loanList=new ArrayList<>();
        while(rst.next()){
            loanList.add(new Loan(rst.getString("loanId"),rst.getString("Date"),rst.getString("employeeId"),rst.getString("Description"),rst.getDouble("loanAmount"),rst.getDouble("monthlyInstallment"),rst.getInt("timePeriod"),rst.getString("dueDate"),rst.getString("guarantor1"),rst.getString("guarantor2")));
        }
        return loanList;
    } 
}
