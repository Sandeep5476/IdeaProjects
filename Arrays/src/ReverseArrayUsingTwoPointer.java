import java.util.Arrays;

public class ReverseArrayUsingTwoPointer {
    static int[] reverseArray(int[] myArray){
        int rightIndex=myArray.length-1;
        int halfIndex=myArray.length/2;
        for(int leftIndex=0;leftIndex<halfIndex;leftIndex++){
            int temp=myArray[rightIndex];
            myArray[rightIndex]=myArray[leftIndex];
            myArray[leftIndex]=temp;
            rightIndex--;
        }
        return myArray;
        //System.out.println(Arrays.toString(myArray));
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(arr)));
        //reverseArray(arr);
    }
}
