package TwoDArrays;

import java.util.Arrays;

//in this 2D matrix only rows are sorted
public class SearchSortedRowMatrix {
    static int[] searchRowSortedMatrix(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<rows;i++){
            if(target >= matrix[i][0] && target <= matrix[i][cols-1]){
                int index= Arrays.binarySearch(matrix[i],target);
                if(index >= 0){
                    return new int[]{i,index};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] matrix={{1,4,7,10},{23,41,56,60},{6,16,45,100}};
        int[] result=searchRowSortedMatrix(matrix,100);
        System.out.println(Arrays.toString(result));
    }
}
