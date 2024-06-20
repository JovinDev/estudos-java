
package introduction;
import java.util.Scanner;

public class Atv4ConditionalStructure {
    public static void main (String[] args){
        // Create a Scanner object to read user input
        try ( Scanner scanner = new Scanner(System.in)) {

            // Prompt the user to enter a number
            System.out.print("Enter a number");
            int number = scanner.nextInt();
            
            // Conditional structure if-else to check if the number is positive, negative, or zero
            if (number > 0) {
                System.out.println("This number is positive");}
            else if (number < 0) {
                System.out.println("This number is negative");}
            else {
                System.out.println("This number is zero");
            }
        }


    }
}
