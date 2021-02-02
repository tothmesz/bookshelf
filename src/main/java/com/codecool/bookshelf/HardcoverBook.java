package com.codecool.bookshelf;

/**Az osztály neve legyen: HardcoverBook
 a constructor a következő sorrendben várja a paramtéreket:
 cím (title), szerző (author), kiadási év (releaseYear), oldalak száma (numberOfPages)
 1 oldal tömege: 10 gram
 A keménykötésű borító tömege: 100 gram
 A keménykötésű könyv tömegét az oldalak tömegének összege és a keménykötésű borító tömegének összege alapján kapjuk meg
 **/


public class HardcoverBook extends Book {
    private final static int PAPER_WEIGHT = 10;
    private final static int COVER_WEIGHT = 100;

    public HardcoverBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages, numberOfPages * PAPER_WEIGHT + COVER_WEIGHT);
    }
}
