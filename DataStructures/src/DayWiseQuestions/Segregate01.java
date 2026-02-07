package DayWiseQuestions;

import java.util.Arrays;

public class Segregate01 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,0,0,1};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                arr[j++] = arr[i];
            }
        }
        while(j<arr.length){
            arr[j++]=1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
