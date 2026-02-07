package MyPackage1;

public class Rectangle {
    private int length;
    private int breadth;
    private int area;

    public Rectangle setLength(int length){
        this.length=length;
        return this;
    }

    public void setBreadth(int breadth){
        this.breadth=breadth;
    }

    public int getLength(){
        return this.length;
    }
    public int getBreadth(){
        return breadth;
    }
    public int calculateArea(){
        this.area=this.length*this.breadth;//length*breadth
        return area;
    }

    public void display(){
        System.out.println("Length: "+this.length);//length you can write
        System.out.println("breadth: "+this.breadth);//breadth you can write
        System.out.println("Area: "+this.calculateArea());//calculateArea() you can
        show(this);//passing current obj as an argument
    }

    public void show(Rectangle obj){
        System.out.println("Method calling using object reference");
    }

}
