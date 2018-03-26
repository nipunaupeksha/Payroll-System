/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.gui;

import com.sun.glass.ui.Cursor;
import com.sun.glass.ui.Pixels;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.InputStream;
import java.sql.SQLException;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.Cursor.cursor;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import payroll.controller.AdvanceController;
import payroll.controller.AttendanceController;
import payroll.controller.BonusController;
import payroll.controller.DamageController;
import payroll.controller.EmployeeController;
import payroll.controller.GradeContoller;
import payroll.controller.LeavesController;
import payroll.controller.LoanController;
import payroll.controller.SalaryController;
import payroll.controller.SettingsController;
import payroll.methods.payrollMethods;
import payroll.model.Employee;
import payroll.model.Grade;
import payroll.model.Salary;
import payroll.model.Settings;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;
import payroll.dbconnector.DBConnection;

/**
 *
 * @author ASUS
 */
public class PaySalary extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private Date date = new Date();

    public PaySalary() {
        initComponents();
        try {
            Class.forName("ClockLabel");
        } catch (ClassNotFoundException e) {
        }
        ClockLabel dateLable = new ClockLabel("date");
        ClockLabel timeLable = new ClockLabel("time");
        ClockLabel dayLable = new ClockLabel("day");
        jPanel1.setLayout(new FlowLayout());
        jPanel1.add(timeLable);
        jPanel1.add(dateLable);
        jPanel1.add(dayLable);
        jLabel36.setVisible(false);
        jLabel48.setVisible(false);
        jLabel47.setVisible(true);
        jLabel9.setVisible(false);
        jLabel15.setVisible(false);
        jLabel5.setVisible(false);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/rsz_bleach_login.png")));
    }

    public static String setDate(java.util.Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel46 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel46MouseDragged(evt);
            }
        });
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel46MousePressed(evt);
            }
        });
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 60));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("view salary");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, 40));

        jLabel62.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 110, 40));

        jLabel63.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 110, 30));

        jLabel64.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 120, 40));

        jLabel65.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 120, 40));

        jLabel66.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 120, 40));

        jLabel67.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, 120, 30));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("salary advance");
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 210, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 740, 10));

        jLabel54.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 130, 30));

        jLabel55.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 130, 30));

        jLabel56.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 130, 30));

        jLabel57.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 130, 30));

        jLabel58.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 130, 30));

        jLabel59.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, 120, 30));

        jLabel60.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 620, 100, 50));

        jLabel61.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 120, 30));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("annual report");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 200, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("annual report");
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 210, 40));

        jLabel2.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        jLabel2.setText("payroll system");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

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
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 20, 60));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("salary advance");
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 40));

        jLabel7.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7MouseMoved(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 20, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("view salary");
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 210, 40));

        jLabel14.setFont(new java.awt.Font("Raleway Light", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("_");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 20, 60));

        jTextField1.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 110, 30));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_2.png"))); // NOI18N
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel48MouseExited(evt);
            }
        });
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        jLabel68.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(155, 36, 24));
        getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 590, 120, 30));

        jLabel3.setFont(new java.awt.Font("Raleway Light", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("pay salary");
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

        jPanel1.setOpaque(false);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 170, 70));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 230, 570));

        jLabel49.setBackground(new java.awt.Color(153, 153, 153));
        jLabel49.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("back");
        jLabel49.setOpaque(true);
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel49MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, 70, -1));

        jLabel36.setBackground(new java.awt.Color(0, 0, 0));
        jLabel36.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("back");
        jLabel36.setOpaque(true);
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel36MouseExited(evt);
            }
        });
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, 70, -1));

        jLabel16.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel16.setText("employee details");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 180, 30));

        jLabel18.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel18.setText("employee ID");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 130, 40));

        jLabel19.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel19.setText("account number");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 150, 50));

        jLabel20.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel20.setText("department");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 130, 50));

        jLabel21.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel21.setText("bank");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 130, 50));

        jLabel22.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel22.setText("deductions");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 180, 30));

        jLabel23.setFont(new java.awt.Font("Raleway Thin", 1, 24)); // NOI18N
        jLabel23.setText("net salary");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 150, 50));

        jLabel26.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel26.setText("salary advance");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 130, 30));

        jLabel27.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel27.setText("damages");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 130, 30));

        jLabel28.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel28.setText("epf");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 130, 30));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/serach.png"))); // NOI18N
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel47MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        jLabel29.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel29.setText("total deductions");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 160, 30));

        jLabel51.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 340, 30));

        jLabel69.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(888, 100, 80, 40));

        jLabel52.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 170, 50));

        jLabel53.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 120, 50));

        jLabel30.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel30.setText("tax");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 590, 130, 30));

        jLabel31.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel31.setText("no pay");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 130, 30));

        jLabel50.setFont(new java.awt.Font("Raleway Light", 3, 18)); // NOI18N
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 340, 30));

        jLabel32.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel32.setText("loan");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 130, 30));

        jLabel35.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel35.setText("bonus");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 130, 30));

        jLabel37.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel37.setText("transport");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 130, 40));

        jLabel38.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel38.setText("incentives");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 130, 30));

        jLabel39.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel39.setText("ot");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 130, 40));

        jLabel42.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("cancel");
        jLabel42.setToolTipText("");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel42MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel42MouseExited(evt);
            }
        });
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, 100, -1));

        jLabel33.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel33.setText("etf");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 130, 30));

        jLabel40.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel40.setText("total earnings");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 130, 40));

        jLabel43.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("save");
        jLabel43.setToolTipText("");
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel43MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel43MouseExited(evt);
            }
        });
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, 100, -1));

        jLabel41.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel41.setText("earnings");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 180, 30));

        jLabel34.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel34.setText("basic salary");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 130, 30));

        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 280, 230));

        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 580, 280, 90));

        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 300, 330));

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 710, 150));

        jLabel45.setBackground(new java.awt.Color(153, 153, 153));
        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel45.setOpaque(true);
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel45MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 740, 610));

        jLabel1.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backGround.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setVisible(false);
        jLabel9.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jLabel15.setVisible(false);
        jLabel12.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel5.setVisible(true);
        jLabel10.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered

    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setVisible(false);
        jLabel10.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setVisible(false);
        jLabel15.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new OptionPane_1_close().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel6.setVisible(true);
        jLabel9.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

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

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel9.setVisible(false);
        jLabel15.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(true);
        jLabel12.setVisible(true);
        jLabel10.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseEntered
        jLabel49.setVisible(false);
        jLabel36.setVisible(true);
    }//GEN-LAST:event_jLabel49MouseEntered

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseExited
        jLabel49.setVisible(true);
        jLabel36.setVisible(false);
    }//GEN-LAST:event_jLabel36MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel8.setVisible(true);
        jLabel7.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(true);
        jLabel6.setVisible(true);
        jLabel9.setVisible(false);
        jLabel10.setVisible(true);
        jLabel5.setVisible(false);
        jLabel12.setVisible(true);
        jLabel15.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseEntered
        jLabel43.setFont(new Font("Raleway Light", 1, 18));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel43MouseEntered

    private void jLabel43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseExited
        jLabel43.setFont(new Font("Raleway Light", 0, 18));          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel43MouseExited

    private void jLabel42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseEntered
        jLabel42.setFont(new Font("Raleway Light", 1, 18));          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel42MouseEntered

    private void jLabel42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseExited
        jLabel42.setFont(new Font("Raleway Light", 0, 18));         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel42MouseExited

    private void jLabel46MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel46MouseDragged

    private void jLabel46MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel46MousePressed

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited

    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered

    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseMoved

    }//GEN-LAST:event_jLabel7MouseMoved

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.dispose();
        new ViewSalary().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.dispose();
        new SalaryAdvance().setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
        new AnnualSalaryReport().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        this.dispose();
        new PaySalary().setVisible(true);
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        try {
            if (!"".equals(jTextField1.getText())) {
                Employee employee = EmployeeController.searchEmployee(jTextField1.getText());
                if (employee != null) {

                    Salary salary = new Salary(jLabel69.getText(), jTextField1.getText(), setDate(date), Double.parseDouble(jLabel61.getText()), Double.parseDouble(jLabel54.getText()), Double.parseDouble(jLabel55.getText()), Double.parseDouble(jLabel56.getText()), Double.parseDouble(jLabel57.getText()), Double.parseDouble(jLabel58.getText()), Double.parseDouble(jLabel59.getText()), Double.parseDouble(jLabel67.getText()), Double.parseDouble(jLabel62.getText()), Double.parseDouble(jLabel63.getText()), Double.parseDouble(jLabel64.getText()), Double.parseDouble(jLabel65.getText()), Double.parseDouble(jLabel66.getText()), Double.parseDouble(jLabel60.getText()), Double.parseDouble(jLabel68.getText()));
                    boolean b1 = SalaryController.salarySearch(jLabel69.getText(), jTextField1.getText(), Integer.parseInt(setDate(date).substring(5, 7)));
                    if (b1 == true) {
                        boolean b = SalaryController.salaryAdded(salary);
                        if (b == true) {
                            JOptionPane.showMessageDialog(this, "Salary saved !");
                            //JRTableModelDataSource dataSource=new JRTableModelDataSource(dtm);
                            try {
                                InputStream is = getClass().getResourceAsStream("paySalary.jrxml");
                                JasperReport jr = JasperCompileManager.compileReport(is);
                                HashMap hm = new HashMap();
                                String txt = jTextField1.getText();
                                hm.put("param1", txt);
                                JasperPrint jp = JasperFillManager.fillReport(jr, hm);
                                JasperViewer.viewReport(jp);
                            } catch (JRException e) {
                                e.getStackTrace();
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "Salary not saved !");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid salary !");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Employee not found !");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Input employeeId !");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.getStackTrace();
        }

    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseExited
        jLabel47.setVisible(true);
        jLabel48.setVisible(false);
    }//GEN-LAST:event_jLabel48MouseExited

    private void jLabel47MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseEntered
        jLabel48.setVisible(true);
        jLabel47.setVisible(false);
    }//GEN-LAST:event_jLabel47MouseEntered

    private void jLabel45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseEntered
        jLabel48.setVisible(false);
        jLabel47.setVisible(true);
    }//GEN-LAST:event_jLabel45MouseEntered

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        try {
            Employee employee = EmployeeController.searchEmployee(jTextField1.getText());
            if (employee != null) {
                Grade grade = GradeContoller.getGradeDetails(employee.getGradeId());
                Settings settings = SettingsController.getAllSettings();
                jLabel50.setText(employee.getFirstName() + " " + employee.getSecondName());
                jLabel53.setText(employee.getBank());
                jLabel51.setText(employee.getAccNum());
                jLabel67.setText(Double.toString(employee.getBasicSalary()));
                jLabel52.setText(payrollMethods.getDepartmentName(jTextField1));

                //Deductions
                jLabel61.setText(Double.toString(AdvanceController.getMonthAdvance(jTextField1.getText())) + 0);
                jLabel54.setText(Double.toString(LoanController.getMonthlyInstallment(jTextField1.getText())) + 0);
                jLabel56.setText(Double.toString(DamageController.getMonthlyDeduction(jTextField1.getText())) + 0);
                jLabel57.setText(Double.toString(employee.getBasicSalary() * settings.getEtfRate()) + 0);
                jLabel58.setText(Double.toString(employee.getBasicSalary() * settings.getEpfRate()) + 0);
                double tax = 0;
                if (employee.getBasicSalary() * 12 > settings.getYearlyIncome()) {
                    tax = employee.getBasicSalary() * settings.getTaxRate();
                }
                jLabel59.setText(Double.toString(tax) + 0);
                int noPayCount = LeavesController.getLeaveCount(jTextField1.getText(), "No Pay");
                jLabel55.setText(Double.toString(noPayCount * grade.getNoPayRate()) + 0);
                double totalDeductions = Double.parseDouble(jLabel61.getText()) + Double.parseDouble(jLabel54.getText()) + Double.parseDouble(jLabel55.getText()) + Double.parseDouble(jLabel56.getText()) + Double.parseDouble(jLabel57.getText()) + Double.parseDouble(jLabel58.getText()) + Double.parseDouble(jLabel59.getText());
                jLabel60.setText(Double.toString(totalDeductions) + 0);

                //Earnings
                jLabel62.setText(Double.toString((AttendanceController.getNormalOt(jTextField1.getText()) * grade.getNormalOtAmount()) + (AttendanceController.getWeekendOt(jTextField1.getText()) * grade.getWeekendOtAmount())) + 0);
                double bonus = BonusController.getTotalBonus(employee.getGradeId());
                int monthlyAllLeaveCount = LeavesController.getMonthlyAllLeaveCount(jTextField1.getText());
                double attendanceInsentives = 0;
                if (monthlyAllLeaveCount == 0) {
                    attendanceInsentives += settings.getAttendanceInsentive1();
                } else if (monthlyAllLeaveCount == 2) {
                    attendanceInsentives += settings.getAttendanceInsentive2();
                } else if (monthlyAllLeaveCount == 5) {
                    attendanceInsentives += settings.getAttendanceInsentive3();
                }
                jLabel65.setText(Double.toString(attendanceInsentives) + 0);
                jLabel63.setText(Double.toString(bonus) + 0);
                double transport = 0;
                if (employee.getTransportType() == 1) {
                    transport += grade.getVehicleAllowences();
                } else if (employee.getTransportType() == 3) {
                    transport += grade.getVehicleAllowences();
                }
                jLabel64.setText(Double.toString(transport) + 0);
                double totalEarnings = Double.parseDouble(jLabel67.getText()) + Double.parseDouble(jLabel62.getText()) + Double.parseDouble(jLabel63.getText()) + Double.parseDouble(jLabel64.getText()) + Double.parseDouble(jLabel65.getText());
                jLabel66.setText(Double.toString(totalEarnings) + 0);

                //NetSalary
                double netSalary = totalEarnings - totalDeductions;
                jLabel68.setText(Double.toString(netSalary) + 0);
                try {
                    payrollMethods.getNewId(jLabel69, "S", "salary");
                } catch (ClassNotFoundException | SQLException e) {
                    e.getStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Employee Not Found!", "Sorry", 2);
            }
        } catch (ClassNotFoundException e) {
            Logger.getLogger(PaySalary.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(PaySalary.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        try {
            Employee employee = EmployeeController.searchEmployee(jTextField1.getText());
            if (employee != null) {
                Grade grade = GradeContoller.getGradeDetails(employee.getGradeId());
                Settings settings = SettingsController.getAllSettings();
                jLabel50.setText(employee.getFirstName() + " " + employee.getSecondName());
                jLabel53.setText(employee.getBank());
                jLabel51.setText(employee.getAccNum());
                jLabel67.setText(Double.toString(employee.getBasicSalary()));
                jLabel52.setText(payrollMethods.getDepartmentName(jTextField1));

                //Deductions
                jLabel61.setText(Double.toString(AdvanceController.getMonthAdvance(jTextField1.getText())) + 0);
                jLabel54.setText(Double.toString(LoanController.getMonthlyInstallment(jTextField1.getText())) + 0);
                jLabel56.setText(Double.toString(DamageController.getMonthlyDeduction(jTextField1.getText())) + 0);
                jLabel57.setText(Double.toString(employee.getBasicSalary() * settings.getEtfRate()) + 0);
                jLabel58.setText(Double.toString(employee.getBasicSalary() * settings.getEpfRate()) + 0);
                double tax = 0;
                if (employee.getBasicSalary() * 12 > settings.getYearlyIncome()) {
                    tax = employee.getBasicSalary() * settings.getTaxRate();
                }
                jLabel59.setText(Double.toString(tax) + 0);
                int noPayCount = LeavesController.getLeaveCount(jTextField1.getText(), "No Pay");
                jLabel55.setText(Double.toString(noPayCount * grade.getNoPayRate()) + 0);
                double totalDeductions = Double.parseDouble(jLabel61.getText()) + Double.parseDouble(jLabel54.getText()) + Double.parseDouble(jLabel55.getText()) + Double.parseDouble(jLabel56.getText()) + Double.parseDouble(jLabel57.getText()) + Double.parseDouble(jLabel58.getText()) + Double.parseDouble(jLabel59.getText());
                jLabel60.setText(Double.toString(totalDeductions) + 0);

                //Earnings
                jLabel62.setText(Double.toString((AttendanceController.getNormalOt(jTextField1.getText()) * grade.getNormalOtAmount()) + (AttendanceController.getWeekendOt(jTextField1.getText()) * grade.getWeekendOtAmount())) + 0);
                double bonus = BonusController.getTotalBonus(employee.getGradeId());
                int monthlyAllLeaveCount = LeavesController.getMonthlyAllLeaveCount(jTextField1.getText());
                double attendanceInsentives = 0;
                if (monthlyAllLeaveCount == 0) {
                    attendanceInsentives += settings.getAttendanceInsentive1();
                } else if (monthlyAllLeaveCount == 2) {
                    attendanceInsentives += settings.getAttendanceInsentive2();
                } else if (monthlyAllLeaveCount == 5) {
                    attendanceInsentives += settings.getAttendanceInsentive3();
                }
                jLabel65.setText(Double.toString(attendanceInsentives) + 0);
                jLabel63.setText(Double.toString(bonus) + 0);
                double transport = 0;
                if (employee.getTransportType() == 1) {
                    transport += grade.getVehicleAllowences();
                } else if (employee.getTransportType() == 3) {
                    transport += grade.getVehicleAllowences();
                }
                jLabel64.setText(Double.toString(transport) + 0);
                double totalEarnings = Double.parseDouble(jLabel67.getText()) + Double.parseDouble(jLabel62.getText()) + Double.parseDouble(jLabel63.getText()) + Double.parseDouble(jLabel64.getText()) + Double.parseDouble(jLabel65.getText());
                jLabel66.setText(Double.toString(totalEarnings) + 0);

                //NetSalary
                double netSalary = totalEarnings - totalDeductions;
                jLabel68.setText(Double.toString(netSalary) + 0);

            } else {
                JOptionPane.showMessageDialog(this, "Employee Not Found!", "Sorry", 2);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PaySalary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel48MouseClicked

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
            java.util.logging.Logger.getLogger(PaySalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaySalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaySalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaySalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PaySalary().setVisible(true);
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
