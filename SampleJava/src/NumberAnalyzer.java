import java.util.Scanner;

public class NumberAnalyzer {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        int largest = numbers[0];
        int smallest = numbers[0];
        int sum = 0;

        System.out.print("Numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            sum += numbers[i];
        }
        System.out.println();
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Sum: " + sum);
        
        scan.close();
    }
}
