package Controller;

import Model.Book;
import Model.BookModel;
import Model.DB_Config;
import View.Components.Background.Layout.GridLayoutCustom;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class BookController {

    private DB_Config connection;
    private BookModel book1;
    private Set<Book> bookSet;

    public BookController() {
        connection = new DB_Config();
        bookSet = new HashSet<>();
        bookSet = connection.getBookSet();
    }

    public void showAllBook(GridLayoutCustom showBookPanel) {
        for (Book book : bookSet) {
            book1 = new BookModel(new ImageIcon(getClass().getResource("/View/Upload/"+book.getImage())), book.getId(), book.getTitle(), book.getAvalability());
            book1.setLableValue();
            showBookPanel.add(book1);
        }
    }

    private void fetchBookDetails() {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Book ID");
        model.addColumn("Title");
        model.addColumn("Image");
        model.addColumn("Publication Year");
        model.addColumn("Quantity");
        model.addColumn("Availability");
        model.addColumn("Author Name");
        model.addColumn("Category Name");

    }
}
