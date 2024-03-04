
package view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import library.Validation;

public class AnalyzeView {
    private Validation val = new Validation();
    
    public void displayMessage(String message) {
        System.out.println(message);
    }
    
    public String getString(String message){
        return val.getString(message);
    }
    
    public void printNumber(HashMap<String,List<Integer>> data){
        for (Map.Entry m : data.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
    
    public void printCharacter(HashMap<String,StringBuilder> data){
        for (Map.Entry m : data.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
