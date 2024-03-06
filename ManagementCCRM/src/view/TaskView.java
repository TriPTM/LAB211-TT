
package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Task;

public class TaskView {
    private Scanner sc = new Scanner(System.in);

    public TaskView() {
    }
    
    public void displayMessage(String message) {
        System.out.println(message);
    }
    
    public void displayRedMessage(String message) {
        System.err.println(message);
        System.err.flush();
    }
    
    public String getString(String message){
        System.out.print(message+": ");
        return sc.nextLine();
    }
    
    public double getDouble(String message){
        System.out.print(message+": ");
        return Double.parseDouble(sc.nextLine());
    }
    
    public void printTask(ArrayList<Task> data){
        System.out.printf("%-10s%-25s%-20s%-20s%-20s%-20s%-20s\n",
                "ID", "Name", "Task Type", "Date", "Time", "Assign", "Reviewer");
        for(Task a :data){
            System.out.println(String.format("%-10s%-25s%-20s%-20s%-20.1f%-20s%-20s", 
                    a.getID(),a.getName(),a.getTypeID(),a.getDate(),a.getTimeEnd() - a.getTimeStart(),a.getAssignee(),a.getReviewer()));
        }
    }        
}
