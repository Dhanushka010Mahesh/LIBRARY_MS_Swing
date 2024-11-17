package View.Components.SideMenu;

import View.Components.ColorWeel.MyColorSet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;

public class SideMenuPanel extends javax.swing.JPanel {

    private MigLayout layout; // need miglayout 4.0.jar libary.
    private JPanel panelMenu;
    private JButton btnLogout;
    private JButton btnMenuShow;
    
    /*
    BackgroundMainBodyPnl-body
    SideMenuPanel-menu
    MenuItem-MenuItem
    Dashboard - Main
    
    
    */
        
        
    public SideMenuPanel() {
        initComponents();
        setOpaque(false);
        init();
    }
    
    private void init(){
        setLayout(new MigLayout("wrap, fillx, insets 0", "[fill]", "70[]0")); //set position
        panelMenu = new JPanel();
        createButtonMenu();
        panelMenu.setOpaque(false);
        layout = new MigLayout("fillx, wrap", "0[fill]0", "0[]0");
        panelMenu.setLayout(layout);
        add(btnMenuShow, "pos 1al 0al 100% 50");
        add(panelMenu);
    }
    
    public void addMenu(ModelMenu menu) {
        MenuItem item = new MenuItem(menu.getIcon(), menu.getMenuName(),panelMenu.getComponentCount());
        item.addEvent(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                clearMenu(index); 
            }
        });
        panelMenu.add(item);
    }

     private void clearMenu(int exceptIndex){
        for(Component com : panelMenu.getComponents()){
            MenuItem item=(MenuItem) com;
            if(item.getIndex() != exceptIndex){
                item.setSelected(false);
            }
        }
    }
     
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2=(Graphics2D) g;
        GradientPaint gra=new GradientPaint(0, 0,MyColorSet.sideMenuUPColor, 0,getHeight(),MyColorSet.shortMenuColor2);
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(),getHeight());
        super.paintComponent(g);
    }

    private void createButtonMenu(){
        btnMenuShow=new JButton();
        btnMenuShow.setContentAreaFilled(false);
        btnMenuShow.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnMenuShow.setIcon(new ImageIcon(getClass().getResource("/View/Icons_Images/next.png")));
    }
    
    public void addEventMenu(ActionListener event){
        btnMenuShow.addActionListener(event);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
