
package controller;

import model.ExpenseModel;
import view.ExpenseView;
import view.Menu;

public class ExpenseController extends Menu {
    private ExpenseModel model;
    private ExpenseView view;
    private static String[] mc={"Add an expense","Display all expenses","Delete an expense","Quit"}; 

    public ExpenseController(ExpenseModel model, ExpenseView view) {
        super("Handy Expense program", mc);
        this.model = model;
        this.view = view;
    }
    
    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: addExpense();System.err.flush();;break;
            case 2: displayAllExpenses();System.err.flush();break;
            case 3: deleteExpense();System.err.flush();break;
            case 4: System.exit(0);
        }
    }
    
    public void addExpense(){
        view.displayMessage("-------- Add an expense--------");
        String date = view.getString("Enter Date");
        int amount = view.getInt("Enter Amount");
        String content = view.getString("Enter content");
        String check = model.addExpense(date, amount, content);
        if(check == null){
            view.displayMessage("Add Successful!!!");
        }else{
            view.displayRedMessage(check);
            System.err.flush();
        }
        System.err.flush();
    }
    
    public void displayAllExpenses() {
        view.displayMessage("---------Display all expenses------------");
        view.displayAll(model.getDataExpense());
    }

    public void deleteExpense() {
        view.displayMessage("--------Delete an expense------");
        int exp = view.getInt("Enter ID");
        if (model.deleteExpense(exp)) {
            view.displayMessage("Delete an expense successful");
        } else {
            view.displayRedMessage("Delete an expense fail");
            System.err.flush();
        }
        System.err.flush();
    }
}
