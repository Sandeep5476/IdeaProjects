public class Demo3 {
    short minVal = Short.MIN_VALUE;
    short maxVal = Short.MAX_VALUE;
    //byte CmaxVal = maxVal+2;
    short cMinval = (short)(minVal-1);

    void display(){
        System.out.println("The minimum value of integer is: "+minVal);
        System.out.println("The maximum value of integer is: "+maxVal);
        System.out.println("The changed min value is "+cMinval);
    }

    public static void main(String[] args) {
        Demo3 obj = new Demo3();
        obj.display();
    }
}

