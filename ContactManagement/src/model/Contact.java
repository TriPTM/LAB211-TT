
package model;

public class Contact {
    private int id;
    private String fullname, group, address, phone, firstname, lastname;
    private static int count=0;

    public Contact() {
    }

    public Contact(int id, String fullname, String group, String address, String phone, String firstname, String lastname) {
        this.id = id;
        this.fullname = fullname;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Contact(String fullname, String group, String address, String phone, String firstname, String lastname) {
        this.fullname = fullname;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.firstname = firstname;
        this.lastname = lastname;
        this.id=++count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
}
