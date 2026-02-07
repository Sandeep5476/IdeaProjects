interface InFace{
    int n=10;
    default void display() {
        System.out.println("2 to the power of 8 = " + Math.pow(2, 8));

    }
}
public class DefaultMethod implements InFace{
    public static void main(String[] args) {
        DefaultMethod dm = new DefaultMethod();
        int area = n*n;
        System.out.println("area= "+area);
        dm.display();
    }
}
