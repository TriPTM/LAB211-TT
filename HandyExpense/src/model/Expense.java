
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import library.Validation;

public class Expense {
    private int id;
    private LocalDate date;
    private int amount;
    private String content;
    private static int count =0;
    private Validation val = new Validation();

    public Expense() {
    }

    public Expense(String date, int amount, String content) {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try{
            this.date = LocalDate.parse(date,formatter);
        }catch (DateTimeParseException e) {
            throw new RuntimeException("Date must be in correct format (dd/MM/yyyy)");
        }
        this.amount = amount;
        this.content = content;
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return DateTimeFormatter.ofPattern("dd-MMM-yyyy").format(date);
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
}
