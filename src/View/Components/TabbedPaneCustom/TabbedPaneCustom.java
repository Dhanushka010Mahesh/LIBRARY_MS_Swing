package View.Components.TabbedPaneCustom;

import View.Components.ColorWeel.MyColorSet;
import java.awt.Color;
import javax.swing.JTabbedPane;

/**
 *
 * @author RAVEN
 */
public class TabbedPaneCustom extends JTabbedPane {

    public Color getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(Color selectedColor) {
        this.selectedColor = selectedColor;
        repaint();
    }

    public Color getUnselectedColor() {
        return unselectedColor;
    }

    public void setUnselectedColor(Color unselectedColor) {
        this.unselectedColor = unselectedColor;
        repaint();
    }

    private Color selectedColor = MyColorSet.shortMenuColor2;
    private Color unselectedColor = Color.GREEN;

    public TabbedPaneCustom() {
        setBackground(Color.PINK);
        setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        setUI(new TabbedPaneCustomUI(this));
    }
}
