
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import library.Validation;

public class Task {
    private String ID, name, typeID;
    private LocalDate date;
    private double timeStart, timeEnd;
    private String assignee, reviewer;
    private static int count = 0;
    private Validation val = new Validation();

    public Task() {
    }

    public Task(String name, String typeID, String date, double timeStart, double timeEnd, String assignee, String reviewer) {
        if(!val.checkType(typeID))  throw new RuntimeException("TaskTypeID must exist (1-4)");
        else    this.typeID = getDataTypeID(typeID);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try{
            this.date = LocalDate.parse(date,formatter);
        }catch (DateTimeParseException e) {
            throw new RuntimeException("Date must be in correct format (dd-MM-yyyy)");
        }
        if(timeStart >= timeEnd)    throw new RuntimeException("Plan From must be less than Plan To");
        this.name = name;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.assignee = assignee;
        this.reviewer = reviewer;
        this.ID = "T" + String.valueOf(++count);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public String getDate() {
        return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(date);
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(double timeStart) {
        this.timeStart = timeStart;
    }

    public double getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(double timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Task.count = count;
    }
    
    public String getDataTypeID(String typeID){
        int type = Integer.parseInt(typeID);
        if(type == 1)   return "Code";
        if(type == 2)   return "Test";
        if(type == 3)   return "Design";
        else return "Review";
    }
}
