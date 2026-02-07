//important points
//we can use the default anywhere it will work fine
//in switch expression  we can use operators , and we cannot use long,float,double,boolean
// variables are not allowed at labels we must use only constants or constant variables
//reading a character as  -> char a = sc.next().charAt(0)
//at the time of declaring a variable as constant variable we must initialize there only otherwise it is not considered as final variable
//we can use enum types , wrapper classes in switch statements

import java.util.Scanner;

//we can also declare switch as
//case 1: case 2: case 3: case 4: case 5:
//System.out.println("weekday")
//case 6: case 7:
public class SwitchDemo {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter choice of day ");
            int choice = sc.nextInt();
            switch(choice){
                case 1,2,3,4,5:
                    int a = 10;
                    System.out.println(a);
                    System.out.println("weekday");
                    System.out.println("its time to work");
                    break;
                case 6:
                      a = 11;
                    System.out.println(a);
                    System.out.println("its weekend");
                    System.out.println("enjoy holiday");
                    break;
            }



//          enum Day{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}
//           Day day = Day.MONDAY;
//          switch(day){
//              case MONDAY:
//                  System.out.println("monday");
//                  System.out.println("its working day");
//                  break;
//              case TUESDAY:
//                  System.out.println("tuesday");
//                  break;
//              case WEDNESDAY:
//                  System.out.println("wednesday");
//                  break;
//              case THURSDAY:
//                  System.out.println("thursday");
//                  break;
//              case FRIDAY:
//                  System.out.println("friday");
//                  break;
//              case SATURDAY:
//                  System.out.println("saturday");
//                  break;
//              case SUNDAY:
//                  System.out.println("sunday");
//                  break;
//          }


//            Scanner sc = new Scanner(System.in);
//            System.out.println("enter choice");
//            int choice = sc.nextInt();
//            final int a = 11;
//
//            switch(choice){
//
//                case a:
//                    System.out.println("Monday");
//                    break;
//
//                case 2:
//                    System.out.println("Tuesday");
//                    break;
//                case 3:
//                    System.out.println("Wednesday");
//                    break;
//                case 4:
//                    System.out.println("Thursday");
//                    break;
//                case 5:
//                    System.out.println("Friday");
//                    break;
//                case 6:
//                    System.out.println("Saturday");
//                    break;
//                case 7:
//                    System.out.println("Sunday");
//                    break;
//                default :
//                    System.out.println("invalid choice");
//                    break;
//
//            }
        }

    }


