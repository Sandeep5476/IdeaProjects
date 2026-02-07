package SearchingTechniques;

public class LinearSearchBiDirectional {
    static int biDirectional(int[] arr,int key){
        int left=0;
        int right=arr.length-1;
        while(left <= right){
            if(arr[left] == key){
                return left;
            }
            if(arr[right] == key){
                return right;
            }
            left++;
            right--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= new int[]{11,22,33,44,55};
        int key=33;
        int result=biDirectional(arr,key);
        if(result != -1){
            System.out.println("Element found at position: "+result);
        }else{
            System.out.println("Element is not found");
        }
    }
}
