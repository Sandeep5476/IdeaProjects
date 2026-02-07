package SearchingTechniques;

import java.util.Arrays;

public class LinearSearchMoveToFront {
     static int moveToFront(int[] arr,int x){
         System.out.print("Before array elements are: ");
         System.out.println(Arrays.toString(arr));
         for(int i=0;i<arr.length;i++){
             if(arr[i] == x){
                 if(i>0){
                     int temp=arr[i];
                     arr[i]=arr[0];
                     arr[0]=temp;
                     return 0;
                 }
                 return i;
             }
         }
         return -1;
     }
    public static void main(String[] args) {
       int[] arr= new int[]{11,22,33,44,55};
       int key=77;
       int result= moveToFront(arr,key);
       System.out.println("The modified array is: "+ Arrays.toString(arr));
       if(result != -1){
           System.out.println("Element is found at index: "+result);
       }else{
           System.out.println("Element is not found");
       }


    }
}
