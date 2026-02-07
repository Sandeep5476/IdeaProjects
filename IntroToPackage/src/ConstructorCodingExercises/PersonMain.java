package ConstructorCodingExercises;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("sandeep",22,'M');
        System.out.println("Name: "+p1.getName());
        System.out.println("Age: "+p1.getAge());
        System.out.println("Gender: "+p1.getGender());
    }
}
