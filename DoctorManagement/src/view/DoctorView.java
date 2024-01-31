
package view;

import Library.Validation;
import controller.DoctorController;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Doctor;

public class DoctorView {
    private Validation val= new Validation();
    private DoctorController dList = new DoctorController();
    
    public void addDoctor(){
        System.out.println("--------- Add Doctor ----------");
        String code,name,specialization;
        code= val.getString("Enter Code");
        
        while(true){
            name= val.getWord("Enter Name");
            if(name.equals("")){
                System.err.println("Name just contains character");
                System.err.flush();
            }else   break;
        }
        
        while(true){
            specialization= val.getWord("Enter Specialization");
            if(specialization.equals("")){
                System.err.println("Specialization just contains character");
                System.err.flush();
            }else   break;
        }
        int availability;
        while(true){
            availability = val.changeNullNumber("Enter Availability");
            if(!val.checkAvailability(availability)){
                System.err.println("Availability must be >=0");
                System.err.flush();
            }else   break;
        }
        try {
            dList.addDoctor(new Doctor(code,name,specialization,availability));
            System.err.flush();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            System.err.flush();
        }
    }
    
    public void updateDoctor(){
        System.out.println("--------- Update Doctor -------");
        String code,name,specialization;
        code= val.getString("Enter Code");
        
        while(true){
            name= val.getWord("Enter Name");
            if(name.equals("")){
                System.err.println("Name just contains character");
                System.err.flush();
            }else   break;
        }
        
        while(true){
            specialization= val.getWord("Enter Specialization");
            if(specialization.equals("")){
                System.err.println("Specialization just contains character");
                System.err.flush();
            }else   break;
        }
        
        int availability;
        while(true){
            availability = val.changeNullNumber("Enter Availability");
            if(!val.checkAvailability(availability)){
                System.err.println("Availability must be >=0");
                System.err.flush();
            }else   break;
        }
        try {
            dList.updateDoctor(new Doctor(code,name,specialization,availability));
            System.err.flush();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            System.err.flush();
        }
    }
    
    public void deleteDoctor(){
        System.out.println("--------- Delete Doctor -------");
        String code=val.getString("Enter code");
        try {
            dList.deleteDoctor(code);
            System.err.flush();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            System.err.flush();
        }
    }
    
    public void searchDoctor(){
        System.out.println("---------- Search Doctor --------");
        String code=val.getString("Enter text");
        System.out.println("------------ Result -------------");
        try {
            HashMap<String,Doctor> list=dList.searchDoctor(code);
            System.out.printf("%-8s%-12s%-25s%-15s\n", "Code", "Name","Specialization", "Availability");
            for(String a :list.keySet()){
                Doctor b = list.get(a);
                System.out.printf("%-8s%-12s%-25s%-15d\n", b.getCode(),b.getName(), b.getSpecialization(),b.getAvailability());  
            }
            
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            System.err.flush();
        }
    }
    
    public void saveData(){
        System.err.println("Saving....");
        System.err.flush();
        dList.loadData("data.dat");
    }
}
