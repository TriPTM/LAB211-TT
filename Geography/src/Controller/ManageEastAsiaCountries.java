
package Controller;

import java.util.ArrayList;
import model.Country;

public class ManageEastAsiaCountries extends ArrayList<Country> {
    
    
    public void addCountries(String code, String name, Float area, String terrain){
        for (Country e:this){
            e.setCountryCode(code);
            e.setCountryName(name);
            e.setTotalArea(area);
            e.setCountryTerrain(terrain);
        }
    }
    
    public void displayCountry(){
        for (Country e:this){
            e.display();
        }
    }
    
    public void searchCountry(String name){
        for (Country e:this){
            if (name.equals(e.getCountryName())){
                e.display();
            }
        }
    }
    
}
        
