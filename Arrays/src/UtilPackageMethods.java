import java.util.Arrays;

public class UtilPackageMethods {
    public static void main(String[] args) {
       // use of sort()
        System.out.println("sort method: ");
        int[] myArray={10,1,2,3,4,8,5,6,2,1};
        Arrays.sort(myArray); // sorts the array in ascending order
        System.out.println(Arrays.toString(myArray));

        //use of .equals() it is a boolean type
        //for 2D arrays we use .deepEquals()
        System.out.println("equals method: ");
        int[] array1={9,8,7,6,5,4,3,2,1};
        int[] array2={9,8,7,6,5,4,3,2,1,10};
        System.out.println(Arrays.equals(array1,array2)); //false
        System.out.println(Arrays.equals(array1,0,7,array2,0,7));

        //use of binary search() so if you use this the array must be sorted
        System.out.println("binary method: ");
        System.out.println("binary search operation");
        int[] myarray1={7,6,5,4,3,2,1};
        Arrays.sort(myarray1);
        System.out.println(Arrays.toString(myarray1));
        System.out.println(Arrays.binarySearch(myarray1,7));

        //use of fill()
        System.out.println("full method: ");
        int[] hisArray=new int[15];
        Arrays.fill(hisArray,1);
        System.out.println(Arrays.toString(hisArray));
        //or
        int[] hisArray1={1,2,3,4,5,6,7};
        Arrays.fill(hisArray1,2,5,70);
        System.out.println(Arrays.toString(hisArray1));

        //copyOf()
        System.out.println("copyOf method: ");
        int[] original={1,2,3,4,5};
        int[] copy=Arrays.copyOf(original,original.length);//length must be required you can also give specific range
        System.out.println(Arrays.toString(copy));
        int[] copy1=Arrays.copyOf(original,10);//padding filled with zero's
        System.out.println(Arrays.toString(copy1));
        int[] copy2=Arrays.copyOf(original,4);//truncating filled with zero's
        System.out.println(Arrays.toString(copy2));
    }
}
