package OneDArrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,5,3};
        Set<Integer> uniquenumber= new HashSet<>();
        boolean isDuplicate = false;
        for(int i=0;i<arr.length;i++){
            if(uniquenumber.contains(arr[i])){
                isDuplicate=true;
                System.out.println("Duplicate element: "+arr[i]);
            }else{
                uniquenumber.add(arr[i]);
            }
        }
        if(!isDuplicate){
            System.out.println(-1);
        }
        System.out.println(uniquenumber);
    }
}
