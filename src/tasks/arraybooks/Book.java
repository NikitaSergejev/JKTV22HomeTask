/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks.arraybooks;

import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class Book {
    private Author[] authors;
    private String title;
    private int publishedYear;

    public Book() {
    }
/*insert code -> constructor*/
    public Book(Author[] authors, String title, int publishedYear) {
        this.authors = authors;
        this.title = title;
        this.publishedYear = publishedYear;
    }
/*insert code -> get and setter and encapsulated. select all*/
    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
    public void addAuthor(Author author){
        this.authors = Arrays.copyOf(authors, authors.length+1);
        this.authors[authors.length-1]= author;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
}
