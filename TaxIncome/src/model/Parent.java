
package model;

public class Parent extends Person {
    private int numberOfChildrens;

    public Parent() {
    }

    public Parent(int numberOfChildrens) {
        this.numberOfChildrens = numberOfChildrens;
    }

    public Parent(int numberOfChildrens, int age) {
        super(age);
        this.numberOfChildrens = numberOfChildrens;
    }

    public int getNumberOfChildrens() {
        return numberOfChildrens;
    }

    public void setNumberOfChildrens(int numberOfChildrens) {
        this.numberOfChildrens = numberOfChildrens;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
