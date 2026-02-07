public class ContinueBreakEx {
    public static void main(String[] args) {
        int num = 0;
        while(num< 20){
            num++;
            if(num <= 7){
                continue;
            }
            System.out.println("Number "+num);
            if(num>=15){
                break;
            }
        }
    }
}
