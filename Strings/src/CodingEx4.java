//write a program that remove all spaces in a string
public class CodingEx4 {
    public static void main(String[] args) {
        //approach 1
      /*  String str ="welco\nme to my hou\tse";
        String replacedString=str.replaceAll("\\s+","");
        System.out.println(replacedString); */

        //approach 2 without using stringbuilder
       /* String str ="welco\nme to my hou\tse";
        String str1="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' ' && ch!='\t' && ch!='\n'){
                str1=str1+str.charAt(i);
            }
        }
        System.out.println(str1);*/

        //approach 3 with using stringbuilder
        String str ="welco\nme to my hou\tse";
        String str1="";
        StringBuilder sb = new StringBuilder(str1);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' ' && ch!='\t' && ch!='\n'){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
