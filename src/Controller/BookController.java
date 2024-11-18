package Controller;

import Model.BookModel;
import View.Components.Background.Layout.GridLayoutCustom;
import javax.swing.ImageIcon;

public class BookController {
    
    private BookModel book1;

    public BookController() {
        
    }
    
    
    
    public void showAllBook(GridLayoutCustom showBookPanel){
        String imgBook="BookSample.png";
        for (int i = 1; i <= 80; i++) {
            book1=new BookModel(new ImageIcon(getClass().getResource("/View/Icons_Images/"+imgBook)),i,"Mora",true);
            book1.setLableValue();
            showBookPanel.add(book1);
        }
    }
}
