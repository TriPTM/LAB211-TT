package model;

import java.util.ArrayList;

public class Experience extends Candidate {
    private int yearEx;
    private ArrayList<String> proSkill;
    private static int count =1000;

    public Experience() {
    }

    public Experience(String fName, String lName, String address, String phone, String email, String bDate) {
        super(fName, lName, address, phone, email, bDate);
        this.setId("E"+String.valueOf(++count));
    }

    public Experience(int yearEx, ArrayList<String> proSkill, String fName, String lName, String address, String phone, String email, String bDate) {
        super(fName, lName, address, phone, email, bDate);
        this.yearEx = yearEx;
        this.proSkill = proSkill;
        this.setId("E"+String.valueOf(++count));
    }

    public Experience(int yearEx, ArrayList<String> proSkill, String fName, String lName, String address, String phone, String email, int type, String bDate) {
        super(fName, lName, address, phone, email, type, bDate);
        this.yearEx = yearEx;
        this.proSkill = proSkill;
        this.setId("E"+String.valueOf(++count));
    }

    public int getYearEx() {
        return yearEx;
    }

    public void setYearEx(int yearEx) {
        this.yearEx = yearEx;
    }

    public ArrayList<String> getProSkill() {
        return proSkill;
    }

    public void setProSkill(ArrayList<String> proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return this.getId()+": " + this.getfName()+" "+this.getlName();
    }
    
}
