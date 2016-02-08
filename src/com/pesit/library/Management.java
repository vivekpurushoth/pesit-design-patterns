package com.pesit.library;

import java.util.ArrayList;
import java.util.List;
import com.pesit.library.*;

/**
 * Created by vp2 on 06/02/16.
 */
public class Management {

    private static List<Book> allTheBooks;

    public static void main(String args[]) {
        //addBooks();
        //displayBooks();

        allTheBooks = new ArrayList<Book>();
        Book myBook = new Book();
        myBook.setId(4);
        myBook.setTitle("Harry Potter");
        myBook.setAuthorName("Vivek");

        addBook(myBook);

        displayBooks();

        addBook(myBook);
    }

    public static void addBook(Book newBook) {
        if(!allTheBooks.contains(newBook))
        {
            allTheBooks.add(newBook);
        }
        else
        {
            System.out.println("Book ID ALREADY Exists");
        }

    }

    public void deleteBook() {

    }

    public void updateBook() {

    }

    public void assignBook() {

    }

    public void returnBook() {

    }

    public static void addBooks() {
        if(allTheBooks == null)
        {
            allTheBooks = new ArrayList<Book>();
            allTheBooks.add(new Book(1, "Data Structures" ,"Mark Weiss"));
            allTheBooks.add(new Book(2, "DBMS" ,"Padmashree"));
            allTheBooks.add(new Book(3, "Discrete Mathematics" ,"Grewal"));

        }
    }

    public static void displayBooks() {
        System.out.println("ID      NAME         AUTHOR");
        for(int i=0; i < allTheBooks.size(); i++) {
            System.out.println(allTheBooks.get(i).getId() +
                    "    " + allTheBooks.get(i).getTitle()+
                    "    " + allTheBooks.get(i).getAuthorName());
        }
    }


}
