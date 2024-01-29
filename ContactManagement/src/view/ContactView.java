
package view;

import Library.Validation;
import controller.ContactController;
import java.util.StringTokenizer;
import model.Contact;

public class ContactView {
    private Validation val= new Validation();
    private ContactController cList = new ContactController();
    
    public void addContact(){
        System.out.println("-------- Add a Contact --------");
        String fullname,group,address;
        while(true){
            fullname= val.getWord("Enter Name");
            if(fullname.equals("")){
                System.err.println("Name just contains character");
                System.err.flush();
            }else   break;
        }
        
        StringTokenizer name = new StringTokenizer(fullname," ");
        String firstname= name.nextToken();
        String lastname="";
        while(name.hasMoreTokens()){
            lastname+=name.nextToken();
        }
        
        while(true){
            group= val.getWord("Enter Group");
            if(group.equals("")){
                System.err.println("Group just contains character");
                System.err.flush();
            }else   break;
        }
        
        while(true){
            address= val.getWord("Enter Address");
            if(address.equals("")){
                System.err.println("Address just contains character");
                System.err.flush();
            }else   break;
        }
        String phone=val.getPhone("Enter Phone");
        cList.addContact(new Contact(fullname,group,address,phone,firstname,lastname));
        System.err.flush();
    }
    
    public void displayContact(){
        System.out.println("--------------------------------- Display all Contact ----------------------------");
        System.out.println(String.format("%-5s%-20s%-15s%-15s%-10s%-12s%-15s", "Id", "Name","First name", "Last name", "Group", "Address", "Phone"));
        for (Contact c : cList.getcList()) {
            System.out.println(String.format("%-5d%-20s%-15s%-15s%-10s%-12s%-15s",c.getId(), c.getFullname(),c.getFirstname(), c.getLastname(),c.getGroup(), c.getAddress(), c.getPhone()));
        }
    }
    
    public void deleteContact(){
        System.out.println("------- Delete a Contact -------");
        int id=val.getNumber("Enter ID");
        cList.deleteContact(id);
    }
}
