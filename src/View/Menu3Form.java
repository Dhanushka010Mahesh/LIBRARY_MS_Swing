package View;

import Controller.UserController;
import Model.Admin;
import Model.Member;
import View.Components.Background.scrollBarCustom.ScrollBarCustom;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Menu3Form extends javax.swing.JPanel {

    private UserController uc_form3 = new UserController();

    public Menu3Form() {
        initComponents();
        sPnlMemberBackground.setVerticalScrollBar(new ScrollBarCustom());
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
        panel1 = new java.awt.Panel();
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
        panel2 = new java.awt.Panel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtComformPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnClear = new View.Components.ButtonCustom.ButtonGradient();
        btnRecored = new View.Components.ButtonCustom.ButtonGradient();
        tPnlMupdate = new java.awt.Panel();
        btnMember = new javax.swing.JButton();
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

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(txtEmail))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(txtFullName))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(txtMemberCard))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(comAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMemberCard, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        tPnlMadd.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 600, 270));

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

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addComponent(txtComformPassword)
                    .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComformPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        tPnlMadd.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 600, 160));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        tPnlMadd.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 99, -1));

        btnRecored.setText("Recorded");
        btnRecored.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecoredActionPerformed(evt);
            }
        });
        tPnlMadd.add(btnRecored, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, -1, -1));

        tPnlMembers.addTab("Add", tPnlMadd);

        btnMember.setText("Member data get");
        btnMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tPnlMupdateLayout = new javax.swing.GroupLayout(tPnlMupdate);
        tPnlMupdate.setLayout(tPnlMupdateLayout);
        tPnlMupdateLayout.setHorizontalGroup(
            tPnlMupdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tPnlMupdateLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(btnMember)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        tPnlMupdateLayout.setVerticalGroup(
            tPnlMupdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tPnlMupdateLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(btnMember)
                .addContainerGap(348, Short.MAX_VALUE))
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
            .addGap(0, 546, Short.MAX_VALUE)
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

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        uc_form3.showAllMember();
    }//GEN-LAST:event_btnMemberActionPerformed

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
    private javax.swing.JButton btnMember;
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
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JScrollPane sPnlMemberBackground;
    private java.awt.Panel tPnlMadd;
    private java.awt.Panel tPnlMdelete;
    private View.Components.TabbedPaneCustom.TabbedPaneCustom tPnlMembers;
    private java.awt.Panel tPnlMupdate;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtComformPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtMemberCard;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
