package View.Components.WindowTitleBar;

import View.Components.Background.BackGroundPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class ThreeWinBtn extends javax.swing.JPanel {

    public ThreeWinBtn() {
        initComponents();
    }

    public void initEvent(JFrame fram,BackGroundPanel panel){
        btnWinClose.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) { //when click button close execute 
                System.exit(0);
            }
            
        });
        btnWinMinimize.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fram.setState(JFrame.ICONIFIED);
            }
            
        });
        btnWinResize.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fram.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                    fram.setExtendedState(JFrame.NORMAL);
                } else {
                    fram.setExtendedState(JFrame.MAXIMIZED_BOTH);
                }
            }
            
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnWinClose = new View.Components.WindowTitleBar.WindowsButton();
        btnWinResize = new View.Components.WindowTitleBar.WindowsButton();
        btnWinMinimize = new View.Components.WindowTitleBar.WindowsButton();

        btnWinClose.setBackground(new java.awt.Color(202, 3, 3));
        btnWinClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWinCloseActionPerformed(evt);
            }
        });

        btnWinResize.setBackground(new java.awt.Color(255, 255, 0));

        btnWinMinimize.setBackground(new java.awt.Color(45, 255, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnWinMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnWinResize, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnWinClose, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWinMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWinResize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWinClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnWinCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWinCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWinCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Components.WindowTitleBar.WindowsButton btnWinClose;
    private View.Components.WindowTitleBar.WindowsButton btnWinMinimize;
    private View.Components.WindowTitleBar.WindowsButton btnWinResize;
    // End of variables declaration//GEN-END:variables
}
