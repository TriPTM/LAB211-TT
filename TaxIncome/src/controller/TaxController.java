
package controller;

import java.util.ArrayList;
import model.TaxModel;
import model.Worker;
import view.TaxView;

public class TaxController {
    private TaxModel model;
    private TaxView view;

    public TaxController(TaxModel model, TaxView view) {
        this.model = model;
        this.view = view;
    }
    
    public void run(){
        Worker a = view.getWorkder();
        model.setWorker(a);
        model.basicInfo();
        if(model.getWorker().getParent().getAge() > 60){
            double deduction = model.getWorker().getParent().getNumberOfChildrens();
            model.getDetails().add(String.format("%-40s %-40.f","Deduction for parents over 60 years old",
                    model.getDeductionsParent()/deduction));
            model.setDeductions(model.getDeductions()+deduction);
        }
        int times = a.getChildren().size();
        ArrayList<Double> b = new ArrayList<Double>();
        for (int i = 0; i < times; i++) {
            if (model.getWorker().getChildren().get(i).getAge() > 18) {
                if (model.getWorker().getChildren().get(i).getStatus().equals("Study")) {
                    b.add(model.getDeductionsChildOld());
                }
            } else {
                b.add(model.getDeductionsChildYoung());
            }
        }
        if (times > 0 && times < 3) {
            for (int i = 0; i < times; i++) {
                if(b.get(i)==model.getDeductionsChildOld()){
                    model.getDetails().add(String.format("%-40s %-40.f","Deduction for children over 18 years old still in school",b.get(i)));
                }else{
                    model.getDetails().add(String.format("%-40s %-40.f","Deduction for children under 18 years old",b.get(i)));
                }
                model.setDeductions(model.getDeductions()+b.get(i));
            }
        } else if(times > 3) {
            int i = 0;
            while (b.contains(model.getDeductionsChildOld())) {
                b.remove(b.indexOf(6000000));
                model.getDetails().add(String.format("%-40s %-40.f","Deduction for children over 18 years old still in school",model.getDeductionsChildOld()));
                model.setDeductions(model.getDeductions()+model.getDeductionsChildOld());
                i++;
            }
            while (i < 2) {
                model.getDetails().add(String.format("%-40s %-40.f","Deduction for children under 18 years old",model.getDeductionsChildYoung()));
                model.setDeductions(model.getDeductions()+model.getDeductionsChildYoung());
                i++;
            }
        }
        model.getDetails().add(String.format("%-40s %-40.f","Total Deduction",model.getDeductions()));
        double tax = model.getAmount() - model.getDeductions();
        if(tax < 0){
            tax = 0;
        }
        model.getDetails().add(String.format("%-40s %-40.f","Income Taxes",tax));
        
        if(tax < 5000000)   model.getDetails().add(String.format("%-40s %-40.f","Personal Income Tax",tax*0.05));
        else if(tax < 10000000) model.getDetails().add(String.format("%-40s %-40.f","Personal Income Tax",tax*0.1));
        else if(tax < 18000000) model.getDetails().add(String.format("%-40s %-40.f","Personal Income Tax",tax*0.15));
        else if(tax < 32000000) model.getDetails().add(String.format("%-40s %-40.f","Personal Income Tax",tax*0.2));
        else if(tax < 52000000) model.getDetails().add(String.format("%-40s %-40.f","Personal Income Tax",tax*0.25));
        else if(tax < 80000000) model.getDetails().add(String.format("%-40s %-40.f","Personal Income Tax",tax*0.30));
        else  model.getDetails().add(String.format("%-40s %-40.f","Personal Income Tax",tax*0.35));
    }
}
