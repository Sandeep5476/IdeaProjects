interface Dimensions{
    int x=30;
    int y=20;
}
class Room implements Dimensions{
    public int area(){
        int m = x;
        int n = y;
        return (m*n);
    }
}
public class Inface {
    public static void main(String[] args) {
        Room rm = new Room();
        Dimensions d;
        d=rm;
        System.out.println("Area of room="+rm.area());
    }
}
