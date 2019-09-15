import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your room length in meters");
            showAlertMessage();
            float roomLength = scanner.nextFloat();

            System.out.println("Enter your room width in meters");
            showAlertMessage();
            float roomWidth = scanner.nextFloat();

            System.out.println("Enter your room high in meters");
            showAlertMessage();
            float roomHigh = scanner.nextFloat();

            int amount = ((int) Math.ceil((roomLength + roomWidth) * 2 * roomHigh));
            System.out.println("You need " + amount + " meters of wallpaper");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Unsupported values, restart program and try again");
        }
    }

    private static void showAlertMessage() {
        System.out.println("INTEGER OR FLOAT VALUE ONLY");
        System.out.println("SEPARATE THE FRACTIONAL PART ONLY WITH A COMMA");
    }
}