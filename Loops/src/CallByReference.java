class Car{
    String name;
    int mileage;
}
public class CallByReference {
    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println(obj.name="sandeep");
        System.out.println(obj.mileage=11);

    }
}
