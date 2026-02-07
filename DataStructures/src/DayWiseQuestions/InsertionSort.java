package DayWiseQuestions;

public class InsertionSort {
    static void insertionSort(int[] arr){
        int temp;
        int j;
        for(int i=1;i< arr.length;i++){
             temp=arr[i];
             j=i-1;
            while(j >= 0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{5,1,4,6};
        insertionSort(arr);
        for (int j : arr) {
            System.out.print(j+" ");
        }
    }
}
