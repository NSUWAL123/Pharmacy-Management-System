
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class PharmacyInfo extends javax.swing.JFrame {
    int data_import = 0;
    public PharmacyInfo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        available_rb = new javax.swing.JRadioButton();
        drugname_lbl = new javax.swing.JLabel();
        price_tf = new javax.swing.JTextField();
        id_tf = new javax.swing.JTextField();
        manufacturer_lbl = new javax.swing.JLabel();
        id_lbl = new javax.swing.JLabel();
        aviability_lbl = new javax.swing.JLabel();
        drugname_tf = new javax.swing.JTextField();
        manufacturer_cb = new javax.swing.JComboBox<>();
        medicinefor_lbl = new javax.swing.JLabel();
        type_lbl = new javax.swing.JLabel();
        notavailable_rb = new javax.swing.JRadioButton();
        price_lbl = new javax.swing.JLabel();
        insert_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        type_cb = new javax.swing.JComboBox<>();
        expiry_lbl = new javax.swing.JLabel();
        expiry_tf = new javax.swing.JTextField();
        medicinefor_cb = new javax.swing.JComboBox<>();
        searchPurpose_cb = new javax.swing.JComboBox<>();
        searchPurpose_btn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sortPrice_btn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        searchPrice_tf = new javax.swing.JTextField();
        searchPrice_btn = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        Open_Menu = new javax.swing.JMenuItem();
        Exit_Menu = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        manual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmacy Information System");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine ID", "Drug Name", "Manufacturer", "Type", "Medicine For", "Price", "Availability", "Expiry Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setShowGrid(false);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(239, 239, 239));

        buttonGroup1.add(available_rb);
        available_rb.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        available_rb.setSelected(true);
        available_rb.setText("Available");
        available_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                available_rbActionPerformed(evt);
            }
        });

        drugname_lbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        drugname_lbl.setForeground(new java.awt.Color(31, 165, 106));
        drugname_lbl.setText("Drug Name:");

        price_tf.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        price_tf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 180, 30), 2, true));
        price_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_tfActionPerformed(evt);
            }
        });
        price_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                price_tfKeyPressed(evt);
            }
        });

        id_tf.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        id_tf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 180, 30), 2, true));
        id_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tfActionPerformed(evt);
            }
        });

        manufacturer_lbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        manufacturer_lbl.setForeground(new java.awt.Color(31, 165, 106));
        manufacturer_lbl.setText("Manufacturer:");

        id_lbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        id_lbl.setForeground(new java.awt.Color(31, 165, 106));
        id_lbl.setText("Medicine ID:");

        aviability_lbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        aviability_lbl.setForeground(new java.awt.Color(31, 165, 106));
        aviability_lbl.setText("Availability:");

        drugname_tf.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        drugname_tf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 180, 30), 2, true));
        drugname_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugname_tfActionPerformed(evt);
            }
        });

        manufacturer_cb.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        manufacturer_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a category:", "Abott India Limited", "Magnus Pharma Pvt.Ltd", "Nepal Pharmaceuticals Laboratory Pvt. Ltd.", "Square Pharmaceuticals Limited", "Sun Pharma", "Time Pharmaceuticals Pvt. Ltd.", "Quest Pharmaceuticals Pvt.Ltd." }));
        manufacturer_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturer_cbActionPerformed(evt);
            }
        });

        medicinefor_lbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        medicinefor_lbl.setForeground(new java.awt.Color(31, 165, 106));
        medicinefor_lbl.setText("Medicine For:");

        type_lbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        type_lbl.setForeground(new java.awt.Color(31, 165, 106));
        type_lbl.setText("Type:");

        buttonGroup1.add(notavailable_rb);
        notavailable_rb.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        notavailable_rb.setText("Not Available");

        price_lbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        price_lbl.setForeground(new java.awt.Color(31, 165, 106));
        price_lbl.setText("Price:");

        insert_btn.setBackground(new java.awt.Color(31, 165, 106));
        insert_btn.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        insert_btn.setForeground(new java.awt.Color(255, 255, 255));
        insert_btn.setText("Insert");
        insert_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_btnActionPerformed(evt);
            }
        });

        clear_btn.setBackground(new java.awt.Color(220, 53, 69));
        clear_btn.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        clear_btn.setText("Clear");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        type_cb.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        type_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a category:", "Capsule", "Cream ", "Tablet", "Eye Drop", "Syringe", "Syrup" }));
        type_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_cbActionPerformed(evt);
            }
        });

        expiry_lbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        expiry_lbl.setForeground(new java.awt.Color(31, 165, 106));
        expiry_lbl.setText("Expiry Date:");

        expiry_tf.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        expiry_tf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 180, 30), 2, true));
        expiry_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiry_tfActionPerformed(evt);
            }
        });

        medicinefor_cb.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        medicinefor_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a category:", "Acidity", "Allergy", "Diabetes", "Diarrhoea", "Eye Infection", "Hypertension", "Hypothyroidism", " " }));
        medicinefor_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicinefor_cbActionPerformed(evt);
            }
        });

        searchPurpose_cb.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        searchPurpose_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a category:", "Acidity", "Allergy", "Diabetes", "Diarrhoea", "Eye Infection", "Hypertension", "Hypothyroidism" }));
        searchPurpose_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPurpose_cbActionPerformed(evt);
            }
        });

        searchPurpose_btn.setBackground(new java.awt.Color(31, 165, 106));
        searchPurpose_btn.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        searchPurpose_btn.setForeground(new java.awt.Color(255, 255, 255));
        searchPurpose_btn.setText("Medicines Available in the Category");
        searchPurpose_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPurpose_btnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(31, 165, 106));
        jLabel11.setText("Search Medicine based on Purpose:");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(31, 165, 106));
        jLabel10.setText("Sort based on price:");

        sortPrice_btn.setBackground(new java.awt.Color(31, 165, 106));
        sortPrice_btn.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        sortPrice_btn.setForeground(new java.awt.Color(255, 255, 255));
        sortPrice_btn.setText("Sort Medicine");
        sortPrice_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortPrice_btnActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(31, 165, 106));
        jLabel14.setText("Enter the Price to Search Medicine:");

        searchPrice_tf.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        searchPrice_tf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 180, 30), 2, true));
        searchPrice_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPrice_tfActionPerformed(evt);
            }
        });
        searchPrice_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchPrice_tfKeyPressed(evt);
            }
        });

        searchPrice_btn.setBackground(new java.awt.Color(31, 165, 106));
        searchPrice_btn.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        searchPrice_btn.setForeground(new java.awt.Color(255, 255, 255));
        searchPrice_btn.setText("Search Medicine");
        searchPrice_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPrice_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(aviability_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(available_rb)
                        .addGap(18, 18, 18)
                        .addComponent(notavailable_rb))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(id_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(drugname_lbl)
                                .addGap(18, 18, 18)
                                .addComponent(drugname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(manufacturer_lbl)
                                    .addGap(18, 18, 18)
                                    .addComponent(manufacturer_cb, 0, 1, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(medicinefor_lbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(medicinefor_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(type_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(type_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(price_lbl)
                            .addGap(18, 18, 18)
                            .addComponent(price_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(expiry_lbl)
                        .addGap(35, 35, 35)
                        .addComponent(expiry_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sortPrice_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(searchPrice_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchPrice_btn))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(searchPurpose_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(187, 187, 187)))
                        .addComponent(jSeparator4)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchPurpose_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {aviability_lbl, drugname_lbl, id_lbl, manufacturer_lbl, medicinefor_lbl, price_lbl, type_lbl});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drugname_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drugname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufacturer_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manufacturer_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicinefor_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicinefor_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aviability_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(available_rb)
                    .addComponent(notavailable_rb))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expiry_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expiry_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchPurpose_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchPurpose_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortPrice_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPrice_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPrice_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {aviability_lbl, drugname_lbl, manufacturer_lbl, medicinefor_lbl, price_lbl, type_lbl});

        file.setText("File");

        Open_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/openicon.png"))); // NOI18N
        Open_Menu.setText("  Open");
        Open_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open_MenuActionPerformed(evt);
            }
        });
        file.add(Open_Menu);

        Exit_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exiticon.png"))); // NOI18N
        Exit_Menu.setText("  Exit");
        Exit_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_MenuActionPerformed(evt);
            }
        });
        file.add(Exit_Menu);

        jMenuBar1.add(file);

        help.setText("Help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        manual.setText("Open Manual");
        manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualActionPerformed(evt);
            }
        });
        help.add(manual);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Exit_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_MenuActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Exit_MenuActionPerformed

    private void id_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tfActionPerformed

    private void drugname_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugname_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugname_tfActionPerformed

    private void price_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_tfActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_price_tfActionPerformed

    private void manufacturer_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturer_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturer_cbActionPerformed

    private void type_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_cbActionPerformed
    
    private void Open_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open_MenuActionPerformed
        if (data_import > 0) {
            JOptionPane.showMessageDialog(rootPane, "Data from the file is aldready Imported.");}
        else {
            String path = "src\\Medicine Record.txt";
            File file = new File(path);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            try
            {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                Object[] tableLines = reader.lines().toArray();
                for(int i = 0; i<tableLines.length; i++){
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    model.addRow(dataRow);

                }
                data_import++;
            } 
            catch(FileNotFoundException ex)
            {
                JOptionPane.showMessageDialog(rootPane, "Requested File is unavailable.");
            }
        } 
    }//GEN-LAST:event_Open_MenuActionPerformed

    private void expiry_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiry_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expiry_tfActionPerformed

    private void medicinefor_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicinefor_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicinefor_cbActionPerformed
   
    private void searchPurpose_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPurpose_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchPurpose_cbActionPerformed

    public void category(String val)
    {
        String medicine = "";
        int itemCounter = 0;            
        for (int i = 0; i < jTable1.getRowCount(); i++) 
        {
            String purpose = jTable1.getValueAt(i, 4).toString().toLowerCase();
            if (purpose.equals(val)) {
                itemCounter++;
                medicine = medicine + "\n" + itemCounter + ". " + jTable1.getValueAt(i,1).toString() ;
            }
        }          
        JOptionPane.showMessageDialog(rootPane, "There are " + itemCounter + " medicines in the category and they are: " + medicine); 
    }
    
    private void searchPurpose_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPurpose_btnActionPerformed
        if (searchPurpose_cb.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Please Select an Option.", "No Option Selected", JOptionPane.WARNING_MESSAGE);
        } 
        else if (searchPurpose_cb.getSelectedIndex() == 1) 
        {
            String val = "acidity";
            category(val);        
        } 
        else if (searchPurpose_cb.getSelectedIndex() == 2) 
        {
            String val = "allergy";
            category(val);
        } 
        else if (searchPurpose_cb.getSelectedIndex() == 3) 
        {
            String val = "diabetes";
            category(val);
        } 
        else if (searchPurpose_cb.getSelectedIndex() == 4) 
        {
            String val = "diarrhoea";
            category(val);
        } 
        else if (searchPurpose_cb.getSelectedIndex() == 5)
        {
            String val = "eye infection";
            category(val);
        } 
        else if (searchPurpose_cb.getSelectedIndex() == 6) 
        {
            String val = "hypertension";
            category(val);
        } 
        else  
        {
            String val = "hypothyroidism";
            category(val);
        }
    }//GEN-LAST:event_searchPurpose_btnActionPerformed

    private void searchPrice_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPrice_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchPrice_tfActionPerformed

    private void searchPrice_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPrice_btnActionPerformed
        //selection sort         
        if(searchPrice_tf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "The Search Text Field cannot be left Empty.", "Empty Text Field", JOptionPane.WARNING_MESSAGE);
        }else{
            try
            {
                int rowCount = jTable1.getRowCount();
                ArrayList<String> aid = new ArrayList();
                ArrayList<String> aname = new ArrayList();
                ArrayList<String> amanufacturer = new ArrayList();
                ArrayList<String> atype = new ArrayList();
                ArrayList<String> afor = new ArrayList();
                ArrayList<Integer> aprice = new ArrayList();
                ArrayList<String> aavailability = new ArrayList();
                ArrayList<String> aexpire = new ArrayList();

                for (int i = 0; i < rowCount; i++) 
                {
                    String mid = (String) jTable1.getValueAt(i, 0);
                    String mname = (String) jTable1.getValueAt(i, 1);
                    String mmanufacturer = (String) jTable1.getValueAt(i, 2);
                    String mtype = (String) jTable1.getValueAt(i, 3);
                    String mfor = (String) jTable1.getValueAt(i, 4);
                    String mprice = (String) jTable1.getValueAt(i, 5).toString();
                    String mavailability = (String) jTable1.getValueAt(i, 6);
                    String mexpire = (String) jTable1.getValueAt(i, 7);
                    if (mid != null && mname != null && mmanufacturer != null && mtype != null && mfor != null && mprice != null && mavailability != null && mexpire != null) {
                        aid.add(mid);
                        aname.add(mname);
                        amanufacturer.add(mmanufacturer);
                        atype.add(mtype);
                        afor.add(mfor);
                        aprice.add(Integer.parseInt(mprice));
                        aavailability.add(mavailability);
                        aexpire.add(mexpire);
                    }
                }

                for (int i = 0; i < aprice.size(); i++) 
                {
                    int min = i;
                    for (int j = i + 1; j < aprice.size(); j++) 
                    {
                        if (aprice.get(j) < aprice.get(min)) {
                            min = j;
                        }
                    }

                    String idTemp = aid.get(min);
                    aid.set(min, aid.get(i));
                    aid.set(i, idTemp);

                    String nameTemp = aname.get(min);
                    aname.set(min, aname.get(i));
                    aname.set(i, nameTemp);

                    String manufacturerTemp = amanufacturer.get(min);
                    amanufacturer.set(min, amanufacturer.get(i));
                    amanufacturer.set(i, manufacturerTemp);

                    String typeTemp = atype.get(min);
                    atype.set(min, atype.get(i));
                    atype.set(i, typeTemp);

                    String forTemp = afor.get(min);
                    afor.set(min, afor.get(i));
                    afor.set(i, forTemp);

                    int priceTemp = aprice.get(min);
                    aprice.set(min, aprice.get(i));
                    aprice.set(i, priceTemp);

                    String availabilityTemp = aavailability.get(min);
                    aavailability.set(min, aavailability.get(i));
                    aavailability.set(i, availabilityTemp);

                    String expireTemp = aexpire.get(min);
                    aexpire.set(min, aexpire.get(i));
                    aexpire.set(i, expireTemp);
                }

                //binary search
                int val = Integer.parseInt(searchPrice_tf.getText());
                int low = 0;
                int high = aprice.size();
                int output = binSearch(aprice, low, high, val);

                if (output == -1) {
                    JOptionPane.showMessageDialog(rootPane, "There are no medicine having price " + val + ".");
                } else {
                    String getId = aid.get(output);
                    String getName = aname.get(output);
                    String getManufacturer = amanufacturer.get(output);
                    String getType = atype.get(output);
                    String getFor = afor.get(output);
                    int getPrice = aprice.get(output);
                    String getAvailability = aavailability.get(output);
                    String getExpire = aexpire.get(output);
                    JOptionPane.showMessageDialog(rootPane, "The medicine information for medicine having price " + getPrice + " is: " + "\n" + "Medicine Id: " + getId + "\n" + "Name: " + getName + "\n" + "Manufacturer: " +  getManufacturer + "\n" + "Type: " + getType + "\n" + "Purpose: " + getFor + "\n" + "Price: " + getPrice + "\n" + "Availability: " + getAvailability + "\n" + "Expire: " + getExpire );
                }
            } catch(Exception ex)
            {
               JOptionPane.showMessageDialog(rootPane, "String values are not accepted.", "String Value Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_searchPrice_btnActionPerformed

    
    public int binSearch(ArrayList<Integer> a, int low, int high, int val) 
    {
        int mid = (low + high)/2;
        if (low > high) {
            return -1;
        }
        if (a.get(mid) == val) {
            return mid;
        } else if (val < a.get(mid)) {
            return binSearch(a, low, mid-1, val);
        } else {
            return binSearch (a, mid+1, high, val);
        }  
    }  
    
    public void swapRow(int i, int min)
    {
        String idTemp = (String) jTable1.getValueAt(i, 0);
        jTable1.setValueAt(jTable1.getValueAt(min, 0), i, 0);
        jTable1.setValueAt(idTemp, min, 0);
        
        String nameTemp = (String) jTable1.getValueAt(i, 1);
        jTable1.setValueAt(jTable1.getValueAt(min, 1), i, 1);
        jTable1.setValueAt(nameTemp, min, 1);
        
        String manufactureTemp = (String) jTable1.getValueAt(i, 2);
        jTable1.setValueAt(jTable1.getValueAt(min, 2), i, 2);
        jTable1.setValueAt(manufactureTemp, min, 2);
        
        String typeTemp = (String) jTable1.getValueAt(i, 3);
        jTable1.setValueAt(jTable1.getValueAt(min, 3), i, 3);
        jTable1.setValueAt(typeTemp, min, 3);
        
        String purposeTemp = (String) jTable1.getValueAt(i, 4);
        jTable1.setValueAt(jTable1.getValueAt(min, 4), i, 4);
        jTable1.setValueAt(purposeTemp, min, 4);
        
        String priceTemp = (String) jTable1.getValueAt(i, 5);
        jTable1.setValueAt(jTable1.getValueAt(min, 5), i, 5);
        jTable1.setValueAt(priceTemp, min, 5);
        
        String availabilityTemp = (String) jTable1.getValueAt(i, 6);
        jTable1.setValueAt(jTable1.getValueAt(min, 6), i, 6);
        jTable1.setValueAt(availabilityTemp, min, 6);
        
        String expiryTemp = (String) jTable1.getValueAt(i, 7);
        jTable1.setValueAt(jTable1.getValueAt(min, 7), i, 7);
        jTable1.setValueAt(expiryTemp, min, 7);
    }
    
    private void sortPrice_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortPrice_btnActionPerformed
        try
        {
            int rowCount = jTable1.getRowCount();
            ArrayList<String> aid = new ArrayList();
            ArrayList<String> aname = new ArrayList();
            ArrayList<String> amanufacturer = new ArrayList();
            ArrayList<String> atype = new ArrayList();
            ArrayList<String> afor = new ArrayList();
            ArrayList<Integer> aprice = new ArrayList();
            ArrayList<String> aavailability = new ArrayList();
            ArrayList<String> aexpire = new ArrayList();
        
            for (int i = 0; i < rowCount; i++) 
            {
                String mid = (String) jTable1.getValueAt(i, 0);
                String mname = (String) jTable1.getValueAt(i, 1);
                String mmanufacturer = (String) jTable1.getValueAt(i, 2);
                String mtype = (String) jTable1.getValueAt(i, 3);
                String mfor = (String) jTable1.getValueAt(i, 4);
                String mprice = (String) jTable1.getValueAt(i, 5).toString();
                String mavailability = (String) jTable1.getValueAt(i, 6);
                String mexpire = (String) jTable1.getValueAt(i, 7);
                if (mid != null && mname != null && mmanufacturer != null && mtype != null && mfor != null && mprice != null && mavailability != null && mexpire != null) {
                    aid.add(mid);
                    aname.add(mname);
                    amanufacturer.add(mmanufacturer);
                    atype.add(mtype);
                    afor.add(mfor);
                    aprice.add(Integer.parseInt(mprice));
                    aavailability.add(mavailability);
                    aexpire.add(mexpire);
                }
            }
        
            for (int i = 0; i < aprice.size(); i++) 
            {
                int min = i;
                for (int j = i + 1; j < aprice.size(); j++) 
                {
                    if (aprice.get(j) < aprice.get(min)) {
                        min = j;
                    }
                }
                
                String idTemp = aid.get(min);
                aid.set(min, aid.get(i));
                aid.set(i, idTemp);

                String nameTemp = aname.get(min);
                aname.set(min, aname.get(i));
                aname.set(i, nameTemp);

                String manufacturerTemp = amanufacturer.get(min);
                amanufacturer.set(min, amanufacturer.get(i));
                amanufacturer.set(i, manufacturerTemp);

                String typeTemp = atype.get(min);
                atype.set(min, atype.get(i));
                atype.set(i, typeTemp);

                String forTemp = afor.get(min);
                afor.set(min, afor.get(i));
                afor.set(i, forTemp);

                int priceTemp = aprice.get(min);
                aprice.set(min, aprice.get(i));
                aprice.set(i, priceTemp);

                String availabilityTemp = aavailability.get(min);
                aavailability.set(min, aavailability.get(i));
                aavailability.set(i, availabilityTemp);

                String expireTemp = aexpire.get(min);
                aexpire.set(min, aexpire.get(i));
                aexpire.set(i, expireTemp);
                
                swapRow(i, min);
            }
            
            
        } catch(Exception ex)
        { 
            JOptionPane.showMessageDialog(rootPane, "Not able to sort Table.");
        }
    }//GEN-LAST:event_sortPrice_btnActionPerformed

    private void clear()
    {
        id_tf.setText("");
        drugname_tf.setText("");
        price_tf.setText("");
        expiry_tf.setText("");
        searchPrice_tf.setText("");
        manufacturer_cb.setSelectedIndex(0);
        type_cb.setSelectedIndex(0);
        medicinefor_cb.setSelectedIndex(0);
        searchPurpose_cb.setSelectedIndex(0);
        searchPurpose_cb.setSelectedIndex(0);
        searchPrice_tf.setText("");    
    }
    
    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clear_btnActionPerformed

    
    private void insert_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_btnActionPerformed
        if (id_tf.getText().equals("")|| drugname_tf.getText().equals("")|| price_tf.getText().equals("") || expiry_tf.getText().equals("") ||  available_rb.getSelectedObjects().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "All the Fields are Mandatory to be Filled.", "Empty Text Fields", JOptionPane.WARNING_MESSAGE);
        } else if (manufacturer_cb.getSelectedIndex() == 0 || type_cb.getSelectedIndex() == 0 || medicinefor_cb.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Please Select an Option from the List.", "Combobox Data not Chosen", JOptionPane.WARNING_MESSAGE);
        } 
        else {
            ArrayList<String> aid = new ArrayList();
            for (int i = 0; i < jTable1.getRowCount(); i++) {
            String mid = (String) jTable1.getValueAt(i, 0);
            aid.add(mid);
            String id = id_tf.getText().toUpperCase();
            if (mid.contains(id.toUpperCase())) {
                JOptionPane.showMessageDialog(rootPane, "The Medicine with Id " + id + " is aldready present on the Record.", "Duplication Error", JOptionPane.ERROR_MESSAGE);
                return;
            } 
        }
            
            try
            {
                String id = id_tf.getText();
                String drugname = drugname_tf.getText();
                int price = Integer.parseInt(price_tf.getText());
                //String batchnumber = batchnumber_tf.getText();
                String expiry = expiry_tf.getText();
                String manufacturer = (String)manufacturer_cb.getSelectedItem();
                String type = (String)type_cb.getSelectedItem(); 
                String medicinefor = (String)medicinefor_cb.getSelectedItem(); 
                String availability = "";
    
                if (available_rb.isSelected()){
                    availability = "Available";
                } else if (notavailable_rb.isSelected()){
                    availability = "Not-Available";
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Please select any option.", "RadioButton not Chosen", JOptionPane.WARNING_MESSAGE);
                }
                
                int nextRow = 0;
                int rowCount = jTable1.getRowCount();
                boolean isEmpty = false;

                if(rowCount != 0){
                    do
                    {
                        String s = (String)jTable1.getValueAt(nextRow, 0);
                        if (s == null || s.length() == 0){
                            isEmpty = true;
                        } else {
                            nextRow++;
                        }
                    } while (nextRow < rowCount && !isEmpty);
                }

                
                Object[] info = {id, drugname, manufacturer, type, medicinefor, price, availability, expiry};
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.addRow(info);
                clear();
                
                String medInfo = "";
                String unique_id = (String)info[0];
                String[] detail_arr = {"Id", "Name", "Manufacturer", "Type", "Medicine For", "Price", "Availability", "Expiry Date"};
                for(int i = 1; i < info.length; i++)
                {
                    medInfo = medInfo + "\n" + detail_arr[i] +": "+ info[i];
                }
                JOptionPane.showMessageDialog(rootPane, "Successfully Inserted medicine with Id "+ unique_id + " with following details: "+ medInfo , "Data Inserted", JOptionPane.PLAIN_MESSAGE);                
            }
                
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(rootPane, "Please Enter Integer value for Price.", "Integer Value not Found", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_insert_btnActionPerformed

    private void available_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_available_rbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_available_rbActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpActionPerformed

    private void manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualActionPerformed
        // TODO add your handling code here:
        try
        {
            File manual = new File ("src\\Operational Manual.pdf");
            Desktop.getDesktop().open(manual);
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, "File not Found.", "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_manualActionPerformed

    private void price_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_price_tfKeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || c == evt.VK_BACK_SPACE || c == evt.VK_DELETE) {
            price_tf.setEditable(true);
        } else {
            price_tf.setEditable(false);
        }
    }//GEN-LAST:event_price_tfKeyPressed

    private void searchPrice_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchPrice_tfKeyPressed

    }//GEN-LAST:event_searchPrice_tfKeyPressed

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
            java.util.logging.Logger.getLogger(PharmacyInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PharmacyInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PharmacyInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PharmacyInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PharmacyInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit_Menu;
    private javax.swing.JMenuItem Open_Menu;
    private javax.swing.JRadioButton available_rb;
    private javax.swing.JLabel aviability_lbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear_btn;
    private javax.swing.JLabel drugname_lbl;
    private javax.swing.JTextField drugname_tf;
    private javax.swing.JLabel expiry_lbl;
    private javax.swing.JTextField expiry_tf;
    private javax.swing.JMenu file;
    private javax.swing.JMenu help;
    private javax.swing.JLabel id_lbl;
    private javax.swing.JTextField id_tf;
    private javax.swing.JButton insert_btn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem manual;
    private javax.swing.JComboBox<String> manufacturer_cb;
    private javax.swing.JLabel manufacturer_lbl;
    private javax.swing.JComboBox<String> medicinefor_cb;
    private javax.swing.JLabel medicinefor_lbl;
    private javax.swing.JRadioButton notavailable_rb;
    private javax.swing.JLabel price_lbl;
    private javax.swing.JTextField price_tf;
    private javax.swing.JButton searchPrice_btn;
    private javax.swing.JTextField searchPrice_tf;
    private javax.swing.JButton searchPurpose_btn;
    private javax.swing.JComboBox<String> searchPurpose_cb;
    private javax.swing.JButton sortPrice_btn;
    private javax.swing.JComboBox<String> type_cb;
    private javax.swing.JLabel type_lbl;
    // End of variables declaration//GEN-END:variables
}
