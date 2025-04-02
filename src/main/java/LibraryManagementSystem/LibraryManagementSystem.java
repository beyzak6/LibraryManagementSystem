package LibraryManagementSystem;

import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        System.out.println("Welcome to the Library Management System! "); //Display a welcome message
        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();

        boolean running = true;
        while (running){
            // Display the menu options
            System.out.println("1. Add a new book");
            System.out.println("2. Display all books");
            System.out.println("3. Search for a book by title");
            System.out.println("4. Check out a book");
            System.out.println("5. Return a book");
            System.out.println("6. Exit");

            System.out.println("Please select an option");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                // Add a new book
                case 1:
                    System.out.println("Enter book title");
                    String Title = scanner.nextLine();
                    System.out.println("Enter author name");
                    String Author = scanner.nextLine();
                    System.out.println("Enter ISBN");
                    Integer ISBN = scanner.nextInt();
                    scanner.nextLine();

                    bookList.create(Title,Author,ISBN);
                    System.out.println("Book added successfully! \n -----------------------");
                    break;

                //Display all books
                case 2:
                    System.out.println("All Books : ");
                    bookList.list();
                    break;
                // Search for a book by title
                case 3:
                    System.out.println("Enter book title to search: ");
                    String bookTitle = scanner.nextLine();
                    Book foundBook = bookList.findBookTitle(bookTitle);
                    if(foundBook != null){
                        System.out.println("Found Book: \n " + foundBook);
                    }else{
                        System.out.println("No book found with the given title");
                    }
                    break;
                //Check out a book  using ISBN
                case 4:
                    System.out.println("Enter the ISBN of the book you want to check out : ");
                    int isbnNo = scanner.nextInt();
                    Book checkOutBook = bookList.checkOutBook(isbnNo);

                    if(checkOutBook != null){
                        System.out.println("Booked checked out successfully!");
                    }else{
                        System.out.println("Book not found or already checked out.");
                    }
                    break;
                //Return a book using ISBN
                case 5:
                    System.out.println("Enter the ISBN of the book you want to");
                    int isbnNo2 = scanner.nextInt();
                    Book returnBook = bookList.returnBook(isbnNo2);

                    if(returnBook != null){
                        System.out.println("Book returned successfully!");
                    }else{
                        System.out.println("Book not found or it was not checked out.");
                    }
                    break;
                //Exit the system
                case 6:
                    running = false;
                    System.out.println("Thank you for using the Library Management System!");
                    break;
                default:
                    System.out.println("You made the wrong choice!!!");

            }
        }
    }
}
