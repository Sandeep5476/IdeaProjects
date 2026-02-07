package collegeCollections;

import java.util.HashSet;

public class CollectionsDemo {
    public static void main(String[] args) {
        HashSet<Integer> studentId = new HashSet<>();
        HashSet<String> studentId1 = new HashSet<>();
        studentId1.add("sandeep");
        studentId1.add("Sameer");
        studentId.add(1);
        studentId.add(2);
        studentId.add(3);
        System.out.println("Student Ids are: "+studentId);
        int size = studentId.size();
        System.out.println("The size of the set is: "+size);
        System.out.println("The clone of a set is: "+studentId.clone());
//        studentId.clear();
//        System.out.println(studentId.size());
        System.out.println(studentId.contains(3));
        studentId.remove(3);
        System.out.println(studentId);
        System.out.println(studentId1);
        System.out.println(studentId.size());
       Boolean b= studentId.retainAll(studentId1);
        System.out.println(b);
        System.out.println(studentId);


    }
}
