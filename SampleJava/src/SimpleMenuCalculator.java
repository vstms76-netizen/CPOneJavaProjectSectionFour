import java.util.Scanner;

public class SimpleMenuCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        System.out.println("Choose Operation: ");
        int choice = scan.nextInt();

        if (choice < 1 || choice > 4) {
            System.out.println("Error: Invalid choice.");
        } else {
            System.out.println("Enter first number: ");
            double num1 = scan.nextDouble();

            System.out.println("Enter second number:");
            double num2 = scan.nextDouble();

            if (choice == 1) {
                System.out.println("Result: " + (num1 + num2));
            } else if (choice == 2) {
                System.out.println("Result: " + (num1 - num2));
            } else if (choice == 3) {
                System.out.println("Result: " + (num1 * num2));
            } else {
                if (num2 == 0) {
                    System.out.println("No.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
            }
        }
        scan.close();
    }
}