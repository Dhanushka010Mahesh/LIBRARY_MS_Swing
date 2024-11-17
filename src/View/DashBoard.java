package View;

import View.Components.SideMenu.ModelMenu;
import View.Components.SideMenu.SideMenuPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class DashBoard extends javax.swing.JFrame {

    private SideMenuPanel menu=new SideMenuPanel();
    private JPanel main=new JPanel();
    private MigLayout layout;
    private Animator animator;
    private boolean menuShow;
    
    public DashBoard() {
        initComponents();
        //setBackground(Color.WHITE); //clean and build setBackground panel
        WindowsButtonsUp.initEvent(DashBoard.this, BackgroundMainBodyPnl);
        init();
    }
    
    private void init(){ //create short side bar
        layout = new MigLayout("fill", "0[]10[]0", "0[fill]0"); // layout size set this code
        //pnlSideBody.setLayout(layout);
        BackgroundMainBodyPnl.setLayout(layout); // this code set some layout
        main.setOpaque(false);
        main.setLayout(new BorderLayout());
        
        menu.addEventMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!animator.isRunning()) {
                    animator.start();
                }
            }
    });
        //add menuItems
        menu.addMenu(new ModelMenu("DashBoard",new ImageIcon(getClass().getResource("/View/Icons_Images/dashboard.png"))));
        menu.addMenu(new ModelMenu("Settings",new ImageIcon(getClass().getResource("/View/Icons_Images/settings.png"))));
        menu.addMenu(new ModelMenu("Products",new ImageIcon(getClass().getResource("/View/Icons_Images/check-out.png"))));
        
        BackgroundMainBodyPnl.add(menu,"w 50!");
        BackgroundMainBodyPnl.add(main,"w 100%");
        
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menuShow) {
                    width = 50 + (150 * (1f - fraction));
                } else {
                    width = 50 + (150 * fraction);
                }
                layout.setComponentConstraints(menu, "w " + width + "!");
                BackgroundMainBodyPnl.revalidate();
            }

            @Override
            public void end() {
                menuShow = !menuShow;
            }
                
    };
                animator = new Animator(400, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundMainBodyPnl = new View.Components.Background.BackGroundPanel();
        WindowsButtonsUp = new View.Components.WindowTitleBar.ThreeWinBtn();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        WindowsButtonsUp.setOpaque(false);

        javax.swing.GroupLayout BackgroundMainBodyPnlLayout = new javax.swing.GroupLayout(BackgroundMainBodyPnl);
        BackgroundMainBodyPnl.setLayout(BackgroundMainBodyPnlLayout);
        BackgroundMainBodyPnlLayout.setHorizontalGroup(
            BackgroundMainBodyPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundMainBodyPnlLayout.createSequentialGroup()
                .addContainerGap(776, Short.MAX_VALUE)
                .addComponent(WindowsButtonsUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BackgroundMainBodyPnlLayout.setVerticalGroup(
            BackgroundMainBodyPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundMainBodyPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WindowsButtonsUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(573, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundMainBodyPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundMainBodyPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.Components.Background.BackGroundPanel BackgroundMainBodyPnl;
    private View.Components.WindowTitleBar.ThreeWinBtn WindowsButtonsUp;
    // End of variables declaration//GEN-END:variables
}
