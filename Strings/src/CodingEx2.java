//write a program for string palindrome
public class CodingEx2 {
    public static void main(String[] args){
        String str="Civic";
        str=str.toLowerCase();
        StringBuilder sb = new StringBuilder(str);

        int lp=0,rp=sb.length()-1;
        boolean flag=true;
        while(lp<rp){
            char leftChar=sb.charAt(lp);
            char rightChar=sb.charAt(rp);
            if(leftChar != rightChar){
                flag=false;
                break;
            }
            lp++;
            rp--;
        }
        if(flag==false){
            System.out.println("your string is not palindrome");
        }
        else{
            System.out.println("your string is a palindrome");
        }
    }
}
