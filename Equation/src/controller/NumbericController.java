
package controller;

import java.util.ArrayList;
import java.util.List;

public class NumbericController {
    private List<Number> nList=new ArrayList<Number>();

    public List<Number> getnList() {
        return nList;
    }

    public void setnList(List<Number> nList) {
        this.nList = nList;
    }
    
    public boolean checkPerfectSquare(){
        return false;
    }
    
    public boolean isOdd(){
        return false;
    }
    
    public void calculateEquation(float a, float b){
        if(a==0){
            if(b==0){
                
            }else{
                
            }
        }else{
            
        }
    }
    
    public void calculateQuadraticEquation(float a, float b,float c){
        if(a==0){
            calculateEquation(b,c);
        }else{
            float denta= (float) (Math.pow(b, 2)-4*a*c);
            float x1,x2;
            if(denta<0){
                
            }else if(denta==0){
                x1=x2=-b/(2*a);
            }else{
                x1=(-b+(float)(Math.sqrt(denta)))/(2*a);
                x2=(-b-(float)(Math.sqrt(denta)))/(2*a);
            }
        }
    }
}
