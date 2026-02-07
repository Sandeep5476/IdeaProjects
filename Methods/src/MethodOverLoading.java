//Method overloading is Method having same name but different parameters
//we can have like void add(int a,double b) and void add(double a,int b)

public class MethodOverLoading {

    static void add(int a,double b){
        System.out.print("The sum is: "+(a+b));
    }
    static void add(double a,int b){
        System.out.print("The sum is: "+(a+b));
    }
    static void add(int a,int b){
        System.out.print("The sum is: "+(a+b));
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        add(1,2);
        System.out.println();
        int result=add(1,2,3);
        System.out.println("The sum is:"+result);
        System.out.println();
        add(2,2.222);
        System.out.println();
    }
}
