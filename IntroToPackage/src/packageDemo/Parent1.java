package packageDemo;
//within the same package public,default,protect(inherited) will work fine
public class Parent1 extends Parent{
    public static void main(String[] args) {
        Parent1 obj = new Parent1();
        System.out.println("public var: "+obj.publicVar);
        //System.out.println("Private var: "+obj.privateVar);//gives error
        System.out.println("Protect var: "+obj.protectVar);
        System.out.println("default var: "+obj.defaultVar);
    }

}
