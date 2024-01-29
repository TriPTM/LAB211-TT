
package controller;

import model.Numberic;

public class CalculatorController {
    Numberic numb = new Numberic();
    public CalculatorController() {
    }
    
    public  String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard.";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard.";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight.";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }
    }
    
        
         
        
        
    
}
