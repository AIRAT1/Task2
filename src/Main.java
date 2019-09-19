import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Enter your room length in meters");
            showAlertMessage();
            double roomLength = scanner.nextDouble();

            System.out.println("Enter your room width in meters");
            showAlertMessage();
            double roomWidth = scanner.nextDouble();

            System.out.println("Enter your room high in meters");
            showAlertMessage();
            double roomHeight = scanner.nextDouble();

            System.out.println("You need bye " + calculate(roomLength, roomWidth, roomHeight) + " rolls of wallpaper");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unsupported values, restart program and try again");
        }
    }

    private static void showAlertMessage() {
        System.out.println("INTEGER OR FLOAT VALUE ONLY");
        System.out.println("SEPARATE THE FRACTIONAL PART ONLY WITH A POINT");
    }

    private static int calculate(double length, double width, double height) {
        int amountInMeters = ((int) Math.ceil((length + width) * 2 * height));
        int amountInRolls = (int) Math.ceil(amountInMeters / Constants.wallpaperRollLengthInMeters);
        return amountInRolls;
    }
}