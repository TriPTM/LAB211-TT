
package view;

public class MainMenu extends Menu {
    private static String[] mc={"Input the information of 11 countries in East Asia","Display the information of country you've just input","Search the information of country by user-entered name","Display the information of countries sorted name in ascending order","Exit"};
    private CountryView cView=new CountryView();

    public MainMenu() {
        super("Equation Program", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: cView.inputInfo();break;
            case 2: cView.display();break;
            case 3: cView.search();break;
            case 4: cView.displayAsc();break;
            case 5: System.exit(0);
        }
    }

}
