package com.codecool.bookshelf;

/**Az osztály neve legyen: PaperbackBook
 a constructor a következő sorrendben várja a paramtéreket:
 cím (title), szerző (author), kiadási év (releaseYear), oldalak száma (numberOfPages)
 1 oldal tömege: 10 gram
 A papírkötésű borító tömege: 20 gram
 A papírkötésű könyv tömegét az oldalak tömegének összege és a papírkötésű borító tömegének összege alapján kapjuk meg
 **/

public class PaperbackBook extends Book{

    private final static int PAPER_WEIGHT = 10;
    private final static int COVER_WEIGHT = 20;

    public PaperbackBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages,  numberOfPages * PAPER_WEIGHT + COVER_WEIGHT);
    }

}
