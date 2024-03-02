
package view;

import library.Validation;


public class FileView {
    private Validation val = new Validation();
    
    public void displayMessage(String message) {
        System.out.println(message);
    }
    
    public String getString(String message){
        return val.getString(message);
    }
    
    public void displayFolders(String message, String[] folders){
        System.out.print(message);
        for(String a:folders){
            System.out.print("["+a+"] ");
        }
    }
}
