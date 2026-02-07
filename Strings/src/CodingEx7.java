// write a program that find longest word in a sentence
public class CodingEx7{
    public static void main(String[] args) {
        String sentence="welcome to my house12345";//you have to observe space in the sentence at last index
        String word="";
        String longestWord="";
        sentence=sentence + " ";
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(ch!=' '){
                word += ch;
            }
            else{
                if(word.length()>longestWord.length()){
                    longestWord=word;
                }
                word="";
            }
        }
        System.out.println("The longest word in a given sentence is: "+longestWord);
    }
}
