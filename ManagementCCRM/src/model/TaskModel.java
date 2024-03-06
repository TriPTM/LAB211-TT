
package model;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskModel {
    private ArrayList<Task> model;

    public TaskModel() {
        model = new ArrayList<Task>();
    }

    public TaskModel(ArrayList<Task> model) {
        this.model = model;
    }
    
    public String addTask(String name, String typeID, String date, double timeStart, double timeEnd, String assignee, String reviewer){
        try{
            Task news = new Task(name,typeID,date,timeStart,timeEnd,assignee,reviewer);
            model.add(news);
            return null;
        } catch(Exception e){
            return e.getMessage();
        }
    }
    
    public String deleteTask(String ID){
        for(Task a: this.model){
            if(a.getID().equals(ID)){
                model.remove(a);
                return null;
            }
        }
        return "";
    }
    
    public ArrayList<Task> getDataTasks (){
        return model;
    }
}
