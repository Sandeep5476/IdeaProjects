public class StringMethod {
    static String stringEx(String str){
        return new StringBuilder(str).reverse().toString();
    }
    static String stringEx1(String str){
        return str.toLowerCase();
    }
    public static void main(String[] args) {
        System.out.println(stringEx("sandeep is good one"));
        System.out.println(stringEx1("SANDEEP"));
    }
}
