package JLJavaCollections.HashMap;

public class Student {
    int rollNo;
    String name;
    int age;
    double marks;
    String address;
    Student(int rollNo,String name,int age,double marks,String address){
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        this.marks=marks;
        this.address=address;
    }

    @Override
    public String toString() {
        return "[ "+rollNo+" "+name+" "+age+" "+marks+" "+address+" ]";
    }
}
