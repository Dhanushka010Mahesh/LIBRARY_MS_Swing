package Model;

public class Book_Category {
    private String categoryID;
    private String categoryName;
    private String description;

    public Book_Category(String categoryID) {
        this.categoryID=categoryID;
    }

    public Book_Category(String name,String description) {
        this.categoryName=name;
        this.description=description;
    }
    

    public String getId() {
        return categoryID;
    }

    public void setId(String categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
