
package view;

import controller.CalculatorController;
import library.Validate;

public class CalculatorView {
    private Validate val= new Validate();
    private CalculatorController cal;
    public void normalCalculator(){
        System.out.println("----- Normal Calculator -----");
        double memory = val.checkDouble("Enter number");
        cal=new CalculatorController(memory);
        while (true){
            String operator = val.checkInputOperator("Enter Operator");
            if (operator.equalsIgnoreCase("=")){
                System.out.printf("Result: %.1f\n" , cal.getResult());
                break;
            }
            double a= val.checkDouble("Enter number");
            cal.calculate(a, operator);
            System.out.printf("Memory: %.1f\n" , cal.getResult());
            
        }
    }
    
    public  void BMICalculator() {
        System.out.println("----- BMI Calculator -----");
        double weight = val.checkDouble("Input Weight(kg)");
        double height = val.checkDouble("Input Height(cm)");
        double bmi = weight*10000 / (height*height);
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + cal.BMIStatus(weight,height));
    }
     
     
}


