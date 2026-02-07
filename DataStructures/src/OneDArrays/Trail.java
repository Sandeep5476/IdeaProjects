package OneDArrays;

public class Trail {
    static int majorityElement(int[] nums){

        for(int i=0;i<nums.length;i++){
            int count=0,majorityEle=nums[i];
            for(int j=0;j<nums.length;j++){
                if(majorityEle == nums[j]){
                    count++;
                }
            }
            if(count>(nums.length)/2){
                return majorityEle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,2,1,1};
        int result=majorityElement(arr);
        if(result != -1){
            System.out.println("The majority element is: "+result);
        }else{
            System.out.println("There is no majority element");
        }

    }
}
