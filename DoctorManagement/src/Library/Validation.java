
package Library;

import java.util.Scanner;

public class Validation {
    public String getString(String td){
        System.out.print(td+": ");
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }
    
    public String getWord(String td) {
        System.out.print(td+": ");
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
    
    public int getNumber(String td) {
        boolean flag;
        Scanner sc=new Scanner(System.in);
        String digit = "\\d+";
        String input;
        do{
        System.out.print(td+": ");
        input = sc.next();
        flag = input.matches(digit);
        if(!flag)  {
            System.err.println("You must enter a number!");
            System.err.flush();
        }
        }while(!flag);
        return Integer.parseInt(input);
    }
    
    public int changeNullNumber(String td){
        Scanner sc=new Scanner(System.in);
        while(true){
            try{
                System.out.print(td+": ");
                String s= sc.nextLine();
                if(s.equals(""))    return -1;
                else return Integer.parseInt(s);
            }catch(NumberFormatException e){
                System.err.println("Please Enter Number");
                System.err.flush();
            }
        }
    }
    
    public boolean checkAvailability(int availability){
        if(availability >=0)    return true;
        else return false;
    }
}
