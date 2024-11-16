package View.Components.Background;

import View.Components.ColorWeel.MyColorSet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class BackGroundPanel extends JPanel {
    public int getRound(){
        return round;
    }
    public void setRound(int round){
        this.round=round;
        repaint();
    }
    public BackGroundPanel(){
        setOpaque(false); // background color clear
        setBackground(MyColorSet.backgroundBody);
        setForeground(MyColorSet.BackgroundHeader);
    }
    private int round=20; // set border-raduis

    @Override
    public void paint(Graphics g) {
        int headerColor=60;
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground()); //set color background when set background color
        g2.fillRoundRect(0, 0, getWidth(),getHeight(), round, round); //get size border raduis and position
        Area area=new Area(new RoundRectangle2D.Double(0,0 , getWidth(),headerColor,round,round));
        //create two color for body and header
        g2.setColor(getForeground()); //set header color
        g2.fill(area);
        g2.dispose();
        super.paint(g); 

    }
    
}
