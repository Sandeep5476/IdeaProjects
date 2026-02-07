package collegeCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<String> ll = new LinkedList<>();
        ll.offer("Customer1");
        ll.offer("Customer2");
        ll.offer("Customer3");
        System.out.println(ll);
        System.out.println("Serving: "+ll.poll());
        System.out.println("Remaining: "+ll);
        System.out.println("Next: "+ll.poll());
        System.out.println("Final: "+ll);
    }
}
