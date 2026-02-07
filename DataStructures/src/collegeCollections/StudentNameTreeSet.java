package collegeCollections;

import java.util.TreeSet;

public class StudentNameTreeSet {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("David");
        set.add("Alice");
        set.add("Bob");
        set.add("Charlie");
        set.add("Eve");
        System.out.println("After Adding names: "+set);
        //removing a name
        boolean removed = set.remove("Bob");
        System.out.println("Bob removed: "+removed);
        System.out.println("After removing Bob: "+set);
        //display all names in alphabet
        System.out.println("\nAll students names(sorted)");
        for(String name: set){
            System.out.println("-"+name);
        }
        System.out.println("\nfirst name(alphabetically): "+set.first());
        System.out.println("Last name(alphabetically): "+set.last());
        System.out.println("Size: "+set.size());
    }
}
