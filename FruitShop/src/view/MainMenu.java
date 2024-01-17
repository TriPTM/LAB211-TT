
package view;

import controller.ShopController;

public class MainMenu extends Menu {
    private static String[] mc={"Create fruit","View orders","Shopping (for buyer)","Exit"};
    private CustomerView cView=new CustomerView();

    public MainMenu() {
        super("WELCOME TO STUDENT MANAGEMENT", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: cView.create();break;
            case 2: cView.viewOrder();break;
            case 3: cView.shopping();break;
            case 4: System.exit(0);
        }
    }

}
