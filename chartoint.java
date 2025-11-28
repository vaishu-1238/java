import java.util.Scanner;

public class chartoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        try {
            String firstThree = name.substring(0, 3);
            int number = Integer.parseInt(firstThree);
            System.out.println("Converted number: " + number);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Name must have at least 3 characters.");
        } catch (NumberFormatException e) {
            System.out.println("Error: First three characters are not a valid number.");
        }

        sc.close();
    }
}