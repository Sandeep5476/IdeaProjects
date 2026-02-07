package JLJavaCollections.HashMap;

import java.util.*;

//collection view set methods are keySet(),entrySet(),
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        HashMap<Integer,String> studentData = new HashMap<>();
        studentData.put(1,"student1");
        studentData.put(2,"student2");
        studentData.put(3,"student3");
        map.put(10,"Rahul");
        map.put(11,"sandeep");
        map.put(8,"ravu ramesh");
        //System.out.println(map);
//        map.putAll(studentData);
//        System.out.println(map);
        //map.forEach((k,v)-> System.out.println("key: "+k+" value: "+v));

        //below for each loop it is not recommended to use bcoz it gives cm exception
        /*  for(Integer key: keyset){
             if(key==2){
                System.out.println(keyset.remove(key));
             }
        }   */

        /*
        System.out.println("Iterating through key set");
        Set<Integer> keyset=map.keySet();
        Iterator<Integer> itr = keyset.iterator();
        while(itr.hasNext()){
            int k=itr.next();
            if(k==2){
                itr.remove();
            }
        }
      //  System.out.println(map);
       */




        //demo of entry set
        System.out.println("Iterate through entrySet");
        Set< Map.Entry<Integer,String> > entries = map.entrySet();
        //System.out.println(entries);
        Iterator<Map.Entry<Integer,String>> itr1 = entries.iterator();
        while (itr1.hasNext()){
            Map.Entry<Integer,String> entry = itr1.next();
            if(entry.getKey() == 8){
                itr1.remove();
            }
        }
        System.out.println(map);

        //sorting the hashmap
        System.out.println("Sorting the hashmap...");
        List<Map.Entry<Integer,String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());
        LinkedHashMap<Integer,String> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,String> entry:list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println(sortedMap);


        /* using of for each it internally calls iteror() so it gives concurrent modification excepiton


        for(Map.Entry<Integer,String> entry :entries){
            if(entry.getKey() == 3){
                entry.setValue("randyortaan");
                //map.remove(3); gives cm exception
            }
            //System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        System.out.println(map);

         */

        //using values()
        Collection<String> values = map.values();
        Iterator<String> itr2 = values.iterator();
        while(itr2.hasNext()){
            String value= itr2.next();
            if(value.startsWith("S")){
                itr2.remove();
            }
        }
        System.out.println(map);
        System.out.println(values);

    }
}
