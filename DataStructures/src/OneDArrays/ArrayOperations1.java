package OneDArrays;

public class ArrayOperations1 {
    static void arrayTraversal(int[] arr){
        try{
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
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    static void insertAtBegin(int[] arr,int x){
        try{
            int size=0;
            for(int num: arr){
                if(num != 0){
                    size++;
                }else{
                    break;
                }
            }
            //if order matters that is without altering the array elements
            for(int i=size;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=x;
            size++;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    static void insertAtEnd(int[] arr,int x){
        try{
            int size=0;
            for(int num: arr){
                if(num != 0){
                    size++;
                }else{
                    break;
                }
            }
            arr[size]=x;
            size++;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    static void insertAtSpecific(int[] arr,int x,int pos){
        try{
            int size=0;
            for(int num: arr){
                if(num != 0){
                    size++;
                }else{
                    break;
                }
            }
            if(pos <= 0 || pos > size+1){
                System.out.println("Please enter a correct position");
            }

            else{

                for(int i=size;i>=pos;i--){
                    arr[i]=arr[i-1];
                }
                arr[pos-1]=x;
                size++;
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
       int[] arr = new int[10];
        arr[0]=3;
        arr[1]=11;
        arr[2]=9;
        arr[3]=6;
        arr[4]=7;
        arrayTraversal(arr);
        insertAtBegin(arr,99);
        arrayTraversal(arr);
        insertAtEnd(arr,100);
        arrayTraversal(arr);
        insertAtSpecific(arr,69,9);
        arrayTraversal(arr);

    }
}
