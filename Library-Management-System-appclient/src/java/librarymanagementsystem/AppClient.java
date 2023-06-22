/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

import entity.BookDTO;
import entity.LibUserDTO;
import java.util.List;
import session.LibraryManagementRemote;

/**
 *
 * @author Shubham
 */
public class AppClient {

    @javax.ejb.EJB
    private static LibraryManagementRemote libraryManagement;

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Add book test cases
        addBookTestCase1();
        addBookTestCase2();

        // Update book details test cases
        updateBookDetailsTestCase();

        // Delete book test cases
        deleteBookTestCase1();
        deleteBookTestCase2();

        // Issue book test case
        issueBookTestCase();

        // Return book test case
        returnBookTestCase();

        // Get available books test case
        getAvailableBooksTestCase();

        // Get all books test case
        getAllBooksTestCase();

        // Check if library user exists test case
        hasLibUserTestCase();

        // Add library user test cases
        addLibUserTestCase1();
        addLibUserTestCase2();

        // Update library user details test cases
        updateLibUserDetailsTestCase();

        // Update password test case
        updatePasswordTestCase();

        // Delete library user test cases
        deleteLibUserTestCase1();
        deleteLibUserTestCase2();
    }
    // Add Book Test Case 1: Add a book with all valid information.
    private static void addBookTestCase1() {
        System.out.println("Adding Book - Test Case 1");

        BookDTO bookDTO = new BookDTO("B009", "The Great Gatsby", "F. Scott Fitzgerald", "1925", "Fiction", true);

        boolean success = libraryManagement.addBook(bookDTO);

        if (success) {
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Failed to add the book.");
        }

        System.out.println();
    }

    // Add Book Test Case 2: Add a book with missing information.
    private static void addBookTestCase2() {
        System.out.println("Adding Book - Test Case 2");

        BookDTO bookDTO = new BookDTO("B010", "Pride and Prejudice", "Jane Austen", "1813", "Fiction",true);

        boolean success = libraryManagement.addBook(bookDTO);

        if (success) {
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Failed to add the book.");
        }

        System.out.println();
    }

    // Update book details test case
    private static void updateBookDetailsTestCase() {
        System.out.println("Updating Book Details");

        BookDTO bookDTO = new BookDTO("B009", "The Great Gatsby", "F. Scott Fitzgerald", "1925", "Fiction", false);

        boolean success = libraryManagement.updateBookDetails(bookDTO);

        if (success) {
            System.out.println("Book details updated successfully.");
        } else {
            System.out.println("Failed to update the book details.");
        }

        System.out.println();
    }

    // Delete book test case 1: Delete an existing book
    private static void deleteBookTestCase1() {
        System.out.println("Deleting Book - Test Case 1");

        String bookID = "B009";

        boolean success = libraryManagement.deleteBook(bookID);

        if (success) {
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Failed to delete the book.");
        }

        System.out.println();
    }

    // Delete book test case 2: Delete a non-existing book
    private static void deleteBookTestCase2() {
        System.out.println("Deleting Book - Test Case 2");

        String bookID = "B011";

        boolean success = libraryManagement.deleteBook(bookID);

        if (success) {
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Failed to delete the book.");
        }

        System.out.println();
    }

    // Issue book test case
    private static void issueBookTestCase() {
        System.out.println("Issuing Book");

        String bookID = "B001";

        boolean success = libraryManagement.issueBook(bookID);

        if (success) {
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Failed to issue the book.");
        }

        System.out.println();
    }

    // Return book test case
    private static void returnBookTestCase() {
        System.out.println("Returning Book");

        String bookID = "B002";

        boolean success = libraryManagement.returnBook(bookID);

        if (success) {
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Failed to return the book.");
        }

        System.out.println();
    }

    // Get available books test case
    private static void getAvailableBooksTestCase() {
        System.out.println("Getting Available Books");

        System.out.println("Available Books:");

        for (BookDTO bookDTO : libraryManagement.getAvailableBooks()) {
            System.out.println(bookDTO.getTitle());
        }

        System.out.println();
    }

    // Get all books test case
    private static void getAllBooksTestCase() {
        System.out.println("Getting All Books");

        System.out.println("All Books:");

        for (BookDTO bookDTO : libraryManagement.getAllBooks()) {
            System.out.println(bookDTO.getTitle());
        }

        System.out.println();
    }

    // Check if library user exists test case
    private static void hasLibUserTestCase() {
        System.out.println("Checking if Library User Exists");

        String userID = "000001";

        boolean exists = libraryManagement.hasLibUser(userID);

        if (exists) {
            System.out.println("Library user exists.");
        } else {
            System.out.println("Library user does not exist.");
        }

        System.out.println();
    }

    // Add Library User Test Case 1: Add a library user with all valid information.
    private static void addLibUserTestCase1() {
        System.out.println("Adding Library User - Test Case 1");

        LibUserDTO libUserDTO = new LibUserDTO("000009", "John Doe", "pass123", "john.doe@example.com",
                "123 Main St", "Staff", true, "1234567890");

        boolean success = libraryManagement.addLibUser(libUserDTO);

        if (success) {
            System.out.println("Library User added successfully.");
        } else {
            System.out.println("Failed to add the library user.");
        }

        System.out.println();
    }

    // Add Library User Test Case 2: Add a library user with missing information.
    private static void addLibUserTestCase2() {
        System.out.println("Adding Library User - Test Case 2");

        LibUserDTO libUserDTO = new LibUserDTO("000010", "Jane Smith", "", "jane.smith@example.com",
                "456 Elm St", "Member", true, "9876543210");

        boolean success = libraryManagement.addLibUser(libUserDTO);

        if (success) {
            System.out.println("Library User added successfully.");
        } else {
            System.out.println("Failed to add the library user.");
        }

        System.out.println();
    }

    // Update library user details test case
    private static void updateLibUserDetailsTestCase() {
        System.out.println("Updating Library User Details");

        LibUserDTO libUserDTO = new LibUserDTO("000009", "John Doe", "pass456", "john.doe@example.com",
                "123 Main St", "Staff", true, "1234567890");

        boolean success = libraryManagement.updateLibUserDetails(libUserDTO);

        if (success) {
            System.out.println("Library user details updated successfully.");
        } else {
            System.out.println("Failed to update the library user details.");
        }

        System.out.println();
    }

    // Update password test case
    private static void updatePasswordTestCase() {
        System.out.println("Updating Password");

        String userID = "000009";
        String password = "newpass123";

        boolean success = libraryManagement.updatePassword(userID, password);

        if (success) {
            System.out.println("Password updated successfully.");
        } else {
            System.out.println("Failed to update the password.");
        }

        System.out.println();
    }

    // Delete library user test case 1: Delete an existing library user
    private static void deleteLibUserTestCase1() {
        System.out.println("Deleting Library User - Test Case 1");

        String userID = "000009";

        boolean success = libraryManagement.deleteLibUser(userID);

        if (success) {
            System.out.println("Library user deleted successfully.");
        } else {
            System.out.println("Failed to delete the library user.");
        }

        System.out.println();
    }

    // Delete library user test case 2: Delete a non-existing library user
    private static void deleteLibUserTestCase2() {
        System.out.println("Deleting Library User - Test Case 2");

        String userID = "000011";

        boolean success = libraryManagement.deleteLibUser(userID);

        if (success) {
            System.out.println("Library user deleted successfully.");
        } else {
            System.out.println("Failed to delete the library user.");
        }

        System.out.println();
    }
}
