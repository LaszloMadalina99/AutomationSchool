import com.welcome.*;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        Hello helloInstance = new Hello();
        System.out.println("Hello, world!");

        // Set up the person's name using user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        helloInstance.setupName(name);

        // Output "Hello, world!"
        System.out.println("Hello, world!");

        // Output the personalized greeting
        helloInstance.welcome();

        // Say goodbye
        helloInstance.byeBay();

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
