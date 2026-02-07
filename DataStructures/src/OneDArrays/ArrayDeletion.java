package OneDArrays;

public class ArrayDeletion {
    static void arrayTraversal(int[] arr){
        int size=0;
        for(int num: arr){
            if(num != 0){
                size++;
            }else{
                break;
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void deleteAtBegin(int[] arr){
        try{
            int size=0;
            for(int num: arr){
                if(num != 0){
                    size++;
                }else{
                    break;
                }
            }
            for(int i=0;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            arr[size-1]=0;
            size--;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    static void deleteAtSpecific(int[] arr,int pos){
       try{
           int size=0;
           for(int num: arr){
               if(num!=0){
                   size++;
               }else{
                   break;
               }
           }
           for(int i=pos-1;i<size-1;i++){
               arr[i]=arr[i+1];
           }
           arr[size-1]=0;
           size--;
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e);
       }
    }
    static void deleteAtEnd(int[] arr){
        try{
            int size=0;
            for(int num: arr){
                if(num != 0){
                    size++;
                }else{
                    break;
                }
            }
            arr[size-1]=0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
       int[] arr = new int[10];
        arr[0]=11;
        arr[1]=12;
        arr[2]=13;
        arr[3]=14;
        arr[4]=15;
        arrayTraversal(arr);
        deleteAtSpecific(arr,3);
        arrayTraversal(arr);
        deleteAtBegin(arr);
        arrayTraversal(arr);
        deleteAtEnd(arr);
        arrayTraversal(arr);

    }
}
