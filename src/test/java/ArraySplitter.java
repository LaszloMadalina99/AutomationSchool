import java.util.Arrays;
import java.util.Scanner;

public class ArraySplitter {

    public static void main(String[] args){
        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];
        Scanner inputArray = new Scanner(System.in);
        System.out.println("Insert 20 numbers: ");
        for(int i = 0; i<bigArray.length; i++){
            int myArray = inputArray.nextInt();
            bigArray[i] = myArray;
        }

        for(int number = 0; number<10; number++){
            smallArray1[number] = bigArray[number];
            smallArray2[number] = bigArray[number+10];
        }
        inputArray.close();
        System.out.println("Large array is:" + Arrays.toString(bigArray));
        System.out.println("Small array is: " + Arrays.toString(smallArray2));
        //display in new line
        for(int num: smallArray2){
            System.out.println(num);
        }

    }
}
