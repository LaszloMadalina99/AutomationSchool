//2. Input four numbers from the keyboard, and display the maximum of them.
import java.util.Scanner;
public class MaxNumber {
    public static void main(String[] args){
        int[] numbers = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 4 numbers: ");
        int maxNumber = numbers[0];
        for(int i = 0; i<numbers.length; i++){
            int addNumbers = scanner.nextInt();
            numbers[i] = addNumbers;
            if(numbers[i]>maxNumber){
                maxNumber = numbers[i];
            }
        }
        System.out.println("Max number is: " + maxNumber);
        scanner.close();

    }
}