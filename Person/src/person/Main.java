
package person;

import controller.PersonController;
import model.PersonModel;
import view.PersonView;

public class Main {

    public static void main(String[] args) {
        PersonModel model = new PersonModel();
        PersonView view = new PersonView();
        new PersonController(model,view).run();
    }
    
}
