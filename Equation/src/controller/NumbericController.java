
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Numberic;

public class NumbericController {  
    
    public List<Numberic> calculateEquation(float a, float b){
        List<Numberic> list= new ArrayList<Numberic>();
        if(a==0){
            if(b==0){
                return list;
            }else{
                return null;
            }
        }else{
            list.add(new Numberic(a));
            list.add(new Numberic(b));
            list.add(new Numberic(-b/a));
            checkEven(list);
            checkSquare(list);
            return list;
        }
    }
    
    public List<Numberic> calculateQuadraticEquation(float a, float b,float c){
        List<Numberic> list= new ArrayList<Numberic>();
        if(a==0){
            list=calculateEquation(b,c);
            return list;
        }else{
            float denta= (float) (Math.pow(b, 2)-4*a*c);
            float x1,x2;
            if(denta<0){
                return null;
            }else if(denta==0){
                x1=x2=-b/(2*a);
            }else{
                x1=(-b+(float)(Math.sqrt(denta)))/(2*a);
                x2=(-b-(float)(Math.sqrt(denta)))/(2*a);
            }
            list.add(new Numberic(a));
            list.add(new Numberic(b));
            list.add(new Numberic(c));
            list.add(new Numberic(x1));
            list.add(new Numberic(x2));
            checkEven(list);
            checkSquare(list);
            return list;
        }
    }
    
    public void checkEven(List<Numberic> list){
        for(Numberic number:list){
            if(number.getNum()%2==0){
                number.setEven(true);
                number.setOdd(false);
            }else{
                number.setEven(false);
                number.setOdd(true);
            }   
        }
    }
    
    public void checkSquare(List<Numberic> list){
        for(Numberic number:list){
            if((float)Math.sqrt(number.getNum())*(float)Math.sqrt(number.getNum())==number.getNum()){
                number.setPerfectSquare(true);
            }else   number.setPerfectSquare(false);
        }
    }
}
