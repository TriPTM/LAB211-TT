
package view;

import controller.*;

public class MainMenu extends Menu {
    private static String[] mc={"Create","Find and Sort","Update/Delete","Report","Exit"};
    public static StudentController sList= new StudentController();
    private StudentView sView=new StudentView();

    public MainMenu() {
        super("WELCOME TO STUDENT MANAGEMENT", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: sView.create();break;
            case 2: sView.findAndSort();break;
            case 3: sView.updateOrDelete();break;
            case 4: sList.report();break;
            case 5: System.exit(0);
        }
    }

}
