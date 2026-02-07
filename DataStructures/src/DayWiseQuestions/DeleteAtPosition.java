package DayWiseQuestions;
//deleting an element at specific index in an array.

import java.util.Arrays;
import java.util.Scanner;

public class DeleteAtPosition {
    int size;
    public static void deleteAtIndex(int[] arr,int pos){
        if(pos <= 0 || pos > arr.length){
            System.out.println("Invalid position.");
            return;
        }
        else{
            for(int i=pos-1;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;
            System.out.print("After deletion the array elements are: "+ Arrays.toString(arr));

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n=sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the position that want to delete: ");
        int pos=sc.nextInt();
        deleteAtIndex(arr,pos);
    }
}
