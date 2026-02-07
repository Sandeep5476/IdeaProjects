package ConstructorCodingExercises;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    //creating getter methods for all the fields
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }

}
