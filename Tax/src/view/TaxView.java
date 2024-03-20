
package view;

import java.util.Scanner;

public class TaxView {
    private Scanner sc = new Scanner(System.in);

    public TaxView() {
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
    
    public int getInt(String message){
        System.out.print(message+": ");
        return Integer.parseInt(sc.nextLine());
    }
}
