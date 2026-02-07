//toggle the case of each character in a string
public class CodingEx6 {
    public static void main(String[] args){
        String str ="SandeeP";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
