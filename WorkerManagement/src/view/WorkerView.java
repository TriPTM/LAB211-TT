
package view;

import Library.Validation;
import controller.WorkerController;
import java.util.ArrayList;
import model.SalaryHistory;
import model.Worker;

public class WorkerView {
    private Validation val= new Validation();
    private WorkerController wList = new WorkerController();
    
    public void addWorker(){
        System.out.println("--------- Add Worker ----------");
        String id = val.getString("Enter code");
        String name, workLocation;
        while(true){
            name= val.getWord("Enter Name");
            if(name.equals("")){
                System.err.println("Name just contains character");
                System.err.flush();
            }else   break;
        }
        int age=val.checkInputIntLimit("Enter Age", 18, 50);
        double salary=val.checkPositiveNumber("Enter Salary");
        
        
        while(true){
            workLocation= val.getWord("Enter work location");
            if(workLocation.equals("")){
                System.err.println("Work Location just contains character");
                System.err.flush();
            }else   break;
        }
        
        try {
            wList.addWorker(new Worker(id,name,workLocation,age,salary));
            System.err.flush();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            System.err.flush();
        }
        System.err.flush();
        
    }
    
    public void increaseSalary(){
        System.out.println("------- Up Salary --------");
        String id = val.getString("Enter code"); 
        double salary=val.checkPositiveNumber("Enter Salary");
        try {
            wList.increaseSalary(id, salary);
            System.err.flush();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            System.err.flush();
        }
        System.err.flush();
    }
    
    public void decreaseSalary(){
        System.out.println("------- Down Salary --------");
        String id = val.getString("Enter code"); 
        double salary=val.checkPositiveNumber("Enter Salary");
        try {
            wList.decreaseSalary(id, salary);
            System.err.flush();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            System.err.flush();
        }
        System.err.flush();
    }
    
    public void show(){
        System.out.println("--------------------Display Information Salary-----------------------");
        System.out.printf("%-7s%-15s%-15s%-15s%-15s%-15s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
        ArrayList<SalaryHistory> list = wList.show();
        for(SalaryHistory a:list){
            System.out.printf("%-7s%-15s%-15d%-15.1f%-15s%-15s\n", a.getId(), a.getName(), a.getAge(), a.getSalary(), a.getStatus(), a.getDate());
        }
    }
}
