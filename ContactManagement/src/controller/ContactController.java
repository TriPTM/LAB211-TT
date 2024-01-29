
package controller;

import java.util.ArrayList;
import model.Contact;

public class ContactController {
    private ArrayList<Contact> cList= new ArrayList<Contact>();

    public ArrayList<Contact> getcList() {
        return cList;
    }

    public void setcList(ArrayList<Contact> cList) {
        this.cList = cList;
    } 
    
    public void addContact(Contact a){
        for(Contact c:cList){
            if(c.getId()==a.getId()){
                System.err.println("Has ID - Can't add!!!");
                System.err.flush();
                return;
            }
        }
        cList.add(a);
        System.err.println("Successful!!!");
        System.err.flush();
    }
    
    public void deleteContact(int id){
        for(Contact c:cList){
            if(c.getId()==id){
                cList.remove(c);
                System.err.println("Successful!!!");
                System.err.flush();
                return;
            }
        }
        System.err.println("No found contact");
        System.err.flush();
    }
}
