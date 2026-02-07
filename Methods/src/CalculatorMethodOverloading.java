public class CalculatorMethodOverloading {
    static int add(int a,int b){
        return a+b;
    }
    static double multiply(double a,double b){
        return a*b;
    }
    static int operate(int a,int b,String operation){
        switch (operation){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/":
                if(b==0){
                    System.out.println(" Error Division by zero is not possible");
                    return -1;
                }else{
                    return a/b;
                }
            default:
                System.out.println("Invalid operation!");
                return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(multiply(2.2,2.2));
        System.out.println(operate(1,2,"+"));
        System.out.println(operate(1,2,"-"));
        System.out.println(operate(1,2,"*"));
        System.out.println(operate(1,0,"/"));
    }
}
