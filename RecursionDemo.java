public class RecursionDemo {
    static void display(int n){
        System.out.println(n);
        display2(2);
    }
    static void display2(int n){
        System.out.println(n);
        display3(3);
    }
    static void display3(int n){
        System.out.println(n);
    }
    public static void main(String[] args) {
        display(1);
    }
}
