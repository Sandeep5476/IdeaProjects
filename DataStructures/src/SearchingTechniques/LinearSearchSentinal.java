package SearchingTechniques;

public class LinearSearchSentinal {
    static int sentinalSearch(int[] arr,int key){
        int n=arr.length;
        int last=arr[n-1];
        arr[n-1]=key;
        int i=0;
        while(arr[i] != key){
            i++;
        }
        arr[n-1]=last;
        if(i< n-1 || arr[i] == key){
            return i;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{11,22,33,44,55};
        int key=59;
        int result = sentinalSearch(arr,key);
        if(result != -1){
            System.out.println("The element is found at position: "+result);
        }else{
            System.out.println("The element is not found");
        }
    }
}
