package View;

import Controller.UserController;
import Model.Admin;
import Model.Member;
import View.Components.Background.scrollBarCustom.ScrollBarCustom;
import View.Components.Table.TableActionCellEditor;
import View.Components.Table.TableActionCellRender;
import View.Components.Table.TableActionEvent;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class Menu3Form extends javax.swing.JPanel {

    private UserController uc_form3 = new UserController();

    public Menu3Form() {
        initComponents();
            TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row : " + row);
            }

            @Override
            public void onDelete(int row) {
                if (tblMember.isEditing()) {
                    tblMember.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) tblMember.getModel();
                model.removeRow(row);
            }

            @Override
            public void onView(int row) {
                System.out.println("View row : " + row);
            }
        };
        sPnlMemberBackground.setVerticalScrollBar(new ScrollBarCustom());
        tblMember.getColumnModel().getColumn(4).setCellRenderer(new TableActionCellRender());
        tblMember.getColumnModel().getColumn(4).setCellEditor(new TableActionCellEditor(event));
        uc_form3.showAllMember(tblMember);
    }

    public void potoSet(String path, JLabel pic) {
        try {

            BufferedImage bi = ImageIO.read(new File(path));
            Image img = bi.getScaledInstance(725, 210, Image.SCALE_SMOOTH); //SET FILE AND SET SIZE[313, 276]

            ImageIcon icon = new ImageIcon(img);
            pic.setIcon(icon);

        } catch (Exception e) {
            System.out.println("err icons");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblMemberHed = new javax.swing.JLabel();
        sPnlMemberBackground = new javax.swing.JScrollPane();
        tPnlMembers = new View.Components.TabbedPaneCustom.TabbedPaneCustom();
        tPnlMadd = new java.awt.Panel();
        pnlPersanalDetails = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMemberCard = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comAccountType = new javax.swing.JComboBox<>();
        pnlLoginDetails = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtComformPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnClear = new View.Components.ButtonCustom.ButtonGradient();
        btnRecored = new View.Components.ButtonCustom.ButtonGradient();
        tPnlMupdate = new java.awt.Panel();
        spnlTableMemberBackground = new javax.swing.JScrollPane();
        tblMember = new javax.swing.JTable();
        tPnlMdelete = new java.awt.Panel();

        jButton1.setText("jButton1");

        lblMemberHed.setFont(new java.awt.Font("SimSun", 0, 48)); // NOI18N
        lblMemberHed.setForeground(new java.awt.Color(36, 36, 209));
        lblMemberHed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemberHed.setText("MemberShip");
        lblMemberHed.setToolTipText("");
        lblMemberHed.setOpaque(true);

        sPnlMemberBackground.setBorder(null);
        sPnlMemberBackground.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        sPnlMemberBackground.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tPnlMembers.setBackground(new java.awt.Color(204, 204, 255));
        tPnlMembers.setForeground(new java.awt.Color(255, 255, 255));
        tPnlMembers.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N

        tPnlMadd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Full Name");

        txtFullName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtFullName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFullName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(0, 0, 0)));
        txtFullName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtEmail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(0, 0, 0)));
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Email Address");

        txtAddress.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(0, 0, 0)));
        txtAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Address");

        txtMemberCard.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtMemberCard.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMemberCard.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(0, 0, 0)));
        txtMemberCard.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("MemberShip Card Number");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Account Type");

        comAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "member", "admin" }));
        comAccountType.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(0, 0, 0)));
        comAccountType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comAccountTypeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlPersanalDetailsLayout = new javax.swing.GroupLayout(pnlPersanalDetails);
        pnlPersanalDetails.setLayout(pnlPersanalDetailsLayout);
        pnlPersanalDetailsLayout.setHorizontalGroup(
            pnlPersanalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersanalDetailsLayout.createSequentialGroup()
                .addGroup(pnlPersanalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPersanalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPersanalDetailsLayout.createSequentialGroup()
                            .addGroup(pnlPersanalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                            .addGap(2, 2, 2)
                            .addGroup(pnlPersanalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail)
                                .addComponent(txtFullName)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPersanalDetailsLayout.createSequentialGroup()
                            .addGroup(pnlPersanalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                            .addGap(2, 2, 2)
                            .addGroup(pnlPersanalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMemberCard)
                                .addComponent(comAccountType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlPersanalDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );
        pnlPersanalDetailsLayout.setVerticalGroup(
            pnlPersanalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersanalDetailsLayout.createSequentialGroup()
                .addGroup(pnlPersanalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlPersanalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlPersanalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlPersanalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberCard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlPersanalDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        tPnlMadd.add(pnlPersanalDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 600, 270));

        pnlLoginDetails.setVisible(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Password");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("User Name");

        txtUserName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtUserName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(0, 0, 0)));
        txtUserName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(0, 0, 0)));
        txtPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtComformPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtComformPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtComformPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 4, 1, new java.awt.Color(0, 0, 0)));
        txtComformPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Comform Password");

        javax.swing.GroupLayout pnlLoginDetailsLayout = new javax.swing.GroupLayout(pnlLoginDetails);
        pnlLoginDetails.setLayout(pnlLoginDetailsLayout);
        pnlLoginDetailsLayout.setHorizontalGroup(
            pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginDetailsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlLoginDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(txtComformPassword)
                    .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12))
        );
        pnlLoginDetailsLayout.setVerticalGroup(
            pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginDetailsLayout.createSequentialGroup()
                .addGroup(pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlLoginDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComformPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tPnlMadd.add(pnlLoginDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 600, 160));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        tPnlMadd.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 99, -1));

        btnRecored.setText("Recorded");
        btnRecored.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecoredActionPerformed(evt);
            }
        });
        tPnlMadd.add(btnRecored, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        tPnlMembers.addTab("Add", tPnlMadd);

        tblMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Id", "Name", "MemberCard Number", "Register Date", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMember.setRowHeight(40);
        tblMember.setSelectionBackground(new java.awt.Color(0, 255, 204));
        spnlTableMemberBackground.setViewportView(tblMember);

        javax.swing.GroupLayout tPnlMupdateLayout = new javax.swing.GroupLayout(tPnlMupdate);
        tPnlMupdate.setLayout(tPnlMupdateLayout);
        tPnlMupdateLayout.setHorizontalGroup(
            tPnlMupdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tPnlMupdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnlTableMemberBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                .addContainerGap())
        );
        tPnlMupdateLayout.setVerticalGroup(
            tPnlMupdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spnlTableMemberBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );

        tPnlMembers.addTab("Update", tPnlMupdate);

        javax.swing.GroupLayout tPnlMdeleteLayout = new javax.swing.GroupLayout(tPnlMdelete);
        tPnlMdelete.setLayout(tPnlMdeleteLayout);
        tPnlMdeleteLayout.setHorizontalGroup(
            tPnlMdeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        tPnlMdeleteLayout.setVerticalGroup(
            tPnlMdeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );

        tPnlMembers.addTab("Delete", tPnlMdelete);

        sPnlMemberBackground.setViewportView(tPnlMembers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMemberHed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sPnlMemberBackground)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblMemberHed, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(sPnlMemberBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        MemberDataClear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRecoredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecoredActionPerformed
        // Check if the selected item is "admin" (assuming comAccountType is a JComboBox)
        if (comAccountType.getSelectedItem().equals("admin")) {
            // Create an Admin object
            Admin a1 = new Admin(
                    txtFullName.getText().trim(),
                    txtEmail.getText().trim(),
                    txtAddress.getText().trim(),
                    txtUserName.getText().trim(),
                    txtPassword.getText().trim()
            );
            // Add Admin object to uc_form3 (Assuming uc_form3 is a JPanel or similar container)
            uc_form3.add(a1);
        } else {
            // Create a Member object
            Member m1 = new Member(
                    txtFullName.getText().trim(),
                    txtEmail.getText().trim(),
                    txtAddress.getText().trim(),
                    txtMemberCard.getText().trim()
            );
            // Add Member object to uc_form3
            uc_form3.add(m1);
        }

        // Refresh the UI after adding the new component
        //uc_form3.revalidate();
        //uc_form3.repaint();

        MemberDataClear();
    }//GEN-LAST:event_btnRecoredActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void comAccountTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comAccountTypeItemStateChanged
       if(comAccountType.getSelectedItem().equals("admin")){
           pnlLoginDetails.setVisible(true);
       }else{
           pnlLoginDetails.setVisible(false);
       }
    }//GEN-LAST:event_comAccountTypeItemStateChanged

    private void MemberDataClear() {
        txtFullName.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        txtMemberCard.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
        txtComformPassword.setText("");
        comAccountType.setSelectedItem("member");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Components.ButtonCustom.ButtonGradient btnClear;
    private View.Components.ButtonCustom.ButtonGradient btnRecored;
    private javax.swing.JComboBox<String> comAccountType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblMemberHed;
    private java.awt.Panel pnlLoginDetails;
    private java.awt.Panel pnlPersanalDetails;
    private javax.swing.JScrollPane sPnlMemberBackground;
    private javax.swing.JScrollPane spnlTableMemberBackground;
    private java.awt.Panel tPnlMadd;
    private java.awt.Panel tPnlMdelete;
    private View.Components.TabbedPaneCustom.TabbedPaneCustom tPnlMembers;
    private java.awt.Panel tPnlMupdate;
    private javax.swing.JTable tblMember;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtComformPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtMemberCard;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
