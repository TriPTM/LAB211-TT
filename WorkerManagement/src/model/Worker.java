
package model;

public class Worker {
    protected String id,name,workLocation;
    protected int age;
    protected double salary;
    private static int count=0;

    public Worker() {
    }

    public Worker(String id, String name, String workLocation, int age, double salary) {
        this.id = id;
        this.name = name;
        this.workLocation = workLocation;
        this.age = age;
        this.salary = salary;
    }

    public Worker(String name, String workLocation, int age, double salary) {
        this.name = name;
        this.workLocation = workLocation;
        this.age = age;
        this.salary = salary;
        this.id="W"+String.valueOf(++count);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Worker.count = count;
    }
    
}
