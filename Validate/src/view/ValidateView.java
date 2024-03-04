
package view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ValidateView {
    private Scanner sc = new Scanner(System.in);

    public ValidateView() {
    }
    
    public void displayMessage(String message) {
        System.out.println(message);
    }
    
    public void displayRedMessage(String message) {
        System.err.println(message);
        System.err.flush();
    }
    
    public String getString(String message){
        System.out.print(message+": ");
        return sc.nextLine();
    }
    
}
