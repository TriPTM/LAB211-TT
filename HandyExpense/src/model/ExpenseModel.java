
package model;

import java.util.ArrayList;
import java.util.List;

public class ExpenseModel {
    private List<Expense> model;

    public ExpenseModel() {
        model = new ArrayList<Expense>();
    }

    public ExpenseModel(List<Expense> model) {
        this.model = model;
    }
    
    public String addExpense(String date, String amount, String content){
        try{
            Expense news = new Expense(date,amount,content);
            model.add(news);
            return null;
        } catch(Exception e){
            return e.getMessage();
        }
    }
    
    public boolean deleteExpense(int id){
        for(Expense a: this.model){
            if(a.getId()==id){
                model.remove(a);
                return true;
            }
        }
        return false;
    }
    
    public List<Expense> getDataExpense(){
        return model;
    }
    
    public int getTotalAmount(){
        int total =0;
        for(Expense a: this.model){
            total+=a.getAmount();
        }
        return total;
    }   
    
}
