package DayWiseQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,1,2};
        Set<Integer> set = new HashSet<>();
        boolean isDuplicateExist=false;
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                isDuplicateExist=true; //observe
                System.out.println(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
        if(!isDuplicateExist){
            System.out.println(-1);
        }
    }
}
