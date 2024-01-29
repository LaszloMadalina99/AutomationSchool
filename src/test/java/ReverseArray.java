import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbList = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 8 numbers: ");

        for (int i = 0; i < 8; i++) {
            numbList[i] = scanner.nextInt();

        }
        System.out.println("Reverse order is: ");
        scanner.close();
        for (int i = numbList.length - 1; i >= 0; i--) {
            System.out.println( numbList[i]);
        }
    }
}