package JLJavaCollections;

import java.util.HashSet;
import java.util.Set;

public class JLCollections {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        String str="sandeep";
        String str1="sandeep";
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
    }
}
