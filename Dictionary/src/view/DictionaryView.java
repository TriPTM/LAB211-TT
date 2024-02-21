
package view;

import Library.Validation;
import controller.DictionaryController;

public class DictionaryView extends Menu {
    private static String[] mc={"Add Word","Delete Word","Translate","Exit"};
    private DictionaryController controller;
    private Validation val= new Validation();

    public DictionaryView() {
        super("Dictionary Program", mc);
    }

    public DictionaryController getController() {
        return controller;
    }

    public void setController(DictionaryController controller) {
        this.controller = controller;
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: addWord();System.err.flush();break;
            case 2: deleteWord();System.err.flush();break;
            case 3: translate();System.err.flush();break;
            default: break;
        }
    }
    
    public void addWord(){
        System.out.println("------------- Add -------------");
        String eng = val.getWord("Enter English");
        String vi = val.getWord("Enter Vietnamese");
        controller.addWord(eng, vi);
        System.err.flush();
    }
    
    public void deleteWord(){
        System.out.println("------------ Delete ----------------");
        String eng = val.getWord("Enter English");
        controller.deleteWord(eng);
        System.err.flush();
    }
    
    public void translate(){
        System.out.println("------------- Translate ------------");
        String eng = val.getWord("Enter English");
        System.out.println(controller.translate(eng));
    }
    
    public String getInfo(String td) {
        return val.getString(td);
    }
    
    public void displayRedMessage(String message) {
        System.err.println(message);
        System.err.flush();
    }
}
