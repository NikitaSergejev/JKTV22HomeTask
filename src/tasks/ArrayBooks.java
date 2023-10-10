/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Arrays;
import java.util.Scanner;
import tasks.arraybooks.Author;
import tasks.arraybooks.Book;

/**
 *
 * @author pupil
 */
public class ArrayBooks {

   /* public ArrayBooks(Scanner scanner) {
    }

    public ArrayBooks() {
        
    }*/

    public void showBooks() {
       Book[] books = new Book[5]; 
       Book book = new Book();
       book.setTitle("Voina i mir");
       book.setPublishedYear(2020);
       book.addAuthor(new Author("Lev", "Tolstoy"));      
       books[0] = book;
       book = new Book();
       book.setTitle("Otsi i deti");
       book.setPublishedYear(2021);
       book.addAuthor(new Author("Ivan", "Turgenev"));
       books[1] = book;
       book = new Book();
       book.setTitle("Zolotoy teljonok");
       book.setPublishedYear(2019);
       book.addAuthor(new Author("Ilja", "Ilf, "));
       book.addAuthor(new Author("Jevgeny", "Petrov"));
       books[2] = book;
       book = new Book();
       book.setTitle("Learning Java EE 7");
       book.setPublishedYear(2015);
       book.addAuthor(new Author("Andre", "Gonsalves"));
       books[3] = book;
       book = new Book();
       book.setTitle("Master i Margarita");
       book.setPublishedYear(2021);
       book.addAuthor(new Author("Mihail", "Bulgakov"));
       books[4] = book;       
       System.out.println("Массив из 5 книг: \n");
       for (int i = 0; i< books.length; i++){
           if(books[i] !=null){
                System.out.print(books[i].getTitle());
                System.out.println();
                System.out.println("\t");
                System.out.print(books[i].getPublishedYear());
                System.out.println();
                System.out.println("\t");
                System.out.print(books[i].toStringAuthors(books[i].getAuthors()));
                System.out.println();
           }   
       }
       System.out.println("------------------------");
    }
    
}
