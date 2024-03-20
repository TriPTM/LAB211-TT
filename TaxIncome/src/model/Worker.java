
package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Worker extends Person {
    private Parent parent;
    private ArrayList<Child> children;
    private HashMap<String,Double> income;

    public Worker() {
    }
    
    public Worker(Parent parent, ArrayList<Child> children, HashMap<String, Double> income) {
        this.parent = parent;
        this.children = children;
        this.income = income;
    }

    public Worker(Parent parent, ArrayList<Child> children, HashMap<String, Double> income, int age) {
        super(age);
        this.parent = parent;
        this.children = children;
        this.income = income;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public ArrayList<Child> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Child> children) {
        this.children = children;
    }

    public HashMap<String, Double> getIncome() {
        return income;
    }

    public void setIncome(HashMap<String, Double> income) {
        this.income = income;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
