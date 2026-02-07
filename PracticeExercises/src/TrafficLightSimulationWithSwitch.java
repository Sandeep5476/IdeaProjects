import java.util.Scanner;

public class TrafficLightSimulationWithSwitch {
    static String trafficlightsimulation(String lightcolour){
        return switch(lightcolour){
            case "red"->"stop";
            case "green"->"go";
            case "orange"->"slow down";
            default ->"invalid color";
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter traffic light colour");
        String choice = sc.nextLine();
        System.out.println( trafficlightsimulation(choice));
    }
}
