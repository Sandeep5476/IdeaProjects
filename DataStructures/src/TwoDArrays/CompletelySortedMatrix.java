package TwoDArrays;

import java.util.Arrays;

public class CompletelySortedMatrix {
    static int[] completeSortedMatrix(int[][] matrix,int target){
        int rows= matrix.length,cols=matrix[0].length;
        int rowLow=0,rowHigh=rows-1;
        while(rowLow <= rowHigh){
            int rowMid=rowLow+(rowHigh-rowLow)/2;
            if(target >= matrix[rowMid][0] && target <= matrix[rowMid][cols-1]){
                int index=Arrays.binarySearch(matrix[rowMid],target);
                if(index >= 0){
                    return new int[]{rowMid,index};
                }
            }else if(target > matrix[rowMid][cols-1]){
                rowLow=rowMid+1;
            }else{
                rowHigh=rowMid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] matrix=new int[][]{{5,7,9,10},{12,15,18,30},{31,32,34,35},{38,40,41,43}};
        int[] result=completeSortedMatrix(matrix,18);
        System.out.println(Arrays.toString(result));
    }
}
