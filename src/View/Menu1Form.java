package View;

import Controller.BookController;
import Controller.BorreowController;
import Controller.UserController;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu1Form extends javax.swing.JPanel {

    BorreowController bucc=new BorreowController();
    BookController bcc=new BookController();
    UserController ucc=new UserController();
    
    public Menu1Form() {
        initComponents();
        lblBorrowCount.setText(String.valueOf(bucc.getBorrowCount()));
        lblBookCount.setText(String.valueOf(bcc.getBookCount()));
        lblMemberCount.setText(String.valueOf(ucc.getMemberCount()));
        int availableCount = bcc.getBookCount() - bucc.getBorrowCount();
        lblAvalableCount.setText((availableCount < 1) ? "0" : String.valueOf(availableCount));

        
    }
    
   
    
    public void initForm1(JFrame fram,JPanel panel){
        btnWin.initEvent(fram, panel);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGroundPanel1 = new View.Components.Background.BackGroundPanel();
        btnWin = new View.Components.WindowTitleBar.ThreeWinBtn();
        panelGlowingGradient1 = new View.Components.JPanel.PanelGlowingGradient();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblBookCount = new javax.swing.JLabel();
        panelGlowingGradient2 = new View.Components.JPanel.PanelGlowingGradient();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMemberCount = new javax.swing.JLabel();
        panelGlowingGradient3 = new View.Components.JPanel.PanelGlowingGradient();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblBorrowCount = new javax.swing.JLabel();
        panelGlowingGradient4 = new View.Components.JPanel.PanelGlowingGradient();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblAvalableCount = new javax.swing.JLabel();

        btnWin.setOpaque(false);

        panelGlowingGradient1.setBackground(new java.awt.Color(255, 252, 220));
        panelGlowingGradient1.setForeground(new java.awt.Color(0, 153, 0));
        panelGlowingGradient1.setBackgroundLight(new java.awt.Color(217, 167, 199));
        panelGlowingGradient1.setBorderSize(4);
        panelGlowingGradient1.setGradientColor1(new java.awt.Color(236, 56, 188));
        panelGlowingGradient1.setGradientColor2(new java.awt.Color(115, 3, 192));
        panelGlowingGradient1.setRequestFocusEnabled(false);
        panelGlowingGradient1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 16, 83));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOOKS");
        panelGlowingGradient1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Count");
        panelGlowingGradient1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lblBookCount.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        lblBookCount.setForeground(new java.awt.Color(255, 0, 51));
        lblBookCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookCount.setText("0");
        panelGlowingGradient1.add(lblBookCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, -1));

        panelGlowingGradient2.setBackground(new java.awt.Color(255, 252, 220));
        panelGlowingGradient2.setForeground(new java.awt.Color(0, 153, 0));
        panelGlowingGradient2.setBackgroundLight(new java.awt.Color(217, 167, 199));
        panelGlowingGradient2.setBorderSize(4);
        panelGlowingGradient2.setGradientColor1(new java.awt.Color(236, 56, 188));
        panelGlowingGradient2.setGradientColor2(new java.awt.Color(115, 3, 192));
        panelGlowingGradient2.setRequestFocusEnabled(false);
        panelGlowingGradient2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 16, 83));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MEMBERS");
        panelGlowingGradient2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Count");
        panelGlowingGradient2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        lblMemberCount.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        lblMemberCount.setForeground(new java.awt.Color(255, 0, 51));
        lblMemberCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMemberCount.setText("0");
        panelGlowingGradient2.add(lblMemberCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 50, -1));

        panelGlowingGradient3.setBackground(new java.awt.Color(255, 252, 220));
        panelGlowingGradient3.setForeground(new java.awt.Color(0, 153, 0));
        panelGlowingGradient3.setBackgroundLight(new java.awt.Color(217, 167, 199));
        panelGlowingGradient3.setBorderSize(4);
        panelGlowingGradient3.setGradientColor1(new java.awt.Color(236, 56, 188));
        panelGlowingGradient3.setGradientColor2(new java.awt.Color(115, 3, 192));
        panelGlowingGradient3.setRequestFocusEnabled(false);
        panelGlowingGradient3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 16, 83));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BORROW BOOK");
        panelGlowingGradient3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Count");
        panelGlowingGradient3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lblBorrowCount.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        lblBorrowCount.setForeground(new java.awt.Color(255, 0, 51));
        lblBorrowCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorrowCount.setText("0");
        panelGlowingGradient3.add(lblBorrowCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 70, -1));

        panelGlowingGradient4.setBackground(new java.awt.Color(255, 252, 220));
        panelGlowingGradient4.setForeground(new java.awt.Color(0, 153, 0));
        panelGlowingGradient4.setBackgroundLight(new java.awt.Color(217, 167, 199));
        panelGlowingGradient4.setBorderSize(4);
        panelGlowingGradient4.setGradientColor1(new java.awt.Color(236, 56, 188));
        panelGlowingGradient4.setGradientColor2(new java.awt.Color(115, 3, 192));
        panelGlowingGradient4.setRequestFocusEnabled(false);
        panelGlowingGradient4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 16, 83));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("AVAILABLE BOOK");
        panelGlowingGradient4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Count");
        panelGlowingGradient4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        lblAvalableCount.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        lblAvalableCount.setForeground(new java.awt.Color(255, 0, 51));
        lblAvalableCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvalableCount.setText("0");
        panelGlowingGradient4.add(lblAvalableCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 80, -1));

        javax.swing.GroupLayout backGroundPanel1Layout = new javax.swing.GroupLayout(backGroundPanel1);
        backGroundPanel1.setLayout(backGroundPanel1Layout);
        backGroundPanel1Layout.setHorizontalGroup(
            backGroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundPanel1Layout.createSequentialGroup()
                .addContainerGap(788, Short.MAX_VALUE)
                .addComponent(btnWin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(backGroundPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(panelGlowingGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(panelGlowingGradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(panelGlowingGradient3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(panelGlowingGradient4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43))
        );
        backGroundPanel1Layout.setVerticalGroup(
            backGroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnWin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(backGroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGlowingGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(panelGlowingGradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGlowingGradient4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGlowingGradient3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(269, 269, 269))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGroundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGroundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Components.Background.BackGroundPanel backGroundPanel1;
    private View.Components.WindowTitleBar.ThreeWinBtn btnWin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAvalableCount;
    private javax.swing.JLabel lblBookCount;
    private javax.swing.JLabel lblBorrowCount;
    private javax.swing.JLabel lblMemberCount;
    private View.Components.JPanel.PanelGlowingGradient panelGlowingGradient1;
    private View.Components.JPanel.PanelGlowingGradient panelGlowingGradient2;
    private View.Components.JPanel.PanelGlowingGradient panelGlowingGradient3;
    private View.Components.JPanel.PanelGlowingGradient panelGlowingGradient4;
    // End of variables declaration//GEN-END:variables
}
