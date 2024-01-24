
package view;

import Library.Utils;
import controller.NumbericController;
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
        if(list.isEmpty()){
            System.out.println("Infinitely many solutions ");
            list.add(new Numberic(a));
            list.add(new Numberic(b));
            nc.checkEven(list);
            nc.checkSquare(list);
            print(list);
        }else if(list.equals(null)){
            System.out.println("No solutions ");
            list.add(new Numberic(a));
            list.add(new Numberic(b));
            nc.checkEven(list);
            nc.checkSquare(list);
            print(list);
        }else{
            System.out.println("Solution: x= "+list.get(2).getNum());
            print(list);
        }
    }
    
    public void calculateQuadraticEquation(){
        System.out.println("--------- Calculate Quadratic Equation ---------");
        float a=ut.getNumber("Enter A");
        float b=ut.getNumber("Enter B");
        float c=ut.getNumber("Enter C");
        List<Numberic> list=nc.calculateEquation(a, b);
        if(list.isEmpty()){
            System.out.println("Infinitely many solutions ");
            list.add(new Numberic(a));
            list.add(new Numberic(b));
            list.add(new Numberic(c));
            nc.checkEven(list);
            nc.checkSquare(list);
            print(list);
        }else if(list.equals(null)){
            System.out.println("No solutions ");
            list.add(new Numberic(a));
            list.add(new Numberic(b));
            list.add(new Numberic(c));
            nc.checkEven(list);
            nc.checkSquare(list);
            print(list);
        }else{
            if(list.size()==4) System.out.println("Solution: x= "+list.get(3).getNum());
            else    System.out.println("Solution: x1 = "+list.get(3).getNum()+"and x2 = " +list.get(4).getNum());
            print(list);
        }
    }
    
    public void print(List<Numberic> list){
        System.out.print("Number is Odd:");
        for(Numberic number:list){
            if(number.isOdd()){
                System.out.print(number.getNum()+"   ");
            }
        }
        System.out.println("");
        System.out.print("Number is Even:");
        for(Numberic number:list){
            if(number.isEven()){
                System.out.print(number.getNum()+"   ");
            }
        }
        System.out.println("");
        System.out.print("Number is Perfect Square:");
        for(Numberic number:list){
            if(number.isPerfectSquare()){
                System.out.print(number.getNum()+"   ");
            }
        }
        System.out.println("");  
    }
    
}
