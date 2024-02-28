
package view;

import library.Validation;

public class PersonView {
    private Validation val = new Validation();  
    
    public void displayMessage(String message) {
        System.out.println(message);
    }
    
    public Double getDouble(String message){
        return val.checkPositiveNumber(message);
    }
}
