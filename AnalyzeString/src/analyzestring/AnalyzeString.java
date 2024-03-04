
package analyzestring;

import controller.AnalyzeController;
import model.AnalyzeModel;
import view.AnalyzeView;

public class AnalyzeString {

    public static void main(String[] args) {
        AnalyzeModel model = new AnalyzeModel();
        AnalyzeView view = new AnalyzeView();
        new AnalyzeController(model,view).run();
    }
    
}
