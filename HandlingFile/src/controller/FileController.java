
package controller;

import java.util.ArrayList;
import java.util.Collections;
import model.FileProgram;
import model.Person;
import view.FileView;

public class FileController {
    private FileProgram model;
    private FileView view;

    public FileController(FileProgram model, FileView view) {
        this.model = model;
        this.view = view;
    }
    
    public void run(){
        view.setController(this);
        view.run();
    }
    
    public ArrayList<Person> loadPerson(String path, double money){
        ArrayList<Person> pList = model.getPerson(path, money);
        Collections.sort(pList);
        return pList;
    }
    
    public void copyText(String inputFile, String outputFile){
        model.copyWordOneTimes(inputFile, outputFile);
        view.displayMessage("Copy done...");
    }
}
