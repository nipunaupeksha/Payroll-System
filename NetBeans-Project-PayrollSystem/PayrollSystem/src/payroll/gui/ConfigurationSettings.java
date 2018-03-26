/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.gui;

import java.awt.FlowLayout;
import java.sql.*;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import payroll.controller.BonusTypeController;
import payroll.controller.DepartmentController;
import payroll.controller.GradeContoller;
import payroll.controller.RoleContoller;
import payroll.controller.SettingsController;
import payroll.methods.payrollMethods;
import payroll.model.BonusType;
import payroll.model.Department;
import payroll.model.Grade;
import payroll.model.Role;
import payroll.model.Settings;
import payroll.dbconnector.*;

/**
 *
 * @author ASUS
 */
public class ConfigurationSettings extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    boolean isNewGradeClicked = false;
    boolean isNewDepartmentClicked = false;
    boolean isNewRoleClicked = false;
    boolean isNewBonusClicked = false;
    private boolean isConstructorClosed = false;
    /*jLabel33 and jLabel71 are save labels.33 works with general and 71 works with advanced*/

    public ConfigurationSettings() {
        initComponents();
        try {
            Class.forName("ClockLabel");
        } catch (ClassNotFoundException e) {
            e.getStackTrace();
        }
        ClockLabel dateLable = new ClockLabel("date");
        ClockLabel timeLable = new ClockLabel("time");
        ClockLabel dayLable = new ClockLabel("day");
        jPanel1.setLayout(new FlowLayout());
        jPanel1.add(timeLable);
        jPanel1.add(dateLable);
        jPanel1.add(dayLable);
        setLocation(100, 100);
        jLabel8.setVisible(true);
        jLabel7.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(true);
        /*mouse clicked on advanced*/
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel15.setVisible(false);
        jLabel48.setVisible(false);
        jLabel69.setVisible(false);
        jLabel70.setVisible(false);
        jLabel67.setVisible(false);
        jLabel67.setVisible(false);
        jLabel65.setVisible(false);
        jLabel56.setVisible(false);
        jLabel58.setVisible(false);
        jLabel57.setVisible(false);
        jLabel59.setVisible(false);
        jLabel60.setVisible(false);
        jLabel49.setVisible(false);
        jLabel50.setVisible(false);
        jLabel51.setVisible(false);
        jLabel52.setVisible(false);
        jLabel54.setVisible(false);
        jLabel53.setVisible(false);
        jLabel61.setVisible(false);
        jLabel62.setVisible(false);
        jLabel63.setVisible(false);
        jLabel64.setVisible(false);
        jLabel66.setVisible(false);
        jLabel68.setVisible(false);
        jLabel55.setVisible(false);
        jLabel47.setVisible(false);
        jLabel71.setVisible(false);
        jTextField13.setVisible(false);
        jTextField14.setVisible(false);
        jTextField15.setVisible(false);
        jTextField16.setVisible(false);
        jTextField17.setVisible(false);
        jTextField18.setVisible(false);
        jTextField19.setVisible(false);
        jTextField20.setVisible(false);
        jTextField21.setVisible(false);
        jTextField22.setVisible(false);
        jTextField23.setVisible(false);
        jTextField24.setVisible(false);
        jTextField25.setVisible(false);
        jTextField26.setVisible(false);
        jTextField27.setVisible(false);
        try {
            payrollMethods.fillGradeCombo(jComboBox4);
            payrollMethods.fillDepartmentCombo(jComboBox2);
            payrollMethods.fillGradeCombo(jComboBox1);
            payrollMethods.fillRoleCombo(jComboBox3);

        } catch (ClassNotFoundException | SQLException ex) {
        }
        jComboBox1.requestFocus();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/rsz_bleach_login.png")));
        isConstructorClosed = true;
    }

    public String setDigitsOnly(String text) {
        return text.replaceAll("[^0-9]*", "");
    }

    private void setSettings() {
        try {
            Settings settings = SettingsController.getAllSettings();
            jTextField13.setText(Integer.toString(settings.getMaxHalfDayLeaves()));
            jTextField27.setText(Integer.toString(settings.getMaxCasualLeave()));
            jTextField25.setText(Integer.toString(settings.getMaxMedicalLeaves()));
            jTextField15.setText(Integer.toString(settings.getMaxVacationLeaves()));
            jTextField14.setText(Integer.toString(settings.getMaxPregnantLeaves()));
            jTextField16.setText(Integer.toString(settings.getAllMaximumLeaves()));
            jTextField17.setText(Double.toString(settings.getEtfRate() * 100));
            jTextField18.setText(Double.toString(settings.getEpfRate() * 100));
            jTextField19.setText(Double.toString(settings.getLoanRate()));
            jTextField26.setText(Double.toString(settings.getDamageRate()));
            jTextField20.setText(Double.toString(settings.getAttendanceInsentive1()));
            jTextField21.setText(Double.toString(settings.getAttendanceInsentive2()));
            jTextField22.setText(Double.toString(settings.getAttendanceInsentive3()));
            jTextField23.setText(Double.toString(settings.getTaxRate() * 100));
            jTextField24.setText(Double.toString(settings.getYearlyIncome()));
        } catch (ClassNotFoundException | SQLException ex) {
            ex.getStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel72 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel72MouseDragged(evt);
            }
        });
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel72MousePressed(evt);
            }
        });
        getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        jLabel80.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("new");
        jLabel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel80MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel80MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel80MouseExited(evt);
            }
        });
        getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, 60, 30));

        jLabel74.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("new");
        jLabel74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel74MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel74MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel74MouseExited(evt);
            }
        });
        getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 60, 30));

        jLabel77.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 140, 30));

        jLabel78.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, 140, 30));

        jLabel79.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 140, 30));

        jLabel76.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 100, 30));

        jTextField13.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 70, -1));

        jTextField14.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 70, -1));

        jTextField15.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 70, -1));

        jTextField16.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 70, -1));

        jTextField17.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, 90, -1));

        jTextField18.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 90, -1));

        jTextField19.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, 90, -1));

        jTextField20.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 110, -1));

        jTextField21.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 110, -1));

        jTextField22.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, 110, -1));

        jTextField23.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 190, -1));

        jTextField24.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 190, -1));

        jTextField25.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 70, -1));

        jTextField26.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 90, -1));

        jTextField27.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 70, -1));

        jLabel73.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("new");
        jLabel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel73MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel73MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel73MouseExited(evt);
            }
        });
        getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 259, 60, 30));

        jComboBox4.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 320, -1));

        jComboBox2.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 290, -1));

        jComboBox3.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 340, -1));

        jComboBox1.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 140, -1));

        jTextField9.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 230, -1));

        jTextField10.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 290, -1));

        jTextField11.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 605, 180, -1));

        jTextField12.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 640, 180, -1));

        jTextField2.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 110, -1));

        jTextField3.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 110, -1));

        jTextField4.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 110, -1));

        jTextField5.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 110, -1));

        jTextField6.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 600, 110, -1));

        jTextField8.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 110, -1));

        jTextField1.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 180, -1));

        jLabel3.setFont(new java.awt.Font("Raleway Light", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("configuration settings");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        jLabel2.setText("payroll system");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 740, 10));

        jLabel7.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 20, -1));

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
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 20, 60));

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setOpaque(false);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 170, 70));

        jLabel25.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel25.setText("grade ID");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 100, 30));

        jLabel26.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel26.setText("grade name");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 110, 30));

        jLabel27.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel27.setText("no pay rate %");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 120, 30));

        jLabel28.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel28.setText("normal ot amount");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 160, 30));

        jLabel29.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel29.setText("weekend ot amount");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 180, 30));

        jLabel30.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel30.setText("max loan amount");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 170, 30));

        jLabel31.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel31.setText("max advance rate %");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 190, 30));

        jLabel24.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel24.setText("grade");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 60, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 30, 540));

        jLabel21.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel21.setText("role settings");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, 30));

        jLabel33.setFont(new java.awt.Font("Raleway Thin", 0, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("save");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel33MouseExited(evt);
            }
        });
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 640, 80, 30));

        jLabel22.setFont(new java.awt.Font("Raleway Thin", 1, 18)); // NOI18N
        jLabel22.setText("bonus settings");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, 30));

        jLabel23.setFont(new java.awt.Font("Raleway Thin", 1, 18)); // NOI18N
        jLabel23.setText("department settings");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, 30));

        jLabel34.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel34.setText("department  ID ");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 140, 30));

        jLabel35.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel35.setText("department name");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 160, 30));

        jLabel36.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel36.setText("department");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 110, 30));

        jLabel37.setFont(new java.awt.Font("Raleway Thin", 0, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("save");
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel37MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel37MouseExited(evt);
            }
        });
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, 80, 30));

        jLabel38.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel38.setText("role ID");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 110, 30));

        jLabel39.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel39.setText("role name");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 110, 30));

        jLabel40.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel40.setText("role");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 110, 30));

        jLabel41.setFont(new java.awt.Font("Raleway Thin", 0, 18)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("save");
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel41MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel41MouseExited(evt);
            }
        });
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, 80, 30));

        jLabel42.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel42.setText("grade ID");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 110, 40));

        jLabel43.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel43.setText("bonus type");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 110, 40));

        jLabel44.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel44.setText("amount");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, 110, 50));

        jLabel45.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel45.setText("grade");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 110, 30));

        jLabel46.setFont(new java.awt.Font("Raleway Thin", 0, 18)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("save");
        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel46MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel46MouseExited(evt);
            }
        });
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 80, 30));

        jLabel48.setFont(new java.awt.Font("Raleway Thin", 1, 18)); // NOI18N
        jLabel48.setText("leaves");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 30));

        jLabel49.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel49.setText("maximum halfday leaves");
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 220, 30));

        jLabel50.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel50.setText("maximum medical leaves");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 220, 30));

        jLabel51.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel51.setText("maximum vacation leaves");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 220, 30));

        jLabel75.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(204, 204, 204));
        jLabel75.setText("* don't include percentage mark at any cost");
        getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 350, 40));

        jLabel52.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel52.setText("maximum pregnant leaves");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 230, 30));

        jLabel53.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel53.setText("all maximum leaves");
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 220, 30));

        jLabel54.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel54.setText("maximum casual leaves");
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 220, 30));

        jLabel56.setFont(new java.awt.Font("Raleway Thin", 1, 18)); // NOI18N
        jLabel56.setText("other rates");
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, 30));

        jLabel57.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel57.setText("epf rate %");
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 160, 50));

        jLabel58.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel58.setText("loan rate %");
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 160, 30));

        jLabel59.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel59.setText("damage rate %");
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, 160, 30));

        jLabel60.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel60.setText("etf rate %");
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 160, 30));

        jLabel61.setFont(new java.awt.Font("Raleway Thin", 1, 18)); // NOI18N
        jLabel61.setText("incentives");
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, 30));

        jLabel62.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel62.setText("incentive for attendance (5 days)");
        getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, 30));

        jLabel63.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel63.setText("incentive for attendance (2 days)");
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 290, 30));

        jLabel64.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel64.setText("incentive for non-absentees");
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 260, 30));

        jLabel65.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel65.setText("tax");
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, 30));

        jLabel67.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel67.setText("yearly income");
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 140, 30));

        jLabel68.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel68.setText("tax rate %");
        getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 110, 30));

        jLabel69.setFont(new java.awt.Font("Raleway Thin", 0, 18)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("restore");
        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel69MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel69MouseExited(evt);
            }
        });
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 640, 80, 30));

        jLabel70.setFont(new java.awt.Font("Raleway Thin", 0, 18)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("backup");
        jLabel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel70MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel70MouseExited(evt);
            }
        });
        getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 640, 80, 30));

        jLabel71.setFont(new java.awt.Font("Raleway Thin", 0, 18)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("save");
        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel71MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel71MouseExited(evt);
            }
        });
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 640, 80, 30));

        jLabel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 520, 90));

        jLabel32.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel32.setText("vehicle allowances");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 170, 50));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 180, 30));

        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 320, 430));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 30, 40));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 30, 550));

        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 320, 260));

        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 320, 140));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/advance1.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/general1.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 520, 150));

        jLabel20.setFont(new java.awt.Font("Raleway Thin", 1, 18)); // NOI18N
        jLabel20.setText("grade settings");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 30));

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 520, 130));

        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 520, 140));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 960, 540));

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

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel8.setVisible(true);
        jLabel7.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();//add optionPane to show they haven't been saved
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel7.setVisible(true);
        jLabel8.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel8.setVisible(true);
        jLabel7.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
       
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jLabel13.setVisible(true);
        jLabel14.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseEntered
        jLabel33.setFont(new Font("Raleway Thin", 1, 18));      
    }//GEN-LAST:event_jLabel33MouseEntered

    private void jLabel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseExited
        jLabel33.setFont(new Font("Raleway Thin", 0, 18));  
    }//GEN-LAST:event_jLabel33MouseExited

    private void jLabel37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseEntered
        jLabel37.setFont(new Font("Raleway Light", 1, 18));
    }//GEN-LAST:event_jLabel37MouseEntered

    private void jLabel37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseExited
        jLabel37.setFont(new Font("Raleway Thin", 0, 18));    }//GEN-LAST:event_jLabel37MouseExited

    private void jLabel41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseEntered
        jLabel41.setFont(new Font("Raleway Thin", 1, 18));    }//GEN-LAST:event_jLabel41MouseEntered

    private void jLabel41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseExited
        jLabel41.setFont(new Font("Raleway Thin", 0, 18));    }//GEN-LAST:event_jLabel41MouseExited

    private void jLabel46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseEntered
        jLabel46.setFont(new Font("Raleway Light", 1, 18));
    }//GEN-LAST:event_jLabel46MouseEntered

    private void jLabel46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseExited
        jLabel46.setFont(new Font("Raleway Light", 0, 18));
    }//GEN-LAST:event_jLabel46MouseExited

    private void jLabel69MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseEntered
        jLabel69.setFont(new Font("Raleway Light", 1, 18));
    }//GEN-LAST:event_jLabel69MouseEntered

    private void jLabel69MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseExited
        jLabel69.setFont(new Font("Raleway Light", 0, 18));
    }//GEN-LAST:event_jLabel69MouseExited

    private void jLabel70MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseEntered
        jLabel70.setFont(new Font("Raleway Light", 1, 18));
    }//GEN-LAST:event_jLabel70MouseEntered

    private void jLabel70MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseExited
        jLabel70.setFont(new Font("Raleway Light", 0, 18));
    }//GEN-LAST:event_jLabel70MouseExited

    private void jLabel71MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseEntered
        jLabel71.setFont(new Font("Raleway Thin", 1, 18));
    }//GEN-LAST:event_jLabel71MouseEntered

    private void jLabel71MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseExited
        jLabel71.setFont(new Font("Raleway Thin", 0, 18));    }//GEN-LAST:event_jLabel71MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel72MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel72MouseDragged

    private void jLabel72MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel72MousePressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        jLabel10.setVisible(false);
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
        jLabel24.setVisible(false);
        jLabel25.setVisible(false);
        jLabel26.setVisible(false);
        jLabel27.setVisible(false);
        jLabel28.setVisible(false);
        jLabel29.setVisible(false);
        jLabel30.setVisible(false);
        jLabel31.setVisible(false);
        jLabel32.setVisible(false);
        jLabel34.setVisible(false);
        jLabel35.setVisible(false);
        jLabel36.setVisible(false);
        jLabel37.setVisible(false);
        jLabel38.setVisible(false);
        jLabel39.setVisible(false);
        jLabel40.setVisible(false);
        jLabel41.setVisible(false);
        jLabel42.setVisible(false);
        jLabel43.setVisible(false);
        jLabel44.setVisible(false);
        jLabel45.setVisible(false);
        jLabel46.setVisible(false);
        jLabel33.setVisible(false);
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jComboBox4.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jTextField8.setVisible(false);
        jTextField9.setVisible(false);
        jTextField10.setVisible(false);
        jTextField11.setVisible(false);
        jTextField12.setVisible(false);
        jLabel73.setVisible(false);
        jLabel74.setVisible(false);
        jLabel76.setVisible(false);
        jLabel77.setVisible(false);
        jLabel78.setVisible(false);
        jLabel79.setVisible(false);
        jLabel80.setVisible(false);

        /*mouse clicked advanced*/
        jLabel11.setVisible(true);
        jLabel12.setVisible(true);
        jLabel15.setVisible(true);
        jLabel48.setVisible(true);
        jLabel69.setVisible(true);
        jLabel70.setVisible(true);
        jLabel67.setVisible(true);
        jLabel67.setVisible(true);
        jLabel65.setVisible(true);
        jLabel56.setVisible(true);
        jLabel58.setVisible(true);
        jLabel57.setVisible(true);
        jLabel59.setVisible(true);
        jLabel60.setVisible(true);
        jLabel49.setVisible(true);
        jLabel50.setVisible(true);
        jLabel51.setVisible(true);
        jLabel52.setVisible(true);
        jLabel54.setVisible(true);
        jLabel53.setVisible(true);
        jLabel61.setVisible(true);
        jLabel62.setVisible(true);
        jLabel63.setVisible(true);
        jLabel64.setVisible(true);
        jLabel66.setVisible(true);
        jLabel68.setVisible(true);
        jLabel55.setVisible(true);
        jLabel47.setVisible(true);
        jLabel71.setVisible(true);
        jTextField13.setVisible(true);
        jTextField14.setVisible(true);
        jTextField15.setVisible(true);
        jTextField16.setVisible(true);
        jTextField17.setVisible(true);
        jTextField18.setVisible(true);
        jTextField19.setVisible(true);
        jTextField20.setVisible(true);
        jTextField21.setVisible(true);
        jTextField22.setVisible(true);
        jTextField23.setVisible(true);
        jTextField24.setVisible(true);
        jTextField25.setVisible(true);
        jTextField26.setVisible(true);
        jTextField27.setVisible(true);
        jTextField13.requestFocus();


    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jComboBox1.requestFocus();
        jLabel10.setVisible(true);
        jLabel16.setVisible(true);
        jLabel17.setVisible(true);
        jLabel19.setVisible(true);
        jLabel20.setVisible(true);
        jLabel21.setVisible(true);
        jLabel22.setVisible(true);
        jLabel23.setVisible(true);
        jLabel24.setVisible(true);
        jLabel25.setVisible(true);
        jLabel26.setVisible(true);
        jLabel27.setVisible(true);
        jLabel28.setVisible(true);
        jLabel29.setVisible(true);
        jLabel30.setVisible(true);
        jLabel31.setVisible(true);
        jLabel32.setVisible(true);
        jLabel34.setVisible(true);
        jLabel35.setVisible(true);
        jLabel36.setVisible(true);
        jLabel37.setVisible(true);
        jLabel38.setVisible(true);
        jLabel39.setVisible(true);
        jLabel40.setVisible(true);
        jLabel41.setVisible(true);
        jLabel42.setVisible(true);
        jLabel43.setVisible(true);
        jLabel44.setVisible(true);
        jLabel45.setVisible(true);
        jLabel46.setVisible(true);
        jLabel33.setVisible(true);
        jComboBox1.setVisible(true);
        jComboBox2.setVisible(true);
        jComboBox3.setVisible(true);
        jComboBox4.setVisible(true);
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);
        jTextField8.setVisible(true);
        jTextField9.setVisible(true);
        jTextField10.setVisible(true);
        jTextField11.setVisible(true);
        jTextField12.setVisible(true);
        jLabel73.setVisible(true);
        jLabel74.setVisible(true);
        jLabel76.setVisible(true);
        jLabel77.setVisible(true);
        jLabel78.setVisible(true);
        jLabel79.setVisible(true);
        jLabel80.setVisible(true);
        /*mouse clicked general*/
        jLabel11.setVisible(false);
        jLabel71.setVisible(false);
        jLabel12.setVisible(false);
        jLabel15.setVisible(false);
        jLabel48.setVisible(false);
        jLabel69.setVisible(false);
        jLabel70.setVisible(false);
        jLabel67.setVisible(false);
        jLabel67.setVisible(false);
        jLabel65.setVisible(false);
        jLabel56.setVisible(false);
        jLabel58.setVisible(false);
        jLabel57.setVisible(false);
        jLabel59.setVisible(false);
        jLabel60.setVisible(false);
        jLabel49.setVisible(false);
        jLabel50.setVisible(false);
        jLabel51.setVisible(false);
        jLabel52.setVisible(false);
        jLabel54.setVisible(false);
        jLabel53.setVisible(false);
        jLabel61.setVisible(false);
        jLabel62.setVisible(false);
        jLabel63.setVisible(false);
        jLabel64.setVisible(false);
        jLabel66.setVisible(false);
        jLabel68.setVisible(false);
        jLabel55.setVisible(false);
        jLabel47.setVisible(false);
        jTextField13.setVisible(false);
        jTextField14.setVisible(false);
        jTextField15.setVisible(false);
        jTextField16.setVisible(false);
        jTextField17.setVisible(false);
        jTextField18.setVisible(false);
        jTextField19.setVisible(false);
        jTextField20.setVisible(false);
        jTextField21.setVisible(false);
        jTextField22.setVisible(false);
        jTextField23.setVisible(false);
        jTextField24.setVisible(false);
        jTextField25.setVisible(false);
        jTextField26.setVisible(false);
        jTextField27.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked

        try {
            boolean b = GradeContoller.searchGrade(jTextField1.getText());

            if (b == false) {
                try {
                    boolean res = GradeContoller.addOrUpdateGrade(new Grade(jLabel76.getText(), jTextField1.getText(), Double.parseDouble(jTextField2.getText()), Double.parseDouble(jTextField8.getText()), Double.parseDouble(jTextField3.getText()), Double.parseDouble(jTextField4.getText()), Double.parseDouble(jTextField5.getText()), Double.parseDouble(jTextField6.getText())), isNewGradeClicked);
                    if (res == true) {
                        new OptionPane_4_savedSuccessfully().setVisible(true);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConfigurationSettings.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConfigurationSettings.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Grade already exists !");
            }
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        try {
            boolean b = RoleContoller.searchRole(jTextField10.getText());
            if (b == false) {
                jComboBox4.requestFocus();
                try {
                    boolean res = RoleContoller.addOrUpdateRole(new Role(jLabel77.getText(), jTextField10.getText()), isNewRoleClicked);
                    if (res == true) {
                        new OptionPane_4_savedSuccessfully().setVisible(true);
                    }
                } catch (ClassNotFoundException | SQLException ex) {

                }
            } else {
                JOptionPane.showMessageDialog(this, "Role already exists !");
                jTextField10.requestFocus();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.getStackTrace();
        }
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        try {
            boolean rst = DepartmentController.searchDepartment(jTextField9.getText());

            if (rst == false) {

                try {
                    boolean res = DepartmentController.addOrUpdateDepartment(new Department(jLabel79.getText(), jTextField9.getText()), isNewDepartmentClicked);
                    if (res == true) {
                        new OptionPane_4_savedSuccessfully().setVisible(true);
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                }

            } else {
                JOptionPane.showMessageDialog(this, "Department already exists !");
            }
        } catch (ClassNotFoundException | SQLException ex) {

        }


    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        try {
            Settings settings = new Settings(Double.parseDouble(jTextField18.getText()) / 100, Double.parseDouble(jTextField17.getText()) / 100, Double.parseDouble(jTextField23.getText()) / 100, Double.parseDouble(jTextField26.getText()) / 100, Double.parseDouble(jTextField19.getText()) / 100, Double.parseDouble(jTextField24.getText()), Double.parseDouble(jTextField20.getText()), Double.parseDouble(jTextField21.getText()), Double.parseDouble(jTextField22.getText()), Integer.parseInt(jTextField13.getText()), Integer.parseInt(jTextField27.getText()), Integer.parseInt(jTextField25.getText()), Integer.parseInt(jTextField15.getText()), Integer.parseInt(jTextField14.getText()), Integer.parseInt(jTextField16.getText()));
            boolean res = SettingsController.updateSettings(settings);
            if (res == true) {
                new OptionPane_4_savedSuccessfully().setVisible(true);
            }
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        try {
            boolean res = BonusTypeController.addBonusType(new BonusType(jLabel78.getText(), jTextField11.getText(), Double.parseDouble((jTextField12.getText()))));
            if (res == true) {
                new OptionPane_4_savedSuccessfully().setVisible(true);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConfigurationSettings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel73MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseEntered
        jLabel73.setFont(new Font("Raleway Light", 1, 18));
    }//GEN-LAST:event_jLabel73MouseEntered

    private void jLabel73MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseExited
        jLabel73.setFont(new Font("Raleway Light", 0, 18));
    }//GEN-LAST:event_jLabel73MouseExited

    private void jLabel74MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseEntered
        jLabel74.setFont(new Font("Raleway Light", 1, 18));
    }//GEN-LAST:event_jLabel74MouseEntered

    private void jLabel74MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseExited
        jLabel74.setFont(new Font("Raleway Light", 0, 18));
    }//GEN-LAST:event_jLabel74MouseExited

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        jTextField6.requestFocus();
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jLabel80MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseEntered
        jLabel80.setFont(new Font("Raleway Light", 1, 18));
    }//GEN-LAST:event_jLabel80MouseEntered

    private void jLabel80MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseExited
        jLabel80.setFont(new Font("Raleway Light", 0, 18));
    }//GEN-LAST:event_jLabel80MouseExited

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        jTextField17.requestFocus();
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        try {
            jTextField9.setText(jComboBox2.getSelectedItem().toString());
            String departmentID = payrollMethods.getDepartmentId(jComboBox2);
            jLabel79.setText(departmentID);
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseClicked
        try {
            payrollMethods.getNewId(jLabel79, "D", "Department");
            jTextField9.setText("");
            isNewDepartmentClicked = true;
        } catch (SQLException | ClassNotFoundException ex) {
        }
        jTextField9.requestFocus();
    }//GEN-LAST:event_jLabel74MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            Grade grade = GradeContoller.getGradeDetails(payrollMethods.getGradeId(jComboBox1));
            jLabel76.setText(grade.getGaradeId());
            jTextField1.setText(grade.getGradeName());
            jTextField2.setText(Double.toString(grade.getNoPayRate()) + 0);
            jTextField8.setText(Double.toString(grade.getNormalOtAmount()) + 0);
            jTextField3.setText(Double.toString(grade.getWeekendOtAmount()) + 0);
            jTextField4.setText(Double.toString(grade.getMaxLoanAmount()) + 0);
            jTextField5.setText(Double.toString(grade.getMaxAdvanceRate()) + 0);
            jTextField6.setText(Double.toString(grade.getVehicleAllowences()) + 0);
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseClicked
        try {
            payrollMethods.getNewId(jLabel76, "G", "Grade");
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField8.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            isNewGradeClicked = true;
        } catch (SQLException | ClassNotFoundException ex) {
        }
        jTextField1.requestFocus();
    }//GEN-LAST:event_jLabel73MouseClicked

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        try {
            jTextField10.setText(jComboBox3.getSelectedItem().toString());
            jLabel77.setText(RoleContoller.getRoleId(jComboBox3.getSelectedItem().toString()));
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jLabel80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80MouseClicked
        try {
            payrollMethods.getNewId(jLabel77, "R", "Role");
            jTextField10.setText("");
            isNewRoleClicked = true;
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        jTextField10.requestFocus();
    }//GEN-LAST:event_jLabel80MouseClicked

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        try {
            jLabel78.setText(payrollMethods.getGradeId(jComboBox4));
        } catch (SQLException | ClassNotFoundException ex) {
        }
        jTextField11.requestFocus();
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        if (isConstructorClosed) {
            try {
                JFileChooser fc = new JFileChooser();
                fc.showOpenDialog(this);
                File file = fc.getSelectedFile();
                String path = file.getAbsolutePath();
                System.out.println(path);
                int res = payrollMethods.writeBackup(path);
                if (res == 0) {
                    JOptionPane.showMessageDialog(this, "Backed Up");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed");
                }
            } catch (IOException | InterruptedException | NullPointerException ex) {
            }
        }
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        if (isConstructorClosed) {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(this);
            File file = fc.getSelectedFile();
            String path = file.getAbsolutePath();
            try {
                int res = payrollMethods.restoreBackup(path);
                if (res == 0) {
                    JOptionPane.showMessageDialog(this, "Restore Success");
                } else {
                    JOptionPane.showMessageDialog(this, "Fail");
                }
            } catch (IOException | InterruptedException | NullPointerException ex) {
            }
        }
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        jTextField12.requestFocus();
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        try {
            boolean rst = DepartmentController.searchDepartment(jTextField9.getText());
            if (rst == false) {
                try {
                    boolean res = DepartmentController.addOrUpdateDepartment(new Department(jLabel79.getText(), jTextField9.getText()), isNewDepartmentClicked);
                    if (res == true) {
                        new OptionPane_4_savedSuccessfully().setVisible(true);
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                }

            } else {
                JOptionPane.showMessageDialog(this, "Department already exists !");
            }
        } catch (ClassNotFoundException | SQLException ex) {

        }
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        try {
            boolean b = RoleContoller.searchRole(jTextField10.getText());
            if (b == false) {
                jComboBox4.requestFocus();
                try {
                    boolean res = RoleContoller.addOrUpdateRole(new Role(jLabel77.getText(), jTextField10.getText()), isNewRoleClicked);
                    if (res == true) {
                        new OptionPane_4_savedSuccessfully().setVisible(true);
                    }
                } catch (ClassNotFoundException | SQLException ex) {

                }
            } else {
                JOptionPane.showMessageDialog(this, "Role already exists !");
                jTextField10.requestFocus();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.getStackTrace();
        }
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        try {
            boolean b = GradeContoller.searchGrade(jTextField1.getText());
            if (b == true) {
                JOptionPane.showMessageDialog(this, "Grade already exists !");
                jTextField1.requestFocus();
            } else {
                jTextField2.requestFocus();
            }
        } catch (SQLException | ClassNotFoundException ex) {
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        jTextField27.requestFocus();
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        jTextField25.requestFocus();
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        jTextField15.requestFocus();
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        jTextField14.requestFocus();    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        jTextField16.requestFocus();
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        jTextField18.requestFocus();
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        jTextField19.requestFocus();
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        jTextField26.requestFocus();
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        jTextField20.requestFocus();
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        jTextField21.requestFocus();
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        jTextField22.requestFocus();
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        jTextField23.requestFocus();
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        jTextField24.requestFocus();
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField24ActionPerformed
        try {
            Settings settings = new Settings(Double.parseDouble(jTextField18.getText()) / 100, Double.parseDouble(jTextField17.getText()) / 100, Double.parseDouble(jTextField23.getText()) / 100, Double.parseDouble(jTextField26.getText()) / 100, Double.parseDouble(jTextField19.getText()) / 100, Double.parseDouble(jTextField24.getText()), Double.parseDouble(jTextField20.getText()), Double.parseDouble(jTextField21.getText()), Double.parseDouble(jTextField22.getText()), Integer.parseInt(jTextField13.getText()), Integer.parseInt(jTextField27.getText()), Integer.parseInt(jTextField25.getText()), Integer.parseInt(jTextField15.getText()), Integer.parseInt(jTextField14.getText()), Integer.parseInt(jTextField16.getText()));
            boolean res = SettingsController.updateSettings(settings);
            if (res == true) {
                new OptionPane_4_savedSuccessfully().setVisible(true);
            }
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }//GEN-LAST:event_jTextField24ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        jTextField8.requestFocus();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        jTextField3.requestFocus();
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        jTextField4.requestFocus();
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        jTextField5.requestFocus();
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed

        try {
            boolean b = GradeContoller.searchGrade(jTextField1.getText());

            if (b == false) {
                jComboBox2.requestFocus();
                try {
                    boolean res = GradeContoller.addOrUpdateGrade(new Grade(jLabel76.getText(), jTextField1.getText(), Double.parseDouble(jTextField2.getText()), Double.parseDouble(jTextField8.getText()), Double.parseDouble(jTextField3.getText()), Double.parseDouble(jTextField4.getText()), Double.parseDouble(jTextField5.getText()), Double.parseDouble(jTextField6.getText())), isNewGradeClicked);
                    if (res == true) {
                        new OptionPane_4_savedSuccessfully().setVisible(true);
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ConfigurationSettings.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ConfigurationSettings.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                jTextField6.requestFocus();
                JOptionPane.showMessageDialog(this, "Grade already exists !");
            }
        } catch (SQLException | ClassNotFoundException ex) {
        }

    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        try {
            boolean res = BonusTypeController.addBonusType(new BonusType(jLabel78.getText(), jTextField11.getText(), Double.parseDouble((jTextField12.getText()))));
            if (res == true) {
                new OptionPane_4_savedSuccessfully().setVisible(true);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConfigurationSettings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTextField12ActionPerformed

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
            java.util.logging.Logger.getLogger(ConfigurationSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigurationSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigurationSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigurationSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigurationSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
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
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
