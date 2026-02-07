public class CharDemo {
    char ch = '\u0c38';
    char ch1 = '\u0c02';
    char ch2 = '\u0c26';
    char ch3 = '\u0c40';
    char ch4 = '\u0c2A';
    char ch5 = '\u0C4D';

    void display(){
        System.out.println("my name is "+ch+ch1+ch2+ch3+ch4+ch5);

    }

    public static void main(String[] args) {
        CharDemo obj = new CharDemo();
        obj.display();
    }
}
