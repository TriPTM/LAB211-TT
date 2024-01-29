
package view;

import library.Validate;

public class CalculatorView {
    private Validate val;
    public void calculator(){
        double memory = 0;
        System.out.println("Enter number a: ");
        while (true){
            System.out.println("Enter Operator: ");
            String operator = val.checkInputOperator();
            if (operator.equalsIgnoreCase("+")) {
                memory += inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("-")) {
                memory -= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("*")) {
                memory *= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("/")) {
                memory /= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("^")) {
                memory = Math.pow(memory, inputNumber());
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("=")) {
                System.out.println("Result: " + memory);
                return;
            }
        }
        }
    
   public  void BMICalculator() {
        System.out.print("Input Weight(kg): ");
        double weight = val.checkDouble();
        System.out.print("Input Height(cm): ");
        double height = val.checkDouble();
        double bmi = weight*10000 / (height*height);
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + BMIStatus(bmi));
    }
        
     public  double inputNumber() {
        System.out.print("Enter number b: ");
        double number = val.checkDouble();
        return number;
    }
     
}


