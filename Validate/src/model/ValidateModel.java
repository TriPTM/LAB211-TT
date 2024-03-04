
package model;

import library.Validation;

public class ValidateModel {
    private Validation val = new Validation();

    public ValidateModel() {
    }
    
    public String getPhone(String phone){
        return val.checkPhone(phone);
    }
    
    public String getEmail(String email){
        return val.checkEmail(email);
    }
    
    public String getDate(String date){
        return val.checkDate(date);
    }
}
