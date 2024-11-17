package View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu1Form extends javax.swing.JPanel {

    public Menu1Form() {
        initComponents();
        
    }

    public void initForm1(JFrame fram,JPanel panel){
        btnWin.initEvent(fram, panel);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGroundPanel1 = new View.Components.Background.BackGroundPanel();
        jButton1 = new javax.swing.JButton();
        btnWin = new View.Components.WindowTitleBar.ThreeWinBtn();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnWin.setOpaque(false);

        javax.swing.GroupLayout backGroundPanel1Layout = new javax.swing.GroupLayout(backGroundPanel1);
        backGroundPanel1.setLayout(backGroundPanel1Layout);
        backGroundPanel1Layout.setHorizontalGroup(
            backGroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundPanel1Layout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addGroup(backGroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(397, 397, 397))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backGroundPanel1Layout.createSequentialGroup()
                        .addComponent(btnWin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        backGroundPanel1Layout.setVerticalGroup(
            backGroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnWin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221)
                .addComponent(jButton1)
                .addContainerGap(305, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "hi");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Components.Background.BackGroundPanel backGroundPanel1;
    private View.Components.WindowTitleBar.ThreeWinBtn btnWin;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
