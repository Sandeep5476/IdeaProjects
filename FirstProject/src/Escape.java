public class Escape {
    public static void main(String[] args) {
        int a = 10;
        int result = a++ - ++a;
        int result1 = ++a - a++;
        System.out.println(result1);
    }
}
