import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberCounter {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("How many numbers?");
        int amount = scan.nextInt();

        while (amount < 8 || amount > 15) {
            System.out.println("Please enter a number from 8 to 15.");
            System.out.println("How many numbers do you want to enter 8-15");
            amount = scan.nextInt();
        }

        for (int i = 0; i < amount; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers.add(scan.nextInt());
        }

        int evenCount = 0;
        int oddCount = 0;
        int positiveCount = 0;

        System.out.println("Numbers: ");

        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            System.out.print(current + " ");

            if (current % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (current > 0) {
                positiveCount++;
            }
        }

        System.out.println();
        System.out.println("Even numnbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Positive numbers: " + positiveCount);

        scan.close();
    }
}
