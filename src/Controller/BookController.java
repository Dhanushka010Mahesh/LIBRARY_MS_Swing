package Controller;

import Model.Author;
import Model.Book;
import Model.BookModel;
import Model.Book_Category;
import Model.DB_Config;
import View.Components.Background.Layout.GridLayoutCustom;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class BookController {

    private final DB_Config connection;
    private BookModel book1;
    private Set<Book> bookSet;

    public BookController() {
        connection = new DB_Config();
        bookSet = new HashSet<>();
        bookSet = connection.getBookSet();

    }
    
    public int getBookCount(){
        return bookSet.size();
    }

    public void showAllBook(GridLayoutCustom showBookPanel) {
        for (Book book : bookSet) {
            book1 = new BookModel(book);
            /* , book.getId(), book.getTitle(), book.getAvalability(),*/
            //book1.setLableValue();
            showBookPanel.add(book1);
        }
    }
    
//    public Book searchMember(String bookId){
//        
//        for(Book book : bookSet){
//            if(book.getId().equals(bookId)){
//                
//            }
//        }
//        
//    }

    public void fetchBookDetails(JTable tbl) {
        DefaultTableModel model=(DefaultTableModel)tbl.getModel();
               
        for (Book book : bookSet) {
            Vector oneRowArray=new Vector();
            oneRowArray.add(book.getId());
            oneRowArray.add(book.getTitle());
            oneRowArray.add(book.getAuthor());
            oneRowArray.add(book.getCatogary());
            model.addRow(oneRowArray);
        }

    }

    public void add(Book b1) {

        connection.ConnOpen();
        try {
            String sqlQryN = "insert into book(BO_Title,BO_Image,BO_Pub_Year,BO_Quanty,BO_Author_name,BO_Catogory_name) values('"+b1.getTitle()+"','"+b1.getImage()+"','"+b1.getPublishedYear()+"','"+b1.getQty()+"','"+b1.getAuthor()+"','"+b1.getCatogary()+"');";
            Statement sta = connection.getConnection().createStatement();
            sta.executeUpdate(sqlQryN);
            bookSet.add(b1);
            JOptionPane.showMessageDialog(null, "book added");
            //Cls Qry
        } catch (Exception ee) {
            System.out.println("Err add new employee : " + ee);
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

    public void add(Author a1,JComboBox com) {

        connection.ConnOpen();
        try {
            String sqlQryN = "insert into author(AU_Name,AU_Email) values ('" + a1.getName() + "','" + a1.getEmail() + "');";
            Statement sta = connection.getConnection().createStatement();
            sta.executeUpdate(sqlQryN);
            com.addItem(a1.getName());
            JOptionPane.showMessageDialog(null, "author added");
            //Cls Qry
        } catch (Exception ee) {
            System.out.println("Err add new employee : " + ee);
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

    public void add(Book_Category c1,JComboBox com) {

        connection.ConnOpen();
        try {
            String sqlQryN = "insert into book_catogory (CAT_Name,CAT_Description) values ('" + c1.getCategoryName() + "','" + c1.getDescription() + "');";
            Statement sta = connection.getConnection().createStatement();
            sta.executeUpdate(sqlQryN);
            com.addItem(c1.getCategoryName());
            JOptionPane.showMessageDialog(null, "category added");
            //Cls Qry
        } catch (Exception ee) {
            System.out.println("Err add new employee : " + ee);
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

    public void AuthorAndCategoryListShow(JComboBox comAuthor, JComboBox comCategory) {

        String sqlQry = "SELECT  AU_Name FROM author WHERE AU_Status = '1';";
        String sqlQry2 = "SELECT CAT_Name FROM book_catogory WHERE CAT_Status = '1';";
        connection.ConnOpen();
        ResultSet resultSet;
        try {
            Statement sta = connection.getConnection().createStatement();
            resultSet = sta.executeQuery(sqlQry);
            // Clear existing items in combo boxes
            comAuthor.removeAllItems();
            comCategory.removeAllItems();
            // Add items to the combo boxes
            while (resultSet.next()) {
                String authorName = resultSet.getString("AU_Name");
                comAuthor.addItem(authorName);
            }
            resultSet = sta.executeQuery(sqlQry2);
            // Clear existing items in combo boxes
            comCategory.removeAllItems();
            // Add items to the combo boxes
            while (resultSet.next()) {
                String categoryName = resultSet.getString("CAT_Name");
                comCategory.addItem(categoryName);
            }

        } catch (Exception e) {
            System.out.println("Error populating combo boxes: " + e.getMessage());
        }
    }
    
    public String selectAndCopyImage() {
        // Create a file chooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose an Image");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        // Filter to accept image files only
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                "Image Files", "jpg", "jpeg", "png", "gif"));

        // Show dialog and check if user clicked OK
        int userSelection = fileChooser.showOpenDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            // Get the image name with extension
            String imageName = selectedFile.getName();

            // Define the destination path (your package folder "View/Icons_Images")
            File destinationFolder = new File("src/View/Upload");
            if (!destinationFolder.exists()) {
                destinationFolder.mkdirs(); // Create folder if it doesn't exist
            }

            // Destination file path
            File destinationFile = new File(destinationFolder, imageName);

            try {
                // Copy file to the destination folder
                Files.copy(selectedFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                return imageName;// Return the image name with extension
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error copying the file: " + e.getMessage());
                e.printStackTrace();
            }
        }

        return "not valid"; // Return null if no file was selected
    }
    
}
