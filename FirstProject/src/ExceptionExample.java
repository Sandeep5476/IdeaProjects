public class ExceptionExample {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(a[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print(e);
        }
    }
}
