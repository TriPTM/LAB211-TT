
package controller;

import model.Person;
import model.PersonModel;
import view.PersonView;

public class PersonController {
    private PersonModel model;
    private PersonView view;

    public PersonController() {
    }

    public PersonController(PersonModel model, PersonView view) {
        this.model = model;
        this.view = view;
    }
    
    public void run (){
        view.displayMessage("=====Management Person programer=====");
        for(int i = 0;i<model.getModel().length;i++){
            view.displayMessage("Input Information of Person");
            String name = view.getWord("Please input name");
            String address = view.getWord("Please input address");
            double salary = view.getDouble("Please input salary");
            model.getModel()[i] = new Person(name,address,salary);
        }
        model.sortBySalary(model.getModel());
        for(int i = 0;i<model.getModel().length;i++){
            model.displayPersonInfo(model.getModel()[i]);
        }
    }
}
