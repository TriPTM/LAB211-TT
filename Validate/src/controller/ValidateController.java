
package controller;

import model.ValidateModel;
import view.ValidateView;

public class ValidateController {
    private ValidateModel model;
    private ValidateView view;

    public ValidateController(ValidateModel model, ValidateView view) {
        this.model = model;
        this.view = view;
    }
    
    public void run(){
        view.displayMessage("====== Validate Progaram ======");
        String phone , email, date;
        while(true){
            phone = view.getString("Phone number");
            phone = model.getPhone(phone);
            if(phone.length() == 10){
                break;
            }else {
                view.displayRedMessage(phone);
                System.err.flush();
            }
        }
        
        while(true){
            email = view.getString("Email");
            email = model.getEmail(email);
            if(email.equals("Email must is correct format")){
                view.displayRedMessage(email);
                System.err.flush();
            }else break;
        }
        
        while(true){
            date = view.getString("Date");
            date = model.getDate(date);
            if(date.length() == 10){
                break;
            }else {
                view.displayRedMessage(date);
                System.err.flush();
            }
        }
    }
}
