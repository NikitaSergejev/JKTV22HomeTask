/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks.arraybooks;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author pupil
 */
public class Book {
    private Author[] authors = new Author[0];
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Arrays.deepHashCode(this.authors);
        hash = 59 * hash + Objects.hashCode(this.title);
        hash = 59 * hash + this.publishedYear;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.publishedYear != other.publishedYear) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Arrays.deepEquals(this.authors, other.authors)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Book{" 
                + "authors=" + Arrays.toString(authors)
                + ", title=" + title 
                + ", publishedYear=" + publishedYear 
                + "}\n";
    }
    public String toStringAuthors(Author[] authors){
        StringBuilder sbAuthors = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
          if(i != authors.length-1){
              sbAuthors.append(authors[i].getToString());
              sbAuthors.append(", ");
          }else{
              sbAuthors.append(authors[i].getToString());
              sbAuthors.append(". ");
          }          
        }       
        return sbAuthors.toString();
    }
    
}
