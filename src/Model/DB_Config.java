package Model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DB_Config {

    private String url = "jdbc:mysql://localhost:3306/lms_sliate";
    private String user = "root";
    private String pass = "";
    private Connection conn = null;

    public void ConnOpen() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_Config.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Config.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Add_Database(String qty) {
        String qty1 = "insert into book(BO_Title,BO_Image,BO_Pub_Year,BO_Quanty,BO_AuthorID,BO_Catogory) values('Game of the Thrones','View/Upload/img1.png','1989-12-26',1,'AU001','BC001');";

        ConnOpen();
        try {
            Statement sta = conn.createStatement();
            sta.executeUpdate(qty);
            JOptionPane.showMessageDialog(null, "Row Add Succssusfully");

        } catch (Exception e) {
            System.out.println("open conn err : " + e);
        } finally {
            try {
                conn.close();
                System.out.println("Connection closed.");
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}
