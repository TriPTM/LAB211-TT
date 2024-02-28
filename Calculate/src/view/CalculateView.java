
package view;

import library.Validation;

public class CalculateView {
    private Validation val = new Validation();

    public CalculateView() {
    }
    
    public void displayMessage(String message) {
        System.out.println(message);
    }
    
    public Double getDouble(String message){
        return val.checkPositiveNumber(message);
    }
}
