package SearchingTechniques;

import java.util.Arrays;

public class CeilAndFloorUsingLinearSearch {
    static int floor(int[] arr,int key){
        int floor=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= key){
                floor=arr[i];
            }else{
                break;
            }
        }
        return floor;
    }
    static int ceil(int[] arr,int key){
        int ceil=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= key){
                ceil=arr[i];
                break;
            }
        }
        return ceil;
    }
    static int[] ceilAndFloor(int[] arr,int key){
        int ceil=ceil(arr,key);
        int floor=floor(arr,key);
        return new int[]{floor,ceil};
    }
    public static void main(String[] args) {
        int[] arr = new int[]{11,22,33,44,55};
        int key=23;
        int[] answer=ceilAndFloor(arr,key);
        System.out.println(Arrays.toString(answer));
    }
}
