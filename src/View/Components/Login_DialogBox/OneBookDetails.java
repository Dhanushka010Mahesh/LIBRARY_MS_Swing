package View.Components.Login_DialogBox;

import Controller.UserController;
import Model.Book;
import Model.Member;
import View.Components.Background.scrollBarCustom.ScrollBarCustom;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class OneBookDetails extends javax.swing.JDialog {

    private Book book;
    private UserController mc = new UserController();
    private Member member;
    private boolean memberHave=false;

    public OneBookDetails(Book b) {
        initComponents();
        book = b;
        spnlBookData.setVerticalScrollBar(new ScrollBarCustom());
        spnlMemberData.setVerticalScrollBar(new ScrollBarCustom());
        iaPnlBookImg.setIcon(new ImageIcon(getClass().getResource("/View/Upload/" + book.getImage())));
        lblBookId.setText(book.getId());
        lblBookName.setText(book.getTitle());
        lblAuthor.setText(book.getAuthor());
        lblCategory.setText(book.getCatogary());
        lblBookAvalability.setText((book.getAvalability()) ? "Not Have" : "Have");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGroundPanel1 = new View.Components.Background.BackGroundPanel();
        spnlMemberData = new javax.swing.JScrollPane();
        panel2 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        txtMemberCardSearch = new javax.swing.JTextField();
        btnSearchMember = new View.Components.ButtonCustom.ButtonGradient();
        lblUserId = new javax.swing.JLabel();
        lblRegisterDate = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAUserName = new javax.swing.JTextField();
        txtAPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        customButton1 = new View.Components.ButtonCustom.CustomButton();
        btnClearUser = new View.Components.ButtonCustom.ButtonGradient();
        spnlBookData = new javax.swing.JScrollPane();
        panel3 = new java.awt.Panel();
        iaPnlBookImg = new View.Components.ImagePanel.ImageAvatar();
        lblBookName = new javax.swing.JLabel();
        lblBookId = new javax.swing.JLabel();
        lblBookAvalability = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setUndecorated(true);

        spnlMemberData.setBorder(null);
        spnlMemberData.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spnlMemberData.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter MemberShip Card Number");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtMemberCardSearch.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        txtMemberCardSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtMemberCardSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMemberCardSearch.setToolTipText("");
        txtMemberCardSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 4, 0, new java.awt.Color(0, 0, 0)));

        btnSearchMember.setText("Search");
        btnSearchMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMemberActionPerformed(evt);
            }
        });

        lblUserId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUserId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblRegisterDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblRegisterDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblFullName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFullName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel2.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book Place");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Admin UserName");
        jLabel3.setToolTipText("");

        txtAUserName.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        txtAUserName.setForeground(new java.awt.Color(0, 0, 204));

        txtAPassword.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        txtAPassword.setForeground(new java.awt.Color(0, 0, 204));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Admin Password");
        jLabel4.setToolTipText("");

        customButton1.setBackground(new java.awt.Color(0, 0, 0));
        customButton1.setForeground(new java.awt.Color(255, 255, 255));
        customButton1.setText("Add");
        customButton1.setBorderColor(new java.awt.Color(0, 204, 204));
        customButton1.setColorOver(new java.awt.Color(102, 102, 102));
        customButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButton1ActionPerformed(evt);
            }
        });

        btnClearUser.setText("Reset");
        btnClearUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMemberCardSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(btnClearUser, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearchMember, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblUserId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRegisterDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtAUserName))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtAPassword)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(customButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMemberCardSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRegisterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );

        spnlMemberData.setViewportView(panel2);

        spnlBookData.setBorder(null);
        spnlBookData.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spnlBookData.setOpaque(false);

        lblBookName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBookName.setForeground(new java.awt.Color(204, 0, 0));
        lblBookName.setText("Book Name");
        lblBookName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(0, 0, 0)));

        lblBookId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBookId.setForeground(new java.awt.Color(204, 0, 0));
        lblBookId.setText("Book ID");
        lblBookId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(0, 0, 0)));

        lblBookAvalability.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBookAvalability.setForeground(new java.awt.Color(204, 0, 0));
        lblBookAvalability.setText("Not Have");
        lblBookAvalability.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(0, 0, 0)));

        lblAuthor.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblAuthor.setForeground(new java.awt.Color(102, 102, 102));
        lblAuthor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAuthor.setText("Author");

        lblCategory.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(102, 102, 102));
        lblCategory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCategory.setText("Category");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iaPnlBookImg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBookName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBookId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBookAvalability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addGap(133, 133, 133))
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(lblBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBookAvalability, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iaPnlBookImg, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        spnlBookData.setViewportView(panel3);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons_Images/error.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backGroundPanel1Layout = new javax.swing.GroupLayout(backGroundPanel1);
        backGroundPanel1.setLayout(backGroundPanel1Layout);
        backGroundPanel1Layout.setHorizontalGroup(
            backGroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundPanel1Layout.createSequentialGroup()
                .addGroup(backGroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGroundPanel1Layout.createSequentialGroup()
                        .addComponent(spnlBookData, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnlMemberData, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        backGroundPanel1Layout.setVerticalGroup(
            backGroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(backGroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnlBookData, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(spnlMemberData, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backGroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void customButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButton1ActionPerformed
        if(memberHave){
            txtAUserName.getText();
        txtAPassword.getText();
        JOptionPane.showMessageDialog(null, book.getId()+" "+member.getId());
        }else{
            JOptionPane.showMessageDialog(null,"First Select Member");
        }
        
    }//GEN-LAST:event_customButton1ActionPerformed

    private void btnSearchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMemberActionPerformed
        member = mc.SearchMember(txtMemberCardSearch.getText().trim());
        if (member != null) {
            lblUserId.setText(member.getId());
            lblRegisterDate.setText(member.getMemberCard().getRegisterDate());
            lblFullName.setText(member.getName());
            memberHave=true;
        }else{
            JOptionPane.showMessageDialog(null, "Not Match Membership card number");
        }
        
    }//GEN-LAST:event_btnSearchMemberActionPerformed

    private void btnClearUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearUserActionPerformed
        lblUserId.setText("");
        lblFullName.setText("");
        lblRegisterDate.setText("");
        member=null;
        memberHave=false;
        txtMemberCardSearch.setText("");
    }//GEN-LAST:event_btnClearUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Components.Background.BackGroundPanel backGroundPanel1;
    private View.Components.ButtonCustom.ButtonGradient btnClearUser;
    private View.Components.ButtonCustom.ButtonGradient btnSearchMember;
    private View.Components.ButtonCustom.CustomButton customButton1;
    private View.Components.ImagePanel.ImageAvatar iaPnlBookImg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblBookAvalability;
    private javax.swing.JLabel lblBookId;
    private javax.swing.JLabel lblBookName;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblRegisterDate;
    private javax.swing.JLabel lblUserId;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private javax.swing.JScrollPane spnlBookData;
    private javax.swing.JScrollPane spnlMemberData;
    private javax.swing.JTextField txtAPassword;
    private javax.swing.JTextField txtAUserName;
    private javax.swing.JTextField txtMemberCardSearch;
    // End of variables declaration//GEN-END:variables
}
