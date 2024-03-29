
package controller;

import Library.Validation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import model.Student;

public class StudentController extends ArrayList<Student> {
    
    private Map<Student, Integer> count= new HashMap<Student, Integer>();
    private Validation val = new Validation();

    public StudentController() {
    }
    
    public ArrayList<Student> search(Predicate<Student> p){
        ArrayList<Student> rs= new ArrayList<Student>();
        for(Student a:this){
            if(p.test(a))   rs.add(a);
        }
        Collections.sort(rs);
        return rs;
    }
    
    public void update(String id, String name, String semester, String course){
        for(Student a:this){
            if(a.getId().equals(id)){
                if(!name.equals(""))  a.setName(name);
                if(!semester.equals(""))  a.setSemester(semester);
                if(!course.equals("")){
                    if(val.checkCourse(course))     a.setCourse(course);
                    else    System.out.println("Wrong course - No update course!!!");
                }
                System.out.println("Updated!!!");
                return;
            }
        }
        System.out.println("Not found!!!");;
    }
    
    public void delete(String id){
        for(Student a:this){
            if(a.getId().equals(id)){
                this.remove(a);
                System.out.println("Removed!!!");
                return;
            }
        }
        System.out.println("Not found!!!");;
    }
    
    public void report(){
        for(Student a:this){
            if(!count.containsKey(a)){
                count.put(a, 1);
            }else{
                count.put(a, ((int)(count.get(a)))+1);
            }
        }
        for(Student a:count.keySet()){
            System.out.println(String.format("%-15s | %-10s | %-5d", a.getName(),a.getCourse(),count.get(a)));
        }
    }

}
