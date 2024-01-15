
package controller;

public class MainMenu extends Menu {
    private static String[] mc={"Create","Find and Sort","Update/Delete","Report","Exit"};

    public MainMenu() {
        super("WELCOME TO STUDENT MANAGEMENT", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: System.exit(0);
        }
    }

}
