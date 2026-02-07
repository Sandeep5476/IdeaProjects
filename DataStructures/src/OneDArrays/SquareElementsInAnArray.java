package OneDArrays;

import java.util.Arrays;

public class SquareElementsInAnArray {
    static int[] findSquare(int[] arr) {
        int result[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
           result[i]=arr[i]*arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{-4,-1,0,3,10};
        System.out.println(Arrays.toString(arr));
        int[] answer=findSquare(arr);
        System.out.println(Arrays.toString(answer));
    }
}
