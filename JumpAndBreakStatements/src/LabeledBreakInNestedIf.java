// we can use break in both switch and loops

public class LabeledBreakInNestedIf {
    public static void main(String[] args) {
        int number = 4;
        outer:
        if(number > 0){
            System.out.println("Number is positive");
            if(number % 2 == 0){
                System.out.println("Number is even");
            }else{
                System.out.println("Number is odd");
                break outer;
            }
            System.out.println("This will print if the number is even.");
        }
        System.out.println("This is outside the labeled block.");
    }
}
