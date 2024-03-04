
package library;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class Validation {
    public String checkPhone(String phone){
        if (!Pattern.matches("\\d+", phone)) {
            return "Phone number must be numbers.";
        } else if (phone.length() != 10) {
            return "Phone number must contain 10 digits.";
        }
        return phone;
    }
    
    public String checkEmail(String email){
        if (email.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            return email;
        }else {
            return "Email must is correct format";
        }
    }
    
    public String checkDate(String date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date);
            return date;
        } catch (Exception e) {
            if(date.matches("\\d{2}/\\d{2}/\\d{4}")){
                return "Did not exist that day!!!";
            }else return "Date must be in correct format (dd/MM/yyyy).";
        }
    }
    
}
