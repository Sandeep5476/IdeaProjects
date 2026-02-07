package SearchingTechniques;

import java.util.Arrays;

public class CeilAndFloorUsingBinarySearch {
    static int floor(int[] arr,int key){
       int low=0,high=arr.length-1;
       int floor=-1;
       while(low<=high){
           int mid=low+(high-low)/2;
           if(arr[mid] == key){
               floor=arr[mid];
           } else if (arr[mid] < key) {
               floor=arr[mid];
               low=mid+1;
           }else{
               high=mid-1;
           }
       }
       return floor;
    }
    static int ceil(int[] arr,int key){
        int low=0,high=arr.length-1;
        int ceil=-1;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(arr[mid] == key){
                ceil=arr[mid];
            }else if(arr[mid] > key){
                ceil=arr[mid];
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ceil;
    }
    static int[] ceilAndFloor(int[]arr,int key){
        int floor=floor(arr,key);
        int ceil=ceil(arr,key);
        return new int[]{floor,ceil};
    }
    public static void main(String[] args) {
        int[] arr = new int[]{11,22,33,44,55};
        int key=23;
        System.out.println(floor(arr,key));
        System.out.println(ceil(arr,key));
        System.out.println(Arrays.toString(ceilAndFloor(arr,key)));
//        int[] answer=ceilAndFloor(arr,key);
//        System.out.println(Arrays.toString(answer));
    }
}
