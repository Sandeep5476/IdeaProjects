public class LeetCodeContainerWithMostWater {
    public static void main(String[] args) {
        //optimal approach
        int[] height={1,8,6,2,5,4,8,3,7};
        int maxWater=0;
        int lp=0,rp=height.length-1;
        while(lp<rp){
            int width=rp-lp;
            int h=Math.min(height[lp],height[rp]);
            int currentWater=width*h;
            if(currentWater>maxWater){
                maxWater=currentWater;
            }
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        System.out.println("Max water is: "+maxWater);

        //bruteforce approach
//        int maxWater=0;
//        for(int i=0;i<height.length;i++){
//            for(int j=i+1;j<height.length;j++){
//                int width=j-i;
//                int h=Math.min(height[i],height[j]);
//                int currentWater=width*h;
//                if(currentWater>maxWater){
//                    maxWater=currentWater;
//                }
//            }
//        }
//        System.out.println("The max water is: "+maxWater);
    }
}
