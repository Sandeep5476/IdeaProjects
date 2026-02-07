public class ContinueEx1 {
    public static void main(String[] args) {
        for(int i = 1;i<=3;i++){
            System.out.println("Outer loop iteration: "+i);
            for(int j = 1;j<=3;j++){
                if(j == 2){
                    System.out.println("Skipping inner loop iteration when j is "+j);
                    continue;
                }
                System.out.println("Innerloop iteration: "+j);
            }
        }
    }
}
