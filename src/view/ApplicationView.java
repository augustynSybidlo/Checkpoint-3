package view;

import java.util.ArrayList;

public class ApplicationView<T> {

    public void displayText(String text) {
        System.out.println(text);
    }

    public void displayListOfObjects(ArrayList<T> listOfObjects) {
        int index = 0;
        for (T object : listOfObjects) {
            displayText(index + "-->" + object.toString());
            index++;
        }
    }

    public void displayMenu(String header, String[] options) {

        displayText(header);
        int index = 0;

        for (String option : options) {
            displayText(index + "-->" + option);
            index++;
        }
    }
}