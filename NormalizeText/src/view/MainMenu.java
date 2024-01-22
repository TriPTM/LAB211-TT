
package view;

public class MainMenu extends Menu {
    private static String[] mc={"Read file","Save file","Normalize text","Exit"};
    private TextMenu menu = new TextMenu();

    public MainMenu() {
        super("Text Normalize", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: menu.readFile();break;
            case 2: menu.saveFile();break;
            case 3: menu.normalize();break;
            case 4: System.exit(0);
        }
    }

}
