package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    public String getString(String td){
        System.out.println(td+": ");
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }
    
    public float getFloat(String prompt) {
        
        System.out.print(prompt + ": ");
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }
}