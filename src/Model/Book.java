package Model;

public class Book {
    private String id;
    private String title;
    private String image;
    private String publishedYear;
    private boolean avalability;
    private String author;
    private String catogary;

    public Book(String id, String title, String image, String publishedYear, boolean avalability, String author, String catogary) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.publishedYear = publishedYear;
        this.avalability = avalability;
        this.author = author;
        this.catogary = catogary;
    }
    public Book(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public boolean getAvalability() {
        return avalability;
    }

    public void setAvalability(boolean avalability) {
        this.avalability = avalability;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCatogary() {
        return catogary;
    }

    public void setCatogary(String catogary) {
        this.catogary = catogary;
    }
}