package View.Components.Background;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
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
    }
    private int round=20; // set border-raduis

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.WHITE);
        g2.fillRoundRect(0, 0, getWidth(),getHeight(), round, round);
        g2.dispose();
        super.paint(g); 

    }
    
}
