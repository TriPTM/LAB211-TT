
package controller;

import model.BMI;
import model.Calculator;

public class CalculatorController {
    private Calculator numb ;
    private BMI b;
    
    public CalculatorController() {
        numb = new Calculator();
    }
    
    public CalculatorController(double num){
        numb = new Calculator(num);
    }
    
    public double getResult(){
        return numb.getResult();
    }
    
    public void calculate(double num, String op){    
        switch(op){
            case "+": numb.sum(num);break;
            case "-": numb.subtract(num);break;
            case "*": numb.multiple(num);break;
            case "^": numb.exponent(num);break;
            case "/": numb.divideBy(num);break;
            case "=": break;
        }
    }
    
    public  String BMIStatus(double height, double weight) {
        b=new BMI(height,weight);
        double bmi = weight*10000 / (height*height);
        if (bmi < 19) {
            b.setStatus("Under-standard.");
            return "Under-standard.";
        } else if ( bmi < 25) {
            b.setStatus("Standard.");
            return "Standard.";
        } else if ( bmi < 30) {
            b.setStatus("Overweight.");
            return "Overweight.";
        } else if ( bmi < 40) {
            b.setStatus("Fat-should lose weight");
            return "Fat-should lose weight";
        } else {
            b.setStatus("Very fat - should lose weight immediately");
            return "Very fat - should lose weight immediately";
        }
    }
    
        
         
        
        
    
}
