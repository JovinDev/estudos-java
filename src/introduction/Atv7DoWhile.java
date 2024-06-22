package introduction;
import java.util.Scanner;

public class Atv7DoWhile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
        int option;

        do{
             System.out.println("digit any number or 99 to exit");
             option = scanner.nextInt();

            }while (option != 99);
          } 

        }
    }
    

