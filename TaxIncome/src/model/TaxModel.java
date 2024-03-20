
package model;

import java.util.ArrayList;

public class TaxModel {
    private Worker worker;
    private ArrayList<String> details;
    private double deductions;
    private double amount;
    private double deductionsParent = 4400000;
    private double deductionsChildYoung = 4400000;
    private double deductionsChildOld = 6000000;
    

    public TaxModel() {
        
    }

    public TaxModel(Worker worker, ArrayList<String> details, double deductions, double amount) {
        this.worker = worker;
        this.details = details;
        this.deductions = deductions;
        this.amount = amount;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public ArrayList<String> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<String> details) {
        this.details = details;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDeductionsParent() {
        return deductionsParent;
    }

    public double getDeductionsChildYoung() {
        return deductionsChildYoung;
    }

    public double getDeductionsChildOld() {
        return deductionsChildOld;
    }
    
    public void basicInfo(){
        double salary = 0;
        for(String info: worker.getIncome().keySet()){
            details.add(String.format("%-40s %-40.f",info,worker.getIncome().get(info)));
            salary += worker.getIncome().get(info);
        }
        details.add(String.format("%-40s %-40.f","Total Salary",salary));
        amount = salary;
        details.add(String.format("%-40s %-40.f","Social insurance (8%)",salary*0.08));
        details.add(String.format("%-40s %-40.f","Health insurance (1.5%)",salary*0.015));
        details.add(String.format("%-40s %-40.f","Unemployment insurance (1%)",salary*0.01));
        amount = salary*0.895;
        details.add(String.format("%-40s %-40.f","Income before tax",amount));
        details.add(String.format("%-40s %-40.f","Reduce personal family circumstances",11000000));
        deductions = 11000000;
    }

}
