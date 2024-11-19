package Model;

import javax.swing.Icon;
import javax.swing.JOptionPane;

public class BookModel extends javax.swing.JPanel {

    private Icon icon;
    private String name;
    private String id;
    private boolean avalability;
   
    public BookModel(Icon icon ,String id,String name,boolean av) {
        initComponents();
        this.icon=icon;
        this.name=name;
        this.id=id;
        this.avalability=av;
    }

    public void setLableValue(){
        iPnlBookimg.setIcon(icon);
        lblid.setText(id);
        lblName.setText(name);
        lblAvalability.setText(String.valueOf(avalability));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iPnlBookimg = new View.Components.ImagePanel.ImageAvatar();
        lblid = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAvalability = new javax.swing.JLabel();
        buttonGradient1 = new View.Components.ButtonCustom.ButtonGradient();

        iPnlBookimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons_Images/BookSample.png"))); // NOI18N

        lblid.setFont(new java.awt.Font("Segoe UI Emoji", 2, 12)); // NOI18N
        lblid.setForeground(new java.awt.Color(255, 0, 0));
        lblid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblid.setText("Book id");

        lblName.setFont(new java.awt.Font("Segoe UI Emoji", 2, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 0, 0));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Title");

        lblAvalability.setFont(new java.awt.Font("Segoe UI Emoji", 2, 12)); // NOI18N
        lblAvalability.setForeground(new java.awt.Color(255, 0, 0));
        lblAvalability.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvalability.setText("Avalability");

        buttonGradient1.setForeground(new java.awt.Color(0, 0, 102));
        buttonGradient1.setText("Click");
        buttonGradient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(iPnlBookimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblAvalability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(buttonGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(iPnlBookimg, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblAvalability, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(buttonGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGradient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient1ActionPerformed

        JOptionPane.showMessageDialog(null, id+" "+ name+" "+ avalability);
    }//GEN-LAST:event_buttonGradient1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Components.ButtonCustom.ButtonGradient buttonGradient1;
    private View.Components.ImagePanel.ImageAvatar iPnlBookimg;
    private javax.swing.JLabel lblAvalability;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblid;
    // End of variables declaration//GEN-END:variables
}
