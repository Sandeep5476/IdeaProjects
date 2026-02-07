package ConstructorInheritance;

public class Person {
    private String name;
    private String address;
    private long phoneNo;

    //default constructor
    public Person(){
        System.out.println("person constructor is being called");
    }
    //1 argument constructor
    public Person(String name){
        this.name=name;
        System.out.println("person constructor of 1 argument is being called");
    }
    //2 argument constructor
    public Person(String name,String address){
        this.name=name;
        this.address=address;
        System.out.println("person constructor of 2 argument is being called");
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

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void greet(){
        System.out.println("hi");
    }


}
