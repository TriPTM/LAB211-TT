
package view;

import Library.Utils;
import library.Validation;

public class CountryView {
    private Validation val= new Validation();
    private Utils ut = new Utils();
    
    public void inputInfo(){
        
            String name = ut.getString("Enter name of country");
            String code= ut.getString("Enter code of country");
            String terrain = ut.getString("Enter terrain of country");
            Float area= ut.getFloat(" Enter total Area");
            while (true){
            if (val.checkArea(area)){
                MainMenu.cList.addCountries(code, name, area, terrain);
                break;
            } else {
                System.out.println("Area Invalid!! Please redo");
                break;
            }
            }
    }
    
    public void recentlyCountry(){
        MainMenu.cList.displayCountry();
    }
}

