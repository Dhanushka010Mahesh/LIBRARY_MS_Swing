package Controller;

import Model.Book;
import Model.BorrowBook;
import Model.DB_Config;
import Model.Member;
import View.Menu1Form;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BorreowController {

    private final DB_Config connection;
    private Set<BorrowBook> borrowSet;
   // Menu1Form m1=new Menu1Form();

    public BorreowController() {
        connection = new DB_Config();
        borrowSet = new HashSet<>();
        borrowSet = connection.getBorrowSet();
    }

    public int getBorrowCount() {
        return borrowSet.size();
    }
    
    public Set<BorrowBook> getSetArray(){
        
     return borrowSet;   
    }

    public boolean isBookBorrow(String bookId) {
        for (BorrowBook borrow : borrowSet) {
            if (borrow.getBookData().getId().equals(bookId)) {
                return true;
            }
        }
        return false;
    }
    public LocalDate getReturnBookDate(LocalDate currentDate) {
        LocalDate futureDate = currentDate.plusDays(14);
        return futureDate;
    }

    public void add(Book book,Member member) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate nowDate = LocalDate.now();
        LocalDate reDate=getReturnBookDate(nowDate);
        
        String currentDate = nowDate.format(formatter);
        String returnDate = reDate.format(formatter);
        
        connection.ConnOpen();
        try {
            
            // Insert into Users table
            String qry = "insert into book_borrow(BO_ID,USRM_Id,BRR_Date,BRR_return_date) values('"+book.getId()+"','"+member.getId()+"','"+currentDate+"','"+returnDate+"');";
            Statement sta = connection.getConnection().createStatement();
            sta.executeUpdate(qry);
            borrowSet.add(new BorrowBook(book, member,currentDate,returnDate));
            JOptionPane.showMessageDialog(null, "borrow book");
            //m1.getAndSetBrrowCount();
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

    public void showAllBorrowList(JTable tbl) {
        DefaultTableModel model=(DefaultTableModel)tbl.getModel();
        for (BorrowBook borrow : borrowSet) {
            //show all members data in table
            Vector oneRowArray=new Vector();
        
            oneRowArray.add(borrow.getMemberData().getMemberCard().getCardNumber());
            oneRowArray.add(borrow.getBookData().getTitle());
            oneRowArray.add(borrow.getMemberData().getName());
            oneRowArray.add(borrow.getReturnDate());
            oneRowArray.add(borrow.getIs_return());
            model.addRow(oneRowArray);
            
        }
            //show all members data in table
//            member.getId();
//            ;
//            member.getMemberCard().getRegisterDate();
//            member.getName();
//            member.getEmail();
//            member.getAddress();
//            JOptionPane.showMessageDialog(null, member.getName());
        
    }
}
