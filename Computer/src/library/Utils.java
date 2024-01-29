
package library;

import static java.lang.System.in;
import java.util.Scanner;

public class Utils {
    public String getString(String td){
        System.out.println(td+": ");
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }
    
    public String getWord(String td) {
        System.out.println(td+": ");
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(" ", i)==i)    continue;
            if (!Character.isLetter(s.charAt(i))) {
                return "";
            }
        }
        return s;
    }
    
    public float getNumber(String td) {
        System.out.println(td+": ");
        boolean flag;
        Scanner sc=new Scanner(System.in);
        String digit = "\\d+\\.*\\d*+";
        String input = sc.next();
        flag = input.matches(digit);
        if(!flag)   throw new RuntimeException("You must enter a number!");
        return Float.parseFloat(input);
    }
    
    
}
