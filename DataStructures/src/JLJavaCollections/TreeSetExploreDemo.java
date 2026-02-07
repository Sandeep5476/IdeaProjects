package JLJavaCollections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExploreDemo {
    public static void main(String[] args) {
        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(23);
        ns.add(11);
        ns.add(19);
        ns.add(7);
        ns.add(5);
        System.out.println(ns);
        NavigableSet<Integer> nsh=ns.headSet(11,true);
        System.out.println(nsh);
        NavigableSet<Integer> nst=ns.tailSet(11,true);
        System.out.println(nst);
        NavigableSet<Integer> subset1= ns.subSet(7,true,23,true);
        System.out.println(subset1);
//        SortedSet<Integer> hs= ns.headSet(11);//in sortedSet it is not inclusive but in navigableSet it is inclusive
//        System.out.println(hs);
//        SortedSet<Integer> ts = ns.tailSet(11);
//        System.out.println(ts);
//        System.out.println(ns.ceiling(19));
//        System.out.println(ns.higher(19));
//        System.out.println(ns.lower(19));
//        System.out.println(ns.floor(19));
//        System.out.println(ns.pollFirst());
//        System.out.println(ns.pollLast());
//        SortedSet<Integer> subset = ns.subSet(5,23);
//        subset.add(18);
//        System.out.println(subset);
//        System.out.println(ns);
//        ns.add(16);
//        System.out.println(subset);

    }
}
