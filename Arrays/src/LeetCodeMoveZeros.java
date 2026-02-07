import java.util.Arrays;

public class LeetCodeMoveZeros {
    static int[] moveZero(int[] myArray){
        int i=0;
        for(int j=0;j< myArray.length;j++){
            if(myArray[j]!=0){
                int temp=myArray[j];
                myArray[j]=myArray[i];
                myArray[i]=temp;
                i++;
            }
        }
        return myArray;
       // System.out.println(Arrays.toString(myArray));
    }
    public static void main(String[] args) {
        int[] arr={0,122,3,0,4};
        int[] result= moveZero(arr);
        System.out.println(Arrays.toString(result));
    }
}
