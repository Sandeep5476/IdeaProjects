package DayWiseQuestions;

import java.util.*;

public class RemoveDuplicatesFromArray {

    static void removeDuplicateUsingSorting(int[] arr) {
        if (arr.length == 0) return;

        Arrays.sort(arr);
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        // Add last element
        arr[j++] = arr[arr.length - 1];
        // Print only unique elements
        System.out.print("After removing duplicate elements are: ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void usingHashMap(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        int len=arr.length;
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        map.forEach((k,v)-> System.out.print(k+" "));
    }
    static void usingSet(int[] arr){
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }
        System.out.println(st);
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 6, 4, 4, 5};
//        removeDuplicateUsingSorting(arr);
//        usingHashMap(arr);
        usingSet(arr);
    }
}
