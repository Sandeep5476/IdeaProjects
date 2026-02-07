package LeetCode;

public class RemoveElements27 {
    static int removeElements(int[] nums,int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,4,3,2,2};
        int val=2;
        int result = removeElements(arr,val);
        System.out.println(result);
    }
}
