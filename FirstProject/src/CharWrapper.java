public class CharWrapper {
    char MinVal = Character.MIN_VALUE;
    char MaxVal = Character.MAX_VALUE;
    int a = (int)MinVal;
    int b = (int)MaxVal;
    void display(){
        System.out.println("the minimum value of char is: "+MinVal);
        System.out.println("the maximum value of char is: "+MaxVal);
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        CharWrapper obj = new CharWrapper();
        obj.display();
    }
}
