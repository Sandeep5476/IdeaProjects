package SearchingTechniques;

public class AgnosticBinarySearch {
    static int agnosticBinarySearch(int[]arr,int key){
        int low=0;
        int high=arr.length-1;
        boolean isAscending=false;
        if(arr[low] < arr[high]){
            isAscending=true;
        }
        while(low <= high){
            int mid= low+ (high-low)/2;
            if(key == arr[mid]){
                return mid;
            }
            if(isAscending){
                if(key > arr[mid]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
            else{
                if(key > arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{11,22,33,44,55};
        int[] arr1=new int[]{55,44,33,22,11};
        int key=33;
        int result=agnosticBinarySearch(arr1,key);
        if(result != -1){
            System.out.println("The element is found at index: "+result);
        }else{
            System.out.println("Element is not found");
        }
    }
}
