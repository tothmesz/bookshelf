package com.codecool.bookshelf;

import com.codecool.bookshelf.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Az osztály neve legyen Bookshelf
 * Legyen egy addBook() függvénye, aminek segítségével a paraméterben megadott könyvet
 * el lehet tárolni a polcban.
 * Legyen egy getBooks() függvénye, aminek legyen egy year paramétere. Azon könyveket
 * adja vissza egy listában, amik a year évében lettek kiadva.
 * Legyen egy getLightestAuthor() függvénye, ami visszaadja annak a szerzőnek a nevét,
 * aki a legkönnyebb könyvet írta.
 * Legyen egy getAuthorOfMostWrittenPages() függvénye, ami visszaadja annak a szerzőnek
 * a nevét, aki a legtöbb oldalt írta.
 * Legyen egy printBooks() függvénye, ami kiírja az összes könyv adatát. Soronként kiírja a könyvek getBookInfo() visszatérési értékét
 */
public class Bookshelf {
    List<Book> bookShelf = new ArrayList<>();

    public void addBook(Book book){
        bookShelf.add(book);
    }

    public List<Book> getBooks(int year){
        List<Book> list = new ArrayList<>();
        for (Book b: bookShelf){
            if (b.getReleaseYear() == year){
                list.add(b);
            }
        }
        return list;
    }

    public String getLightestAuthor(){
        return bookShelf.stream().min(Comparator.comparing(Book::getWeightInGram)).get().getAuthor();
    }

    public void printBooks(){
        for (Book book : bookShelf){
            System.out.println(book.getBookInfo());
        }
    }

    public String getAuthorOfMostWrittenPages(){
        return bookShelf.stream().max(Comparator.comparing(Book::getNumberOfPages)).get().getAuthor();
    }
}
