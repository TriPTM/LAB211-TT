
package view;

import controllers.CandidateManager;
import controllers.Validation;

public class Search {
    private CandidateManager c = new CandidateManager();
    private Validation val = new Validation();
    public Search() {
        String name;
        int type;
        
        System.out.print("Name: ");
        name = val.inputString();
        
        while (true) {            
            System.out.print("Type (1,2,3)  : ");
            type = val.inputNum();
            if ((type < 1) || (type > 3)) {
                System.out.println("-------------");
                System.out.println("NOT FOUND!!");
                System.out.println("-------------");
            } else {
                break;
            }
        }
        
        c.search(name, type);
    }
    
}
