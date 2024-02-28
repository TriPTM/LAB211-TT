
package controller;

import model.Circle;
import model.Rectangle;
import model.Triangle;
import view.CalculateView;

public class CalculateController {
    private Circle data1;
    private Rectangle data2;
    private Triangle data3;
    private CalculateView view;

    public CalculateController() {
    }

    public CalculateController(Circle data1, Rectangle data2, Triangle data3, CalculateView view) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.view = view;
    }
    
    public void run(){
        view.displayMessage("=====Calculator Shape Program=====");
        data2.setWidth(view.getDouble("Please input side width of Rectangle"));
        data2.setLength(view.getDouble("Please input length of Rectangle"));
        data1.setRadius(view.getDouble("Please input radius of Circle"));
        while(true){
            try{
                data3.setA(view.getDouble("Please input side A of Triangle"));
                break;
            } catch (Exception ex){
                view.displayMessage(ex.getMessage());
                view.displayMessage("Please enter again");
            }
        }
        while(true){
            try{
                data3.setB(view.getDouble("Please input side B of Triangle"));
                break;
            } catch (Exception ex){
                view.displayMessage(ex.getMessage());
                view.displayMessage("Please enter again");
            }
        }
        while(true){
            try{
                data3.setC(view.getDouble("Please input side C of Triangle"));
                break;
            } catch (Exception ex){
                view.displayMessage(ex.getMessage());
                view.displayMessage("Please enter again");
            }
        }
        data2.printResult();
        data1.printResult();
        data3.printResult();
    }
}
