package Model;

public class BorrowBook {
    private Book book;
    private Member member;
    private String borrowDate;
    private String returnDate;
    private boolean is_return=false;

    public BorrowBook(Book book,Member member,String borrowDate,String returnDate) {
        this.book=book;
        this.member=member;
        this.borrowDate=borrowDate;
        this.returnDate=returnDate;
    }
    
    public BorrowBook(String borrowDate,String returnDate) {
        this.borrowDate=borrowDate;
        this.returnDate=returnDate;
    }

    public void setIs_return(boolean is_return) {
        this.is_return = is_return;
    }

    public boolean getIs_return() {
        return is_return;
    }
    
    
    public Book getBookData(){
        return book;
    }
    
    public Member getMemberData(){
        return member;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }
    
}
