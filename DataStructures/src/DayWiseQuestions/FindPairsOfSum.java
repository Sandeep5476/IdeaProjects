package DayWiseQuestions;

public class FindPairsOfSum {
    public static void main(String[] args) {
        int sum=9;
        int[] arr= new int[]{1,2,3,4,5,6,7};
        int low=0,high=arr.length-1;
        System.out.print("The pairs are: ");
        while(low < high){
            if(arr[low]+arr[high] == sum){
                System.out.print("( "+arr[low]+" , "+arr[high]+" ) ");
                low++;
                high--;
            }
            else if(arr[low]+arr[high] > sum){
                high--;
            }
            else if(arr[low]+arr[high] < sum){
                low++;
            }
        }
    }
}
