
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentModel {
    private List<Student> model = new ArrayList<Student>();

    public StudentModel() {
    }

    public List<Student> getModel() {
        return model;
    }

    public void setModel(List<Student> model) {
        this.model = model;
    }
    
    public void addData(String name, String classes, double mark){
        model.add(new Student(name,classes,mark));
    }
    
    public List<Student> sortStudent(List<Student> data){
        Collections.sort(data);
        return data;
    }
}
