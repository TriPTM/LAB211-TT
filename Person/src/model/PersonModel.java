
package model;

public class PersonModel {
    private Person[] model = new Person[3];

    public PersonModel() {
    }

    public Person[] getModel() {
        return model;
    }

    public void setModel(Person[] model) {
        this.model = model;
    }
        
    public Person inputPersonInfo (String name, String address, double salary){
        return new Person(name,address,salary);
    }
    
    public void displayPersonInfo (Person person){
        System.out.println("Information of Person you have entered:");
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Salary: " + person.getSalary());
        System.out.println("");
    }
    
    public Person[] sortBySalary(Person[] person){
        int i, j, n=person.length;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (person[j].getSalary() > person[j + 1].getSalary()) {
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
