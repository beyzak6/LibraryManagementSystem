package LibraryManagementSystem;

public class Book {

    // Attributes of a book
    private String Title;

    private  String author;

    private Integer ISBN;

    private String Status;

    // Constructor to initialize a book object
    public Book(String Title,String author, Integer ISBN){
        this.Title = Title;
        this.author = author;
        this.ISBN = ISBN;
        this.Status = "Available";
    }

    // Getter and setter methods for Title,Author,ISBN,Status
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    

    // Override toString method to display book details
    @Override
    public String toString() {
        return  "Title= " + Title + "\n" +
                "Author= " + author + "\n" +
                "ISBN= " + ISBN + "\n" +
                "status= " + Status + "\n" +
                "----------------------------";
    }
}
