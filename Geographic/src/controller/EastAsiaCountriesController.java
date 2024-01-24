
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import model.EastAsiaCountries;

public class EastAsiaCountriesController extends ArrayList<EastAsiaCountries> {
    public void addCountryInformation(EastAsiaCountries country){
        for(EastAsiaCountries a:this){
            if(a.getCountryName().equals(country.getCountryName())) throw new RuntimeException("Error -- had "+a.getCountryName()+" in system!!!");
        }
        this.add(country);
    }
    
    public ArrayList<EastAsiaCountries> getRecentlyEnteredInformation(){
        return this;
    }
    
    public ArrayList<EastAsiaCountries> search(Predicate<EastAsiaCountries> p){
        ArrayList<EastAsiaCountries> rs= new ArrayList<EastAsiaCountries>();
        for(EastAsiaCountries a:this){
            if(p.test(a))   rs.add(a);
        }
        return rs;
    }
    
    public ArrayList<EastAsiaCountries> sortInformationByAscendingOrder(){
        ArrayList<EastAsiaCountries> sort= new ArrayList<EastAsiaCountries>();
        for(EastAsiaCountries country:this){
            sort.add(country);
        }
        Collections.sort(sort);
        return sort;
    }
}
