package introduction;
import java.util.Scanner;

public class Atv5RepetitionStrocture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the value from the user 
        System.out.println("Type the limit value: ");
        int limit = scanner.nextInt();

        // Using the for loop
        System.out.println("using for");
        for (int i = 1; i <= limit; i++) {
            System.out.println(i + "");
        }

        // to skip a line
        System.out.println();

        

        scanner.close();
    }

}