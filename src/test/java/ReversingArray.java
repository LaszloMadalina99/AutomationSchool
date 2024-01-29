import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args){
        int[] myArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 5 numbers: ");
        for(int i = 0; i<myArray.length; i++){
            int numbers = scanner.nextInt();
            myArray[i] = numbers;
        }

        scanner.close();

        for(int i = 0; i<myArray.length/2; i++){
           int temp = myArray[i];
           myArray[i] = myArray[myArray.length-1-i];
           myArray[myArray.length-1-i] = temp;
        }

        System.out.println("Reversed array is: ");
        for(int number : myArray){
            System.out.println(number);
        }
    }
}
