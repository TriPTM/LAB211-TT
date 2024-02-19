
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalaryHistory extends Worker implements Comparable<SalaryHistory>{
    private String status;
    private String date;

    public SalaryHistory() {
    }

    public SalaryHistory(String status, String id, String name, String workLocation, int age, double salary) {
        super(id, name, workLocation, age, salary);
        this.status = status;
        LocalDate time = LocalDate.now();
        this.date = time.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public SalaryHistory(String status, String name, String workLocation, int age, double salary) {
        super(name, workLocation, age, salary);
        this.status = status;
        LocalDate time = LocalDate.now();
        this.date = time.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public int compareTo(SalaryHistory o) {
        return this.id.compareTo(o.id);
    }
    
}
