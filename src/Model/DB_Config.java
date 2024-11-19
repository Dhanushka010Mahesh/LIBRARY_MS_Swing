package Model;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;
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

    public Set<Book> getBookSet() {
        String bookQty = "select BO_ID,BO_Title,BO_Image,BO_Pub_Year,BO_Quanty,BO_Avalability,AU_Name,CAT_Name from author a,book b,book_catogory c where BO_Status='1' and BO_AuthorID=AU_ID and BO_Catogory=CAT_ID";
        Set<Book> bookSet = new HashSet<>();
        ConnOpen();
        try {
            Statement sta = conn.createStatement();
            ResultSet resultSet = sta.executeQuery(bookQty);

            // Process the result set
            while (resultSet.next()) {
                // Create a new Book object
                Book book = new Book();
                book.setId(resultSet.getString("BO_ID"));              // Assuming BO_ID is int
                book.setTitle(resultSet.getString("BO_Title"));
                book.setImage(resultSet.getString("BO_Image"));
                book.setPublishedYear(resultSet.getString("BO_Pub_Year"));
                book.setAvalability(resultSet.getBoolean("BO_Avalability"));
                book.setAuthor(resultSet.getString("AU_Name"));
                book.setCatogary(resultSet.getString("CAT_Name"));

                // Add book to the set
                bookSet.add(book);
            }
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

        return bookSet;
    }

    public Set<User> getMemberSet(String memberType) {
        String memberQty = "select USR_Id,USR_Name,USR_Email,USR_Address,USR_Type,USR_Username,USR_Password,USRM_Membership_Card from users u,members m where USR_Status='1' and USR_Id=USRM_Id and USR_Type='" + memberType + "'";
        Set<User> memberSet = new HashSet<>();

        ConnOpen();
        try {
            Statement sta = conn.createStatement();
            ResultSet resultSet = sta.executeQuery(memberQty);

            // Process the result set
            while (resultSet.next()) {
                // Create a new Book object
                Member member = new Member();

                member.setId(resultSet.getString("USR_Id"));
                member.setName(resultSet.getString("USR_Name"));
                member.setEmail(resultSet.getString("USR_Email"));
                member.setAddress(resultSet.getString("USR_Address"));
                member.setUserType(resultSet.getString("USR_Type"));
                member.setUserName(resultSet.getString("USR_Username"));
                member.setPassword(resultSet.getString("USR_Password"));
                member.setMemberCard(resultSet.getString("USRM_Membership_Card"));
                // Add book to the set
                memberSet.add(member);
            }
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
        return memberSet;

    }

}
