import java.util.Scanner;

public class MaxArray {

    public static void main(String[] args) {

        int[] maxnumb = new int[20];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 20 numbers: ");
        for (int i = 0; i < 5; i++) {
            maxnumb[i] = scanner.nextInt();

        }
        scanner.close();
        int maxnumber = max(maxnumb);
        System.out.println("The biggest number is: " + maxnumber);
    }

    public static int max(int[] a) {
        int biggestnumber = a[0];
        for (int i = 1; i < 5; i++) {
            if (a[i] > biggestnumber) {
                biggestnumber = a[i];
            }
        }
        return biggestnumber;
    }
}