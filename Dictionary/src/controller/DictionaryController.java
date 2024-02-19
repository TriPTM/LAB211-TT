
package controller;

import java.util.HashMap;
import model.Dictionary;
import view.MainMenu;

public class DictionaryController {
    private Dictionary model;
    private MainMenu view;
    private HashMap<String,String> data;

    public DictionaryController(Dictionary model, MainMenu view) {
        this.model = model;
        this.view = view;
        model.loadData();
        data = model.getDictionary();
    }
    
    public void addWord(String eng, String vi){
        if(checkWordExist(eng,vi)){
            
        }else{
            data.put(eng, vi);
            model.setDictionary(data);
        }
    }
    
    public void deleteWord(String eng){
        if(data.containsKey(eng)){
            data.remove(eng);
            model.setDictionary(data);
        }else{
            
        }
    }
    
    public String translate(String eng){
        if(data.containsKey(eng)){
            return data.get(eng);
        }else{
            return "";
        }
    }
    
    public boolean checkWordExist(String end, String vi){
        return false;
    } 
    
}
