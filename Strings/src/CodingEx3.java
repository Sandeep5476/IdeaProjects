// write a program that counts no.of vowels and no.of consonants in a string.
public class CodingEx3 {
    public static void main(String[] args) {
        String str ="Sandeep123".toLowerCase();
        //str=str.toLowerCase();
        int vowelCount=0,consonantCount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            }else if(ch>='a' && ch<='z'){
                consonantCount++;
            }
        }
        System.out.println("no.of vowels are: "+vowelCount+" and no.of consonants are: "+consonantCount);
    }
}
