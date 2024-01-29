
package library;

import java.util.Scanner;

public class Validate {
     public  String checkInputOperator() {
        Scanner sc=new Scanner(System.in);
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
            } else if (result.equalsIgnoreCase("+") || result.equalsIgnoreCase("-")
                    || result.equalsIgnoreCase("*") || result.equalsIgnoreCase("/")
                    || result.equalsIgnoreCase("^") || result.equalsIgnoreCase("=")) {
                return result;
            } else {
                System.err.println("Please input (+, -, *, /, ^)");
            }
            System.out.print("Enter again: ");
        }
    }
     public double checkDouble(){
         Scanner sc=new Scanner(System.in);
         while (true){
             try {
                 double result = Double.parseDouble((sc.nextLine()));
                 return result;
             } catch (NumberFormatException e){
                 System.out.println("Please Enter Double");
                 System.out.print("Enter again: ");
             }
         }
     }
}
