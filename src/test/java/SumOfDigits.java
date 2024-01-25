import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number with two digit: ");

        int n = scanner.nextInt();

        scanner.close();

        if (n>=10 && n<=99){
            int onedigit = n / 10;
            int secondigit = n %10;
            int sumofdigits = onedigit + secondigit;

            System.out.println("Sum of digits is:" + sumofdigits);
        }
        else{
            System.out.println("Please insert a valid number");
        }
    }
}
