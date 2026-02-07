package ConstructorCodingExercises;

public class Student {
    private String name;
    private String regNo;
    private short rollNo;
    private float marks;
    private String address;
    private long phoneNo;

    public String getName() {
        return name;
    }

    public String getRegNo() {
        return regNo;
    }

    public short getRollNo() {
        return rollNo;
    }

    public float getMarks() {
        return marks;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public Student(String name,String regNo,short rollNo){
        this.name=name;
        this.regNo=regNo;
        this.rollNo=rollNo;
    }
    public Student(String name,String regNo,short rollNo,float marks,String address,long phoneNo){
        this.name=name;
        this.regNo=regNo;
        this.rollNo=rollNo;
        this.marks=marks;
        this.address=address;
        this.phoneNo=phoneNo;
    }
}
