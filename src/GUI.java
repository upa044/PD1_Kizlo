
import java.awt.Color;
import java.sql.*;
import javax.swing.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author user
 */
public class GUI extends javax.swing.JFrame {

    private String title;
    private String[][] testData;
    private int punkt = 0;
    private int megsk = 0;

    public GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registr = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LoginR = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        PasswordR = new javax.swing.JPasswordField();
        IelogotiesR = new javax.swing.JButton();
        iziet1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        Grup = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Rezult = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Atz = new javax.swing.JLabel();
        Proc = new javax.swing.JLabel();
        Punkt = new javax.swing.JLabel();
        Meiginat = new javax.swing.JButton();
        Sag_Iz = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        Megsk = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        UserR = new javax.swing.JLabel();
        Nosaukums = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        logerror = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        errorL = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        AdminPan = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        Iziet2 = new javax.swing.JButton();
        SaktTest = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        VisiTesti = new javax.swing.JList<>();
        jLabel41 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        AddNewTest = new javax.swing.JMenu();
        DeleteTesti = new javax.swing.JMenu();
        AllSudRez = new javax.swing.JMenu();
        ViewUs = new javax.swing.JMenu();
        DeleteUs = new javax.swing.JMenu();
        Test = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        Quest1 = new javax.swing.JLabel();
        Quest2 = new javax.swing.JLabel();
        Quest3 = new javax.swing.JLabel();
        Quest5 = new javax.swing.JLabel();
        Quest4 = new javax.swing.JLabel();
        JRB1 = new javax.swing.JRadioButton();
        JRB2 = new javax.swing.JRadioButton();
        JRB3 = new javax.swing.JRadioButton();
        JRB4 = new javax.swing.JRadioButton();
        JRB5 = new javax.swing.JRadioButton();
        JRB6 = new javax.swing.JRadioButton();
        JRB7 = new javax.swing.JRadioButton();
        JRB8 = new javax.swing.JRadioButton();
        JRB9 = new javax.swing.JRadioButton();
        JRB10 = new javax.swing.JRadioButton();
        JRB11 = new javax.swing.JRadioButton();
        JRB12 = new javax.swing.JRadioButton();
        JRB13 = new javax.swing.JRadioButton();
        JRB14 = new javax.swing.JRadioButton();
        JRB15 = new javax.swing.JRadioButton();
        Pabeigt = new javax.swing.JButton();
        ANS1 = new javax.swing.JLabel();
        ANS2 = new javax.swing.JLabel();
        ANS3 = new javax.swing.JLabel();
        ANS4 = new javax.swing.JLabel();
        ANS5 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        ViewUser = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        Saerch = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        Iziet3 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        DeleteUser = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        Search2 = new javax.swing.JTextField();
        Iziet4 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        PassM = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        PassMa = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        SaveCP = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        UserM = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        PassC = new javax.swing.JPasswordField();
        Paradit = new javax.swing.JCheckBox();
        TestTools = new javax.swing.JDialog();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Title = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        qu1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        op1_1 = new javax.swing.JTextField();
        op2_1 = new javax.swing.JTextField();
        op3_1 = new javax.swing.JTextField();
        an1 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        qu2 = new javax.swing.JTextField();
        qu3 = new javax.swing.JTextField();
        qu4 = new javax.swing.JTextField();
        qu5 = new javax.swing.JTextField();
        op1_2 = new javax.swing.JTextField();
        op1_3 = new javax.swing.JTextField();
        op1_4 = new javax.swing.JTextField();
        op1_5 = new javax.swing.JTextField();
        op2_2 = new javax.swing.JTextField();
        op2_3 = new javax.swing.JTextField();
        op2_4 = new javax.swing.JTextField();
        op2_5 = new javax.swing.JTextField();
        op3_2 = new javax.swing.JTextField();
        op3_3 = new javax.swing.JTextField();
        op3_4 = new javax.swing.JTextField();
        op3_5 = new javax.swing.JTextField();
        an2 = new javax.swing.JTextField();
        an3 = new javax.swing.JTextField();
        an4 = new javax.swing.JTextField();
        an5 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        BG1 = new javax.swing.ButtonGroup();
        BG2 = new javax.swing.ButtonGroup();
        BG3 = new javax.swing.ButtonGroup();
        BG4 = new javax.swing.ButtonGroup();
        BG5 = new javax.swing.ButtonGroup();
        testSelector = new javax.swing.ButtonGroup();
        DeleteTest = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        SearchTest = new javax.swing.JTextField();
        Iziet5 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        ViewRezult = new javax.swing.JDialog();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        SearchR = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        Iziet6 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        Help = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        HELPS = new javax.swing.JScrollPane();
        image = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        Ok = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Login = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        RemPass = new javax.swing.JLabel();
        Ienakt = new javax.swing.JButton();
        iziet = new javax.swing.JButton();
        Reg = new javax.swing.JLabel();
        ParaditPass = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        Registr.setBounds(new java.awt.Rectangle(0, 0, 540, 428));
        Registr.setMinimumSize(new java.awt.Dimension(540, 428));
        Registr.setSize(new java.awt.Dimension(540, 428));
        Registr.getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setToolTipText("");
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setPreferredSize(new java.awt.Dimension(350, 300));

        jLabel4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registration");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User name:");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password:");

        IelogotiesR.setBackground(new java.awt.Color(255, 255, 255));
        IelogotiesR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IelogotiesR.setForeground(new java.awt.Color(0, 0, 0));
        IelogotiesR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/login_111088.jpg"))); // NOI18N
        IelogotiesR.setText("Ielogoties");
        IelogotiesR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IelogotiesR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IelogotiesRActionPerformed(evt);
            }
        });

        iziet1.setBackground(new java.awt.Color(255, 255, 255));
        iziet1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iziet1.setForeground(new java.awt.Color(0, 0, 0));
        iziet1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/free-icon-exit-157899.jpg"))); // NOI18N
        iziet1.setText("Iziet");
        iziet1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iziet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iziet1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date of birth(YYYY/MM/DD): ");

        Date.setText("YYYY-MM-DD");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender:");

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<izvēlēties dzimumu>", "vīriešu.", "sieviešu.", "paslēpt." }));
        Gender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel36.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Group:");

        Grup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<izvēlēties grupu(Skolotajs/Student)>", "Skolotajs", "Student", " " }));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/hiclipart.com.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Date)
                                .addComponent(jLabel11)
                                .addComponent(LoginR)
                                .addComponent(jLabel12)
                                .addComponent(Gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addComponent(PasswordR)
                                .addComponent(jLabel36)
                                .addComponent(Grup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(IelogotiesR)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iziet1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel5)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel28))
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Grup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IelogotiesR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iziet1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Registr.getContentPane().add(jPanel3);
        jPanel3.setBounds(250, 0, 280, 390);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/istockphoto-1218473959-612x612.jpg"))); // NOI18N
        Registr.getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 520, 390);

        Rezult.setBounds(new java.awt.Rectangle(0, 0, 671, 455));
        Rezult.setMinimumSize(new java.awt.Dimension(671, 455));
        Rezult.setPreferredSize(new java.awt.Dimension(671, 455));
        Rezult.setSize(new java.awt.Dimension(671, 455));
        Rezult.getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Rezultati");

        Atz.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        Atz.setForeground(new java.awt.Color(153, 153, 153));
        Atz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Atz.setText("Atzime: X/5");

        Proc.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        Proc.setForeground(new java.awt.Color(153, 153, 153));
        Proc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Proc.setText("Procenti: X/100%");

        Punkt.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        Punkt.setForeground(new java.awt.Color(153, 153, 153));
        Punkt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Punkt.setText("Punkti: X/10p");

        Meiginat.setBackground(new java.awt.Color(255, 255, 255));
        Meiginat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Meiginat.setForeground(new java.awt.Color(0, 0, 0));
        Meiginat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/pngwing.com.jpg"))); // NOI18N
        Meiginat.setText("Mēģiniet vēlreiz");
        Meiginat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Meiginat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeiginatActionPerformed(evt);
            }
        });

        Sag_Iz.setBackground(new java.awt.Color(51, 255, 0));
        Sag_Iz.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Sag_Iz.setForeground(new java.awt.Color(0, 0, 0));
        Sag_Iz.setText("Saglabat un iziet");
        Sag_Iz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sag_Iz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sag_IzActionPerformed(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/hiclipart.com.png"))); // NOI18N
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        Megsk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Megsk.setForeground(new java.awt.Color(255, 255, 255));
        Megsk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Megsk.setText("Mēģinajuma skaits: 1/1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Megsk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Proc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Punkt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(Meiginat, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(Sag_Iz, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addComponent(Atz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addGap(10, 10, 10)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Atz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Proc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Punkt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Megsk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Meiginat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sag_Iz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        Rezult.getContentPane().add(jPanel1);
        jPanel1.setBounds(110, 60, 400, 340);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        UserR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UserR.setForeground(new java.awt.Color(255, 255, 255));
        UserR.setText("User name:");

        Nosaukums.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Nosaukums.setForeground(new java.awt.Color(255, 255, 255));
        Nosaukums.setText("Testa nosaukums:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(UserR, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(Nosaukums, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(UserR)
                .addGap(18, 18, 18)
                .addComponent(Nosaukums)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Rezult.getContentPane().add(jPanel4);
        jPanel4.setBounds(520, 0, 150, 100);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/istockphoto-1218473959-612x612.jpg"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(612, 437));
        jLabel6.setMinimumSize(new java.awt.Dimension(612, 437));
        jLabel6.setPreferredSize(new java.awt.Dimension(612, 437));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Rezult.getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 0, 670, 420);

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        errorL.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        errorL.setForeground(new java.awt.Color(204, 0, 0));
        errorL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorL.setText("Invalid login or password. Try again");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Ok");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorL, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(207, 207, 207))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(errorL)
                .addGap(39, 39, 39)
                .addComponent(jButton3)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout logerrorLayout = new javax.swing.GroupLayout(logerror.getContentPane());
        logerror.getContentPane().setLayout(logerrorLayout);
        logerrorLayout.setHorizontalGroup(
            logerrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        logerrorLayout.setVerticalGroup(
            logerrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        Iziet2.setBackground(new java.awt.Color(204, 0, 51));
        Iziet2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Iziet2.setForeground(new java.awt.Color(0, 0, 0));
        Iziet2.setText("Iziet");
        Iziet2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Iziet2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iziet2ActionPerformed(evt);
            }
        });

        SaktTest.setBackground(new java.awt.Color(255, 255, 255));
        SaktTest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SaktTest.setForeground(new java.awt.Color(0, 0, 0));
        SaktTest.setText("Sakt Testu");
        SaktTest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaktTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaktTestActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Testu Izvele");

        jScrollPane4.setViewportView(VisiTesti);

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/hiclipart.com.png"))); // NOI18N
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel41))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(SaktTest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Iziet2)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaktTest)
                    .addComponent(Iziet2))
                .addGap(46, 46, 46))
        );

        AddNewTest.setText("Add New Test");
        AddNewTest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddNewTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddNewTestMouseClicked(evt);
            }
        });
        jMenuBar1.add(AddNewTest);

        DeleteTesti.setText("Delete Test");
        DeleteTesti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteTesti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteTestiMouseClicked(evt);
            }
        });
        jMenuBar1.add(DeleteTesti);

        AllSudRez.setText("All Student Rezultat");
        AllSudRez.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AllSudRez.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllSudRezMouseClicked(evt);
            }
        });
        jMenuBar1.add(AllSudRez);

        ViewUs.setText("View Users");
        ViewUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewUsMouseClicked(evt);
            }
        });
        jMenuBar1.add(ViewUs);

        DeleteUs.setText("Delete User");
        DeleteUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteUsMouseClicked(evt);
            }
        });
        jMenuBar1.add(DeleteUs);

        AdminPan.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout AdminPanLayout = new javax.swing.GroupLayout(AdminPan.getContentPane());
        AdminPan.getContentPane().setLayout(AdminPanLayout);
        AdminPanLayout.setHorizontalGroup(
            AdminPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AdminPanLayout.setVerticalGroup(
            AdminPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Title");

        Save.setBackground(new java.awt.Color(255, 255, 255));
        Save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Save.setForeground(new java.awt.Color(0, 0, 0));
        Save.setText("Save");
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Quest1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Quest1.setForeground(new java.awt.Color(255, 255, 255));
        Quest1.setText("1)Question1?");

        Quest2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Quest2.setForeground(new java.awt.Color(255, 255, 255));
        Quest2.setText("2)Question2?");

        Quest3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Quest3.setForeground(new java.awt.Color(255, 255, 255));
        Quest3.setText("3)Question3?");

        Quest5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Quest5.setForeground(new java.awt.Color(255, 255, 255));
        Quest5.setText("5)Question5?");

        Quest4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Quest4.setForeground(new java.awt.Color(255, 255, 255));
        Quest4.setText("4)Question4?");

        BG1.add(JRB1);
        JRB1.setForeground(new java.awt.Color(255, 255, 255));
        JRB1.setText("Option1");

        BG1.add(JRB2);
        JRB2.setForeground(new java.awt.Color(255, 255, 255));
        JRB2.setText("Option2");

        BG1.add(JRB3);
        JRB3.setForeground(new java.awt.Color(255, 255, 255));
        JRB3.setText("Option3");

        BG2.add(JRB4);
        JRB4.setForeground(new java.awt.Color(255, 255, 255));
        JRB4.setText("Option1");

        BG2.add(JRB5);
        JRB5.setForeground(new java.awt.Color(255, 255, 255));
        JRB5.setText("Option2");

        BG2.add(JRB6);
        JRB6.setForeground(new java.awt.Color(255, 255, 255));
        JRB6.setText("Option3");

        BG3.add(JRB7);
        JRB7.setForeground(new java.awt.Color(255, 255, 255));
        JRB7.setText("Option1");

        BG3.add(JRB8);
        JRB8.setForeground(new java.awt.Color(255, 255, 255));
        JRB8.setText("Option2");

        BG3.add(JRB9);
        JRB9.setForeground(new java.awt.Color(255, 255, 255));
        JRB9.setText("Option3");

        BG4.add(JRB10);
        JRB10.setForeground(new java.awt.Color(255, 255, 255));
        JRB10.setText("Option1");

        BG4.add(JRB11);
        JRB11.setForeground(new java.awt.Color(255, 255, 255));
        JRB11.setText("Option2");

        BG4.add(JRB12);
        JRB12.setForeground(new java.awt.Color(255, 255, 255));
        JRB12.setText("Option3");

        BG5.add(JRB13);
        JRB13.setForeground(new java.awt.Color(255, 255, 255));
        JRB13.setText("Option1");

        BG5.add(JRB14);
        JRB14.setForeground(new java.awt.Color(255, 255, 255));
        JRB14.setText("Option2");

        BG5.add(JRB15);
        JRB15.setForeground(new java.awt.Color(255, 255, 255));
        JRB15.setText("Option3");

        Pabeigt.setBackground(new java.awt.Color(255, 255, 255));
        Pabeigt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Pabeigt.setForeground(new java.awt.Color(0, 0, 0));
        Pabeigt.setText("Pabeigt ");
        Pabeigt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pabeigt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PabeigtActionPerformed(evt);
            }
        });

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/hiclipart.com.png"))); // NOI18N
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Quest4)
                                    .addComponent(JRB1)
                                    .addComponent(JRB3)
                                    .addComponent(Quest2)
                                    .addComponent(JRB4)
                                    .addComponent(JRB6)
                                    .addComponent(Quest3)
                                    .addComponent(JRB7)
                                    .addComponent(JRB9)
                                    .addComponent(JRB10)
                                    .addComponent(Quest5)
                                    .addComponent(JRB12)
                                    .addComponent(JRB13)
                                    .addComponent(JRB15)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(JRB2)
                                        .addGap(77, 77, 77)
                                        .addComponent(ANS1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(JRB5)
                                        .addGap(77, 77, 77)
                                        .addComponent(ANS2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(JRB8)
                                        .addGap(77, 77, 77)
                                        .addComponent(ANS3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(JRB11)
                                        .addGap(71, 71, 71)
                                        .addComponent(ANS4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(JRB14)
                                        .addGap(71, 71, 71)
                                        .addComponent(ANS5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(Quest1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel42)))))
                .addContainerGap())
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(Save)
                .addGap(27, 27, 27)
                .addComponent(Pabeigt)
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(31, 31, 31)
                        .addComponent(Quest1))
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRB1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRB2)
                    .addComponent(ANS1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRB3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Quest2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRB4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRB5)
                    .addComponent(ANS2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRB6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Quest3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRB7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRB8)
                    .addComponent(ANS3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRB9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Quest4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRB10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRB11)
                    .addComponent(ANS4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRB12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Quest5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRB13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JRB14)
                    .addComponent(ANS5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JRB15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Pabeigt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout TestLayout = new javax.swing.GroupLayout(Test.getContentPane());
        Test.getContentPane().setLayout(TestLayout);
        TestLayout.setHorizontalGroup(
            TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TestLayout.setVerticalGroup(
            TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "username", "gender", "password", "birth", "grup"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        jLabel37.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("View Users");

        Saerch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SaerchKeyReleased(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Search:");

        Iziet3.setBackground(new java.awt.Color(204, 0, 51));
        Iziet3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Iziet3.setForeground(new java.awt.Color(0, 0, 0));
        Iziet3.setText("Iziet");
        Iziet3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Iziet3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iziet3ActionPerformed(evt);
            }
        });

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/hiclipart.com.png"))); // NOI18N
        jLabel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Saerch, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel43)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(Iziet3)
                                .addGap(357, 357, 357))))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Saerch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38))
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Iziet3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ViewUserLayout = new javax.swing.GroupLayout(ViewUser.getContentPane());
        ViewUser.getContentPane().setLayout(ViewUserLayout);
        ViewUserLayout.setHorizontalGroup(
            ViewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ViewUserLayout.setVerticalGroup(
            ViewUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Delete User");

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "username", "gender", "password", "birth", "group"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Seach:");

        Search2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search2KeyReleased(evt);
            }
        });

        Iziet4.setBackground(new java.awt.Color(153, 0, 0));
        Iziet4.setForeground(new java.awt.Color(0, 0, 0));
        Iziet4.setText("Iziet");
        Iziet4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Iziet4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iziet4ActionPerformed(evt);
            }
        });

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/hiclipart.com.png"))); // NOI18N
        jLabel44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Search2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel44)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(Iziet4)
                                .addGap(358, 358, 358))))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(Search2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Iziet4)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DeleteUserLayout = new javax.swing.GroupLayout(DeleteUser.getContentPane());
        DeleteUser.getContentPane().setLayout(DeleteUserLayout);
        DeleteUserLayout.setHorizontalGroup(
            DeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DeleteUserLayout.setVerticalGroup(
            DeleteUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Uzrakstīt jaunu paroli.");

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Apstiprināt jauno paroli.");

        SaveCP.setBackground(new java.awt.Color(0, 204, 0));
        SaveCP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SaveCP.setForeground(new java.awt.Color(0, 0, 0));
        SaveCP.setText("Save");
        SaveCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveCPActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 0, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Exit");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Uzrakstiet savu lietotājvārdu.");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setForeground(new java.awt.Color(0, 0, 0));

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Password change");

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/hiclipart.com.png"))); // NOI18N
        jLabel45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel45))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel45))
        );

        Paradit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Paradit.setForeground(new java.awt.Color(255, 255, 255));
        Paradit.setText("Parādīt paroli.");
        Paradit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Paradit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PassC, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Paradit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserM, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassMa, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(SaveCP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(11, 11, 11)
                .addComponent(PassMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PassC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Paradit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveCP)
                    .addComponent(jButton2))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout PassMLayout = new javax.swing.GroupLayout(PassM.getContentPane());
        PassM.getContentPane().setLayout(PassMLayout);
        PassMLayout.setHorizontalGroup(
            PassMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PassMLayout.setVerticalGroup(
            PassMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TestTools.setBounds(new java.awt.Rectangle(0, 0, 834, 477));
        TestTools.setMinimumSize(new java.awt.Dimension(834, 477));
        TestTools.setSize(new java.awt.Dimension(834, 477));

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Test Tools");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Title:");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Question:");

        qu1.setText("Question(1)");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Option1:");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Option2:");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Option3:");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Answer");

        op1_1.setText("Option(1)");

        op2_1.setText("Option(2)");

        op3_1.setText("Option(3)");

        an1.setText("Answer(1)");

        jButton11.setBackground(new java.awt.Color(102, 255, 0));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setText("Save Tools");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(204, 0, 0));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 0));
        jButton12.setText("Exit");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        qu2.setText("Question(2)");

        qu3.setText("Question(3)");

        qu4.setText("Question(4)");

        qu5.setText("Question(5)");

        op1_2.setText("Option(1)");

        op1_3.setText("Option(1)");

        op1_4.setText("Option(1)");

        op1_5.setText("Option(1)");

        op2_2.setText("Option(2)");

        op2_3.setText("Option(2)");

        op2_4.setText("Option(2)");

        op2_5.setText("Option(2)");

        op3_2.setText("Option(3)");

        op3_3.setText("Option(3)");

        op3_4.setText("Option(3)");

        op3_5.setText("Option(3)");

        an2.setText("Answer(2)");

        an3.setText("Answer(3)");

        an4.setText("Answer(4)");

        an5.setText("Answer(5)");

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/hiclipart.com.png"))); // NOI18N
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton12))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel16Layout.createSequentialGroup()
                                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(op1_1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(op2_1)
                                                    .addComponent(op3_1)
                                                    .addComponent(an1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qu1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(qu2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(op1_2)
                                    .addComponent(op2_2)
                                    .addComponent(op3_2)
                                    .addComponent(an2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(qu3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(op1_3)
                                    .addComponent(op2_3)
                                    .addComponent(op3_3)
                                    .addComponent(an3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(qu4, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(op1_4)
                                    .addComponent(op2_4)
                                    .addComponent(op3_4)
                                    .addComponent(an4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(qu5, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(op1_5)
                                    .addComponent(op2_5)
                                    .addComponent(op3_5)
                                    .addComponent(an5)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel46)
                                .addGap(14, 14, 14)))))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel46))
                .addGap(5, 5, 5)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(qu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(op1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op1_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op1_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(op2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(op2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(op2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(op2_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(op2_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(op3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op3_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(op3_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(an1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(an2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(an3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(an4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(an5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TestToolsLayout = new javax.swing.GroupLayout(TestTools.getContentPane());
        TestTools.getContentPane().setLayout(TestToolsLayout);
        TestToolsLayout.setHorizontalGroup(
            TestToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TestToolsLayout.setVerticalGroup(
            TestToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        DeleteTest.setBounds(new java.awt.Rectangle(0, 0, 1154, 388));
        DeleteTest.setMinimumSize(new java.awt.Dimension(1154, 388));
        DeleteTest.setSize(new java.awt.Dimension(1154, 388));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Delete Test");

        jTable3.setBackground(new java.awt.Color(255, 255, 255));
        jTable3.setForeground(new java.awt.Color(0, 0, 0));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "title", "quest1", "quest2", "quest3", "quest4", "quest5", "opt1", "opt2", "opt3", "opt4", "opt5", "opt6", "opt7", "opt8", "opt9", "opt10", "opt11", "opt12", "opt13", "opt14", "opt15"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable3);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Seach:");

        SearchTest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTestKeyReleased(evt);
            }
        });

        Iziet5.setBackground(new java.awt.Color(153, 0, 0));
        Iziet5.setForeground(new java.awt.Color(0, 0, 0));
        Iziet5.setText("Iziet");
        Iziet5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Iziet5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iziet5ActionPerformed(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/hiclipart.com.png"))); // NOI18N
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1142, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 881, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchTest, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Iziet5)
                .addGap(521, 521, 521))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(SearchTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Iziet5)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DeleteTestLayout = new javax.swing.GroupLayout(DeleteTest.getContentPane());
        DeleteTest.getContentPane().setLayout(DeleteTestLayout);
        DeleteTestLayout.setHorizontalGroup(
            DeleteTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DeleteTestLayout.setVerticalGroup(
            DeleteTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ViewRezult.setBounds(new java.awt.Rectangle(0, 0, 825, 430));
        ViewRezult.setMinimumSize(new java.awt.Dimension(825, 430));
        ViewRezult.setSize(new java.awt.Dimension(825, 430));

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));

        jTable4.setBackground(new java.awt.Color(255, 255, 255));
        jTable4.setForeground(new java.awt.Color(0, 0, 0));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "username", "mark", "procenti", "punkti", "test", "repeat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(jTable4);

        jLabel39.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("View Rezultati");

        SearchR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchRKeyReleased(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Search:");

        Iziet6.setBackground(new java.awt.Color(204, 0, 51));
        Iziet6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Iziet6.setForeground(new java.awt.Color(0, 0, 0));
        Iziet6.setText("Iziet");
        Iziet6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Iziet6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iziet6ActionPerformed(evt);
            }
        });

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/hiclipart.com.png"))); // NOI18N
        jLabel48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchR, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel48)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Iziet6)
                .addGap(365, 365, 365))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel48)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Iziet6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ViewRezultLayout = new javax.swing.GroupLayout(ViewRezult.getContentPane());
        ViewRezult.getContentPane().setLayout(ViewRezultLayout);
        ViewRezultLayout.setHorizontalGroup(
            ViewRezultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ViewRezultLayout.setVerticalGroup(
            ViewRezultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Help.setBounds(new java.awt.Rectangle(0, 0, 465, 535));
        Help.setMinimumSize(new java.awt.Dimension(465, 535));
        Help.setSize(new java.awt.Dimension(465, 535));
        Help.getContentPane().setLayout(null);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        image.setBackground(new java.awt.Color(255, 255, 255));
        image.setForeground(new java.awt.Color(255, 255, 255));
        HELPS.setViewportView(image);

        jLabel47.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Help Window");

        Ok.setBackground(new java.awt.Color(255, 255, 255));
        Ok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ok.setForeground(new java.awt.Color(0, 0, 0));
        Ok.setText("Exit");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(HELPS, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(Ok)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HELPS, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ok)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Help.getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 0, 440, 510);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 500, 340));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 340));
        setPreferredSize(new java.awt.Dimension(500, 340));
        setSize(new java.awt.Dimension(500, 340));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setToolTipText("");
        jPanel2.setMinimumSize(new java.awt.Dimension(230, 297));
        jPanel2.setPreferredSize(new java.awt.Dimension(230, 297));

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");

        RemPass.setForeground(new java.awt.Color(0, 51, 255));
        RemPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RemPass.setText("aizmirsāt savu paroli?");
        RemPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RemPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemPassMouseClicked(evt);
            }
        });

        Ienakt.setBackground(new java.awt.Color(255, 255, 255));
        Ienakt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ienakt.setForeground(new java.awt.Color(0, 0, 0));
        Ienakt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/login_111088.jpg"))); // NOI18N
        Ienakt.setText("Ienakt");
        Ienakt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ienakt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IenaktActionPerformed(evt);
            }
        });

        iziet.setBackground(new java.awt.Color(255, 255, 255));
        iziet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iziet.setForeground(new java.awt.Color(0, 0, 0));
        iziet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/free-icon-exit-157899.jpg"))); // NOI18N
        iziet.setText("Iziet");
        iziet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iziet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izietActionPerformed(evt);
            }
        });

        Reg.setForeground(new java.awt.Color(0, 51, 255));
        Reg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reg.setText("izveidot kontu.");
        Reg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegMouseClicked(evt);
            }
        });

        ParaditPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ParaditPass.setForeground(new java.awt.Color(255, 255, 255));
        ParaditPass.setText("Parādīt paroli.");
        ParaditPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ParaditPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaditPassActionPerformed(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/hiclipart.com.png"))); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParaditPass, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Reg, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                        .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                        .addComponent(Login)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jLabel3))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RemPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Ienakt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(iziet)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel27))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel27))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ParaditPass)
                .addGap(14, 14, 14)
                .addComponent(RemPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ienakt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iziet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Reg, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(260, 0, 230, 310);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/istockphoto-1218473959-612x612.jpg"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(486, 297));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 490, 340);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IenaktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IenaktActionPerformed
        Question test = new Question(VisiTesti);
        User db = new User();

        String login = Login.getText();
        String password = Password.getText();

        String grup = db.login(login, password);

        if (db.loginstatus == 1) {
            this.setVisible(false);

            if ("Skolotajs".equals(grup)) {
                test.loadTitles();
                AdminPan.pack();
                AdminPan.setLocationRelativeTo(null);
                AdminPan.setVisible(true);
                jMenuBar1.setVisible(true);

            } else {
                test.loadTitles();
                AdminPan.setBounds(0,0,592,342);
                AdminPan.setLocationRelativeTo(null);
                AdminPan.setVisible(true);
                jMenuBar1.setVisible(false);
            }
        } else {
            logerror.setVisible(true);
            logerror.pack();
            logerror.setLocationRelativeTo(null);
            errorL.setText("Invalid login or password");
        }
    }//GEN-LAST:event_IenaktActionPerformed

    private void RegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegMouseClicked
        this.setVisible(false);
        Registr.pack();
        Registr.setLocationRelativeTo(null);
        Registr.setVisible(true);
    }//GEN-LAST:event_RegMouseClicked

    private void RemPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemPassMouseClicked

        PassM.pack();
        PassM.setLocationRelativeTo(null);
        PassM.setVisible(true);
    }//GEN-LAST:event_RemPassMouseClicked

    private void IelogotiesRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IelogotiesRActionPerformed
        User db = new User();
        String username = LoginR.getText();
        String birth = Date.getText();
        String gender = Gender.getSelectedItem().toString();
        String password = PasswordR.getText();
        String grup = Grup.getSelectedItem().toString();

        try {
            db.register(username, gender, password, birth, grup);

        } catch (SQLException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        db.sendToUsers(username, password, grup);

        PasswordR.setText("");
        LoginR.setText("");
        Date.setText("");

        Registr.dispose();
        setVisible(true);


    }//GEN-LAST:event_IelogotiesRActionPerformed


    private void iziet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iziet1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_iziet1ActionPerformed

    private void izietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izietActionPerformed
        System.exit(0);
    }//GEN-LAST:event_izietActionPerformed

    private void MeiginatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeiginatActionPerformed

        Question db = new Question(VisiTesti);
        title = VisiTesti.getSelectedValue();
        if (title != null) {
            testData = db.getTestData(title);
            jLabel29.setText(title);
            Quest1.setText(testData[0][0]);
            JRB1.setText(testData[0][1]);
            JRB2.setText(testData[0][2]);
            JRB3.setText(testData[0][3]);
            Quest2.setText(testData[1][0]);
            JRB4.setText(testData[1][1]);
            JRB5.setText(testData[1][2]);
            JRB6.setText(testData[1][3]);
            Quest3.setText(testData[2][0]);
            JRB7.setText(testData[2][1]);
            JRB8.setText(testData[2][2]);
            JRB9.setText(testData[2][3]);
            Quest4.setText(testData[3][0]);
            JRB10.setText(testData[3][1]);
            JRB11.setText(testData[3][2]);
            JRB12.setText(testData[3][3]);
            Quest5.setText(testData[4][0]);
            JRB13.setText(testData[4][1]);
            JRB14.setText(testData[4][2]);
            JRB15.setText(testData[4][3]);

            JRB1.setActionCommand(JRB1.getText());
            JRB2.setActionCommand(JRB2.getText());
            JRB3.setActionCommand(JRB3.getText());
            JRB4.setActionCommand(JRB4.getText());
            JRB5.setActionCommand(JRB5.getText());
            JRB6.setActionCommand(JRB6.getText());
            JRB7.setActionCommand(JRB7.getText());
            JRB8.setActionCommand(JRB8.getText());
            JRB9.setActionCommand(JRB9.getText());
            JRB10.setActionCommand(JRB10.getText());
            JRB11.setActionCommand(JRB11.getText());
            JRB12.setActionCommand(JRB12.getText());
            JRB13.setActionCommand(JRB13.getText());
            JRB14.setActionCommand(JRB14.getText());
            JRB15.setActionCommand(JRB15.getText());

            ANS1.setText("");
            ANS2.setText("");
            ANS3.setText("");
            ANS4.setText("");
            ANS5.setText("");

            BG1.clearSelection();
            BG2.clearSelection();
            BG3.clearSelection();
            BG4.clearSelection();
            BG5.clearSelection();

            JRB1.setEnabled(true);
            JRB2.setEnabled(true);
            JRB3.setEnabled(true);
            JRB4.setEnabled(true);
            JRB5.setEnabled(true);
            JRB6.setEnabled(true);
            JRB7.setEnabled(true);
            JRB8.setEnabled(true);
            JRB9.setEnabled(true);
            JRB10.setEnabled(true);
            JRB11.setEnabled(true);
            JRB12.setEnabled(true);
            JRB13.setEnabled(true);
            JRB14.setEnabled(true);
            JRB15.setEnabled(true);

            megsk++;
            Test.pack();
            Test.setLocationRelativeTo(null);
            Test.setVisible(true);
        } else {

            logerror.setVisible(true);
            logerror.pack();
            logerror.setLocationRelativeTo(null);
            errorL.setText("Please select a test.");
        }

    }//GEN-LAST:event_MeiginatActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        Question db = new Question(VisiTesti);
        punkt = 0;
        String checkAnswer1 = "SELECT * FROM APP.ANSWER WHERE TITLE=? AND AN1 =? ";
        String checkAnswer2 = "SELECT * FROM APP.ANSWER WHERE TITLE=? AND AN2 =? ";
        String checkAnswer3 = "SELECT * FROM APP.ANSWER WHERE TITLE=? AND AN3 =? ";
        String checkAnswer4 = "SELECT * FROM APP.ANSWER WHERE TITLE=? AND AN4 =? ";
        String checkAnswer5 = "SELECT * FROM APP.ANSWER WHERE TITLE=? AND AN5 =? ";
        title = VisiTesti.getSelectedValue();

        try (Connection connection = DriverManager.getConnection(Question.DB_URL, Question.DB_USER, Question.DB_PASSWD);) {
            PreparedStatement pst;
            ResultSet rs;
            pst = connection.prepareStatement(checkAnswer1);
            pst.setString(1, title);
            pst.setString(2, BG1.getSelection().getActionCommand());
            rs = pst.executeQuery();
            if (rs.next()) {
                punkt++;
                ANS1.setText("Pareiza atbilde");
                ANS1.setForeground(Color.GREEN);
            } else {
                ANS1.setText("Atbilde nav pareiza");
                ANS1.setForeground(Color.RED);

            }
            JRB1.setEnabled(false);
            JRB2.setEnabled(false);
            JRB3.setEnabled(false);

            pst = connection.prepareStatement(checkAnswer2);
            pst.setString(1, title);
            pst.setString(2, BG2.getSelection().getActionCommand());
            rs = pst.executeQuery();
            if (rs.next()) {
                punkt++;
                ANS2.setText("Pareiza atbilde");
                ANS2.setForeground(Color.GREEN);
            } else {
                ANS2.setText("Atbilde nav pareiza");
                ANS2.setForeground(Color.RED);

            }
            JRB4.setEnabled(false);
            JRB5.setEnabled(false);
            JRB6.setEnabled(false);

            pst = connection.prepareStatement(checkAnswer3);
            pst.setString(1, title);
            pst.setString(2, BG3.getSelection().getActionCommand());
            rs = pst.executeQuery();
            if (rs.next()) {
                punkt++;
                ANS3.setText("Pareiza atbilde");
                ANS3.setForeground(Color.GREEN);
            } else {
                ANS3.setText("Atbilde nav pareiza");
                ANS3.setForeground(Color.RED);

            }
            JRB7.setEnabled(false);
            JRB8.setEnabled(false);
            JRB9.setEnabled(false);

            pst = connection.prepareStatement(checkAnswer4);
            pst.setString(1, title);
            pst.setString(2, BG4.getSelection().getActionCommand());
            rs = pst.executeQuery();
            if (rs.next()) {
                punkt++;
                ANS4.setText("Pareiza atbilde");
                ANS4.setForeground(Color.GREEN);
            } else {
                ANS4.setText("Atbilde nav pareiza");
                ANS4.setForeground(Color.RED);

            }
            JRB10.setEnabled(false);
            JRB11.setEnabled(false);
            JRB12.setEnabled(false);

            pst = connection.prepareStatement(checkAnswer5);
            pst.setString(1, title);
            pst.setString(2, BG5.getSelection().getActionCommand());
            rs = pst.executeQuery();
            if (rs.next()) {
                punkt++;
                ANS5.setText("Pareiza atbilde");
                ANS5.setForeground(Color.GREEN);
            } else {
                ANS5.setText("Atbilde nav pareiza");
                ANS5.setForeground(Color.RED);
            }
            JRB13.setEnabled(false);
            JRB14.setEnabled(false);
            JRB15.setEnabled(false);

        } catch (SQLException e) {
            logerror.setVisible(true);
            logerror.pack();
            logerror.setLocationRelativeTo(null);
            errorL.setText("Please select a test answer.");

        }
    }//GEN-LAST:event_SaveActionPerformed

    private void AddNewTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewTestMouseClicked
        this.setVisible(false);
        TestTools.pack();
        TestTools.setLocationRelativeTo(null);
        TestTools.setVisible(true);
    }//GEN-LAST:event_AddNewTestMouseClicked

    private void ViewUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewUsMouseClicked

        this.setVisible(false);
        ViewUser.pack();
        ViewUser.setLocationRelativeTo(null);
        ViewUser.setVisible(true);
        Admin db = new Admin();
        db.viewuser(jTable1);


    }//GEN-LAST:event_ViewUsMouseClicked

    private void SaerchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SaerchKeyReleased
        Admin db = new Admin();
        String searchUser = Saerch.getText();
        db.searchUser(searchUser, jTable1);
    }//GEN-LAST:event_SaerchKeyReleased

    private void Iziet3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iziet3ActionPerformed
        ViewUser.dispose();
        AdminPan.setVisible(true);
    }//GEN-LAST:event_Iziet3ActionPerformed

    private void DeleteUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteUsMouseClicked
        this.setVisible(false);
        DeleteUser.pack();
        DeleteUser.setLocationRelativeTo(null);
        DeleteUser.setVisible(true);
        Admin db = new Admin();
        db.viewuser(jTable2);
    }//GEN-LAST:event_DeleteUsMouseClicked

    private void Search2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search2KeyReleased
        Admin db = new Admin();
        String searchUser = Search2.getText();
        db.searchUser(searchUser, jTable2);
    }//GEN-LAST:event_Search2KeyReleased

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow >= 0) {
            String username = (String) jTable2.getValueAt(selectedRow, 0);

            int response = JOptionPane.showConfirmDialog(null, "Vai tiešām vēlaties dzēst lietotāju " + username + "?", "Dzēšanas apstiprināšana", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                Admin db = new Admin();
                db.removeUser(jTable2);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lūdzu, atlasiet dzēšamo lietotāju.");
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void Iziet4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iziet4ActionPerformed
        DeleteUser.dispose();
    }//GEN-LAST:event_Iziet4ActionPerformed

    private void SaveCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveCPActionPerformed
        User db = new User();
        String username = UserM.getText();
        String newPassword = PassMa.getText();
        String confirmPassword = PassC.getText();

        if (username.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Aizpildiet visus laukus.", "Kļūda", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Paroles nesakrīt.", "Kļūda", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (db.changePassword(username, newPassword)) {
            JOptionPane.showMessageDialog(this, "Parole ir veiksmīgi atjaunināta.");
            PassM.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Kļūda, atjauninot paroli.", "Kļūda", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SaveCPActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PassM.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ParaditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaditActionPerformed
        if (Paradit.isSelected()) {
            PassMa.setEchoChar((char) 0);
            PassC.setEchoChar((char) 0);
        } else {
            PassMa.setEchoChar('•');
            PassC.setEchoChar('•');
        }

    }//GEN-LAST:event_ParaditActionPerformed

    private void ParaditPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaditPassActionPerformed
        if (ParaditPass.isSelected()) {
            Password.setEchoChar((char) 0);

        } else {
            Password.setEchoChar('•');

        }
    }//GEN-LAST:event_ParaditPassActionPerformed

    private void Iziet2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iziet2ActionPerformed
        AdminPan.dispose();
        setVisible(true);
    }//GEN-LAST:event_Iziet2ActionPerformed

    private void SaktTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaktTestActionPerformed
        Question db = new Question(VisiTesti);
        title = VisiTesti.getSelectedValue();
        if (title != null) {
            testData = db.getTestData(title);
            jLabel29.setText(title);
            Quest1.setText(testData[0][0]);
            JRB1.setText(testData[0][1]);
            JRB2.setText(testData[0][2]);
            JRB3.setText(testData[0][3]);
            Quest2.setText(testData[1][0]);
            JRB4.setText(testData[1][1]);
            JRB5.setText(testData[1][2]);
            JRB6.setText(testData[1][3]);
            Quest3.setText(testData[2][0]);
            JRB7.setText(testData[2][1]);
            JRB8.setText(testData[2][2]);
            JRB9.setText(testData[2][3]);
            Quest4.setText(testData[3][0]);
            JRB10.setText(testData[3][1]);
            JRB11.setText(testData[3][2]);
            JRB12.setText(testData[3][3]);
            Quest5.setText(testData[4][0]);
            JRB13.setText(testData[4][1]);
            JRB14.setText(testData[4][2]);
            JRB15.setText(testData[4][3]);

            JRB1.setActionCommand(JRB1.getText());
            JRB2.setActionCommand(JRB2.getText());
            JRB3.setActionCommand(JRB3.getText());
            JRB4.setActionCommand(JRB4.getText());
            JRB5.setActionCommand(JRB5.getText());
            JRB6.setActionCommand(JRB6.getText());
            JRB7.setActionCommand(JRB7.getText());
            JRB8.setActionCommand(JRB8.getText());
            JRB9.setActionCommand(JRB9.getText());
            JRB10.setActionCommand(JRB10.getText());
            JRB11.setActionCommand(JRB11.getText());
            JRB12.setActionCommand(JRB12.getText());
            JRB13.setActionCommand(JRB13.getText());
            JRB14.setActionCommand(JRB14.getText());
            JRB15.setActionCommand(JRB15.getText());

            Test.pack();
            Test.setLocationRelativeTo(null);
            Test.setVisible(true);
        } else {

            logerror.setVisible(true);
            logerror.pack();
            logerror.setLocationRelativeTo(null);
            errorL.setText("Please select a test.");
        }

    }//GEN-LAST:event_SaktTestActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        TestTools.dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Admin db = new Admin();
        Question test = new Question(VisiTesti);
        String title1 = Title.getText();
        String question1 = qu1.getText(), question2 = qu2.getText(), question3 = qu3.getText(), question4 = qu4.getText(), question5 = qu5.getText();
        String option1_1 = op1_1.getText(), option1_2 = op1_2.getText(), option1_3 = op1_3.getText(), option1_4 = op1_4.getText(), option1_5 = op1_5.getText();
        String option2_1 = op2_1.getText(), option2_2 = op2_2.getText(), option2_3 = op2_3.getText(), option2_4 = op2_4.getText(), option2_5 = op2_5.getText();
        String option3_1 = op3_1.getText(), option3_2 = op3_2.getText(), option3_3 = op3_3.getText(), option3_4 = op3_4.getText(), option3_5 = op3_5.getText();
        String answer1 = an1.getText(), answer2 = an2.getText(), answer3 = an3.getText(), answer4 = an4.getText(), answer5 = an5.getText();
        db.addQuestion(title1, question1, question2, question3, question4, question5, option1_1, option2_1, option3_1, option1_2, option2_2, option3_2, option1_3, option2_3, option3_3, option1_4, option2_4, option3_4, option1_5, option2_5, option3_5);
        db.addAnswer(answer1, answer2, answer3, answer4, answer5, title1);

        test.loadTitles();

        Title.setText("");
        op1_1.setText("Option1");
        op1_2.setText("Option1");
        op1_3.setText("Option1");
        op1_4.setText("Option1");
        op1_5.setText("Option1");
        op2_1.setText("Option2");
        op2_2.setText("Option2");
        op2_3.setText("Option2");
        op2_4.setText("Option2");
        op2_5.setText("Option2");
        qu1.setText("Question1");
        qu2.setText("Question2");
        qu3.setText("Question3");
        qu4.setText("Question4");
        qu5.setText("Question5");
        op3_1.setText("Option3");
        op3_2.setText("Option3");
        op3_3.setText("Option3");
        op3_4.setText("Option3");
        op3_5.setText("Option3");

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int selectedRow = jTable3.getSelectedRow();
        if (selectedRow >= 0) {
            String title = String.valueOf(jTable3.getValueAt(selectedRow, 1));

            int response = JOptionPane.showConfirmDialog(null, "Vai tiešām vēlaties dzēst Testu " + title + "?", "Dzēšanas apstiprināšana", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                Question db = new Question(VisiTesti);
                db.removeTest(jTable3);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lūdzu, atlasiet dzēšamo Testu.");
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void SearchTestKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTestKeyReleased
        Question db = new Question(VisiTesti);
        String searchTest = SearchTest.getText();
        db.searchTest(searchTest, jTable3);
    }//GEN-LAST:event_SearchTestKeyReleased

    private void Iziet5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iziet5ActionPerformed
        Question db = new Question(VisiTesti);
        db.loadTitles();
        DeleteTest.dispose();
    }//GEN-LAST:event_Iziet5ActionPerformed

    private void DeleteTestiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteTestiMouseClicked
        this.setVisible(false);
        DeleteTest.pack();
        DeleteTest.setLocationRelativeTo(null);
        DeleteTest.setVisible(true);
        Question db = new Question(VisiTesti);
        db.viewTest(jTable3);
    }//GEN-LAST:event_DeleteTestiMouseClicked

    private void PabeigtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PabeigtActionPerformed
        Tester db = new Tester();
        Test.setVisible(false);
        Rezult.pack();
        Rezult.setLocationRelativeTo(null);
        Rezult.setVisible(true);

        double punkti = (punkt * 2);

        Punkt.setText("Punkti:" + punkti + "/10.0");

        double procenti = (punkti / 10) * 100;
        Proc.setText("Procenti:" + procenti + "%/100.0%");

        int ball = 0;
        switch (punkt * 2) {
            case 2:
                ball = 1;
                Atz.setText("Mark:" + ball + "/5");
                Proc.setForeground(Color.RED);
                Atz.setForeground(Color.RED);
                Punkt.setForeground(Color.RED);
                break;
            case 4:
                ball = 2;
                Atz.setText("Mark:" + ball + "/5");
                Proc.setForeground(Color.RED);
                Atz.setForeground(Color.RED);
                Punkt.setForeground(Color.RED);
                break;
            case 6:
                ball = 3;
                Atz.setText("Mark:" + ball + "/5");
                Proc.setForeground(Color.YELLOW);
                Atz.setForeground(Color.YELLOW);
                Punkt.setForeground(Color.YELLOW);
                break;
            case 8:
                ball = 4;
                Atz.setText("Mark:" + ball + "/5");
                Proc.setForeground(Color.GREEN);
                Atz.setForeground(Color.GREEN);
                Punkt.setForeground(Color.GREEN);
                break;
            case 10:
                ball = 5;
                Atz.setText("Mark:" + ball + "/5");
                Proc.setForeground(Color.GREEN);
                Atz.setForeground(Color.GREEN);
                Punkt.setForeground(Color.GREEN);
                break;
        }
        if (megsk == 1) {
            Megsk.setText("Mēģinajuma skaits: 1/1");
            Meiginat.setEnabled(false);
        } else {
            Megsk.setText("Mēģinajuma skaits: 0/1");
            Meiginat.setEnabled(true);
        }
         
      
        String test = VisiTesti.getSelectedValue();
        String username = Login.getText();
        Nosaukums.setText("Testa nosaukums:"+"\n"+test);
        UserR.setText("User name:"+"\n"+username);

        db.save(username, ball, procenti, punkti, test, megsk);


    }//GEN-LAST:event_PabeigtActionPerformed

    private void SearchRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchRKeyReleased
        Tester dats = new Tester();
        String searchTest = SearchR.getText();
        dats.searchRezult(searchTest, jTable4);
    }//GEN-LAST:event_SearchRKeyReleased

    private void Iziet6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iziet6ActionPerformed
        ViewRezult.dispose();
        AdminPan.setVisible(true);
    }//GEN-LAST:event_Iziet6ActionPerformed

    private void AllSudRezMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllSudRezMouseClicked

        ViewRezult.pack();
        ViewRezult.setLocationRelativeTo(null);
        ViewRezult.setVisible(true);
        Tester dats = new Tester();
        dats.getResults(jTable4);
    }//GEN-LAST:event_AllSudRezMouseClicked

    private void Sag_IzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sag_IzActionPerformed
        megsk = 0;
        
        ANS1.setText("");
        ANS2.setText("");
        ANS3.setText("");
        ANS4.setText("");
        ANS5.setText("");

        BG1.clearSelection();
        BG2.clearSelection();
        BG3.clearSelection();
        BG4.clearSelection();
        BG5.clearSelection();

        JRB1.setEnabled(true);
        JRB2.setEnabled(true);
        JRB3.setEnabled(true);
        JRB4.setEnabled(true);
        JRB5.setEnabled(true);
        JRB6.setEnabled(true);
        JRB7.setEnabled(true);
        JRB8.setEnabled(true);
        JRB9.setEnabled(true);
        JRB10.setEnabled(true);
        JRB11.setEnabled(true);
        JRB12.setEnabled(true);
        JRB13.setEnabled(true);
        JRB14.setEnabled(true);
        JRB15.setEnabled(true);
        
        
        
        Rezult.setVisible(false);
        Tester dats = new Tester();
        dats.getResults(jTable4);

    }//GEN-LAST:event_Sag_IzActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        logerror.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icone/HELP1.jpg"));
        image.setIcon(imageIcon);
        HELPS.setViewportView(image);
        Help.setVisible(true);
        Help.pack();
        Help.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icone/HELP2.jpg"));
        image.setIcon(imageIcon);
        HELPS.setViewportView(image);
        Help.setVisible(true);
        Help.pack();
        Help.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel28MouseClicked

    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed
        Help.dispose();
    }//GEN-LAST:event_OkActionPerformed

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        User db = new User();
        
        String login = Login.getText();
        String password = Password.getText();
        String grup = db.login(login, password);
        
        if("Skolotajs".equals(grup)){
        ImageIcon imageIcon1 = new ImageIcon(getClass().getResource("/icone/HELP8.jpg"));
        image.setIcon(imageIcon1);
        HELPS.setViewportView(image);
        Help.setVisible(true);
        Help.pack();
        Help.setLocationRelativeTo(null);    
        }else{
        
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icone/HELP3.jpg"));
        image.setIcon(imageIcon);
        HELPS.setViewportView(image);
        Help.setVisible(true);
        Help.pack();
        Help.setLocationRelativeTo(null);
        }
       
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icone/HELP4.jpg"));
        image.setIcon(imageIcon);
        HELPS.setViewportView(image);
        Help.setVisible(true);
        Help.pack();
        Help.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icone/HELP5.jpg"));
        image.setIcon(imageIcon);
        HELPS.setViewportView(image);
        Help.setVisible(true);
        Help.pack();
        Help.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icone/HELP6.jpg"));
        image.setIcon(imageIcon);
        HELPS.setViewportView(image);
        Help.setVisible(true);
        Help.pack();
        Help.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icone/HELP7.jpg"));
        image.setIcon(imageIcon);
        HELPS.setViewportView(image);
        Help.setVisible(true);
        Help.pack();
        Help.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icone/HELP9.jpg"));
        image.setIcon(imageIcon);
        HELPS.setViewportView(image);
        Help.setVisible(true);
        Help.pack();
        Help.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icone/HELP10.jpg"));
        image.setIcon(imageIcon);
        HELPS.setViewportView(image);
        Help.setVisible(true);
        Help.pack();
        Help.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icone/HELP11.jpg"));
        image.setIcon(imageIcon);
        HELPS.setViewportView(image);
        Help.setVisible(true);
        Help.pack();
        Help.setLocationRelativeTo(null);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ANS1;
    private javax.swing.JLabel ANS2;
    private javax.swing.JLabel ANS3;
    private javax.swing.JLabel ANS4;
    private javax.swing.JLabel ANS5;
    private javax.swing.JMenu AddNewTest;
    private javax.swing.JDialog AdminPan;
    private javax.swing.JMenu AllSudRez;
    private javax.swing.JLabel Atz;
    private javax.swing.ButtonGroup BG1;
    private javax.swing.ButtonGroup BG2;
    private javax.swing.ButtonGroup BG3;
    private javax.swing.ButtonGroup BG4;
    private javax.swing.ButtonGroup BG5;
    private javax.swing.JTextField Date;
    private javax.swing.JDialog DeleteTest;
    private javax.swing.JMenu DeleteTesti;
    private javax.swing.JMenu DeleteUs;
    private javax.swing.JDialog DeleteUser;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JComboBox<String> Grup;
    private javax.swing.JScrollPane HELPS;
    private javax.swing.JDialog Help;
    private javax.swing.JButton IelogotiesR;
    private javax.swing.JButton Ienakt;
    private javax.swing.JButton Iziet2;
    private javax.swing.JButton Iziet3;
    private javax.swing.JButton Iziet4;
    private javax.swing.JButton Iziet5;
    private javax.swing.JButton Iziet6;
    private javax.swing.JRadioButton JRB1;
    private javax.swing.JRadioButton JRB10;
    private javax.swing.JRadioButton JRB11;
    private javax.swing.JRadioButton JRB12;
    private javax.swing.JRadioButton JRB13;
    private javax.swing.JRadioButton JRB14;
    private javax.swing.JRadioButton JRB15;
    private javax.swing.JRadioButton JRB2;
    private javax.swing.JRadioButton JRB3;
    private javax.swing.JRadioButton JRB4;
    private javax.swing.JRadioButton JRB5;
    private javax.swing.JRadioButton JRB6;
    private javax.swing.JRadioButton JRB7;
    private javax.swing.JRadioButton JRB8;
    private javax.swing.JRadioButton JRB9;
    private javax.swing.JTextField Login;
    private javax.swing.JTextField LoginR;
    private javax.swing.JLabel Megsk;
    private javax.swing.JButton Meiginat;
    private javax.swing.JLabel Nosaukums;
    private javax.swing.JButton Ok;
    private javax.swing.JButton Pabeigt;
    private javax.swing.JCheckBox Paradit;
    private javax.swing.JCheckBox ParaditPass;
    private javax.swing.JPasswordField PassC;
    private javax.swing.JDialog PassM;
    private javax.swing.JPasswordField PassMa;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPasswordField PasswordR;
    private javax.swing.JLabel Proc;
    private javax.swing.JLabel Punkt;
    private javax.swing.JLabel Quest1;
    private javax.swing.JLabel Quest2;
    private javax.swing.JLabel Quest3;
    private javax.swing.JLabel Quest4;
    private javax.swing.JLabel Quest5;
    private javax.swing.JLabel Reg;
    private javax.swing.JDialog Registr;
    private javax.swing.JLabel RemPass;
    private javax.swing.JDialog Rezult;
    private javax.swing.JTextField Saerch;
    private javax.swing.JButton Sag_Iz;
    private javax.swing.JButton SaktTest;
    private javax.swing.JButton Save;
    private javax.swing.JButton SaveCP;
    private javax.swing.JTextField Search2;
    private javax.swing.JTextField SearchR;
    private javax.swing.JTextField SearchTest;
    private javax.swing.JDialog Test;
    private javax.swing.JDialog TestTools;
    private javax.swing.JTextField Title;
    private javax.swing.JTextField UserM;
    private javax.swing.JLabel UserR;
    private javax.swing.JDialog ViewRezult;
    private javax.swing.JMenu ViewUs;
    private javax.swing.JDialog ViewUser;
    private javax.swing.JList<String> VisiTesti;
    private javax.swing.JTextField an1;
    private javax.swing.JTextField an2;
    private javax.swing.JTextField an3;
    private javax.swing.JTextField an4;
    private javax.swing.JTextField an5;
    private javax.swing.JLabel errorL;
    private javax.swing.JLabel image;
    private javax.swing.JButton iziet;
    private javax.swing.JButton iziet1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JDialog logerror;
    private javax.swing.JTextField op1_1;
    private javax.swing.JTextField op1_2;
    private javax.swing.JTextField op1_3;
    private javax.swing.JTextField op1_4;
    private javax.swing.JTextField op1_5;
    private javax.swing.JTextField op2_1;
    private javax.swing.JTextField op2_2;
    private javax.swing.JTextField op2_3;
    private javax.swing.JTextField op2_4;
    private javax.swing.JTextField op2_5;
    private javax.swing.JTextField op3_1;
    private javax.swing.JTextField op3_2;
    private javax.swing.JTextField op3_3;
    private javax.swing.JTextField op3_4;
    private javax.swing.JTextField op3_5;
    private javax.swing.JTextField qu1;
    private javax.swing.JTextField qu2;
    private javax.swing.JTextField qu3;
    private javax.swing.JTextField qu4;
    private javax.swing.JTextField qu5;
    private javax.swing.ButtonGroup testSelector;
    // End of variables declaration//GEN-END:variables
}
