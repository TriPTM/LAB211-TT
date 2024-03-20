
package model;

public class Child extends Person {
    private String status;

    public Child() {
    }

    public Child(String status) {
        this.status = status;
    }

    public Child(String status, int age) {
        super(age);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
