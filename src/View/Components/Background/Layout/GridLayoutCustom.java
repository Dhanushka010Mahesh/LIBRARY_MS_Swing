package View.Components.Background.Layout;

import Controller.BookController;
import java.awt.GridLayout;
import javax.swing.JScrollPane;

public class GridLayoutCustom extends javax.swing.JPanel {

    private BookController bookList;
    
    public GridLayoutCustom() {
        // Initialize components and set up the panel
        bookList=new BookController();
        initComponents();
        //this.setLayout(new WrapLayout(WrapLayout.LEFT, 10, 10));
        this.setLayout(new GridLayout(0, 5, 10, 10));
        // Add buttons
        
        bookList.showAllBook(this);
        

        // Add the panel to a scroll pane
        JScrollPane scrollPane = new JScrollPane(this);
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
