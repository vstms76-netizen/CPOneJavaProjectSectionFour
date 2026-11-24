import java.util.Scanner;

public class StudentGradeEvaluator {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Grade (0-100): ");
        int grade = scan.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("Invalid");
        } else if (grade >= 90) {
            System.out.println("Excellent");
        } else if (grade >= 80) {
            System.out.println("Vert Good");
        } else if (grade >= 75) {
            System.out.println("Good");
        } else if (grade >= 60) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        scan.close();
    }
}
