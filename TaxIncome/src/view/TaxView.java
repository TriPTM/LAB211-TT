
package view;

import java.util.ArrayList;
import java.util.HashMap;
import library.Utils;
import model.Child;
import model.Parent;
import model.Worker;

public class TaxView {
    private Utils ut = new Utils();

    public TaxView() {
    }
    
    public void displayMessage(String message) {
        System.out.println(message);
    }
    
    public void displayRedMessage(String message) {
        System.err.println(message);
        System.err.flush();
    }
    
    public String getString(String message){
        return ut.getString(message);
    }
    
    public Worker getWorkder(){
        Worker a = new Worker();
        int times = ut.getInt("How many sources of income do you have?");
        HashMap<String,Double> salary = new HashMap<String,Double>();
        for(int i = 0; i < times;i++){
            String job = ut.getString("Jobs " + (i+1));
            double money = ut.getDouble("Salary");
            salary.put(job, money);
        }
        a.setIncome(salary);
        System.out.println("");
        String check = ut.getString("Whether your parents are alive or not?");
        Parent b = getParent();
        a.setParent(b);
        System.out.println("");
        
        ArrayList<Child> children = new ArrayList<Child>();
        for(int i = 0;i<2;i++){
            children.add(getChild(i+1));
        }
        a.setChildren(children);
        return a;
    }
    
    public Parent getParent(){
        Parent a = new Parent();
        int age = ut.getInt("How old are your parent?");
        a.setAge(age);
        int children = ut.getInt("How many children do your parents have?");
        a.setNumberOfChildrens(children);
        return a;
    }
    
    public Child getChild(int cardinal){
        Child a = new Child();
        int age = ut.getInt("How old is your child?");
        a.setAge(age);
        String status = ut.getString("");
        a.setStatus(status);
        return a;
    }
}
