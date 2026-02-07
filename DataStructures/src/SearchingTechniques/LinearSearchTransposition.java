package SearchingTechniques;

public class LinearSearchTransposition {
    static int transposition(int[] arr,int x){
        System.out.print("before transposition the array elements are: ");
        for(int elements:arr){
            System.out.print(elements+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
              if(i>0){
                  int temp=arr[i];
                  arr[i]=arr[i-1];
                  arr[i-1]=temp;
                  return i-1;
              }
              return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= new int[]{11,22,33,44,55};
        int key=33;
        int result=transposition(arr,key);
        if(result != -1){
            System.out.print("After transposition the array elements are: ");
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println("element found at index: "+result);
        }else{
            System.out.println("element is not found");
        }
    }
}
