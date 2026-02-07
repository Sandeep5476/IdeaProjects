public class StringMethods {
    public static void main(String[] args) {
        System.out.println("length method example");
        String str="sandeep";
        String str11="SANDEEP";
        String str12=null;
        System.out.println(str.length());

        System.out.println("isEmpty method example");
        System.out.println(str.isEmpty());//if we initialise with null it gives null pointer exception

        System.out.println("isBlank method: ");
        String str1="\t";
        System.out.println(str1.isBlank());// it returns true even escape sequences are also treated as blank
        System.out.println(str1.isEmpty());//it returns false using isEmpty() method
        //we can say that isBlank is advanced version of isEmpty
        //we can also use .equals method as follows
        System.out.println("sandeep".equals(str));//true
        //USE OF .equalsIgnoreCase
        System.out.println(str.equalsIgnoreCase(str11));//true
        //null example i.e null should not be used as object reference but it can used in argument
        //System.out.println(str12.equals(str));//null pointer exception
        System.out.println(str.equals(str12));//false
        //compareTo method usage (it returns integer)
        System.out.println("sandeep".compareTo("sandeep"));//returns 0
        System.out.println("sandeep".compareTo("Sandeep"));//returns 32 ascii value of s=115 and S=83 s-S=32
        System.out.println("Sandeep".compareTo("sandeep"));//returns -32
        System.out.println("sandeep".compareTo("sand"));//returns length of the string

    }
}
