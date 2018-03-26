/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.methods;

import java.io.IOException;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import payroll.controller.AttendanceController;
import payroll.controller.BankController;
import payroll.controller.DepartmentController;
import payroll.controller.EmployeeController;
import payroll.controller.GradeContoller;
import payroll.controller.IdController;
import payroll.controller.LeavesController;
import payroll.controller.RoleContoller;
import payroll.gui.ConfigurationSettings;
import payroll.gui.ViewAttendance;
import payroll.gui.Home;
import payroll.gui.Login;
import payroll.model.Attendance;
import payroll.model.Department;
import payroll.model.Employee;
import payroll.model.Grade;
import payroll.model.Leaves;
import payroll.model.Role;

/**
 *
 * @author ASUS
 */
public class payrollMethods {

    public static void fillDepartmentCombo(JComboBox departmentComboBox) throws SQLException, ClassNotFoundException {
        ArrayList<Department> allDepartments = DepartmentController.getAllDepartments();
        for (Department department : allDepartments) {
            departmentComboBox.addItem(department.getDepartmentName());
        }
    }

    public static void fillGradeCombo(JComboBox gradeComboBox) throws ClassNotFoundException, SQLException {
        ArrayList<Grade> allGrades = GradeContoller.getAllGrades();
        for (Grade grade : allGrades) {
            gradeComboBox.addItem(grade.getGradeName());
        }
    }

    public static void fillRoleCombo(JComboBox roleComboBox) throws ClassNotFoundException, SQLException {
        ArrayList<Role> allRoles = RoleContoller.getAllRoles();
        for (Role role : allRoles) {
            roleComboBox.addItem(role.getRoleName());
        }
    }

    public static String getDepartmentId(JComboBox departmentComboBox) throws SQLException, ClassNotFoundException {
        String departmentName = (String) departmentComboBox.getSelectedItem();
        String departmentId = DepartmentController.getDepartmentId(departmentName);
        return departmentId;
    }

    public static String getGradeId(JComboBox gradeComboBox) throws SQLException, ClassNotFoundException {
        String gradeName = (String) gradeComboBox.getSelectedItem();
        String gradeId = GradeContoller.getGradeId(gradeName);
        return gradeId;
    }

    public static String getRoleId(JComboBox roleComboBox) throws SQLException, ClassNotFoundException {
        String roleName = (String) roleComboBox.getSelectedItem();
        String roleId = RoleContoller.getRoleId(roleName);
        return roleId;
    }

    public static String getDepartmentName(JTextField textEmployeeId) throws ClassNotFoundException, SQLException {
        Employee employee = EmployeeController.searchEmployee(textEmployeeId.getText());
        String departmentId = employee.getDepartmentId();
        String departmentName = DepartmentController.getDepartmentName(departmentId);
        return departmentName;
    }

    public static String getGradeName(JTextField employeeIdText) throws ClassNotFoundException, SQLException {
        Employee employee = EmployeeController.searchEmployee(employeeIdText.getText());
        String gradeId = employee.getGradeId();
        String gradeName = GradeContoller.getGradeName(gradeId);
        return gradeName;
    }

    public static String getRoleName(JTextField employeeIdText) throws ClassNotFoundException, SQLException {
        Employee employee = EmployeeController.searchEmployee(employeeIdText.getText());
        String roleId = employee.getRoleId();
        String roleName = RoleContoller.getRoleName(roleId);
        return roleName;
    }

    public static void fillComboEmployeeId(JComboBox comboEmployeeIdName) throws ClassNotFoundException, SQLException {
        ArrayList<Employee> allEmployees = EmployeeController.getAllEmployees();
        for (Employee employee : allEmployees) {
            comboEmployeeIdName.addItem(employee.getEmployeeId());
        }
    }

    public static void fillComboBank(JComboBox comboBankName) throws SQLException, ClassNotFoundException {
        String bankNames[] = BankController.giveBankNames();
        for (int i = 0; i < bankNames.length; i++) {
            comboBankName.addItem(bankNames[i]);
        }
    }

    private static void AttendanceCorrector(String time) throws ClassNotFoundException, SQLException {
        Date date = new Date();
        char[] timeNew = {time.charAt(0), time.charAt(1), time.charAt(3), time.charAt(4), time.charAt(6), time.charAt(7)};
        String t = "";
        for (int i = 0; i < timeNew.length; i++) {
            t += timeNew[i];
        }
        ArrayList<Attendance> todayAttendance = AttendanceController.getTodayAttendance(getDateFormat(date));
        for (Attendance attendance : todayAttendance) {
            if (attendance != null && attendance.getShortLeaveOutTime() != null && attendance.getShortLeaveInTime().equals("") && Integer.parseInt(t) >= 170000) {
                System.out.println(attendance.getShortLeaveOutTime());
                AttendanceController.updateAttendance(new Attendance(attendance.getEmployeeId(), attendance.getDate(), attendance.getInTime(), "", "", attendance.getShortLeaveOutTime(), 0));
            }
        }
    }

    public static void getNewId(JLabel labelId, String prefix, String table) throws SQLException, ClassNotFoundException {

        String lastID = "";
        lastID = IdController.getlastId(table);
        if (lastID == null) {
            lastID = "" + prefix + "000";
        }
        String[] id = lastID.split(prefix);
        int number = Integer.parseInt(id[1]);
        number++;
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMinimumIntegerDigits(3);
        String value = numberFormat.format(number);
        String newTxt = value.replaceAll("[\\D]", "");
        labelId.setText(prefix + newTxt);
    }

    public static String getMonthNumber(String selectedDate) {
        char[] Date = {selectedDate.charAt(8), selectedDate.charAt(9)};
        String month = "";
        for (int i = 0; i < Date.length; i++) {
            month += Date[i];
         }
        return month;
    }

    public static String getDateFormat(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String newDate = dateFormat.format(date);
        return newDate;
    }

    public static String getYearMonth(String date) {
        char[] yearMonth = {date.charAt(0), date.charAt(1), date.charAt(2), date.charAt(3), date.charAt(5), date.charAt(6)};
        String newDate = "";
        for (int i = 0; i < yearMonth.length; i++) {
            newDate += yearMonth[i];
        }
        return newDate;
    }

    public static int getTimeHours(String time) {
        char[] timeHours = {time.charAt(0), time.charAt(1)};
        String hours = "";
        for (int i = 0; i < timeHours.length; i++) {
            hours += timeHours[i];
        }
        return Integer.parseInt(hours);
    }

    public static int getTimeMinutes(String time) {
        char[] timeMinutes = {time.charAt(3), time.charAt(4)};
        String minutes = "";
        for (int i = 0; i < timeMinutes.length; i++) {
            minutes += timeMinutes[i];
        }
        return Integer.parseInt(minutes);
    }

    public static void setTodaySummary(JTable tableTodayAttendance, JLabel labelTotalIn, JLabel labelShortLeave, JLabel labelOut) {
        try {
            int totalIn = 0, totalSLOut = 0;
            for (int i = 0; i < tableTodayAttendance.getRowCount(); i++) {
                boolean in = (boolean) tableTodayAttendance.getValueAt(i, 2);
                boolean shortLeave = (boolean) tableTodayAttendance.getValueAt(i, 3);
                if (in) {
                    totalIn += 1;
                }
                if (shortLeave) {
                    totalSLOut += 1;
                }
            }
            labelTotalIn.setText(Integer.toString(totalIn));
            labelShortLeave.setText(Integer.toString(totalSLOut));
            labelOut.setText(Integer.toString(AttendanceController.getAbsenties()));
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }

    public static void setTodayAttendance(JLabel labelDate, JTable tableTodayAttendance) {
        try {
            ArrayList<Attendance> attendanceList = AttendanceController.getTodayAttendance(labelDate.getText());
            DefaultTableModel dtm;
            dtm = (DefaultTableModel) tableTodayAttendance.getModel();
            dtm.setRowCount(0);
            for (Attendance attendance : attendanceList) {
                Employee employee = EmployeeController.searchEmployee(attendance.getEmployeeId());
                boolean a = false, b = false;
                if (!"".equals(attendance.getShortLeaveOutTime()) && !"".equals(attendance.getShortLeaveInTime()) && !"".equals(attendance.getOutTime())) {
                    b = true;
                } else if (!"".equals(attendance.getShortLeaveOutTime()) && attendance.getShortLeaveInTime().equals("")) {
                    b = true;
                } else if (!"".equals(attendance.getOutTime())) {
                    b = true;
                } else {
                    a = true;
                }
                Object[] rawData = {employee.getEmployeeId(), (employee.getFirstName() + " " + employee.getSecondName()), a, b};
                dtm.addRow(rawData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(payrollMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void checkShortLeave(JLabel labelDate) {
        try {
            ArrayList<Attendance> todayAttendance = AttendanceController.getTodayAttendance(labelDate.getText());
            for (Attendance attendance : todayAttendance) {
                if (attendance.getShortLeaveOutTime() != null && attendance.getShortLeaveInTime() != null) {
                    int minutes = AttendanceController.getMinutes(labelDate.getText(), attendance.getShortLeaveOutTime(), attendance.getShortLeaveInTime());
                    if (minutes > 90) {
                        LeavesController.addLeave(new Leaves(attendance.getEmployeeId(), labelDate.getText(), 1, "Half Day"));
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }

    public static void setHalfDay(JTextField textEmployeeId, JLabel labelDate) {
        try {
            LeavesController.addLeave(new Leaves(textEmployeeId.getText(), labelDate.getText(), 1, "Half Day"));
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }

    public static void setBtnSave(JButton buttonSave, JTextField textFirstName, JTextField textSecondName, JTextField textNic, JTextField date, JTextField textAddress, ButtonGroup gender, JTextField textMobileNum, JTextField txtLandNum, JTextField textEmail, JTextField textJoiningDate, JTextField textBasicSalary, JTextField textAccNum, ButtonGroup transport) {

    }

    public static int writeBackup(String path) throws IOException, InterruptedException {
        Runtime runTime = Runtime.getRuntime();
        Process runtimeProcess = runTime.exec("mysqldump payrollSystem -h localhost -u root -pnu -r  " + path);
        int res = runtimeProcess.waitFor();
        return res;
    }

    public static int restoreBackup(String path) throws IOException, InterruptedException {
        String[] executeCmd = new String[]{"mysql", "payrollSystem", "--user=root", "--password=nu", "-e", " source " + path};
        Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
        int res = runtimeProcess.waitFor();
        return res;
    }

}
