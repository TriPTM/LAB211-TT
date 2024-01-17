
package Library;

import view.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    public String getString(String td){
        System.out.println(td+": ");
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }
    
    public int getInt(String td){
        System.out.println(td+": ");
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
    
}
