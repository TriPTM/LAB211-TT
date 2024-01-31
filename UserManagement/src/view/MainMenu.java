
package view;

public class MainMenu extends Menu {
    private static String[] mc={"Create a new account","Login system","Exit"};
    private UserView uView= new UserView();

    public MainMenu() {
        super("USER MANAGEMENT SYSTEM ", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: uView.addAccount();break;
            case 2: uView.login();break;
            case 3: System.exit(0);
        }
    }

}
