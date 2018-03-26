/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import payroll.controller.DateController;
import payroll.controller.EmployeeController;
import payroll.controller.GradeContoller;
import payroll.controller.LoanController;
import payroll.controller.SettingsController;
import payroll.methods.payrollMethods;
import payroll.model.Employee;
import payroll.model.Grade;
import payroll.model.Loan;
import payroll.model.Settings;

/**
 *
 * @author ASUS
 */
public class AddLoan extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private Date d = new Date();

    public AddLoan() {
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
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/rsz_bleach_login.png")));
        jLabel15.setVisible(false);
        jLabel9.setVisible(false);
        jLabel71.setVisible(false);
        jLabel58.setVisible(false);
        jLabel69.setVisible(false);
        jLabel5.setVisible(false);
        jLabel16.setVisible(false);

        try {
            payrollMethods.getNewId(jLabel27, "L", "Loan");
            jTextField1.setText(dateLable.getText());
            jTextField8.requestFocus();
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }

    public static String setDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }

    public String setDigitsOnly(String text) {
        return text.replaceAll("[^0-9]*", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel73 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel73MouseDragged(evt);
            }
        });
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel73MousePressed(evt);
            }
        });
        getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

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
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 20, 60));

        jLabel3.setFont(new java.awt.Font("Raleway Light", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("add loan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel74.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 110, 40));

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

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("employee loans");
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

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("payable loans");
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

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("payable loans");
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 40));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("released loans");
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

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("employee loans");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 200, 40));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("released loans");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 200, 40));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("view loans");
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 210, 40));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("view loans");
        jLabel17.setOpaque(true);
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 200, 40));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 230, 570));

        jLabel18.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("basic salary");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jLabel19.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("loan ID");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 112, -1, 40));

        jLabel20.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("employee ID");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 162, -1, 30));

        jLabel21.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("maximum amount");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jLabel22.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("loan amount");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        jLabel23.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("monthly installment");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, 30));

        jLabel24.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("time period (months)");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, 30));

        jLabel25.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("due date");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, -1, 30));

        jLabel26.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("guarantor 2");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 610, -1, 30));

        jLabel27.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 70, 30));

        jLabel28.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("department");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, -1));

        jLabel46.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(204, 204, 204));
        jLabel46.setText("amount :");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, -1, -1));

        jLabel29.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("date");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jLabel30.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("description");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jLabel31.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("guarantor 1");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, -1, 30));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 110, 30));

        jLabel33.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 220, 40));

        jLabel34.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 170, 40));

        jLabel35.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 110, 30));

        jLabel38.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("name");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        jTextField2.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 150, 30));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 150, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 140, 80));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(null);
        jTextField4.setOpaque(false);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 150, 30));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(null);
        jTextField5.setOpaque(false);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 150, 30));

        jTextField6.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 570, 100, 30));

        jTextField7.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 610, 100, 30));

        jTextField8.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(null);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 110, 30));

        jLabel47.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 204, 204));
        jLabel47.setText("due date :");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        jLabel48.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 204, 204));
        jLabel48.setText("time period :");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, -1));

        jLabel50.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 204, 204));
        jLabel50.setText("payment status :");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, -1, -1));

        jLabel51.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(204, 204, 204));
        jLabel51.setText("installed amount :");
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, -1, -1));

        jLabel52.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 204, 204));
        jLabel52.setText("related amount :");
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, -1, -1));

        jLabel53.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 204, 204));
        jLabel53.setText("remaining installments :");
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, -1, -1));

        jLabel54.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 204, 204));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 120, 30));

        jLabel55.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(204, 204, 204));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, 120, 25));

        jLabel69.setBackground(new java.awt.Color(0, 0, 0));
        jLabel69.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("give loan");
        jLabel69.setOpaque(true);
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel69MouseExited(evt);
            }
        });
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 660, 120, 40));

        jLabel56.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(204, 204, 204));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 120, 25));

        jLabel71.setBackground(new java.awt.Color(0, 0, 0));
        jLabel71.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("refresh");
        jLabel71.setOpaque(true);
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel71MouseExited(evt);
            }
        });
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 660, 100, 40));

        jLabel70.setBackground(new java.awt.Color(153, 153, 153));
        jLabel70.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("give loan");
        jLabel70.setOpaque(true);
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel70MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 660, 120, 40));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/serach.png"))); // NOI18N
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32MouseExited(evt);
            }
        });
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 40, 30));

        jLabel65.setOpaque(true);
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 280, 30));

        jLabel72.setBackground(new java.awt.Color(153, 153, 153));
        jLabel72.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("refresh");
        jLabel72.setOpaque(true);
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel72MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 660, 100, 40));

        jLabel57.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(204, 204, 204));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 120, 25));

        jLabel58.setFont(new java.awt.Font("Raleway Light", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(204, 204, 204));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel58.setOpaque(true);
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 100, 25));

        jLabel59.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(204, 204, 204));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 100, 25));

        jLabel60.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(204, 204, 204));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, 100, 25));

        jLabel61.setFont(new java.awt.Font("Raleway Light", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(204, 204, 204));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 422, 50, 25));

        jLabel62.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(204, 204, 204));
        jLabel62.setText("date :");
        getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, -1, -1));

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
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 660, 70, 40));

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
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 660, 70, 40));

        jLabel37.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("input employee ID");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 610, 170, 25));

        jLabel39.setFont(new java.awt.Font("Raleway Light", 0, 18)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("input employee ID");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 570, 170, 25));

        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 280, 330));

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

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered

    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new OptionPane_1_close().setVisible(true);
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

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel6.setVisible(true);
        jLabel9.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jLabel15.setVisible(false);
        jLabel12.setVisible(true);
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setVisible(false);
        jLabel15.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setVisible(false);
        jLabel10.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setVisible(false);
        jLabel9.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel5.setVisible(true);
        jLabel10.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        jLabel16.setVisible(false);
        jLabel17.setVisible(true);

    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        jLabel16.setVisible(true);
        jLabel17.setVisible(false);
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel16.setVisible(false);
        jLabel5.setVisible(false);
        jLabel15.setVisible(false);
        jLabel9.setVisible(false);
        jLabel6.setVisible(true);
        jLabel12.setVisible(true);
        jLabel17.setVisible(true);
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
        jLabel71.setVisible(false);
        jLabel69.setVisible(false);
        jLabel7.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel70MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseEntered
        jLabel69.setVisible(true);
        jLabel70.setVisible(false);
    }//GEN-LAST:event_jLabel70MouseEntered

    private void jLabel69MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseExited
        jLabel70.setVisible(true);
        jLabel69.setVisible(false);
    }//GEN-LAST:event_jLabel69MouseExited

    private void jLabel72MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseEntered
        jLabel71.setVisible(true);
        jLabel72.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel72MouseEntered

    private void jLabel71MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseExited
        jLabel72.setVisible(true);
        jLabel71.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel71MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel73MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jLabel73MouseDragged

    private void jLabel73MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jLabel73MousePressed

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        Loan loan = new Loan(jLabel27.getText(), jTextField1.getText(), jTextField8.getText(), jTextArea1.getText(), Double.parseDouble(jTextField2.getText()), Double.parseDouble(jTextField3.getText()), Integer.parseInt(jTextField4.getText()), jTextField5.getText(), jTextField6.getText(), jTextField7.getText());
        try {
            boolean res = LoanController.addLoan(loan);
            if (res == true) {
                JOptionPane.showMessageDialog(this, "Loan Added Success!");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Loan Added Fail!");
        }
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        new AddLoan().setVisible(true);
        this.dispose();    }//GEN-LAST:event_jLabel71MouseClicked

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        try {

            jTextField8.setBorder(new LineBorder(Color.BLACK));
            Employee employee = EmployeeController.searchEmployee(jTextField8.getText());
            if (employee != null) {
                Grade grade = GradeContoller.getGradeDetails(employee.getGradeId());
                Loan loan = LoanController.getLastLoan(jTextField8.getText());
                jLabel33.setText(employee.getFirstName() + " " + employee.getSecondName());
                jLabel35.setText(Double.toString(employee.getBasicSalary()));
                jLabel74.setText(Double.toString(grade.getMaxLoanAmount()));
                jLabel34.setText(payrollMethods.getDepartmentName(jTextField8));
                jTextField1.setText(setDate(d));
                if (loan != null) {
                    jLabel54.setVisible(true);
                    jLabel55.setVisible(true);
                    jLabel56.setVisible(true);
                    jLabel58.setVisible(true);
                    jLabel60.setVisible(true);
                    jLabel61.setVisible(true);
                    jLabel57.setVisible(true);
                    String paymentStatus = LoanController.getLoanPaymentStatus(loan.getDueDate(), loan.getLoanId());
                    jLabel54.setText(loan.getDate());
                    jLabel55.setText(Double.toString(loan.getLoanAmount()));
                    jLabel56.setText(loan.getDueDate());
                    jLabel58.setText(paymentStatus);
                    jLabel57.setText(Integer.toString(loan.getTimePeriod()));
                    if ("Not Paid".equals(paymentStatus)) {
                        jTextField8.setBorder(new LineBorder(Color.red, 2));
                        jLabel58.setForeground(Color.red);
                    } else {
                    }
                } else {
                    jLabel54.setVisible(false);
                    jLabel55.setVisible(false);
                    jLabel56.setVisible(false);
                    jLabel58.setVisible(false);
                    jLabel60.setVisible(false);
                    jLabel61.setVisible(false);
                    jLabel57.setVisible(false);
                }
                jTextArea1.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Employee not found");
            }
            jTextArea1.requestFocus();
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        String temp1 = jTextField7.getText();
        String temp2 = jTextField6.getText();
        if (!temp1.equals(temp2)) {
            try {
                Employee employee = EmployeeController.searchEmployee(jTextField6.getText());
                if (employee != null) {
                    jLabel39.setText(employee.getFirstName() + " " + employee.getSecondName());
                    boolean checkLoanValidity = LoanController.checkLoanValidity(jTextField6.getText());
                    if (checkLoanValidity) {
                        jLabel39.setBorder(new LineBorder(Color.red, 2));
                    } else {
                        jLabel39.setBorder(new LineBorder(Color.green, 2));
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Employee Not Found!");
                    jLabel39.setVisible(false);
                }
            } catch (ClassNotFoundException | SQLException ex) {
                ex.getStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error !");
        }
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        String temp1 = jTextField7.getText();
        String temp2 = jTextField6.getText();
        if (!temp1.equals(temp2)) {
            try {
                Employee employee = EmployeeController.searchEmployee(jTextField7.getText());
                if (employee != null) {
                    jLabel37.setText(employee.getFirstName() + " " + employee.getSecondName());
                    boolean checkLoanValidity = LoanController.checkLoanValidity(jTextField7.getText());
                    jTextField7.requestFocus();
                    if (checkLoanValidity) {
                        jLabel37.setBorder(new LineBorder(Color.red, 2));
                    } else {
                        jLabel37.setBorder(new LineBorder(Color.green, 2));
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Employee Not Found!");
                    jLabel37.setVisible(false);
                }
            } catch (ClassNotFoundException | SQLException ex) {

            }
        } else {
            JOptionPane.showMessageDialog(this, "Error !");
        }
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        String text = setDigitsOnly(jTextField2.getText());
        jTextField2.setText(text);
        if (!"".equals(jTextField8.getText())) {
            if (Double.parseDouble(jTextField2.getText()) <= Double.parseDouble(jLabel74.getText())) {
                try {
                    Settings settings = SettingsController.getAllSettings();
                    double monthlyInstalment = Double.parseDouble(jLabel35.getText()) * settings.getLoanRate();
                    jTextField3.setText(Double.toString(monthlyInstalment));
                    int noOfMonths = (int) (Double.parseDouble(jTextField2.getText()) / monthlyInstalment) + 1;
                    jTextField4.setText(Integer.toString(noOfMonths));
                    jTextField5.setText(DateController.getCalculatedDate(noOfMonths, jTextField1.getText()));
                } catch (SQLException | ClassNotFoundException ex) {
                }
                jTextField6.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Sorry");
                jTextField2.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select an employee");
        }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.dispose();
        new EmployeeLoans().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.dispose();
        new PayableLoans().setVisible(true);    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
        new ReleasedLoans().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        this.dispose();
        new ViewLoans().setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/serach.png")));
    }//GEN-LAST:event_jLabel32MouseExited

    private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_2.png")));
    }//GEN-LAST:event_jLabel32MouseEntered

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        try {

            jTextField8.setBorder(new LineBorder(Color.BLACK));
            Employee employee = EmployeeController.searchEmployee(jTextField8.getText());
            if (employee != null) {
                Grade grade = GradeContoller.getGradeDetails(employee.getGradeId());
                Loan loan = LoanController.getLastLoan(jTextField8.getText());
                jLabel33.setText(employee.getFirstName() + " " + employee.getSecondName());
                jLabel35.setText(Double.toString(employee.getBasicSalary()));
                jLabel74.setText(Double.toString(grade.getMaxLoanAmount()));
                jLabel34.setText(payrollMethods.getDepartmentName(jTextField8));
                jTextField1.setText(setDate(d));
                if (loan != null) {
                    jLabel54.setVisible(true);
                    jLabel55.setVisible(true);
                    jLabel56.setVisible(true);
                    jLabel58.setVisible(true);
                    jLabel60.setVisible(true);
                    jLabel61.setVisible(true);
                    jLabel57.setVisible(true);
                    String paymentStatus = LoanController.getLoanPaymentStatus(loan.getDueDate(), loan.getLoanId());
                    jLabel54.setText(loan.getDate());
                    jLabel55.setText(Double.toString(loan.getLoanAmount()));
                    jLabel56.setText(loan.getDueDate());
                    jLabel58.setText(paymentStatus);
                    jLabel57.setText(Integer.toString(loan.getTimePeriod()));
                    if ("Not Paid".equals(paymentStatus)) {
                        jTextField8.setBorder(new LineBorder(Color.red, 2));
                        jLabel58.setForeground(Color.red);
                    } else {

                    }

                } else {
                    jLabel54.setVisible(false);
                    jLabel55.setVisible(false);
                    jLabel56.setVisible(false);
                    jLabel58.setVisible(false);
                    jLabel60.setVisible(false);
                    jLabel61.setVisible(false);
                    jLabel57.setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Employee not found");
            }
            jTextArea1.requestFocus();
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
        int a = evt.getKeyCode();
        if (a == 10) {
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTextArea1KeyPressed

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
            java.util.logging.Logger.getLogger(AddLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLoan().setVisible(true);
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
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
