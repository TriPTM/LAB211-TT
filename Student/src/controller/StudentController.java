
package controller;

import model.Student;
import model.StudentModel;
import view.StudentView;

public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    
    public void run(){
        view.displayMessage("====== Collection Sort Program ======");
        while(true){
            view.displayMessage("Please input student information");
            String name = view.getWord("Name");
            String classes = view.getString("Classes");
            double mark = view.getDouble("Mark");
            model.addData(name, classes, mark);
            String check = view.getString("Do you want to enter more student information?(Y/N)");
            if(!check.equals("Y") || !check.equals("y"))  break;
        }
        model.setModel(model.sortStudent(model.getModel()));
        int i=1;
        for(Student a:model.getModel()){
            view.displayMessage("-------------Student " + i +"-------------");
            view.displayMessage("Name: " + a.getName());
            view.displayMessage("Classes: " + a.getClasses());
            view.displayMessage("Mark: " + a.getMark());
            i++;
        }
    }
}
