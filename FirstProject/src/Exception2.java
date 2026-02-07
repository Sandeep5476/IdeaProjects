public class Exception2 {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b = 10,c=0;
        try {
            System.out.println(b/c);//rises only one exception
            for (int i = 0; i < 4; i++) {
                System.out.println(a[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){ // we can also mention super class
            System.out.print(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
