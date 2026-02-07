package JLJavaCollections.HashMap;

import java.util.HashMap;
import java.util.Map;

//without writing custom objects in a separate class simply we can use nested HashMap
public class NestedHashMap {
    public static void main(String[] args) {
        Map<Integer, Map<String,Object>> map = new HashMap<>();

        Map<String,Object> studentData1 = new HashMap<>();
        studentData1.put("name","sandeep");
        studentData1.put("age",25);
        studentData1.put("marks",99.76);
        studentData1.put("Address","Delhi");
        map.put(11,studentData1);

        Map<String,Object> studentData2 = new HashMap<>();
        studentData2.put("name","raju");
        studentData2.put("age",25);
        studentData2.put("marks",89.76);
        studentData2.put("Address","Delhi");
        map.put(11,studentData1);
        map.put(12,studentData2);

        //map.forEach((k,v)-> System.out.println(k+" "+v));
        for (Map.Entry<Integer,Map<String,Object> > entry : map.entrySet()){
            System.out.println("RollNo: "+entry.getKey());
            System.out.println("Details: "+entry.getValue());
        }
        System.out.println("Accessing marks of sandeep");
        double marks = (double) map.get(11).get("marks");//marks are of type Object so type cast is required.
        System.out.println(marks);

        map.get(11).put("marks",100);
        map.get(11).put("Address","India");
        System.out.println(map.get(11));
    }
}
