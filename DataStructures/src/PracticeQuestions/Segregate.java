package PracticeQuestions;

public class Segregate {
    static void findSegregrate(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
               arr[j++]=arr[i];
            }
        }
        while(j<arr.length){
            arr[j++]=1;
        }
        System.out.print("Segregated array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
    public static void main(String[] args){
        int[] arr= new int[]{1,1,0,0,1,1};
        findSegregrate(arr);
    }
}
