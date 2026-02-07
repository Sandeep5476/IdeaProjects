package PracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonElementsInSortedArrays {
    static int[] findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        List<Integer> common = new ArrayList<>();

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                common.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }

        // Convert List<Integer> to int[]
        int[] result = new int[common.size()];
        for (int x = 0; x < common.size(); x++) {
            result[x] = common.get(x);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};

        int[] result = findCommonElements(arr1, arr2, arr3);

        System.out.print("Common elements: ");
        System.out.println(Arrays.toString(result));
    }
}
