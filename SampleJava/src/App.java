import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("WHat is your name?");
        String name = scan.nextLine();

        System.out.println("My name is " + name);

        scan.close();
    }
}