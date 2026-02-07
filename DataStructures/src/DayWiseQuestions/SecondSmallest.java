package DayWiseQuestions;

public class SecondSmallest {

    static int secondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;  // shift old smallest
                smallest = arr[i];
            }
            else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 11, 12, 13};
        int result = secondSmallest(arr);
        System.out.println(result);
    }
}
