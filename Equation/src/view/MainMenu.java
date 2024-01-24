
package view;

public class MainMenu extends Menu {
    private static String[] mc={"Calculate Superlative Equation","Calculate Quadratic Equation","Exit"};
    private EquationView eView=new EquationView();

    public MainMenu() {
        super("Equation Program", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: eView.calculateEquation();break;
            case 2: eView.calculateQuadraticEquation();break;
            case 3: System.exit(0);
        }
    }

}
