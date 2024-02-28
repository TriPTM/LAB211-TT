
package calculate;

import controller.CalculateController;
import model.Circle;
import model.Rectangle;
import model.Triangle;
import view.CalculateView;

public class Calculate {


    public static void main(String[] args) {
        Circle data1 = new Circle();
        Rectangle data2 = new Rectangle();
        Triangle data3 = new Triangle();
        CalculateView view = new CalculateView();
        new CalculateController(data1,data2,data3,view).run();
    }
    
}
