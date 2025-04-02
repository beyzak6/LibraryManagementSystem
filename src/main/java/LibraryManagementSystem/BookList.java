package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class BookList {

    // List to store books
    private  List<Book> bookList = new ArrayList<>();

    // Method to create and add a new book to the list
    public void create(String Title, String Author, Integer ISBN) {

        Book book = new Book(Title,Author,ISBN);
        bookList.add(book);
    }

    // Method to list all books in the collection
    public  void list() {
        if(bookList.isEmpty()){
            System.out.println("No books available!");
        }else{
            for (Book book : bookList){
                System.out.println(book);
            }
        }

    }
    // Method to find a book by title
    public Book findBookTitle(String Title){

        for(Book book : bookList){
            if(book.getTitle().equalsIgnoreCase(Title)){
                return book;
            }
        }
        return null;
    }
    // Method to check out a book using its ISBN
    public Book checkOutBook(Integer ISBN){
        for(Book book : bookList){
            if(book.getISBN().equals(ISBN)){
                if(book.getStatus().equals("Available")){
                    book.setStatus("Checked out");
                    return book;
                }else{
                    return null;
                }
            }
        }
        return null;
    }
    // Method to return a book using its ISBN
    public Book returnBook(Integer ISBN){
        for (Book book : bookList){
            if(book.getISBN().equals(ISBN)){
                if(book.getStatus().equals("Checked Out")){
                    book.setStatus("Available");
                    return book;
                }else{
                    return null;
                }
            }

        }
        return null;
    }



}
