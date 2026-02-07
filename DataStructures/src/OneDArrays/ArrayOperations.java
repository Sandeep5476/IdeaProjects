package OneDArrays;

public class ArrayOperations {
    static void traverseArray(int[] arr1,int size){
        for(int i=0;i<size;i++){
            System.out.println(arr1[i]+" ");
        }
    }
    static void insertAtBeginning(int[] arr,int size,int x){
        for(int i=size;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=x;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size=5;
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        //traverse the array
        //traverseArray(arr,size);
        //inserting at beginning
        insertAtBeginning(arr,size,77);
        size++;
        traverseArray(arr,size);

    }
}
