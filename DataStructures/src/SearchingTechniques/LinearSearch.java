package SearchingTechniques;

public class LinearSearch {
    static int linearSearch(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = new int[]{11,22,33,44,55,66};
        int key=77;
        int result=linearSearch(arr,key);
        if(result != -1){
            System.out.println("Element found at index: "+result);
        }else{
            System.out.println("Element not found");
        }
    }
}
