package View.Components.SideMenu;

import View.Components.WindowTitleBar.ThreeWinBtn;
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
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;

public class SideMenuPanel extends javax.swing.JPanel {

    private MigLayout layout; // need miglayout 4.0.jar libary.
    private JPanel panelMenu;
    private JButton btnLogout;
    private JButton btnMenuShow;
    private SideHeader header;
    private pnlSideBottom bottom;
    private EventMenuSelected event;
    
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
    
    public void setEvent(EventMenuSelected event){
        this.event=event;
    }
    
    private void init(){
        setLayout(new MigLayout("wrap, fillx, insets 0", "[fill]", "40[]0[]push[60]0")); //set position up side bar
        panelMenu = new JPanel();
        header=new SideHeader();
        bottom=new pnlSideBottom();
        createButtonMenu();
        createLogoutButton();
        panelMenu.setOpaque(false);
        layout = new MigLayout("fillx, wrap", "0[fill]0", "0[]3[]0");//set space in while menu panel
        panelMenu.setLayout(layout);
        add(btnMenuShow, "pos 1al 0al 100% 50");
        add(btnLogout, "pos 1al 1al, width 25%, height 60!");
        add(header);
        add(panelMenu);
        add(bottom);
    }
    
    public void addMenu(ModelMenu menu) {
        MenuItem item = new MenuItem(menu.getIcon(), menu.getMenuName(),panelMenu.getComponentCount());
        item.addEvent(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                clearMenu(index); 
            }
        });
        item.addEvent(event);
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
        btnMenuShow.setBorder(new EmptyBorder(5,12,5,12));
    }
    
    private void createLogoutButton(){
        btnLogout=new JButton();
        btnLogout.setContentAreaFilled(false);
        //btnLogout.setBackground(Color.WHITE);
        //btnLogout.setText("LogOut");
        btnLogout.setIcon(new ImageIcon(getClass().getResource("/View/Icons_Images/next.png")));
    }
   
    
    public void addEventLogout(ActionListener event){
        btnLogout.addActionListener(event);
    }
    
    public void addEventMenu(ActionListener event){
        btnMenuShow.addActionListener(event);
    }
    
    public void setAlpha(float alpha){
        header.setAlpha(alpha);
        bottom.setAlpha(alpha);
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
            .addGap(0, 562, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
