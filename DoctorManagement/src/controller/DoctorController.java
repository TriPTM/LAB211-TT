
package controller;

import java.util.HashMap;
import model.Doctor;

public class DoctorController {
    private HashMap<String,Doctor> dList=new HashMap<>();
    
    public void addDoctor(Doctor a)throws Exception{
        if(dList==null){
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
        if(dList==null){
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
        if(dList==null){
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
        if(dList==null){
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
}
