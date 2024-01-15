
package Library;

import controller.*;

public class Validation {
    public boolean checkCourse(String course) {
        String[] courses={"Java",".Net","C/C++"};
        for(String a:courses){
            if(a.equals(course))    return true;
        }
        return false;
    }
}
