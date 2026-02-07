package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Lc1 {
    static int[] findIndex(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            int x=nums[i];
            int reqNum=target-x;
            if(map.containsKey(reqNum)){
                int index=map.get(reqNum);
                return new int[]{index,i};
            }
            map.put(x,i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr= {2,7,11,15};
        int target=22;
        System.out.println(Arrays.toString(findIndex(arr,target)));
    }
}
