
package model;

public class Person {
    private String name, address;
    private double salary;

    public Person() {
    }

    public Person(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public Person inputPersonInfo (String name, String address, String salary){
        
    }
    
    public void displayPersonInfo (Person person){
        System.out.println("Information of Person you have entered:");
        System.out.println("Name: " + person.name);
        System.out.println("Address: " + person.address);
        System.out.println("Salary: " + person.salary);
    }
    
    public Person[] sortBySalary(Person[] person){
        int i, j, n=person.length;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (person[j].salary > person[j + 1].salary) {
                    swap(person,j,j+1);
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        return person;
    }
        
    public void swap(Person[] person, int i, int j) {
        Person temp = person[i];
        person[i] = person[j];
        person[j] = temp;
    }
    
}
