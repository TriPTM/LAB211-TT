package view;

import java.util.ArrayList;
import java.util.Scanner;

public class HouseholdWasteView {

    private Scanner sc = new Scanner(System.in);

    public HouseholdWasteView() {
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayRedMessage(String message) {
        System.err.println(message);
        System.err.flush();
    }

    public String getString(String message) {
        System.out.print(message + ": ");
        return sc.nextLine();
    }

    public void printWorkLogs(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
