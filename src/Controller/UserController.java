package Controller;

import Model.Admin;
import Model.DB_Config;
import Model.Member;
import java.awt.HeadlessException;
import java.util.HashSet;
import java.sql.*;
import java.util.Set;
import javax.swing.JOptionPane;

public class UserController {

    private final DB_Config connection;
    private Set<Member> memberSet;

    public UserController() {
        connection = new DB_Config();
        memberSet = new HashSet<>();
        memberSet = connection.getMemberSet();
    }

    public void add(Member member) {
        connection.ConnOpen();
        try {
            // Disable autocommit for transaction control
            connection.getConnection().setAutoCommit(false);

            // Insert into Users table
            String qry1 = "INSERT INTO Users (USR_Name, USR_Email, USR_Address) VALUES (?, ?, ?)";
            PreparedStatement pstmt1 = connection.getConnection().prepareStatement(qry1);
            pstmt1.setString(1, member.getName());
            pstmt1.setString(2, member.getEmail());
            pstmt1.setString(3, member.getAddress());
            pstmt1.executeUpdate(); // Execute the first insert

            // Insert into members table using the last inserted ID from Users table
            String qry2 = "INSERT INTO members (USRM_Id, USRM_Membership_Card) VALUES (@USR_Id, ?)";
            PreparedStatement pstmt2 = connection.getConnection().prepareStatement(qry2);
            pstmt2.setString(1, member.getMemberCard().getCardNumber());
            pstmt2.executeUpdate(); // Execute the second insert

            // Commit the transaction if both insertions are successful
            connection.getConnection().commit();

            memberSet.add(member);
            // Show success message
            JOptionPane.showMessageDialog(null, member.getName() + " User account added successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e);
            // Rollback the transaction if an error occurs
            try {
                connection.getConnection().rollback();
            } catch (Exception rollbackEx) {
                System.out.println("Rollback error: " + rollbackEx);
            }
        } finally {
            try {
                // Ensure the connection is closed after the operation
                if (connection.getConnection() != null && !connection.getConnection().isClosed()) {
                    connection.getConnection().close();
                    System.out.println("Connection closed.");
                }
            } catch (Exception e) {
                System.out.println("Error closing connection: " + e);
            }
        }
    }

    public void add(Admin admin) {
        connection.ConnOpen();
        try {
            // Disable autocommit for transaction control
            connection.getConnection().setAutoCommit(false);

            // Insert into Users table
            String qry1 = "INSERT INTO Users (USR_Name, USR_Email, USR_Address, USR_Type) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt1 = connection.getConnection().prepareStatement(qry1, Statement.RETURN_GENERATED_KEYS);
            pstmt1.setString(1, admin.getName());
            pstmt1.setString(2, admin.getEmail());
            pstmt1.setString(3, admin.getAddress());
            pstmt1.setString(4, admin.getUserType());
            pstmt1.executeUpdate(); // Execute the first insert

            // Retrieve the generated key (USR_Id) for the admin
            ResultSet generatedKeys = pstmt1.getGeneratedKeys();
            int userId = 0;
            if (generatedKeys.next()) {
                userId = generatedKeys.getInt(1);
            }

            // Insert into admins table using the last inserted ID from Users table
            String qry2 = "INSERT INTO admins (USRA_Id, USRA_Username, USRA_Password) VALUES (@USR_Id, ?, ?)";
            PreparedStatement pstmt2 = connection.getConnection().prepareStatement(qry2);
            pstmt2.setString(1, admin.getUserName());
            pstmt2.setString(2, admin.getPassword());
            pstmt2.executeUpdate(); // Execute the second insert

            // Commit the transaction if both insertions are successful
            connection.getConnection().commit();

            // Show success message
            JOptionPane.showMessageDialog(null, admin.getName() + " admin account added successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e);
            // Rollback the transaction if an error occurs
            try {
                connection.getConnection().rollback();
            } catch (Exception rollbackEx) {
                System.out.println("Rollback error: " + rollbackEx);
            }
        } finally {
            try {
                // Ensure the connection is closed after the operation
                if (connection.getConnection() != null && !connection.getConnection().isClosed()) {
                    connection.getConnection().close();
                    System.out.println("Connection closed.");
                }
            } catch (Exception e) {
                System.out.println("Error closing connection: " + e);
            }
        }
    }

    public void showAllMember() {
        for (Member member : memberSet) {
            //show all members data in table
            member.getId();
            member.getMemberCard().getCardNumber();
            member.getMemberCard().getRegisterDate();
            member.getName();
            member.getEmail();
            member.getAddress();
            JOptionPane.showMessageDialog(null, member.getName());
        }
    }

}
