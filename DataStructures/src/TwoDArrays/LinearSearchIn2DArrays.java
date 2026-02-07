package TwoDArrays;

import java.util.Arrays;

public class LinearSearchIn2DArrays {
    static int[] searchUnsortedMatrix(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[1].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(target == matrix[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] matrix={{1,4,6,2},{7,-3,89,90},{12,10,45,78}};
        int[] result=searchUnsortedMatrix(matrix,89);
        System.out.println(Arrays.toString(result));
    }
}
