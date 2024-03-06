
package handyexpense;

import controller.ExpenseController;
import model.ExpenseModel;
import view.ExpenseView;

public class HandyExpense {

    public static void main(String[] args) {
        ExpenseModel model = new ExpenseModel();
        ExpenseView view = new ExpenseView();
        new ExpenseController(model,view).run();
    }
    
}
