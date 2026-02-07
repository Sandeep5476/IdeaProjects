interface VolumeArea{
    double SurfaceAreaSphere(double radius);
    double volumeSphere(double radius);
    double setValue(double side);
}
public class StubMethod {
double SurfaceAreaSphere(double radius){
    return 0;
}
void setValue(double side){}
    double volumeSphere(double radius)
    {
        return 4.0*Math.PI*Math.pow(radius,3)/3;
    }

    public static void main(String[] args) {
        StubMethod stm = new StubMethod();
        System.out.printf("Volume of sphere of radius 10 = %.2f\n",stm.volumeSphere(10.0));
    }
}
