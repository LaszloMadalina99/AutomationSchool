import java.util.Scanner;

public class VariableManipulator {
    public static void main(String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.println("Insert first numbers:");

        int a_old = numbers.nextInt();

        System.out.println("Insert second number:");

        int b_old = numbers.nextInt();
        System.out.println("Insert third number:");

        int c_old = numbers.nextInt();

        numbers.close();

        int a = a_old + b_old;
        int b = c_old - a_old;
        int c = a_old + b_old + c_old;

        System.out.println("Number before and after change: "+ a_old + " is now: " + a + " b was" + b_old + " is now: " +
                b + " c was:" + c_old + "is now" + c );



    }
}
