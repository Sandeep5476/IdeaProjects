package SearchingTechniques;

import java.util.Arrays;

public class LastAndFirstIndexUsingUBLB {
    static int lowerBound(int[]arr,int key){
        int low=0;
        int high=arr.length-1;
        int lb=arr.length;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(arr[mid] >= key){
                lb=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return lb;
    }
    static int upperBound(int[] arr,int key){
        int low=0,high=arr.length-1;
        int ub=arr.length;
        while(low<=high){
            int mid=low + (high-low)/2;
            if(arr[mid]>key){
                ub=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ub;
    }
    static int[] firstAndLastPosition(int[] nums,int target){
        int[] result={-1,-1};
        int lb=lowerBound(nums,target);
        if(lb == nums.length || nums[lb] != target){
            return result; //return new int[]{-1,-1};
        }
        /*int ub=upperBound(nums,target);
        result[0]=lb;
        result[1]=ub;
        return result;*/
        return new int[]{lb,upperBound(nums,target)-1};
    }

    public static void main(String[] args) {
        int[] arr= new int[]{1,3,3,3,3,3,3,3,5,7};
        int key=3;
        int[] answer=firstAndLastPosition(arr,key);
        System.out.println(Arrays.toString(answer));
    }
}
