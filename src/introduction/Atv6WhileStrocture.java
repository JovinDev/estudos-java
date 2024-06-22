package introduction;
import java.util.Scanner;

public class Atv6WhileStrocture {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
        int option = 0;
        
        while (option != 99) {
            System.out.println("digit any number or 99 to exit");
            
                option = scanner.nextInt();
            }

        }
    }
    
}
