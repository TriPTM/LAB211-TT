
package controller;

import model.TaskModel;
import view.Menu;
import view.TaskView;

public class TaskController extends Menu{
    private TaskModel model;
    private TaskView view;
    private static String[] mc={"Add Task","Delete Task","Display Task","Exit"}; 

    public TaskController(TaskModel model, TaskView view) {
        super("Task program", mc);
        this.model = model;
        this.view = view;
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: addTask();System.err.flush();;break;
            case 2: deleteTask();System.err.flush();break;
            case 3: displayTask();System.err.flush();break;
            case 4: System.exit(0);
        }
    }
    
    public void addTask(){
        view.displayMessage("------------Add Task---------------");
        String name = view.getString("Requirement Name");
        String type = view.getString("Task Type");
        String date = view.getString("Date");
        double timeStart = view.getDouble("From");
        double timeEnd = view.getDouble("To");
        String assignee = view.getString("Assignee");
        String reviewer = view.getString("Reviewer");
        String check = model.addTask(name, type, date, timeStart, timeEnd, assignee, reviewer);
        if(check == null){
            view.displayMessage("Add Successful!!!");
        }else{
            view.displayRedMessage(check);
            System.err.flush();
        }
        System.err.flush();
    }
    
    public void deleteTask(){
        view.displayMessage("---------Del Task------");
        String id = view.getString("ID");
        String check = model.deleteTask(id);
        if(check == null){
            view.displayMessage("Delete Successful!!!");
        }else{
            view.displayRedMessage("Can't find ID");
            System.err.flush();
        }
        System.err.flush();
    }
    
    public void displayTask(){
        view.displayMessage("----------------------------------------- Task ---------------------------------------");
        view.printTask(model.getDataTasks());
    }
    
}
