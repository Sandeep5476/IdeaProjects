
interface SurfaceArea {
    double compute(double x);
}
class Square implements SurfaceArea{
    public double compute(double x){
        return x*x;
    }
}
class Circle implements SurfaceArea{
    public double compute(double x){
        return (3.141*x*x);
    }
}
class SurfArea{
    public static void main(String[] args) {
        Square sqr = new Square();
        Circle cir = new Circle();
        SurfaceArea area;
        area = sqr;
        System.out.println("Area of square is = "+area.compute(10));
        area = cir;
        System.out.println("Area of circle is = "+area.compute(10));
    }
}

