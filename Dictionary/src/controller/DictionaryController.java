
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
    }
    
    public void addWord(String eng, String vi){
        if(data.containsKey(eng)){
            String check = view.getInfo("Word has existed since then\nWant to update the mean of word(Y/N)");
            if(check.equals("Y")){
                data.replace(eng, vi);
                model.setDictionary(data);
                view.displayRedMessage("Update Successful!!!");
                System.err.flush();
            }else{
                view.displayRedMessage("No change!!!");
                System.err.flush();
            }
        }else{
            data.put(eng, vi);
            model.setDictionary(data);
            view.displayRedMessage("Add Successful!!!");
            System.err.flush();
        }
    }
    
    public void deleteWord(String eng){
        if(data.containsKey(eng)){
            data.remove(eng);
            model.setDictionary(data);
            view.displayRedMessage("Delete Successful!!!");
            System.err.flush();
        }else{
            view.displayRedMessage("Don't find " + eng + " in database!!!");
            System.err.flush();
        }
    }
    
    public String translate(String eng){
        if(data.containsKey(eng)){
            return data.get(eng);
        }else{
            return "Not found in database!!!";
        }
    }
    
    public void run(){
        view.setController(this);
        view.run();
        model.updateDatabase();
        System.exit(0);
    }
}
