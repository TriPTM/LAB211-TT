
package test;

import view.MainMenu;

public class Main {

    public static void main(String[] args) {
        String[] choices = {"Experience", "Fresher", "Internship", "Search", "Exit"};
        new MainMenu("-----MENU-----", choices).run();
    }
    
}
