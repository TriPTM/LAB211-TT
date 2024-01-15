
package view;

import Library.Utils;
import Library.Validation;
import java.util.ArrayList;
import model.Student;

public class StudentView {
    private Validation val= new Validation();
    private Utils ut = new Utils();
    
    public void create(){
        while(true){
            String name =ut.getString("Enter name");
            String semester= ut.getString("Enter semester");
            String course;
            while(true){
                System.out.println("--------COURSE--------");
                System.out.println("Java");
                System.out.println(".Net");
                System.out.println("C/C++");
                course = ut.getString("Enter course");
                if(!val.checkCourse(course)){
                    System.out.println("No find course!!!");
                    System.out.println("Try again");
                }else   break;
            }
            MainMenu.sList.add(new Student(name,semester,course));
            String checked=ut.getString("Do you want to continue (Y/N)");
            checked=checked.toUpperCase();
            if(!checked.equals("Y")){
                break;
            }
        }
    }
    
    public void findAndSort(){
        String name = ut.getString("Enter name want to find");
        ArrayList<Student> list=MainMenu.sList.search(p->p.getName().contains(name));
        if(list.size()>0)   System.out.println("--------Result--------");
        else    System.out.println("Not found!!!");
        for(Student a:list){
            System.out.println(a);
        }
        
    }
    
    public void updateOrDelete(){
        String id = ut.getString("Enter id");
        id=id.toUpperCase();
        for(Student a:MainMenu.sList){
            if(a.getId().equals(id)){
                String checked=ut.getString("Do you want to update (U) or delete (D) student");
                checked=checked.toUpperCase();
                if(checked.equals("D"))     MainMenu.sList.delete(id);
                else if(checked.equals("U")) {
                    String name =ut.getString("Enter name");
                    String semester= ut.getString("Enter semester");
                    String course= ut.getString("Enter course");
                    MainMenu.sList.update(id, name, semester, course);
                }else{
                    System.out.println("Wrong input!!!");
                }
                return;
            }
        }
        System.out.println("Not found!!!");
    }
    
}
