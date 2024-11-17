package View.Components.SideMenu;

import View.Components.ColorWeel.MyColorSet;
import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.SwingUtilities;

public class MenuItem extends javax.swing.JPanel {

    private final List<EventMenuSelected> events = new ArrayList<>();
    private int index;
    private boolean selected;
    private boolean mouseOver;
    public MenuItem(Icon icon,String name,int index) {
        initComponents();
        setOpaque(false);
        this.index=index;
        lblProfileIcon.setIcon(icon);
        lblUserName.setText(name);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseOver=true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseOver=false;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(SwingUtilities.isLeftMouseButton(e)){
                    if(mouseOver){
                        selected=true;
                        repaint();
                        runEvent();
                    }
                }
            }
            
        
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        if(selected){
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(MyColorSet.menuItemPnlBefo);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,0.5f));
            g2.fillRect(0,0, getWidth(),getHeight());
            g2.setComposite(AlphaComposite.SrcOver);
            g2.setColor(MyColorSet.menuItemPnlAfter);
            g2.fillRect(0, 0, 2, getHeight());
        }
        super.paintComponent(g); 
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProfileIcon = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();

        lblProfileIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblUserName.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUserName.setText("User name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblProfileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblUserName)
                .addGap(14, 14, 14))
            .addComponent(lblProfileIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void runEvent() {
        for (EventMenuSelected event : events) {
            event.selected(index);
        }
    }

   
    
    public void addEvent(EventMenuSelected event) {
        events.add(event);
    }
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblProfileIcon;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables
}
