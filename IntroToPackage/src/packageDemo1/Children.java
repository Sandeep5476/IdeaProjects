package packageDemo1;

import packageDemo.Parent;

public class Children extends Parent {
    public static void main(String[] args) {
        Children obj = new Children();
        System.out.println("public var: "+obj.publicVar);
        //System.out.println("Private var: "+obj.privateVar);//gives error
        System.out.println("Protect var: "+obj.protectVar);
        //System.out.println("default var: "+obj.defaultVar);
        //gives error default var is not access because it is package private
    }

}
