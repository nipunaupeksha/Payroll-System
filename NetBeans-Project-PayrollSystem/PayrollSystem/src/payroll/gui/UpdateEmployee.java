/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.gui;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.math.BigInteger;
import static java.math.BigInteger.ZERO;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import payroll.controller.BankController;
import payroll.controller.EmployeeController;
import payroll.methods.payrollMethods;
import payroll.model.Bank;
import payroll.model.Employee;

/**
 *
 * @author ASUS
 */
public class UpdateEmployee extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private int cal = 0;

    public UpdateEmployee() {
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
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/rsz_bleach_login.png")));
        jLabel9.setVisible(false);
        jLabel7.setVisible(false);
        jLabel16.setVisible(false);
        jLabel5.setVisible(false);
        jLabel13.setVisible(false);
        jLabel26.setVisible(false);
        jLabel28.setVisible(false);
        jLabel51.setVisible(false);
        jPanel2.setVisible(false);
        jLabel52.setVisible(false);
        jLabel27.setVisible(false);
        try {
            payrollMethods.fillDepartmentCombo(jComboBox2);
            payrollMethods.fillGradeCombo(jComboBox4);
            payrollMethods.fillRoleCombo(jComboBox3);
            payrollMethods.fillComboBank(jComboBox5);
            //jComboBox5.setSelectedIndex(0);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UpdateEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean validateNIC(JTextField txtNic) {
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;
        String text = txtNic.getText();
        if (!text.isEmpty()) {
            b1 = true;
            boolean matches = text.matches("^[0-9]{0,9}$");
            if (!matches) {
                txtNic.setText(text.substring(0, text.length() - 1));
            }
            boolean matches1 = text.matches("[0-9]{9}");
            if (matches1) {
                b2 = true;
                txtNic.setText(text);
            }
        }
        if (b1 == true && b2 == true) {
            b3 = true;
        }
        return b3;
    }

    public String setDigitsOnly(String text) {
        return text.replaceAll("[^0-9]*", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel50 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jTextField15 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField5 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel47 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel50MouseDragged(evt);
            }
        });
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel50MousePressed(evt);
            }
        });
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        jLabel15.setFont(new java.awt.Font("Raleway Light", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("_");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 20, 60));

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

        jLabel2.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        jLabel2.setText("payroll system");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel3.setFont(new java.awt.Font("Raleway Light", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("update employee");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("view employee");
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

        jLabel35.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("address");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, 30));

        jLabel40.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("mobile");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, -1, -1));

        jLabel41.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("land");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, -1, -1));

        jLabel39.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("marital status");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, 30));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("new employee");
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 210, 40));

        jTextField13.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 150, 30));

        jRadioButton3.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jRadioButton3.setText("no vehicle");
        jRadioButton3.setOpaque(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jRadioButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton3KeyPressed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, -1, -1));

        jLabel36.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("telephone");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, 30));

        jRadioButton2.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jRadioButton2.setText("male");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jRadioButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        jRadioButton1.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jRadioButton1.setText("female");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jRadioButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("new employee");
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 40));

        jLabel60.setFont(new java.awt.Font("Raleway Light", 0, 20)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("?");
        jLabel60.setToolTipText("");
        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel60.setOpaque(true);
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel60MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel60MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel60MouseExited(evt);
            }
        });
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, 37, 28));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel53.setText("bank name");
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

        jTextField16.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 180, 30));

        jLabel54.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("add");
        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel54MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel54MouseExited(evt);
            }
        });
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 60, 30));

        jLabel56.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("delete");
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel56MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel56MouseExited(evt);
            }
        });
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 100, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 290, 120));

        jComboBox1.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "married", "single" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, -1, -1));

        jLabel18.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("transport");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, -1, -1));

        jLabel37.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("gender");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, 30));

        jLabel44.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("basic salary");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, -1, 30));

        jLabel42.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("department");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        jTextField3.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 150, 30));

        jTextField6.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 150, 30));

        jLabel34.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel34.setText("name");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, 40));

        jTextField11.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jTextField11.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField11PropertyChange(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 150, 30));

        jTextField14.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 150, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("remove employee");
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

        jTextField8.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 150, 30));

        jLabel45.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("role");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, -1, 30));

        jLabel20.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("professional details");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));

        jTextField2.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 150, 30));

        jLabel38.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("NIC");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, 30));

        jTextField7.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 150, 30));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 230, 570));

        jRadioButton5.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jRadioButton5.setText("own vehicle");
        jRadioButton5.setOpaque(false);
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jRadioButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton5KeyPressed(evt);
            }
        });
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, -1, -1));

        jTextField1.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 150, 30));

        jLabel17.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel17.setText("personal data");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jTextField10.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField10PropertyChange(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 150, 30));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("view employee");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, 40));

        jTextField4.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 150, 30));

        jLabel43.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("grade");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, -1, 30));

        jLabel22.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("payment details");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jRadioButton4.setText("office vehicle");
        jRadioButton4.setOpaque(false);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jRadioButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton4KeyPressed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, -1, -1));

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel24.setOpaque(true);
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, 320, 80));

        jLabel58.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("+94");
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 40, 30));

        jLabel31.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("e-mail");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, 30));

        jLabel33.setFont(new java.awt.Font("Raleway Thin", 1, 20)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("employee ID");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 134, -1, 40));

        jTextField12.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField12KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 310, 30));

        jComboBox5.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 140, -1));

        jComboBox3.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 140, -1));

        jTextField15.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 140, -1));

        jComboBox4.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 140, -1));

        jTextField5.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 140, -1));

        jComboBox2.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 145, 140, -1));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("remove employee");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 40));

        jTextField9.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 150, 30));

        jComboBox6.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "V", "X" }));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, -1, 30));

        jLabel47.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("bank");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, -1, 30));

        jLabel51.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(204, 0, 0));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("add values to asked categories");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, 270, 30));

        jLabel52.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 0, 0));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("add values to asked categories");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 656, 270, 30));

        jLabel46.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("account no.");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, -1, 30));

        jLabel32.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("recruited on");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 572, -1, 30));

        jLabel30.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("date of birth");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, 30));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_2.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 70, 50));

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/serach.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 70, 50));

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("update");
        jLabel26.setOpaque(true);
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel26MouseExited(evt);
            }
        });
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 660, 90, 40));

        jLabel27.setBackground(new java.awt.Color(0, 0, 0));
        jLabel27.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("back");
        jLabel27.setOpaque(true);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27MouseExited(evt);
            }
        });
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, 70, 40));

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("refresh");
        jLabel28.setOpaque(true);
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel28MouseExited(evt);
            }
        });
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 660, 100, 40));

        jLabel57.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("+94");
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 40, 30));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("update");
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel29.setOpaque(true);
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel29MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 660, 90, 40));

        jLabel48.setBackground(new java.awt.Color(204, 204, 204));
        jLabel48.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("refresh");
        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel48.setOpaque(true);
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel48MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 660, 100, 40));

        jLabel49.setBackground(new java.awt.Color(204, 204, 204));
        jLabel49.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("back");
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel49.setOpaque(true);
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel49MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, 70, 40));

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.setOpaque(true);
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 410, 570));

        jPanel1.setOpaque(false);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 170, 70));

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.setOpaque(true);
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 320, 180));

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel21.setOpaque(true);
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 320, 180));

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

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jLabel15.setVisible(true);
        jLabel14.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new OptionPane_1_close().setVisible(true);    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel7.setVisible(false);
        jLabel14.setVisible(true);
        jLabel15.setVisible(false);
        jLabel8.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel7.setVisible(true);
        jLabel8.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered

    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setVisible(false);
        jLabel8.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel6.setVisible(true);
        jLabel9.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        jLabel16.setVisible(false);
        jLabel12.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setVisible(false);
        jLabel16.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setVisible(false);
        jLabel10.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setVisible(false);
        jLabel9.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if (jRadioButton4.isSelected()) {
            jRadioButton5.setSelected(false);
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel5.setVisible(true);
        jLabel10.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
        jLabel13.setVisible(true);
        jLabel25.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        jLabel13.setVisible(false);
        jLabel25.setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseEntered
        jLabel26.setVisible(true);
        jLabel29.setVisible(false);
    }//GEN-LAST:event_jLabel29MouseEntered

    private void jLabel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseExited
        jLabel29.setVisible(true);
        jLabel26.setVisible(false);
        jLabel51.setVisible(false);
    }//GEN-LAST:event_jLabel26MouseExited

    private void jLabel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseExited
        jLabel28.setVisible(false);
        jLabel48.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseExited

    private void jLabel48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseEntered
        jLabel48.setVisible(false);
        jLabel28.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel48MouseEntered

    private void jLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseExited
        jLabel49.setVisible(true);
        jLabel27.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MouseExited

    private void jLabel49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseEntered
        jLabel49.setVisible(false);
        jLabel27.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel49MouseEntered

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        this.dispose();
        new Home().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        setState(ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel50MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel50MouseDragged

    private void jLabel50MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel50MousePressed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        try {
            Employee employee = EmployeeController.searchEmployee(jTextField1.getText());
            if (employee != null) {
                jTextField2.setText(employee.getFirstName());
                jTextField4.setText(employee.getSecondName());
                jTextField3.setText(employee.getAddress()); //3,14,7,9 divide in places where commas are
                jComboBox1.setSelectedItem(employee.getMaritialStatus());
                jTextField10.setText(employee.getMobileNum());
                jTextField11.setText(employee.getLandNum());
                jTextField12.setText(employee.getEmail());
                jComboBox2.setSelectedItem(payrollMethods.getDepartmentName(jTextField1));
                jComboBox4.setSelectedItem(payrollMethods.getGradeName(jTextField1));
                jComboBox3.setSelectedItem(payrollMethods.getRoleName(jTextField1));
                jTextField5.setText(Double.toString(employee.getBasicSalary()));
                jComboBox5.setSelectedItem(employee.getBank());
                jTextField15.setText(employee.getAccNum());
            } else {
                JOptionPane.showMessageDialog(this, "Employee not found!");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UpdateEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        try {
            if (!"".equals(jTextField2.getText()) & !"".equals(jTextField8.getText() + jComboBox6.getSelectedItem().toString()) & !"".equals(jTextField3.getText()) & !"".equals(jTextField11.getText()) & !"".equals(jTextField10.getText()) & !"".equals(jTextField12.getText()) & !"".equals(jTextField13.getText()) & !"".equals(jTextField1.getText()) & !"".equals(jTextField1.getText()) & jComboBox3.getSelectedIndex() != -1 & jComboBox2.getSelectedIndex() != -1 & jComboBox4.getSelectedIndex() != -1) {
                jLabel51.setVisible(false);
                jLabel52.setVisible(false);
                int transportType;
                if (jRadioButton5.isSelected()) {
                    transportType = 1;
                } else if (jRadioButton4.isSelected()) {
                    transportType = 2;
                } else {
                    transportType = 0;
                }
                String address = jTextField3.getText() + "," + jTextField14.getText() + "," + jTextField7.getText() + "," + jTextField9.getText() + ".";
                Employee employee = new Employee(jTextField1.getText(), jTextField4.getText(), jTextField3.getText(), address, jComboBox1.getSelectedItem().toString(), jTextField10.getText(), jTextField11.getText(), jTextField12.getText(), payrollMethods.getDepartmentId(jComboBox2), payrollMethods.getGradeId(jComboBox4), payrollMethods.getRoleId(jComboBox3), Double.parseDouble(jTextField5.getText()), (String) jComboBox5.getSelectedItem(), jTextField15.getText(), transportType);
                boolean res = EmployeeController.updateEmployee(employee);
                if (res == true) {
                    JOptionPane.showMessageDialog(this, "Update Success!");
                } else {
                    JOptionPane.showMessageDialog(this, "Update Fail!");
                }
            } else {
                jLabel51.setVisible(true);
                AnimationClass ac = new AnimationClass();
                ac.jLabelYDown(620, 656, 18, 2, jLabel51);
                jLabel52.setVisible(true);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UpdateEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        this.dispose();
        new NewEmployee().setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.dispose();
        new ViewEmployee().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
        new RemoveEmployee().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        this.dispose();
        new UpdateEmployee().setVisible(true);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        try {
            Employee employee = EmployeeController.searchEmployee(jTextField1.getText());
            if (employee != null) {

                String source = employee.getAddress();

                String[] address = source.split(",");
                int count = address.length;
                switch (count) {
                    case 1:
                        jTextField3.setText(address[0]);
                        break;

                    case 2:
                        jTextField3.setText(address[0]);
                        jTextField14.setText(address[1]);
                        break;
                    case 3:
                        jTextField3.setText(address[0]);
                        jTextField14.setText(address[1]);
                        jTextField7.setText(address[2]);
                        break;
                    case 4:
                        jTextField3.setText(address[0]);
                        jTextField14.setText(address[1]);
                        jTextField7.setText(address[2]);
                        jTextField9.setText(address[3]);
                        break;
                }
                String nicText = employee.getNic().substring(2, 5);
                int status = 0;
                if (Integer.parseInt(nicText) < 500) {
                    status = 1;
                    jRadioButton2.setSelected(true);
                    jRadioButton1.setSelected(false);
                } else {
                    jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(true);
                    status = 0;
                }
                jTextField2.setText(employee.getFirstName());
                jTextField4.setText(employee.getSecondName());
                jTextField8.setText(employee.getNic());
                jTextField6.setText(employee.getDob());
                jComboBox1.setSelectedItem(employee.getMaritialStatus());
                jTextField10.setText(employee.getMobileNum());
                jTextField11.setText(employee.getLandNum());
                jTextField12.setText(employee.getEmail());
                jComboBox2.setSelectedItem(payrollMethods.getDepartmentName(jTextField1));
                jComboBox4.setSelectedItem(payrollMethods.getGradeName(jTextField1));
                jComboBox3.setSelectedItem(payrollMethods.getRoleName(jTextField1));
                jTextField5.setText(Double.toString(employee.getBasicSalary()));
                jComboBox5.setSelectedItem(employee.getBank());
                jTextField15.setText(employee.getAccNum());
                int temp = employee.getTransportType();
                switch (temp) {
                    case 1:
                        jRadioButton5.requestFocus();
                        jRadioButton5.setSelected(true);
                        jRadioButton4.setSelected(false);
                        jRadioButton3.setSelected(false);
                        break;
                    case 2:
                        jRadioButton4.requestFocus();
                        jRadioButton4.setSelected(true);
                        jRadioButton3.setSelected(false);
                        jRadioButton5.setSelected(false);
                        break;
                    default:
                        jRadioButton3.requestFocus();
                        jRadioButton3.setSelected(true);
                        jRadioButton4.setSelected(false);
                        jRadioButton5.setSelected(false);
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Employee not found!");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.getStackTrace();
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
        jLabel51.setVisible(false);
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked
        if (cal % 2 == 0) {
            jPanel2.setVisible(true);
            jTextField16.requestFocus();
            cal++;
        } else {
            cal++;
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_jLabel60MouseClicked

    private void jLabel60MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseEntered
        jLabel60.setFont(new Font("Raleway Light", 1, 20));
    }//GEN-LAST:event_jLabel60MouseEntered

    private void jLabel60MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseExited
        jLabel60.setFont(new Font("Raleway Light", 0, 20));
    }//GEN-LAST:event_jLabel60MouseExited

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked

        try {
            boolean rst = BankController.bankValidity(jTextField16.getText());
            if (rst == true) {
                try {
                    try {
                        boolean res = BankController.addBank(jTextField16.getText());
                        jComboBox5.addItem(jTextField16.getText());
                        jPanel2.setVisible(false);
                    } catch (SQLException ex) {
                        Logger.getLogger(NewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (ClassNotFoundException e) {
                }
            } else {
                JOptionPane.showMessageDialog(this, "Bank already exists !");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.getStackTrace();
        }
    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel54MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseEntered
        jLabel54.setFont(new Font("Raleway Light", 1, 18));
    }//GEN-LAST:event_jLabel54MouseEntered

    private void jLabel54MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseExited
        jLabel54.setFont(new Font("Raleway Light", 0, 18));
    }//GEN-LAST:event_jLabel54MouseExited

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed

        try {
            boolean rst = BankController.bankValidity(jTextField16.getText());
            if (rst == true) {
                try {
                    try {
                        boolean res = BankController.addBank(jTextField16.getText());
                        jComboBox5.addItem(jTextField16.getText());
                        jPanel2.setVisible(false);
                        cal = 0;
                    } catch (SQLException ex) {
                        Logger.getLogger(NewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (ClassNotFoundException e) {
                }
            } else {
                JOptionPane.showMessageDialog(this, "Bank already exists !");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.getStackTrace();
        }


    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jLabel56MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseEntered
        jLabel56.setFont(new Font("Raleway Light", 1, 18));
    }//GEN-LAST:event_jLabel56MouseEntered

    private void jLabel56MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseExited
        jLabel56.setFont(new Font("Raleway Light", 0, 18));
    }//GEN-LAST:event_jLabel56MouseExited

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        try {
            Bank bank = BankController.searchBank(jTextField16.getText());
            if (bank == null) {
                JOptionPane.showMessageDialog(this, "No Bank from that name !");
            } else {
                try {
                    try {
                        boolean res = BankController.deleteBank(jTextField15.getText());
                        jComboBox5.removeItem(jTextField15.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(NewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (ClassNotFoundException e) {
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            ex.getStackTrace();
        }


    }//GEN-LAST:event_jLabel56MouseClicked

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        String text = setDigitsOnly(jTextField8.getText());
        jTextField8.setText(text);
        if (validateNIC(jTextField8)) {
            jTextField3.requestFocus();
            String dateOfBirth = jTextField8.getText();
            String temp1 = "19" + dateOfBirth.substring(0, 2);
            int dateCtrl = Integer.parseInt(dateOfBirth.substring(2, 5));
            if (dateCtrl > 500) {
                jRadioButton1.setSelected(true);
                jRadioButton2.setSelected(false);
                dateCtrl -= 500;
            } else {
                jRadioButton2.setSelected(true);
                jRadioButton1.setSelected(false);
            }
            String temp3 = DateOfBirthCalculator.calculate(dateCtrl);
            String temp2 = temp1 + "-" + temp3;
            jTextField6.setText(temp2);
            jTextField8.setBorder(new LineBorder(Color.GRAY, 2));
        } else {
            JOptionPane.showMessageDialog(this, "Invalid NIC !");
        }
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        String text = setDigitsOnly(jTextField11.getText());
        jTextField11.setText(text);
        int numbersOfPhone = 0;
        BigInteger b = BigInteger.ZERO;
        String textNum = jTextField11.getText();
        if (!"".equals(jTextField11.getText())) {
            b = new BigInteger(textNum);
            for (int i = 0; b != BigInteger.ZERO; i++) {
                b = b.divide(BigInteger.TEN);
                numbersOfPhone++;
            }
            if (numbersOfPhone != 9) {
                JOptionPane.showMessageDialog(this, "Invalid phone number");
                jTextField11.requestFocus();
            } else {
                jTextField11.setForeground(Color.BLACK);
            }
        }
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        String text = setDigitsOnly(jTextField10.getText());
        jTextField10.setText(text);
        int numbersOfPhone = 0;
        BigInteger b = BigInteger.ZERO;
        String textNum = jTextField10.getText();
        if (!"".equals(jTextField10.getText())) {
            b = new BigInteger(textNum);
            for (int i = 0; b != BigInteger.ZERO; i++) {
                b = b.divide(BigInteger.TEN);
                numbersOfPhone++;
            }
            if (numbersOfPhone != 9) {
                JOptionPane.showMessageDialog(this, "Invalid phone number");
                jTextField10.requestFocus();
            } else {
                jTextField10.setForeground(Color.BLACK);
            }
        }
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (jRadioButton2.isSelected()) {
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()) {
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        if (jRadioButton5.isSelected()) {
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if (jRadioButton3.isSelected()) {
            jRadioButton5.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton2KeyPressed
        int a = evt.getKeyCode();
        if (a == 39) {
            jRadioButton1.requestFocus();
            jRadioButton1.setSelected(true);
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2KeyPressed

    private void jRadioButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton1KeyPressed
        int a = evt.getKeyCode();
        if (a == 37) {
            jRadioButton2.requestFocus();
            jRadioButton2.setSelected(true);
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1KeyPressed

    private void jRadioButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton5KeyPressed
        int a = evt.getKeyCode();
        if (a == 39) {
            jRadioButton4.requestFocus();
            jRadioButton4.setSelected(true);
            jRadioButton5.setSelected(false);
            jRadioButton3.setSelected(false);
        }
        if (a == 40) {
            jRadioButton3.requestFocus();
            jRadioButton3.setSelected(true);
            jRadioButton5.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton5KeyPressed

    private void jRadioButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton4KeyPressed
        int a = evt.getKeyCode();
        if (a == 37) {
            jRadioButton5.requestFocus();
            jRadioButton5.setSelected(true);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }
        if (a == 40) {
            jRadioButton3.requestFocus();
            jRadioButton3.setSelected(true);
            jRadioButton5.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton4KeyPressed

    private void jRadioButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton3KeyPressed
        int a = evt.getKeyCode();
        if (a == 38) {
            jRadioButton5.requestFocus();
            jRadioButton5.setSelected(true);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3KeyPressed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        jTextField3.requestFocus();
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        int temp = jTextField8.getText().length();
        if (temp > 9) {
            jTextField8.setBorder(new LineBorder(Color.BLUE, 2));
            JOptionPane.showMessageDialog(this, "Invalid NIC !");
            jLabel1.requestFocus();
        }
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jTextField11PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField11PropertyChange

    }//GEN-LAST:event_jTextField11PropertyChange

    private void jTextField10PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField10PropertyChange

    }//GEN-LAST:event_jTextField10PropertyChange

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased
        int temp = jTextField11.getText().length();
        if (temp > 9) {
            jTextField11.setForeground(Color.RED);
            JOptionPane.showMessageDialog(this, "Invalid phone number !");

            jLabel1.requestFocus();
        }
    }//GEN-LAST:event_jTextField11KeyReleased

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        int temp = jTextField10.getText().length();
        if (temp > 9) {
            jTextField10.setForeground(Color.RED);
            JOptionPane.showMessageDialog(this, "Invalid phone number !");
            jLabel1.requestFocus();
        }
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        String source = jTextField12.getText();
        Pattern p = Pattern.compile("[@][a-zA-Z]+[.][a-zA-Z]{3}");
        Matcher m = p.matcher(source);
        if (m.find()) {
            jTextField12.setForeground(Color.BLACK);
        } else {
            jTextField12.setForeground(Color.RED);
            JOptionPane.showMessageDialog(this, "Invalid E-Mail !");
            jTextField12.requestFocus();
        }
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyReleased
        String source = jTextField12.getText();
        Pattern p = Pattern.compile("[@][a-zA-Z]+[.][a-zA-Z]{3}");
        Matcher m = p.matcher(source);
        if (m.find()) {
            jTextField12.setForeground(Color.BLACK);
        } else {
            jTextField12.setForeground(Color.RED);
            jTextField12.requestFocus();
        }
    }//GEN-LAST:event_jTextField12KeyReleased

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
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
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
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
