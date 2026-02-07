//here byte variables are passed to methods
//but there are no methods of byte so byte is promoted to next type i.e short
//debug or dryrun the following program

public class MethodOverloadingEx1 {
    static void add(int a,int b){
        System.out.println("The sum is: "+(a+b));
    }
    static void add(short a,short b){
        System.out.println("The sum is: "+(a+b));
    }

    public static void main(String[] args) {
        byte b1=10,b2=20;
        add(b1,b2);
    }
}
