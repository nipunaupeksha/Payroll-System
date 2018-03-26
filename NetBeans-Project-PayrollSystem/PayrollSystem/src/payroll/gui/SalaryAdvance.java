/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import payroll.controller.AdvanceController;
import payroll.controller.EmployeeController;
import payroll.controller.GradeContoller;
import payroll.methods.payrollMethods;
import payroll.model.Advance;
import payroll.model.Employee;
import payroll.model.Grade;

/**
 *
 * @author ASUS
 */
public class SalaryAdvance extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private ClockLabel dateLable = new ClockLabel("date");
    private ClockLabel timeLable = new ClockLabel("time");
    private ClockLabel dayLable = new ClockLabel("day");

    public SalaryAdvance() {
        initComponents();
        try {
            Class.forName("ClockLabel");
        } catch (ClassNotFoundException e) {
        }
        jPanel1.setLayout(new FlowLayout());
        jPanel1.add(timeLable);
        jPanel1.add(dateLable);
        jPanel1.add(dayLable);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/rsz_bleach_login.png")));
        jLabel6.setVisible(true);
        jLabel9.setVisible(false);
        jLabel10.setVisible(true);
        jLabel5.setVisible(false);
        jLabel12.setVisible(true);
        jLabel15.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel24 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel24MouseDragged(evt);
            }
        });
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel24MousePressed(evt);
            }
        });
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("view salary");
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

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("pay salary");
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
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 740, 10));

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

        jLabel3.setFont(new java.awt.Font("Raleway Light", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("salary advance");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

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

        jLabel2.setFont(new java.awt.Font("Raleway Light", 0, 14)); // NOI18N
        jLabel2.setText("payroll system");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

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

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("view salary");
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 40));

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_2.png"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel26MouseExited(evt);
            }
        });
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, -1, 40));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/serach.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, -1, 40));

        jLabel17.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel17.setText("department");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 170, -1));

        jLabel18.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel18.setText("salary");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 170, -1));

        jLabel19.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel19.setText("maximum advance");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 220, -1));

        jLabel20.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel20.setText("advance amount");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 210, -1));

        jLabel21.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel21.setText("name");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 170, -1));

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

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Raleway Light", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("pay salary");
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
        jLabel10.setText("annual report");
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 200, 40));

        jLabel23.setFont(new java.awt.Font("Raleway Thin", 0, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("give advance");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 170, 40));

        jTextField2.setFont(new java.awt.Font("Raleway Light", 1, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 190, -1));

        jTextField3.setFont(new java.awt.Font("Raleway Light", 1, 24)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 190, -1));

        jTextField4.setFont(new java.awt.Font("Raleway Light", 1, 24)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, 190, -1));

        jTextField5.setFont(new java.awt.Font("Raleway Light", 1, 24)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 190, -1));

        jTextField6.setFont(new java.awt.Font("Raleway Light", 1, 24)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 190, -1));

        jTextField1.setFont(new java.awt.Font("Raleway Light", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 190, -1));

        jLabel16.setFont(new java.awt.Font("Raleway Light", 1, 24)); // NOI18N
        jLabel16.setText("employee ID");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 170, -1));

        jLabel22.setBackground(new java.awt.Color(153, 153, 153));
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel22.setOpaque(true);
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 490, 430));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 230, 570));

        jPanel1.setOpaque(false);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 170, 70));

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

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jLabel15.setVisible(false);
        jLabel12.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel6.setVisible(true);
        jLabel9.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseEntered

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
        jLabel25.setVisible(true);
        jLabel26.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new OptionPane_1_close().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel7.setVisible(true);
        jLabel8.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel5.setVisible(true);
        jLabel10.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setVisible(false);
        jLabel15.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jLabel13.setVisible(true);
        jLabel14.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        jLabel9.setVisible(false);
        jLabel15.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(true);
        jLabel12.setVisible(true);
        jLabel10.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setVisible(false);
        jLabel10.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setVisible(false);
        jLabel9.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        jLabel23.setFont(new Font("Raleway Light", 1, 24));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        jLabel23.setFont(new Font("Raleway Light", 0, 24));     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseEntered
        jLabel49.setVisible(false);
        jLabel36.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel49MouseEntered

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        this.dispose();
        new Home().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseExited
        jLabel49.setVisible(true);
        jLabel36.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel36MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        setState(ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel24MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseDragged

    private void jLabel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MousePressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.dispose();
        new PaySalary().setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.dispose();
        new ViewSalary().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
        new AnnualSalaryReport().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        try {
            Employee employee = EmployeeController.searchEmployee(jTextField1.getText());
            if (employee != null) {
                jTextField6.setText(employee.getFirstName() + " " + employee.getSecondName());
                jTextField2.setText(payrollMethods.getDepartmentName(jTextField1));
                jTextField3.setText(Double.toString(employee.getBasicSalary()));
                Grade grade = GradeContoller.getGradeDetails(employee.getGradeId());
                jTextField4.setText(Double.toString(grade.getMaxAdvanceRate() * employee.getBasicSalary()));
            } else {
                jTextField1.setBorder(new LineBorder(Color.red, 2));
                JOptionPane.showMessageDialog(this, "Employee Not Found");
            }
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        Advance advance = new Advance(jTextField1.getText(), dateLable.getText(), Double.parseDouble(jTextField5.getText()));
        try {
            boolean res = AdvanceController.addAdvance(advance);
            if (res == true) {
                JOptionPane.showMessageDialog(this, "Successfull!");
            }
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MouseEntered

    private void jLabel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseExited
        jLabel25.setVisible(true);
        jLabel26.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MouseExited

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
        jLabel25.setVisible(false);
        jLabel26.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        try {
            Employee employee = EmployeeController.searchEmployee(jTextField1.getText());
            if (employee != null) {
                jTextField6.setText(employee.getFirstName() + " " + employee.getSecondName());
                jTextField2.setText(payrollMethods.getDepartmentName(jTextField1));
                jTextField3.setText(Double.toString(employee.getBasicSalary()));
                Grade grade = GradeContoller.getGradeDetails(employee.getGradeId());
                jTextField4.setText(Double.toString(grade.getMaxAdvanceRate() * employee.getBasicSalary()));
            } else {
                jTextField1.setBorder(new LineBorder(Color.red, 2));
                JOptionPane.showMessageDialog(this, "Employee Not Found");
            }
        } catch (ClassNotFoundException | SQLException ex) {
        }
    }//GEN-LAST:event_jLabel26MouseClicked

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
            java.util.logging.Logger.getLogger(SalaryAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalaryAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalaryAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalaryAdvance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalaryAdvance().setVisible(true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}