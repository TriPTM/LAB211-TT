
package view;

public class MainMenu extends Menu {
    private static String[] mc={"Add a Contact","Display all Contact","Delete a Contact","Exit"};
    private ContactView cView= new ContactView();

    public MainMenu() {
        super("Contact program", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: cView.addContact();break;
            case 2: cView.displayContact();break;
            case 3: cView.deleteContact();break;
            case 4: System.exit(0);
        }
    }

}
