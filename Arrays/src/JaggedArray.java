public class JaggedArray {

   //no.of elements of each row
    static void displayCount(int[][] myArray){
        for(int i=0;i<myArray.length;i++){
            int count=0;
            for(int j=0;j<myArray[i].length;j++){
                count++;
            }
            System.out.println("Row "+(i+1)+" has "+count+" elements");
        }
    }
  //sum of each row and highest sum among each row
    static void sumCount(int[][] myArray){
        int maxSum = Integer.MIN_VALUE;
        int sumIndex=-1;

        for(int i=0;i<myArray.length;i++){
            int sum=0;
            for(int j=0;j<myArray[i].length;j++){
                sum=sum+myArray[i][j];
            }
            System.out.println((i+1)+" row sum is: "+sum);
            if(sum>maxSum){
                maxSum=sum;
                sumIndex=i;
            }
        }
        System.out.println("The row "+(sumIndex+1)+" has highest sum that is: "+maxSum);
    }

    //max element in each row
    static void maxElement(int[][] myArray){
        for(int i=0;i<myArray.length;i++){
            int maxElement=Integer.MIN_VALUE;
            for(int j=0;j<myArray[i].length;j++){
                if(myArray[i][j] > maxElement){
                    maxElement=myArray[i][j];
                }
            }
            System.out.println("The row "+(i+1)+" has maximum element of: "+maxElement);
        }
    }

    public static void main(String[] args){
        int[][] jaggedArray ={{1,2,3},{1,2,3,4},{1,2,3,4,5}};
        //displayCount(jaggedArray);
        //sumCount(jaggedArray);
        maxElement(jaggedArray);

    }
}
