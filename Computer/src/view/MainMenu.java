
package view;

public class MainMenu extends Menu {
    private static String[] mc={"Normal Calculator","BMI Calculator","Exit"};
    CalculatorView view = new CalculatorView();

    public MainMenu() {
        super("====== Calculator Program =====", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: view.calculator(); break;
            case 2: ; break;
            case 3: System.exit(0);
        }
    }

    
}
