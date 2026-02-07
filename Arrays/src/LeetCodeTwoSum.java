import java.util.Arrays;

public class LeetCodeTwoSum {
    static int[] TwoSum(int[] myArray,int num){
       int[] resultArray=new int[2];
        for(int i=0;i<myArray.length;i++){
            for(int j=i+1;j<myArray.length;j++){
                if(num==myArray[i]+myArray[j]){
                    resultArray=new int[]{i,j};
                    return resultArray;
                    //System.out.println("i = "+i+" j = "+j);
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,11,20};
        int target=3;
        System.out.println(Arrays.toString(TwoSum(arr,target)));
    }
}
