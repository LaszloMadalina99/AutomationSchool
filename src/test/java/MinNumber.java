//1. Enter two numbers from the keyboard and display the minimum of them.
import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.println("Insert first number: ");

        int firstNumber = numbers.nextInt();

        System.out.println("Insert second number: ");
        int secondNumber = numbers.nextInt();

        if(firstNumber>secondNumber){
            System.out.println("The minimum number is: " + secondNumber);
        }
        else{
            System.out.println("The minimum number is: " + firstNumber);
        }
    }
}
