public class ArrayDemo {
    public static void main(String[] args) {
        // array declaration of 1 dimensional(while declaring no memory will be allocated)
        int[] arr; //int arr[]
        String[] arr1;

        //initializing or instantiation of an array
        int[] numbers = new int[5];
        //or
        int[] number;
        number=new int[5];
        //or
        int[] num = new int[]{1,2,3,4,5};

         /* it is not possible in this way
        int numbers[];
        numbers ={1,2,3,4,5}; //gives compilation error
        but, we can write
        int numbers[];
        numbers = new int[]{1,2,3,4,5};
         */
    }
}
