
import java.util.Arrays;
import java.util.Scanner;

//3. Enter three numbers from the keyboard and display them in descending order.
public class DescendOrder {
    public static void main(String[] args){
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        for(int i=0; i<numbers.length; i++){
            int inputNumbers = scanner.nextInt();
            numbers[i] = inputNumbers;
        }
        Arrays.sort(numbers);
        scanner.close();
        System.out.println("Order numbers: " + Arrays.toString(numbers));
        for(int i = 0; i<numbers.length/2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1-i] = temp;
        }
        System.out.println("Descending order: " + Arrays.toString(numbers));
    }
}
