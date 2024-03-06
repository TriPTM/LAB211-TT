
package view;

import java.util.List;
import java.util.Scanner;
import model.Expense;

public class ExpenseView {
    private Scanner sc = new Scanner(System.in);

    public ExpenseView() {
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
    
    public void displayAll(List<Expense> data){
        System.out.printf("%-10s%-20s%-15s%-20s\n", "ID", "Date", "Amount", "Content");
        for(Expense a:data){
            System.out.println(String.format("%-10s%-20s%-15d%-20s", a.getId(),a.getDate(),a.getAmount(),a.getContent()));
        }
    }
    
}
