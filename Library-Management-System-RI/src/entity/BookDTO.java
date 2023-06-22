/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author Shubham
 */
public class BookDTO implements Serializable{
    String bookid;
    String title;
    String author;
    String publicationYear;
    String genre;
    Boolean available;

    public BookDTO(String bookid, String title, String author, String publicationYear, String genre, Boolean available) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.available = available;
    }

    public String getBookid() {
        return bookid;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public String getGenre() {
        return genre;
    }

    public Boolean getAvailable() {
        return available;
    }

  
}
