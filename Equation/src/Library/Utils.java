
package Library;

import java.util.Scanner;

public class Utils {
    public float getNumber(String td) {
        boolean flag;
        Scanner sc=new Scanner(System.in);
        String digit = "-*\\d+\\.*\\d*+";
        String input;
        do{
        System.out.println(td+": ");
        input = sc.next();
        flag = input.matches(digit);
        if(!flag)  System.out.println("You must enter a number!");
        }while(!flag);
        return Float.parseFloat(input);
    }
}
