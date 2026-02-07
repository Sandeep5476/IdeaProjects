package JLJavaCollections.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapDemoCustomObjects {
    public static void main(String[] args) {
        HashMap<Integer,Student> map = new HashMap<>();
        Student s1 = new Student(10,"Sandeep",20,89.67,"ap");
        Student s2 = new Student(11,"Raj",22,69.67,"mp");
        Student s3 = new Student(1,"sam",26,79.67,"delhi");

        List<Student> list = List.of(s1,s2,s3);
        for(Student s: list){
            map.put(s.rollNo,s);
        }
        System.out.println(map);
        System.out.println("--------------------------------------------------------");
        System.out.println("Using forEach()");
        map.forEach((k,v)-> System.out.println("key: "+k+" value: "+v));
        System.out.println("--------------------------------------------------------");
        map.putIfAbsent(111,new Student(1,"rathod",25,80,"rajasthan"));
        map.forEach((k,v)-> System.out.println("key: "+k+" value: "+v));
        System.out.println("--------------------------------------------------------");
        Set<Integer> keys = map.keySet();
        System.out.println(keys);
        Collection<Student> values = map.values();
        System.out.println(values);

    }
}
