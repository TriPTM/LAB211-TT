
package view;

import Library.Utils;
import controller.NumbericController;
import java.util.ArrayList;
import java.util.List;
import model.Numberic;

public class EquationView {
    private Utils ut= new Utils();
    private NumbericController nc= new NumbericController();
    
    public void calculateEquation(){
        System.out.println("--------- Calculate Equation ---------");
        float a=ut.getNumber("Enter A");
        float b=ut.getNumber("Enter B");
        List<Numberic> list=nc.calculateEquation(a, b);
        if(list==null){
            System.out.println("No solutions ");
            list= new ArrayList<Numberic>();
            list.add(new Numberic(a));
            list.add(new Numberic(b));
            nc.checkEven(list);
            nc.checkSquare(list);
            print(list);
        }else if(list.isEmpty()){
            System.out.println("Infinitely many solutions ");
            list.add(new Numberic(a));
            list.add(new Numberic(b));
            nc.checkEven(list);
            nc.checkSquare(list);
            print(list);
        }else{
            System.out.println("Solution: x= "+String.format("%.3f", list.get(2).getNum()));
            print(list);
        }
    }
    
    public void calculateQuadraticEquation(){
        System.out.println("--------- Calculate Quadratic Equation ---------");
        float a=ut.getNumber("Enter A");
        float b=ut.getNumber("Enter B");
        float c=ut.getNumber("Enter C");
        List<Numberic> list=nc.calculateQuadraticEquation(a,b,c);
        if(list==null){
            System.out.println("No solutions ");
            list= new ArrayList<Numberic>();
            list.add(new Numberic(a));
            list.add(new Numberic(b));
            list.add(new Numberic(c));
            nc.checkEven(list);
            nc.checkSquare(list);
            print(list);
        }else if(list.isEmpty()){
            System.out.println("Infinitely many solutions ");
            list.add(new Numberic(a));
            list.add(new Numberic(b));
            list.add(new Numberic(c));
            nc.checkEven(list);
            nc.checkSquare(list);
            print(list);
        }else{
            if(list.size()==4) System.out.println("Solution: x= "+list.get(3).getNum());
            else    System.out.println("Solution: x1 = "+String.format("%.3f", list.get(3).getNum())+"and x2 = " +String.format("%.3f", list.get(4).getNum()));
            print(list);
        }
    }
    
    public void print(List<Numberic> list){
        System.out.print("Number is Odd:");
        int i=1;
        int count=nc.countOdd(list);
        if(count==0)    System.out.print("There are no numbers");
        else {
            for(Numberic number:list){
                if(number.isOdd()){
                    System.out.print(number.getNum());
                    if(i<count){
                        System.out.print(", ");
                    }
                    i++;
                }
            }
        }
        System.out.println("");
        System.out.print("Number is Even:");
        i=1;
        count=nc.countEven(list);
        if(count==0)    System.out.print("There are no numbers");
        else {
            for(Numberic number:list){
                if(number.isEven()){
                    System.out.print(number.getNum());
                    if(i<count){
                        System.out.print(", ");
                    }
                    i++;
                }
            }
        }
        System.out.println("");
        System.out.print("Number is Perfect Square:");
        i=1;
        count=nc.countSquare(list);
        if(count==0)    System.out.print("There are no numbers");
        else {
            for(Numberic number:list){
                if(number.isPerfectSquare()){
                    System.out.print(number.getNum());
                    if(i<count){
                        System.out.print(", ");
                    }
                    i++;
                }
            }
        }
        System.out.println("");  
    }
    
}
