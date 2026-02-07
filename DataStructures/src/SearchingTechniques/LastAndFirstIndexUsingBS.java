package SearchingTechniques;

import java.util.Arrays;

public class LastAndFirstIndexUsingBS {
    static int firstOccurrence(int[] nums,int target){
        int low=0,high=nums.length-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid] == target){
                first=mid;
                high=mid-1;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return first;
    }
    static int lastOccurrence(int[]nums,int target){
        int low=0,high=nums.length-1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }else if(nums[mid] > target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return last;
    }
    static int[] firstAndLastIndex(int[] nums,int target){
        int[] result={-1,-1};
        int first=firstOccurrence(nums,target);
        if(first == -1){
            return result; //return new int[]{-1,-1};
        }
        return new int[]{first,lastOccurrence(nums,target)};
    }
    public static void main(String[] args) {
        int[] arr= new int[]{1,3,3,3,3,3,3,5,7};
        int key=3;
        int[] answer=firstAndLastIndex(arr,key);
        System.out.println(Arrays.toString(answer));

    }
}
