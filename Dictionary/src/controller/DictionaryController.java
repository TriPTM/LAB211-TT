
package controller;

import java.util.HashMap;
import model.Dictionary;
import view.DictionaryView;

public class DictionaryController {
    private Dictionary model;
    private DictionaryView view;
    private HashMap<String,String> data;

    public DictionaryController(Dictionary model, DictionaryView view) {
        this.model = model;
        this.view = view;
        model.loadData();
        data = model.getDictionary();
        view.run();
    }
    
    public void addWord(String eng, String vi){
        if(checkWordExist(eng,vi)){
            String check = view.getInfo("Word has existed since then\nWant to update the mean of word(Yes/No)");
            if(check.equals("Yes")){
                String viet = view.getInfo("Enter new meaning Vietnamese");
//                data.get(eng) = viet;
            }
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
            view.displayMessage("Don't find " + eng + " in database");
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
