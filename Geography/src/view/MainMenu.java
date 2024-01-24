
package view;

import Controller.ManageEastAsiaCountries;

public class MainMenu extends Menu {
    private static String[] mc={"Enter the information for countries in Southeast Asia.","Display the information of country you've just input","Search the information of country by user-entered name","Exit"};
    public static ManageEastAsiaCountries cList= new ManageEastAsiaCountries();
    public static CountryView view = new CountryView();
   

    public MainMenu() {
        super("    MENU    ", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1:  view.inputInfo(); break;
            case 2: view.recentlyCountry(); break;
            case 3: break;
            case 4: break;
            case 5: System.exit(0);
        }
    }

}
