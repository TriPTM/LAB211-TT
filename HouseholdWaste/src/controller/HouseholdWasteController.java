package controller;

import model.HouseholdWasteModel;
import view.HouseholdWasteView;
import view.Menu;

public class HouseholdWasteController extends Menu {

    private HouseholdWasteModel model;
    private HouseholdWasteView view;
    private static String[] mc = {"Add Garbage Point", "Total", "Print Work Logs", "Quit"};

    public HouseholdWasteController(HouseholdWasteModel model, HouseholdWasteView view) {
        super("Household Waste", mc);
        this.model = model;
        this.view = view;
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                addGarbagePoint();
                System.err.flush();
                break;
            case 2:
                getTotal();
                System.err.flush();
                break;
            case 3:
                printWorkLogs();
                System.err.flush();
                break;
            case 4:
                System.exit(0);
        }
    }

    public void addGarbagePoint() {
        view.displayMessage("--------- Add Garbage Point --------");
        String value;
        while(true){
            try{
                value = view.getString("Enter the amount of garbage");
                if(model.checkAddGarbagePoint(value)){
                    break;
                }
            }catch(Exception ex){
                view.displayRedMessage(ex.getMessage());
                System.err.flush();
            }
        }
        System.err.flush();
    }

    public void getTotal() {
        view.displayMessage("--------- Total --------");
        model.start();
        view.displayMessage("The total cost is " + model.getTotal() + "VND");
        
    }

    public void printWorkLogs() {
        view.displayMessage("--------- Work Logs --------");
        view.printWorkLogs(model.getWorkLogs());
    }
}
