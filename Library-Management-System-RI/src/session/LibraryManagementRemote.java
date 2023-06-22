/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.BookDTO;
import entity.LibUserDTO;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Shubham
 */
@Remote
public interface LibraryManagementRemote {

    boolean hasLibUser(String userid);

    boolean addBook(BookDTO bookDTO);

    boolean updateBookDetails(BookDTO bookDTO);

    boolean deleteBook(String bookid);

    boolean issueBook(String bookid);

    boolean returnBook(String bookid);

    List<BookDTO> getAvailableBooks();

    List<BookDTO> getAllBooks();

    boolean addLibUser(LibUserDTO libUserDTO);

    boolean updateLibUserDetails(LibUserDTO libUserDTO);

    boolean updatePassword(String userid, String password);

    boolean deleteLibUser(String userid);

    LibUserDTO getLibUserDetails(String userid);

    boolean validateLibUserLogin(String userid, String pwd);

    boolean hasBook(String bookid);

    BookDTO getBookDetails(String bookid);
    
}
