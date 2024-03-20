
package taxincome;

import controller.TaxController;
import model.TaxModel;
import view.TaxView;

public class TaxIncome {

    public static void main(String[] args) {
        TaxModel model = new TaxModel();
        TaxView view = new TaxView();
        new TaxController(model,view).run();
    }
    
}
