package tax;

import controller.TaxController;
import model.TaxModel;
import view.TaxView;

public class Tax {

    public static void main(String[] args) {
        TaxModel model = new TaxModel();
        TaxView view = new TaxView();
        new TaxController(model,view).run();
    }

}
