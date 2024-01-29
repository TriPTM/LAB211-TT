
package view;

import controller.CalculatorController;
import library.Validate;

public class CalculatorView {
    private Validate val= new Validate();
    private CalculatorController cal= new CalculatorController();
    public void normalCalculator(){
        System.out.println("----- Normal Calculator -----");
        double memory = val.checkDouble("Enter number");
        while (true){
            String operator = val.checkInputOperator("Enter Operator");
            switch(operator){
                case "+": memory += val.checkDouble("Enter number");System.out.printf("Memory: %.1f\n" , memory);break;
                case "-": memory -= val.checkDouble("Enter number");System.out.printf("Memory: %.1f\n" , memory);break;
                case "*": memory *= val.checkDouble("Enter number");System.out.printf("Memory: %.1f\n" , memory);break;
                case "^": memory = Math.pow(memory, val.checkDouble("Enter number"));System.out.printf("Memory: %.1f\n" , memory);break;
                case "/": memory /= val.checkDouble("Enter number");System.out.printf("Memory: %.1f\n" , memory);break;
                case "=": System.out.printf("Result: %.1f\n" , memory);break;
            }
            if (operator.equalsIgnoreCase("=")){
                break;
            }
        }
    }
    
    public  void BMICalculator() {
        System.out.println("----- BMI Calculator -----");
        double weight = val.checkDouble("Input Weight(kg)");
        double height = val.checkDouble("Input Height(cm)");
        double bmi = weight*10000 / (height*height);
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + cal.BMIStatus(bmi));
    }
     
     
}


