package packageDemo;

public class Parent2 {
    public int publicVar=10;
    private int privateVar=20;
    protected int protectVar=30;
    int defaultVar=40;
    public static void main(String[] args) {
        Parent2 obj = new Parent2();
        System.out.println("public var: "+obj.publicVar);
        System.out.println("Private var: "+obj.privateVar);//gives error
        System.out.println("Protect var: "+obj.protectVar);
        System.out.println("default var: "+obj.defaultVar);
    }
}
