package TwoDArrays;

import java.util.Arrays;

public class SearchSortedRowAndColumnMatrix {
    static int[] searchSortedRowAndColumnMatrix(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int i=0,j=cols-1;
        while(i<rows && j>=0){
            if(target == matrix[i][j]){
                return new int[]{i,j};
            } else if (target < matrix[i][j]) {
                j--;
            }else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] matrix={{5,15,25,30},{7,16,26,31},{10,18,28,35},{20,21,30,40}};
        int[] result=searchSortedRowAndColumnMatrix(matrix,20);
        System.out.println(Arrays.toString(result));
    }
}
