
package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Doctor;

public class DoctorController {
    private HashMap<String,Doctor> dList=new HashMap<>();

    public DoctorController() {
        loadData("data.dat");
    }
    
    public void addDoctor(Doctor a)throws Exception{
        if(dList.size()==0){
            throw new Exception ("Database does not exist") ;
        }
        if(dList.containsKey(a.getCode())){
            throw new Exception("Doctor code " +a.getCode()+" is duplicate");
        }
        if(a==null){
            throw new Exception("Data does not exist");
        }
        dList.put(a.getCode(), a);
        System.err.println("Add Successful!!!");
    }
    
    public void updateDoctor(Doctor a)throws Exception{
        if(dList.size()==0){
            throw new Exception ("Database does not exist") ;
        }
        if(a==null){
            throw new Exception("Data does not exist");
        }
        if(!dList.containsKey(a.getCode())){
            throw new Exception("Doctor code doesn’t exist");
        }
        Doctor b=dList.get(a.getCode());
        if(!a.getName().equals("")) b.setName(a.getName());
        if(!a.getSpecialization().equals("")) b.setSpecialization(a.getSpecialization());
        if(a.getAvailability()<0)  b.setAvailability(a.getAvailability());
        System.err.println("Update successful!!!");
        
    }
    
    public void deleteDoctor(String code)throws Exception{
        if(dList.size()==0){
            throw new Exception ("Database does not exist") ;
        }
        if(code==null){
            throw new Exception("Data does not exist");
        }
        if(!dList.containsKey(code)){
            throw new Exception("Doctor code doesn’t exist");
        }
        dList.remove(code);
         System.err.println("Delete successful!!!");
    }
    
    public HashMap<String,Doctor> searchDoctor(String code) throws Exception{
        if(dList.size()==0){
            throw new Exception ("Database does not exist") ;
        }
        HashMap<String,Doctor> list=new HashMap<>();
        for(String a:dList.keySet()){
            if(a.contains(code)){
                list.put(a, dList.get(a));
            }
        }
        return list;
    }
    
    public void loadData(String fName){
        try {
            Scanner sc=new Scanner(new FileReader(fName));
            while(sc.hasNextLine()){
                String s= sc.nextLine();
                String[] st= s.split(",");
                if(st.length==4){
                    dList.put(st[0],(new Doctor(st[0],st[1],st[2],Integer.parseInt(st[3]))));
                }
            }
            sc.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DoctorController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void saveData(String fName){
        try {
            PrintWriter pw= new PrintWriter(new FileWriter(fName));
            for(String code:dList.keySet()){
                Doctor s=dList.get(code);
                System.out.println(code);
                pw.println((s.getCode())+","+s.getName()+","+s.getSpecialization()+","+s.getAvailability());
            }
            pw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
