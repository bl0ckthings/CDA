import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your city name");
        String cityName = sc.nextLine();
        System.out.println("You appear to live in " + getLocation(cityName) + ".");
    }

    public static String getLocation(String location) {
        return location;
    }
}
