package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Trial {
    static int[] findCommon(int[] arr1,int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    if(!list.contains(arr1[i])){
                       list.add(arr1[i]);
                    }
                }
            }
        }
        int[] result = new int[list.size()];
        for(int i=0;i<result.length;i++){
            result[i]= list.get(i);
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,4,9};
        int[] arr2={1,2,3,4,9};
        int[] ans= findCommon(arr1,arr2);
        System.out.println(Arrays.toString(ans));

    }
}
