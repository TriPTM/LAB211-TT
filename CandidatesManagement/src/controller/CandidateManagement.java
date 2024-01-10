
package controller;

import java.util.ArrayList;
import model.Experience;
import model.Fresher;
import model.Internship;
import view.Menu;
import view.Utils;

public class CandidateManagement extends Menu{
    private static String[] mc={"Experience","Fresher","Internship","Searching","Exit"};
    private ListCandidate list;
    private int type;

    public CandidateManagement() {
        super("CANDIDATE MANAGEMENT SYSTEM",mc);
        list=new ListCandidate();
    }
    
    public static void main(String[] args) {
        new CandidateManagement().run();
    }
    
    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: type=0;add();break;
            case 2: type=1;add();break;
            case 3: type=2;add();break;
            case 4: break;
            case 5: System.exit(0);
        }
    }
    
    public void add(){
        String fName=Utils.getString("Enter first name");
        String lName=Utils.getString("Enter last name");
        String address=Utils.getString("Enter address");
        String phone=Utils.getString("Enter phone");
        String email=Utils.getString("Enter email");
        String bDate=Utils.getString("Enter bDate");
        switch(type){
            case 0: int yearEx=Utils.getInt("Enter year experience");
                    ArrayList<String> proSkill = new ArrayList<>();
                    do{
                        proSkill.add(Utils.getString("Enter your skill"));
                        String checked=Utils.getString("Want more to enter(Enter Y)");
                        if(!checked.equals("Y")){
                            break;
                        }
                    }while(true);
                    list.addExperience(new Experience(yearEx,proSkill,fName,lName,address,phone,email,bDate));
                    break;
            case 1: String graduationRank=Utils.getString("Enter your graduation rank");
                    String education=Utils.getString("Enter your university graduated");
                    String graduationDate=Utils.getString("Enter graduated time");
                    list.addFresher(new Fresher(graduationRank,education,graduationDate,fName,lName,address,phone,email,bDate));
                    break;
            case 2: String major = Utils.getString("Enter your major");
                    String semester= Utils.getString("Enter ypur semester");
                    String university= Utils.getString("Enter your university");
                    list.addInternship(new Internship(major,semester,university,fName,lName,address,phone,email,bDate));
                    break;
        }
    }
    
    public void search(){
        
    }
  
}
