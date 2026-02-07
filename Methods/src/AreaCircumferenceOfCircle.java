public class AreaCircumferenceOfCircle {
    static void areaCircumference(double radius){
        double area = Math.PI * radius * radius;
        double circumference = 2*Math.PI*radius;
        System.out.println("The area of circle of radius "+radius+" is: "+area);
        System.out.println("The cirumference of a circle of radius "+radius+" is: "+circumference);
    }
    public static void main(String[] args) {
        areaCircumference(7);
        areaCircumference(6);
        areaCircumference(5);
    }
}
