package SearchingTechniques;

import java.util.Arrays;

//finding last and first index in an array of given element
public class LastAndFirstIndexUsingLS {
    static int[] lastAndFirstIndex(int[] nums,int target){
        int[] result={-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
               if(result[0] == -1){
                   result[0]=i;
               }
               result[1]=i;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,3,3,3,3,3,3,5,7};
        int target=3;
        int[] answer=lastAndFirstIndex(arr,target);
        System.out.println(Arrays.toString(answer));
    }
}
