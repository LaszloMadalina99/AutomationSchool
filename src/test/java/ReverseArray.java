import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numList = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 8 numbers: ");

        for (int i = 0; i < 8; i++) {
            numList[i] = scanner.nextInt();

        }
        System.out.println("Reverse order is: ");
        scanner.close();
        for (int i = numList.length - 1; i >= 0; i--) {
            System.out.println( numList[i]);
        }
    }
}