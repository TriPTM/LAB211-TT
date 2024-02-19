
package controller;

import java.util.ArrayList;
import java.util.Collections;
import model.SalaryHistory;
import model.Worker;

public class WorkerController {
    private ArrayList<Worker> listWorker;
    private ArrayList<SalaryHistory> listSalary;

    public WorkerController() {
        listWorker = new ArrayList<Worker>();
        listSalary = new ArrayList<SalaryHistory>();
    }

    public WorkerController(ArrayList<Worker> listWorker, ArrayList<SalaryHistory> listSalary) {
        this.listWorker = listWorker;
        this.listSalary = listSalary;
    }
    
    public void addWorker(Worker w) throws Exception{
        for(Worker a:this.listWorker){
            if(a.getId().equals(w.getId())){
                throw new Exception ("Worker id " +a.getId()+" is duplicate");
            }
        }
        listWorker.add(w);
        System.err.println("Add Successful!!!");
    }
    
    public void increaseSalary(String code, double salary) throws Exception{
        for(Worker a:this.listWorker){
            if(a.getId().equals(code)){
                double amount = checkLastSalaryHistory(code);
                if(amount==0) throw new Exception("Code does not exist!!!");
                listSalary.add(new SalaryHistory("Up",a.getId(),a.getName(),a.getWorkLocation(),a.getAge(),amount+salary));
                System.err.println("Update successful!!!");
                return;
            }
        }
        
    }
    
    public void decreaseSalary(String code, double salary) throws Exception{
        for(Worker a:this.listWorker){
            if(a.getId().equals(code)){
                double amount = checkLastSalaryHistory(code);
                if(amount==0) throw new Exception("Code does not exist!!!");
                if(salary>amount) throw new Exception("The remaining salary must be greater than 0");
                else {                   
                    listSalary.add(new SalaryHistory("Down",a.getId(),a.getName(),a.getWorkLocation(),a.getAge(),amount-salary));
                    System.err.println("Update successful!!!");
                    return;
                }
            }
        }
        throw new Exception("Code does not exist!!!");
    }
    
    public ArrayList<SalaryHistory> show(){
        Collections.sort(listSalary);
        return listSalary;
    }
    
    public double checkLastSalaryHistory(String code){
        int i = listSalary.size()-1;
        for(;i>=0;i--){
            if(listSalary.get(i).getId().equals(code)){
                return listSalary.get(i).getSalary();
            }
        }
        for(Worker a:this.listWorker){
            if(a.getId().equals(code)) {
                return a.getSalary();
            }
        }
        return 0;
    }
}
