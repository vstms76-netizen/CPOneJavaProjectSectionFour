import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    /*public static void main(String[] args) {
        String[] names = {
            "Visaya",
            "itlog",        // 0
            "Kratos",       // 1
            "Kong TV",      // 3
            "Hitler",       // 4
            "Josh Mojica",  // 5
            "Josh Tayo",    // 6
            "Sakurai",      // 7
            "Charlie kirk", // 8
            "Epstein",      // 9
            "Esmiringhoy"   // 10
        };

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scan.nextLine();

        scan.close();
        
       
        if (IsNameExist(names, name)) {
            System.out.println("The name " + name + " exists in the array.");
        } else {
            System.out.println("The name " + name + " does not exist in the array.");
        }
    }

   
    private static boolean IsNameExist(String[] nameList, String searchName) {   
        for (int i = 0; i < nameList.length; i++) {
            
            if (nameList[i].equalsIgnoreCase(searchName)) {
                return true;
            }
        }
        
        return false;
    }  */ 

    //input 5 names on the list, then remove one man
    public static void main(String[] args)
    {
        List<String> names = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        
        String name = "";
        while (names.size() < 5 ){
            System.out.println("Enter a name: ");
            name = scan.nextLine();
            names.add(name);
        }
        System.out.println("Original Name List");
        for (String n : names){
            System.out.println("Name: " + n);
        }

        System.out.println("Enter name to remove: ");
        String removedName = scan.nextLine();
            
        names.remove(NameRemove(names, removedName));
        for (String n : names){
            System.out.println("Name: " + n);
        }
        
    }

    private static String NameRemove(List<String> nameList, String removeName){
        for(String n : nameList){
            if(n.equals(removeName)){
                return removeName;
            }
        }
        return null;
    }
}