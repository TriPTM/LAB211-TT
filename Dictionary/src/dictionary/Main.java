
package dictionary;

import Library.common;
import controller.DictionaryController;
import model.Dictionary;
import view.DictionaryView;

public class Main {

    public static void main(String[] args) {
        Dictionary model = new Dictionary(common.INPUT,common.OUTPUT);
        DictionaryView view = new DictionaryView();
        new DictionaryController(model,view).run();
    }
    
}
