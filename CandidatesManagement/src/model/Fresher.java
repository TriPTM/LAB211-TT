package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fresher extends Candidate {
    private String graduationRank,education;
    private LocalDate graduationDate;
    private static int count=1000;

    public Fresher(String fName, String lName, String address, String phone, String email, String bDate) {
        super(fName, lName, address, phone, email, bDate);
        this.setId("F"+String.valueOf(++count));
    }

    public Fresher(String graduationRank, String education, String graduationDate, String fName, String lName, String address, String phone, String email, String bDate) {
        super(fName, lName, address, phone, email, bDate);
        this.graduationRank = graduationRank;
        this.education = education;
        this.graduationDate = LocalDate.parse(graduationDate, DateTimeFormatter.ofPattern("dd/MM/yy"));
        this.setId("F"+String.valueOf(++count));
    }

    public Fresher(String graduationRank, String education, String graduationDate, String fName, String lName, String address, String phone, String email, int type, String bDate) {
        super(fName, lName, address, phone, email, type, bDate);
        this.graduationRank = graduationRank;
        this.education = education;
        this.graduationDate = LocalDate.parse(graduationDate, DateTimeFormatter.ofPattern("dd/MM/yy"));
        this.setId("F"+String.valueOf(++count));
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGraduationDate() {
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(graduationDate);
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }
    
    @Override
    public String toString() {
        return this.getId()+": " + this.getfName()+" "+this.getlName();
    }
    
}
