public class Forloopex2 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10 && sum<50;i++){//we can also write inplace of i++ as i += 2,i *= 2,something like this
            sum = sum+i;
            System.out.println("i = "+i+" sum = "+sum);
        }
    }
}
