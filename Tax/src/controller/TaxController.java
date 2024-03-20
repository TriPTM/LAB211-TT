package controller;

import java.util.ArrayList;
import model.TaxModel;
import view.TaxView;

public class TaxController {

    private TaxModel model;
    private TaxView view;

    public TaxController(TaxModel model, TaxView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        view.displayMessage("--------- TAX --------- ");
        double deductions = 0;
        String salary = view.getString("Enter salary");
        model.setIncome(salary);
        String hasParents = view.getString("Parents over 60 years old ?(Y/N)");
        model.setHasParentsOver60(hasParents);
        if (model.isHasParentsOver60()) {
            String siblings = view.getString("Number of siblings");
            model.setSiblings(siblings);
            deductions += 4400000 / (model.getSiblings() + 1);
        }
        String numberChilders = view.getString("How many children do you have?");
        model.setChildrens(numberChilders);
        int times = model.getChildrens();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < times; i++) {
            System.out.println("a");
            String age = view.getString("The age of " + (i + 1) + "st child(Y/N)");
            model.setUnder18(age);
            if (!model.isUnder18()) {
                String study = view.getString("Still studying?(Y/N)");
                model.setStudy(study);
                if (model.isStudy()) {
                    a.add(6000000);
                }
            } else {
                a.add(4400000);
            }
        }
        if (times > 0 && times < 3) {
            for (int i = 0; i < times; i++) {
                deductions += a.get(i);
            }
        } else if(times > 3) {
            int i = 0;
            while (a.contains(6000000)) {
                a.remove(a.indexOf(6000000));
                deductions += 6000000;
                i++;
            }
            while (i < 2) {
                deductions += 4400000;
                i++;
            }
        }
        double taxable = model.getIncome() - deductions;
        double tax = 0;
        if(model.getIncome() < 11000000){
            tax = 0;
        }else if(taxable >= 4000000 && taxable <= 6000000){
            tax = taxable * 0.05;
        }else if(taxable > 6000000 && taxable <= 10000000){
            tax = taxable * 0.1;
        } else if(taxable > 10000000){
            tax = taxable * 0.2;
        }
        view.displayMessage("Tax: " + tax);
    }

}
