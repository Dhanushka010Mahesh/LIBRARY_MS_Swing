package Model;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB_Config {

    private String url = "jdbc:mysql://localhost:3306/lms_sliate?allowMultiQueries=true";
    private String user = "root";
    private String pass = "";
    public Connection conn = null;

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
    
    public Connection getConnection(){
        return conn;
    }

    public Set<Book> getBookSet() {
        String bookQty = "select BO_ID,BO_Title,BO_Image,BO_Pub_Year,BO_Quanty,BO_Avalability,AU_Name,CAT_Name from author a,book b,book_catogory c where BO_Status='1' and b.BO_Catogory_name=c.CAT_Name and b.BO_Author_name=a.AU_Name";
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

    public Set<Member> getMemberSet() {
        String memberQty = "select USR_Id,USR_Name,USR_Email,USR_Address,USRM_Membership_Card,USRM_RegisterDate from users u,members m where USR_Status='1' and USR_Id=USRM_Id and USR_Type='member'";
        Set<Member> memberSet = new HashSet<>();

        ConnOpen();
        try {
            Statement sta = conn.createStatement();
            ResultSet resultSet = sta.executeQuery(memberQty);

            // Process the result set
            while (resultSet.next()) {
                // Create a new Book object
                Member member = new Member(resultSet.getString("USR_Id"),resultSet.getString("USRM_Membership_Card"));

                member.setName(resultSet.getString("USR_Name"));
                member.setEmail(resultSet.getString("USR_Email"));
                member.setAddress(resultSet.getString("USR_Address"));
                member.getMemberCard().setRegisterDate(resultSet.getString("USRM_RegisterDate"));
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
