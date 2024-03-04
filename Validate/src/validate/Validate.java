
package validate;

import controller.ValidateController;
import model.ValidateModel;
import view.ValidateView;

public class Validate {

    public static void main(String[] args) {
        ValidateModel model = new ValidateModel();
        ValidateView view = new ValidateView();
        new ValidateController(model,view).run();
    }
    
}
