package introduction;
import java.util.Scanner;

public class Atv2InputData {
    public static void main(String[] args) {
        System.out.println("Provide your name:");

        String word;
        
        try (Scanner input = new Scanner(System.in)) {
            word = input.nextLine();
        }
        System.out.println("Welcome, " + word + "!");
    }
}