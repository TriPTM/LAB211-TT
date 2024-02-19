
package view;

public class MainMenu extends Menu {
    private static String[] mc={"Add Word","Delete Word","Translate","Exit"};
    private DictionaryView dView= new DictionaryView();

    public MainMenu() {
        super("Worker Management", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: dView.addWord();break;
            case 2: dView.deleteWord();break;
            case 3: dView.translate();break;
            case 4: System.exit(0);
        }
    }

}
