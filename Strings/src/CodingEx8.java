//write a program that checks the strings whether it is an anagram or not
import java.util.Arrays;

public class CodingEx8 {
    static boolean isAnagram(String s,String t){
        String str1=s.replaceAll("\\s+","");
        String str2=t.replaceAll("\\s+","");
        if(str1.length() != str2.length()){
            return false;
        }
        char[] charArray1=str1.toCharArray();
        char[] charArray2=str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("listen  ","silent"));
    }
}
