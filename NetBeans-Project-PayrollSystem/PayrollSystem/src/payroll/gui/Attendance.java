/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.gui;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import payroll.controller.AttendanceController;
import payroll.controller.EmployeeController;
import payroll.methods.payrollMethods;
import payroll.model.Employee;

/**
 *
 * @author ASUS
 */
public class Attendance extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private ClockLabel dateLable = new ClockLabel("date");
    private ClockLabel timeLable = new ClockLabel("time");
    private ClockLabel dayLable = new ClockLabel("day");
    private ClockLabel withSecondsLable = new ClockLabel("withSeconds");
    private JLabel dateValLable;
    private Date date = new Date();
    private boolean isConstructorClosed = false;
    private DefaultTableModel dtm;

    public Attendance() {
        this.dateValLable = new JLabel(setDate(date));
        initComponents();
        try {
            Class.forName("ClockLabel");
        } catch (ClassNotFoundException e) {
            e.getStackTrace();
        }
        jPanel1.setLayout(new FlowLayout());
        jPanel1.add(timeLable);
        jPanel1.add(dateLable);
        jPanel1.add(dayLable);
        jLabel27.setVisible(false);
        jLabel28.setVisible(false);
        jLabel31.setVisible(false);
        jTextField1.requestFocus();

        dtm = (DefaultTableModel) tableTodayAttendance.getModel();
        dtm.setRowCount(0);
        jLabel16.setText("0");
        jLabel19.setText("0");
        jLabel18.setText("0");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/rsz_bleach_login.png")));
        payrollMethods.setTodayAttendance(dateValLable, tableTodayAttendance);
        payrollMethods.setTodaySummary(tableTodayAttendance, jLabel16, jLabel18, jLabel19);
        payrollMethods.checkShortLeave(dateValLable);
        setLocation(100, 100);
        isConstructorClosed = true;

    }

    public static String setDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTodayAttendance = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel26MouseDragged(evt);
            }
        });
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel26MousePressed(evt);
            }
        });
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel13.setFont(new java.awt.Font("Raleway Light", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("_");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 20, 30));

        jLabel27.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 255, 102));
        jLabel27.setText("valid");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 90, 50));

        jLabel29.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 290, 30));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_2.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel31MouseExited(evt);
            }
        });
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/serach.png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel30MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        jLabel28.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 0, 0));
        jLabel28.setText("invalid");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 90, 50));

        jLabel2.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        jLabel2.setText("payroll system");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 20, -1));

        jLabel14.setFont(new java.awt.Font("Raleway Light", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("_");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 20, 30));

        jLabel3.setFont(new java.awt.Font("Raleway Light", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("attendance");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 20, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 740, 10));

        jPanel1.setOpaque(false);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 170, 70));

        jLabel5.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel5.setText("employee ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, 30));

        jTextField1.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 130, 30));

        jLabel6.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel6.setText("out time");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel9.setText("short leave in");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel10.setText("in time");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel11.setText("short leave out");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("short leave");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, -1, -1));

        jLabel15.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("total out");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, -1, -1));

        jLabel16.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("0");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 250, -1, -1));

        jLabel17.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("summary ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, -1, -1));

        jLabel18.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("0");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, -1, -1));

        jLabel19.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("0");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, -1, -1));

        jLabel20.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("total in");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, -1, -1));

        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 160, 180));

        jLabel22.setFont(new java.awt.Font("Raleway Thin", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 180, 60));

        jLabel23.setFont(new java.awt.Font("Raleway Thin", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 190, 60));

        jLabel24.setFont(new java.awt.Font("Raleway Thin", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 102, 0));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 220, 60));

        jLabel25.setFont(new java.awt.Font("Raleway Thin", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 102, 0));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 190, 40));

        tableTodayAttendance.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        tableTodayAttendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EID", "name", "in", "out"
            }
        ));
        jScrollPane1.setViewportView(tableTodayAttendance);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 830, 260));

        jLabel1.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backGround.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered

    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jLabel13.setVisible(true);
        jLabel14.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel7.setVisible(true);
        jLabel8.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel8.setVisible(true);
        jLabel7.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(true);
        jLabel31.setVisible(false);
        jLabel30.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        setState(ICONIFIED);

    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel26MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel26MouseDragged

    private void jLabel26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel26MousePressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

        try {
            jLabel27.setVisible(false);
            jLabel28.setVisible(false);
            jLabel25.setText("");
            jLabel24.setText("");
            jLabel23.setText("");
            jLabel22.setText("");
            Employee employee = EmployeeController.searchEmployee(jTextField1.getText());
            if (employee != null) {
                jLabel27.setVisible(true);
                jLabel29.setText(employee.getFirstName() + " " + employee.getSecondName());
                jLabel29.setVisible(true);
                payroll.model.Attendance attendance = AttendanceController.getEmployeeAttendance(jTextField1.getText(), dateValLable.getText());
                String text = withSecondsLable.getText();
                char[] time = {text.charAt(0), text.charAt(1), text.charAt(3), text.charAt(4), text.charAt(6), text.charAt(7)};
                String timeInt = "";
                for (int i = 0; i < time.length;i++) {
                        timeInt += time[i]; 
                }
                if (attendance != null && Integer.parseInt(timeInt) >= 170000) {
                    jLabel25.setText(attendance.getInTime());
                    jLabel22.setText(attendance.getShortLeaveOutTime());
                    jLabel23.setText(attendance.getShortLeaveInTime());
                    jLabel24.setText(withSecondsLable.getText());
                    int otHours = payrollMethods.getTimeHours(jLabel24.getText()) - payrollMethods.getTimeHours("170000");
                    int outTimeMinutes = payrollMethods.getTimeMinutes(jLabel24.getText());
                    if (outTimeMinutes > 45) {
                        otHours += 1;
                    }
                    attendance = new payroll.model.Attendance(jTextField1.getText(), dateValLable.getText(), jLabel25.getText(), jLabel22.getText(), jLabel23.getText(), jLabel24.getText(), otHours);
                    AttendanceController.updateAttendance(attendance);
                    jTextField1.setText("");
                } else if (attendance != null && attendance.getShortLeaveOutTime().equals("") && Integer.parseInt(timeInt) < 170000) {
                    jLabel25.setText(attendance.getInTime());
                    if (AttendanceController.getShortLeaveCount(jTextField1.getText()) > 2) {
                        payrollMethods.setHalfDay(jTextField1, dateValLable);
                    } else {
                        jLabel22.setText(withSecondsLable.getText());
                        attendance = new payroll.model.Attendance(jTextField1.getText(), dateValLable.getText(), jLabel25.getText(), jLabel22.getText(), jLabel23.getText(), jLabel24.getText(), 0);
                        AttendanceController.updateAttendance(attendance);
                        jTextField1.setText("");
                    }
                } else if (attendance != null && attendance.getShortLeaveOutTime() != null && Integer.parseInt(timeInt) < 170000) {
                    jLabel25.setText(attendance.getInTime());
                    jLabel22.setText(attendance.getShortLeaveOutTime());
                    jLabel23.setText(withSecondsLable.getText());
                    attendance = new payroll.model.Attendance(jTextField1.getText(), dateValLable.getText(), jLabel25.getText(), jLabel22.getText(), jLabel23.getText(), jLabel24.getText(), 0);
                    AttendanceController.updateAttendance(attendance);
                    jTextField1.setText("");
                } else if (attendance == null && Integer.parseInt(timeInt) > 81500 && Integer.parseInt(timeInt) < 93000) {
                    jLabel25.setText(withSecondsLable.getText());
                    jLabel22.setText("08.00.00");
                    jLabel23.setText(jLabel25.getText());
                    attendance = new payroll.model.Attendance(jTextField1.getText(), dateValLable.getText(), jLabel25.getText(), "08.00.00", jLabel23.getText(), jLabel24.getText(), 0);
                    AttendanceController.markAttendanceIn(attendance);
                    jTextField1.setText("");
                } else if (attendance == null && Integer.parseInt(timeInt) > 93000) {
                    jLabel25.setText(withSecondsLable.getText());
                    payrollMethods.setHalfDay(jTextField1, dateValLable);
                    attendance = new payroll.model.Attendance(jTextField1.getText(), dateValLable.getText(), jLabel25.getText(), jLabel22.getText(), jLabel23.getText(), jLabel24.getText(), 0);
                    AttendanceController.markAttendanceIn(attendance);
                    jTextField1.setText("");
                } else {
                    jLabel25.setText(withSecondsLable.getText());
                    attendance = new payroll.model.Attendance(jTextField1.getText(), dateValLable.getText(), jLabel25.getText(), jLabel22.getText(), jLabel23.getText(), jLabel24.getText(), 0);
                    AttendanceController.markAttendanceIn(attendance);
                    jTextField1.setText("");
                }
                payrollMethods.setTodayAttendance(dateValLable, tableTodayAttendance);
                payrollMethods.setTodaySummary(tableTodayAttendance, jLabel16, jLabel18, jLabel19);
                payrollMethods.checkShortLeave(dateValLable);
            } else {
                jLabel28.setVisible(true);
                jLabel29.setVisible(false);
                jTextField1.setText("");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.getStackTrace();
        }    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseEntered
        jLabel31.setVisible(true);
        jLabel30.setVisible(false);
    }//GEN-LAST:event_jLabel30MouseEntered

    private void jLabel31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseExited
        jLabel31.setVisible(false);
        jLabel30.setVisible(true);    }//GEN-LAST:event_jLabel31MouseExited

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        try {
            jLabel27.setVisible(false);
            jLabel28.setVisible(false);
            jLabel25.setText("");
            jLabel24.setText("");
            jLabel23.setText("");
            jLabel22.setText("");
            Employee employee = EmployeeController.searchEmployee(jTextField1.getText());
            if (employee != null) {
                jLabel27.setVisible(true);
                jLabel29.setText(employee.getFirstName() + " " + employee.getSecondName());
                jLabel29.setVisible(true);
                payroll.model.Attendance attendance = AttendanceController.getEmployeeAttendance(jTextField1.getText(), dateValLable.getText());
                String text = withSecondsLable.getText();
                char[] time = {text.charAt(0), text.charAt(1), text.charAt(3), text.charAt(4), text.charAt(6), text.charAt(7)};
                String timeInt = "";
                for (int i = 0; i < time.length;i++) {
                        timeInt += time[i];
                }
                if (attendance != null && Integer.parseInt(timeInt) >= 170000) {
                    jLabel25.setText(attendance.getInTime());
                    jLabel22.setText(attendance.getShortLeaveOutTime());
                    jLabel23.setText(attendance.getShortLeaveInTime());
                    jLabel24.setText(withSecondsLable.getText());
                    int otHours = payrollMethods.getTimeHours(jLabel24.getText()) - payrollMethods.getTimeHours("170000");
                    int outTimeMinutes = payrollMethods.getTimeMinutes(jLabel24.getText());
                    if (outTimeMinutes > 45) {
                        otHours += 1;
                    }
                    attendance = new payroll.model.Attendance(jTextField1.getText(), dateValLable.getText(), jLabel25.getText(), jLabel22.getText(), jLabel23.getText(), jLabel24.getText(), otHours);
                    AttendanceController.updateAttendance(attendance);
                    jTextField1.setText("");
                } else if (attendance != null && attendance.getShortLeaveOutTime().equals("") && Integer.parseInt(timeInt) < 170000) {
                    jLabel25.setText(attendance.getInTime());
                    if (AttendanceController.getShortLeaveCount(jTextField1.getText()) > 2) {
                        payrollMethods.setHalfDay(jTextField1, dateValLable);
                    } else {
                        jLabel22.setText(withSecondsLable.getText());
                        attendance = new payroll.model.Attendance(jTextField1.getText(), dateValLable.getText(), jLabel25.getText(), jLabel22.getText(), jLabel23.getText(), jLabel24.getText(), 0);
                        AttendanceController.updateAttendance(attendance);
                        jTextField1.setText("");
                    }
                } else if (attendance != null && attendance.getShortLeaveOutTime() != null && Integer.parseInt(timeInt) < 170000) {
                    jLabel25.setText(attendance.getInTime());
                    jLabel22.setText(attendance.getShortLeaveOutTime());
                    jLabel23.setText(withSecondsLable.getText());
                    attendance = new payroll.model.Attendance(jTextField1.getText(), dateValLable.getText(), jLabel25.getText(), jLabel22.getText(), jLabel23.getText(), jLabel24.getText(), 0);
                    AttendanceController.updateAttendance(attendance);
                    jTextField1.setText("");
                } else if (attendance == null && Integer.parseInt(timeInt) > 81500 && Integer.parseInt(timeInt) < 93000) {
                    jLabel25.setText(withSecondsLable.getText());
                    jLabel22.setText("08.00.00");
                    jLabel23.setText(jLabel25.getText());
                    attendance = new payroll.model.Attendance(jTextField1.getText(), dateValLable.getText(), jLabel25.getText(), "08.00.00", jLabel23.getText(), jLabel24.getText(), 0);
                    AttendanceController.markAttendanceIn(attendance);
                    jTextField1.setText("");
                } else if (attendance == null && Integer.parseInt(timeInt) > 93000) {
                    jLabel25.setText(withSecondsLable.getText());
                    payrollMethods.setHalfDay(jTextField1, dateValLable);
                    attendance = new payroll.model.Attendance(jTextField1.getText(), dateValLable.getText(), jLabel25.getText(), jLabel22.getText(), jLabel23.getText(), jLabel24.getText(), 0);
                    AttendanceController.markAttendanceIn(attendance);
                    jTextField1.setText("");
                } else {
                    jLabel25.setText(withSecondsLable.getText());
                    attendance = new payroll.model.Attendance(jTextField1.getText(), dateValLable.getText(), jLabel25.getText(), jLabel22.getText(), jLabel23.getText(), jLabel24.getText(), 0);
                    AttendanceController.markAttendanceIn(attendance);
                    jTextField1.setText("");
                }
                payrollMethods.setTodayAttendance(dateValLable, tableTodayAttendance);
                payrollMethods.setTodaySummary(tableTodayAttendance, jLabel16, jLabel18, jLabel19);
                payrollMethods.checkShortLeave(dateValLable);
            } else {
                jLabel28.setVisible(true);
                jLabel29.setVisible(false);
                jTextField1.setText("");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_jLabel31MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableTodayAttendance;
    // End of variables declaration//GEN-END:variables
}
