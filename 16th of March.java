//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        // Write your code below
        System.out.print("Coddy!");
        System.out.println();
        System.out.println("Java is fun!");
        Scanner scanner = new Scanner(System.in);


        // Prompt the user to enter their name
        System.out.print("Enter your name: ");

        // Read the user's name
        String user= scanner.nextLine();

        // Print the greeting message
        System.out.print("Hello "+user);

        int age= scanner.nextInt();
        int years_left= 120-age;
        System.out.printf(years_left + "years till 120");
        }
    }
