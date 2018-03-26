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
import payroll.model.Grade;

/**
 *
 * @author ASUS
 */
public class GradeContoller {

    public static ArrayList<Grade> getAllGrades() throws ClassNotFoundException, SQLException {
        String sql = "Select * from grade";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<Grade> gradeList = new ArrayList();
        while (rst.next()) {
            Grade grade = new Grade(rst.getString("gradeId"), rst.getString("gradeName"), rst.getDouble("noPayRate"), rst.getDouble("normalOtAmount"), rst.getDouble("weekendOtAmount"), rst.getDouble("maxLoanAmount"), rst.getDouble("maxAdvanceRate"), rst.getDouble("vehicleAllowences"));
            gradeList.add(grade);
        }
        return gradeList;
    }

    public static String getGradeId(String gradeName) throws SQLException, ClassNotFoundException {
        String sql = "Select gradeId from grade where gradeName='" + gradeName + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return rst.getString("gradeId");
        } else {
            return null;
        }
    }

    public static String getGradeName(String gradeId) throws ClassNotFoundException, SQLException {
        String sql = "Select gradeName from grade where gradeId='" + gradeId + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return rst.getString("gradeName");
        } else {
            return null;
        }
    }

    public static Grade getGradeDetails(String gradeId) throws ClassNotFoundException, SQLException {
        String sql = "Select * from grade where gradeId='" + gradeId + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            Grade grade = new Grade(rst.getString("gradeId"), rst.getString("gradeName"), rst.getDouble("noPayRate"), rst.getDouble("normalOtAmount"), rst.getDouble("weekendOtAmount"), rst.getDouble("maxLoanAmount"), rst.getDouble("maxAdvanceRate"), rst.getDouble("vehicleAllowences"));
            return grade;
        } else {
            return null;
        }
    }

    public static boolean addOrUpdateGrade(Grade grade, boolean addOrUpdate) throws ClassNotFoundException, SQLException {
        String sql = "";
        if (addOrUpdate) {
            sql = "Insert into grade values('" + grade.getGaradeId() + "','" + grade.getGradeName() + "','" + grade.getNoPayRate() + "','" + grade.getNormalOtAmount() + "','" + grade.getWeekendOtAmount() + "','" + grade.getMaxLoanAmount() + "','" + grade.getMaxAdvanceRate() + "','" + grade.getVehicleAllowences() + "')";
        } else {
            sql = "Update grade set gradeName='" + grade.getGradeName() + "',noPayRate='" + grade.getNoPayRate() + "',normalOtAmount='" + grade.getNormalOtAmount() + "',weekendOtAmount='" + grade.getWeekendOtAmount() + "',maxLoanAmount='" + grade.getMaxLoanAmount() + "',maxAdvanceRate='" + grade.getMaxAdvanceRate() + "',vehicleAllowences='" + grade.getVehicleAllowences() + "' where gradeId='" + grade.getGaradeId() + "'";
        }
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    public static boolean searchGrade( String gradeName) throws SQLException, ClassNotFoundException {
        String sql = "Select * from grade where gradeName='" + gradeName + "'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return true;
        } else {
            return false;
        }
    }

}
