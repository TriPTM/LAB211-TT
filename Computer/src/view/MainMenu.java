
package view;

public class MainMenu extends Menu {
    private static String[] mc={"Normal Calculator","BMI Calculator","Exit"};
    private CalculatorView cView = new CalculatorView();

    public MainMenu() {
        super("========= Calculator Program =========", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: cView.normalCalculator(); break;
            case 2: cView.BMICalculator(); break;
            case 3: System.exit(0);
        }
    }

    
}
