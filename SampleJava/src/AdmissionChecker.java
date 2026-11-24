import java.util.Scanner;

public class AdmissionChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scan.nextInt();

        System.out.print("Enter Score: ");
        int score = scan.nextInt();

        if (age >= 18 && score >= 75) {
            System.out.println("Eligible for admission");
        } else {
            System.out.println("Not Eligible for admission");
        }
        scan.close();
    }
}
