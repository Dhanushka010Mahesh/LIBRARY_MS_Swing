package View.Components.SideMenu;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class SideHeader extends javax.swing.JPanel {

    public SideHeader() {
        initComponents();
        setOpaque(false);
    }

    public float alpha;
    
    public float getAlpha(){
        return alpha;
    }
    public void setAlpha(float alpha){
        this.alpha=alpha;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2=(Graphics2D) g;
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha));
        super.paint(g); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSideProfile = new javax.swing.JLabel();

        lblSideProfile.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        lblSideProfile.setForeground(new java.awt.Color(255, 255, 255));
        lblSideProfile.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSideProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons_Images/dashboard.png"))); // NOI18N
        lblSideProfile.setText("Dhanushka");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblSideProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSideProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblSideProfile;
    // End of variables declaration//GEN-END:variables
}
