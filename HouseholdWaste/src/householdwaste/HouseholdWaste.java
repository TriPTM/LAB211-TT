
package householdwaste;

import controller.HouseholdWasteController;
import model.HouseholdWasteModel;
import view.HouseholdWasteView;

public class HouseholdWaste {

    public static void main(String[] args) {
        HouseholdWasteModel model = new HouseholdWasteModel();
        HouseholdWasteView view = new HouseholdWasteView();
        new HouseholdWasteController(model,view).run();
    }
    
}
