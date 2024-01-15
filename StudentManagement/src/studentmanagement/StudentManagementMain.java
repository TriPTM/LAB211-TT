
package studentmanagement;

import model.Student;
import view.MainMenu;

public class StudentManagementMain {

    public static void main(String[] args) {
//        new MainMenu().run();
        MainMenu ms= new MainMenu();
        Student b= new Student("Tri","Spring","Java");
        Student c= new Student("Nhi","Spring",".Net");
        Student d= new Student("Thien","Spring","C/C++");
        Student e= new Student("Quang","Spring","C/C++");
        Student f= new Student("Huy","Spring",".Net");
        Student g= new Student("Tri","Spring","Java");
        Student h= new Student("Tri","Spring","Java");
        Student m= new Student("Hai","Spring","Java");
        MainMenu.sList.add(b);
        MainMenu.sList.add(c);
        MainMenu.sList.add(d);
        MainMenu.sList.add(e);
        MainMenu.sList.add(f);
        MainMenu.sList.add(g);
        MainMenu.sList.add(h);
        MainMenu.sList.add(m);
        ms.run();
    }
    
}
