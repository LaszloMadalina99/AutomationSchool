import java.util.Scanner;

public class RoundsNumber {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a real number: ");
        float number = scanner.nextFloat();
        scanner.close();
        //check if number is real number or not
        if (number - Math.floor(number) > 0){
            int roundnumber = Math.round(number);
            System.out.println("The round number for: "+ number + " is: " + roundnumber);
        }
        else{
            System.out.println("Please enter a real number");
        }

    }
}
