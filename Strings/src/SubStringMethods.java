public class SubStringMethods {
    public static void main(String[] args) {
        String str="Sandeep Korrapati";
        //substring method
        System.out.println(str.substring(6,11));//begin index inclusive and end index exclusive
        String filename="file.pdf";
        System.out.println(filename.substring(filename.indexOf('.')+1));
        String email="info@jennyslectures.com";
        String domainName=email.substring(email.indexOf('@')+1);
        System.out.println(domainName);
        //toUpperCase()
        System.out.println(str.toUpperCase());
        //trim()
        String str1="    Sandeeep Korrapati    ";
        System.out.println(str1.trim());
        //replace method
        String str2="sandeep korrapati";
        System.out.println(str2.replace('a','@'));
        System.out.println(str2.replace("korrapati","KORRAPATI"));
        //split method which returns array of strings
        String str3="welcome to jenny's lecture's";
        String[] words= str3.split(" ",2);//considered as no limit
        for(String word:words)
            System.out.println(word);
        //real world example
        System.out.println("real world example of using split method: ");
        String str4="info@jennyslecture.com";
        String[] partsOfEmail=str4.split("@");
        System.out.println("userName: "+partsOfEmail[0]);
        System.out.println("Domain: "+partsOfEmail[1]);
        //fetching date
        System.out.println("fetching date,year,month of 2025-05-19");
        String str5="2025-05-19";
        String[] split=str5.split("-");
        System.out.println("year: "+split[0]);
        System.out.println("month: "+split[1]);
        System.out.println("Date: "+split[2]);
        //ValueOf method
        int num=5;
        float f=66.66f;
        String num1=String.valueOf(num);
        String f1=String.valueOf(f);
        System.out.println(num1+f1);//566.66 because those can be converted into strings
    }
}
