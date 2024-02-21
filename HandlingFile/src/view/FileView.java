
package view;

import Library.Validation;
import controller.FileController;
import java.util.ArrayList;
import model.Person;

public class FileView extends Menu {
    private static String[] mc={"Find person info","Copy Text to new file","Exit"};
    private Validation val= new Validation();
    private FileController controller;
    
    public FileView() {
        super("File Processing", mc);
    }

    public FileController getController() {
        return controller;
    }

    public void setController(FileController controller) {
        this.controller = controller;
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: loadPerson();break;
            case 2: copyText();break;
            default: System.exit(0);
        }
    }
    
    public void loadPerson(){
        System.out.println("--------- Person info ---------");
        String path = val.getString("Enter Path");
        double money = val.checkPositiveNumber("Enter Money");
        System.err.flush();
        System.out.println("------------- Result ----------");
        ArrayList<Person> pList = controller.loadPerson(path, money);
        System.out.printf("%-15s%-15s%-15s\n", "Name", "Address", "Money");
        for(Person p:pList){
            System.out.println(p);
        }
        
        System.out.println("\nMax: " + pList.get(pList.size()-1).getName());
        System.out.println("Min: " + pList.get(0).getName());
    }
    
    public void copyText(){
        System.out.println("------------- Copy text --------------");
        String inputFile = val.getString("Enter Source");
        String outputFile = val.getString("Enter new file name");
        controller.copyText(inputFile, outputFile);
    }
    
    public void displayMessage(String message){
        System.out.println(message);
    }

}
