
package library;

import java.util.Scanner;

public class Utils {
    private Scanner sc = new Scanner(System.in);
    
    public String getString(String msg){
        System.out.println(msg+": ");
        return sc.nextLine();
    }
    
    public int getInt(String msg){
        System.out.println(msg+": ");
        return Integer.parseInt(sc.nextLine());
    } 
    
    public double getDouble(String msg){
        System.out.println(msg+": ");
        return Double.parseDouble(sc.nextLine());
    } 

}
