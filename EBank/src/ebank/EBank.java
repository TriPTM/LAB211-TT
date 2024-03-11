
package ebank;

import controller.EBankController;
import model.EBankModel;
import view.EBankView;

public class EBank {

    public static void main(String[] args) {
        EBankModel model = new EBankModel();
        EBankView view = new EBankView();
        new EBankController(model,view).run();
    }
    
}
