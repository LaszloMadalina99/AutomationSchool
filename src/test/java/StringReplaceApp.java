
import java.util.Scanner;

public class StringReplaceApp {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first string: ");
        String firstString = scanner.nextLine();
        System.out.println("Input which part do you want to change");
        String changePart = scanner.nextLine();
        System.out.println("Input the new text: ");
        String lastString = scanner.nextLine();

        /*
         String strReplaced = firstString.replace(changePart, lastString);
        System.out.println("New String is: " +  strReplaced);
         */
        int numberLetter = firstString.indexOf(changePart);
        if(numberLetter>-1) {
            String finalString = firstString.substring(0, numberLetter);
            System.out.println("Final string is: " + finalString + lastString);
        }
        else{
            System.out.println("The words are not find");
        }
    }
}

