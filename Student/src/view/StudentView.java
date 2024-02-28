
package view;

import library.Validation;

public class StudentView {
    private Validation val = new Validation();

    public StudentView() {
    }
    
    public void displayMessage(String message) {
        System.out.println(message);
    }
    
    public String getString(String message) {
        return val.getString(message);
    }
    
    public String getWord(String message) {
        return val.getWord(message);
    }
    
    public Double getDouble(String message){
        return val.checkPositiveNumber(message);
    }
}
