package controller;

import dao.LibraryDB;
import dao.LibraryDBImpl;
import model.Library;
import view.ApplicationView;
import dao.ConnectionManager;

public class ApplicationController {

    private final String HEADER;
    private final String[] OPTIONS;
    private ApplicationView view;
    private LibraryDB libraryDB;

    public ApplicationController() {
        this.HEADER = "Library Browser 1.0";
        this.OPTIONS = new String[]{"Add book to library", "Edit book",
                "Delete book from library", "Search for book", "Display all books", "Display book by author"};
        this.view = new ApplicationView();
        this.libraryDB = new LibraryDBImpl();
    }

    public void run() {
        String option = "1";

        while (!(option.equals("4"))) {
            Library.library = libraryDB.findAllBooks();
            view.displayMenu(HEADER, OPTIONS);
            option = InputController.getString("Choose option: ");

            switch (option) {
                case "0":
                    break;
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":

                    break;
                case "5":
                    break;
                case "6":
                    ConnectionManager.closeConnection(ConnectionManager.getNewConnection());
                    view.displayText("Good bye!");
            }
        }
    }
}