import java.io.*;
import java.util.*;

class BookItem {
    private String bookTitle;
    private String bookAuthor;
    private boolean isBorrowed;

    public BookItem(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.isBorrowed = false;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
}

class BookCollection {
    private List<BookItem> bookList;

    public BookCollection() {
        this.bookList = new ArrayList<>();
    }

    public void addNewBook(String bookTitle, String bookAuthor) {
        BookItem book = new BookItem(bookTitle, bookAuthor);
        bookList.add(book);
    }

    public void findBook(String keyword) {
        List<BookItem> searchResults = new ArrayList<>();

        for (BookItem book : bookList) {
            if (book.getBookTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                book.getBookAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                searchResults.add(book);
            }
        }

        if (searchResults.isEmpty()) {
            System.out.println("No books found matching the search keyword.");
        } else {
            System.out.println("Search results:");
            for (BookItem book : searchResults) {
                String status = book.getIsBorrowed() ? "(Checked Out)" : "(Available)";
                System.out.println(book.getBookTitle() + " by " + book.getBookAuthor() + " " + status);
            }
        }
    }

    public void borrowBook(String bookTitle) {
        for (BookItem book : bookList) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle)) {
                if (!book.getIsBorrowed()) {
                    book.setIsBorrowed(true);
                    System.out.println("Book '" + bookTitle + "' checked out successfully.");
                } else {
                    System.out.println("Book '" + bookTitle + "' is already checked out.");
                }
                return;
            }
        }
        System.out.println("Book '" + bookTitle + "' not found in the collection.");
    }

    public void returnBorrowedBook(String bookTitle) {
        for (BookItem book : bookList) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle)) {
                if (book.getIsBorrowed()) {
                    book.setIsBorrowed(false);
                    System.out.println("Book '" + bookTitle + "' returned successfully.");
                } else {
                    System.out.println("Book '" + bookTitle + "' is not checked out.");
                }
                return;
            }
        }
        System.out.println("Book '" + bookTitle + "' not found in the collection.");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        BookCollection library = new BookCollection();
        Scanner scanner = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("\n----- Library Management System -----");
            System.out.println("1. Add a new book");
            System.out.println("2. Search for books");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            userChoice = scanner.nextInt();
            scanner.nextLine(); 

            switch (userChoice) {
                case 1:
                    System.out.print("Enter the title of the book: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter the author of the book: ");
                    String bookAuthor = scanner.nextLine();
                    library.addNewBook(bookTitle, bookAuthor);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the search keyword: ");
                    String keyword = scanner.nextLine();
                    library.findBook(keyword);
                    break;
                case 3:
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 4:
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBorrowedBook(returnTitle);
                    break;
                case 0:
                    System.out.println("Exiting Library Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (userChoice != 0);

        scanner.close();
    }
}
