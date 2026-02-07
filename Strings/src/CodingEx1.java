//write a program to reverse the string
public class CodingEx1 {
    public static void main(String[] args) {
        //approach 1
        /*String str="sandeep";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }*/

        //approach 2
       /* String str ="sandeep";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());*/

        //approach 3
       /* String str="sandeep";
        String str1="";
        StringBuilder sb = new StringBuilder(str1);
        for(int i=str.length()-1;i>=0;i--){
           sb.append(str.charAt(i));
        }
        System.out.println(sb.toString()); */

        //approach 4
        String str="sandeep";
        StringBuilder sb = new StringBuilder(str);
        int lp=0,rp=sb.length()-1;
        while(lp<rp){
            char leftChar=sb.charAt(lp);
            char rightChar=sb.charAt(rp);

            sb.setCharAt(rp,leftChar);
            sb.setCharAt(lp,rightChar);
            lp++;
            rp--;
        }
        System.out.println(sb.toString());

    }
}
