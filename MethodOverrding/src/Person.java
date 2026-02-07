public class Person {
    protected String name;
    private String address;
    private long phoneNo;

    //below are the constructors with different parameters
    public Person(){
        System.out.println("Person constructor called");
    }
    public Person(String name){
        this.name=name;
    }
    public Person(String name, String address){
        this.name=name;
        this.address=address;
       // System.out.println("constructor of 2 arguments is called");
    }

    //display method
    public void display(){
        System.out.println(name+" is a person.");
    }

    // below are the getter and setter methods
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
}
