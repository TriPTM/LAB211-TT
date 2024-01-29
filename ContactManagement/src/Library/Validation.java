
package Library;

import java.util.Scanner;

public class Validation {
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
    
    public int getNumber(String td) {
        boolean flag;
        Scanner sc=new Scanner(System.in);
        String digit = "\\d+";
        String input;
        do{
        System.out.println(td+": ");
        input = sc.next();
        flag = input.matches(digit);
        if(!flag)  {
            System.err.println("You must enter a number!");
            System.err.flush();
        }
        }while(!flag);
        return Integer.parseInt(input);
    }
    
    public String getPhone(String td){
        String validPhone = "[(]?[0-9]{3}[)]?[-. ]?[0-9]{3}[-. ]?[0-9]{4}"
            + "|[0-9]{3}[-][0-9]{3}[-][0-9]{4}[ a-z0-9]+";
        while (true) {
            System.out.println(td+": ");
            Scanner sc=new Scanner(System.in);
            String s = sc.nextLine();
            if(s.matches(validPhone)){
                return s;
            }
            System.out.println("Please input Phone flow\n"
                    + "• 1234567890\n"
                    + "• 123-456-7890 \n"
                    + "• 123-456-7890 x1234\n"
                    + "• 123-456-7890 ext1234\n"
                    + "• (123)-456-7890\n"
                    + "• 123.456.7890\n"
                    + "• 123 456 7890");
        }
    }
}
