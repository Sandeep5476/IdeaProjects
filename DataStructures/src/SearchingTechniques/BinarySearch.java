package SearchingTechniques;

public class BinarySearch {
    static int simpleBinarySearch(int[]arr,int key){
        int low=0;
        int high=arr.length-1;
        while(low <= high){
            int mid=low+ (high-low)/2;
            if(key == arr[mid]){
                return mid;
            }
            else if(key>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{11,22,33,44,55};
        int key=22;
        int result=simpleBinarySearch(arr,key);
        if(result != -1){
            System.out.println("Element is found at index: "+result);
        }else{
            System.out.println("Element is not found");
        }
    }
}
