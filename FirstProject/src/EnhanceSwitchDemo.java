//in enhancement switch we should use braces if case have more than one expression or print statements
public class EnhanceSwitchDemo {


    //in, method we are using switch as follows using traditional approach

   /* static String dayOfWeek(String day){
        return switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> "Weekday ready to work";
            case "saturday", "sunday" -> "weekend you get holiday";
            default -> {
                System.out.println("you entered: "+day);
                yield "invalid day";
            }

        };
    }*/
      // (or)

/*   static String dayOfWeek(String day){
//        switch(day){
//
//            case "monday":
//            case "tuesday":
//            case "wednesday":
//            case "thursday":
//            case "friday":
//                return "Weekday ready to work";
//            case "saturday":
//            case "sunday":
//                return "weekend you get holiday";
//            default :
//                return "invalid day";
//        }
   } */

    public static void main(String[] args) {

    /* String result = dayOfWeek("frisat");
     String result1 = dayOfWeek("frisat");
        System.out.println(result);
        System.out.println(result1);*/




        // switch as an expression
        //there must be a default case while we are  using switch as an expression otherwise it gives an error
//        System.out.println("enter choice ");
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//        String result = switch(choice){
//            case 1,2,3,4,5 -> "weekday";
//            case 6,7 -> "weekend";
//            default-> "invalid week day";
//        };
//        System.out.println(result);



//        System.out.println("enter choice");
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
//        switch(choice){
//            case 1,2,3,4,5->{
//                int a = 11;
//                System.out.println(a);
//                    System.out.println("weekday");
//            System.out.println("its time to work");
//            }
//            case 6,7->{
//                System.out.println("weekend");
//                int a = 12;
//                System.out.println(a);
//            }
//
//            default->
//                    System.out.println("invalid choice");
//        }
    }
}
