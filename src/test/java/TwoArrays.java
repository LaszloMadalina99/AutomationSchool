import java.util.Arrays;
import java.util.Scanner;

public class TwoArrays {
    public static void main(String[] args) {

        int[] lungimi = new int[10];
        String[] mystring = new String[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu 10 stringuri: ");

        for (int i = 0; i < 10; i++) {
            String stringul_meu = scanner.nextLine();
            mystring[i] = stringul_meu;
            lungimi[i] = stringul_meu.length();
        }

        scanner.close();

        System.out.println(Arrays.toString(mystring));
        System.out.println("Length of enter strings: "+Arrays.toString(lungimi));
    }
}