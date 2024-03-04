
package controller;

import model.AnalyzeModel;
import view.AnalyzeView;

public class AnalyzeController {
    private AnalyzeModel model;
    private AnalyzeView view;

    public AnalyzeController(AnalyzeModel model, AnalyzeView view) {
        this.model = model;
        this.view = view;
    }
    
    public void run (){
        view.displayMessage("===== Analysis String program ====");
        String input = view.getString("Input String");
        model.setInput(input);
        view.displayMessage("-----Result Analysis------");
        view.printNumber(model.getNumber());
        view.printCharacter(model.getCharacter());
    }
}
