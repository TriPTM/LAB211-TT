
package view;

public class DictionaryView extends Menu {
    private static String[] mc={"Add Word","Delete Word","Translate","Exit"};


    public DictionaryView() {
        super("Worker Management", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: addWord();break;
            case 2: deleteWord();break;
            case 3: translate();break;
            case 4: System.exit(0);
        }
    }
    
    public void addWord(){
        
    }
    
    public void deleteWord(){
        
    }
    
    public void translate(){
        
    }
    
     public void displayMessage(String message) {
        System.out.println(message);
    }
     
     public String getInfo(String td) {
        return "";
    }

}
