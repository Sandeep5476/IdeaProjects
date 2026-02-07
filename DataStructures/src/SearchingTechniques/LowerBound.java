package SearchingTechniques;

public class LowerBound {
    static int lowerBound(int[]arr,int key){
        int low=0;
        int high=arr.length-1;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(arr[mid] >= key){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,4,5,10,15,19,19,25,50};
        int key=119;
        int result=lowerBound(arr,key);
        System.out.println("The lower bound of "+key+" is: "+result);
    }
}
