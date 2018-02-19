package model;

import java.util.ArrayList;

public class Library {

    private static ArrayList<Book> library = new ArrayList<>();

    public static ArrayList<Book> getLibrary() {
        return library;
    }

    public static void setLibrary(ArrayList<Book> library) {
        Library.library = library;
    }
}
