public class LeetCodeMissingNumber1{
    static void missingNumber(int[] myArray){
//        int n= myArray.length;
//        int sum=(n*(n+1))/2;
//        int sumArray=0;
//        for(int i=0;i< myArray.length;i++){
//            sumArray=sumArray+myArray[i];
//        }
//        int missingNumber=sum-sumArray;
//        System.out.println(missingNumber);
        
       // bruteforce approach
        int n=myArray.length;
        for(int i=0;i<=n;i++){
            boolean flag=false;
            for(int j=0;j<myArray.length;j++){
                if(i==myArray[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,3,1};
        missingNumber(arr);
    }
}
