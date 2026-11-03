import java.util.Scanner;

public class App 
{
    static String name;
    static int age;
    static String address;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scan.nextLine();
        
        System.out.println("Enter your age: ");
        age = scan.nextInt();
        scan.nextLine(); // Consume the newline character

        System.out.println("Enter your address: ");
        address = scan.nextLine();

        GetDetails(name, age, address);
        scan.close();
    }
    
    
    public static void GetDetails(  String name, int age, String address)
    {
    
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old.");
        System.out.println("I live at " + address);
    }
}