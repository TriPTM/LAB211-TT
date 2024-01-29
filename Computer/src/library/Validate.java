
package library;

import java.util.Scanner;

public class Validate {
    public  String checkInputOperator(String td) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.print(td+": ");
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.err.flush();
            } else if (result.equalsIgnoreCase("+") || result.equalsIgnoreCase("-")
                    || result.equalsIgnoreCase("*") || result.equalsIgnoreCase("/")
                    || result.equalsIgnoreCase("^") || result.equalsIgnoreCase("=")) {
                return result;
            } else {
                System.err.println("Please input (+, -, *, /, ^)");
                System.err.flush();
            }
        }
    }
    public double checkDouble(String td){
        Scanner sc=new Scanner(System.in);
        while (true){
            try {
                System.out.print(td+": ");
                double result = Double.parseDouble((sc.nextLine()));
                return result;
            } catch (NumberFormatException e){
                System.err.println("Please Enter Double");
                System.err.flush();
            }
        }
    }
}
