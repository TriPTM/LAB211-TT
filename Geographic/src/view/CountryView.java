
package view;

import Library.Utils;
import controller.EastAsiaCountriesController;
import java.util.ArrayList;
import model.EastAsiaCountries;

public class CountryView {
    private EastAsiaCountriesController cList = new EastAsiaCountriesController();
    private Utils ut = new Utils();
    
    public void inputInfo(){
        String code,name,terrain;
        float total;
        while(true){
            while(true){
                code=ut.getWord("Enter code of country");
                if(code.equals("")){
                    System.out.println("The code contains only letters");
                }else   break;
            }
            
            while(true){
                name=ut.getWord("Enter name of country");
                if(name.equals("")){
                    System.out.println("The name contains only letters");
                }else   break;
            }
            
            while(true){
                try{
                total=ut.getNumber("Enter total Area");
                break;
                }catch(Exception ex){
                    System.out.println(ex.getMessage());
                }              
            }
            
            while(true){
                terrain=ut.getWord("Enter terrain of country");
                if(terrain.equals(""))  System.out.println("The terrain contains only letters");
                else break;
            }
            
            try{
                cList.addCountryInformation(new EastAsiaCountries(terrain,code,name,total));
                System.out.println("Added!!!");
                break;
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public void display(){
        ArrayList<EastAsiaCountries> rs = cList.getRecentlyEnteredInformation();
        print(rs);
    }
    
    public void search(){
        String name=ut.getString("Enter the name you want to search for");
        ArrayList<EastAsiaCountries> rs= cList.search(p->p.getCountryName().contains(name));
        print(rs);
    }
    
    public void displayAsc(){
        ArrayList<EastAsiaCountries> rs = cList.sortInformationByAscendingOrder();
        print(rs);
    }
    
    public void print(ArrayList<EastAsiaCountries> rs){
        if(rs.isEmpty()){
            System.out.println("============================= No infomation ==============================");
        }else{
            System.out.println(String.format("%-10s%-25s%-20s%-25s","ID","Name","Total Area","Terrain"));
            for(EastAsiaCountries country:rs){
                country.display();
            }
        }
    }
}
