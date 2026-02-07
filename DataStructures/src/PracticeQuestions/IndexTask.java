package PracticeQuestions;

public class IndexTask {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] result = new int[n];

        int start = 0, end = n - 1;
        int i = 0;
        boolean takeFromEnd = true;

        while (start <= end) {
            if (takeFromEnd) {
                result[i++] = arr[end--];
            } else {
                result[i++] = arr[start++];
            }
            takeFromEnd = !takeFromEnd; // alternate
        }

        // print result
        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}
