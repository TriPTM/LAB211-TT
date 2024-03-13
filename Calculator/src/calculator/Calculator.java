
package calculator;

import controller.CalculatorController;
import model.CalculatorModel;
import view.CalculatorView;

public class Calculator {

    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        new CalculatorController(model,view).run();
    }
    
}
